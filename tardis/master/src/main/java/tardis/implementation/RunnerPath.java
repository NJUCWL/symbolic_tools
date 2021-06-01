package tardis.implementation;

import static jbse.algo.Util.valueString;
import static jbse.bc.Opcodes.OP_INVOKEINTERFACE;
import static jbse.bc.Signatures.JAVA_STRING;
import static tardis.implementation.Util.bytecodeBranch;
import static tardis.implementation.Util.bytecodeInvoke;
import static tardis.implementation.Util.bytecodeJump;
import static tardis.implementation.Util.bytecodeLoadConstant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jbse.algo.exc.CannotManageStateException;
import jbse.apps.run.DecisionProcedureGuidance;
import jbse.apps.run.DecisionProcedureGuidanceJDI;
import jbse.apps.run.GuidanceException;
import jbse.bc.Signature;
import jbse.bc.exc.InvalidClassFileFactoryClassException;
import jbse.bc.exc.InvalidIndexException;
import jbse.common.Util;
import jbse.common.exc.ClasspathException;
import jbse.dec.DecisionProcedureAlgorithms;
import jbse.dec.DecisionProcedureAlwSat;
import jbse.dec.DecisionProcedureClassInit;
import jbse.dec.DecisionProcedureLICS;
import jbse.dec.DecisionProcedureSMTLIB2_AUFNIRA;
import jbse.dec.exc.DecisionException;
import jbse.jvm.Runner;
import jbse.jvm.RunnerBuilder;
import jbse.jvm.RunnerParameters;
import jbse.jvm.EngineParameters.StateIdentificationMode;
import jbse.jvm.Runner.Actions;
import jbse.jvm.exc.CannotBacktrackException;
import jbse.jvm.exc.CannotBuildEngineException;
import jbse.jvm.exc.EngineStuckException;
import jbse.jvm.exc.FailureException;
import jbse.jvm.exc.InitializationException;
import jbse.jvm.exc.NonexistingObservedVariablesException;
import jbse.mem.Objekt;
import jbse.mem.State;
import jbse.mem.State.Phase;
import jbse.mem.exc.ContradictionException;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.InvalidNumberOfOperandsException;
import jbse.mem.exc.InvalidProgramCounterException;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.rewr.CalculatorRewriting;
import jbse.rewr.RewriterOperationOnSimplex;
import jbse.rules.ClassInitRulesRepo;
import jbse.rules.LICSRulesRepo;
import jbse.tree.StateTree.BranchPoint;
import jbse.val.Reference;
import jbse.val.ReferenceConcrete;
import jbse.val.ReferenceSymbolic;
import jbse.val.Value;
import tardis.Options;

public class RunnerPath {
    private static final String SWITCH_CHAR = System.getProperty("os.name").toLowerCase().contains("windows") ? "/" : "-";

    private final String[] classpath;
    private final String z3Path;
    private final String targetMethodClassName;
    private final String targetMethodDescriptor;
    private final String targetMethodName;
    private final TestCase testCase;
    private final RunnerParameters commonParamsGuided;
    private final RunnerParameters commonParamsGuiding;

    public RunnerPath(Options o, EvosuiteResult item) {
        final ArrayList<String> _classpath = new ArrayList<>();
        _classpath.add(o.getJBSELibraryPath().toString());
        _classpath.add(o.getEvosuitePath().toString());
        _classpath.add(o.getTmpBinTestsDirectoryPath().toString());
        _classpath.addAll(o.getClassesPath().stream().map(Object::toString).collect(Collectors.toList()));
        this.classpath = _classpath.toArray(new String[0]);
        this.z3Path = o.getZ3Path().toString();
        this.targetMethodClassName = item.getTargetMethodClassName();
        this.targetMethodDescriptor = item.getTargetMethodDescriptor();
        this.targetMethodName = item.getTargetMethodName();
        this.testCase = item.getTestCase();

        //builds the template parameters object for the guided (symbolic) execution
        this.commonParamsGuided = new RunnerParameters();
        this.commonParamsGuided.setMethodSignature(item.getTargetMethodClassName(), item.getTargetMethodDescriptor(), item.getTargetMethodName());
        this.commonParamsGuided.addUserClasspath(this.classpath);
        if (o.getHeapScope() != null) {
            for (Map.Entry<String, Integer> e : o.getHeapScope().entrySet()) {
                this.commonParamsGuided.setHeapScope(e.getKey(), e.getValue());
            }
        }
        if (o.getCountScope() > 0) {
            this.commonParamsGuided.setCountScope(o.getCountScope());
        }
        for (List<String> unint : o.getUninterpreted()) {
            this.commonParamsGuided.addUninterpreted(unint.get(0), unint.get(1), unint.get(2));
        }

        //builds the template parameters object for the guiding (concrete) execution
        this.commonParamsGuiding = new RunnerParameters();
        this.commonParamsGuiding.addUserClasspath(this.classpath);
        this.commonParamsGuiding.setStateIdentificationMode(StateIdentificationMode.COMPACT);
    }

    private static class ActionsRunner extends Actions {
        private final int testDepth;
        private final DecisionProcedureGuidance guid;
        private final ArrayList<State> stateList = new ArrayList<State>();
        private boolean atJump = false;
        private int jumpPC = 0;
        private boolean atLoadConstant = false;
        private int loadConstantStackSize = 0;
        private boolean savePreState = false;
        private State preState = null;
        private final HashMap<Long, String> stringLiterals = new HashMap<>();
        private final HashSet<String> coverage = new HashSet<>();

        public ActionsRunner(int testDepth, DecisionProcedureGuidance guid) {
            this.testDepth = testDepth;
            this.guid = guid;
        }

        @Override
        public boolean atInitial() {
            if (this.testDepth == 0) {
                this.guid.endGuidance();
                this.savePreState = true;
            }
            return super.atInitial();
        }

        @Override
        public boolean atStepPre() {
            final State currentState = getEngine().getCurrentState();
            if (currentState.phase() != Phase.PRE_INITIAL) {
                try {
                    final byte currentInstruction = currentState.getInstruction(); 
                    
                    //if at a jump bytecode, saves the start program counter
                    this.atJump = bytecodeJump(currentInstruction);
                    if (this.atJump) {
                        this.jumpPC = currentState.getPC();
                    }

                    //if at a load constant bytecode, saves the stack size
                    this.atLoadConstant = bytecodeLoadConstant(currentInstruction);
                    if (this.atLoadConstant) {
                        this.loadConstantStackSize = currentState.getStackSize();
                    }

                    //if at a branching bytecode, possibly saves the pre-state
                    if (bytecodeBranch(currentInstruction) && this.savePreState) {
                        this.preState = currentState.clone();
                    }
                } catch (ThreadStackEmptyException | FrozenStateException e) {
                    //this should never happen
                    throw new RuntimeException(e); //TODO better exception!
                }
            }
            return super.atStepPre();
        }

        @Override
        public boolean atStepPost() {
            final State currentState = getEngine().getCurrentState();

            //steps guidance
            try {
                this.guid.step(currentState);
            } catch (GuidanceException e) {
                throw new RuntimeException(e); //TODO better exception!
            }

            //manages jump
            if (currentState.phase() != Phase.PRE_INITIAL && this.atJump) {
                try {
                    this.coverage.add(currentState.getCurrentMethodSignature().toString() + ":" + this.jumpPC + ":" + currentState.getPC());
                } catch (ThreadStackEmptyException | FrozenStateException e) {
                    //this should never happen
                    throw new RuntimeException(e); //TODO better exception!
                }
            }

            //manages constant loading
            if (currentState.phase() != Phase.PRE_INITIAL && this.atLoadConstant) {
                try {
                    if (this.loadConstantStackSize == currentState.getStackSize()) {
                        final Value operand = currentState.getCurrentFrame().operands(1)[0];
                        if (operand instanceof Reference) {
                            final Reference r = (Reference) operand;
                            final Objekt o = currentState.getObject(r);
                            if (o != null && JAVA_STRING.equals(o.getType().getClassName())) {
                                final String s = valueString(currentState, r);
                                final long heapPosition = (r instanceof ReferenceConcrete ? ((ReferenceConcrete) r).getHeapPosition() : currentState.getResolution((ReferenceSymbolic) r));
                                this.stringLiterals.put(heapPosition, s);
                            }
                        }					
                    }
                } catch (FrozenStateException | InvalidNumberOfOperandsException | ThreadStackEmptyException e) {
                    throw new RuntimeException(e); //TODO better exception!
                }
            }

            if (currentState.getDepth() == this.testDepth) {
                this.guid.endGuidance();
                this.savePreState = true;
            } else if (currentState.getDepth() == this.testDepth + 1) {
                //we are at the post-frontier state: here preState
                //contains the pre-frontier state
                this.stateList.add(currentState.clone());
                getEngine().stopCurrentTrace();
                this.savePreState = false;
            }
            
            //DEBUG
            /*try {
                if (currentState.phase() != Phase.PRE_INITIAL && !currentState.isStuck())
                    System.out.println(currentState.getIdentifier() + "[" + currentState.getSequenceNumber() + "] " + currentState.getCurrentMethodSignature() + ":" + currentState.getPC());
            } catch (FrozenStateException | ThreadStackEmptyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }*/
            
            return super.atStepPost();
        }

        @Override
        public boolean atBacktrackPost(BranchPoint bp) {
            final State currentState = getEngine().getCurrentState();
            this.stateList.add(currentState.clone());
            getEngine().stopCurrentTrace();
            if (this.atJump) {
                try {
                    this.coverage.add(currentState.getCurrentMethodSignature().toString() + ":" + this.jumpPC + ":" + currentState.getPC());
                } catch (ThreadStackEmptyException | FrozenStateException e) {
                    //this should never happen
                    throw new RuntimeException(e); //TODO better exception!
                }
            }

            return super.atBacktrackPost(bp);
        }

        @Override
        public boolean atTraceEnd() {
            if (this.testDepth < 0) {
                final State finalState = this.getEngine().getCurrentState();
                this.stateList.add(finalState);
                return true;
            } else {
                return super.atTraceEnd();
            }
        }

        @Override
        public void atEnd() {
            if (this.testDepth < 0) {
                final State finalState = this.getEngine().getCurrentState();
                this.stateList.add(finalState);
            }
            super.atEnd();
        }
    }

    //replicas of info stored in ActionsRunner

    private State initialState = null;
    private State preState = null;
    private boolean atJump = false;
    private HashMap<Long, String> stringLiterals = null;
    private HashSet<String> coverage = null;

    /**
     * Performs symbolic execution of the target method guided by a test case,
     * and returns the final state. Equivalent to {@link #runProgram(int) runProgram}{@code (-1).}
     * {@link List#get(int) get}{@code (0)}.
     * 
     * @param testCase a {@link TestCase}, it will guide symbolic execution.
     * @return the final {@link State}.
     * @throws DecisionException
     * @throws CannotBuildEngineException
     * @throws InitializationException
     * @throws InvalidClassFileFactoryClassException
     * @throws NonexistingObservedVariablesException
     * @throws ClasspathException
     * @throws CannotBacktrackException
     * @throws CannotManageStateException
     * @throws ThreadStackEmptyException
     * @throws ContradictionException
     * @throws EngineStuckException
     * @throws FailureException
     */
    public State runProgram()
    throws DecisionException, CannotBuildEngineException, InitializationException, 
    InvalidClassFileFactoryClassException, NonexistingObservedVariablesException, 
    ClasspathException, CannotBacktrackException, CannotManageStateException, 
    ThreadStackEmptyException, ContradictionException, EngineStuckException, 
    FailureException {
        return runProgram(-1).get(0); //depth -1 == never stop guidance
    }

    /**
     * Performs symbolic execution of the target method guided by a test case 
     * up to some depth, then peeks the states on the next branch.  
     * 
     * @param testCase a {@link TestCase}, it will guide symbolic execution.
     * @param testDepth the maximum depth up to which {@code t} guides 
     *        symbolic execution, or a negative value.
     * @return a {@link List}{@code <}{@link State}{@code >} containing
     *         all the states on branch at depth {@code stateDepth + 1}. 
     *         In case {@code stateDepth < 0} executes the test up to the 
     *         final state and returns a list containing only the final state.
     * @throws DecisionException
     * @throws CannotBuildEngineException
     * @throws InitializationException
     * @throws InvalidClassFileFactoryClassException
     * @throws NonexistingObservedVariablesException
     * @throws ClasspathException
     * @throws CannotBacktrackException
     * @throws CannotManageStateException
     * @throws ThreadStackEmptyException
     * @throws ContradictionException
     * @throws EngineStuckException
     * @throws FailureException
     */
    public List<State> runProgram(int testDepth)
    throws DecisionException, CannotBuildEngineException, InitializationException, 
    InvalidClassFileFactoryClassException, NonexistingObservedVariablesException, 
    ClasspathException, CannotBacktrackException, CannotManageStateException, 
    ThreadStackEmptyException, ContradictionException, EngineStuckException, 
    FailureException {

        //builds the parameters
        final RunnerParameters pGuided = this.commonParamsGuided.clone();
        final RunnerParameters pGuiding = this.commonParamsGuiding.clone();

        //sets the calculator
        final CalculatorRewriting calc = new CalculatorRewriting();
        calc.addRewriter(new RewriterOperationOnSimplex());
        pGuided.setCalculator(calc);
        pGuiding.setCalculator(calc);

        //sets the decision procedures
        final ArrayList<String> z3CommandLine = new ArrayList<>();
        z3CommandLine.add(this.z3Path);
        z3CommandLine.add(SWITCH_CHAR + "smt2");
        z3CommandLine.add(SWITCH_CHAR + "in");
        z3CommandLine.add(SWITCH_CHAR + "t:10");
        final ClassInitRulesRepo initRules = new ClassInitRulesRepo();
        initRules.addNotInitializedClassPattern(".*"); //HACK
        pGuided.setDecisionProcedure(new DecisionProcedureAlgorithms(
                                       new DecisionProcedureClassInit( //useless?
                                         new DecisionProcedureLICS( //useless?
                                           new DecisionProcedureSMTLIB2_AUFNIRA(
                                             new DecisionProcedureAlwSat(), calc, z3CommandLine), 
                                           calc, new LICSRulesRepo()), 
                                         calc, initRules), 
                                       calc));
        pGuiding.setDecisionProcedure(new DecisionProcedureAlgorithms(
                                        new DecisionProcedureClassInit(
                                          new DecisionProcedureAlwSat(), calc, initRules), 
                                        calc)); //for concrete execution

        //sets the guiding method (to be executed concretely)
        pGuiding.setMethodSignature(this.testCase.getClassName(), this.testCase.getMethodDescriptor(), this.testCase.getMethodName());

        //JDI guidance cannot bypass standard loading,
        //but the guided decision procedure can (unfortunately
        //this introduces misalignments between the two)
        pGuided.setBypassStandardLoading(true);

        //determines the number of hits (best effort)
        final int numberOfHits = countNumberOfInvocations(pGuiding.clone(), this.targetMethodClassName, this.targetMethodDescriptor, this.targetMethodName);
        //TODO if (numberOfHits == 0) raise error

        //creates the guidance decision procedure and sets it
        final DecisionProcedureGuidanceJDI guid = new DecisionProcedureGuidanceJDI(pGuided.getDecisionProcedure(),
                                                                                   pGuided.getCalculator(), pGuiding, pGuided.getMethodSignature(), numberOfHits);
        pGuided.setDecisionProcedure(guid);

        //sets the actions
        final ActionsRunner actions = new ActionsRunner(testDepth, guid);
        pGuided.setActions(actions);

        //builds the runner and runs it
        final RunnerBuilder rb = new RunnerBuilder();
        final Runner r = rb.build(pGuided);
        r.run();

        //outputs
        this.initialState = rb.getEngine().getInitialState();
        this.preState = actions.preState;
        this.atJump = actions.atJump;
        this.stringLiterals = actions.stringLiterals;
        this.coverage = actions.coverage;

        //finalizes
        rb.getEngine().close();

        return actions.stateList;
    }

    private static class ActionsCounter extends Actions {
        private final String methodClassName, methodDescriptor, methodName;
        private int methodCallCounter = 0;
        private boolean atInvocation = false;
        private int preInvocationStackSize = 0;

        public ActionsCounter(String methodClassName, String methodDescriptor, String methodName) {
            this.methodClassName = methodClassName;
            this.methodDescriptor = methodDescriptor;
            this.methodName = methodName;
        }

        @Override
        public boolean atStepPre() {
            try {
                final State currentState = getEngine().getCurrentState();
                if (currentState.phase() == Phase.POST_INITIAL && bytecodeInvoke(currentState.getInstruction())) {
                    final int UW = Util.byteCat(currentState.getInstruction(1), currentState.getInstruction(2));
                    final Signature sig;
                    if (currentState.getInstruction() == OP_INVOKEINTERFACE) {
                        sig = currentState.getCurrentClass().getInterfaceMethodSignature(UW);
                    } else {
                        sig = currentState.getCurrentClass().getMethodSignature(UW);
                    }
                    this.atInvocation = (this.methodClassName.equals(sig.getClassName()) && this.methodDescriptor.equals(sig.getDescriptor()) && this.methodName.equals(sig.getName()));
                    this.preInvocationStackSize = currentState.getStackSize();
                    //note that being at at invocation does not mean that the method
                    //will be invoked: it could be possible that a class is initialized
                    //before the execution of the bytecode, that is abandoned and then 
                    //reexecuted later when returning from the <clinit>. For this reason
                    //we register that we are at an invocation, and then after the step
                    //we check whether we actually are in the invoked method frame.
                } else {
                    this.atInvocation = false;
                }
            } catch (FrozenStateException | InvalidIndexException | ThreadStackEmptyException | InvalidProgramCounterException e) {
                //this should never happen
                throw new AssertionError(e);
            }
            return super.atStepPre();
        }
        
        @Override
        public boolean atStepPost() {
            try {
                if (this.atInvocation) {
                    final State currentState = getEngine().getCurrentState();
                    final Signature sig = currentState.getCurrentMethodSignature();
                    if (this.methodClassName.equals(sig.getClassName()) && this.methodDescriptor.equals(sig.getDescriptor()) && 
                        this.methodName.equals(sig.getName()) && currentState.getStackSize() == this.preInvocationStackSize + 1) {
                        ++this.methodCallCounter;
                    }
                }
                //DEBUG
                /*try {
                    final State currentState = getEngine().getCurrentState();
                    if (currentState.phase() != Phase.PRE_INITIAL && !currentState.isStuck())
                        System.out.println(currentState.getIdentifier() + "[" + currentState.getSequenceNumber() + "] " + currentState.getCurrentMethodSignature() + ":" + currentState.getPC());
                } catch (FrozenStateException | ThreadStackEmptyException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
            } catch (FrozenStateException | ThreadStackEmptyException e) {
                //this should never happen
                throw new AssertionError(e);
            }
            return super.atStepPost();
        }
    }

    private int countNumberOfInvocations(RunnerParameters params, String methodClassName, String methodDescriptor, String methodName) 
    throws CannotBuildEngineException, DecisionException, InitializationException, InvalidClassFileFactoryClassException, 
    NonexistingObservedVariablesException, ClasspathException, ContradictionException, CannotBacktrackException, 
    CannotManageStateException, ThreadStackEmptyException, EngineStuckException, FailureException {
        final ActionsCounter actions = new ActionsCounter(methodClassName, methodDescriptor, methodName);
        params.setActions(actions);
        final RunnerBuilder rb = new RunnerBuilder();
        final Runner r = rb.build(params);
        r.run();
        return actions.methodCallCounter;
    }

    /**
     * Must be invoked after an invocation of {@link #runProgram(TestCase, int) runProgram(tc, depth)}.
     * Returns the initial state of symbolic execution.
     * 
     * @return a {@link State} or {@code null} if this method is invoked
     *         before an invocation of {@link #runProgram(TestCase, int)}.
     */
    public State getInitialState() {
        return this.initialState;
    }

    /**
     * Must be invoked after an invocation of {@link #runProgram(TestCase, int) runProgram(tc, depth)}.
     * Returns the state of symbolic execution at depth {@code depth}.
     * 
     * @return a {@link State} or {@code null} if this method is invoked
     *         before an invocation of {@link #runProgram(TestCase, int)}.
     */
    public State getPreState() {
        return this.preState;
    }

    /**
     * Must be invoked after an invocation of {@link #runProgram(TestCase, int) runProgram(tc, depth)}.
     * Returns whether the frontier is at a jump bytecode.
     * 
     * @return a {@code boolean}. If this method is invoked
     *         before an invocation of {@link #runProgram(TestCase, int)}
     *         always returns {@code false}.
     */
    public boolean getAtJump() {
        return this.atJump;
    }

    /**
     * Must be invoked after an invocation of {@link #runProgram(TestCase, int) runProgram(tc, depth)}.
     * Returns the string literals of the execution.
     * 
     * @return a {@link Map}{@code <}{@link Long}{@code , }{@link String}{@code >}, 
     *         mapping a heap position of a {@link String} literal to the
     *         corresponding value of the literal. 
     *         If this method is invoked
     *         before an invocation of {@link #runProgram(TestCase, int)}
     *         always returns {@code null}.
     */
    public Map<Long, String> getStringLiterals() {
        return this.stringLiterals;
    }

    /**
     * Must be invoked after an invocation of {@link #runProgram(TestCase, int) runProgram(tc, depth)}.
     * Returns the code branches covered by the execution.
     * 
     * @return a {@link HashSet}{@code <}{@link String}{@code >} where each {@link String} has the form
     *         className:methodDescriptor:methodName:bytecodeFrom:bytecodeTo, or {@code null} if this method is invoked
     *         before an invocation of {@link #runProgram(TestCase, int)}.
     */
    public HashSet<String> getCoverage() {
        return this.coverage;
    }
}
