package jbse.algo;

import static java.lang.System.arraycopy;
import static jbse.algo.Util.continueWithBaseLevelImpl;
import static jbse.algo.Util.ensureClassInitialized;
import static jbse.algo.Util.exitFromAlgorithm;
import static jbse.algo.Util.failExecution;
import static jbse.algo.Util.findClassFile;
import static jbse.algo.Util.throwNew;
import static jbse.algo.Util.throwVerifyError;
import static jbse.algo.Util.valueString;
import static jbse.bc.Offsets.offsetInvoke;
import static jbse.bc.Signatures.ILLEGAL_ACCESS_ERROR;
import static jbse.bc.Signatures.INCOMPATIBLE_CLASS_CHANGE_ERROR;
import static jbse.bc.Signatures.JAVA_STRING;
import static jbse.bc.Signatures.NO_CLASS_DEFINITION_FOUND_ERROR;
import static jbse.bc.Signatures.OUT_OF_MEMORY_ERROR;
import static jbse.bc.Signatures.UNSUPPORTED_CLASS_VERSION_ERROR;
import static jbse.common.Type.INT;
import static jbse.common.Type.binaryClassName;
import static jbse.common.Type.className;
import static jbse.common.Type.isPrimitive;
import static jbse.common.Type.isPrimitiveOpStack;
import static jbse.common.Type.isVoid;
import static jbse.common.Type.parametersNumber;
import static jbse.common.Type.splitParametersDescriptors;
import static jbse.common.Type.splitReturnValueDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;

import jbse.algo.exc.CannotAccessImplementationReflectively;
import jbse.algo.exc.CannotInvokeNativeException;
import jbse.algo.exc.SymbolicValueNotAllowedException;
import jbse.bc.ClassFile;
import jbse.bc.exc.BadClassFileVersionException;
import jbse.bc.exc.ClassFileIllFormedException;
import jbse.bc.exc.ClassFileNotAccessibleException;
import jbse.bc.exc.ClassFileNotFoundException;
import jbse.bc.exc.IncompatibleClassFileException;
import jbse.bc.exc.WrongClassNameException;
import jbse.common.Type;
import jbse.common.exc.ClasspathException;
import jbse.common.exc.InvalidInputException;
import jbse.common.exc.UnexpectedInternalException;
import jbse.dec.DecisionProcedureAlgorithms.Outcome;
import jbse.dec.exc.DecisionException;
import jbse.mem.Array;
import jbse.mem.State;
import jbse.mem.State.Phase;
import jbse.mem.exc.CannotAssumeSymbolicObjectException;
import jbse.mem.exc.ContradictionException;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.HeapMemoryExhaustedException;
import jbse.tree.DecisionAlternative_XLOAD_GETX;
import jbse.tree.DecisionAlternative_XLOAD_GETX_Aliases;
import jbse.tree.DecisionAlternative_XLOAD_GETX_Expands;
import jbse.tree.DecisionAlternative_XLOAD_GETX_Null;
import jbse.tree.DecisionAlternative_XLOAD_GETX_Resolved;
import jbse.tree.DecisionAlternative_XYLOAD_GETX_Expands;
import jbse.tree.DecisionAlternative_XYLOAD_GETX_Null;
import jbse.val.Null;
import jbse.val.Primitive;
import jbse.val.Reference;
import jbse.val.ReferenceSymbolic;
import jbse.val.ReferenceSymbolicApply;
import jbse.val.Simplex;
import jbse.val.Value;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidTypeException;

/**
 * {@link Algo_INVOKEMETA} implementing the effect of 
 * a method call by performing a metacircular method call or pushing
 * a function application term. More precisely:
 * <ul>
 * <li>If the method's parameters are all constant (i.e., either {@link Simplex} 
 *     or constant {@link String}s), then reflection is used is used to metacircularly 
 *     invoke the native method on the reified parameters, and the corresponding 
 *     return value (if any) is reflected back and pushed on the operand stack;</li>
 * <li>Otherwise, the invoked method is assumed to be pure, and:
 * <ul>
 * <li>If the method's return type is {@code void}, nothing is done (this behavior 
 *     is congruent with the purity hypothesis, where the only effect of a pure method 
 *     invocation is returning something);</li>
 * <li>Otherwise, a fresh {@link PrimitiveSymbolicApply} or a {@link ReferenceSymbolicApply} 
 *     is pushed on top of the operand stack, whose function symbol is the 
 *     method's signature, whose parameters are the method invocation's parameters, 
 *     and whose history point is the current state's history point.</li>
 * </ul>
 * This algorithm is branching since, when a fresh {@link ReferenceSymbolicApply} is pushed
 * on top of the operand stack, this is also resolved.
 * </ul>
 * 
 * @author Pietro Braione
 */
//TODO merge with Algo_INVOKEX_Abstract and subclasses and with Algo_XYLOAD_GETX and subclasses
public class Algo_INVOKEMETA_Metacircular extends Algo_INVOKEMETA<
DecisionAlternative_XLOAD_GETX,
StrategyDecide<DecisionAlternative_XLOAD_GETX>,
StrategyRefine<DecisionAlternative_XLOAD_GETX>,
StrategyUpdate<DecisionAlternative_XLOAD_GETX>> {
    private boolean isVoid; //set by cookMore
    private Value valToLoad; //set by cookMore
    private boolean someRefNotExpanded; //set by decider
    private String nonExpandedRefTypes; //set by decider
    private String nonExpandedRefOrigins; //set by decider

    @Override
    protected final Supplier<Integer> numOperands() {
        return () -> {
            return parametersNumber(this.data.signature().getDescriptor(), this.isStatic);
        };
    }

    @Override
    protected BytecodeCooker bytecodeCooker() {
        return (state) -> {
        	if (state.phase() == Phase.PRE_INITIAL && !this.isOverriddenMethodNative) {
        		continueWithBaseLevelImpl(state, this.isInterface, this.isSpecial, this.isStatic);
        	}            
        	
            //checks whether the parameters are all constant
        	final Value[] args = this.data.operands();
            boolean allConstant = true;
            for (int i = 0; i < args.length; ++i) {
                if ((args[i] instanceof Primitive) && !(args[i] instanceof Simplex)) {
                    allConstant = false;
                    break;
                }
                if (args[i] instanceof Reference) {
                    if (valueString(state, (Reference) args[i]) == null) {
                        allConstant = false;
                        break;
                    }
                }
            }

            //determines the return value or whether it must perform
            //a metacircular method invocation
            final String returnType = splitReturnValueDescriptor(this.data.signature().getDescriptor());
            this.isVoid = isVoid(returnType);
            if (allConstant && (this.isVoid || isPrimitive(returnType) || JAVA_STRING.equals(className(returnType)))) {
                //delegates to metacircular invocation
                try {
                    this.valToLoad = invokeMetacircularly(state, this.data.operands());
                } catch (HeapMemoryExhaustedException e) {
                    throwNew(state, OUT_OF_MEMORY_ERROR);
                    exitFromAlgorithm();
                }
            } else if (this.isVoid) {
                //does nothing 
            } else {
                //builds a term
                try {
                    if (isPrimitive(returnType)) {
                        this.valToLoad = state.getCalculator().applyFunctionPrimitive(returnType.charAt(0), state.getHistoryPoint(), this.data.signature().toString(), args);
                    } else {
                        this.valToLoad = new ReferenceSymbolicApply(returnType, state.getHistoryPoint(), this.data.signature().toString(), args);
                    }
                } catch (InvalidOperandException | InvalidTypeException | InvalidInputException e) {
                    //this should never happen
                    failExecution(e);
                }
            }
        };
    }

    private Value invokeMetacircularly(State state, Value[] args) 
    throws CannotInvokeNativeException, FrozenStateException, HeapMemoryExhaustedException {
        try {
            //reflects the arguments
            final String[] argsType = splitParametersDescriptors(this.data.signature().getDescriptor());
            final Object[] argsRefl = new Object[args.length];
            final Class<?> methodClass = Class.forName(binaryClassName(this.data.signature().getClassName()));
            final Class<?>[] argsClass = new Class[args.length];
            for (int i = 0; i < args.length; ++i) {
                if (args[i] instanceof Simplex) {
                    argsRefl[i] = ((Simplex) args[i]).getActualValue();
                } else {
                    //it must be a reference to a constant String
                    argsRefl[i] = valueString(state, (Reference) args[i]);
                    if (argsRefl[i] == null) {
                        failExecution("Unexpected argument in metacircular invocation: " + args[i] + ".");
                    }
                }
                if (!this.isStatic && i == 0) {
                	argsClass[i] = methodClass;
                } else {
                	argsClass[i] = getJavaClass(argsType[i]);
                }
            }
            
            //prepares the method and the args for the metacircular method invocation
            final Method m = methodClass.getDeclaredMethod(this.data.signature().getName(), argsClass);
            m.setAccessible(true);
            final Object argThis;
            final Object[] argsOther;
            if (this.isStatic) {
                argThis = null;
                argsOther = argsRefl;
            } else {
                //this block works only if the "this" argument is a constant string
                argThis = argsRefl[0]; 
                argsOther = new Object[argsRefl.length - 1];
                arraycopy(argsRefl, 1, argsOther, 0, argsOther.length);
            }

            //invokes the method
            final Object retValRefl = m.invoke(argThis, argsOther);

            //reifies the return value
            final String returnType = splitReturnValueDescriptor(this.data.signature().getDescriptor());
            if (this.isVoid) {
                return null;
            } else {
                return toValue(state, retValRefl, returnType);
            }
        } catch (ClassNotFoundException | SecurityException | 
                 NoSuchMethodException | IllegalArgumentException | 
                 IllegalAccessException | InvocationTargetException e) {
            throw new CannotAccessImplementationReflectively(e);
        }
    }

    private static Class<?> getJavaClass(String type) throws ClassNotFoundException {
        if (type.equals("" + Type.BYTE)) {
            return byte.class;
        } else if (type.equals("" + Type.SHORT)) {
            return short.class;
        } else if (type.equals("" + Type.INT)) {
            return int.class;
        } else if (type.equals("" + Type.LONG)) {
            return long.class;
        } else if (type.equals("" + Type.FLOAT)) {
            return float.class;
        } else if (type.equals("" + Type.DOUBLE)) {
            return double.class;
        } else if (type.equals("" + Type.CHAR)) {
            return char.class;
        } else if (type.equals("" + Type.BOOLEAN)) {
            return boolean.class;
        } else {
            return Class.forName(binaryClassName(className(type)));
        }
    }

    private static Value toValue(State state, Object retValRefl, String type) 
    throws FrozenStateException, HeapMemoryExhaustedException {
        if (isPrimitive(type)) {
            return state.getCalculator().val_(retValRefl);
        } else if (JAVA_STRING.equals(className(type))) {
            if (retValRefl == null) {
                return Null.getInstance();
            } else {
                try {
                    final String retValString = (String) retValRefl;
                    state.ensureStringLiteral(retValString);
                    return state.referenceToStringLiteral(retValString);
                } catch (ClassCastException e) {
                    failExecution("Expected a value of type String from a metacircular call, returned " + retValRefl + ".");
                }
            }
        } else {
            //TODO more reification of objects?
            failExecution("Reached unreachable point: tried to reflect a value with type " + type + " returned from a metacircular call.");
        }
        return null; //to keep the compiler happy, but really it is unreachable
    }

    @Override
    protected Class<DecisionAlternative_XLOAD_GETX> classDecisionAlternative() {
        return DecisionAlternative_XLOAD_GETX.class;
    }

    @Override
    protected StrategyDecide<DecisionAlternative_XLOAD_GETX> decider() {
        return (state, result) -> {
            Outcome o = null; //to keep the compiler happy
            if (this.valToLoad == null) {
                result.add(new DecisionAlternative_XLOAD_GETX_Resolved(null));
                this.someRefNotExpanded = false;
                o = Outcome.FFF;
            } else {
                try {
                    o = this.ctx.decisionProcedure.resolve_XLOAD_GETX(state, this.valToLoad, result);
                    //TODO the next catch blocks should disappear, see comments on removing exceptions in jbse.dec.DecisionProcedureAlgorithms.doResolveReference
                } catch (ClassFileNotFoundException e) {
                    //TODO this exception should wrap a ClassNotFoundException
                    throwNew(state, NO_CLASS_DEFINITION_FOUND_ERROR);
                    exitFromAlgorithm();
                } catch (BadClassFileVersionException e) {
                    throwNew(state, UNSUPPORTED_CLASS_VERSION_ERROR);
                    exitFromAlgorithm();
                } catch (WrongClassNameException e) {
                    throwNew(state, NO_CLASS_DEFINITION_FOUND_ERROR); //without wrapping a ClassNotFoundException
                    exitFromAlgorithm();
                } catch (IncompatibleClassFileException e) {
                    throwNew(state, INCOMPATIBLE_CLASS_CHANGE_ERROR);
                    exitFromAlgorithm();
                } catch (ClassFileNotAccessibleException e) {
                    throwNew(state, ILLEGAL_ACCESS_ERROR);
                    exitFromAlgorithm();
                } catch (ClassFileIllFormedException e) {
                    throwVerifyError(state);
                    exitFromAlgorithm();
                }
                this.someRefNotExpanded = o.noReferenceExpansion();
                if (this.someRefNotExpanded) {
                    try {
                        final ReferenceSymbolic refToLoad = (ReferenceSymbolic) this.valToLoad;
                        this.nonExpandedRefTypes = refToLoad.getStaticType();
                        this.nonExpandedRefOrigins = refToLoad.asOriginString();
                    } catch (ClassCastException e) {
                        failExecution(e);
                    }
                }
            }
            return o;
        };
    }

    protected final void refineRefExpands(State state, DecisionAlternative_XYLOAD_GETX_Expands drc) 
    throws ContradictionException, InvalidTypeException, InvalidInputException, InterruptException, 
    SymbolicValueNotAllowedException, ClasspathException, FrozenStateException {
        final ReferenceSymbolic referenceToExpand = drc.getValueToLoad();
        final String classNameOfReferenceToExpand = className(referenceToExpand.getStaticType());
        final ClassFile classFileOfReferenceToExpand = findClassFile(state, classNameOfReferenceToExpand);                        
        final ClassFile classFileOfTargetObject = drc.getClassFileOfTargetObject();
        try {
            ensureClassInitialized(state, classFileOfReferenceToExpand, this.ctx);
            ensureClassInitialized(state, classFileOfTargetObject, this.ctx);
            state.assumeExpands(referenceToExpand, classFileOfTargetObject);
        } catch (HeapMemoryExhaustedException e) {
            throwNew(state, OUT_OF_MEMORY_ERROR);
            exitFromAlgorithm();
        } catch (CannotAssumeSymbolicObjectException e) {
            throw new SymbolicValueNotAllowedException(e);
        } catch (DecisionException e) {
            //this should never happen, the decision was already checked
            throw new UnexpectedInternalException(e);
        }
        //in the case the expansion object is an array, we assume it 
        //to have nonnegative length
        if (classFileOfTargetObject.isArray()) {
            try {
                final Array targetObject = (Array) state.getObject(referenceToExpand);
                final Primitive lengthPositive = targetObject.getLength().ge(state.getCalculator().valInt(0));
                state.assume(this.ctx.decisionProcedure.simplify(lengthPositive));
            } catch (InvalidOperandException | DecisionException e) { //TODO propagate these exception (...and replace DecisionException with something better)
                //this should never happen
                failExecution(e);
            }
        }
    }

    protected final void refineRefNull(State state, DecisionAlternative_XYLOAD_GETX_Null altNull)
    throws ContradictionException, InvalidInputException {
        final ReferenceSymbolic referenceToResolve = altNull.getValueToLoad();
        state.assumeNull(referenceToResolve);
    }


    @Override
    protected StrategyRefine_XLOAD_GETX refiner() {
        return new StrategyRefine_XLOAD_GETX() {
            @Override
            public void refineRefExpands(State s, DecisionAlternative_XLOAD_GETX_Expands drc)
            throws ContradictionException, InvalidTypeException, SymbolicValueNotAllowedException, 
            InterruptException, ClasspathException, InvalidInputException {
                Algo_INVOKEMETA_Metacircular.this.refineRefExpands(s, drc);
            }

            @Override
            public void refineRefAliases(State s, DecisionAlternative_XLOAD_GETX_Aliases dro)
            throws ContradictionException {
                //this should never happen
                failExecution("Unexpected aliases resolution of uninterpreted function returning a reference.");
            }

            @Override
            public void refineRefNull(State s, DecisionAlternative_XLOAD_GETX_Null drn) 
            throws ContradictionException, InvalidInputException {
                Algo_INVOKEMETA_Metacircular.this.refineRefNull(s, drn);
            }

            @Override
            public void refineResolved(State s, DecisionAlternative_XLOAD_GETX_Resolved drr) {
                //nothing to do, the value is concrete or has been already refined, or there is
                //nothing to push
            }
        };
    }

    @Override
    protected StrategyUpdate<DecisionAlternative_XLOAD_GETX> updater() {
        return (state, alt) -> { 
            final Value valFromAlt = alt.getValueToLoad();
            if (valFromAlt == null) {
                //does nothing
            } else {
                final Value valToPush;
                if (isPrimitive(valFromAlt.getType()) && !isPrimitiveOpStack(valFromAlt.getType())) {
                    valToPush = ((Primitive) valFromAlt).widen(INT);
                } else {
                    valToPush = valFromAlt;
                }
                state.pushOperand(valToPush);
            }
        };
    }

    @Override
    protected Supplier<Boolean> isProgramCounterUpdateAnOffset() {
        return () -> true;
    }

    @Override
    protected Supplier<Integer> programCounterUpdate() {
        return () -> offsetInvoke(this.isInterface);
    }

    @Override
    public final boolean someReferenceNotExpanded() { 
        return this.someRefNotExpanded; 
    }

    @Override
    public final String nonExpandedReferencesTypes() { 
        return this.nonExpandedRefTypes; 
    }

    @Override
    public final String nonExpandedReferencesOrigins() { 
        return this.nonExpandedRefOrigins; 
    }
}
