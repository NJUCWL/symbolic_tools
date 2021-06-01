package jbse.mem;

import static jbse.bc.ClassLoaders.CLASSLOADER_APP;
import static jbse.bc.ClassLoaders.CLASSLOADER_BOOT;
import static jbse.bc.Signatures.JAVA_CLASS;
import static jbse.bc.Signatures.JAVA_CLASS_CLASSLOADER;
import static jbse.bc.Signatures.JAVA_CLASSLOADER;
import static jbse.bc.Signatures.JAVA_STRING;
import static jbse.bc.Signatures.JAVA_STRING_HASH;
import static jbse.bc.Signatures.JAVA_STRING_VALUE;
import static jbse.bc.Signatures.JAVA_THREAD;
import static jbse.bc.Signatures.JAVA_THREADGROUP;
import static jbse.bc.Signatures.JAVA_THROWABLE;
import static jbse.common.Type.parametersNumber;
import static jbse.common.Type.isPrimitiveOrVoidCanonicalName;
import static jbse.common.Util.unsafe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

import jbse.bc.ClassFile;
import jbse.bc.ClassFileFactory;
import jbse.bc.ClassHierarchy;
import jbse.bc.Classpath;
import jbse.bc.ExceptionTable;
import jbse.bc.ExceptionTableEntry;
import jbse.bc.Signature;
import jbse.bc.Snippet;
import jbse.bc.SnippetFactory;
import jbse.bc.exc.BadClassFileVersionException;
import jbse.bc.exc.ClassFileIllFormedException;
import jbse.bc.exc.ClassFileNotAccessibleException;
import jbse.bc.exc.ClassFileNotFoundException;
import jbse.bc.exc.IncompatibleClassFileException;
import jbse.bc.exc.InvalidClassFileFactoryClassException;
import jbse.bc.exc.InvalidIndexException;
import jbse.bc.exc.MethodCodeNotFoundException;
import jbse.bc.exc.MethodNotFoundException;
import jbse.bc.exc.NullMethodReceiverException;
import jbse.bc.exc.WrongClassNameException;
import jbse.common.Type;
import jbse.common.exc.InvalidInputException;
import jbse.common.exc.UnexpectedInternalException;
import jbse.mem.exc.CannotAssumeSymbolicObjectException;
import jbse.mem.exc.CannotRefineException;
import jbse.mem.exc.ContradictionException;
import jbse.mem.exc.FastArrayAccessNotAllowedException;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.HeapMemoryExhaustedException;
import jbse.mem.exc.InvalidProgramCounterException;
import jbse.mem.exc.InvalidSlotException;
import jbse.mem.exc.InvalidNumberOfOperandsException;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.val.Calculator;
import jbse.val.Expression;
import jbse.val.HistoryPoint;
import jbse.val.KlassPseudoReference;
import jbse.val.Null;
import jbse.val.Primitive;
import jbse.val.PrimitiveSymbolic;
import jbse.val.Reference;
import jbse.val.ReferenceConcrete;
import jbse.val.ReferenceSymbolic;
import jbse.val.Simplex;
import jbse.val.SymbolFactory;
import jbse.val.Symbolic;
import jbse.val.Value;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidTypeException;

/**
 * Class that represents the state of execution.
 */
public final class State implements Cloneable {
    /** The slot number of the "this" (method receiver) object. */
    private static final int ROOT_THIS_SLOT = 0;

    /**
     * Class that stores the information about a raw memory
     * block allocated to support {@link sun.misc.Unsafe}
     * raw allocation methods.
     * 
     * @author Pietro Braione
     */
    @SuppressWarnings("restriction")
	private static final class MemoryBlock {
        /** The base address of the memory block. */
        final long address;
        
        /** The size in bytes of the memory block. */
        final long size;
        
        MemoryBlock(long address, long size) {
            this.address = address;
            this.size = size;
        }        
    }
    
    /**
     * Class that stores information about an open
     * zip file to support {@link java.util.zip.ZipFile}
     * and {@link java.util.jar.JarFile} native methods.
     * 
     * @author Pietro Braione
     */
    private static final class ZipFile {
        /** 
         * The address of a jzfile C data structure for the
         * entry. 
         */
        final long jzfile;
        
        /** The name of the file. */
        final String name;
        
        /** The file opening mode. */
        final int mode;
        
        /** When the file was modified. */
        final long lastModified;
        
        /** Should we use mmap? */
        final boolean usemmap;
        
        ZipFile(long jzfile, String name, int mode, long lastModified, boolean usemmap) {
            this.jzfile = jzfile;
            this.name = name;
            this.mode = mode;
            this.lastModified = lastModified;
            this.usemmap = usemmap;
        }
    }
    
    /**
     * Class that stores the information about an open
     * zip file's entries to support {@link java.util.zip.ZipFile}
     * and {@link java.util.jar.JarFile} native methods.
     * 
     * @author Pietro Braione
     */
    private static final class ZipFileEntry {
        /** 
         * The address of a jzentry C data structure for the
         * entry. 
         */
        final long jzentry;
        
        /** 
         * The (base-level) jzfile for the file this entry
         * belongs to. 
         */
        final long jzfile;
        
        /** The name of the entry. */
        final byte[] name;
        
        ZipFileEntry(long jzentry, long jzfile, byte[] name) {
            this.jzentry = jzentry;
            this.jzfile = jzfile;
            this.name = name.clone();
        }
    }
    
    private static class Inflater {
        final long address;
        
        final boolean nowrap;
        
        final byte[] dictionary;
        
        Inflater(long address, boolean nowrap, byte[] dictionary, int off, int len) {
            this.address = address;
            this.nowrap = nowrap;
            if (dictionary == null) {
                this.dictionary = null;
            } else {
                this.dictionary = new byte[len];
                System.arraycopy(dictionary, off, this.dictionary, 0, len);
            }
        }
        
        Inflater(long address, boolean nowrap) {
            this(address, nowrap, null, 0, 0);
        }
    }

    /** 
     * {@code true} iff the bootstrap classloader should also load classes defined by the
     * extensions and application classloaders. 
     */
    private final boolean bypassStandardLoading;
    
    /** If {@code true} the state is immutable. */
    private boolean frozen = false;

    /** The {@link HistoryPoint} of the state before the initial one. */
    private HistoryPoint lastPreInitialHistoryPoint = null;

    /** The {@link HistoryPoint} of this state. */
    private HistoryPoint historyPoint;
    
    /** 
     * Flag indicating whether the current state was produced by a
     * branching decision.
     */
    private boolean branchingDecision = false;

    /** The depth of the state, i.e., the number of branch points over it. */
    private int depth = 0;

    /** The count of the state, i.e., the number of states from the previous branch point. */
    private int count = 0;

    /** The string literals. */
    private HashMap<String, ReferenceConcrete> stringLiterals = new HashMap<>();

    /** The {@link ReferenceConcrete}s to {@link Instance_JAVA_CLASS}es for nonprimitive types. */
    private HashMap<ClassFile, ReferenceConcrete> classes = new HashMap<>();

    /** The {@link ReferenceConcrete}s to {@link Instance_JAVA_CLASS}es for primitive types. */
    private HashMap<String, ReferenceConcrete> classesPrimitive = new HashMap<>();
    
    /** The identifier of the next {@link Instance_JAVA_CLASSLOADER} to be created. */
    private int nextClassLoaderIdentifier = 1;
    
    /** Maps classloader identifiers to {@link ReferenceConcrete}s to {@link Instance_JAVA_CLASSLOADER}. */
    private ArrayList<ReferenceConcrete> classLoaders = new ArrayList<>();
    
    /** 
     * Used to check whether the {@link Instance_JAVA_CLASSLOADER} for the standard (ext and app) 
     * classloader are ready (this flag is {@code false} iff they are ready). 
     */
    private boolean standardClassLoadersNotReady = true;
    
    /** The {@link ReferenceConcrete}s to {@link Instance}s of {@code java.lang.invoke.MethodType}s. */
    private HashMap<String, ReferenceConcrete> methodTypes = new HashMap<>();
    
    /** Maps file descriptors to (meta-level) open files. */
    private HashMap<Integer, Object> files = new HashMap<>();
    
    /** Maps memory addresses to (meta-level) allocated memory blocks. */
    private HashMap<Long, MemoryBlock> allocatedMemory = new HashMap<>();
    
    /** 
     * Maps (base-level) jzfile C structure addresses to 
     * (meta-level) open zip files. 
     */
    private HashMap<Long, ZipFile> zipFiles = new HashMap<>();
    
    /** 
     * Maps (base-level) jzentry C structure addresses to 
     * (meta-level) open zip file entries.
     */
    private HashMap<Long, ZipFileEntry> zipFileEntries = new HashMap<>();
    
    /** Maps (base-level) inflater addresses to (meta-level) inflaters. */
    private HashMap<Long, Inflater> inflaters = new HashMap<>();
    
    /** The registered performance counters. */
    private HashSet<String> perfCounters = new HashSet<>();

    /** The JVM stack of the current execution thread. */
    private ThreadStack stack = new ThreadStack();

    /** The JVM heap. */
    private Heap heap;

    /** 
     * The object that fetches classfiles from the classpath, stores them, 
     * and allows visiting the whole class/interface hierarchy. 
     */
    private ClassHierarchy classHierarchy;

    /** The JVM static method area. */
    private StaticMethodArea staticMethodArea = new StaticMethodArea();
    
    /**
     * The phase types of the symbolic execution.
     * 
     * @author Pietro Braione
     */
    public enum Phase { 
    	/** This state comes strictly before the initial state. */
    	PRE_INITIAL, 
    	
    	/** This state is the initial state. */
    	INITIAL, 
    	
    	/** This state comes strictly after the initial state. */
    	POST_INITIAL 
    }
    
    /** The current phase of symbolic execution. */
    private Phase phase = Phase.PRE_INITIAL;

    /** The path condition of the state in the execution tree. */
    private PathCondition pathCondition = new PathCondition();

    /** Whether a reset operation was invoked. */ 
    private boolean wereResetLastPathConditionClauses = false;

    /** The number of pushed path condition clauses from the last reset. */ 
    private int nPushedClauses = 0;

    /** {@code true} iff the state is stuck. */
    private boolean stuck = false;

    /** 
     * The exception raised to the root method's caller, 
     * meaningful only when {@code this.stuck == true}. 
     */ 
    private Reference exc = null;

    /** 
     * The return value for the root method's caller, 
     * meaningful only when {@code this.stuck == true}. 
     */ 
    private Value val = null;

    /** May symbolic execution from this state violate an assumption? */
    private boolean mayViolateAssumption = true;

    /** {@code true} iff the next bytecode must be executed in its WIDE variant. */
    private boolean wide = false;
    
    /** 
     * Links signature polymorphic methods that have nonintrinsic
     * (type checking) semantics to their adapter methods, indicated
     * as {@link ReferenceConcrete}s to their respective {@code java.lang.invoke.MemberName}s.
     */
    private HashMap<Signature, ReferenceConcrete> linkInvokers = new HashMap<>();
    
    /** 
     * Links signature polymorphic methods that have nonintrinsic
     * (type checking) semantics to their invocation appendices, indicated
     * as {@link ReferenceConcrete}s to {@code Object[]}s.
     */
    private HashMap<Signature, ReferenceConcrete> linkAppendices = new HashMap<>();
    
    /** The maximum length an array may have to be granted simple representation. */
    private final int maxSimpleArrayLength;

    /** The {@link Calculator}. */
    private final Calculator calc;

    /** 
     * The generator for unambiguous symbol identifiers; mutable
     * because different states at different branches may have different
     * generators, possibly starting from the same numbers. 
     */
    private SymbolFactory symbolFactory;
    
    /** A {@link ReferenceConcrete} to the main thread group created at init time. */
    private ReferenceConcrete mainThreadGroup;
    
    /** A {@link ReferenceConcrete} to the main thread created at init time. */
    private ReferenceConcrete mainThread;
    
    /** A counter for no-wrap snippet classfiles. */
    private int snippetClassFileCounter = 0;

    /**
     * Constructor. It returns a virgin, pre-initial {@link State}.
     * 
     * @param bypassStandardLoading a {@code boolean}, {@code true} iff the bootstrap 
     *        classloader should also load the classed defined by the extensions 
     *        and application classloaders.
     * @param historyPoint a {@link HistoryPoint}. 
     * @param maxSimpleArrayLength an {@code int}, the maximum length an array may have
     *        to be granted simple representation.
     * @param maxHeapSize the maximum size of the state's heap expressed as the
     *        maximum number of objects it can store.
     * @param classPath a {@link Classpath}.
     * @param factoryClass the {@link Class} of some subclass of {@link ClassFileFactory}.
     *        The class must have an accessible constructor with two parameters, the first a 
     *        {@link ClassFileStore}, the second a {@link Classpath}.
     * @param expansionBackdoor a 
     *        {@link Map}{@code <}{@link String}{@code , }{@link Set}{@code <}{@link String}{@code >>}
     *        associating class names to sets of names of their subclasses. It 
     *        is used in place of the class hierarchy to perform expansion.
     * @param calc a {@link Calculator}. It will be used to do all kinds of calculations
     *        on concrete and symbolic values.
     * @param symbolFactory a {@link SymbolFactory}. It will be used to generate
     *        symbolic values to be injected in this state.
     * @throws InvalidClassFileFactoryClassException in the case {@link fClass}
     *         has not the expected features (missing constructor, unaccessible 
     *         constructor...).
     * @throws InvalidInputException if {@code historyPoint == null || classPath == null || 
     *         factoryClass == null || expansionBackdoor == null || calc == null || symbolFactory == null}.
     */
    public State(boolean bypassStandardLoading,
    		     HistoryPoint historyPoint,
                 int maxSimpleArrayLength,
                 long maxHeapSize,
                 Classpath classPath, 
                 Class<? extends ClassFileFactory> factoryClass, 
                 Map<String, Set<String>> expansionBackdoor, 
                 Calculator calc,
                 SymbolFactory symbolFactory) 
                 throws InvalidClassFileFactoryClassException, InvalidInputException {
    	if (historyPoint == null || calc == null || symbolFactory == null) {
    		throw new InvalidInputException("Attempted the creation of a state with null historyPoint, or calc, or symbolFactory.");
    	}
        this.bypassStandardLoading = bypassStandardLoading;
    	this.frozen = false;
        this.historyPoint = historyPoint;
        this.classLoaders.add(Null.getInstance()); //classloader 0 is the bootstrap classloader
        setStandardFiles();
        this.heap = new Heap(maxHeapSize);
        this.classHierarchy = new ClassHierarchy(classPath, factoryClass, expansionBackdoor);
        this.maxSimpleArrayLength = maxSimpleArrayLength;
        this.calc = calc;
        this.symbolFactory = symbolFactory;
    }
    
    private void setStandardFiles() {
        try {
            //gets reflectively some fields from FilterInputStream and FilterOutputStream
            final Field fisInField = FilterInputStream.class.getDeclaredField("in");
            fisInField.setAccessible(true);
            final Field fosOutField = FilterOutputStream.class.getDeclaredField("out");
            fosOutField.setAccessible(true);
            
            //gets the stdin and registers it
            FileInputStream in = null;
            for (InputStream is = System.in; (is instanceof FilterInputStream) || (is instanceof FileInputStream); is = (InputStream) fisInField.get(is)) {
                if (is instanceof FileInputStream) {
                    in = (FileInputStream) is;
                    break;
                }
            }
            //TODO do something if in == null
            setFile(0, in);
            
            //gets the stdout and registers it
            FileOutputStream out = null;
            for (OutputStream os = System.out; (os instanceof FilterOutputStream) || (os instanceof FileOutputStream); os = (OutputStream) fosOutField.get(os)) {
                if (os instanceof FileOutputStream) {
                    out = (FileOutputStream) os;
                    break;
                }
            }
            //TODO if out == null, set to some backup output file
            setFile(1, out);
            
            //gets the stderr and registers it
            FileOutputStream err = null;
            for (OutputStream os = System.err; (os instanceof FilterOutputStream) || (os instanceof FileOutputStream); os = (OutputStream) fosOutField.get(os)) {
                if (os instanceof FileOutputStream) {
                    err = (FileOutputStream) os;
                    break;
                }
            }
            //TODO if err == null, set to some backup output file
            setFile(2, err);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | 
        		 IllegalAccessException | FrozenStateException e) {
            throw new UnexpectedInternalException(e);
        }
    }
    
    /**
     * Freezes this state, making it immutable.
     */
    public void freeze() {
    	this.frozen = true;
    }

    /**
     * Getter for this state's classpath.
     * 
     * @return a {@link Classpath} (a safety copy of 
     *         the one used to construct this state).
     */
    public Classpath getClasspath() {
        return this.classHierarchy.getClasspath();
    }

    /**
     * Getter for this state's calculator.
     * 
     * @return a {@link Calculator}.
     */
    public Calculator getCalculator() {
        return this.calc;
    }
    
    /**
     * Sets the main thread group.
     * 
     * @param mainThreadGroup a {@link ReferenceConcrete} to 
     *        an {@link Instance} of class {@link java.lang.ThreadGroup}.
     * @throws NullPointerException if {@code mainThreadGroup == null}.
     * @throws InvalidInputException if the state is frozen or if 
     *         {@code mainThreadGroup} does not
     *         refer an {@link Instance} of class {@link java.lang.ThreadGroup}.
     */
    public void setMainThreadGroup(ReferenceConcrete mainThreadGroup) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final Objekt o = getObject(mainThreadGroup);
        if (o == null ||
            !(o instanceof Instance) ||
            !JAVA_THREADGROUP.equals(o.getType().getClassName())) {
            throw new InvalidInputException("Tried to set the main threadgroup with a reference to a object of class " + o.getType().getClassName() + ".");
        }
        this.mainThreadGroup = mainThreadGroup;
    }

    /**
     * Gets the main thread group.
     * 
     * @return a {@link ReferenceConcrete} to 
     *        an {@link Instance} of class {@link java.lang.ThreadGroup}, 
     *        or {@code null} if {@link #setMainThreadGroup(ReferenceConcrete)}
     *        was not invoked before.
     */
    public ReferenceConcrete getMainThreadGroup() {
        return this.mainThreadGroup;
    }
    
    /**
     * Sets the main thread.
     * 
     * @param mainThread a {@link ReferenceConcrete} to 
     *        an {@link Instance_JAVA_THREAD}.
     * @throws NullPointerException if {@code mainThread == null}.
     * @throws InvalidInputException if the state is frozen or 
     *         if {@code mainThread} does not
     *         refer an {@link Instance_JAVA_THREAD}.
     */
    public void setMainThread(ReferenceConcrete mainThread) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final Objekt o = getObject(mainThread);
        if (o == null ||
            !(o instanceof Instance_JAVA_THREAD)) {
            throw new InvalidInputException("Tried to set the main thread with a reference to a object of class " + o.getType().getClassName() + ".");
        }
        this.mainThread = mainThread;
    }
    
    /**
     * Gets the main thread.
     * 
     * @return a {@link ReferenceConcrete} to 
     *        an {@link Instance_JAVA_THREAD},
     *        or {@code null} if {@link #setMainThread(ReferenceConcrete)}
     *        was not invoked before.
     */
    public ReferenceConcrete getMainThread() {
        return this.mainThread;
    }

    /**
     * Returns and deletes the value from the top of the current 
     * operand stack.
     * 
     * @return the {@link Value} on the top of the current 
     *         operand stack.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws InvalidNumberOfOperandsException if the current operand 
     *         stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Value popOperand() 
    throws ThreadStackEmptyException, InvalidNumberOfOperandsException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return getCurrentFrame().pop();
    }

    /**
     * Removes the topmost {@code num} elements in the operand stack.
     * 
     * @param num an nonnegative {@code int}.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws InvalidNumberOfOperandsException if the operand stack 
     *         does not contain at least {@code num} elements, or if 
     *         {@code num} is negative.
     * @throws FrozenStateException if the state is frozen.
     */
    public void popOperands(int num) 
    throws ThreadStackEmptyException, InvalidNumberOfOperandsException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        getCurrentFrame().pop(num);
    }

    /**
     * Returns the topmost element in the current operand stack, 
     * without removing it.
     * 
     * @return a {@link Value}.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws InvalidNumberOfOperandsException if the current operand
     *         stack is empty. 
     * @throws FrozenStateException if the state is frozen.
     */
    public Value topOperand() 
    throws ThreadStackEmptyException, InvalidNumberOfOperandsException, FrozenStateException {
        return getCurrentFrame().top();
    }

    /**
     * Puts a {@link Value} on the top of the current operand stack.
     * If tracking is active and the value is a {@link Reference}, it 
     * informs the tracker about this.
     * 
     * @param val {@link Value} to put on the top of the current 
     * operand stack.
     * @throws ThreadStackEmptyException if the thread stack is empty. 
     * @throws FrozenStateException  if the state is frozen.
     */
    //TODO check that only operand stack types (int, long, float, double, reference) can be pushed, or convert smaller values automatically
    public void pushOperand(Value val) throws ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        getCurrentFrame().push(val);		
    }

    /**
     * Clears the current operand stack.
     * 
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void clearOperands() throws ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        getCurrentFrame().clear();
    }

    /**
     * Checks whether this state may violate some
     * assumption not yet assumed.
     * 
     * @return {@code true} iff it can.
     */
    public boolean mayViolateAssumption() {
        return this.mayViolateAssumption;
    }

    /**
     * Disables the possibility of having 
     * other assumptions being issued later
     * during symbolic execution.
     * @throws FrozenStateException if the state is frozen.
     */
    public void disableAssumptionViolation() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.mayViolateAssumption = false;
    }
    
    /**
     * Returns the current class.
     * 
     * @return a {@link ClassFile}.
     * @throws ThreadStackEmptyException if the stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public ClassFile getCurrentClass() throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getCurrentClass();
    }

    /**
     * Returns the {@link Signature} of the  
     * current method.
     * 
     * @return a {@link Signature}.
     * @throws ThreadStackEmptyException if the stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Signature getCurrentMethodSignature() throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getCurrentMethodSignature();
    }
    
    /**
     * Returns the root class, i.e., the current class
     * of the root frame.
     * 
     * @return a {@link ClassFile}.
     * @throws ThreadStackEmptyException if the stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public ClassFile getRootClass() 
    throws ThreadStackEmptyException, FrozenStateException {
        return getRootFrame().getCurrentClass();
    }

    /**
     * Returns the {@link Signature} of the  
     * root method.
     * 
     * @return a {@link Signature}.
     * @throws ThreadStackEmptyException if the stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Signature getRootMethodSignature() 
    throws ThreadStackEmptyException, FrozenStateException {
        return getRootFrame().getCurrentMethodSignature();
    }

    /**
     * Returns a {@link Reference} to the root object, i.e., the 
     * receiver of the entry method of the execution.
     * 
     * @return A {@link Reference} to the root object in the heap 
     * of the current state, or {@code null} if the root method is static.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Reference getRootObjectReference() 
    throws ThreadStackEmptyException, FrozenStateException {
        final Frame rootFrame = getRootFrame();
        final Signature rootMethodSignature = getRootMethodSignature();
        try {
            if (rootFrame.getCurrentClass().isMethodStatic(rootMethodSignature)) {
                return null;
            } else {
                try {
                    return (Reference) rootFrame.getLocalVariableValue(ROOT_THIS_SLOT);
                } catch (InvalidSlotException e) {
                    //this should never happen
                    throw new UnexpectedInternalException(e);
                }
            }
        } catch (MethodNotFoundException e) {
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Returns the name of a local variable in the current frame 
     * as declared in the debug information of the class.
     *  
     * @param slot the number of the slot of a local variable.
     * @return a {@link String} containing the name of the local
     *         variable at {@code slot} as from the available debug 
     *         information, depending on the current program counter
     *         {@code curPC}, or {@code null} if no debug information is 
     *         available for the {@code (slot, curPC)} combination.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public String getLocalVariableDeclaredName(int slot) 
    throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getLocalVariableDeclaredName(slot);
    }

    /**
     * Returns the value of a local variable in the current frame.
     * 
     * @param slot an {@code int}, the slot of the local variable.
     * @return a {@link Value}.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws InvalidSlotException if {@code slot} is not a valid slot number.
     * @throws FrozenStateException if the state is frozen.
     */
    public Value getLocalVariableValue(int slot) throws ThreadStackEmptyException, InvalidSlotException, FrozenStateException {
        return getCurrentFrame().getLocalVariableValue(slot);
    }

    /**
     * Stores a value into a specific local variable of the current 
     * frame.
     * 
     * @param an {@code int}, the slot of the local variable.
     * @param item the {@link Value} to be stored.  
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws InvalidSlotException if {@code slot} is not a valid slot number.
     * @throws FrozenStateException if the state is frozen.
     */
    public void setLocalVariable(int slot, Value val) throws ThreadStackEmptyException, InvalidSlotException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        getCurrentFrame().setLocalVariableValue(slot, this.stack.currentFrame().getProgramCounter(), val);
    }


    /**
     * Tests whether a class is initialized.
     * 
     * @param classFile a {@link ClassFile}.
     * @return {@code true} iff the {@link State}'s static 
     *         store contains a {@link Klass} object for 
     *         {@link classFile}.
     */
    public boolean existsKlass(ClassFile classFile) {
        return this.staticMethodArea.contains(classFile);
    }


    /**
     * Tests whether a symbolic reference is resolved.
     * 
     * @param ref a {@link ReferenceSymbolic}.
     * @return {@code true} iff {@code ref} is resolved.
     *         Note that in the positive case either the 
     *         {@link State}'s heap contains an {@link Objekt}
     *         at the position indicated by {@code ref}, 
     *         or {@code ref} is resolved by null.
     * @throws NullPointerException if {@code ref == null}.
     */
    public boolean resolved(ReferenceSymbolic ref) {
        return this.pathCondition.resolved(ref);
    }

    /**
     * Returns the heap position associated to a resolved 
     * symbolic reference.
     * 
     * @param ref a {@link ReferenceSymbolic}. It must be 
     * {@link #resolved}{@code (reference) == true}.
     * @return a {@code long}, the heap position to which
     * {@code ref} has been resolved.
     * @throws NullPointerException if {@code ref == null}.
     */
    public long getResolution(ReferenceSymbolic ref) {
        return this.pathCondition.getResolution(ref);
    }

    /**
     * Tests whether a reference is null.
     * 
     * @param ref a {@link Reference}.
     * @return {@code true} iff {@code ref} is {@link Null}, 
     * or if is a symbolic reference resolved to null.
     * @throws NullPointerException if {@code ref == null}.
     */
    public boolean isNull(Reference ref) {
        if (ref instanceof ReferenceSymbolic) {
            final ReferenceSymbolic refS = (ReferenceSymbolic) ref;
            return (resolved(refS) && getResolution(refS) == jbse.mem.Util.POS_NULL);
        } else {
            return (ref == Null.getInstance());
        }
    }

    /**
     * Gets an object from the heap.
     * 
     * @param ref a {@link Reference}.
     * @return the {@link Objekt} referred to by {@code ref}, or 
     *         {@code null} if {@code ref} does not refer to 
     *         an object in the heap, i.e.
     *         <ul>
     *         <li>{@code ref} is {@link Null}, or</li> 
     *         <li>{@code ref} is concrete and its heap position is free, or</li> 
     *         <li>{@code ref} is symbolic and resolved to null, or</li> 
     *         <li>{@code ref} is symbolic and unresolved.</li>
     *         </ul>
     * @throws FrozenStateException if the state is frozen.
     * @throws NullPointerException if {@code ref == null}.
     */
    public Objekt getObject(Reference ref) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final Objekt retVal;
        if (ref.isSymbolic()) {
            final ReferenceSymbolic refSymbolic = (ReferenceSymbolic) ref;
            if (resolved(refSymbolic)) {
                final long pos = getResolution(refSymbolic);
                retVal = this.heap.getObject(pos);
            } else {
                retVal = null;
            }
        } else {
            final ReferenceConcrete refConcrete = (ReferenceConcrete) ref;
            final long pos = refConcrete.getHeapPosition();
            retVal = this.heap.getObject(pos);
        }
        return retVal;
    }

    /**
     * Gets a symbolic object as it was initially in this state.
     * 
     * @param origin a {@link ReferenceSymbolic}.
     * @return the symbolic {@link Objekt} whose origin is {@code origin} 
     *         in the state it was at its epoch (equivalently, at the
     *         moment of its assumption), or 
     *         {@code null} if {@code origin} does not refer to 
     *         anything (e.g., is {@link Null}, or is an unresolved 
     *         symbolic reference, or is resolved to null).
     * @throws FrozenStateException if the state is frozen.
     */
    //TODO eliminate this method!!!
    private Objekt getObjectInitial(ReferenceSymbolic origin) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}

        //TODO extract this code and share with DecisionProcedureAlgorithms.getPossibleAliases
        for (Clause c : this.pathCondition.getClauses()) {
            if (c instanceof ClauseAssumeExpands) {
                final ClauseAssumeExpands cExpands = (ClauseAssumeExpands) c;
                if (cExpands.getObjekt().getOrigin().equals(origin)) {
                    return cExpands.getObjekt();
                }
            }
        }
        return null;
    }

    /**
     * Returns the state's {@link ClassHierarchy}. 
     * 
     * @return a {@link ClassHierarchy}.
     */
    public ClassHierarchy getClassHierarchy() {
        return this.classHierarchy;
    }
    
    /**
     * Returns this {@link State}'s phase of symbolic execution.
     * 
     * @return a {@link Phase}.
     */
    public Phase phase() {
        return this.phase;
    }
    
    /**
     * Sets this state to its initial phase.
     * 
     * @throws FrozenStateException if the state is frozen.
     */
    public void setPhaseInitial() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.phase = Phase.INITIAL;
        setInitialHistoryPoint();
    }
    
    /**
     * Sets this state to its post-initizialization
     * phase.
     * 
     * @throws FrozenStateException if the state is frozen.
     */
    public void setPhasePostInitial() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.phase = Phase.POST_INITIAL;
    }

    /**
     * Returns the {@link Klass} object corresponding to 
     * a given class name.
     * 
     * @param classFile a {@link ClassFile}.
     * @return the {@link Klass} object corresponding to 
     *         the memory representation of the class 
     *         {@code classFile}, or {@code null} 
     *         if the class has not been initialized.
     * @throws FrozenStateException if the state is frozen.
     */
    public Klass getKlass(ClassFile classFile) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.staticMethodArea.get(classFile);
    }
    
    /**
     * Checks whether a {@link Signature} is linked to an 
     * adapter method. 
     * 
     * @param signature a {@link Signature}.
     * @return {@code true} iff {@code signature} is the
     *         signature of a method that has been previously
     *         linked to an adapter method.
     */
    public boolean isMethodLinked(Signature signature) {
        return this.linkInvokers.containsKey(signature);
    }

    /**
     * Links a signature polymorphic nonintrinsic method
     * to an adapter method, represented as a reference to
     * a {@link java.lang.invoke.MemberName}.
     * 
     * @param signature a {@link Signature}. It should be 
     *        the signature of a signature polymorphic
     *        nonintrinsic method, but this is not checked.
     * @param invoker a {@link ReferenceConcrete}. It should
     *        refer an {@link Instance} of a {@link java.lang.invoke.MemberName},
     *        but this is not checked.
     * @param appendix a {@link ReferenceConcrete}. It should
     *        refer an {@link Instance} of a {@link java.lang.Object[]},
     *        but this is not checked.
     * @throws FrozenStateException if the state is frozen.
     * @throws NullPointerException if {@code signature == null || invoker == null || appendix == null}.
     */
    public void link(Signature signature, ReferenceConcrete invoker, ReferenceConcrete appendix) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (signature == null || invoker == null || appendix == null) {
            throw new NullPointerException(); //TODO throw better exception
        }
        this.linkInvokers.put(signature, invoker);
        this.linkAppendices.put(signature, appendix);
    }
    
    /**
     * Returns the adapter method for a linked signature 
     * polymorphic nonintrinsic method.
     * 
     * @param signature a {@link Signature}.
     * @return a {@link ReferenceConcrete} to a {@code java.lang.invoke.MemberName}
     *         set with a previous call to {@link #link(Signature, ReferenceConcrete, ReferenceConcrete) link}, 
     *         or {@code null} if {@code signature} was not previously linked.
     */
    public ReferenceConcrete getAdapter(Signature signature) {
        return this.linkInvokers.get(signature);
    }
    
    /**
     * Returns the appendix for a linked signature 
     * polymorphic nonintrinsic method.
     * 
     * @param signature a {@link Signature}.
     * @return a {@link ReferenceConcrete} to an {@code Object[]}
     *         set with a previous call to {@link #link(Signature, ReferenceConcrete, ReferenceConcrete) link}, 
     *         or {@code null} if {@code signature} was not previously linked.
     */
    public ReferenceConcrete getAppendix(Signature signature) {
        return this.linkAppendices.get(signature);
    }
    
    /**
     * Returns the file stream associated to a open file descriptor.
     * 
     * @param descriptor an {@code int}.
     * @return a {@link FileInputStream} of a {@link FileOutputStream}, or
     *         {@code null} if {@code descriptor} is not the descriptor
     *         of an open file previously associated with a call to {@link #setFile(int, Object)}.
     * @throws FrozenStateException if the state is frozen.
     */
    public Object getFile(int descriptor) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.files.get(Integer.valueOf(descriptor));
    }
    
    /**
     * Associates a file stream to an open file descriptor.
     * 
     * @param descriptor an {@code int}, the descriptor of an open file.
     * @param fileStream a {@link FileInputStream} or a {@link FileOutputStream} 
     *        (if it is not an instance of one of these types the method does
     *        nothing).
     * @throws FrozenStateException if the state is frozen.
     */
    public void setFile(int descriptor, Object fileStream) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (fileStream instanceof FileInputStream || fileStream instanceof FileOutputStream) {
            this.files.put(Integer.valueOf(descriptor), fileStream);
        }
    }
    
    /**
     * Removes an open file descriptor and its associated file stream.
     * 
     * @param descriptor an {@code int}, the open file descriptor to remove
     *        (if it is not a previously associated open file descriptor
     *        the method does nothing).
     * @throws FrozenStateException if the state is frozen.
     */
    public void removeFile(int descriptor) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.files.remove(Integer.valueOf(descriptor));
    }
    
    /**
     * Registers a raw memory block.
     * 
     * @param address a {@code long}, the base address of the memory block.
     * @param size a {@code long}, the size in bytes of the memory block.
     * @throws InvalidInputException if the state is frozen, or if 
     *         {@code address} is already a registered memory block base 
     *         address, or if {@code size <= 0}.
     */
    public void addMemoryBlock(long address, long size) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (this.allocatedMemory.containsKey(address)) {
            throw new InvalidInputException("Tried to add a raw memory block with an already known address.");
        }
        if (size <= 0) {
            throw new InvalidInputException("Tried to add a raw memory block with a nonpositive size.");
        }
        this.allocatedMemory.put(address, new MemoryBlock(address, size));
    }
    
    /**
     * Returns the base address of a memory block.
     * 
     * @param address a {@code long}, the address as known by this {@link State}
     *        (base-level address).
     * @return a {@code long}, the true base address of the memory block
     *         (meta-level address).
     * @throws InvalidInputException if {@code address} is not a memory block
     *         address previously registered by a call to {@link #addMemoryBlock(long, long) addMemoryBlock}.
     */
    public long getMemoryBlockAddress(long address) throws InvalidInputException {
        if (!this.allocatedMemory.containsKey(address)) {
            throw new InvalidInputException("Tried to get the address of a raw memory block corresponding to an unknown (base-level) address.");
        }
        return this.allocatedMemory.get(address).address;
    }

    /**
     * Returns the size of a memory block.
     * 
     * @param address a {@code long}, the address as known by this {@link State}
     *        (base-level address).
     * @return a {@code long}, the size in bytes of the memory block.
     * @throws InvalidInputException if {@code address} is not a memory block
     *         address previously registered by a call to {@link #addMemoryBlock(long, long) addMemoryBlock}.
     */
    public long getMemoryBlockSize(long address) throws InvalidInputException {
        if (!this.allocatedMemory.containsKey(address)) {
            throw new InvalidInputException("Tried to get the size of a raw memory block corresponding to an unknown (base-level) address.");
        }
        return this.allocatedMemory.get(address).size;
    }

    /**
     * Removes the registration of a memory block.
     * 
     * @param address a {@code long}, the address as known by this {@link State}
     *        (base-level address).
     * @throws InvalidInputException if the state is frozen, or if {@code address} 
     *         is not a memory block address previously registered by a call to 
     *         {@link #addMemoryBlock(long, long) addMemoryBlock}.
     */
    public void removeMemoryBlock(long address) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.allocatedMemory.containsKey(address)) {
            throw new InvalidInputException("Tried to remove a raw memory block corresponding to an unknown (base-level) address.");
        }
        this.allocatedMemory.remove(address);
    }
    
    /**
     * Adds a zip file.
     * 
     * @param jzfile a {@code long}, the address of a jzfile C data structure
     *        for the open zip file.
     * @param name a {@link String}, the name of the file.
     * @param mode an {@code int}, the mode this zip file was opened.
     * @param lastModified a {@code long}, when this zip file was last modified.
     * @param usemmap a {@code boolean}, whether mmap was used when this zip file
     *        was opened.
     * @throws InvalidInputException if the state is frozen, or 
     *         {@code jzfile} was already added before, or
     *         {@code name == null}.
     */
    public void addZipFile(long jzfile, String name, int mode, long lastModified, boolean usemmap) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (this.zipFiles.containsKey(jzfile)) {
            final ZipFile zf = this.zipFiles.get(jzfile);
            if (zf.name.equals(name) && zf.lastModified == lastModified) {
                //already opened, zlib reuses the allocated C data structure
                return;
            } else {
                throw new InvalidInputException("Tried to add a zipfile with an already existing jzfile address.");
            }
        }
        if (name == null) {
            throw new InvalidInputException("Tried to add a zip file with null name.");
        }
        final ZipFile zf = new ZipFile(jzfile, name, mode, lastModified, usemmap);
        this.zipFiles.put(jzfile, zf);
    }
    
    /**
     * Adds a zip file entry.
     * 
     * @param jzentry a {@code long}, the address of a jzentry C data structure
     *        for the open zip file entry.
     * @param jzfile a {@code long}, a jzfile address as known by this {@link State}
     *        (base-level address).
     * @param name a {@code byte[]}, the name of the entry.
     * @throws InvalidInputException if the state is frozen, or {@code jzfile} was 
     *         not added before by a call to
     *         {@link #addZipFile(long, String, int, long, boolean) addZipFile}, or
     *         {@code jzentry} was already added before, or
     *         {@code name == null}.
     */
    public void addZipFileEntry(long jzentry, long jzfile, byte[] name) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.zipFiles.containsKey(jzfile)) {
            throw new InvalidInputException("Tried to add a zip file entry for an unknown zip file.");
        }
        if (this.zipFileEntries.containsKey(jzentry)) {
            throw new InvalidInputException("Tried to add an already existing zip file entry.");
        }
        if (name == null) {
            throw new InvalidInputException("Tried to add a zip file entry with null name.");
        }
        final ZipFileEntry zfe = new ZipFileEntry(jzentry, jzfile, name);
        this.zipFileEntries.put(jzentry, zfe);
    }
    
    /**
     * Checks whether an open zip file exists.
     * 
     * @param jzfile a {@code long}, the address of a jzentry C data structure
     *        as known by this {@link State} (base-level address).
     * @return {@code true} iff {@code jzfile} was added before by a call to
     *         {@link #addZipFile(long, String, int, long, boolean) addZipFile}.
     */
    public boolean hasZipFile(long jzfile) {
        return this.zipFiles.containsKey(jzfile);
    }
    
    /**
     * Checks whether an address of a jzentry C structure is present.
     * 
     * @param jzentry a {@code long}.
     * @return {@code true} iff {@code jzentry} is the true address of 
     *         a jzfile C structure (meta-level address).
     */
    public boolean hasZipFileEntryJzInverse(long jzentry) {
        for (ZipFileEntry entry : this.zipFileEntries.values()) {
            if (entry.jzentry == jzentry) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Gets the base-level address of a jzentry C structure.
     * 
     * @param jzentry a {@code long}, the  address of a jzfile C structure
     *         (meta-level address).
     * @return a {@code long}, the base-level address corresponding to
     *         {@code jzentry}.
     * @throws InvalidInputException if {@code jzentry} is not the address
     *         of a jzentry data structure.
     */
    public long getZipFileEntryJzInverse(long jzentry) throws InvalidInputException {
        for (Map.Entry<Long, ZipFileEntry> entry : this.zipFileEntries.entrySet()) {
            if (entry.getValue().jzentry == jzentry) {
                return entry.getKey();
            }
        }
        throw new InvalidInputException("Tried to invert an unknown jzentry C structure address.");
    }
    
    /**
     * Gets the address of a jzfile C structure.
     * 
     * @param jzfile a {@code long}, the address as known by this {@link State} 
     *        (base-level address).
     * @return a {@code long}, the true address of the jzfile C structure
     *         (meta-level address).
     * @throws InvalidInputException if {@code jzfile} was not added before by a call to
     *         {@link #addZipFile(long, String, int, long, boolean) addZipFile}.
     */
    public long getZipFileJz(long jzfile) throws InvalidInputException {
        if (!this.zipFiles.containsKey(jzfile)) {
            throw new InvalidInputException("Tried to get a jzfile for an unknown zip file.");
        }
        return this.zipFiles.get(jzfile).jzfile;
    }
    
    /**
     * Gets the address of a jzentry C structure.
     * 
     * @param jzentry a {@code long}, the address as known by this {@link State} 
     *        (base-level address).
     * @return a {@code long}, the true address of the jzentry C structure
     *         (meta-level address).
     * @throws InvalidInputException if {@code jzentry} was not added before by a call to
     *         {@link #addZipFileEntry(long, long, byte[]) addZipFileEntry}.
     */
    public long getZipFileEntryJz(long jzentry) throws InvalidInputException {
        if (!this.zipFileEntries.containsKey(jzentry)) {
            throw new InvalidInputException("Tried to get a jzentry for an unknown zip file entry.");
        }
        return this.zipFileEntries.get(jzentry).jzentry;
    }
    
    /**
     * Removes a zip file and all its associated entries.
     * 
     * @param jzfile a {@code long}, the address of a jzfile C structure as known 
     *        by this {@link State} (base-level address).
     * @throws InvalidInputException if the state is frozen, or {@code jzfile} was 
     *         not added before by a call to
     *         {@link #addZipFile(long, String, int, long, boolean) addZipFile}.
     */
    public void removeZipFile(long jzfile) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.zipFiles.containsKey(jzfile)) {
            throw new InvalidInputException("Tried to remove an unknown zip file.");
        }
        this.zipFiles.remove(jzfile);
        final HashSet<Long> toRemove = new HashSet<>();
        for (Map.Entry<Long, ZipFileEntry> entry : this.zipFileEntries.entrySet()) {
            if (entry.getValue().jzfile == jzfile) {
                toRemove.add(entry.getKey());
            }
        }
        for (long jzentry : toRemove) {
            this.zipFileEntries.remove(jzentry);
        }
    }
    
    /**
     * Removes a zip file entry.
     * 
     * @param jzentry a {@code long}, the address of a jzentry C structure as known 
     *        by this {@link State} (base-level address).
     * @throws InvalidInputException if the state is frozen, or {@code jzentry} 
     *         was not added before by a call to
     *         {@link #addZipFileEntry(long, long, byte[]) addZipFileEntry}.
     */
    public void removeZipFileEntry(long jzentry) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.zipFileEntries.containsKey(jzentry)) {
            throw new InvalidInputException("Tried to remove an unknown zip file entry.");
        }
        this.zipFileEntries.remove(jzentry);
    }
    
    /**
     * Registers an inflater.
     * 
     * @param address a {@code long}, the address of an inflater block.
     * @param nowrap a {@code boolean}, the {@code nowrap} parameter 
     *        to {@link java.util.zip.Inflater#init(boolean)}.
     * @throws InvalidInputException if the state is frozen, or 
     *         {@code address} was already registered.
     */
    public void addInflater(long address, boolean nowrap) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (this.inflaters.containsKey(address)) {
            throw new InvalidInputException("Tried to add an already registered inflater block address.");
        }
        final Inflater inflater = new Inflater(address, nowrap);
        this.inflaters.put(address, inflater);
    }
    
    /**
     * Gets the address of an inflater block.
     * 
     * @param address a {@code long}, the address of an inflater block
     *        as known by this state (base-level address).
     * @return a {@code long}, the true address of the inflater block
     *         (meta-level address).
     * @throws InvalidInputException  if {@code address} was not previously
     *         registered.
     */
    public long getInflater(long address) throws InvalidInputException {
        if (!this.inflaters.containsKey(address)) {
            throw new InvalidInputException("Tried to get the address of an unknown inflater.");
        }
        return this.inflaters.get(address).address;
    }
    
    /**
     * Stores the dictionary of an inflater.
     * 
     * @param address a {@code long}, the address of an inflater block
     *        as known by this state (base-level address).
     * @param dictionary a {@code byte[]} containing the dictionary.
     * @param ofst a {@code int}, the offset in {@code dictionary}
     *        where the dictionary starts.
     * @param len a {@code int}, the length of the dictionary.
     * @throws InvalidInputException if the state is frozen, or 
     *         {@code address} was not previously
     *         registered, or {@code dictionary == null}, or {@code ofst < 0}, 
     *         or {@code len < 0}, or {@code ofst >= dictionary.length}, or
     *         {@code ofst + len > dictionary.length}.
     */
    public void setInflaterDictionary(long address, byte[] dictionary, int ofst, int len) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.inflaters.containsKey(address)) {
            throw new InvalidInputException("Tried to set the dictionary of an unknown inflater.");
        }
        if (dictionary == null || ofst < 0 || len < 0 || ofst >= dictionary.length || ofst + len > dictionary.length) {
            throw new InvalidInputException("Tried to set the dictionary of an inflater with wrong dictionary, offset or length.");
        }
        final Inflater inflaterOld = this.inflaters.get(address);
        final Inflater inflaterNew = new Inflater(inflaterOld.address, inflaterOld.nowrap, dictionary, ofst, len);
        this.inflaters.put(address, inflaterNew);
    }
    
    /**
     * Removes a registered inflater.
     * 
     * @param address a {@code long}, the address of an inflater block
     *        as known by this state (base-level address).
     * @throws InvalidInputException if the state is frozen, or 
     *         {@code address} was not previously registered.
     */
    public void removeInflater(long address) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.inflaters.containsKey(address)) {
            throw new InvalidInputException("Tried to remove an unknown inflater.");
        }
        this.inflaters.remove(address);
    }
    
    /**
     * Registers a performance counter.
     * 
     * @param name a {@code String}, the name of the performance counter.
     * @throws InvalidIndexException if the state is frozen, or 
     *         {@code name} is already registered.
     */
    public void registerPerfCounter(String name) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (this.perfCounters.contains(name)) {
            throw new InvalidInputException("Tried to register the performance counter " + name + " twice.");
        }
        this.perfCounters.add(name);
    }

    /**
     * Creates a new {@link Array} of a given class in the heap of 
     * the state.
     * 
     * @param initValue
     *        a {@link Value} for initializing the array; if {@code initValue == null}
     *        the default value for the array member type is used for initialization.
     * @param length
     *        the number of elements in the array.
     * @param arrayClass
     *        a {@link ClassFile}, the class of the array object.
     * @return a new  {@link ReferenceConcrete} to the newly created object.
     * @throws InvalidTypeException if {@code arrayClass} is invalid.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws FrozenStateException if the state is frozen.
     */
    public ReferenceConcrete createArray(Value initValue, Primitive length, ClassFile arrayClass) 
    throws InvalidTypeException, HeapMemoryExhaustedException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final ArrayImpl a = new ArrayImpl(false, this.calc, false, initValue, length, arrayClass, null, this.historyPoint, false, this.maxSimpleArrayLength);
        final ReferenceConcrete retVal = new ReferenceConcrete(this.heap.addNew(a));
        initIdentityHashCodeConcrete(a, retVal);
        return retVal;
    }

    /**
     * Creates a new {@link Instance} of a given class in the 
     * heap of the state. The {@link Instance}'s fields are initialized 
     * with the default values for each field's type.
     * It cannot create instances of the {@code java.lang.Class} class.
     * 
     * @param classFile the {@link ClassFile} for the class of the new object.
     * @return a {@link ReferenceConcrete} to the newly created object.
     * @throws FrozenStateException if the state is frozen.
     * @throws InvalidInputException if {@code classFile == null} or is 
     *         invalid, i.e., is the classfile for {@code java.lang.Class}.
     * @throws HeapMemoryExhaustedException if the heap is full.
     */
    public ReferenceConcrete createInstance(ClassFile classFile) 
    throws FrozenStateException, InvalidInputException, HeapMemoryExhaustedException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (classFile == null) {
            throw new InvalidInputException("Invoked method " + getClass().getName() + ".createInstance with null ClassFile classFile parameter.");
        }
        if (JAVA_CLASS.equals(classFile.getClassName())) {
            //use createInstance_JAVA_CLASS instead
            throw new InvalidInputException("Cannot use method " + getClass().getName() + ".createInstance to create an instance of java.lang.Class.");
        }
        
        final InstanceImpl myObj = doCreateInstance(classFile);
        final ReferenceConcrete retVal = new ReferenceConcrete(this.heap.addNew(myObj));
        if (myObj instanceof Instance_JAVA_CLASSLOADER) {
            this.classLoaders.add(retVal);
        }
        initIdentityHashCodeConcrete(myObj, retVal);
        return retVal;
    }
    
    /**
     * Creates a new {@link Instance} of a given class in the 
     * heap of the state. It differs from {@link #createInstance(String)}
     * because this method does not check whether the heap memory 
     * was exhausted. Use it only to throw critical errors.
     * 
     * @param classFile the {@link ClassFile} for the class of the new object.
     * @return a {@link ReferenceConcrete} to the newly created object.
     * @throws FrozenStateException if the state is frozen.
     * @throws InvalidInputException if {@code classFile == null} or is 
     *         invalid, i.e., is the classfile for {@code java.lang.Class}, 
     *         or for a subclass of {@code java.lang.ClassLoader}, or 
     *         for a subclass of {@code java.lang.Thread}.
     */
    public ReferenceConcrete createInstanceSurely(ClassFile classFile) 
    throws FrozenStateException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (classFile == null) {
            throw new InvalidInputException("Invoked method " + getClass().getName() + ".createInstanceSurely with null ClassFile classFile parameter.");
        }
        if (JAVA_CLASS.equals(classFile.getClassName())) {
            //cannot be used for that
            throw new InvalidInputException("Cannot use method " + getClass().getName() + ".createInstanceSurely to create an instance of java.lang.Class.");
        }
        final ClassFile cf_JAVA_CLASSLOADER;
        final ClassFile cf_JAVA_THREAD;
        try {
            cf_JAVA_CLASSLOADER = this.classHierarchy.loadCreateClass(JAVA_CLASSLOADER);
            cf_JAVA_THREAD = this.classHierarchy.loadCreateClass(JAVA_THREAD);
        } catch (ClassFileNotFoundException | ClassFileIllFormedException | BadClassFileVersionException | 
                 WrongClassNameException | IncompatibleClassFileException |
                 InvalidInputException | ClassFileNotAccessibleException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        if (classFile.isSubclass(cf_JAVA_CLASSLOADER) || classFile.isSubclass(cf_JAVA_THREAD)) {
            //cannot be used for that
            throw new InvalidInputException("Cannot use method " + getClass().getName() + ".createInstanceSurely to create an instance of (a subclass of) java.lang.Classloader or java.lang.Thread.");
        }
        
        final InstanceImpl myObj = doCreateInstance(classFile);
        final ReferenceConcrete retVal = new ReferenceConcrete(this.heap.addNewSurely(myObj));
        initIdentityHashCodeConcrete(myObj, retVal);
        return retVal;
    }
    
    private InstanceImpl doCreateInstance(ClassFile classFile) {
        final Signature[] fieldsSignatures = this.classHierarchy.getAllFields(classFile);
        final int numOfStaticFields = this.classHierarchy.numOfStaticFields(classFile);
        final ClassFile cf_JAVA_CLASSLOADER;
        final ClassFile cf_JAVA_THREAD;
        try {
            cf_JAVA_CLASSLOADER = this.classHierarchy.loadCreateClass(JAVA_CLASSLOADER);
            cf_JAVA_THREAD = this.classHierarchy.loadCreateClass(JAVA_THREAD);
        } catch (ClassFileNotFoundException | ClassFileIllFormedException | BadClassFileVersionException | 
                 WrongClassNameException | IncompatibleClassFileException |
                 InvalidInputException | ClassFileNotAccessibleException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        try {
            if (classFile.isSubclass(cf_JAVA_CLASSLOADER)) {
                return new InstanceImpl_JAVA_CLASSLOADER(this.calc, classFile, null, this.historyPoint, this.nextClassLoaderIdentifier++, numOfStaticFields, fieldsSignatures);
            } else if (classFile.isSubclass(cf_JAVA_THREAD)) {
                return new InstanceImpl_JAVA_THREAD(this.calc, classFile, null, this.historyPoint, numOfStaticFields, fieldsSignatures);
            } else {
                return new InstanceImpl(false, this.calc, classFile, null, this.historyPoint, numOfStaticFields, fieldsSignatures);
            }
        } catch (InvalidTypeException | InvalidInputException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Creates a new {@link Instance} of {@code java.lang.Class} in the 
     * heap of the state (more precisely, creates a {@link Instance_JAVA_CLASS}).
     * Its fields are initialized with the default values for each 
     * field's type (which should not be a problem since all the fields are transient).
     * 
     * @param representedClass the {@link ClassFile} of the class the new {@code Instance_JAVA_CLASS}
     *        must represent.
     * @return a {@link ReferenceConcrete} to the newly created object.
     * @throws HeapMemoryExhaustedException if the heap is full.
     */
    private ReferenceConcrete createInstance_JAVA_CLASS(ClassFile representedClass) 
    throws HeapMemoryExhaustedException {
        try {
            final ClassFile cf_JAVA_CLASS = this.classHierarchy.getClassFileClassArray(CLASSLOADER_BOOT, JAVA_CLASS);
            if (cf_JAVA_CLASS == null) {
                throw new UnexpectedInternalException("Could not find the classfile for java.lang.Class.");
            }
            final int numOfStaticFields = this.classHierarchy.numOfStaticFields(cf_JAVA_CLASS);
            final Signature[] fieldsSignatures = this.classHierarchy.getAllFields(cf_JAVA_CLASS);
            final InstanceImpl_JAVA_CLASS myObj = new InstanceImpl_JAVA_CLASS(this.calc, cf_JAVA_CLASS, null, this.historyPoint, representedClass, numOfStaticFields, fieldsSignatures);
            final ReferenceConcrete retVal = new ReferenceConcrete(this.heap.addNew(myObj));
            
            //initializes the fields of the new instance: The only
            //field we need to init is classLoader, see
            //hotspot:src/share/vm/classfile/javaClasses.cpp:572 
            //(function java_lang_Class::create_mirror), where the
            //only place where a field of the java.lang.Object is
            //set is at line 630. There are also some injected fields,
            //that can be found at
            //hotspot:src/share/vm/classfile/javaClasses.cpp:218
            //among which we have the represented class, the list of the 
            //static fields of the represented class, and the protection domain.
            //We chose to store the represented class as a meta-level field
            //rather than a base-level field as done by Hotspot, so we can
            //represent the missing stuff as, e.g., the protection domain 
            //the same way.
            
            //hash code
            initIdentityHashCodeConcrete(myObj, retVal);
            
            //class loader
            final int classLoader = (representedClass.isAnonymousUnregistered() ? CLASSLOADER_BOOT : representedClass.getDefiningClassLoader()); //Instance_JAVA_CLASS for anonymous classfiles have the classloader field set to null
            myObj.setFieldValue(JAVA_CLASS_CLASSLOADER, this.classLoaders.get(classLoader));
            
            return retVal;
        } catch (InvalidTypeException e) {
            //this should never happen
            throw new UnexpectedInternalException(e); //TODO do something better?
        }
    }

    /**
     * Creates a concrete {@link Klass} object and puts it in the 
     * static area of this state. It does not initialize the constant 
     * fields nor loads on the stack of the state the frames for the
     * {@code <clinit>} methods. It does not create {@link Klass} objects
     * for superclasses. If the {@link Klass} already exists it does nothing.
     * 
     * @param classFile the {@link ClassFile} of the class for which
     *        the {@link Klass} object must be created. The method 
     *        creates a {@link Klass} object only for {@code classFile}, 
     *        not for its superclasses in the hierarchy.
     * @throws FrozenStateException if the state is frozen.
     * @throws InvalidInputException if {@code classFile == null}.
     */
    public void ensureKlass(ClassFile classFile) 
    throws FrozenStateException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (classFile == null) {
            throw new InvalidInputException("Invoked method " + getClass().getName() + ".ensureKlass with null ClassFile classFile parameter.");
        }
        if (existsKlass(classFile)) {
            return;
        }
        final int numOfStaticFields = this.classHierarchy.numOfStaticFields(classFile);
        final Signature[] fieldsSignatures = this.classHierarchy.getAllFields(classFile);
        final KlassImpl k = new KlassImpl(false, this.calc, null, this.historyPoint, numOfStaticFields, fieldsSignatures);
        k.setIdentityHashCode(this.calc.valInt(0)); //doesn't care because it is not used
        this.staticMethodArea.set(classFile, k);
    }

    /**
     * Creates a symbolic {@link Klass} object and puts it in the 
     * static area of this state. It does not initialize the constant 
     * fields. It does not create {@link Klass} objects
     * for superclasses. If the {@link Klass} already exists it 
     * does nothing.
     * 
     * @param classFile the {@link ClassFile} of the class for which
     *        the {@link Klass} object must be created. The method 
     *        creates a {@link Klass} object only for {@code classFile}, 
     *        not for its superclasses in the hierarchy.
     * @throws FrozenStateException if the state is frozen.
     * @throws InvalidInputException if {@code classFile == null}.
     * @throws InvalidIndexException if the access to the class 
     *         constant pool fails.
     */
    public void ensureKlassSymbolic(ClassFile classFile) 
    throws FrozenStateException, InvalidInputException, InvalidIndexException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (classFile == null) {
            throw new InvalidInputException("Invoked method " + getClass().getName() + ".ensureKlassSymbolic with null ClassFile classFile parameter.");
        }
        if (existsKlass(classFile)) {
            return;
        }
        final int numOfStaticFields = this.classHierarchy.numOfStaticFields(classFile);
        final Signature[] fieldsSignatures = this.classHierarchy.getAllFields(classFile);
        final KlassImpl k = new KlassImpl(true, this.calc, createSymbolKlassPseudoReference(this.lastPreInitialHistoryPoint, classFile), this.lastPreInitialHistoryPoint, numOfStaticFields, fieldsSignatures);
        try {
        	initWithSymbolicValues(k);
        } catch (NullPointerException e) {
        	//this should never happen
        	throw new UnexpectedInternalException(e);
        }
        k.setIdentityHashCode(this.calc.valInt(0)); //doesn't care because it is not used
        this.staticMethodArea.set(classFile, k);
    }

    /**
     * Creates a new {@link Objekt} of a given class in the heap of 
     * the state. The {@link Objekt}'s fields are initialized with symbolic 
     * values.
     *  
     * @param classFile a {@link ClassFile} for either an object or an array class.
     * @param origin a {@link ReferenceSymbolic}, the origin of the object.
     * @return a {@code long}, the position in the heap of the newly 
     *         created object.
     * @throws NullPointerException if {@code origin} is {@code null}.
     * @throws InvalidTypeException if {@code classFile} is invalid.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws CannotAssumeSymbolicObjectException if {@code type} is
     *         a class that cannot be assumed to be symbolic
     *         (currently {@code java.lang.Class} and {@code java.lang.ClassLoader}).
     * @throws FrozenStateException if the state is frozen.
     */
    private long createObjectSymbolic(ClassFile classFile, ReferenceSymbolic origin) 
    throws InvalidTypeException, HeapMemoryExhaustedException, 
    CannotAssumeSymbolicObjectException, FrozenStateException {
        if (origin == null) {
            throw new NullPointerException(); //TODO improve?
        }
        final ObjektImpl myObj;
        if (classFile.isArray()) {
            try {
                final ArrayImpl backingArray = newArraySymbolic(classFile, origin, true);
                final long posBackingArray = this.heap.addNew(backingArray);
                final ReferenceConcrete refToBackingArray = new ReferenceConcrete(posBackingArray);
                myObj = new ArrayImpl(refToBackingArray, backingArray);
                initIdentityHashCodeSymbolic(myObj);
            } catch (InvalidOperandException | InvalidTypeException | NullPointerException | InvalidInputException e) {
                //this should never happen
                throw new UnexpectedInternalException(e);
            }
        } else if (classFile.isReference()) {
            try {
                myObj = newInstanceSymbolic(classFile, origin);
            } catch (InvalidTypeException | InvalidInputException e) {
                //this should never happen
                throw new UnexpectedInternalException(e);
            }
        } else {
            throw new InvalidTypeException("Attempted to create a symbolic object with type " + classFile.getClassName() + ".");
        }
        final long pos = this.heap.addNew(myObj);
        return pos;
    }

    private ArrayImpl newArraySymbolic(ClassFile arrayClass, ReferenceSymbolic origin, boolean isInitial) 
    throws InvalidTypeException, FrozenStateException {
        final Primitive length = (Primitive) createSymbolMemberArrayLength(origin);
        final ArrayImpl obj = new ArrayImpl(true, this.calc, true, null, length, arrayClass, origin, origin.historyPoint(), isInitial, this.maxSimpleArrayLength);
        try {
			initIdentityHashCodeSymbolic(obj);
		} catch (InvalidInputException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
		}
        return obj;
    }
    
    /**
     * Checks whether a class cannot be executed symbolically. 
     * JBSE forbids symbolic execution of (the methods in)
     * some standard classes. Currently these classes are
     * {@code java.lang.Class} and all the subclasses of 
     * {@code java.lang.ClassLoader}.
     * 
     * @param className a {@link String}.
     * @return {@code true} iff the class cannot be executed
     *         symbolically. 
     * @throws InvalidInputException if {@code classFile == null}.
     */
    public boolean cannotExecuteSymbolically(ClassFile classFile) throws InvalidInputException {
    	if (classFile == null) {
    		throw new InvalidInputException("Invoked method " + getClass().getName() + ".cannotExecuteSymbolically with null ClassFile classFile parameter.");
    	}
    	if (JAVA_CLASS.equals(classFile.getClassName())) {
    		return true;
    	}
        final ClassFile cf_JAVA_CLASSLOADER;
        try {
            cf_JAVA_CLASSLOADER = this.classHierarchy.loadCreateClass(JAVA_CLASSLOADER);
        } catch (ClassFileNotFoundException | ClassFileIllFormedException | BadClassFileVersionException | 
                 WrongClassNameException | IncompatibleClassFileException |
                 InvalidInputException | ClassFileNotAccessibleException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
    	if (classFile.isSubclass(cf_JAVA_CLASSLOADER)) {
    		return true;
    	}
    	
    	return false;
    }

    private InstanceImpl newInstanceSymbolic(ClassFile classFile, ReferenceSymbolic origin) 
    throws CannotAssumeSymbolicObjectException, InvalidTypeException, InvalidInputException {
        if (cannotExecuteSymbolically(classFile)) {
            throw new CannotAssumeSymbolicObjectException("JBSE does not allow to execute symbolically the methods of class " + classFile.getClassName() + ".");
        }
        final int numOfStaticFields = this.classHierarchy.numOfStaticFields(classFile);
        final Signature[] fieldsSignatures = this.classHierarchy.getAllFields(classFile);
        final InstanceImpl obj = new InstanceImpl(true, this.calc, classFile, origin, origin.historyPoint(), numOfStaticFields, fieldsSignatures);
        try {
        	initWithSymbolicValues(obj);
        } catch (NullPointerException e) {
        	//this should never happen
        	throw new UnexpectedInternalException(e);
        }
        initIdentityHashCodeSymbolic(obj);
        return obj;
    }

    /**
     * Initializes an {@link Objekt} with symbolic values.
     * 
     * @param myObj an {@link Objekt} which will be initialized with 
     *              symbolic values.
	 * @throws NullPointerException if {@code myObj} is not a symbolic object (i.e., it has
	 *         no origin).
     */
    private void initWithSymbolicValues(Objekt myObj) {
        for (final Signature fieldSignature : myObj.getStoredFieldSignatures()) {
            //gets the field signature and name
            final String fieldClass = fieldSignature.getClassName();
            final String fieldType = fieldSignature.getDescriptor();
            final String fieldName = fieldSignature.getName();

            //builds a symbolic value from signature and name 
            //and assigns it to the field
            try {
                myObj.setFieldValue(fieldSignature, 
                                    (Value) createSymbolMemberField(fieldType, myObj.getOrigin(), fieldName, fieldClass));
            } catch (InvalidTypeException | InvalidInputException e) {
                //this should never happen
                throw new UnexpectedInternalException(e);
            }
        }
    }

    /**
     * Initializes the identity hash code of an {@link Objekt} with a concrete value, 
     * the heap position of the object.
     * 
     * @param myObj the {@link Objekt} whose identity hash code will be initialized.
     * @param myRef a {@link ReferenceConcrete} to {@code myObj}.
     */
    //TODO delete - all the objects should have a symbolic identity hash code for genericity (currently this does not play well with hash maps and thus with all the JVM bootstrap code).
    private void initIdentityHashCodeConcrete(Objekt myObj, ReferenceConcrete myRef) {
        myObj.setIdentityHashCode(this.calc.valInt((int) myRef.getHeapPosition()));
    }
    
    /**
     * Initializes the identity hash code of a symbolic {@link Objekt} with a symbolic 
     * value.
     * 
     * @param myObj the symbolic {@link Objekt} whose identity hash code will be initialized.
     * @throws InvalidInputException  if the state is frozen or {@code object == null}, or {@code object} has
	 *         both its origin and its history point set to {@code null} (note that in 
	 *         such case {@code object} is ill-formed).
     */
    private void initIdentityHashCodeSymbolic(Objekt myObj) throws InvalidInputException {
        myObj.setIdentityHashCode(createSymbolIdentityHashCode(myObj));
    }

    /**
     * Checks if there is a string literal in this state's heap.
     * 
     * @param stringLit a {@link String} representing a string literal.
     * @return {@code true} iff there is a {@link Instance} in 
     *         this state's {@link Heap} corresponding to {@code stringLit}.
     */
    public boolean hasStringLiteral(String stringLit) {
        return this.stringLiterals.containsKey(stringLit);
    }

    /**
     * Returns a {@link ReferenceConcrete} to a {@code java.lang.String} 
     * corresponding to a string literal. 
     * 
     * @param stringLit a {@link String} representing a string literal.
     * @return a {@link ReferenceConcrete} to the {@link Instance} in 
     *         this state's {@link Heap} corresponding to 
     *         {@code stringLit}, or {@code null} if such instance does not
     *         exist. 
     */
    public ReferenceConcrete referenceToStringLiteral(String stringLit) {
        return this.stringLiterals.get(stringLit);
    }

    /**
     * Creates an {@link Instance} of class {@code java.lang.String} 
     * in this state's heap corresponding to a string literal sidestepping 
     * the constructors of {@code java.lang.String} to avoid incredible 
     * circularity issues with string constant fields. Does not
     * manage the creation of the {@link Klass} for {@code java.lang.String}
     * and for the classes of the members of the created object. 
     * If the literal already exists, does nothing.
     * 
     * @param stringLit a {@link String} representing a string literal.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws FrozenStateException if the state is frozen.
     */
    public void ensureStringLiteral(String stringLit) throws HeapMemoryExhaustedException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (stringLit == null) {
            throw new NullPointerException("null parameter passed to " + State.class.getName() + ".ensureStringLiteral");
        }
        if (hasStringLiteral(stringLit)) {
            return;
        }

        try {
            final ReferenceConcrete value = createArrayOfChars(stringLit);
            final Simplex hash = this.calc.valInt(stringLit.hashCode());
            final ClassFile cf_JAVA_STRING = this.classHierarchy.getClassFileClassArray(CLASSLOADER_BOOT, JAVA_STRING);
            if (cf_JAVA_STRING == null) {
                throw new UnexpectedInternalException("Could not find classfile for type java.lang.String.");
            }
            final ReferenceConcrete retVal = createInstance(cf_JAVA_STRING);
            final Instance i = (Instance) getObject(retVal);
            i.setFieldValue(JAVA_STRING_VALUE,  value);
            i.setFieldValue(JAVA_STRING_HASH,   hash);
            this.stringLiterals.put(stringLit, retVal);
        } catch (InvalidInputException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Creates an array of characters in this state and initializes
     * it with some text.
     * 
     * @param value the text that will be put in the array.
     * @return a {@link ReferenceConcrete} to the created {@link Instance}.
     * @throws HeapMemoryExhaustedException if the heap is full.
     */
    private ReferenceConcrete createArrayOfChars(String value) throws HeapMemoryExhaustedException {
        final Simplex stringLength = this.calc.valInt(value.length());
        final ReferenceConcrete retVal;
        try {
            final ClassFile cf_arrayOfCHAR = this.classHierarchy.loadCreateClass("" + Type.ARRAYOF + Type.CHAR);
            retVal = createArray(null, stringLength, cf_arrayOfCHAR);
            final Array a = (Array) this.getObject(retVal);
            for (int k = 0; k < value.length(); ++k) {
                final char c = value.charAt(k);
                a.setFast(this.calc.valInt(k), this.calc.valChar(c));
            }
        } catch (ClassFileNotFoundException | ClassFileIllFormedException | BadClassFileVersionException | 
                 WrongClassNameException | IncompatibleClassFileException | ClassFileNotAccessibleException | 
                 ClassCastException | InvalidOperandException | InvalidTypeException | 
                 InvalidInputException | FastArrayAccessNotAllowedException e) {
            //this should never happen 
            throw new UnexpectedInternalException(e);
        }

        return retVal;
    }
    
    /**
     * Checks if there is an {@link Instance} of {@code java.lang.Class} 
     * in this state's heap for some class.
     * 
     * @param classFile a {@link ClassFile}.
     * @return {@code true} iff there is a {@link Instance} of {@code java.lang.Class} in 
     *         this state's {@link Heap} corresponding to {@code classFile}.
     */
    public boolean hasInstance_JAVA_CLASS(ClassFile classFile) {
        return (classFile.isPrimitiveOrVoid() ? hasInstance_JAVA_CLASS_primitiveOrVoid(classFile.getClassName()) : this.classes.containsKey(classFile));
    }

    /**
     * Checks if there is an {@link Instance} of {@code java.lang.Class} 
     * in this state's heap for some primitive type.
     * 
     * @param typeName a {@link String} representing the
     *        canonical name of  a primitive type or void (see JLS v8, section 6.7).
     * @return {@code true} iff there is a {@link Instance} of {@code java.lang.Class} in 
     *         this state's {@link Heap} corresponding to {@code typeName}.
     */
    public boolean hasInstance_JAVA_CLASS_primitiveOrVoid(String typeName) {
        return this.classesPrimitive.containsKey(typeName);
    }

    /**
     * Returns a {@link ReferenceConcrete} to an {@link Instance_JAVA_CLASS} 
     * representing a class. 
     * 
     * @param classFile a {@link ClassFile}.
     * @return a {@link ReferenceConcrete} to the {@link Instance_JAVA_CLASS} in 
     *         this state's {@link Heap}, representing {@code classFile}, 
     *         or {@code null} if such instance does not exist. 
     */
    public ReferenceConcrete referenceToInstance_JAVA_CLASS(ClassFile classFile) {
        return (classFile.isPrimitiveOrVoid() ? referenceToInstance_JAVA_CLASS_primitiveOrVoid(classFile.getClassName()) : this.classes.get(classFile));
    }

    /**
     * Returns a {@link ReferenceConcrete} to an {@link Instance_JAVA_CLASS} 
     * representing a primitive type. 
     * 
     * @param typeName a {@link String} representing the canonical name 
     *        of a primitive type or void (see JLS v8, section 6.7).
     * @return a {@link ReferenceConcrete} to the {@link Instance_JAVA_CLASS} 
     *         in this state's {@link Heap}, representing the class of 
     *         the primitive type {@code typeName}, or {@code null} if 
     *         such instance does not exist in the heap. 
     */
    public ReferenceConcrete referenceToInstance_JAVA_CLASS_primitiveOrVoid(String typeName) {
        return this.classesPrimitive.get(typeName);
    }

    /**
     * Ensures an {@link Instance_JAVA_CLASS} 
     * corresponding to a class exists in the {@link Heap}. If
     * the instance does not exist, it creates 
     * it, otherwise it does nothing.
     * 
     * @param representedClass a {@link ClassFile}, the class represented
     *        by the created {@link Instance_JAVA_CLASS}.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws FrozenStateException if the state is frozen.
     */
    public void ensureInstance_JAVA_CLASS(ClassFile representedClass) 
    throws HeapMemoryExhaustedException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (hasInstance_JAVA_CLASS(representedClass)) {
            //nothing to do
            return;
        }
        if (representedClass.isPrimitiveOrVoid()) {
            try {
                ensureInstance_JAVA_CLASS_primitiveOrVoid(representedClass.getClassName());
            } catch (ClassFileNotFoundException e) {
                //this should never happen
                throw new UnexpectedInternalException(e);
            }
        } else {
            this.classes.put(representedClass, createInstance_JAVA_CLASS(representedClass));
        }
    }

    /**
     * Ensures an {@link Instance_JAVA_CLASS} 
     * corresponding to a primitive type or void exists in the {@link Heap}. If
     * the instance does not exist, it creates it, otherwise it does 
     * nothing.
     * 
     * @param typeName a {@link String} representing the canonical name 
     *        of a primitive type or void (see JLS v8, section 6.7).
     * @throws ClassFileNotFoundException if {@code typeName} is not
     *         the canonical name of a primitive type.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws FrozenStateException if the state is frozen.
     */
    public void ensureInstance_JAVA_CLASS_primitiveOrVoid(String typeName) 
    throws ClassFileNotFoundException, HeapMemoryExhaustedException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (hasInstance_JAVA_CLASS_primitiveOrVoid(typeName)) {
            return;
        }
        if (isPrimitiveOrVoidCanonicalName(typeName)) {
            try {
                final ClassFile cf = this.classHierarchy.getClassFilePrimitiveOrVoid(typeName);
                if (cf == null) {
                    throw new UnexpectedInternalException("Could not find the classfile for the primitive type " + typeName + ".");
                }
                final ReferenceConcrete retVal = createInstance_JAVA_CLASS(cf);
                this.classesPrimitive.put(typeName, retVal);
            } catch (InvalidInputException e) {
                throw new UnexpectedInternalException(e);
            }
        } else {
            throw new ClassFileNotFoundException(typeName + " is not the canonical name of a primitive type or void");
        }
    }
    
    /**
     * Checks if there is an {@link Instance} of {@code java.lang.ClassLoader} (or subclass) 
     * in this state's heap for some classloader identifier.
     * 
     * @param id a {@link int}, the identifier of a classloader.
     * @return {@code true} iff there is a {@link Instance} of {@code java.lang.ClassLoader} 
     *         (or subclass) in this state's {@link Heap} associated to {@code id}.
     */
    public boolean hasInstance_JAVA_CLASSLOADER(int id) {
        return 0 < id && id < this.classLoaders.size();
    }
    
    /**
     * Returns a {@link ReferenceConcrete} to an {@link Instance} 
     * of {@code java.lang.invoke.ClassLoader} (or subclass) for some classloader identifier. 
     * 
     * @param id a {@link int}, the identifier of a classloader.
     * @return a {@link ReferenceConcrete} to the {@link Instance}  of {@code java.lang.ClassLoader}
     *         (or subclass) in this state's {@link Heap} associated to {@code id},
     *         or {@code null} if there is not.
     */
    public ReferenceConcrete referenceToInstance_JAVA_CLASSLOADER(int id) {
        if (hasInstance_JAVA_CLASSLOADER(id)) {
            return this.classLoaders.get(id);
        } else {
            return null;
        }
    }
    
    /**
     * Declares that the standard (extensions and application) class loaders are ready
     * to be used.
     * 
     * @throws InvalidInputException when the state is frozen, or the 
     *         {@link Instance_JAVA_CLASSLOADER}s for the standard 
     *         classloaders were not created in the heap 
     *         (note that this method does not check that the 
     *         {@link Instance_JAVA_CLASSLOADER}s were also initialized).
     */
    public void setStandardClassLoadersReady() throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (!this.standardClassLoadersNotReady) {
            return; //nothing to do
        }
        if (this.classLoaders.size() <= CLASSLOADER_APP) {
            throw new InvalidInputException("Invoked jbse.mem.state.setStandardClassLoadersReady with true parameter, but the standard class loaders were not created yet.");
        }
        this.standardClassLoadersNotReady = false;
    }
    
    /**
     * Checks whether the bootstrap classloader should always load the 
     * classes defined by the extensions and application classloaders.
     * This method returns the value set by the constructor, 
     * so it shall only be used to query it, not to decide during
     * symbolic execution what loader to use. For the latter use 
     * the {@link #bypassStandardLoading()} method.
     * 
     * @return a {@code boolean}.
     */
    public boolean shouldAlwaysBypassStandardLoading() {
        return this.bypassStandardLoading;
    }
    
    /**
     * Checks whether the bootstrap classloader should load the 
     * classes defined by the extensions and application classloaders, 
     * either because users want to always use it at the purpose, 
     * or because the extensions and application classloaders
     * are not yet ready to be used.
     * 
     * @return {@code true} iff {@link #shouldAlwaysBypassStandardLoading()}, or 
     *         if the method {@link #setStandardClassLoadersReady()}
     *         was not previously invoked.
     */
    public boolean bypassStandardLoading() {
        return this.bypassStandardLoading || this.standardClassLoadersNotReady;
    }
    
    /**
     * Checks if there is an {@link Instance} of {@code java.lang.invoke.MethodHandle} 
     * in this state's heap for some descriptor.
     * 
     * @param descriptor a {@link String} representing a descriptor. It is
     *        not checked.
     * @return {@code true} iff there is a {@link Instance} in this state's {@link Heap} associated to {@code descriptor}
     *         by a previous call to {@link #setReferenceToInstance_JAVA_METHODTYPE(String, ReferenceConcrete)}.
     */
    public boolean hasInstance_JAVA_METHODTYPE(String descriptor) {
        return this.methodTypes.containsKey(descriptor);
    }
    
    /**
     * Returns a {@link ReferenceConcrete} to an {@link Instance} 
     * of {@code java.lang.invoke.MethodHandle} representing a descriptor. 
     * 
     * @param descriptor a {@link String} representing a descriptor. It is
     *        not checked.
     * @return a {@link ReferenceConcrete} to the {@link Instance} 
     *         in this state's {@link Heap} associated to {@code descriptor}
     *         by a previous call to {@link #setReferenceToInstance_JAVA_METHODTYPE(String, ReferenceConcrete)},
     *         or {@code null} if there is not.
     */
    public ReferenceConcrete referenceToInstance_JAVA_METHODTYPE(String descriptor) {
        return this.methodTypes.get(descriptor);
    }
    
    /**
     * Associates a descriptor to a {@link ReferenceConcrete} to an {@link Instance} 
     * of {@code java.lang.invoke.MethodType} representing it. 
     * 
     * @param descriptor a {@link String} representing a descriptor. It is
     *        not checked.
     * @return a {@link ReferenceConcrete}. It should refer an {@link Instance}
     *         of {@code java.lang.invoke.MethodType} 
     *         in this state's {@link Heap} that is semantically equivalent to
     *         {@code descriptor}, but this is not checked.
     * @throws FrozenStateException if the state is frozen.
     */
    public void setReferenceToInstance_JAVA_METHODTYPE(String descriptor, ReferenceConcrete ref) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.methodTypes.put(descriptor, ref);
    }

    /**
     * Unwinds the stack of this state until it finds an exception 
     * handler for an object. If the thread stack is empty after 
     * unwinding, sets the state to stuck with the unhandled exception
     * throw as a cause.
     * 
     * @param exceptionToThrow a {@link Reference} to a throwable 
     *        {@link Objekt} in the state's {@link Heap}.
     * @throws InvalidInputException if the state is frozen, or 
     *         {@code exceptionToThrow} is an unresolved symbolic reference, 
     *         or is a null reference, or is a reference to an object that 
     *         does not extend {@code java.lang.Throwable}.
     * @throws InvalidIndexException if the exception type field in a row of the exception table 
     *         does not contain the index of a valid CONSTANT_Class in the class constant pool.
     * @throws InvalidProgramCounterException if the program counter handle in a row 
     *         of the exception table does not contain a valid program counter.
     */
    public void unwindStack(Reference exceptionToThrow) 
    throws InvalidInputException, InvalidIndexException, InvalidProgramCounterException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        //checks that exceptionToThrow is resolved to a throwable Objekt
        final Objekt myException = getObject(exceptionToThrow);
        final ClassFile cf_JAVA_THROWABLE;
        try {
            cf_JAVA_THROWABLE = this.classHierarchy.loadCreateClass(JAVA_THROWABLE);
        } catch (ClassFileNotFoundException | ClassFileIllFormedException | BadClassFileVersionException |
                 WrongClassNameException | IncompatibleClassFileException |
                 InvalidInputException | ClassFileNotAccessibleException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        if (myException == null || !myException.getType().isSubclass(cf_JAVA_THROWABLE)) {
            throw new InvalidInputException("Attempted to throw an unresolved or null reference, or a reference to an object that is not Throwable.");
        }

        //fills a vector with all the superclass names of the exception
        final ArrayList<String> excTypes = new ArrayList<String>();
        for (ClassFile f : myException.getType().superclasses()) {
            excTypes.add(f.getClassName());
        }

        //unwinds the stack
        try {
            while (true) {
                if (this.stack.isEmpty()) {
                	if (phase() == Phase.POST_INITIAL) {
                		setStuckException(exceptionToThrow);
                	}
                    return;
                }
                if (getCurrentFrame() instanceof SnippetFrameNoWrap) {
                    //cannot catch anything and has no current method either
                    popCurrentFrame();
                    continue; 
                }
                final Signature currentMethodSignature = getCurrentMethodSignature();
                final ExceptionTable myExTable = getCurrentClass().getExceptionTable(currentMethodSignature);
                final ExceptionTableEntry tmpEntry = myExTable.getEntry(excTypes, getPC());
                if (tmpEntry == null) {
                    popCurrentFrame();
                } else {
                    clearOperands();
                    setProgramCounter(tmpEntry.getPCHandle());
                    pushOperand(exceptionToThrow);
                    return;				
                }
            }
        } catch (ThreadStackEmptyException | MethodNotFoundException | 
                 MethodCodeNotFoundException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Creates a new frame for a (nonnative) method and pushes it 
     * on this state's stack.
     * 
     * @param classMethodImpl
     *        the {@link ClassFile} containing the bytecode for the method.
     * @param methodSignatureImpl
     *        the {@link Signature} of the method for which the 
     *        frame is built.
     * @param isRoot
     *        {@code true} iff the frame is the root frame of symbolic
     *        execution (i.e., on the top of the thread stack).
     * @param returnPCOffset 
     *        the offset from the current program counter of 
     *        the return program counter. It is ignored if 
     *        {@code isRoot == true}.
     * @param args
     *        varargs of method call arguments.
     * @throws NullMethodReceiverException when the method is not static
     *         and the first argument in {@code args} is the null reference.
     * @throws MethodNotFoundException when {@code classMethodImpl}
     *         does not contain a declaration for {@code methodSignatureImpl}.
     * @throws MethodCodeNotFoundException when {@code classMethodImpl}
     *         does not contain bytecode for {@code methodSignatureImpl}.
     * @throws InvalidSlotException when there are 
     *         too many {@code arg}s or some of their types are 
     *         incompatible with their respective slots types.
     * @throws InvalidTypeException when narrowing of an argument (performed to match
     *         the method's signature) fails.
     * @throws InvalidProgramCounterException when {@code isRoot == false} and
     *         {@code returnPCOffset} is not a valid program count offset for the
     *         state's current frame.
     * @throws ThreadStackEmptyException when {@code isRoot == false} and the 
     *         state's thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void pushFrame(ClassFile classMethodImpl, Signature methodSignatureImpl, boolean isRoot, int returnPCOffset, Value... args) 
    throws NullMethodReceiverException, MethodNotFoundException, MethodCodeNotFoundException, InvalidSlotException, 
    InvalidTypeException, InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final boolean isStatic = classMethodImpl.isMethodStatic(methodSignatureImpl);
        
        //checks the "this" parameter (invocation receiver) if necessary
        if (!isStatic) {
            if (args.length == 0 || !(args[0] instanceof Reference)) {
                throw new UnexpectedInternalException("Args for method invocation do not correspond to method signature."); //TODO better exception
            }
            if (isNull((Reference) args[0])) {
                throw new NullMethodReceiverException();
            }
        }
        
        //sets the return program counter
        if (isRoot) {
            //do nothing, after creation the frame has already a dummy return program counter
        } else {
            setReturnProgramCounter(returnPCOffset);
        }

        //narrows the int args if the method signature requires a narrower type
        narrowArgs(args, methodSignatureImpl, isStatic);

        //creates the new frame and sets its args
        final MethodFrame f = new MethodFrame(methodSignatureImpl, classMethodImpl);
        f.setArgs(args);

        //pushes the new frame on the thread stack
        this.stack.push(f);
    }
    
    /**
     * Creates a {@link SnippetFactory} for snippets
     * that can be pushed on the current stack with
     * {@link #pushSnippetFrameNoWrap(Snippet, int, int, String) pushSnippetFrameNoWrap}.
     * 
     * @return a {@link SnippetFactory}.
     */
    public SnippetFactory snippetFactoryNoWrap() {
        return new SnippetFactory();
    }
    
    /**
     * Creates a {@link SnippetFactory} for snippets
     * that can be pushed on the current stack with
     * {@link #pushSnippetFrameWrap(Snippet, int) pushSnippetFrameWrap}.
     * 
     * @return a {@link SnippetFactory}.
     * @throws ThreadStackEmptyException if the stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public SnippetFactory snippetFactoryWrap() 
    throws FrozenStateException, ThreadStackEmptyException {
        return new SnippetFactory(getCurrentClass());
    }
    
    /**
     * Creates a new frame for a {@link Snippet} and
     * pushes it on this state's stack. The created frame 
     * will inherit the context of the current frame, including
     * the current class (on which the additional constant pool
     * items will be injected), will operate on its operand stack 
     * and local variables. Note that it is possible to wrap only 
     * a {@link MethodFrame}, not another snippet frame.
     * 
     * @param snippet a {@link Snippet}.
     * @param returnPCOffset the offset from the current 
     *        program counter of the return program counter.
     * @throws InvalidProgramCounterException if {@code returnPCOffset} 
     *         is not a valid program count offset for the state's current frame.
     * @throws ThreadStackEmptyException if the state's thread stack is empty.
     * @throws InvalidInputException if the state is frozen, or 
     *         {@link #getCurrentFrame()} is not a {@link MethodFrame}.
     */
    public void pushSnippetFrameWrap(Snippet snippet, int returnPCOffset) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        try {
            //sets the return program counter
            setReturnProgramCounter(returnPCOffset);

            //creates the new snippet frame
            final Frame f = new SnippetFrameWrap(snippet, (MethodFrame) getCurrentFrame());

            //pushes the frame
            this.stack.push(f);
        } catch (InvalidInputException e) {
        	throw new UnexpectedInternalException("Found a method frame with a snippet classfile.");
        } catch (ClassCastException e) {
            throw new InvalidInputException("Cannot push a snippet frame whose context is not a method frame.");
        }
    }
    
    /**
     * Creates a new frame for a {@link Snippet} and
     * pushes it on this state's stack. The created frame
     * will have its own operand stack and no local variables.
     * 
     * @param snippet a {@link Snippet}.
     * @param returnPCOffset the offset from the current 
     *        program counter of the return program counter.
     * @param definingClassLoader an {@code int}, the defining
     *        class loader that is assumed for the current class
     *        of the frame.
     * @param packageName a {@code String}, the name of the
     *        package that is assumed for the current class
     *        of the frame.
     * @throws InvalidProgramCounterException if {@code returnPCOffset} 
     *         is not a valid program count offset for the state's current frame.
     * @throws ThreadStackEmptyException if the state's thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void pushSnippetFrameNoWrap(Snippet snippet, int returnPCOffset, int definingClassLoader, String packageName) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    	    throw new FrozenStateException();
    	}
    	
        //sets the return program counter
        setReturnProgramCounter(returnPCOffset);

        //creates the new snippet frame
        final Frame f = new SnippetFrameNoWrap(snippet, definingClassLoader, packageName, "$SNIPPET$" + this.snippetClassFileCounter++);

        this.stack.push(f);
    }
    
    /**
     * Creates a new frame for a {@link Snippet} and
     * pushes it on this state's stack. The created frame
     * will have its own operand stack and no local variables.
     * The assumed dynamic package (i.e., defining class loader
     * and package name) will be the same of the topmost frame
     * present on the stack before the invocation of this method, 
     * as if the current class were the same before and after the
     * invocation of the method. Therefore, invoking this method is
     * equivalent to invoking 
     * {@link #pushSnippetFrameNoWrap(Snippet, int, int, String) pushSnippetFrameNoWrap}{@code (snippet, returnPCOffset, }
     * {@link #getCurrentClass()}{@code .}{@link ClassFile#getDefiningClassLoader() getDefiningClassLoader()}{@code , }
     * {@link #getCurrentClass()}{@code .}{@link ClassFile#getPackageName() getPackageName()}{@code ).}
     * 
     * @param snippet a {@link Snippet}.
     * @param returnPCOffset the offset from the current 
     *        program counter of the return program counter.
     * @throws InvalidProgramCounterException if {@code returnPCOffset} 
     *         is not a valid program count offset for the state's current frame.
     * @throws ThreadStackEmptyException if the state's thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void pushSnippetFrameNoWrap(Snippet snippet, int returnPCOffset) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
    	pushSnippetFrameNoWrap(snippet, returnPCOffset, getCurrentClass().getDefiningClassLoader(), getCurrentClass().getPackageName());
    }
    
    private void narrowArgs(Value[] args, Signature methodSignatureImpl, boolean isStatic) throws InvalidTypeException {
        final String[] paramsDescriptor = Type.splitParametersDescriptors(methodSignatureImpl.getDescriptor());
        for (int i = 0; i < paramsDescriptor.length; ++i) {
            if (Type.isPrimitive(paramsDescriptor[i]) && ! Type.isPrimitiveOpStack(paramsDescriptor[i].charAt(0))) {
                final int indexArg = (isStatic ? i : i + 1);
                args[indexArg] = ((Primitive) args[indexArg]).narrow(paramsDescriptor[i].charAt(0));
            }
        }
    }

    /**
     * Makes symbolic arguments for the root method invocation. This includes the
     * root object.
     * @param f the root {@link MethodFrame}.
     * @param isStatic
     *        {@code true} iff INVOKESTATIC method invocation rules 
     *        must be applied.
     * @return a {@link Value}{@code []}, the array of the symbolic parameters
     *         for the method call. Note that the reference to the root object
     *         is a {@link ReferenceSymbolic}.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws CannotAssumeSymbolicObjectException if the root object has class 
     *         {@code java.lang.Class} or {@code java.lang.ClassLoader}.
     * @throws FrozenStateException if the state is frozen.
     */
    private Value[] makeArgsSymbolic(MethodFrame f, boolean isStatic) 
    throws HeapMemoryExhaustedException, CannotAssumeSymbolicObjectException, FrozenStateException {
        final Signature methodSignature = f.getCurrentMethodSignature();
        final String[] paramsDescriptors = Type.splitParametersDescriptors(methodSignature.getDescriptor());
        final int numArgs = parametersNumber(methodSignature.getDescriptor(), isStatic);

        //produces the args as symbolic values from the method's signature
        final ClassFile currentClass = f.getCurrentClass();
        final String currentClassName = currentClass.getClassName();
        final Value[] args = new Value[numArgs];
        for (int i = 0, slot = 0; i < numArgs; ++i) {
            //builds a symbolic value from signature and name
            final String variableName = f.getLocalVariableDeclaredName(slot);
            try {
                if (slot == ROOT_THIS_SLOT && !isStatic) {
                    args[i] = (Value) createSymbolLocalVariable(Type.REFERENCE + currentClassName + Type.TYPEEND, variableName);
                } else {
                    args[i] = (Value) createSymbolLocalVariable(paramsDescriptors[(isStatic ? i : i - 1)], variableName);
                }
            } catch (InvalidTypeException | InvalidInputException e) {
                //this should never happen
                throw new UnexpectedInternalException(e);
            }

            //next slot
            ++slot;
            if (!Type.isCat_1(args[i].getType())) {
                ++slot;
            }
        }

        return args;
    }

    /**
     * Creates a new frame for a method invocation and pushes it 
     * on a state's stack. The actual parameters of the invocation are 
     * initialized with symbolic values.
     *  
     * @param classMethodImpl
     *        the {@link ClassFile} containing the bytecode for the method.
     * @param methodSignatureImpl 
     *        the {@link Signature} of the method for which the 
     *        frame is built. The bytecode for the method will be
     *        looked for in 
     *        {@code methodSignatureImpl.}{@link Signature#getClassName() getClassName()}.
     * @return a {@link ReferenceSymbolic}, the "this" (target) of the method invocation
     *         if the invocation is not static, otherwise {@code null}.
     * @throws MethodNotFoundException when {@code classMethodImpl}
     *         does not contain a declaration for {@code methodSignatureImpl}.
     * @throws MethodCodeNotFoundException when {@code classMethodImpl}
     *         does not contain bytecode for {@code methodSignatureImpl}.
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws CannotAssumeSymbolicObjectException if the target of the method invocation 
     *         has class {@code java.lang.Class} or {@code java.lang.ClassLoader}.
     * @throws FrozenStateException if the state is frozen.
     */
    public ReferenceSymbolic pushFrameSymbolic(ClassFile classMethodImpl, Signature methodSignatureImpl) 
    throws MethodNotFoundException, MethodCodeNotFoundException, 
    HeapMemoryExhaustedException, CannotAssumeSymbolicObjectException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final boolean isStatic = classMethodImpl.isMethodStatic(methodSignatureImpl);
        final MethodFrame f = new MethodFrame(methodSignatureImpl, classMethodImpl);
        final Value[] args = makeArgsSymbolic(f, isStatic);
        try {
            f.setArgs(args);
        } catch (InvalidSlotException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        this.stack.push(f);
        return (isStatic ? null : ((ReferenceSymbolic) args[0]));
    }

    /**
     * Parses the signature of a method, and returns the
     * {@code this} parameter as found on the operand stack. 
     * 
     * @param methodSignature
     *        the {@link Signature} of a method. It is <em>not</em>
     *        checked.
     * @return the {@link Reference} to the receiver of
     *         the method according to {@link methodSignature}'s 
     *         declared list of parameters, or {@link null} if the 
     *         operand stack has not enough items, or the
     *         item in the position of the "this" parameter is
     *         not a reference. 
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Reference peekReceiverArg(Signature methodSignature) 
    throws ThreadStackEmptyException, FrozenStateException {
        final String[] paramsDescriptors = Type.splitParametersDescriptors(methodSignature.getDescriptor());
        final int nParams = paramsDescriptors.length + 1;
        final Collection<Value> opStackVals = getCurrentFrame().operands();
        int i = 1;
        for (Value val : opStackVals) { 
            if (i == nParams) {
                if (! (val instanceof Reference)) {
                    return null;
                }
                return (Reference) val;
            }
            ++i;
        }
        return null;
    }

    /**
     * Sets the return program counter of the current frame.
     * 
     * @param returnPCOffset the offset of the return program counter 
     *        w.r.t. the current program counter.
     * @throws InvalidProgramCounterException iff current + offset program counter
     *        yield an invalid offset.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void setReturnProgramCounter(int returnPCOffset) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        getCurrentFrame().setReturnProgramCounter(returnPCOffset);
    }

    /**
     * Removes the current {@link Frame} from the thread stack.
     * 
     * @return the popped {@link Frame}.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Frame popCurrentFrame() throws ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
    	return this.stack.pop();
    }

    /**
     * Removes all the frames from the thread stack.
     * 
     * @throws FrozenStateException if the state is frozen. 
     */
    public void clearStack() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.stack.clear();
    }

    /**
     * Returns the root frame.
     * 
     * @return a {@link Frame}, the root (first pushed) one.
     * @throws ThreadStackEmptyException if the 
     *         thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Frame getRootFrame() throws ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.stack.rootFrame();
    }

    /**
     * Returns the current frame.
     * 
     * @return a {@link Frame}, the current (last pushed) one.
     * @throws ThreadStackEmptyException if the 
     *         thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public Frame getCurrentFrame() throws ThreadStackEmptyException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.stack.currentFrame();
    }

    /**
     * Returns an immutable view of the thread stack.
     * 
     * @return a {@link List}{@code <}{@link Frame}{@code >} 
     *         of the method activation frames in the thread stack, 
     *         in their push order.
     * @throws FrozenStateException if the state is frozen.
     */
    public List<Frame> getStack() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.stack.frames();
    }

    /**
     * Returns the size of the thread stack.
     * 
     * @return an {@code int}, the size.
     * @throws FrozenStateException if the state is frozen.
     */
    public int getStackSize() throws FrozenStateException {
        return getStack().size();
    }

    /**
     * Returns a copy of the state's heap.
     * 
     * @return a copy the state's heap as a 
     * {@link SortedMap}{@code <}{@link Integer}{@code , }{@link Objekt}{@code >}
     * mapping heap positions to the {@link Objekt}s stored 
     * at them.
     * @throws FrozenStateException if the state is frozen.
     */
    //TODO raise the abstraction level and make this method return a SortedMap<Reference, Objekt>
    public SortedMap<Long, Objekt> getHeap() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.heap.getObjects();
    }

    /**
     * Returns all the symbolic objects of this state according
     * to its path condition.
     * 
     * @return an {@link Iterable}{@code <}{@link Objekt}{@code >}
     *         that iterates through all the objects in the {@link ClauseAssumeExpands}
     *         in the state's path condition.
     * @throws FrozenStateException if the state is frozen.
     */
    public Iterable<Objekt> objectsSymbolic() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return new Iterable<Objekt>() {
            @Override
            public Iterator<Objekt> iterator() {
                return new Iterator<Objekt>() {
                    private final Iterator<Clause> it = pathCondition.getClauses().iterator();
                    private boolean hasNext;
                    private ClauseAssumeExpands next;
                    {
                        moveForward();
                    }

                    private void moveForward() {
                        while (it.hasNext()) {
                            final Clause next = it.next();
                            if (next instanceof ClauseAssumeExpands) {
                                this.hasNext = true;
                                this.next = (ClauseAssumeExpands) next;
                                return;
                            }
                        }
                        this.hasNext = false;
                        this.next = null;
                    }

                    @Override
                    public boolean hasNext() {
                        return this.hasNext;
                    }

                    @Override
                    public Objekt next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        final Objekt retVal = State.this.heap.getObjects().get(this.next.getHeapPosition());
                        moveForward();
                        return retVal;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    /**
     * Returns the static method area of this state.
     * 
     * @return the state's static method area as an 
     *         immutable {@link Map}{@code <}{@link ClassFile}{@code , }{@link Klass}{@code >}.
     * @throws FrozenStateException if the state is frozen.
     */
    public Map<ClassFile, Klass> getStaticMethodArea() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return Collections.unmodifiableMap(this.staticMethodArea.getObjects());
    }

    /**
     * Returns the instruction in the current method pointed by 
     * the state's current program counter.
     * 
     * @return a {@code byte} representing the 
     *         bytecode pointed by the state's current program
     *         counter.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public byte getInstruction() 
    throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getInstruction();
    }

    /**
     * Returns the instruction in the current method pointed by 
     * the state's current program counter plus a displacement.
     * 
     * @param displacement a {@code int} representing a displacement
     *        from the current program counter.
     * @return a {@code byte} representing the 
     *         bytecode pointed by the state's current program
     *         counter plus {@code displacement}.
     * @throws InvalidProgramCounterException iff the frame's program
     *         counter plus {@code displacement} does not point to 
     *         a bytecode.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public byte getInstruction(int displacement) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getInstruction(displacement);
    }

    /**
     * Returns the source code row corresponding to the 
     * frame's program counter.
     *  
     * @return the source code row corresponding to the 
     *         state's program counter, or {@code -1} 
     *         iff no debug information is available. 
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public int getSourceRow() throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getSourceRow();
    }

    /**
     * Returns the current program counter.
     * 
     * @return an {@code int} representing the state's 
     *         current program counter.
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public int getPC() throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getProgramCounter();
    }

    /**
     * Returns the return program counter of the caller frame
     * stored for a return bytecode.
     * 
     * @return an {@code int}, the return program counter.
     * @throws ThreadStackEmptyException  if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public int getReturnPC() throws ThreadStackEmptyException, FrozenStateException {
        return getCurrentFrame().getReturnProgramCounter();
    }

    /**
     * Increments/decrements the program counter by an arbitrary number.
     * 
     * @param n the {@code int} value to be added to the current 
     *          program counter.
     * @throws InvalidProgramCounterException if the incremented program counter
     *         would not point to a valid bytecode in the current method 
     *         (the state's program counter is not changed).
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void incProgramCounter(int n) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
        setProgramCounter(getPC() + n);
    }

    /**
     * Sets the state's program counter.
     * 
     * @param newPC the new program counter value.
     * @throws InvalidProgramCounterException if {@code newPC} does not 
     *         point to a valid bytecode in the current method (the
     *         state's program counter is not changed).
     * @throws ThreadStackEmptyException if the thread stack is empty.
     * @throws FrozenStateException if the state is frozen.
     */
    public void setProgramCounter(int newPC) 
    throws InvalidProgramCounterException, ThreadStackEmptyException, FrozenStateException {
        getCurrentFrame().setProgramCounter(newPC);
    }
    
    private void possiblyReset() {
        if (this.wereResetLastPathConditionClauses) {
        	this.nPushedClauses = 0;
        	this.wereResetLastPathConditionClauses = false;
        }
    }

    /**
     * Assumes a predicate over primitive values (numeric assumption).
     * Its effect is adding a clause to the path condition.
     * 
     * @param p the primitive clause which must be added to the state's 
     *          path condition. It must be {@code p != null && 
     *          (p instanceof }{@link Expression} {@code || p instanceof }{@link Simplex}
     *          {@code ) && p.}{@link Value#getType() getType()} {@code  == }{@link Type#BOOLEAN BOOLEAN}.
     * @throws NullPointerException if {@code p == null}.
     * @throws InvalidInputException if {@code (!( p instanceof }{@link Expression} {@code ) && !( p instanceof }{@link Simplex}
     *          {@code )) || p.}{@link Value#getType() getType()} {@code  != }{@link Type#BOOLEAN BOOLEAN}.
     */
    public void assume(Primitive p) throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
    	possiblyReset();
        this.pathCondition.addClauseAssume(p);
        ++this.nPushedClauses;
    }

    /**
     * Assumes the expansion of a symbolic reference to a fresh object of some
     * class. Its effects are adding the fresh object to the heap and refining
     * the path condition.
     * 
     * @param referenceSymbolic the {@link ReferenceSymbolic} which is resolved. It 
     *        must be {@code referenceSymbolic != null}.
     * @param classFile a {@code ClassFile}, the class of the fresh 
     *        object to which {@code referenceSymbolic} is expanded. 
     *        It must be {@code classFile != null}.
     * @throws InvalidInputException if either {@code referenceSymbolic} or 
     *         {@code classFile} is {@code null}, or if the state is frozen.
     * @throws ContradictionException if {@code referenceSymbolic} is already 
     *         resolved.
     * @throws InvalidTypeException if {@code classFile} is invalid. 
     * @throws HeapMemoryExhaustedException if the heap is full.
     * @throws CannotAssumeSymbolicObjectException if {@code classFile} is
     *         a class that cannot be assumed to be symbolic
     *         (currently {@code java.lang.Class} and {@code java.lang.ClassLoader}).
     */
    public void assumeExpands(ReferenceSymbolic referenceSymbolic, ClassFile classFile) 
    throws InvalidTypeException, ContradictionException, HeapMemoryExhaustedException, 
    CannotAssumeSymbolicObjectException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (referenceSymbolic == null || classFile == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeExpands with a null referenceSymbolic or classFile.");
        }
        if (resolved(referenceSymbolic)) {
            throw new ContradictionException("Attempted to invoke State.assumeExpands with an already resolved referenceSymbolic.");
        }
        
    	possiblyReset();
        final long objectPosition = createObjectSymbolic(classFile, referenceSymbolic);
        final Objekt object = this.heap.getObject(objectPosition);
        this.pathCondition.addClauseAssumeExpands(referenceSymbolic, objectPosition, object);
        ++this.nPushedClauses;
    }
    
    /**
     * Assumes the expansion of a symbolic reference to a fresh object of some
     * class, where the symbolic object is already present in the heap. Note that
     * this method does <em>not</em> check that another symbolic reference
     * 
     * @param referenceSymbolic the {@link ReferenceSymbolic} which is resolved. It 
     *        must be {@code referenceSymbolic != null} and {@code referenceSymbolic} 
     *        must not be already resolved.
     * @param freshObjectPosition a {@code long}, the position of the symbolic object in 
     *        the heap to which {@code referenceSymbolic} is expanded. Note that
     *        this method does <em>not</em> check that no other symbolic reference
     *        exists that is expanded to the object at {@code freshObjectPosition}!
     * @throws InvalidInputException if either {@code referenceSymbolic} is {@code null}, 
     *         or no symbolic object is stored at {@code freshObjectPosition}, or the 
     *         state is frozen.
     * @throws ContradictionException if {@code referenceSymbolic} is already 
     *         resolved. 
     */
    public void assumeExpandsAlreadyPresent(ReferenceSymbolic referenceSymbolic, long freshObjectPosition) 
    throws InvalidInputException, ContradictionException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (referenceSymbolic == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeExpandsAlreadyPresent with a null referenceSymbolic.");
        }
        if (resolved(referenceSymbolic)) {
            throw new ContradictionException("Attempted to invoke State.assumeExpandsAlreadyPresent with an already resolved referenceSymbolic.");
        }
        final Objekt freshObject = this.heap.getObject(freshObjectPosition);
        if (freshObject == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeExpandsAlreadyPresent with a freshObjectPosition where no object is stored.");
        }
        if (!freshObject.isSymbolic()) {
            throw new InvalidInputException("Attempted to invoke State.assumeExpandsAlreadyPresent with a freshObjectPosition where a concrete object is stored.");
        }
        
    	possiblyReset();
        this.pathCondition.addClauseAssumeExpands(referenceSymbolic, freshObjectPosition, freshObject);
        ++this.nPushedClauses;
    }

    /**
     * Assumes the resolution of a symbolic reference to some alias.  
     * Its effects are refining all the symbolic references with 
     * same origin, and adding a clause to the path condition.
     * 
     * @param referenceSymbolic the {@link ReferenceSymbolic} which is resolved. It 
     *        must be {@code referenceSymbolic != null} and {@code referenceSymbolic} 
     *        must not be already resolved.
     * @param aliasOrigin the origin of the symbolic {@link Objekt} to which 
     *        {@code referenceSymbolic} is resolved. It must be resolved by expansion
     *        to a heap object.
     * @throws InvalidInputException if either {@code referenceSymbolic} is {@code null}, 
     *         or no symbolic object is stored at {@code aliasObjectPosition}, or the 
     *         state is frozen.
     * @throws ContradictionException if {@code referenceSymbolic} is already resolved.
     */
    public void assumeAliases(ReferenceSymbolic referenceSymbolic, ReferenceSymbolic aliasOrigin) 
    throws InvalidInputException, ContradictionException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (referenceSymbolic == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeAliases with a null referenceSymbolic.");
        }
        if (resolved(referenceSymbolic)) {
            throw new ContradictionException("Attempted to invoke State.assumeAliases with an already resolved referenceSymbolic.");
        }
        final Objekt aliasObject = getObjectInitial(aliasOrigin);
        if (aliasObject == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeAliases with an aliasOrigin that does not refer to any initial object.");
        }
        
    	possiblyReset();
        this.pathCondition.addClauseAssumeAliases(referenceSymbolic, getResolution(aliasOrigin), aliasObject.clone());
        ++this.nPushedClauses;
    }

    /**
     * Assumes the resolution of a symbolic reference to null.  
     * Its effects are refining all the symbolic references with 
     * same origin, and adding a clause to the path condition.
     * 
     * @param referenceSymbolic the {@link ReferenceSymbolic} which is resolved. It 
     *        must be {@code referenceSymbolic != null} and {@code referenceSymbolic} 
     *        must not be already resolved.
     * @throws InvalidInputException if either {@code referenceSymbolic} is {@code null}, 
     *         or the state is frozen.
     * @throws ContradictionException if {@code referenceSymbolic} is already resolved.
     */
    public void assumeNull(ReferenceSymbolic referenceSymbolic) 
    throws InvalidInputException, ContradictionException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (referenceSymbolic == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeNull with a null referenceSymbolic.");
        }
        if (resolved(referenceSymbolic)) {
            throw new ContradictionException("Attempted to invoke State.assumeNull with an already resolved referenceSymbolic.");
        }
        
    	possiblyReset();
        this.pathCondition.addClauseAssumeNull(referenceSymbolic);
        ++this.nPushedClauses;
    }

    /**
     * Assumes that a class is initialized before the 
     * start of symbolic execution.
     * 
     * @param classFile the {@link ClassFile} for the class that
     *        is assumed to be initialized. 
     *        It must be {@code classFile != null}.
     * @param klass the symbolic {@link Klass} for {@code classFile}, 
     *        or {@code null} if the initial class is not symbolic. 
     * @throws InvalidInputException if {@code classFile == null}, or
     *         the state is frozen.
     */
    public void assumeClassInitialized(ClassFile classFile, Klass klass) 
    throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (classFile == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeClassInitialized with a null classFile.");
        }
        
    	possiblyReset();
        this.pathCondition.addClauseAssumeClassInitialized(classFile, klass);
        ++this.nPushedClauses;
    }

    /**
     * Assumes that a class is not initialized before the 
     * start of symbolic execution.
     * 
     * @param classFile the {@link ClassFile} for the class that
     *        is assumed to be not initialized. 
     *        It must be {@code classFile != null}.
     * @throws InvalidInputException if {@code classFile == null}, or
     *         the state is frozen.
     */
    public void assumeClassNotInitialized(ClassFile classFile) 
    throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        if (classFile == null) {
            throw new InvalidInputException("Attempted to invoke State.assumeClassNotInitialized with a null classFile.");
        }
        
    	possiblyReset();
        this.pathCondition.addClauseAssumeClassNotInitialized(classFile);
        ++this.nPushedClauses;
    }

    /**
     * Returns the state's path condition clauses.
     * 
     * @return a read-only {@link List}{@code <}{@link Clause}{@code >} 
     * representing all the {@link Clause}s cumulated in {@code this}. 
     * It is valid until {@code this} is modified.
     */
    public List<Clause> getPathCondition() {
        return this.pathCondition.getClauses();
    }

    /**
     * Returns the path condition clauses that have been pushed since
     * the last call of {@link #resetLastPathConditionClauses()}. Used to determine
     * how many clauses have not yet been sent to the decision procedure.
     * 
     * @return a read-only {@link Iterable}{@code <}{@link Clause}{@code >} 
     * representing all the {@link Clause}s cumulated in {@code this}. 
     * It is valid until {@code this} is modified, or {@link #resetLastPathConditionClauses()}
     * is invoked.
     */
    public Iterable<Clause> getLastPathConditionPushedClauses() {
        final ListIterator<Clause> it = this.pathCondition.getClauses().listIterator();
        final int fwdEnd = this.pathCondition.getClauses().size() - this.nPushedClauses;
        for (int i = 1; i <= fwdEnd; ++i) {
            it.next();
        }
        return () -> it;
    }
    
    /**
     * Determines whether some clauses have been pushed
     * after the last call to {@link #resetLastPathConditionClauses()}.
     * 
     * @return {@code true} iff after the last call to 
     *         {@link #resetLastPathConditionClauses()}
     *         some clauses have been pushed by invoking some 
     *         {@code assumeXXX} method.
     */
    public boolean areThereNewPathConditionClauses() {
    	return (!this.wereResetLastPathConditionClauses) && this.nPushedClauses > 0;
    }

    /**
     * Resets the bookkeeping of the clauses pushed by 
     * some {@code assumeXXX} method invocation to the 
     * state's path condition.
     * This method must be invoked whenever the decision
     * procedure's current assumptions are synchronized with 
     * the state's path condition. 
     * 
     * @throws FrozenStateException if the state is frozen. 
     */
    public void resetLastPathConditionClauses() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.wereResetLastPathConditionClauses = true;
    }

    /**
     * Sets the {@link State} stuck because of a return
     * from the topmost method,
     * in the case no value must be returned.
     * 
     * @throws FrozenStateException if the state is fro 
     */
    public void setStuckReturn() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.stuck = true;
        this.exc = null;
        this.val = null;
    }

    /**
     * Sets the {@link State} stuck because of a return
     * from the topmost method.
     * 
     * @param val the return {@link Value}.
     * @throws FrozenStateException if the state is frozen.
     */
    public void setStuckReturn(Value val) throws FrozenStateException {
        setStuckReturn();
        this.val = val;
    }

    /**
     * Returns the stuck state's return value.
     * 
     * @return the {@link Value} set by a 
     *         previous call to {@link #setStuckReturn(Value)}, or {@code null} 
     *         if {@code !this.}{@link #isStuck()}
     *         or it has not been set stuck with a call to 
     *         {@link #setStuckReturn(Value)}. 
     */
    public Value getStuckReturn() {
        return this.val;
    }

    /**
     * Sets a stuck state caused by an external stop.
     * 
     * @throws FrozenStateException if the state is frozen. 
     */
    public void setStuckStop() throws FrozenStateException {
        setStuckReturn();
    }

    /**
     * Sets a stuck state caused by an unhandled throw.
     * 
     * @param exc a {@link Reference} to some instance 
     *            in this {@link State}'s heap. 
     * @throws FrozenStateException if the state is frozen.
     */
    public void setStuckException(Reference exc) throws FrozenStateException {
        setStuckReturn();
        this.exc = exc;
    }

    /**
     * Returns the stuck state's thrown exception.
     * 
     * @return the {@link Reference} set by a 
     *         previous call to {@link #setStuckException(Reference)} 
     *         or {@code null} if <code>!this.</code>{@link #isStuck()}
     *         or it has not been set stuck with a call to 
     *         {@link #setStuckException(Reference)} 
     */
    public Reference getStuckException() {
        return this.exc;
    }

    /**
     * Tests for stuck state.
     * 
     * @return {@code true} iff the state is stuck, i.e., iff 
     *         it is a leaf state in the symbolic execution tree. A stuck state is
     *         the outcome of a halting instruction, or of a return from the topmost
     *         stack frame, or of an unhandled throw.
     */
    public boolean isStuck() {
        return this.stuck;
    }
    
    /**
     * Sets the state's {@link HistoryPoint} as the
     * initial one. Also saves the current {@link HistoryPoint}
     * (the last pre-initial one) to be used later as the 
     * history point of symbolic (references to) klasses.
     * 
     * @param compact a {@code boolean}, whether the stringified
     * history point should be compact.
     * @throws FrozenStateException if the state is frozen.
     */
    private void setInitialHistoryPoint() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.lastPreInitialHistoryPoint = this.historyPoint;
        this.historyPoint = this.historyPoint.startingInitial();
    }

    /**
     * Adds a branch to the state's {@link HistoryPoint}.
     * 
     * @param additionalBranch 
     *        a {@link String} representing the identifier
     *        of the subbranch to be added to the state's
     *        {@link HistoryPoint}.
     * @throws FrozenStateException if the state is frozen.
     */
    public void addBranchToHistoryPoint(String additionalBranch) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.historyPoint = this.historyPoint.nextBranch(additionalBranch);
    }
    
    /**
     * Gets the state's {@link HistoryPoint}.
     * 
     * @return a {@link HistoryPoint}.
     */
    public HistoryPoint getHistoryPoint() {
        return this.historyPoint;
    }

    /**
     * Gets the state's branch identifier.
     * 
     * @return a {@link String} representing the 
     *         state's branch identifier.
     */
    public String getIdentifier() {
        return this.historyPoint.getBranchIdentifier();
    }

    /**
     * Sets the state's depth to {@code 1}.
     * 
     * @throws FrozenStateException if the state is frozen. 
     */
    public void resetDepth() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.depth = 1;
    }

    /**
     * Increments the state's depth by {@code 1}.
     * 
     * @throws FrozenStateException if the state is frozen. 
     */
    public void incDepth() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        ++this.depth;
    }

    /**
     * Gets the state's depth in the symbolic execution tree; the depth 
     * is the number of branches above the state.
     * 
     * @return the depth of the state as an {@code int} value
     *         ({@code 0} for the topmost state).
     */
    public int getDepth() {
        return this.depth;
    }

    /**
     * Sets the state's count to {@code 1}.
     * 
     * @throws FrozenStateException if the state is empty.
     */
    public void resetCount() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.count = 1;
    }

    /**
     * Increments the state's count by {@code 1}.
     * 
     * @throws FrozenStateException if the state is empty.
     */
    public void incCount() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        ++this.count;
    }

    /**
     * Gets the state's count.
     * 
     * @return a nonnegative {@code int} representing the 
     *         state's count.  
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Sets whether the current state was produced by 
     * a branching decision.
     * 
     * @param branchingDecision {@code true} iff the current
     * state was produced by a branching decision.
     * @throws FrozenStateException if the state is frozen.
     */
    public void setBranchingDecision(boolean branchingDecision) throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.branchingDecision = branchingDecision;
    }

    /**
     * Checks whether the state has been produced by 
     * a branching decision.
     * 
     * @return {@code true} if {@link #setBranchingDecision}
     *         was invoked with a {@code true} parameter 
     *         since the previous invocation 
     *         of {@code branchingDecision}, {@code false} 
     *         otherwise.
     * @throws FrozenStateException if the state is frozen.
     */
    public boolean branchingDecision() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final boolean retval = this.branchingDecision;

        this.branchingDecision = false;
        return retval;
    }

    /**
     * Increments the state's sequence number by {@code 1}.
     * 
     * @throws FrozenStateException if the state is empty.
     */
    public void incSequenceNumber() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.historyPoint = this.historyPoint.next();
    }

    /**
     * Gets the state's sequence number.
     * 
     * @return a nonnegative {@code int} representing the 
     *         state's sequence number.  
     */
    public int getSequenceNumber() {
        return this.historyPoint.getSequenceNumber();
    }
		
    /**
     * Returns the number of assumed object of a given class.
     * 
     * @param className a {@link String}.
     * @return the number of objects with class {@code className}
     * assumed by this state, as resulting by the state's path 
     * condition.
     */
    public int getNumAssumed(String className) {
        return this.pathCondition.getNumAssumed(className);
    }

    /**
     * Refines this state based on the path condition of another state that
     * refines (i.e., comes temporally later than) this state.
     *
     * @param stateRefining another {@link State}; it must refine this state, 
     *        meaning that this state's identifier and path condition must be prefixes 
     *        of {@code stateRefining}'s identifier and path condition.
     * @throws CannotRefineException when {@code stateRefining} does not refine 
     *         {@code this}.
     * @throws FrozenStateException if the state is frozen.
     */
    public void refine(State stateRefining) throws CannotRefineException, FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        //TODO this method doesn't work with arrays!!!
        final HistoryPoint refiningHistoryPoint = stateRefining.historyPoint;
        final PathCondition refiningPathCondition = stateRefining.pathCondition;

        //checks that stateRefining refines this state, and 
        //gets an iterator to the additional clauses
        final Iterator<Clause> iRefining;
        if (this.historyPoint.weaklyBefore(refiningHistoryPoint)) {
            iRefining = refiningPathCondition.refines(this.pathCondition);
            if (iRefining == null) {
                throw new CannotRefineException();
            }
        } else {
            throw new CannotRefineException();
        }

        //expands the heap and the static method area
        while (iRefining.hasNext()) {
            final Clause c = iRefining.next();
            if (c instanceof ClauseAssumeExpands) {
                final ClauseAssumeExpands cExp = (ClauseAssumeExpands) c;
                final long oPos = cExp.getHeapPosition();
                final Objekt o = cExp.getObjekt(); //note that the getter produces a safety copy
                this.heap.set(oPos, o);
            } else if (c instanceof ClauseAssumeClassInitialized) {
                final ClauseAssumeClassInitialized cCl = (ClauseAssumeClassInitialized) c;
                final ClassFile cf = cCl.getClassFile();
                final Klass k = cCl.getKlass(); //note that the getter produces a safety copy
                if (k != null) {
                    this.staticMethodArea.set(cf, k);
                }
            } //else do nothing
        }

        //updates the symbol factory
        this.symbolFactory = stateRefining.symbolFactory.clone();

        //finally, updates the path condition
        this.pathCondition = refiningPathCondition.clone();
    }

    /**
     * A Factory Method for creating symbolic values. The symbol
     * has as origin a local variable in the root frame.
     * 
     * @param staticType a {@link String}, the static type of the
     *        local variable from which the symbol originates.
     * @param variableName a {@link String}, the name of the local 
     *        variable in the root frame the symbol originates from.
     * @return a {@link PrimitiveSymbolic} or a {@link ReferenceSymbolic}
     *         according to {@code staticType}.
	 * @throws InvalidTypeException if {@code staticType} is not a valid type.
	 * @throws InvalidInputException if the state is frozen or {@code variableName == null || staticType == null}.
     */
    public Symbolic createSymbolLocalVariable(String staticType, String variableName) 
    throws InvalidTypeException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.symbolFactory.createSymbolLocalVariable(this.historyPoint, staticType, variableName); //TODO should the history point be the *initial* one (this.lastPreInitialHistoryPoint)???
    }
	
    /**
     * A Factory Method for creating symbolic values. The symbol
     * is a (pseudo)reference to a {@link Klass}.
     * 
     * @param historyPoint the {@link HistoryPoint} of the symbol.
     * @param classFile the {@link ClassFile} for the {@link Klass} 
     *        to be referred.
     * @return a {@link KlassPseudoReference}.
     * @throws InvalidInputException if the state is frozen or 
     *         {@code historyPoint == null || classFile == null}.
     */
    public KlassPseudoReference createSymbolKlassPseudoReference(HistoryPoint historyPoint, ClassFile classFile) 
    throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.symbolFactory.createSymbolKlassPseudoReference(historyPoint, classFile);
    }

    /**
     * A Factory Method for creating symbolic values. The symbol
     * has as origin a field in an object (non array). 
     * 
     * @param staticType a {@link String}, the static type of the
     *        local variable from which the symbol originates.
     * @param container a {@link ReferenceSymbolic}, the container object
     *        the symbol originates from. It must not refer an array.
     * @param fieldName a {@link String}, the name of the field in the 
     *        container object the symbol originates from. It must not be {@code null}.
     * @param fieldClass a {@link String}, the name of the class where the 
     *        field is declared. It must not be {@code null}.
     * @return a {@link PrimitiveSymbolic} or a {@link ReferenceSymbolic}
     *         according to {@code staticType}.
     * @throws InvalidTypeException if {@code staticType} is not a valid type.
     * @throws InvalidInputException if the state is frozen or 
     *         {@code staticType == null || fieldName == null || fieldClass == null}.
     * @throws NullPointerException if {@code container == null}.
     */
    public Symbolic createSymbolMemberField(String staticType, ReferenceSymbolic container, String fieldName, String fieldClass) 
    throws InvalidTypeException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.symbolFactory.createSymbolMemberField(staticType, container, fieldName, fieldClass);
    }

    /**
     * A Factory Method for creating symbolic values. The symbol
     * has as origin a slot in an array.  
     * 
     * @param staticType a {@link String}, the static type of the
     *        local variable from which the symbol originates.
     * @param container a {@link ReferenceSymbolic}, the container object
     *        the symbol originates from. It must refer an array.
     * @param index a {@link Primitive}, the index of the slot in the 
     *        container array this symbol originates from.
     * @return a {@link PrimitiveSymbolic} or a {@link ReferenceSymbolic}
     *         according to {@code staticType}.
     * @throws InvalidTypeException if {@code staticType} is not a valid type.
     * @throws InvalidInputException if the state is frozen or {@code index == null || staticType == null}.
     * @throws NullPointerException if {@code container == null}.
     */
    public Symbolic createSymbolMemberArray(String staticType, ReferenceSymbolic container, Primitive index) 
    throws InvalidTypeException, InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.symbolFactory.createSymbolMemberArray(staticType, container, index);
    }

    /**
     * A Factory Method for creating symbolic values. The symbol
     * has as origin the length of an array.  
     * 
     * @param container a {@link ReferenceSymbolic}, the container object
     *        the symbol originates from. It must refer an array.
     * @return a {@link PrimitiveSymbolic}.
     * @throws FrozenStateException if the state is frozen.
     * @throws NullPointerException if {@code container == null}.
     */
    public PrimitiveSymbolic createSymbolMemberArrayLength(ReferenceSymbolic container) 
    throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.symbolFactory.createSymbolMemberArrayLength(container);
    }

    /**
     * A Factory Method for creating symbolic values. The symbol
     * has as origin the identity hash code of a symbolic object.  
     * 
     * @param object a symbolic {@link Objekt}, the object whose identity hash 
     *        code is this symbol. It must be an instance or an array.
     * @return a {@link PrimitiveSymbolic}.
     * @throws InvalidInputException if the state is frozen or {@code object == null}, or {@code object} has
     *         both its origin and its history point set to {@code null} (note that in 
     *         such case {@code object} is ill-formed).
     */
    public PrimitiveSymbolic createSymbolIdentityHashCode(Objekt object) 
    throws InvalidInputException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        return this.symbolFactory.createSymbolIdentityHashCode(object);
    }

    /**
     * Checks whether the next bytecode must be WIDE 
     * and resets the WIDE test.
     * 
     * @return {@code true} iff invoked for the first 
     *         time after a {@link #setWide()} call. 
     * @throws FrozenStateException if the state is frozen.
     */
    public boolean nextWide() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        final boolean wide = this.wide;
        this.wide = false;
        return wide;
    }

    /**
     * Remembers that the next bytecode must be WIDE.
     * 
     * @throws FrozenStateException if the state is frozen.
     */
    public void setWide() throws FrozenStateException {
    	if (this.frozen) {
    		throw new FrozenStateException();
    	}
        this.wide = true;
    }
    
    /**
     * Collects and disposes the unreachable heap objects.
     * 
     * @throws FrozenStateException if the state is frozen.
     */
    public void gc() throws FrozenStateException {
        final Set<Long> doNotDispose = new ReachableObjectsCollector().reachable(this, true);
        this.heap.disposeExcept(doNotDispose);
    }
    
    /**
     * Getter for garbage collection.
     * 
     * @return the {@link Collection}{@code <}{@link ReferenceConcrete}{@code >}
     *         of all the references to string literals.
     */
    Collection<ReferenceConcrete> getStringLiterals() {
        return this.stringLiterals.values();
    }
    
    /**
     * Getter for garbage collection.
     * 
     * @return the {@link Collection}{@code <}{@link ReferenceConcrete}{@code >}
     *         of all the references to {@link Instance_JAVA_CLASS} (non primitive).
     */
    Collection<ReferenceConcrete> getClasses() {
        return this.classes.values();
    }
    
    /**
     * Getter for garbage collection.
     * 
     * @return the {@link Collection}{@code <}{@link ReferenceConcrete}{@code >}
     *         of all the references to {@link Instance_JAVA_CLASS} (primitive).
     */
    Collection<ReferenceConcrete> getClassesPrimitive() {
        return this.classesPrimitive.values();
    }
    
    /**
     * Getter for garbage collection.
     * 
     * @return the {@link Collection}{@code <}{@link ReferenceConcrete}{@code >}
     *         of all the references to {@link Instance} of {@link java.lang.ClassLoader}.
     */
    Collection<ReferenceConcrete> getClassLoaders() {
        return this.classLoaders;
    }
    
    /**
     * Getter for garbage collection.
     * 
     * @return the {@link Collection}{@code <}{@link ReferenceConcrete}{@code >}
     *         of all the references to {@link Instance} of {@link java.lang.invoke.MethodType}.
     */
    Collection<ReferenceConcrete> getMethodTypes() {
        return this.methodTypes.values();
    }
    
    @SuppressWarnings("restriction")
	private State deepCopyHeapExcluded() {
        final State o;
        try {
            o = (State) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
        
        //stringLiterals
        o.stringLiterals = new HashMap<>(o.stringLiterals);

        //classes
        o.classes = new HashMap<>(o.classes);

        //classesPrimitive
        o.classesPrimitive = new HashMap<>(o.classesPrimitive);
        
        //methodTypes
        o.methodTypes = new HashMap<>(o.methodTypes);
        
        //files
        try {
            o.files = new HashMap<>();
            final Field fisPath = FileInputStream.class.getDeclaredField("path");
            fisPath.setAccessible(true);
            final Field fosPath = FileOutputStream.class.getDeclaredField("path");
            fosPath.setAccessible(true);
            for (Map.Entry<Integer, Object> entry : this.files.entrySet()) {
                if (entry.getValue() instanceof FileInputStream) {
                    final FileInputStream fisClone;
                    if (entry.getKey() == 0) {
                        fisClone = (FileInputStream) entry.getValue();
                    } else {
                        final FileInputStream fisThis = (FileInputStream) entry.getValue();
                        final String path = (String) fisPath.get(fisThis);
                        fisClone = new FileInputStream(path);
                        fisClone.skip(fisThis.getChannel().position());
                    }
                    o.files.put(entry.getKey(), fisClone);
                } else { //entry.getValue() instanceof FileOutputStream
                    final FileOutputStream fosClone;
                    if (entry.getKey() == 1 ||  entry.getKey() == 2) {
                        fosClone = (FileOutputStream) entry.getValue();
                    } else {
                        final FileOutputStream fosThis = (FileOutputStream) entry.getValue();
                        final String path = (String) fosPath.get(fosThis);
                        fosClone = new FileOutputStream(path);
                    }
                    o.files.put(entry.getKey(), fosClone);
                }
            }
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | 
                 IllegalAccessException | IOException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        
        //allocatedMemory
        o.allocatedMemory = new HashMap<>();
        for (Map.Entry<Long, MemoryBlock> entry : this.allocatedMemory.entrySet()) {
            final long baseLevelAddress = entry.getKey();
            final long oldMemoryBlockAddress = entry.getValue().address;
            final long size = entry.getValue().size;
            final long newMemoryBlockAddress = unsafe().allocateMemory(size);
            unsafe().copyMemory(oldMemoryBlockAddress, newMemoryBlockAddress, size);
            o.allocatedMemory.put(baseLevelAddress, new MemoryBlock(newMemoryBlockAddress, size));
        }
        
        //zipFiles
        o.zipFiles = new HashMap<>();
        try {
            final Method methodOpen = java.util.zip.ZipFile.class.getDeclaredMethod("open", String.class, int.class, long.class, boolean.class);
            methodOpen.setAccessible(true);
            for (Map.Entry<Long, ZipFile> entry : this.zipFiles.entrySet()) {
                final ZipFile zf = entry.getValue();
                final String name = zf.name;
                final int mode = zf.mode;
                final long lastModified = zf.lastModified;
                final boolean usemmap = zf.usemmap;
                final long jzfileNew = (long) methodOpen.invoke(null, name, mode, lastModified, usemmap);
                final ZipFile zfNew = new ZipFile(jzfileNew, name, mode, lastModified, usemmap);
                o.zipFiles.put(entry.getKey(), zfNew);
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | 
                 NoSuchMethodException | SecurityException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        
        //zipFileEntries
        o.zipFileEntries = new HashMap<>();
        try {
            final Method methodGetEntry = java.util.zip.ZipFile.class.getDeclaredMethod("getEntry", long.class, byte[].class, boolean.class);
            methodGetEntry.setAccessible(true);
            for (Map.Entry<Long, ZipFileEntry> entry : this.zipFileEntries.entrySet()) {
                final ZipFileEntry zfe = entry.getValue();
                final long _jzfile = zfe.jzfile;
                final long jzfile = o.zipFiles.get(_jzfile).jzfile;
                final byte[] name = zfe.name;
                final long jzentryNew = (long) methodGetEntry.invoke(null, jzfile, name, true);
                final ZipFileEntry zfeNew = new ZipFileEntry(jzentryNew, _jzfile, name);
                o.zipFileEntries.put(entry.getKey(), zfeNew);
            }
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | 
                 IllegalArgumentException | InvocationTargetException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }
        
        //inflaters
        o.inflaters = new HashMap<>();
        try {
            final Method methodInit = java.util.zip.Inflater.class.getDeclaredMethod("init", boolean.class);
            methodInit.setAccessible(true);
            final Method methodSetDictionary = java.util.zip.Inflater.class.getDeclaredMethod("setDictionary", long.class, byte[].class, int.class, int.class);
            methodSetDictionary.setAccessible(true);
            for (Map.Entry<Long, Inflater> entry : this.inflaters.entrySet()) {
                final Inflater inf = entry.getValue();
                final long addressNew = (long) methodInit.invoke(null, inf.nowrap);
                final Inflater infNew;
                if (inf.dictionary == null) {
                    infNew = new Inflater(addressNew, inf.nowrap);
                } else {
                    methodSetDictionary.invoke(null, addressNew, inf.dictionary, 0, inf.dictionary.length);
                    infNew = new Inflater(addressNew, inf.nowrap, inf.dictionary, 0, inf.dictionary.length);
                }
                o.inflaters.put(entry.getKey(), infNew);
            }
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | 
                 IllegalArgumentException | InvocationTargetException e) {
            //this should never happen
            throw new UnexpectedInternalException(e);
        }

        //perfCounters
        o.perfCounters = new HashSet<>(o.perfCounters);

        //stack
        o.stack = o.stack.clone();

        //classHierarchy
        o.classHierarchy = o.classHierarchy.clone();

        //staticStore
        o.staticMethodArea = o.staticMethodArea.clone();

        //pathCondition
        o.pathCondition = o.pathCondition.clone();

        //exc and val are values, so they are immutable

        //symbolFactory
        o.symbolFactory = o.symbolFactory.clone();
        
        //linkInvokers
        o.linkInvokers = new HashMap<>(o.linkInvokers);
        
        //linkAppendices
        o.linkAppendices = new HashMap<>(o.linkAppendices);
        
        //all other members are immutable

        return o;
    }
    
    public State lazyClone() {
    	final State o = deepCopyHeapExcluded();
    	
        //heap
        o.heap = o.heap.lazyClone();
        
        return o;
    }
    
    @SuppressWarnings("restriction")
	@Override
    protected void finalize() {
        //closes all files except stdin/out/err
        for (Map.Entry<Integer, Object> fileEntry : this.files.entrySet()) {
            final int fileId = fileEntry.getKey();
            if (fileId == 0 || fileId == 1 || fileId == 2) {
                continue;
            }
            final Object file = fileEntry.getValue();
            try {
                if (file instanceof FileInputStream) {
                    ((FileInputStream) file).close();
                } else { //file instanceof FileOutputStream
                    ((FileOutputStream) file).close();
                }
            } catch (IOException e) {
                //go on with the next file
            }
        }
        
        //deallocates all memory blocks
        for (MemoryBlock memoryBlock : this.allocatedMemory.values()) {
        	unsafe().freeMemory(memoryBlock.address);
        }
    }

    @Override
    public String toString() {
        String tmp = "[ID:\"" + this.historyPoint.toString() + "\", ";
        if (this.isStuck()) {
            tmp += "Stuck, ";
            if (this.exc != null) 
                tmp += "Raised:" + this.exc.toString() + ", ";
            else if (this.val != null)
                tmp += "Return:" + this.val.toString() + ", ";
        } else {
            try {
                tmp += "CurrentMethod:" + this.stack.currentFrame().getCurrentMethodSignature() + ", ";
                tmp += "ProgramCounter:" + this.stack.currentFrame().getProgramCounter() + ", ";
            } catch (ThreadStackEmptyException e) {
                //does nothing
            }
            tmp += "Stack:" + this.stack.toString() + ", ";
        }
        tmp += "PathCondition:'" + this.pathCondition.toString() + "', ";
        tmp += "StaticMethodArea:" + this.staticMethodArea.toString() + ", ";
        tmp += "Heap:" + this.heap.toString() + "]";
        return(tmp);
    }

    @Override
    public State clone() {
        final State o = deepCopyHeapExcluded();

        //heap
        o.heap = o.heap.clone();
                
        return o;
    }
}
