/*
Copyright (c) 2008 Helsinki University of Technology (TKK)

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

import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.List;
import java.util.Iterator;

/**
 * Basic instrumentation class that enables symbolic execution.
 * The instumentation is meant for sequential programs only and
 * does not add support for symbolic object references.
 *
 * @author ktkahkon
 */
public class BasicInstrumentation extends Instrumentation
{
	
    @Override
    protected void initializeMainMethod (Stmt statement)
    {
        LinkedList<Value> values = new LinkedList<Value>();

        values.add(StringConstant.v(address));
        values.add(IntConstant.v(port));
        values.add(IntConstant.v(executionVerbosity));
        values.add(StringConstant.v(solver));
        values.add(StringConstant.v(heuristicClass));
        values.add(StringConstant.v(heuristicMethod));

        InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(initialize.makeRef(), values);
        Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

        units.insertBefore(newStatement, statement);
    }


    
    @Override
    protected void instrumentGotoStatement (Stmt statement)
    {
        InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(executeGoto.makeRef());
        Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

        units.insertBefore(newStatement, statement);
    }



    @Override
    protected void instrumentAssignStatement (Stmt statement)
    {
        if (statement.containsInvokeExpr()) {
            InvokeExpr expression = (InvokeExpr)statement.getInvokeExpr();

            if (!expression.toString().contains("tester.LCT")) 
                handleFunctionCallAssignments(statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: int getInteger()>"))
                addSymbolicInput("integer", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: boolean getBoolean()>"))
                addSymbolicInput("boolean", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: char getChar()>"))
                addSymbolicInput("character", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: byte getByte()>"))
                addSymbolicInput("byte", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: short getShort()>"))
                addSymbolicInput("short", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: long getLong()>"))
                addSymbolicInput("long", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: int getInteger(int,int)>"))
                addLimitedSymbolicInput("integer", statement);
            else if (expression.getMethod().getSignature().equals("<fi.hut.ics.lime.tester.LCT: short getShort(int,int)>"))
                addLimitedSymbolicInput("short", statement);
            else
                handleFunctionCallAssignments(statement);
        }
        else {
            AssignStmt a = (AssignStmt)statement;
            Value v1     = a.getLeftOp();
            Value v2     = a.getRightOp();

            // case: symbolic local = symbolic local
            if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof Local && canBeSymbolic(v2)) {
                Local l1 = (Local)v1;
                Local l2 = (Local)v2;
                Local s1 = getSymbolicLocal(l1);
                Local s2 = getSymbolicLocal(l2);

                Stmt newStatement = Jimple.v().newAssignStmt(s1, s2);
                units.insertBefore (newStatement, statement);
            }
            // case: a = b [op] c
            // Soot should first assign fields to local variables, so handling only locals is enough.
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof BinopExpr) {
                Local l                     = (Local) v1;
                BinopExpr b                 = (BinopExpr) v2;
                LinkedList<Value> values    = new LinkedList<Value>();
                Value op1                   = b.getOp1();
                Value op2                   = b.getOp2();
                Local s0                    = getSymbolicLocal(l);
                String operator             = b.getSymbol().trim();
                Local valueTemp             = getSymbolicLocal("s_value_temp");
                Local valueTemp2            = getSymbolicLocal("s_value_temp_2");
                Local valueTemp3            = getSymbolicLocal("s_value_temp_3");

                values.add(StringConstant.v(operator));

                if (op1 instanceof Local && canBeSymbolic(op1))
                    values.add(getSymbolicLocal((Local)op1));
                else if (op1 instanceof Constant)
                    values.add(StringConstant.v(op1.toString()));

                if (op2 instanceof Local && canBeSymbolic(op2))
                    values.add(getSymbolicLocal((Local)op2));
                else if (op2 instanceof Constant)
                    values.add(StringConstant.v(op2.toString()));

                // NOTE: the second temp value could be eliminated if only bitvectors were used to solve constraints
                // NOTE2: temp3 value could be eliminated if a check whether the symbolic value if null is made
                //        (and if it is null, the value is replaced with the concrete value)
                values.add(valueTemp2);
                values.add(valueTemp3);
                values.add(valueTemp);

                if (values.size() != 6) {
                    // set to concrete if assignment does not use symbolic variables
                    if (!canBeSymbolic(op1) || !canBeSymbolic(op2)) {
                        InvokeExpr ie = concreteToString(v1);
                        Stmt s  = Jimple.v().newAssignStmt(s0, ie);
                        units.insertAfter(s, statement);
                        return;
                    }
                    else {
                        System.err.println("INSTRUMENTER ERROR: problem with binop assignment. Op1 or op2 is not local or constant.");
                        return;
                    }
                }

                values.add(StringConstant.v(v1.getType().toString()));

                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(assignment.makeRef(), values);
                Stmt newStatement        = Jimple.v().newAssignStmt(s0, newExpression);
                units.insertAfter(newStatement, statement);

                newExpression = concreteToString(v1);
                newStatement  = Jimple.v().newAssignStmt(valueTemp, newExpression);
                units.insertAfter(newStatement, statement);

                newExpression = concreteToString(op2);
                newStatement  = Jimple.v().newAssignStmt(valueTemp3, newExpression);
                units.insertBefore(newStatement, statement);

                newExpression = concreteToString(op1);
                newStatement  = Jimple.v().newAssignStmt(valueTemp2, newExpression);
                units.insertBefore(newStatement, statement);

                if (operator.equals("/") && op2 instanceof Local && canBeSymbolic(op2)) {
                    newExpression = Jimple.v().newStaticInvokeExpr(divisionCheck.makeRef(), getSymbolicLocal((Local)op2), valueTemp3);
                    newStatement  = Jimple.v().newInvokeStmt(newExpression);
                    units.insertBefore(newStatement, statement);
                }
            }
            // case: symbolic local = -symbolic local
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof NegExpr) {
                NegExpr ne = (NegExpr)v2;
                Value op = ne.getOp();

                if (canBeSymbolic(op) && op instanceof Local) {
                    Local l                     = (Local) v1;
                    Local l2                    = (Local) op;
                    LinkedList<Value> values    = new LinkedList<Value>();
                    String operator             = "-";
                    Local valueTemp             = getSymbolicLocal("s_value_temp");

                    values.add(StringConstant.v(operator));
                    values.add(StringConstant.v("0"));
                    values.add(getSymbolicLocal(l2));

                    values.add(StringConstant.v("0"));
                    values.add(StringConstant.v("0"));
                    values.add(valueTemp);

                    values.add(StringConstant.v(v1.getType().toString()));

                    InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(assignment.makeRef(), values);
                    Stmt newStatement        = Jimple.v().newAssignStmt(getSymbolicLocal(l), newExpression);
                    units.insertAfter(newStatement, statement);

                    newExpression = concreteToString(v1);
                    newStatement  = Jimple.v().newAssignStmt(valueTemp, newExpression);
                    units.insertAfter(newStatement, statement);

                }
            }
            // case: symbolic local = constant
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof Constant) {
                Local s           = getSymbolicLocal((Local)v1);
                Stmt newStatement = Jimple.v().newAssignStmt(s, StringConstant.v(v2.toString()));

                units.insertBefore(newStatement, statement);
            }
            // case: symbolic field = symbolic local
            else if (v1 instanceof InstanceFieldRef && canBeSymbolic(v1) && v2 instanceof Local && canBeSymbolic(v2)) {
                InstanceFieldRef r      = (InstanceFieldRef)v1;
                Value base              = r.getBase();
                Local s                 = getSymbolicLocal((Local)v2);

                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(base);
                values.add(StringConstant.v(r.getField().getName()));
                values.add(s);
                
                Expr newExpression = Jimple.v().newStaticInvokeExpr(putField.makeRef(), values);
                Stmt newStatement  = Jimple.v().newInvokeStmt(newExpression);
                units.insertBefore(newStatement, statement);
            }
            // case: symbolic local = symbolic field
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof InstanceFieldRef && canBeSymbolic(v2)) {
                InstanceFieldRef r      = (InstanceFieldRef)v2;
                Value base              = r.getBase();
                Local s                 = getSymbolicLocal((Local)v1);

                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(base);
                values.add(StringConstant.v(r.getField().getName()));

                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(getField.makeRef(), values);
                Stmt newStatement  = Jimple.v().newAssignStmt(s, newExpression);
                units.insertBefore(newStatement, statement);
            }
            // case: symbolic field = constant
            else if (v1 instanceof InstanceFieldRef && canBeSymbolic(v1) && v2 instanceof Constant) {
                InstanceFieldRef r      = (InstanceFieldRef)v1;
                Value base              = r.getBase();

                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(base);
                values.add(StringConstant.v(r.getField().getName()));
                values.add(StringConstant.v(v2.toString()));

                Expr newExpression = Jimple.v().newStaticInvokeExpr(putField.makeRef(), values);
                Stmt newStatement  = Jimple.v().newInvokeStmt(newExpression);
                units.insertBefore(newStatement, statement);

            }
            // case: symbolic static field = symbolic local
            else if (v1 instanceof StaticFieldRef && v2 instanceof Local && canBeSymbolic(v2)) {
                StaticFieldRef r        = (StaticFieldRef)v1;
                Local s                 = getSymbolicLocal((Local)v2);
                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(StringConstant.v(r.toString()));
                values.add(s);

                Expr newExpression = Jimple.v().newStaticInvokeExpr(putStaticField.makeRef(), values);
                Stmt newStatement  = Jimple.v().newInvokeStmt(newExpression);
                units.insertBefore(newStatement, statement);
            }
            // case: symbolic local = symbolic static field
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof StaticFieldRef) {
                StaticFieldRef r        = (StaticFieldRef)v2;
                Local s                 = getSymbolicLocal((Local)v1);

                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(StringConstant.v(r.toString()));

                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(getStaticField.makeRef(), values);
                Stmt newStatement  = Jimple.v().newAssignStmt(s, newExpression);
                units.insertBefore(newStatement, statement);
            }
            // case: static field = constant
            else if (v1 instanceof StaticFieldRef && canBeSymbolic(v1) && v2 instanceof Constant) {
                StaticFieldRef r        = (StaticFieldRef)v1;
                
                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(StringConstant.v(r.toString()));
                values.add(StringConstant.v(v2.toString()));

                Expr newExpression = Jimple.v().newStaticInvokeExpr(putStaticField.makeRef(), values);
                Stmt newStatement  = Jimple.v().newInvokeStmt(newExpression);
                units.insertBefore(newStatement, statement);
            }
            // case: array[i] = local
            else if (v1 instanceof ArrayRef && v2 instanceof Local && canBeSymbolic(v2)) {
                ArrayRef r              = (ArrayRef)v1;
                Value base              = r.getBase();
                Local s                 = getSymbolicLocal((Local)v2);

                LinkedList<Value> values    = new LinkedList<Value>();

                values.add(base);
                values.add(r.getIndex());
                values.add(s);

                Expr newExpression = Jimple.v().newStaticInvokeExpr(putArray.makeRef(), values);
                Stmt newStatement  = Jimple.v().newInvokeStmt(newExpression);
                units.insertBefore(newStatement, statement);
            }
            // case: array[i] = constant
            else if (v1 instanceof ArrayRef && v2 instanceof Constant) {
                ArrayRef r              = (ArrayRef)v1;

                if (canBeSymbolic(r.getType())) {
                    Value base              = r.getBase();
                    
                    LinkedList<Value> values    = new LinkedList<Value>();

                    values.add(base);
                    values.add(r.getIndex());
                    values.add(StringConstant.v(v2.toString()));

                    Expr newExpression = Jimple.v().newStaticInvokeExpr(putArray.makeRef(), values);
                    Stmt newStatement  = Jimple.v().newInvokeStmt(newExpression);
                    units.insertBefore(newStatement, statement);
                }
            }
            // case: symbolic local = array[i]
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof ArrayRef) {
                ArrayRef r              = (ArrayRef)v2;

                if (canBeSymbolic(r.getType())) {
                    Value base              = r.getBase();
                    Local s                 = getSymbolicLocal((Local)v1);

                    LinkedList<Value> values    = new LinkedList<Value>();

                    values.add(base);
                    values.add(r.getIndex());

                    InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(getArray.makeRef(), values);
                    Stmt newStatement  = Jimple.v().newAssignStmt(s, newExpression);
                    units.insertBefore(newStatement, statement);
                }
            } 
            // case: local = lengthof array
            else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof LengthExpr) {
                Local s = getSymbolicLocal((Local)v1);

                InvokeExpr newExpression = concreteToString(v1);
                Stmt newStatement        = Jimple.v().newAssignStmt (s, newExpression);
                units.insertAfter (newStatement, statement);
            }
             // case: local = cast
             // TODO: test this more and implement rest of the cases!
             else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof CastExpr) {
                Local l1 = (Local)v1;
                CastExpr ce = (CastExpr)v2;
                Value v = ce.getOp();

                if (v instanceof Local && canBeSymbolic(v)) {
                    Local l2 = (Local)v;
                    Local s1 = getSymbolicLocal(l1);
                    Local s2 = getSymbolicLocal(l2);

//                    Stmt newStatement = Jimple.v().newAssignStmt(s1, s2);
//                    units.insertBefore (newStatement, statement);
                    //----

                    LinkedList<Value> values    = new LinkedList<Value>();
                    Local valueTemp             = getSymbolicLocal("s_value_temp");

                    values.add(StringConstant.v("+"));
                    values.add(StringConstant.v("0"));
                    values.add(getSymbolicLocal(l2));
                    values.add(StringConstant.v("0"));
                    values.add(StringConstant.v("0"));
                    values.add(valueTemp);

                    values.add(StringConstant.v(v1.getType().toString()));

                    InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(assignment.makeRef(), values);
                    Stmt newStatement        = Jimple.v().newAssignStmt(getSymbolicLocal(l1), newExpression);
                    units.insertAfter(newStatement, statement);

                    newExpression = concreteToString(v1);
                    newStatement  = Jimple.v().newAssignStmt(valueTemp, newExpression);
                    units.insertAfter(newStatement, statement);


                }
                //TODO: static field refs?
                else if (v instanceof InstanceFieldRef && canBeSymbolic(v)) {
                    InstanceFieldRef r      = (InstanceFieldRef)v;
                    Value base              = r.getBase();
                    Local s                 = getSymbolicLocal((Local)v1);

                    LinkedList<Value> values    = new LinkedList<Value>();

                    values.add(base);
                    values.add(StringConstant.v(r.getField().getName()));

                    InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(getField.makeRef(), values);
                    Stmt newStatement  = Jimple.v().newAssignStmt(s, newExpression);
                    units.insertBefore(newStatement, statement);
                }
                else if (!canBeSymbolic(v)) {
                    Expr newExpression = concreteToString(v1);
                    Stmt newStatement  = Jimple.v().newAssignStmt(getSymbolicLocal(l1), newExpression);
                    units.insertAfter(newStatement, statement);
                }

             }
             // case local boolean = Y instanceof X
             else if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof InstanceOfExpr) {
                Local s = getSymbolicLocal((Local)v1);

                InvokeExpr newExpression = concreteToString(v1);
                Stmt newStatement        = Jimple.v().newAssignStmt(s, newExpression);

                units.insertAfter(newStatement, statement);
             }
             // fallback for some cases. The instrumentation should not proceed to these cases
             else if (v1 instanceof Local && canBeSymbolic(v1))
             {
                printIncompleteInstrumentationWarning(statement);

                Local s = getSymbolicLocal((Local)v1);

                InvokeExpr newExpression = concreteToString(v1);
                Stmt newStatement        = Jimple.v().newAssignStmt(s, newExpression);

                units.insertAfter(newStatement, statement);
             }
        }
    }


    @Override
    protected void instrumentIfStatement (Stmt statement)
    {
        LinkedList<Value> values  = new LinkedList<Value>();
        LinkedList<Value> values2;
        IfStmt i                  = (IfStmt)statement;
        BinopExpr b               = (BinopExpr) i.getCondition();
        Value op1                 = b.getOp1();
        Value op2                 = b.getOp2();
        boolean s1Added           = false;
        boolean s2Added           = false;

        String c                  = b.toString();
        StringTokenizer tokenizer = new StringTokenizer(c);

        String first              = tokenizer.nextToken();
                                    tokenizer.nextToken();
        String third              = tokenizer.nextToken();

    //    if (canBeSymbolic(op1) && canBeSymbolic(op2)) {
            values.add(StringConstant.v(b.getSymbol().trim()));

            if (op1 instanceof Local && canBeSymbolic(op1)) {
                Local s1 = getSymbolicLocal((Local)op1);
                s1Added  = true;

                values.add(s1);
            }
            else // should be constant
                values.add(StringConstant.v(first));

            if (op2 instanceof Local && canBeSymbolic(op2)) {
                Local s2 = getSymbolicLocal((Local)op2);
                s2Added  = true;

                values.add(s2);
            }
            else
                values.add(StringConstant.v(third));


            Local valueTemp = getSymbolicLocal("s_value_temp");
            Local valueTemp2 = getSymbolicLocal("s_value_temp_2");


            values.add(valueTemp);
            values.add(valueTemp2);

            if (isCoverageCountingActive)
                values.add(IntConstant.v(Instrumentation.conditionID));
            else
                values.add(IntConstant.v(-1));

            values2 = new LinkedList<Value>(values);
            values.add(StringConstant.v("true"));
            values2.add(StringConstant.v("false"));

          //  if (s1Added || s2Added) {
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(condition.makeRef(), values);
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);

                Stmt newStatement2 = Jimple.v().newGotoStmt(statement);

                units.insertBefore(newStatement2, newStatement);

                newExpression = Jimple.v().newStaticInvokeExpr(condition.makeRef(), values2);
                Stmt newStatement3 = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement3, newStatement2);

                Stmt newIf = Jimple.v().newIfStmt(i.getCondition(), newStatement);
                units.insertBefore(newIf,newStatement3);


                newExpression = concreteToString(op1);

                if (newExpression != null)
                    newStatement  = Jimple.v().newAssignStmt(valueTemp, newExpression);
                else
                    newStatement  = Jimple.v().newAssignStmt(valueTemp, StringConstant.v("null"));

                units.insertBefore(newStatement, newIf);

                newExpression = concreteToString(op2);

                if (newExpression != null)
                    newStatement  = Jimple.v().newAssignStmt(valueTemp2, newExpression);
                else
                    newStatement  = Jimple.v().newAssignStmt(valueTemp2, StringConstant.v("null"));
                
                units.insertBefore(newStatement, newIf);

                if (isCoverageCountingActive)
                    Instrumentation.conditionID++;
        //    }
       // }
    }



    @Override
    protected void instrumentSwitchStatement (Stmt statement)
    {
        LinkedList<Value> values   = new LinkedList<Value>();
        LookupSwitchStmt l         = (LookupSwitchStmt)statement;
        Local s                    = getSymbolicLocal((Local)l.getKey());
        // TODO: FIXME real type
        List<?> list               = l.getLookupValues();
        String lookupValues        = "";

        int i = 0;
        int counter = 0;
        while (i < list.size()) {
            lookupValues = lookupValues + " " + list.get(i);
            i++;
            counter++;
        }

        values.add(s);
        values.add(l.getKey());
        values.add(StringConstant.v(lookupValues));

        if (isCoverageCountingActive)
            values.add(IntConstant.v(Instrumentation.conditionID));
        else
            values.add(IntConstant.v(-1));

        InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr (executeSwitch.makeRef(), values);
        Stmt newStatement        = Jimple.v().newInvokeStmt (newExpression);

        units.insertBefore(newStatement, statement);

        if (isCoverageCountingActive)
            Instrumentation.conditionID += counter;
    }



    @Override
    protected void instrumentTableSwitchStatement (Stmt statement)
    {
        LinkedList<Value> values   = new LinkedList<Value>();
        TableSwitchStmt t          = (TableSwitchStmt)statement;
        Local s                    = getSymbolicLocal((Local)t.getKey());
        String targets             = "";

        int i = t.getLowIndex();
        int counter = 0;
        while (i <= t.getHighIndex()) {
            targets = targets + " " + i;
            i++;
            counter++;
        }

        values.add(s);
        values.add(t.getKey());
        values.add(StringConstant.v(targets));

        if (isCoverageCountingActive)
            values.add(IntConstant.v(Instrumentation.conditionID));
        else
            values.add(IntConstant.v(-1));

        InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr (executeSwitch.makeRef(), values);
        Stmt newStatement        = Jimple.v().newInvokeStmt (newExpression);

        units.insertBefore(newStatement, statement);

        if (isCoverageCountingActive)
            Instrumentation.conditionID += counter;
    }



    @Override
    protected void instrumentInvokeStatement (Stmt statement)
    {
        InvokeExpr iexpr = (InvokeExpr) ((InvokeStmt)statement).getInvokeExpr();

        if (iexpr instanceof StaticInvokeExpr) {
            SootMethod target = ((StaticInvokeExpr)iexpr).getMethod();

            if (target.getSignature().equals("<java.lang.System: void exit(int)>")) {
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(end.makeRef(),iexpr.getArg(0));
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);
            }
            else if (target.getSignature().equals("<fi.hut.ics.lime.tester.LCT: void dropTest()>")) {
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(dropTest.makeRef());
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);
            }
        }

        for (int i = 0; i < iexpr.getArgCount(); i++) {
            Value v = iexpr.getArg(i);

            if (v instanceof Local && canBeSymbolic(v)) {
                Local s                  = getSymbolicLocal((Local)v);
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(put.makeRef(),
                                                                          StringConstant.v(iexpr.getMethod().getName()),
                                                                          s);
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);
            }
            else if (v instanceof Constant && canBeSymbolic(v)) {
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(put.makeRef(),
                                                                          StringConstant.v(iexpr.getMethod().getName()),
                                                                          StringConstant.v(v.toString()));
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);
            }
        }
    }


    @Override
    protected void instrumentIdentityStatement (Stmt statement)
    {
        IdentityStmt identity = (IdentityStmt)statement;
        Value v1              = identity.getLeftOp();
        Value v2              = identity.getRightOp();

        if (v1 instanceof Local && canBeSymbolic(v1) && v2 instanceof ParameterRef) {
            Local s                  = getSymbolicLocal((Local)v1);

            Iterator<Unit> it = units.iterator();

            Stmt st = null;
            while (it.hasNext()) {
                st = (Stmt)it.next();

                if (!(st instanceof IdentityStmt))
                    break;
            }

            if (!(st instanceof IdentityStmt)) {
                InvokeExpr newExpression = concreteToString(v1);
                Stmt newStatement        = Jimple.v().newAssignStmt(s, newExpression);
                units.insertBefore(newStatement, st);

                newExpression            = Jimple.v().newStaticInvokeExpr(get.makeRef(), StringConstant.v(method.getName()), s);
                Stmt newStatement2       = Jimple.v().newAssignStmt(s, newExpression);
                units.insertAfter(newStatement2, newStatement);
            }
        }
    }



    @Override
    protected void instrumentReturnStatement (Stmt statement)
    {
        if (isMainMethod) {
            InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(end.makeRef(),IntConstant.v(0));
            Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

            units.insertBefore(newStatement, statement);
        }
        else {
            ReturnStmt r = (ReturnStmt)statement;
            Value v      = r.getOp();

            if (v instanceof Local && canBeSymbolic(v)) {
                Local s                  = getSymbolicLocal((Local)v);
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(put.makeRef(), StringConstant.v(method.getName()), s);
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);
            }
        }
    }



    @Override
    protected void instrumentReturnVoidStatement (Stmt statement)
    {
        if (isMainMethod) {
            InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr (end.makeRef(),IntConstant.v(0));
            Stmt newStatement        = Jimple.v().newInvokeStmt (newExpression);

            units.insertBefore(newStatement, statement);
        }
    }


    protected void handleFunctionCallAssignments (Stmt statement)
    {
        AssignStmt a = (AssignStmt)statement;
        Value v1     = a.getLeftOp();
        Value v2     = a.getRightOp();

        // Assumed here that v2 is always the invoke expression. This should not cause any problems.
        InvokeExpr invoke = (InvokeExpr)v2;

        for (int i = 0; i < invoke.getArgCount(); i++) {
            Value v = invoke.getArg(i);

            if (v instanceof Local && canBeSymbolic(v)) {
                Local s                  = getSymbolicLocal((Local)v);
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(put.makeRef(),
                                                                          StringConstant.v(invoke.getMethod().getName()),
                                                                          s);
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore(newStatement, statement);
            }
            else if (v instanceof Constant && canBeSymbolic(v)) {
                InvokeExpr newExpression = Jimple.v().newStaticInvokeExpr(put.makeRef(),
                                                                          StringConstant.v(invoke.getMethod().getName()),
                                                                          StringConstant.v(v.toString()));
                Stmt newStatement        = Jimple.v().newInvokeStmt(newExpression);

                units.insertBefore (newStatement, statement);
            }
        }

        if (v1 instanceof Local && canBeSymbolic(v1)) {
            Local s                  = getSymbolicLocal((Local)v1);
            InvokeExpr newExpression = concreteToString(v1);
            Stmt newStatement        = Jimple.v().newAssignStmt(s, newExpression);

            units.insertAfter(newStatement, statement);

            newExpression      = Jimple.v().newStaticInvokeExpr (get.makeRef(), StringConstant.v(invoke.getMethod().getName()), s);
            Stmt newStatement2 = Jimple.v().newAssignStmt(s,newExpression);

            units.insertAfter (newStatement2, newStatement);
        }
    }
}
