package jbse.jvm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import jbse.bc.Classpath;
import jbse.bc.Signature;
import jbse.dec.DecisionProcedureAlgorithms;
import jbse.mem.State;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.rules.TriggerRulesRepo;
import jbse.tree.StateTree;
import jbse.val.Calculator;

/**
 * Encapsulates an {@link Engine}'s parameters. The 
 * most important ones are:
 * 
 * <ul>
 * <li>A {@link DecisionProcedureAlgorithms} for pruning
 * unfeasible branches;</li>
 * <li>The initial state of the symbolic execution, or
 * alternatively:
 * <ul>
 * <li>A classpath (. by default);</li>
 * <li>The signature of the method to be symbolically executed;</li> 
 * <li>A {@link Calculator} for simplifying symbolic expressions;</li>
 * </ul>
 * </li>
 * <li>The signatures of the methods that must be treated as uninterpreted
 * functions, or for which there is a meta-level overriding implementation;</li>
 * <li>The signatures of the trigger instrumentation methods plus the 
 * reference resolution events that fire them;</li> 
 * <li>A {@link StateIdentificationMode} and a {@link BreadthMode};</li>
 * <li>A set of {@link ExecutionObserver}s plus the
 * specification of the variables they observe (none by default).</li> 
 * </ul> 
 * 
 * @author Pietro Braione
 *
 */
public final class EngineParameters implements Cloneable {
    /**
     * Enumeration of the different kinds of state identifiers.
     * 
     * @author Pietro Braione
     */
    public static enum StateIdentificationMode { 
        /** 
         * Each branch is identified by a number
         * which represents the extraction order 
         * from this tree. This identification is highly dependent
         * on the decision procedure, which may prune some branches,
         * but it is compact and exec-faithful (i.e., the  
         * lexicographic order of branch identifiers reflects the
         * visiting order of the symbolic execution).
         */
        COMPACT(StateTree.StateIdentificationMode.COMPACT), 

        /** 
         * Each branch is identified by a number
         * statically assigned according to the type of the branch. 
         * This identification is still compact but not exec-faithful, 
         * and is fragile on the number of siblings, that might
         * depend on the decision procedure and on the preconditions.
         */
        REPLICABLE(StateTree.StateIdentificationMode.REPLICABLE),

        /**
         * Each branch is identified by a complex string 
         * identifier reflecting the decision which generated it.
         * This identification may be complex and not exec-faithful, 
         * but gives an unique identifier to symbolic execution
         * traces up to target code recompilation.
         */
        LONG(StateTree.StateIdentificationMode.LONG);

        private final StateTree.StateIdentificationMode internal;

        private StateIdentificationMode(StateTree.StateIdentificationMode internal) {
            this.internal = internal;
        }

        public final StateTree.StateIdentificationMode toInternal() {
            return this.internal;
        }
    };

    /**
     * Enumeration indicating how many branches will be created.
     * 
     * @author Pietro Braione
     */
    public static enum BreadthMode {
        /**
         * Create a branch only when a decision produces
         * at least two different results. If the execution
         * is guided, it will not produce any branch. 
         * This yields the most breadth-compact tree. 
         */
        MORE_THAN_ONE(StateTree.BreadthMode.MORE_THAN_ONE),

        /**
         * Creates a branch only when a decision involving
         * symbolic values is taken, filtering out all the
         * symbolic decisions that have been resolved before
         * (just on references).
         */
        ALL_DECISIONS_NONTRIVIAL(StateTree.BreadthMode.ALL_DECISIONS_NONTRIVIAL),

        /**
         * Create a branch whenever a decision involving 
         * symbolic values is taken, independently on 
         * the number of possible outcomes.
         */
        ALL_DECISIONS_SYMBOLIC(StateTree.BreadthMode.ALL_DECISIONS_SYMBOLIC),

        /**
         * Create a branch whenever we hit a bytecode that
         * may invoke a decision procedure, independently
         * on whether all the involved values are concrete
         * or not.
         */
        ALL_DECISIONS(StateTree.BreadthMode.ALL_DECISIONS);

        private final StateTree.BreadthMode internal;

        private BreadthMode(StateTree.BreadthMode internal) {
            this.internal = internal;
        }

        public final StateTree.BreadthMode toInternal() {
            return this.internal;
        }
    }

    /** The state identification mode. */
    private StateIdentificationMode stateIdMode = StateIdentificationMode.COMPACT;

    /** The breadth mode. */
    private BreadthMode breadthMode = BreadthMode.MORE_THAN_ONE;

    /** 
     * The initial {@link State} of the symbolic execution, or
     * {@code null} iff an initial state for a method invocation 
     * must be created by the runner; by default it is {@code null}.
     */
    private State initialState = null;
    
    /** 
     * {@code true} iff the bootstrap classloader should also load the classes defined by the
     * extensions and application classloaders; overridden by 
     * {@code initialState}'s bypass state when {@code initialState != null}. 
     */
    private boolean bypassStandardLoading = true;
    
    /** 
     * The Java home, where the JRE resides; overridden by 
     * {@code initialState}'s bootstrap path when 
     * {@code initialState != null}. 
     */
    private Path javaHome = Paths.get(System.getProperty("java.home"));
    
    /** 
     * The extensions directories; overridden by {@code initialState}'s 
     * extension directories when {@code initialState != null}. 
     */
    private ArrayList<Path> extPaths = new ArrayList<>(Arrays.stream(System.getProperty("java.ext.dirs").split(File.pathSeparator))
                                                       .map(s -> Paths.get(s)).collect(Collectors.toList()));

    /**  
     * The user classpath; overridden by {@code initialState}'s classpath
     * when {@code initialState != null}.
     */
    private ArrayList<Path> userPaths = new ArrayList<>();

    /** 
     * The {@link Calculator}; overridden by {@code initialState}'s 
     * calculator when {@code initialState != null}. 
     */
    private Calculator calc = null;

    /** The decision procedure. */
    private DecisionProcedureAlgorithms decisionProcedure = null;

    /** The signatures of the variables observed by {@code this.observers}. */
    private ArrayList<Signature> observedVars = new ArrayList<>();

    /** The {@code ExecutionObserver}s. */
    private ArrayList<ExecutionObserver> observers = new ArrayList<>();

    /** The {@link TriggerRulesRepo}, containing all the trigger rules. */
    private TriggerRulesRepo repoTrigger = new TriggerRulesRepo();

    /** The expansion backdoor. */
    private HashMap<String, Set<String>> expansionBackdoor = new HashMap<>();

    /** The methods overridden at the meta-level. */
    private ArrayList<String[]> metaOverridden = new ArrayList<>();

    /** The methods to be handled as uninterpreted functions. */
    private ArrayList<String[]> uninterpreted = new ArrayList<>();

    /** The methods to be handled as uninterpreted functions (patterns). */
    private ArrayList<String[]> uninterpretedPattern = new ArrayList<>();

    /**  
     * The signature of the method to be executed; overridden by {@code initialState}'s 
     * current method when {@code initialState != null}.
     */
    private Signature methodSignature = null;
    
    /** The maximum size for an array to have simple representation. */
    private int maxSimpleArrayLength = 100_000;
    
    /** The maximum size of the heap (number of objects). */
    private long maxHeapSize = 1_000_000;
    
    /** 
     * Whether the classes that are initialized during the
     * pre-initialization phase should be made symbolic, so
     * that the lazy initialization procedure can produce aliases
     * to their members.
     */
    private boolean makePreInitClassesSymbolic = true;

    /**
     * Constructor.
     */
    public EngineParameters() { }

    /**
     * Sets the decision procedure to be used during symbolic execution.
     * 
     * @param decisionProcedure a {@link DecisionProcedureAlgorithms}.
     */
    public void setDecisionProcedure(DecisionProcedureAlgorithms decisionProcedure) {
        this.decisionProcedure = decisionProcedure;
    }

    /**
     * Gets the decision procedure.
     * 
     * @return a {@link DecisionProcedureAlgorithms}.
     */
    public DecisionProcedureAlgorithms getDecisionProcedure() {
        return this.decisionProcedure;
    }

    /**
     * Sets the state identification mode, i.e., how a state will be
     * identified.
     * 
     * @param stateIdMode a {@link StateIdentificationMode}.
     * @throws NullPointerException if {@code stateIdMode == null}.
     */
    public void setStateIdentificationMode(StateIdentificationMode stateIdMode) {
        if (stateIdMode == null) {
            throw new NullPointerException();
        }
        this.stateIdMode = stateIdMode;
    }

    /**
     * Gets the state identification mode.
     * 
     * @return the {@link StateIdentificationMode} set by the
     *         last call to {@link #setStateIdentificationMode(StateIdentificationMode)}.
     */
    public StateIdentificationMode getStateIdentificationMode() {
        return this.stateIdMode;
    }

    /**
     * Sets the breadth mode, i.e., how many branches 
     * will be created during execution.
     * 
     * @param breadthMode a {@link BreadthMode}.
     * @throws NullPointerException if {@code breadthMode == null}.
     */
    public void setBreadthMode(BreadthMode breadthMode) {
        if (breadthMode == null) {
            throw new NullPointerException();
        }
        this.breadthMode = breadthMode;
    }

    /**
     * Gets the breadth mode.
     * 
     * @return the {@link BreadthMode} set by the
     *         last call to {@link #setBreadthMode(BreadthMode)}.
     */
    public BreadthMode getBreadthMode() {
        return this.breadthMode;
    }

    /** 
     * Adds an {@link ExecutionObserver} performing additional
     * actions when a field changes its value.
     * 
     * @param fldClassName the name of the class where the field
     *        resides.
     * @param fldType the type of the field.
     * @param fldName the name of the field.
     * @param observer an {@link ExecutionObserver}. It will be 
     *        notified whenever the field {@code observedVar} of 
     *        any instance of {@code className} is modified.
     */ 
    public void addExecutionObserver(String fldClassName, String fldType, String fldName, ExecutionObserver observer) {
        final Signature sig = new Signature(fldClassName, fldType, fldName);
        this.observedVars.add(sig);
        this.observers.add(observer);
    }

    /**
     * Clears the {@link ExecutionObserver}s.
     */
    public void clearExecutionObservers() {
        this.observedVars.clear();
        this.observers.clear();
    }

    /**
     * Returns the {@link Signature}s of the fields
     * observed by some {@link ExecutionObserver}.
     * 
     * @return a {@link List}{@code <}{@link Signature}{@code >},
     *         in the order matching that of the return value 
     *         of {@link #getObservers()}.
     */
    public List<Signature> getObservedFields() {
        return new ArrayList<>(this.observedVars);
    }

    /**
     * Returns the {@link Signature}s of the fields
     * observed by some {@link ExecutionObserver}.
     * 
     * @return a {@link List}{@code <}{@link Signature}{@code >},
     *         in the order matching that of the return value 
     *         of {@link #getObservedFields()}.
     */
    public List<ExecutionObserver> getObservers() {
        return new ArrayList<>(this.observers);
    }

    /**
     * Sets the initial state of the symbolic execution, and cancels the 
     * effect of any previous call to {@link #addUserClasspath(String...)},
     * {@link #setMethodSignature(String)}.
     *  
     * @param s a {@link State}.
     */
    public void setInitialState(State s) { 
        this.initialState = s; 
        this.userPaths.clear();
        this.methodSignature = null;
        this.calc = null;
    }

    /**
     * Gets the initial state of the symbolic execution (a safety copy).
     * 
     * @return the {@link State} set by the last call to 
     *         {@link #setInitialState(State)} (possibly {@code null}).
     */
    public State getInitialState() {
        if (this.initialState == null) {
            return null;
        } else {
            return this.initialState.clone();
        }
    }
    
    /**
     * Sets whether the bootstrap classloader should also be used to 
     * load the classes defined by the extensions and application classloaders.
     * This deviates a bit from the Java Virtual Machine Specification, 
     * but ensures in practice a faster loading of classes than by
     * the specification mechanism of invoking the {@link ClassLoader#loadClass(String) ClassLoader.loadClass}
     * method. By default it is set to {@code true}. Also cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param bypassStandardLoading a {@code boolean}.
     */
    public void setBypassStandardLoading(boolean bypassStandardLoading) {
        this.bypassStandardLoading = bypassStandardLoading;
        this.initialState = null;
    }
    
    /**
     * Gets whether the bootstrap classloader should also be used to 
     * load the classes defined by the extensions and application classloaders.
     * 
     * @return a {@code boolean}.
     */
    public boolean getBypassStandardLoading() {
        if (this.initialState == null) {
            return this.bypassStandardLoading;
        } else {
            return this.initialState.shouldAlwaysBypassStandardLoading();
        }
    }

    /**
     * Sets the {@link Calculator}, and cancels the effect
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param calc a {@link Calculator}.
     * @throws NullPointerException if {@code calc == null}.
     */
    public void setCalculator(Calculator calc) {
        if (calc == null) {
            throw new NullPointerException();
        }
        this.calc = calc;
        this.initialState = null;
    }

    /**
     * Gets the {@link Calculator}.
     * 
     * @return a {@link Calculator}
     */
    public Calculator getCalculator() {
        if (this.initialState == null) {
            return this.calc;
        } else {
            return this.initialState.getCalculator();
        }
    }

    /**
     * Sets the Java home, and cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param javaHome a {@link String}.
     * @throws NullPointerException if {@code javaHome == null}.
     */
    public void setJavaHome(String javaHome) {
        if (javaHome == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        this.javaHome = Paths.get(javaHome);
    }
    
    /**
     * Sets the Java home, and cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param javaHome a {@link Path}.
     * @throws NullPointerException if {@code javaHome == null}.
     */
    public void setJavaHome(Path javaHome) {
        if (javaHome == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        this.javaHome = javaHome;
    }
    
    /**
     * Brings the Java home back to the default,
     * i.e., the Java home of the JVM that
     * executes JBSE, as returned by the system property
     * {@code java.home}. Also cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     */
    public void setDefaultJavaHome() {
        this.javaHome = Paths.get(System.getProperty("java.home"));
        this.initialState = null;
    }

    /**
     * Gets the Java home.
     * 
     * @return a {@link Path}, the Java home.
     */
    public Path getJavaHome() {
        if (this.initialState == null) {
            return this.javaHome;
        } else {
            return this.initialState.getClasspath().javaHome();
        }
    }

    /**
     * Adds paths to the extensions classpath, and cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param paths a varargs of {@link String}s, 
     *        the paths to be added to the extensions 
     *        classpath.
     * @throws NullPointerException if {@code paths == null}.
     */
    public void addExtClasspath(String... paths) { 
        if (paths == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        this.extPaths.addAll(Arrays.stream(paths).map(s -> Paths.get(s)).collect(Collectors.toList())); 
    }

    /**
     * Adds paths to the extensions classpath, and cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param paths a varargs of {@link Path}s, 
     *        the paths to be added to the extensions 
     *        classpath.
     * @throws NullPointerException if {@code paths == null}.
     */
    public void addExtClasspath(Path... paths) { 
        if (paths == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        Collections.addAll(this.extPaths, paths); 
    }

    /**
     * Sets the extensions classpath to
     * no path.
     */
    public void clearExtClasspath() {
        this.extPaths.clear();
    }

    /**
     * Brings the extensions classpath back to the default,
     * i.e., the same extensions path of the JVM that
     * executes JBSE, as returned by the system property
     * {@code java.ext.dirs}.
     */
    public void setDefaultExtClasspath() {
        this.extPaths = new ArrayList<>(Arrays.stream(System.getProperty("java.ext.dirs").split(File.pathSeparator))
                                        .map(s -> Paths.get(s)).collect(Collectors.toList()));
    }

    /**
     * Adds paths to the user classpath, and cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param paths a varargs of {@link String}s, 
     *        the paths to be added to the user 
     *        classpath.
     * @throws NullPointerException if {@code paths == null}.
     */
    public void addUserClasspath(String... paths) { 
        if (paths == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        this.userPaths.addAll(Arrays.stream(paths).map(s -> Paths.get(s)).collect(Collectors.toList())); 
    }

    /**
     * Adds paths to the user classpath, and cancels the effect 
     * of any previous call to {@link #setInitialState(State)}.
     * 
     * @param paths a varargs of {@link Path}s, 
     *        the paths to be added to the user 
     *        classpath.
     * @throws NullPointerException if {@code paths == null}.
     */
    public void addUserClasspath(Path... paths) { 
        if (paths == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        Collections.addAll(this.userPaths, paths); 
    }

    /**
     * Brings the user classpath back to the default,
     * i.e., no user path.
     */
    public void clearUserClasspath() {
        this.userPaths.clear();
    }

    /**
     * Builds the classpath.
     * 
     * @return a {@link Classpath} object. 
     * @throws IOException if an I/O error occurs while scanning the classpath.
     */
    public Classpath getClasspath() throws IOException {
        if (this.initialState == null) {
            return new Classpath(this.javaHome, this.extPaths, this.userPaths);
        } else {
            return this.initialState.getClasspath();
        }
    }

    /**
     * Returns the {@link TriggerRulesRepo} 
     * containing all the trigger rules that
     * must be used.
     * 
     * @return a {@link TriggerRulesRepo}. It
     *         is the one that backs this
     *         {@link EngineParameters}, not a
     *         safety copy.
     */
    public TriggerRulesRepo getTriggerRulesRepo() {
        return this.repoTrigger;
    }

    /**
     * Returns the expansion backdoor.
     * 
     * @return a {@link Map}{@code <}{@link String}{@code , }{@link Set}{@code <}{@link String}{@code >>},
     *         associating class names with set of
     *         other class names. 
     *         It is the one that backs this
     *         {@link EngineParameters}, not a
     *         safety copy.
     */
    public Map<String, Set<String>> getExpansionBackdoor() {
        return this.expansionBackdoor;
    }

    /**
     * Adds a trigger method that fires when some references are resolved by
     * expansion. Also adds a class to the expansion backdoor.
     * 
     * @param toExpand     the static type of the reference to be expanded. 
     *                     It must be {@code toExpand != null}.
     * @param originExp    a path expression describing the origin of the 
     *                     symbolic references which match this rule.
     *                     The path expression is a slash-separated list of field
     *                     names that starts from {ROOT}:x, indicating the 
     *                     parameter with name {@code x} of the root method 
     *                     invocation (including {@code this}).
     *                     If {@code originExp == null}, all the symbolic 
     *                     references with static type {@code toExpand} 
     *                     will match. 
     * @param classAllowed the name of the class whose instances are possible 
     *                     expansions for this trigger to fire. 
     * @param triggerClassName 
     *                     the class of the trigger method. When {@code null}
     *                     no trigger method will fire (only the expansion backdoor
     *                     is updated).
     * @param triggerParametersSignature 
     *                     the types of the parameters of the trigger method. 
     *                     When {@code null} no trigger method will fire (only 
     *                     the expansion backdoor is updated).
     * @param triggerMethodName 
     *                     the name of the trigger method. When {@code null}
     *                     no trigger method will fire (only the expansion backdoor
     *                     is updated).
     * @param triggerParameter
     *                     the parameter to be passed to the trigger method. 
     */
    public void addExpandToTrigger(String toExpand, String originExp, String classAllowed, 
                                   String triggerClassName, String triggerParametersSignature, String triggerMethodName,
                                   String triggerParameter) {
        if (triggerClassName != null && triggerParametersSignature != null && triggerMethodName == null) {
            this.repoTrigger.addExpandTo(toExpand, originExp, classAllowed, 
                                         new Signature(triggerClassName, triggerParametersSignature, triggerMethodName), triggerParameter);
        }

        //updates expansion backdoor
        Set<String> classesAllowed = this.expansionBackdoor.get(toExpand);
        if (classesAllowed == null) {
            classesAllowed = new HashSet<>();
            this.expansionBackdoor.put(toExpand, classesAllowed);
        }
        classesAllowed.add(classAllowed);	
    }

    /**
     * Adds a trigger method that fires when some references are resolved by
     * alias.
     * 
     * @param toResolve      the static type of the reference to be resolved. 
     *                       It must be {@code toResolve != null}.
     * @param originExp      a path expression describing the origin of the 
     *                       symbolic references which match this rule.
     *                       The path expression is a slash-separated list of field
     *                       names that starts from {ROOT}:x, indicating the 
     *                       parameter with name {@code x} of the root method 
     *                       invocation (including {@code this}).
     *                       If {@code originExp == null}, all the symbolic 
     *                       references with static type {@code toResolve} 
     *                       will match. 
     * @param pathAllowedExp a path expression describing the objects which are 
     *                       possible alias for this trigger to fire. 
     *                       The path expression is a slash-separated list of field
     *                       names that starts from {ROOT}:x, indicating the 
     *                       parameter with name {@code x} of the root method 
     *                       invocation (including {@code this}), or from 
     *                       {REF}, indicating a path starting from the origin 
     *                       of the reference matched by the left part of the rule. 
     *                       You can also use the special {UP} to move back in the 
     *                       path; for instance, if the reference matching 
     *                       {@code originExp} has origin 
     *                       {ROOT}:this/list/head/next/next, then you can use both 
     *                       {REF}/{UP}/{UP}/{UP} and {ROOT}:this/list to denote 
     *                       the field with name {@code list} of the object that is
     *                       referred by the {@code this} parameter of the root method
     *                       invocation.
     * @param triggerClassName 
     *                       the class of the trigger method.
     * @param triggerParametersSignature 
     *                       the types of the parameters of the trigger method.
     * @param triggerMethodName 
     *                       the name of the trigger method.
     * @param triggerParameter
     *                       the parameter to be passed to the trigger method. 
     */
    public void addResolveAliasOriginTrigger(String toResolve, String originExp, String pathAllowedExp, 
                                             String triggerClassName, String triggerParametersSignature, String triggerMethodName,
                                             String triggerParameter) {
        this.repoTrigger.addResolveAliasOrigin(toResolve, originExp, pathAllowedExp, 
                                               new Signature(triggerClassName, triggerParametersSignature, triggerMethodName), triggerParameter);
    }

    /**
     * Adds a trigger method that fires when some references are resolved by
     * alias.
     * 
     * @param toResolve    the static type of the reference to be resolved. 
     *                     It must be {@code toResolve != null}.
     * @param originExp    a path expression describing the origin of the 
     *                     symbolic references which match this rule.
     *                     The path expression is a slash-separated list of field
     *                     names that starts from {ROOT}:x, indicating the 
     *                     parameter with name {@code x} of the root method 
     *                     invocation (including {@code this}).
     *                     If {@code originExp == null}, all the symbolic 
     *                     references with static type {@code toResolve} 
     *                     will match. 
     * @param classAllowed the name of the class whose instances are possible 
     *                     expansions for this trigger to fire. 
     * @param triggerClassName 
     *                     the class of the trigger method.
     * @param triggerParametersSignature 
     *                     the types of the parameters of the trigger method.
     * @param triggerMethodName 
     *                     the name of the trigger method.
     * @param triggerParameter
     *                     the parameter to be passed to the trigger method. 
     */
    public void addResolveAliasInstanceofTrigger(String toResolve, String originExp, String classAllowed, 
                                                 String triggerClassName, String triggerParametersSignature, String triggerMethodName,
                                                 String triggerParameter) {
        this.repoTrigger.addResolveAliasInstanceof(toResolve, originExp, classAllowed,
                                                   new Signature(triggerClassName, triggerParametersSignature, triggerMethodName), triggerParameter);
    }

    /**
     * Adds a trigger method that fires when some references are resolved by
     * null.
     * 
     * @param toResolve the static type of the reference to be resolved. 
     *                  It must be {@code toResolve != null}.
     * @param originExp a path expression describing the origin of the 
     *                  symbolic references that match this rule.
     *                  The path expression is a slash-separated list of field
     *                  names that starts from {ROOT}:x, indicating the 
     *                  parameter with name {@code x} of the root method 
     *                  invocation (including {@code this}).
     *                  If {@code originExp == null}, all the symbolic 
     *                  references with static type {@code toResolve} 
     *                  will match. 
     * @param triggerClassName 
     *                  the class of the trigger method.
     * @param triggerParametersSignature 
     *                  the types of the parameters of the trigger method.
     * @param triggerMethodName 
     *                  the name of the trigger method.
     * @param triggerParameter
     *                  the parameter to be passed to the trigger method. 
     */ 
    public void addResolveNullTrigger(String toResolve, String originExp, 
                                      String triggerClassName, String triggerParametersSignature, String triggerMethodName,
                                      String triggerParameter) {
        this.repoTrigger.addResolveNull(toResolve, originExp,
                                        new Signature(triggerClassName, triggerParametersSignature, triggerMethodName), triggerParameter);
    }

    /**
     * Specifies an alternative, meta-level implementation of a method 
     * that must override the standard one. 
     * 
     * @param className the name of the class containing the overridden method.
     * @param descriptor the descriptor of the method.
     * @param methodName the name of the method.
     * @param metaDelegateClassName the name of a {@link Class} that implements
     *        the semantics of calls to the {@code methodName} method.
     * @throws NullPointerException if any of the above parameters is {@code null}.
     */
    public void addMetaOverridden(String className, String descriptor, String methodName, String metaDelegateClassName) {
        if (className == null || descriptor == null || methodName == null || metaDelegateClassName == null) {
            throw new NullPointerException();
        }
        this.metaOverridden.add(new String[] { className, descriptor, methodName, metaDelegateClassName });
    }

    /**
     * Clears the specifications of the meta-level implementations 
     * of methods.
     */
    public void clearMetaOverridden() {
        this.metaOverridden.clear();
    }

    /**
     * Returns the specifications of the meta-level implementations 
     * of methods.
     * 
     * @return A {@link List}{@code <}{@link String}{@code []>}, 
     *         where each array is a 4-ple (method class name, 
     *         method parameters, method name, meta delegate
     *         class name).
     */
    public ArrayList<String[]> getMetaOverridden() {
        return new ArrayList<>(this.metaOverridden);
    }

    /**
     * Specifies that a method must be treated as an uninterpreted pure
     * function, rather than executed. In the case all the parameters are
     * constant, the method is executed metacircularly.
     * 
     * @param methodClassName the name of the class containing the method.
     * @param methodDescriptor the descriptor of the method.
     * @param methodName the name of the method.
     * @throws NullPointerException if any of the above parameters is {@code null}.
     */
    public void addUninterpreted(String methodClassName, String methodDescriptor, String methodName) {
        if (methodClassName == null || methodDescriptor == null || methodName == null) {
            throw new NullPointerException();
        }
        this.uninterpreted.add(new String[] { methodClassName, methodDescriptor, methodName });
    }


    /**
     * Specifies that a set of methods must be treated as an uninterpreted pure
     * function, rather than executed. In the case all the parameters are
     * constant, the methods are executed metacircularly.
     * 
     * @param patternMethodClassName a regular expression pattern for the names 
     *        of the classes containing the methods.
     * @param patternMethodDescriptor a regular expression pattern for the descriptors
     *        of the methods.
     * @param patternMethodName a regular expression pattern for the names of the methods.
     * @throws NullPointerException if any of the above parameters is {@code null}.
     */
    public void addUninterpretedPattern(String patternMethodClassName, String patternMethodDescriptor, String patternMethodName) {
        if (patternMethodClassName == null || patternMethodDescriptor == null || patternMethodName == null) {
            throw new NullPointerException();
        }
        this.uninterpretedPattern.add(new String[] { patternMethodClassName, patternMethodDescriptor, patternMethodName });
    }

    /**
     * Clears the methods that must be treated as
     * uninterpreted pure functions.
     */
    public void clearUninterpreted() {
        this.uninterpreted.clear();
    }

    /**
     * Returns the methods that must be treated as
     * uninterpreted pure functions.
     * 
     * @return A {@link List}{@code <}{@link String}{@code []>}, 
     *         where each array is a triple (method class name, 
     *         method parameters, method name).
     */
    public List<String[]> getUninterpreted() {
        return new ArrayList<>(this.uninterpreted);
    }

    public List<String[]> getUninterpretedPattern() {
        return new ArrayList<>(this.uninterpretedPattern);
    }

    /**
     * Sets the signature of the method which must be symbolically executed, 
     * and cancels the effect of any previous call to {@link #setInitialState(State)}.
     * 
     * @param className the name of the class containing the method.
     * @param descriptor the descriptor of the method.
     * @param methodName the name of the method. 
     * @throws NullPointerException if any of the above parameters is {@code null}.
     */
    public void setMethodSignature(String className, String descriptor, String methodName) { 
        if (className == null || descriptor == null || methodName == null) {
            throw new NullPointerException();
        }
        this.initialState = null; 
        this.methodSignature = new Signature(className, descriptor, methodName); 
    }

    /**
     * Gets the signature of the method which must be symbolically executed.
     * 
     * @return a {@link Signature}, or {@code null} if no method signature
     *         has been provided.
     */
    public Signature getMethodSignature() {
        if (this.methodSignature == null && this.initialState == null) {
            return null;
        }
        if (this.methodSignature == null) {
            try {
                return this.initialState.getCurrentMethodSignature();
            } catch (ThreadStackEmptyException | FrozenStateException e) {
                return null;
            }
        }
        return this.methodSignature;
    }
    
    /**
     * Sets the maximum length an array must have to be 
     * granted simple representation.
     * 
     * @param maxSimpleArrayLength an {@code int}.
     */
    public void setMaxSimpleArrayLength(int maxSimpleArrayLength) {
        this.maxSimpleArrayLength = maxSimpleArrayLength;
    }

    /**
     * Returns the maximum length an array must have to be 
     * granted simple representation.
     * 
     * @param maxSimpleArrayLength an {@code int}.
     */
    public int getMaxSimpleArrayLength() {
        return this.maxSimpleArrayLength;
    }
    
    /**
     * Sets the maximum heap size, expressed as the 
     * maximum number of objects in the heap. If 
     * during symbolic execution the heap becomes
     * bigger than this treshold, JBSE raises 
     * an {@link OutOfMemoryError}.
     * 
     * @param maxHeapSize a {@code long}.
     */
    public void setMaxHeapSize(long maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
    }
    
    /**
     * Returns the maximum heap size, expressed
     * as the maximum number of objects in the heap.
     * 
     * @return a {@code long}.
     */
    public long getMaxHeapSize() {
        return this.maxHeapSize;
    }
    
    /**
     * Sets whether the classes created during
     * the pre-initialization phase shall be (pedantically)
     * considered symbolic.
     * 
     * @param makePreInitClassesSymbolic a {@code boolean}.
     *        If {@code true} all the classes created during
     *        the pre-inizialization phase will be made 
     *        symbolic.
     */
    public void setMakePreInitClassesSymbolic(boolean makePreInitClassesSymbolic) {
    	this.makePreInitClassesSymbolic = makePreInitClassesSymbolic;
    }
    
    /**
     * Returns whether the classes created during
     * the pre-initialization phase shall be (pedantically)
     * considered symbolic.
     * 
     * @return a {@code boolean}.
     */
    public boolean getMakePreInitClassesSymbolic() {
    	return this.makePreInitClassesSymbolic;
    }

    @SuppressWarnings("unchecked")
    @Override
    public EngineParameters clone() {
        final EngineParameters o;
        try {
            o = (EngineParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
        if (this.initialState != null) {
            o.initialState = this.initialState.clone();
        }
        o.userPaths = (ArrayList<Path>) this.userPaths.clone();
        //calc and decisionProcedure are *not* cloned
        o.observedVars = (ArrayList<Signature>) this.observedVars.clone();
        o.repoTrigger = this.repoTrigger.clone();
        o.expansionBackdoor = new HashMap<>();
        for (Map.Entry<String, Set<String>> e : o.expansionBackdoor.entrySet()) {
            o.expansionBackdoor.put(e.getKey(), new HashSet<>(e.getValue()));
        }
        o.metaOverridden = (ArrayList<String[]>) this.metaOverridden.clone();
        o.uninterpreted = (ArrayList<String[]>) this.uninterpreted.clone();
        return o;
    }
}
