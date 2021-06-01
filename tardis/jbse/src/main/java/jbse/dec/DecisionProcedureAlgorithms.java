package jbse.dec;

import static jbse.bc.ClassLoaders.CLASSLOADER_APP;
import static jbse.common.Type.className;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

import jbse.bc.ClassFile;
import jbse.bc.ClassHierarchy;
import jbse.bc.Signature;
import jbse.bc.exc.BadClassFileVersionException;
import jbse.bc.exc.ClassFileIllFormedException;
import jbse.bc.exc.ClassFileNotAccessibleException;
import jbse.bc.exc.ClassFileNotFoundException;
import jbse.bc.exc.IncompatibleClassFileException;
import jbse.bc.exc.PleaseLoadClassException;
import jbse.bc.exc.WrongClassNameException;
import jbse.common.Type;
import jbse.common.exc.InvalidInputException;
import jbse.common.exc.UnexpectedInternalException;
import jbse.dec.exc.DecisionException;
import jbse.mem.Array;
import jbse.mem.Clause;
import jbse.mem.ClauseAssumeExpands;
import jbse.mem.Objekt;
import jbse.mem.State;
import jbse.mem.SwitchTable;
import jbse.mem.Util;
import jbse.tree.DecisionAlternative_XALOAD;
import jbse.tree.DecisionAlternative_XALOAD_Out;
import jbse.tree.DecisionAlternative_XALOAD_Resolved;
import jbse.tree.DecisionAlternative_XASTORE;
import jbse.tree.DecisionAlternative_XCMPY;
import jbse.tree.DecisionAlternative_XCMPY.Values;
import jbse.tree.DecisionAlternative_IFX;
import jbse.tree.DecisionAlternative_IFX_False;
import jbse.tree.DecisionAlternative_IFX_True;
import jbse.tree.DecisionAlternative_XLOAD_GETX;
import jbse.tree.DecisionAlternative_XLOAD_GETX_Expands;
import jbse.tree.DecisionAlternative_XLOAD_GETX_Resolved;
import jbse.tree.DecisionAlternative_XNEWARRAY;
import jbse.tree.DecisionAlternative_XNEWARRAY_Ok;
import jbse.tree.DecisionAlternative_XNEWARRAY_Wrong;
import jbse.tree.DecisionAlternative_XSWITCH;
import jbse.val.Any;
import jbse.val.Calculator;
import jbse.val.Expression;
import jbse.val.HistoryPoint;
import jbse.val.Operator;
import jbse.val.Primitive;
import jbse.val.Reference;
import jbse.val.ReferenceSymbolic;
import jbse.val.ReferenceSymbolicApply;
import jbse.val.Simplex;
import jbse.val.Term;
import jbse.val.Value;
import jbse.val.WideningConversion;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidTypeException;

/**
 * A {@link DecisionProcedureAlgorithms} decorates a {@link DecisionProcedure} 
 * by adding to it a number of higher-level methods which ease the calculations 
 * of {@link DecisionAlternative}s.
 * 
 * @author Pietro Braione
 */
public class DecisionProcedureAlgorithms extends DecisionProcedureDecorator {
    /**
     * Enum for the possible (info) outcomes of a decision.
     * 
     * @author Pietro Braione
     */
    public enum Outcome {
        /** Should refine, branching decision. */
        TT(true, true), 

        /** Should refine, nonbranching decision. */
        TF(true, false), 

        /** Should not refine, branching decision. */
        FT(false, true),

        /** Should not refine, nonbranching decision. */
        FF(false, false),

        /** Should refine, no reference expansion, branching decision. */
        TTT(true, true, true),

        /** Should refine, no reference expansion, nonbranching decision. */
        TTF(true, true, false),

        /** Should refine, reference expansion, branching decision. */
        TFT(true, false, true),

        /** Should refine, reference expansion, nonbranching decision. */
        TFF(true, false, false),

        /** Should not refine, no reference expansion, branching decision. */
        FTT(false, true, true),

        /** Should not refine, no reference expansion, nonbranching decision. */
        FTF(false, true, false),

        /** Should not refine, reference expansion, branching decision. */
        FFT(false, false, true),

        /** Should not refine, reference expansion, nonbranching decision. */
        FFF(false, false, false);

        private final boolean shouldRefine;
        private final boolean noReferenceExpansion;
        private final boolean branchingDecision;

        private Outcome(boolean shouldRefine, boolean branchingDecision) {
            this.shouldRefine = shouldRefine;
            this.noReferenceExpansion = false;
            this.branchingDecision = branchingDecision;
        }

        private Outcome(boolean shouldRefine, boolean noReferenceExpansion, boolean branchingDecision) {
            this.shouldRefine = shouldRefine;
            this.noReferenceExpansion = noReferenceExpansion;
            this.branchingDecision = branchingDecision;
        }

        /**
         * Returns an outcome (reference resolution does not apply).
         * 
         * @param shouldRefine {@code true} iff should refine.
         * @param branching {@code true} iff the decision is a 
         *        branching one. 
         * @return a suitable outcome,  
         *         encapsulating the values of {@code shouldRefine}
         *         and {@code branching}.
         */
        public static Outcome val(boolean shouldRefine, boolean branching) {
            if (shouldRefine && branching) {
                return TT;
            } else if (shouldRefine && !branching) {
                return TF;
            } else if (!shouldRefine && branching) {
                return FT;
            } else { //if (!shouldRefine && !branching)
                return FF;
            }
        }

        /**
         * Returns an outcome (reference resolution applies).
         * 
         * @param shouldRefine {@code true} iff should refine.
         * @param noReferenceExpansion {@code true} iff 
         *        the reference has not been
         *        expanded (it is partially resolved).
         * @param branching {@code true} iff the decision is a 
         *        branching one. 
         * @return a suitable outcome,  
         *         encapsulating the values of {@code shouldRefine},
         *         {@code partialReferenceResolution} and {@code branching}.
         */
        public static Outcome val(boolean shouldRefine, boolean noReferenceExpansion, boolean branching) {
            if (shouldRefine && noReferenceExpansion && branching) {
                return TTT;
            } else if (shouldRefine && noReferenceExpansion && !branching) {
                return TTF;
            } else if (shouldRefine && !noReferenceExpansion && branching) {
                return TFT;
            } else if (shouldRefine && !noReferenceExpansion && !branching) {
                return TFF;
            } else if (!shouldRefine && noReferenceExpansion && branching) {
                return FTT;
            } else if (!shouldRefine && noReferenceExpansion && !branching) {
                return FTF;
            } else if (!shouldRefine && !noReferenceExpansion && branching) {
                return FFT;
            } else { //if (!shouldRefine && !partialReferenceResolution && !branching)
                return FFF;
            }
        }

        /**
         * Should the generated states be refined?
         * 
         * @return {@code true} iff the generated states must be refined;
         *         this happens when there is more than one outcome, or
         *         some symbolic reference has been expanded.
         */
        public boolean shouldRefine() {
            return this.shouldRefine;
        }

        /**
         * Is a reference resolution partial (because it has not been expanded)?
         * 
         * @return {@code true} iff a reference resolution is suspect because
         *         <em>partial</em>, i.e., because the reference is not resolved
         *         by expansion. This happens when no concrete 
         *         class is compatible with a symbolic reference's static type according to
         *         the symbolic execution's constraints (which is an indicator of
         *         badly specified constraints), or because the constraints forbid  
         *         the reference to be expanded (which might be the consequence of a 
         *         representation invariant of the data structure).
         */
        public boolean noReferenceExpansion() {
            if (this == TT || this == TF || this == FT || this == FF) {
                throw new UnexpectedInternalException(this.toString() + " carries no reference expansion information."); //TODO throw a better exception
            }
            return this.noReferenceExpansion;
        }

        /**
         * Was the decision a branching one? 
         * 
         * @return {@code true} iff the decision taken 
         *         was <em>branching</em>, i.e., it has
         *         not a single, fixed outcome.
         */
        public boolean branchingDecision() {
            return this.branchingDecision;
        }
    }

    protected final Calculator calc;

    public DecisionProcedureAlgorithms(DecisionProcedure component, Calculator calc) {
        super(component);
        this.calc = calc;
    }

    /**
     * Decides a condition for "branch if integer comparison" bytecodes.
     * 
     * @param condition a {@link Primitive} representing a logical value or clause.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_IFX}{@code >}, 
     *            where the method will put a {@link DecisionAlternative_IFX_True} object
     *            iff {@code condition} does not contradict the current assumptions, and 
     *            a {@link DecisionAlternative_IFX_False} object iff
     *            {@code condition.}{@link Primitive#not() not()} is an {@link Expression} that
     *            does not contradict the current assumptions. Note that the two situations
     *            are not mutually exclusive (they are if {@code condition} is concrete).
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    //TODO should be final?
    public Outcome decide_IFX(Primitive condition, SortedSet<DecisionAlternative_IFX> result)
    throws InvalidInputException, DecisionException {
        if (condition == null || result == null) {
            throw new InvalidInputException("decide_IFX invoked with a null parameter.");
        }
        if (condition.getType() != Type.BOOLEAN) {
            throw new InvalidInputException("decide_IFX condition has type " + condition.getType());
        }
        if (condition instanceof Simplex) {
            decide_IFX_Concrete((Simplex) condition, result);
            return Outcome.FF;
        } else {		
            final Outcome o = decide_IFX_Nonconcrete(condition, result);
            return o;
        }
    }

    private void decide_IFX_Concrete(Simplex condition, SortedSet<DecisionAlternative_IFX> result) {
        final boolean conditionBoolean = (Boolean) condition.getActualValue();
        result.add(DecisionAlternative_IFX.toConcrete(conditionBoolean));
    }

    private boolean isAny(Primitive p) {
        return (p instanceof Any || 
        (p instanceof WideningConversion && ((WideningConversion) p).getArg() instanceof Any));
    }

    protected Outcome decide_IFX_Nonconcrete(Primitive condition, SortedSet<DecisionAlternative_IFX> result) 
    throws DecisionException {	
        final boolean shouldRefine;
        final DecisionAlternative_IFX T = DecisionAlternative_IFX.toNonconcrete(true);
        final DecisionAlternative_IFX F = DecisionAlternative_IFX.toNonconcrete(false);

        //TODO what if condition is neither Simplex, nor Any, nor Expression (i.e., FunctionApplication, Widening/NarrowingConversion, PrimitiveSymbolic, Term)?
        try {
            final Expression exp = (Expression) condition; 
            //this implementation saves one sat check in 50% cases
            //(it exploits the fact that if exp is unsat 
            //exp.not() is valid)
            if (isAny(exp.getFirstOperand()) || isAny(exp.getSecondOperand())) {
                result.add(T);
                result.add(F);
                shouldRefine = false; //"don't care" does not require refinement
            } else if (isSat(exp)) {
                result.add(T);
                final Expression expNot = (Expression) condition.not(); 
                if (isSat(expNot)) {
                    result.add(F);
                }
                shouldRefine = (result.size() > 1);
            } else {
                //exp is unsat, thus its negation is valid
                result.add(F);
                shouldRefine = false;
            }
        } catch (InvalidTypeException | InvalidInputException e) {
            //this should never happen as arguments have been checked by the caller
            throw new UnexpectedInternalException(e);
        }
        return Outcome.val(shouldRefine, true);
    }

    /**
     * Decides a comparison for comparison bytecodes.
     * 
     * @param val1 a {@link Primitive}.
     * @param val2 another {@link Primitive}.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XCMPY}{@code >}, 
     *            which the method will update by adding to it a {@link DecisionAlternative_XCMPY_Gt} object 
     *            (respectively, {@link DecisionAlternative_XCMPY_Eq}, {@link DecisionAlternative_XCMPY_Lt})
     *            iff {@code val1.gt(val2)} (respectively, {@code val1.eq(val2)}, 
     *            {@code val1.lt(val2)}) does not contradict the current assumptions. 
     *            Note that the three conditions are not mutually exclusive (they are when {@code val1} and 
     *            {@code val2} are concrete).
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    //TODO should be final?
    public Outcome decide_XCMPY(Primitive val1, Primitive val2, SortedSet<DecisionAlternative_XCMPY> result)
    throws InvalidInputException, DecisionException {
        if (val1 == null || val2 == null || result == null) {
            throw new InvalidInputException("decide_XCMPY invoked with a null parameter.");
        }
        try {
            Operator.typeCheck(Operator.EQ, val1.getType(), val2.getType());
        } catch (InvalidTypeException e) {
            throw new InvalidInputException("decide_XCMPY invoked with noncomparable parameters.");
        }
        if ((val1 instanceof Simplex) && (val2 instanceof Simplex)) {
            decide_XCMPY_Concrete((Simplex) val1, (Simplex) val2, result);
            return Outcome.FF;
        } else {
            final Outcome o = decide_XCMPY_Nonconcrete(val1, val2, result);
            return o;
        }
    }

    private void decide_XCMPY_Concrete(Simplex val1, Simplex val2, SortedSet<DecisionAlternative_XCMPY> result) {
        try {
            final Simplex conditionGt = (Simplex) val1.gt(val2);
            final boolean conditionGtValue = (Boolean) conditionGt.getActualValue();
            if (conditionGtValue) {
                result.add(DecisionAlternative_XCMPY.toConcrete(Values.GT));
            } else {
                final Simplex conditionEq = (Simplex) val1.eq(val2);
                final boolean conditionEqValue = (Boolean) conditionEq.getActualValue();
                if (conditionEqValue) {
                    result.add(DecisionAlternative_XCMPY.toConcrete(Values.EQ));
                } else {
                    result.add(DecisionAlternative_XCMPY.toConcrete(Values.LT));
                }
            }
        } catch (InvalidTypeException | InvalidOperandException e) {
            //this should never happen as arguments have been checked by the caller
            throw new UnexpectedInternalException(e);
        }
    }

    protected Outcome decide_XCMPY_Nonconcrete(Primitive val1, Primitive val2, SortedSet<DecisionAlternative_XCMPY> result) 
    throws DecisionException {
        final boolean shouldRefine;
        final DecisionAlternative_XCMPY GT = DecisionAlternative_XCMPY.toNonconcrete(Values.GT);
        final DecisionAlternative_XCMPY EQ = DecisionAlternative_XCMPY.toNonconcrete(Values.EQ);
        final DecisionAlternative_XCMPY LT = DecisionAlternative_XCMPY.toNonconcrete(Values.LT);

        if (isAny(val1) || isAny(val2)) {
            //1 - condition involving "don't care" values
            result.add(GT);
            result.add(EQ);
            result.add(LT);
            shouldRefine = false;
        } else {
            try {
                final Expression expGT = (Expression) val1.gt(val2);
                final Expression expEQ = (Expression) val1.eq(val2);
                final Expression expLT = (Expression) val1.lt(val2);

                //this implementation saves one sat check in 33% cases
                //(it exploits the fact that if both val1 > val2 and 
                //val1 = val2 are unsat, then val1 < val2 is valid)
                if (isSat(expGT)) {
                    result.add(GT);
                    if (isSat(expEQ)) {
                        result.add(EQ);
                    }
                    if (isSat(expLT)) {
                        result.add(LT); 
                    }
                } else if (isSat(expEQ)) { //expGT is unsat, so either expEQ or expLT, or both, are SAT 
                    result.add(EQ);
                    if (isSat(expLT)) {
                        result.add(LT); 
                    }
                } else {
                    //both expGT and expEQ are unsat; so expLT is valid
                    result.add(LT);
                }
                shouldRefine = (result.size() > 1);
            } catch (InvalidTypeException | InvalidOperandException | InvalidInputException e) {
                //this should never happen as arguments have been checked by the caller
                throw new UnexpectedInternalException(e);
            }
        }
        return Outcome.val(shouldRefine, true);
    }

    /**
     * Decides a table or a range for switch bytecodes.
     * 
     * @param selector a {@link Primitive} with type int. 
     * @param tab a {@link SwitchTable}.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XSWITCH}{@code >} 
     *            where the method will put the {@link DecisionAlternative_XSWITCH} objects {@code s} 
     *            such that the equality of {@code selector.}{@link Primitive#eq(Primitive) eq}{@code (s.}{@link DecisionAlternative_XSWITCH#value() value()}{@code )}
     *            does not contradict the current assumptions.
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    //TODO should be final?
    public Outcome decide_XSWITCH(Primitive selector, SwitchTable tab, SortedSet<DecisionAlternative_XSWITCH> result)
    throws InvalidInputException, DecisionException {
        if (selector == null || tab == null || result == null) {
            throw new InvalidInputException("decide_XSWITCH invoked with a null parameter.");
        }
        if (selector.getType() != Type.INT) {
            throw new InvalidInputException("decide_XSWITCH selector has type " + selector.getType());
        }
        if (selector instanceof Simplex) {
            decide_XSWITCH_Concrete((Simplex) selector, tab, result);
            return Outcome.FF;
        } else {
            final Outcome o = decide_XSWITCH_Nonconcrete(selector, tab, result);
            return o;
        }
    }

    private void decide_XSWITCH_Concrete(Simplex selector, SwitchTable tab, SortedSet<DecisionAlternative_XSWITCH> result) {
        final int opValue = (Integer) selector.getActualValue();
        int branchCounter = 1;
        for (int i : tab) {
            if (i == opValue) { 
                result.add(DecisionAlternative_XSWITCH.toConcrete(i, branchCounter));
                return;
            }
            ++branchCounter;
        }
        //not found
        result.add(DecisionAlternative_XSWITCH.toConcreteDefault(branchCounter));
    }

    protected Outcome decide_XSWITCH_Nonconcrete(Primitive selector, SwitchTable tab, SortedSet<DecisionAlternative_XSWITCH> result) 
    throws DecisionException {
        try {
            final boolean isAny = isAny(selector);
            int branchCounter = 1;
            boolean noEntryIsSat = true; //allows to skip the last sat check
            for (int i : tab) {
                final Expression exp = (isAny ? null : (Expression) selector.eq(this.calc.valInt(i)));
                if (isAny || isSat(exp)) { 
                    result.add(DecisionAlternative_XSWITCH.toNonconcrete(i, branchCounter));
                    noEntryIsSat = false;
                }
                ++branchCounter;
            }
            if (isAny || noEntryIsSat || isSat(tab.getDefaultClause(selector))) { 
                result.add(DecisionAlternative_XSWITCH.toNonconcreteDefault(branchCounter));
            }
            final boolean shouldRefine = (!isAny && (result.size() > 1));
            return Outcome.val(shouldRefine, true);
        } catch (InvalidOperandException | InvalidTypeException | InvalidInputException e) {
            //this should never happen as arguments have been checked by the caller
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Decides array creation.
     * 
     * @param countsNonNegative a {@link Primitive} expressing the fact that the count 
     *        values popped from the operand stack are nonnegative.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XNEWARRAY}{@code >}, which the method 
     *            will update by adding to it a {@link DecisionAlternative_XNEWARRAY_Ok} 
     *            (respectively, a {@link DecisionAlternative_XNEWARRAY_Wrong}) in the case
     *            a successful (respectively, unsuccessful) creation of the array with
     *            the provided count values does not contradict the current assumptions.
     *            Note that the two situations are not mutually exclusive.
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    //TODO should be final?
    public Outcome decide_XNEWARRAY(Primitive countsNonNegative, SortedSet<DecisionAlternative_XNEWARRAY> result) 
    throws InvalidInputException, DecisionException {
        if (countsNonNegative == null || result == null) {
            throw new InvalidInputException("decide_XNEWARRAY invoked with a null parameter");
        }
        if (countsNonNegative.getType() != Type.BOOLEAN) {
            throw new InvalidInputException("decide_XNEWARRAY countsNonNegative type is " + countsNonNegative.getType());
        }
        if (countsNonNegative instanceof Simplex) {
            decide_XNEWARRAY_Concrete((Simplex) countsNonNegative, result);
            return Outcome.FF;
        } else {
            final Outcome o = decide_XNEWARRAY_Nonconcrete(countsNonNegative, result);
            return o;
        }
    }

    private void decide_XNEWARRAY_Concrete(Simplex countsNonNegative, SortedSet<DecisionAlternative_XNEWARRAY> result) {
        final boolean countsNonNegativeBoolean = (Boolean) countsNonNegative.getActualValue();
        result.add(DecisionAlternative_XNEWARRAY.toConcrete(countsNonNegativeBoolean));
    }

    protected Outcome decide_XNEWARRAY_Nonconcrete(Primitive countsNonNegative, SortedSet<DecisionAlternative_XNEWARRAY> result) 
    throws DecisionException {
        final boolean shouldRefine;
        final DecisionAlternative_XNEWARRAY OK = DecisionAlternative_XNEWARRAY.toNonconcrete(true);
        final DecisionAlternative_XNEWARRAY WRONG = DecisionAlternative_XNEWARRAY.toNonconcrete(false);

        if (countsNonNegative instanceof Any) {
            //TODO can it really happen? should we throw an exception in the case?
            result.add(WRONG);
            result.add(OK);
            shouldRefine = false;
        } else {
            //TODO what if condition is neither Simplex, nor Any, nor Expression (i.e., FunctionApplication, Widening/NarrowingConversion, PrimitiveSymbolic, Term)?
            try {
                //this implementation saves one sat check in 50% cases
                //(it exploits the fact that if exp is unsat 
                //exp.not() is valid)
                final Expression negative = (Expression) countsNonNegative.not(); 
                if (isSat(negative)) {
                    result.add(WRONG);
                    final Expression nonNegative = (Expression) countsNonNegative;
                    if (isSat(nonNegative)) {
                        result.add(OK);
                    }
                } else {
                    result.add(OK);
                }
                shouldRefine = (result.size() > 1);
            } catch (InvalidTypeException | InvalidInputException e) {
                //this should never happen as arguments have been checked by the caller
                throw new UnexpectedInternalException(e);
            }
        }
        return Outcome.val(shouldRefine, true);
    }

    /**
     * Decides a store to an array.
     * 
     * @param inRange a {@link Primitive} expressing the fact that the access
     *        index is in the interval 0..array.length. 
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XASTORE}{@code >}, which the method 
     *            will update by adding to it {@link DecisionAlternative_XASTORE#IN} 
     *            or {@link DecisionAlternative_XASTORE#OUT} in the case the access may be 
     *            in range or out of range. Note that the two situations are not
     *            mutually exclusive.
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    public Outcome decide_XASTORE(Primitive inRange, SortedSet<DecisionAlternative_XASTORE> result)
    throws InvalidInputException, DecisionException {
        if (inRange == null || result == null) {
            throw new InvalidInputException("decide_XASTORE invoked with a null parameter");
        }
        if (inRange.getType() != Type.BOOLEAN) {
            throw new InvalidInputException("decide_XASTORE inRange type is " + inRange.getType());
        }
        if (inRange instanceof Simplex) {
            decide_XASTORE_Concrete((Simplex) inRange, result);
            return Outcome.FF;
        } else {
            final Outcome o = decide_XASTORE_Nonconcrete(inRange, result);
            return o;
        }
    }

    private void decide_XASTORE_Concrete(Simplex inRange, SortedSet<DecisionAlternative_XASTORE> result) {
        final boolean inRangeBoolean = (Boolean) inRange.getActualValue();
        result.add(DecisionAlternative_XASTORE.toConcrete(inRangeBoolean));
    }

    protected Outcome decide_XASTORE_Nonconcrete(Primitive inRange, SortedSet<DecisionAlternative_XASTORE> result)
    throws DecisionException {
        final boolean shouldRefine;
        final DecisionAlternative_XASTORE IN = DecisionAlternative_XASTORE.toNonconcrete(true);
        final DecisionAlternative_XASTORE OUT = DecisionAlternative_XASTORE.toNonconcrete(false);

        if (inRange instanceof Any) {
            //TODO can it really happen? should we throw an exception in the case?
            result.add(OUT);
            result.add(IN);
            shouldRefine = false;
        } else {
            try {
                //this implementation saves one sat check in 50% cases
                //(it exploits the fact that if exp is unsat 
                //exp.not() is valid)
                final Expression outOfRangeExp = (Expression) inRange.not();
                if (isSat(outOfRangeExp)) {
                    result.add(OUT);
                    final Expression inRangeExp = (Expression) inRange;
                    if (isSat(inRangeExp)) {
                        result.add(IN);
                    }
                } else {
                    result.add(IN);			
                }
                shouldRefine = (result.size() > 1);
            } catch (InvalidTypeException | InvalidInputException e) {
                //this should never happen as arguments have been checked by the caller
                throw new UnexpectedInternalException(e);
            }

        }
        return Outcome.val(shouldRefine, true);
    }

    /**
     * Resolves loading a value from a local variable or a field to the operand stack.
     * 
     * @param state a {@link State}. 
     * @param valToLoad the {@link Value} returned by the local variable access, 
     *        that must be loaded on {@code state}'s operand stack. It must not be {@code null}.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XLOAD_GETX}{@code >}, 
     *        where the method will put all the {@link DecisionAlternative_XLOAD_GETX}s 
     *        representing all the satisfiable outcomes of the operation.
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     * @throws ClassFileNotFoundException if {@code valToLoad} is a symbolic 
     *         reference and 
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the class name of one of its possibile expansions does 
     *         not have a classfile in {@code state}'s classpath.
     * @throws ClassFileIllFormedException if {@code valToLoad} is a symbolic 
     *         reference and the classfile for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions is ill-formed.
     * @throws BadClassFileVersionException when {@code valToLoad} is a symbolic 
     *         reference and the bytecode for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a version
     *         number that is unsupported by this version of JBSE.
     * @throws WrongClassNameException when {@code valToLoad} is a symbolic 
     *         reference and the bytecode for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a 
     *         class name different from the expected one ({@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the expansion's name).
     * @throws IncompatibleClassFileException if {@code valToLoad} is a symbolic 
     *         reference and the superclass of class
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         is resolved to an interface class, or any superinterface is resolved
     *         to an object class.
     * @throws ClassFileNotAccessibleException if {@code valToLoad} is a symbolic 
     *         reference and the classfile for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions cannot access
     *         one of its superclass/superinterfaces.
     */
    public Outcome resolve_XLOAD_GETX(State state, Value valToLoad, SortedSet<DecisionAlternative_XLOAD_GETX> result) 
    throws InvalidInputException, DecisionException, ClassFileNotFoundException, ClassFileIllFormedException, 
    BadClassFileVersionException, WrongClassNameException, IncompatibleClassFileException, ClassFileNotAccessibleException {
        if (state == null || valToLoad == null || result == null) {
            throw new InvalidInputException("resolve_XLOAD_GETX invoked with a null parameter.");
        }
        if (Util.isResolved(state, valToLoad)) {
            result.add(new DecisionAlternative_XLOAD_GETX_Resolved(valToLoad));
            return Outcome.FFF;
        } else { 
            return resolve_XLOAD_GETX_Unresolved(state, (ReferenceSymbolic) valToLoad, result);
        }
    }

    /**
     * Resolves loading a value from a local variable or a field to the operand stack,
     * in the case the value to load is an unresolved symbolic
     * reference.
     * 
     * @param state a {@link State}.
     * @param refToLoad the {@link ReferenceSymbolic} returned by the local variable access, 
     *        that must be loaded on {@code state}'s operand stack. It must not be {@code null}.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XLOAD_GETX}{@code >}, 
     *        where the method will put all the {@link DecisionAlternative_XLOAD_GETX}s 
     *        representing all the satisfiable outcomes of the operation.
     * @return an {@link Outcome}.
     * @throws DecisionException upon failure.
     * @throws ClassFileNotFoundException if 
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the class name of one of its possibile expansions does 
     *         not have a classfile in {@code state}'s classpath.
     * @throws ClassFileIllFormedException if the classfile for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions is ill-formed.
     * @throws BadClassFileVersionException when the bytecode for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a version
     *         number that is unsupported by this version of JBSE.
     * @throws WrongClassNameException when the bytecode for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a 
     *         class name different from the expected one ({@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the expansion's name).
     * @throws IncompatibleClassFileException if the superclass of
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or of one of its possible expansion is resolved to an interface class,
     *         or any superinterface is resolved to an object class.
     * @throws ClassFileNotAccessibleException if the classfile for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions cannot access
     *         one of its superclass/superinterfaces.
     * @see {@link #resolve_XLOAD_GETX(State, Value, SortedSet) resolve_XLOAD_GETX}.
     */
    protected Outcome resolve_XLOAD_GETX_Unresolved(State state, ReferenceSymbolic refToLoad, SortedSet<DecisionAlternative_XLOAD_GETX> result)
    throws DecisionException, ClassFileNotFoundException, ClassFileIllFormedException, 
    BadClassFileVersionException, WrongClassNameException, IncompatibleClassFileException, 
    ClassFileNotAccessibleException {
        try {
            final boolean partialReferenceResolution = 
            doResolveReference(state, refToLoad, new DecisionAlternativeReferenceFactory_XLOAD_GETX(), result);
            return Outcome.val(true, partialReferenceResolution, true); //uninitialized symbolic references always require a refinement action
        } catch (InvalidInputException e) {
            //this should never happen as arguments have been checked by the caller
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Resolves loading a value to the operand stack, when the value
     * comes from an array.
     * 
     * @param state a {@link State}. It must not be {@code null}.
     * @param accessExpression an {@link Expression} containing {@code indexFormal}, 
     *        signifying the condition under which the array access yields {@code valToLoad} 
     *        as result. It can be {@code null}, in which case it is equivalent to {@code true} but 
     *        additionally denotes the fact that the array was accessed by a concrete index.
     * @param indexFormal the {@link Term} used in {@code accessExpression} to indicate
     *        the array index. It must not be {@code null}.
     * @param indexActual a {@link Primitive}, the actual index used to access the array.
     *        It must not be {@code null}.
     * @param valToLoad the {@link Value} returned by the array access 
     *        when {@code accessExpression} is true,
     *        or {@code null} to denote an access out of the 
     *        array bounds.
     * @param fresh {@code true} iff {@code valToLoad} is fresh, i.e., 
     *        its existence was assumed during the array access and thus it 
     *        is not yet stored in the {@link Array} it originates from.
     * @param arrayToWriteBack when {@code fresh == true} is a {@link Reference} to the array 
     *        where {@code valToLoad} originates from.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XALOAD}{@code >}, 
     *        where the method will put all the 
     *        {@link DecisionAlternative_XALOAD}s representing all the 
     *        satisfiable outcomes of the operation. It must not be {@code null}.
     * @return an {@link Outcome}.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     * @throws ClassFileNotFoundException if {@code valToLoad} is a symbolic 
     *         reference and 
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the class name of one of its possibile expansions does 
     *         not have a classfile in {@code state}'s classpath.
     * @throws ClassFileIllFormedException if {@code valToLoad} is a symbolic 
     *         reference and the classfile for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions is ill-formed.
     * @throws BadClassFileVersionException when {@code valToLoad} is a symbolic 
     *         reference and the bytecode for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a version
     *         number that is unsupported by this version of JBSE.
     * @throws WrongClassNameException when {@code valToLoad} is a symbolic 
     *         reference and the bytecode for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a 
     *         class name different from the expected one ({@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the expansion's name).
     * @throws IncompatibleClassFileException if {@code valToLoad} is a symbolic 
     *         reference and the superclass of class
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         is resolved to an interface class, or any superinterface is resolved
     *         to an object class.
     * @throws ClassFileNotAccessibleException if {@code valToLoad} is a symbolic 
     *         reference and the classfile for
     *         {@code valToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions cannot access
     *         one of its superclass/superinterfaces.
     */
    //TODO should be final?
    public Outcome resolve_XALOAD(State state, Expression accessExpression, Term indexFormal, Primitive indexActual, Value valToLoad, boolean fresh, Reference arrayToWriteBack, SortedSet<DecisionAlternative_XALOAD> result)
    throws InvalidInputException, DecisionException, ClassFileNotFoundException, 
    ClassFileIllFormedException, BadClassFileVersionException, WrongClassNameException, 
    IncompatibleClassFileException, ClassFileNotAccessibleException {
        if (state == null || result == null) {
            throw new InvalidInputException("resolve_XALOAD invoked with a null parameter.");
        }
        final boolean accessConcrete = (accessExpression == null);
        final boolean accessOutOfBounds = (valToLoad == null);
        final boolean valToLoadResolved = accessOutOfBounds || Util.isResolved(state, valToLoad);
        if (valToLoadResolved && accessConcrete) {
            return resolve_XALOAD_ResolvedConcrete(valToLoad, fresh, arrayToWriteBack, result);
        } else if (valToLoadResolved && !accessConcrete) {
            return resolve_XALOAD_ResolvedNonconcrete(accessExpression, indexFormal, indexActual, valToLoad, fresh, arrayToWriteBack, result);
        } else { //(!valToLoadResolved)
            return resolve_XALOAD_Unresolved(state, accessExpression, indexFormal, indexActual, (ReferenceSymbolic) valToLoad, fresh, arrayToWriteBack, result);
        }
    }

    /**
     * Resolves loading a value from an array to the operand stack, 
     * in the case the value to load is resolved (i.e., either 
     * concrete, or a symbolic primitive, or a resolved symbolic
     * reference) and the index used for the access is concrete.
     * 
     * @param valToLoad the {@link Value} returned by the array access 
     *        when {@code accessCondition} is true,
     *        or {@code null} to denote an access out of the 
     *        array bounds.
     * @param fresh {@code true} iff {@code valToLoad} is fresh, i.e., 
     *        its existence was assumed during the array access and thus it 
     *        is not yet stored in the {@link Array} it originates from.
     * @param arrayToWriteBack when {@code fresh == true} is a {@link Reference} to the array 
     *        where {@code valToLoad} originates from.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XALOAD}{@code >}, 
     *        where the method will put all the 
     *        {@link DecisionAlternative_XALOAD}s representing all the 
     *        satisfiable outcomes of the operation.
     * @return an {@link Outcome}.
     * @see {@link #resolve_XALOAD(State, Expression, Value, boolean, Reference, SortedSet) resolve_XALOAD}.
     */
    private Outcome resolve_XALOAD_ResolvedConcrete(Value valToLoad, boolean fresh, Reference arrayToWriteBack, SortedSet<DecisionAlternative_XALOAD> result) {
        final boolean accessOutOfBounds = (valToLoad == null);
        final int branchNumber = result.size() + 1;
        if (accessOutOfBounds) {
            result.add(new DecisionAlternative_XALOAD_Out(branchNumber));
        } else {
            result.add(new DecisionAlternative_XALOAD_Resolved(valToLoad, fresh, arrayToWriteBack, branchNumber));
        }
        return Outcome.val(fresh, false, false); //a fresh value to load requires refinement of the source array
    }

    /**
     * Resolves loading a value from an array to the operand stack, 
     * in the case the value to load is resolved (i.e., either 
     * concrete, or a symbolic primitive, or a resolved symbolic
     * reference) and the index used for the access is symbolic.
     * 
     * @param accessExpression an {@link Expression} containing {@code indexFormal}, 
     *        signifying the condition under which the array access yields {@code valToLoad} 
     *        as result. It must not be {@code null}.
     * @param indexFormal the {@link Term} used in {@code accessExpression} to indicate
     *        the array index. It must not be {@code null}.
     * @param indexActual a {@link Primitive}, the actual index used to access the array.
     *        It must not be {@code null}.
     * @param valToLoad the {@link Value} returned by the array access 
     *        when {@code accessExpression} is true,
     *        or {@code null} to denote an access out of the 
     *        array bounds.
     * @param fresh {@code true} iff {@code valToLoad} is fresh, i.e., 
     *        its existence was assumed during the array access and thus it 
     *        is not yet stored in the {@link Array} it originates from.
     * @param arrayToWriteBack when {@code fresh == true} is a {@link Reference} to the array 
     *        where {@code valToLoad} originates from.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XALOAD}{@code >}, 
     *        where the method will put all the 
     *        {@link DecisionAlternative_XALOAD}s representing all the 
     *        satisfiable outcomes of the operation.
     * @return an {@link Outcome}.
     * @see {@link #resolve_XALOAD(State, Expression, Value, boolean, Reference, SortedSet) resolve_XALOAD}.
     */
    protected Outcome resolve_XALOAD_ResolvedNonconcrete(Expression accessExpression, Term indexFormal, Primitive indexActual, Value valToLoad, boolean fresh, Reference arrayToWriteBack, SortedSet<DecisionAlternative_XALOAD> result)
    throws DecisionException {
        try {
            final boolean shouldRefine;
            final Expression accessExpressionSpecialized = (Expression) accessExpression.doReplace(indexFormal, indexActual);
            if (isSat(accessExpressionSpecialized)) {
                shouldRefine = fresh; //a fresh value to load requires refinement of the source array
                final Primitive accessExpressionSimplified = deleteRedundantConjuncts(accessExpressionSpecialized);
                final boolean accessOutOfBounds = (valToLoad == null);
                final int branchNumber = result.size() + 1;
                if (accessOutOfBounds) {
                    result.add(new DecisionAlternative_XALOAD_Out(accessExpression, indexFormal, indexActual, ((accessExpressionSimplified == null || accessExpressionSimplified.surelyTrue()) ? null : (Expression) accessExpressionSimplified), branchNumber));
                } else {
                    result.add(new DecisionAlternative_XALOAD_Resolved(accessExpression, indexFormal, indexActual, ((accessExpressionSimplified == null || accessExpressionSimplified.surelyTrue()) ? null : (Expression) accessExpressionSimplified), valToLoad, fresh, arrayToWriteBack, branchNumber));
                }
            } else {
                //accessExpression is unsatisfiable: nothing to do
                shouldRefine = false;
            }
            return Outcome.val(shouldRefine, false, true);
        } catch (InvalidInputException | InvalidTypeException | InvalidOperandException e) {
            //this should never happen as arguments have been checked by the caller
            throw new UnexpectedInternalException(e);
        }
    }

    private Primitive deleteRedundantConjuncts(Primitive p) throws DecisionException, InvalidInputException, InvalidTypeException, InvalidOperandException {
        if (p == null) {
            return null;
        }
        if (p instanceof Expression) {
            final Expression pExpr = (Expression) p;
            if (pExpr.getOperator() == Operator.AND) {
                final Primitive firstConjunctSimplified = deleteRedundantConjuncts(pExpr.getFirstOperand());
                final Primitive secondConjunctSimplified = deleteRedundantConjuncts(pExpr.getSecondOperand());
                return firstConjunctSimplified.and(secondConjunctSimplified);
            } else {
                final boolean subExpressionRedundant = !isSat((Expression) pExpr.not());
                if (subExpressionRedundant) {
                    return this.calc.valBoolean(true);
                } else {
                    return pExpr;
                }
            }
        } else {
            return p;
        }
    }

    /**
     * Resolves loading a value from an array to the operand stack, 
     * in the case the value to load is an unresolved symbolic
     * reference.
     * 
     * @param state a {@link State}. 
     * @param accessExpression an {@link Expression} containing {@code indexFormal}, 
     *        signifying the condition under which the array access yields {@code valToLoad} 
     *        as result. It can be {@code null}, in which case it is equivalent to {@code true} but 
     *        additionally denotes the fact that the array was accessed by a concrete index.
     * @param indexFormal the {@link Term} used in {@code accessExpression} to indicate
     *        the array index. It must not be {@code null}.
     * @param indexActual a {@link Primitive}, the actual index used to access the array.
     *        It must not be {@code null}.
     * @param refToLoad the {@link ReferenceSymbolic} returned by the array access 
     *        when {@code accessExpression} is true, 
     *        that must be loaded on {@code state}'s operand stack. It must not be {@code null}.
     * @param fresh {@code true} iff {@code refToLoad} is fresh, i.e., 
     *        its existence was assumed during the array access and thus it 
     *        is not yet stored in the {@link Array} it originates from.
     * @param arrayReference when {@code fresh == true} it is a {@link Reference} 
     *        to the array where {@code refToLoad} originates from.
     * @param result a {@link SortedSet}{@code <}{@link DecisionAlternative_XALOAD}{@code >}, 
     *        where the method will put all the 
     *        {@link DecisionAlternative_XALOAD}s representing all the 
     *        satisfiable outcomes of the operation.
     * @return an {@link Outcome}.
     * @throws ClassFileNotFoundException when 
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the class name of one of its possibile expansions does 
     *         not have a classfile in the classpath.
     * @throws ClassFileIllFormedException when the classfile for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions is ill-formed.
     * @throws BadClassFileVersionException when the bytecode for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a version
     *         number that is unsupported by this version of JBSE.
     * @throws WrongClassNameException when the bytecode for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a 
     *         class name different from the expected one ({@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or the expansion's name).
     * @throws IncompatibleClassFileException when the superclass of class
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         is resolved to an interface class, or any superinterface is resolved
     *         to an object class.
     * @throws ClassFileNotAccessibleException when the classfile for
     *         {@code refToLoad.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions cannot access
     *         one of its superclass/superinterfaces.
     * @see {@link #resolve_XALOAD(State, Expression, Value, boolean, SortedSet) resolve_XALOAD}.
     */
    protected Outcome resolve_XALOAD_Unresolved(State state, Expression accessExpression, Term indexFormal, Primitive indexActual, ReferenceSymbolic refToLoad, boolean fresh, Reference arrayReference, SortedSet<DecisionAlternative_XALOAD> result)
    throws DecisionException, ClassFileNotFoundException, ClassFileIllFormedException, 
    BadClassFileVersionException, WrongClassNameException, 
    IncompatibleClassFileException, ClassFileNotAccessibleException {
        try {
            final boolean accessConcrete = (accessExpression == null);
            final Expression accessExpressionSpecialized = (accessExpression == null ? null : (Expression) accessExpression.doReplace(indexFormal, indexActual));
            final boolean shouldRefine;
            final boolean noReferenceExpansion;
            if (accessConcrete || isSat(accessExpressionSpecialized)) {
                shouldRefine = true; //unresolved symbolic references always require a refinement action
                final Primitive accessExpressionSimplified = deleteRedundantConjuncts(accessExpressionSpecialized);
                noReferenceExpansion =
                    doResolveReference(state, refToLoad, new DecisionAlternativeReferenceFactory_XALOAD(accessExpression, indexFormal, indexActual, ((accessExpressionSimplified == null || accessExpressionSimplified.surelyTrue()) ? null : (Expression) accessExpressionSimplified), fresh, arrayReference), result);
            } else {
                //accessExpression is unsatisfiable: nothing to do
                shouldRefine = false;
                noReferenceExpansion = false;
            }
            return Outcome.val(shouldRefine, noReferenceExpansion, true);
        } catch (InvalidInputException | InvalidTypeException | InvalidOperandException e) {
            //this should never happen as arguments have been checked by the caller
            throw new UnexpectedInternalException(e);
        }
    }

    /**
     * Resolution of unresolved references.
     * 
     * @param <D> The class for the decision alternatives.
     * @param <DA> The class for the decision alternative for 
     *            resolutions by aliasing. Must be a subclass of {@code <D>}.
     * @param <DE> The class for the decision alternative for
     *            resolutions by expansion. Must be a subclass of {@code <D>}.
     * @param <DN> The class for the decision alternative for
     *            resolutions by null. Must be a subclass of {@code <D>}.
     * @param state a {@link State}.
     * @param refToResolve the {@link ReferenceSymbolic} to resolve.
     * @param factory A Concrete Factory for decision alternatives.
     * @param result a {@link SortedSet}{@code <D>}, which the method 
     *            will update by adding to it all the decision alternatives 
     *            representing all the valid expansions of {@code notInitializedRef}.
     * @return {@code true} iff the resolution of the reference is 
     *         partial (see {@link Outcome#noReferenceExpansion()}).
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     * @throws ClassFileNotFoundException when 
     *         {@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or the class name of one of its possibile expansions does 
     *         not have bytecode in {@code state}'s classpath.
     * @throws ClassFileIllFormedException when the bytecode for
     *         {@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions is ill-formed.
     * @throws BadClassFileVersionException when the bytecode for
     *         {@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a version
     *         number that is unsupported by this version of JBSE.
     * @throws WrongClassNameException when the bytecode for
     *         {@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions has a 
     *         class name different from the expected one ({@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or the expansion's name).
     * @throws IncompatibleClassFileException if the superclass of {@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or for one of its possibile expansions is resolved to an interface 
     *         class, or any superinterface is resolved to an object class.
     * @throws ClassFileNotAccessibleException when the classfile for
     *         {@code refToResolve.}{@link Signature#getClassName() getClassName()}
     *         or for the class name of one of its possibile expansions cannot access
     *         one of its superclass/superinterfaces.
     */
    protected <D, DA extends D, DE extends D, DN extends D> 
    boolean doResolveReference(State state, ReferenceSymbolic refToResolve, 
                               DecisionAlternativeReferenceFactory<DA, DE, DN> factory, SortedSet<D> result) 
                               throws InvalidInputException, DecisionException, ClassFileNotFoundException, 
                               ClassFileIllFormedException, BadClassFileVersionException, WrongClassNameException, 
                               IncompatibleClassFileException, ClassFileNotAccessibleException {
        int branchCounter = result.size() + 1;
        final ClassHierarchy hier = state.getClassHierarchy();

        //loads the static type of the reference and determines
        //whether it can be assumed to be initialized (if not, 
        //the only compatible resolution of the reference is null)
        final ClassFile refToResolveClass;
        try {                               
            refToResolveClass = hier.loadCreateClass(CLASSLOADER_APP, className(refToResolve.getStaticType()), true); 
            //TODO instead of rethrowing exceptions (class file not found, ill-formed or unaccessible) just set refToResolveTypeIsSatInitialized to false??
            //TODO loading the static type of the reference should be done elsewhere, so to remove dependence on State
        } catch (PleaseLoadClassException e) {
            //this should never happen since we bypassed standard loading
            throw new UnexpectedInternalException(e);
        }
        final boolean refToResolveTypeIsSatInitialized = isSatInitialized(refToResolveClass);

        boolean partialReferenceResolution = true;
        if (refToResolveTypeIsSatInitialized) {
            //filters static aliases based on their satisfiability
            final Map<Long, Objekt> possibleAliases = getPossibleAliases(state, refToResolve, refToResolveClass);
            if (possibleAliases == null) {
                throw new UnexpectedInternalException("Symbolic reference " + refToResolve.toString() + 
                                                      " (" + refToResolve.asOriginString() + ") has a bad type " + refToResolve.getStaticType() + ".");
            }
            for (Map.Entry<Long, Objekt> ae : possibleAliases.entrySet()) {
                final long i = ae.getKey();
                final Objekt o = ae.getValue();
                if (isSatAliases(refToResolve, i, o)) {
                    final DA a = factory.createAlternativeRefAliases(refToResolve, i, o.getOrigin(), branchCounter);
                    result.add(a);
                }
                ++branchCounter;
            }

            //same for static expansions
            final Set<ClassFile> possibleExpansions = getPossibleExpansions(state, refToResolveClass); //TODO incapsulate thrown exceptions (class file not found, ill-formed or unaccessible) as effect in each decision alternative, or just skip class and report cumulatively these missed class as non-expanded references
            if (possibleExpansions == null) {
                throw new UnexpectedInternalException("Symbolic reference " + refToResolve + 
                                                      " (" + refToResolve.asOriginString() + ") has a bad type " + refToResolve.getStaticType() + ".");
            }
            for (ClassFile expansionClass : possibleExpansions) {
                if (isSatInitialized(expansionClass) && isSatExpands(refToResolve, expansionClass)) {
                    final DE e = factory.createAlternativeRefExpands(refToResolve, expansionClass, branchCounter);
                    result.add(e);
                    partialReferenceResolution = false;
                }
                ++branchCounter;
            }
        }

        //same for null
        if (isSatNull(refToResolve)) {
            final DN n = factory.createAlternativeRefNull(refToResolve, branchCounter);
            result.add(n);
            //no need to increment branchNumber
        }

        //is there a partial reference resolution?
        return partialReferenceResolution;
    }

    /**
     * Returns all the heap objects in a state that may be possible
     * aliases of a given {@link ReferenceSymbolic}.
     *
     * @param state a {@link State}.
     * @param ref a {@link ReferenceSymbolic} to be resolved.
     * @param refClass the {@link ClassFile} for the static type of {@code ref}.
     * @return a {@link Map}{@code <}{@link Long}{@code, }{@link Objekt}{@code >}, 
     *         representing the subview of {@code state}'s heap that contains
     *         all the objects that are compatible, in their type and epoch, with {@code ref}.
     *         If {@code ref} does not denote a reference or array type, the method 
     *         returns {@code null}.
     */
    private Map<Long, Objekt> getPossibleAliases(State state, ReferenceSymbolic ref, ClassFile refClass) {
        //checks preconditions
        if (!refClass.isReference() && !refClass.isArray()) {
            return null;
        }

        final TreeMap<Long, Objekt> retVal = new TreeMap<>();

        //TODO extract this code and share with State.getObjectInitial
        //scans the path condition for compatible objects
        final Iterable<Clause> pathCondition = state.getPathCondition(); //TODO the decision procedure already stores the path condition: eliminate dependence on state
        for (Clause c : pathCondition) {
            if (c instanceof ClauseAssumeExpands) {
                //gets the object and its position in the heap
                final ClauseAssumeExpands cExp = (ClauseAssumeExpands) c;
                final Long i = cExp.getHeapPosition();
                final Objekt o = cExp.getObjekt();

                //if it is type and epoch compatible, adds the object
                //to the result
                try {
                    if (isAliasCompatible(o, ref, refClass)) {
                        retVal.put(i, o);
                    }
                } catch (InvalidInputException e) {
                    //this should never happen (checked before)
                    throw new UnexpectedInternalException(e);
                }
            }
        }
        return retVal;
    }

    /**
     * Checks whether an {@link Objekt} can be used 
     * to resolve of a symbolic reference by aliasing.
     * 
     * @param o an {@link Objekt}.
     * @param ref a {@link ReferenceSymbolic} to be resolved.
     * @param refClass the {@link ClassFile} for the static type of {@code ref}.
     * @return {@code true} iff {@code refClass} can be resolved by alias to 
     *         {@code o}. 
     *         More precisely, returns {@code true} iff the creation epoch of 
     *         {@code o} comes before that of the symbolic reference, and {@code o}'s type 
     *         is a subclass of {@code refClass}. If {@code ref} is a member of a 
     *         {@link ReferenceSymbolicApply} it also check that {@code o} has as
     *         origin the same {@link ReferenceSymbolicApply}.
     * @throws InvalidInputException if {@code refClass == null}.
     */
    private boolean isAliasCompatible(Objekt o, ReferenceSymbolic ref, ClassFile refClass) throws InvalidInputException {
        final boolean isTypeCompatible = o.getType().isSubclass(refClass);
        final HistoryPoint oEpoch = o.historyPoint();
        final HistoryPoint refEpoch = ref.historyPoint();
        final boolean isEpochCompatible = oEpoch.weaklyBefore(refEpoch);
        final boolean isRootCompatible = !(ref.root() instanceof ReferenceSymbolicApply) || o.getOrigin().root().equals(ref.root());
        return (isTypeCompatible && isEpochCompatible && isRootCompatible); 
    }

    /**
     * Returns all the heap objects in a state that may be possible
     * aliases of a given {@link ReferenceSymbolic}.
     *
     * @param state a {@link State}.
     * @param refClass a {@link ClassFile} for the static type of the reference 
     *        to be resolved.
     * @return a {@link Set}{@code <}{@link String}{@code >}, listing
     *         all the classes that are compatible, in their type and epoch of 
     *         initialization, with {@code ref}.
     *         If {@code ref} does not denote a reference or array type, the method 
     *         returns {@code null}.
     * @throws InvalidInputException if one of the candidate subclass names 
     *         for {@code refClass} in {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor is invalid.
     * @throws ClassFileNotFoundException if any of the candidate subclass names 
     *         for {@code refClass} in {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor does not have a classfile neither 
     *         in the bootstrap, nor in the 
     *         extension, nor in the application classpath.
     *         names does not denote a classfile in the classpath.
     * @throws ClassFileIllFormedException if any of the candidate subclass names 
     *         for {@code refClass} in {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor has an ill-formed bytecode.
     * @throws BadClassFileVersionException when the bytecode for any of the 
     *         candidate subclass names for {@code refClass} in 
     *         {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor has a version number that is unsupported by this version of JBSE.
     * @throws WrongClassNameException when the bytecode for any of the 
     *         candidate subclass names for {@code refClass} in 
     *         {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor has a class name different from the expected one 
     *         (the candidate subclass name).
     * @throws IncompatibleClassFileException if the superclass of any of the candidate subclasses 
     *         for {@code refClass} in {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor is resolved to an interface class, or any superinterface is resolved
     *         to an object class.
     * @throws ClassFileNotAccessibleException if the classfile of any of the candidate subclass names 
     *         for {@code refClass} in {@code state.}{@link State#getClassHierarchy() getClassHierarchy()}'s
     *         expansion backdoor cannot access one of its superclasses/superinterfaces.
     */
    private static Set<ClassFile> getPossibleExpansions(State state, ClassFile refClass) 
    throws InvalidInputException, ClassFileNotFoundException, ClassFileIllFormedException, 
    BadClassFileVersionException, WrongClassNameException, 
    IncompatibleClassFileException, ClassFileNotAccessibleException {
        if (!refClass.isReference() && !refClass.isArray()) {
            return null;
        }

        final Set<ClassFile> retVal;
        if (refClass.isArray()) {
            //the (really trivial) array case:
            //array classes are final, concrete, and can
            //always be assumed to be initialized, so
            //this is the only expansion possible
            retVal = new HashSet<>();
            retVal.add(refClass);
        } else {
            retVal = state.getClassHierarchy().getAllConcreteSubclasses(refClass);
        }

        return retVal;
    }

    /**
     * Completes the set operation of an {@link Array} by constraining the affected entries
     * and removing the unsatisfiable ones.
     * 
     * @param hier a {@link ClassHierarchy}.
     * @param entries an {@link Iterator}{@code <? extends }{@link AccessOutcomeIn}{@code >}. The method
     *        will determine the entries affected by the set operation, constrain them, and 
     *        delete the entries that become unsatisfiable.
     * @param index a {@link Primitive}, the position in the {@link Array} which is set.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    public void constrainArrayForSet(ClassHierarchy hier, Iterator<? extends Array.AccessOutcomeIn> entries, Primitive index) 
    throws InvalidInputException, DecisionException {
        if (hier == null || entries == null || index == null) {
            throw new InvalidInputException("completeArraySet invoked with a null parameter.");
        }
        if (index.getType() != Type.INT) {
            throw new InvalidInputException("completeArraySet invoked with an index having type " + index.getType());
        }
        try {
            while (entries.hasNext()) {
                final Array.AccessOutcomeIn e = entries.next();
                final Primitive indexInRange = e.inRange(index);
                final boolean entryAffected;
                if (indexInRange instanceof Simplex) {
                    entryAffected = indexInRange.surelyTrue();
                } else {
                    entryAffected = isSat((Expression) indexInRange);
                }

                //if the entry is affected, it is constrained and possibly removed
                if (entryAffected) {
                    e.excludeIndexFromAccessCondition(index); //TODO possibly move this back to Array?
                    final Expression accessCondition = e.getAccessCondition();
                    if (isSat(accessCondition)) {
                        //do nothing
                    } else {
                        entries.remove();
                    }
                }

            }
        } catch (InvalidOperandException | InvalidTypeException exc) {
            //this should never happen after argument check
            throw new UnexpectedInternalException(exc);
        }
        //TODO coalesce entries that have same value (after investigating the impact on guided execution)
    }

    /**
     * Completes a {@code java.System.arraycopy} by 
     * constraining the affected entries and removing 
     * the unsatisfiable ones.
     * 
     * @param entries an {@link Iterator}{@code <? extends }{@link AccessOutcomeIn}{@code >}. The method
     *        will determine the entries affected by the copy operation, constrain them, and 
     *        delete the entries that become unsatisfiable.
     * @param srcPos The source initial position.
     * @param destPos The destination initial position.
     * @param length How many elements should be copied.
     * @throws InvalidInputException when one of the parameters is incorrect.
     * @throws DecisionException upon failure.
     */
    public void completeArraycopy(Iterator<? extends Array.AccessOutcomeIn> entries, Primitive srcPos, Primitive destPos, Primitive length) 
    throws InvalidInputException, DecisionException {
        if (entries == null || srcPos == null || destPos == null || length == null) {
            throw new InvalidInputException("completeArraycopy invoked with a null parameter.");
        }
        if (srcPos.getType() != Type.INT || destPos.getType() != Type.INT || length.getType() != Type.INT) {
            throw new InvalidInputException("completeArraycopy invoked with a nonint srcPos, destPos or length parameter.");
        }
        while (entries.hasNext()) {
            final Array.AccessOutcomeIn e = entries.next();
            final Expression accessCondition = e.getAccessCondition();
            if (isSat(accessCondition)) {
                //do nothing
            } else {
                entries.remove();
            }
        }
        //TODO coalesce entries that have same value (after investigating the impact on guided execution)
    }

    /**
     * Returns the only decision alternative for the expansion
     * of the {ROOT}:this reference.
     * 
     * @param rootThis a {@link ReferenceSymbolic}, the {ROOT}:this 
     *        reference.
     * @param classFile the {@link ClassFile} of the root object.
     * @return a {@link DecisionAlternative_XLOAD_GETX_Expands}.
     */
    public DecisionAlternative_XLOAD_GETX_Expands getRootDecisionAlternative(ReferenceSymbolic rootThis, ClassFile classFile) {
        return new DecisionAlternative_XLOAD_GETX_Expands(rootThis, classFile, 1);
    }
}