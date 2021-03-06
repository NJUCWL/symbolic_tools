/*
Copyright (c) 2008 - 2009 Helsinki University of Technology (TKK)

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
 */

package fi.hut.ics.lime.tester.instrumentation;

import soot.*;
import soot.jimple.*;
import soot.util.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Properties;

/**
 * Abstract class that can be used as a basis for creating different
 * instrumentation approaches.
 *
 * This instrumentation approach adds new shadow local variables and shadow
 * fields to each concrete counterpart that can be symbolic (double and float
 * are not yet supported).
 *
 * @author ktkahkon
 */
public abstract class Instrumentation extends BodyTransformer
{
    static SootClass  initializer;
    static SootClass  symbolic;
    static SootClass  LCTmethods;
    static SootClass  input;
    static SootClass  methodCall;
    static SootClass  object;
    static SootClass  symbolicFieldMapper;
    static SootClass  special;

    static SootClass  javaInteger;
    static SootClass  javaBoolean;
    static SootClass  javaCharacter;
    static SootClass  javaByte;
    static SootClass  javaShort;
    static SootClass  javaLong;

    static SootMethod end;
    static SootMethod initialize;

    static SootMethod executeGoto;
    static SootMethod symbolicInput;
    static SootMethod concreteIntegerInput;
    static SootMethod concreteBooleanInput;
    static SootMethod concreteShortInput;
    static SootMethod concreteLongInput;
    static SootMethod concreteByteInput;
    static SootMethod concreteCharInput;

    static SootMethod limitedSymbolicInput;
    static SootMethod limitedIntegerInput;
    static SootMethod limitedShortInput;
    
    static SootMethod assignment;
    static SootMethod dropTest;

    static SootMethod put;
    static SootMethod get;
    static SootMethod putArray;
    static SootMethod getArray;

    static SootMethod condition;
    static SootMethod divisionCheck;

    static SootMethod executeSwitch;

    static SootMethod initializeObject;
    static SootMethod objectCondition;
 
    static SootMethod int2String;
    static SootMethod bool2String;
    static SootMethod byte2String;
    static SootMethod char2String;
    static SootMethod short2String;
    static SootMethod long2String;

    static SootMethod putField;
    static SootMethod getField;
    static SootMethod putStaticField;
    static SootMethod getStaticField;

    static {
        javaInteger     = Scene.v().loadClassAndSupport("java.lang.Integer");
        javaBoolean     = Scene.v().loadClassAndSupport("java.lang.Boolean");
        javaByte        = Scene.v().loadClassAndSupport("java.lang.Byte");
        javaCharacter   = Scene.v().loadClassAndSupport("java.lang.Character");
        javaShort       = Scene.v().loadClassAndSupport("java.lang.Short");
        javaLong        = Scene.v().loadClassAndSupport("java.lang.Long");

        int2String      = javaInteger.getMethod("java.lang.String toString(int)");
        bool2String     = javaBoolean.getMethod("java.lang.String toString(boolean)");
        byte2String     = javaByte.getMethod("java.lang.String toString(byte)");
        char2String     = javaCharacter.getMethod("java.lang.String toString(char)");
        short2String    = javaShort.getMethod("java.lang.String toString(short)");
        long2String     = javaLong.getMethod("java.lang.String toString(long)");

        initializer     = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.Initializer");
        symbolic        = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.BasicStatement");
        input           = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.InputStatement");
        methodCall      = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.CallStatement");
        object          = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.ObjectStatement");
        LCTmethods      = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.LCTStatement");
        symbolicFieldMapper     = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.SymbolicValueMapper");

        special         = Scene.v().loadClassAndSupport("fi.hut.ics.lime.tester.symbolicexecution.SpecialStatement");

        end             = initializer.getMethod("void end(int)");
        initialize      = initializer.getMethod("void initialize(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)");

        executeGoto     = symbolic.getMethod("void executeGoto()");
        symbolicInput   = input.getMethod("java.lang.String getSymbolicInput(java.lang.String)");

        assignment      = symbolic.getMethod("java.lang.String executeAssignment(java.lang.String," +
                                                                                 "java.lang.String," +
                                                                                 "java.lang.String," +
                                                                                 "java.lang.String," +
                                                                                 "java.lang.String," +
                                                                                 "java.lang.String," +
                                                                                 "java.lang.String)");

        put             = methodCall.getMethod("void putArgument(java.lang.String,java.lang.String)");
        get             = methodCall.getMethod("java.lang.String getArgument(java.lang.String,java.lang.String)");
        

        condition       = symbolic.getMethod("void executeCondition(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String)");
        divisionCheck   = special.getMethod("void checkDivisionByZero(java.lang.String,java.lang.String)");

        executeSwitch   = symbolic.getMethod("void executeSwitch(java.lang.String,int,java.lang.String,int)");
        
        initializeObject     = object.getMethod("void initializeObject(java.lang.Object)");
        objectCondition      = object.getMethod("void objectCondition(java.lang.String,java.lang.Object,java.lang.Object,int)");

        concreteIntegerInput = input.getMethod("int getConcreteInteger()");
        concreteBooleanInput = input.getMethod("boolean getConcreteBoolean()");
        concreteShortInput   = input.getMethod("short getConcreteShort()");
        concreteLongInput    = input.getMethod("long getConcreteLong()");
        concreteByteInput    = input.getMethod("byte getConcreteByte()");
        concreteCharInput    = input.getMethod("char getConcreteChar()");

        limitedSymbolicInput = input.getMethod("java.lang.String getSymbolicInput(int,int,java.lang.String)");
        limitedIntegerInput  = input.getMethod("int getConcreteInteger(int,int)");
        limitedShortInput    = input.getMethod("int getConcreteShort(int,int)");

        dropTest            = LCTmethods.getMethod("void dropTest()");

        putField        = symbolicFieldMapper.getMethod("void addFieldMapping(java.lang.Object,java.lang.String,java.lang.String)");
        getField        = symbolicFieldMapper.getMethod("java.lang.String getFieldMapping(java.lang.Object,java.lang.String)");
        putStaticField  = symbolicFieldMapper.getMethod("void addStaticFieldMapping(java.lang.String,java.lang.String)");
        getStaticField  = symbolicFieldMapper.getMethod("java.lang.String getStaticFieldMapping(java.lang.String)");
        putArray        = symbolicFieldMapper.getMethod("void addArrayElementMapping(java.lang.Object,int,java.lang.String)");
        getArray        = symbolicFieldMapper.getMethod("java.lang.String getArrayElementMapping(java.lang.Object,int)");
    }

    protected static LinkedList<String> classes = new LinkedList<String>();

    protected Chain<Local>          locals;
    protected PatchingChain<Unit>   units;
    protected SootMethod            method;
    protected SootClass             sootClass;
    protected boolean               isMainMethod;

    private boolean                 isIntSymbolic;
    private boolean                 isBooleanSymbolic;
    private boolean                 isCharSymbolic;
    private boolean                 isByteSymbolic;
    private boolean                 isShortSymbolic;
    private boolean                 isLongSymbolic;

    protected boolean               isConcurrent;
    protected String                address;
    protected String                solver;
    protected int                   port;
    protected static int            conditionID;

    protected int                   executionVerbosity;
    protected int                   instrumentationVerbosity;

    protected String                heuristicClass;
    protected String                heuristicMethod;

    protected boolean               isCoverageCountingActive;


    abstract void initializeMainMethod (Stmt statement);
    abstract void instrumentGotoStatement (Stmt statement);
    abstract void instrumentAssignStatement (Stmt statement);
    abstract void instrumentIfStatement (Stmt statement);
    abstract void instrumentSwitchStatement (Stmt statement);
    abstract void instrumentTableSwitchStatement (Stmt statement);
    abstract void instrumentInvokeStatement (Stmt statement);
    abstract void instrumentIdentityStatement (Stmt statement);
    abstract void instrumentReturnStatement (Stmt statement);
    abstract void instrumentReturnVoidStatement (Stmt statement);


    /**
     * Constructor that reads properties files to initialize the data needed
     * for instrumentation.
     */
    protected Instrumentation()
    {
        isIntSymbolic             = true;
        isBooleanSymbolic         = true;
        isCharSymbolic            = true;
        isByteSymbolic            = true;
        isShortSymbolic           = true;
        isLongSymbolic            = true;
        
        address                   = "localhost";
        port                      = 4322;
        conditionID               = 0;
        executionVerbosity        = 1;
        instrumentationVerbosity  = 1;

        Properties properties     = loadProperties("testerproperties/usersettings.properties","testerproperties/defaultsettings.properties");

        address                   = properties.getProperty("serverIP");
        solver                    = properties.getProperty("solver");
        port                      = Integer.valueOf(properties.getProperty("serverPort")).intValue();
        executionVerbosity        = Integer.valueOf(properties.getProperty("executionVerbosity")).intValue();
        instrumentationVerbosity  = Integer.valueOf(properties.getProperty("instrumentationVerbosity")).intValue();
        heuristicClass            = properties.getProperty("heuristicClass");
        heuristicMethod           = properties.getProperty("heuristicMethod");

        if (instrumentationVerbosity > 1) {
            System.out.println("SERVER ADDRESS: " + address);
            System.out.println("SERVER PORT: " + port);
        }
    }


    public static int getNumberOfBranches()
    {
        return Instrumentation.conditionID;
    }


    @SuppressWarnings("unchecked")
    @Override
    protected void internalTransform(Body body, String phaseName, Map options)
    {
        method       = body.getMethod();
        locals       = body.getLocals();
        units        = body.getUnits();
        sootClass    = method.getDeclaringClass();
        isMainMethod = method.getSubSignature().equals("void main(java.lang.String[])");

        //TODO: make skipping specific for LCT core classes
        if (method.getSignature().contains("toString") || method.getSignature().contains("hashCode")
//                                                       || method.getSignature().contains("equals")
                                                       || method.getSignature().contains("clinit")) {
            System.out.println("Skipping this method.");

            return;
        }


        //NOTE: this may cause the branch coverage metric to be wrong if the user wants to test classes containing
        //      the following strings.
        if (sootClass.getName().contains("fi.hut.ics.lime") || sootClass.getName().contains("org.aspectj")
                                                            || sootClass.getName().contains("CALLSpecification")
                                                            || sootClass.getName().contains("RETURNSpecification")
                                                            || sootClass.getName().contains("AjcClosure"))
            isCoverageCountingActive = false;
        else
            isCoverageCountingActive = true;


        if (!isCoverageCountingActive && instrumentationVerbosity > 1)
            System.out.println("Not counting branch coverage for this method.");

        addSymbolicLocals();

        Iterator<Unit> iStatement    = units.snapshotIterator();
        boolean isInitialized  = false;

        while (iStatement.hasNext()) {
            Stmt statement = (Stmt)iStatement.next();

            /* Initialization of symbolic execution at the start of the main
             * method. Soot requires that the arguments must be set (using IdentityStmts)
             * before initialization method can be added. */
            if (!isInitialized && isMainMethod && !(statement instanceof IdentityStmt)) {
                initializeMainMethod(statement);
                isInitialized = true;
            }

            if (statement instanceof AssignStmt)
                instrumentAssignStatement(statement);
            else if (statement instanceof IfStmt)
                instrumentIfStatement(statement);
            else if (statement instanceof LookupSwitchStmt)
                instrumentSwitchStatement(statement);
            else if (statement instanceof TableSwitchStmt)
                instrumentTableSwitchStatement(statement);
            else if (statement instanceof InvokeStmt)
                instrumentInvokeStatement(statement);
            else if (statement instanceof IdentityStmt)
                instrumentIdentityStatement(statement);
            else if (statement instanceof ReturnStmt) 
                instrumentReturnStatement(statement);
            else if (statement instanceof ReturnVoidStmt)
                instrumentReturnVoidStatement(statement);
            else if (statement instanceof GotoStmt)
                instrumentGotoStatement(statement);
        }
    }


    
    protected Local getSymbolicLocal (Local l)
    {
        return getSymbolicLocal("s_" + l.getName());
    }



    protected Local getSymbolicLocal (String name)
    {
        boolean symbolicFound   = false;
        Iterator<Local> i              = locals.iterator();
        Local symbolicLocal     = null;

        while (i.hasNext() && !symbolicFound) {
            symbolicLocal = (Local)i.next();

            if (symbolicLocal.getName().equals(name))
                symbolicFound = true;
        }

        if (symbolicFound == false) {
            System.out.println("ERROR: could not find symbolic counterpart of a local variable " + name);
            System.out.println("Locals in the method: ");

            i = locals.iterator();

            while (i.hasNext()) {
                symbolicLocal = (Local)i.next();
                System.out.println(symbolicLocal.getName());
            }
            int j = 0;
            j = j / 0;
            System.exit(-1);
        }

        return symbolicLocal;
    }



    private void addSymbolicLocals()
    {
        LinkedList<Local> temp = new LinkedList<Local>();
        Iterator<Local> i             = locals.iterator();

        while (i.hasNext()) {
            Value value = (Value)i.next();

            if (canBeSymbolic(value)) {
                Local l             = (Local)value;
                Local symbolicLocal = Jimple.v().newLocal("s_" + l.getName(), RefType.v("java.lang.String"));
                temp.add(symbolicLocal);
            }
        }

        Local myTemp = Jimple.v().newLocal("s_obj_temp", RefType.v("java.lang.Object"));
        temp.add(myTemp);

        Local myValueTemp = Jimple.v().newLocal("s_value_temp", RefType.v("java.lang.String"));
        temp.add(myValueTemp);

        Local myValueTemp2 = Jimple.v().newLocal("s_value_temp_2", RefType.v("java.lang.String"));
        temp.add(myValueTemp2);

        Local myValueTemp3 = Jimple.v().newLocal("s_value_temp_3", RefType.v("java.lang.String"));
        temp.add(myValueTemp3);


        while (temp.size() > 0)
            locals.addFirst(temp.removeFirst());
    }

    

    protected void addSymbolicInput (String type, Stmt statement)
    {
        AssignStmt a              = (AssignStmt)statement;
        InvokeExpr symbolicExpression  = Jimple.v().newStaticInvokeExpr(symbolicInput.makeRef(), StringConstant.v(type));
        InvokeExpr concreteExpression  = null;

        if (type.startsWith("int")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(concreteIntegerInput.makeRef());
        } else if (type.startsWith("bool")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(concreteBooleanInput.makeRef());
        } else if (type.startsWith("short")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(concreteShortInput.makeRef());
        } else if (type.startsWith("long")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(concreteLongInput.makeRef());
        } else if (type.startsWith("byte")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(concreteByteInput.makeRef());
        } else if (type.startsWith("char")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(concreteCharInput.makeRef());
        } else {
            System.err.println("ERROR: Could not find suitable supported primitive input type.");
        }

        // field assignments are done using temp locals, so this case covers both alternatives
        if (a.getLeftOp() instanceof Local) {
            Local local            = (Local)a.getLeftOp();
            Local symbolicLocal    = getSymbolicLocal(local);
            Stmt symbolicStatement = Jimple.v().newAssignStmt(symbolicLocal, symbolicExpression);

            units.insertAfter(symbolicStatement, statement);

            Stmt concreteStatement = Jimple.v().newAssignStmt(local, concreteExpression);

            units.swapWith(statement, concreteStatement);

        }
        else {
            System.err.println("WARNING: possible problem with assingning symbolic values");
        }
    }



    protected void addLimitedSymbolicInput (String type, Stmt statement)
    {
        AssignStmt a                = (AssignStmt)statement;
        InvokeExpr expression       = (InvokeExpr)statement.getInvokeExpr();

        @SuppressWarnings("unchecked")
        List<Value> temp = expression.getArgs(); 
        @SuppressWarnings("unchecked")
        List<Value> list = expression.getArgs();
        
        list.add(StringConstant.v(type));

        InvokeExpr symbolicExpression  = Jimple.v().newStaticInvokeExpr(limitedSymbolicInput.makeRef(), list);
        InvokeExpr concreteExpression  = null;

        if (type.startsWith("int")) {
            concreteExpression  = Jimple.v().newStaticInvokeExpr(limitedIntegerInput.makeRef(), temp);
        } 
        else if (type.startsWith("short")) { 
            concreteExpression  = Jimple.v().newStaticInvokeExpr(limitedShortInput.makeRef(), temp);
        }
        else {
            System.err.println("ERROR: Could not find suitable supported primitive input type (with min and max defined).");
        }

        if (a.getLeftOp() instanceof Local) {
            Local local            = (Local)a.getLeftOp();
            Local symbolicLocal    = getSymbolicLocal(local);
            Stmt symbolicStatement = Jimple.v().newAssignStmt(symbolicLocal, symbolicExpression);

            units.insertAfter(symbolicStatement, statement);

            Stmt concreteStatement = Jimple.v().newAssignStmt(local, concreteExpression);

            units.swapWith(statement, concreteStatement);

        }
        else {
            System.err.println("WARNING: possible problem with assingning symbolic values");
        }
    }




    protected boolean canBeSymbolic (Value v)
    {
        return canBeSymbolic(v.getType());
    }



    protected boolean canBeSymbolic (Type t)
    {
        if (t instanceof IntType && isIntSymbolic)
            return true;

        if (t instanceof BooleanType && isBooleanSymbolic)
            return true;

        if (t instanceof CharType && isCharSymbolic)
            return true;

        if (t instanceof ByteType && isByteSymbolic)
            return true;

        if (t instanceof ShortType && isShortSymbolic)
            return true;

        if (t instanceof LongType && isLongSymbolic)
            return true;

        return false;
    }


    protected InvokeExpr concreteToString (Value v)
    {
        if (v.getType() instanceof IntType)
            return Jimple.v().newStaticInvokeExpr(int2String.makeRef(), v);
        else if (v.getType() instanceof BooleanType)
            return Jimple.v().newStaticInvokeExpr(bool2String.makeRef(), v);
        else if (v.getType() instanceof CharType)
            return Jimple.v().newStaticInvokeExpr(char2String.makeRef(), v);
        else if (v.getType() instanceof ByteType)
            return Jimple.v().newStaticInvokeExpr(byte2String.makeRef(), v);
        else if (v.getType() instanceof ShortType)
            return Jimple.v().newStaticInvokeExpr(short2String.makeRef(), v);
        else if (v.getType() instanceof LongType)
            return Jimple.v().newStaticInvokeExpr(long2String.makeRef(), v);
     //   else {
          //  System.err.println("ERROR: Trying to convert unsupported variable type to string.");
           // System.exit(-1);
       // }

        return null;
    }


    /**
     * Warning message that can be displayed when instrumentation may be
     * incomplete.
     *
     * @param statement   Jimple statement that caused the problem
     */
    protected void printIncompleteInstrumentationWarning(Stmt statement)
    {
        System.err.println("************************************************");
        System.err.println("WARNING: Fallback case used in instrumentation.");
        System.err.println("         This should not happen but it does not");
        System.err.println("         prevent testing. However, in some parts");
        System.err.println("         the testing will be inaccurate. Please");
        System.err.println("         report this bug to the developers.");
        System.err.println(" ");
        System.err.println(statement.toString());
        System.err.println("************************************************");
    }


    /**
     * A helper method to read two given .properties files.
     *
     * @param mainFile primary location for properties
     * @param defaultFile default location for properties
     * @return Returns a Properties instance that uses the given files
     */
    private Properties loadProperties(String mainFile, String defaultFile)
    {
        Properties defaults = new Properties();
        java.net.URL url = ClassLoader.getSystemResource(defaultFile);

        try {
            defaults.load(url.openStream());
        } catch (Exception e) {
            System.out.println("Unable to open " + defaultFile);
            System.exit(0);
        }

        Properties result = new Properties(defaults);
        url = ClassLoader.getSystemResource(mainFile);

        try {
            result.load(url.openStream());
        } catch (Exception e) {
            System.out.println("Unable to open " + mainFile);
            System.exit(0);
        }

        return result;
    }
}
