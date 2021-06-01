package jbse.algo.meta;

import static jbse.algo.Util.exitFromAlgorithm;
import static jbse.algo.Util.failExecution;
import static jbse.algo.Util.throwVerifyError;

import java.util.function.Supplier;

import jbse.algo.Algo_INVOKEMETA_Nonbranching;
import jbse.algo.InterruptException;
import jbse.algo.StrategyUpdate;
import jbse.algo.exc.CannotManageStateException;
import jbse.algo.exc.SymbolicValueNotAllowedException;
import jbse.algo.meta.exc.UndefinedResultException;
import jbse.common.exc.ClasspathException;
import jbse.dec.exc.DecisionException;
import jbse.mem.Array;
import jbse.mem.Array.AccessOutcomeInValue;
import jbse.mem.Objekt;
import jbse.mem.State;
import jbse.mem.exc.FastArrayAccessNotAllowedException;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.tree.DecisionAlternative_NONE;
import jbse.val.Reference;
import jbse.val.Simplex;
import jbse.val.Value;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidTypeException;

/**
 * Abstract meta-level implementation of many {@link sun.misc.Unsafe} {@code compareAndSwap} methods.
 * 
 * @author Pietro Braione
 */
@SuppressWarnings("restriction")
public abstract class Algo_SUN_UNSAFE_COMPAREANDSWAPX extends Algo_INVOKEMETA_Nonbranching {
    private final String what;  //set by constructor
    private Objekt objectToSet; //set by cookMore
    private int fieldSlotToSet; //set by cookMore
    private Value toWrite; //set by cookMore

    protected Algo_SUN_UNSAFE_COMPAREANDSWAPX(String what) {
        this.what = what;
    }

    @Override
    protected final Supplier<Integer> numOperands() {
        return () -> 5;
    }

    protected abstract boolean checkCompare(State state, Value current, Value toCompare) 
    throws CannotManageStateException, InterruptException, ClasspathException;

    @Override
    protected final void cookMore(State state)
    throws ThreadStackEmptyException, DecisionException, ClasspathException,
    CannotManageStateException, InterruptException, FrozenStateException {
        try {
            final Reference refObjectToSet = (Reference) this.data.operand(1);
            this.objectToSet = state.getObject(refObjectToSet);
            if (this.objectToSet == null) {
                //this should never happen
                failExecution("Unexpected unresolved symbolic references as object to be set parameter of sun.misc.Unsafe.compareAndSwap" + this.what + " invocation");
            }
            if (this.objectToSet instanceof Array && !((Array) this.objectToSet).hasSimpleRep()) {
                throw new SymbolicValueNotAllowedException("The object to be set parameter to sun.misc.Unsafe.compareAndSwap" + this.what + " is an array that has not simple representation");
            }
            if (this.data.operand(2) instanceof Simplex) {
                this.fieldSlotToSet = ((Long) ((Simplex) this.data.operand(2)).getActualValue()).intValue();
            } else {
                throw new SymbolicValueNotAllowedException("The slot parameter to sun.misc.Unsafe.compareAndSwap" + this.what + " must be concrete or resolved symbolic");
            }
            final Value toCompare = this.data.operand(3);
            this.toWrite = this.data.operand(4);
            if (this.objectToSet.hasSlot(this.fieldSlotToSet)) {
                try {
                    final Value current = (this.objectToSet instanceof Array) ? 
                                          ((AccessOutcomeInValue) ((Array) this.objectToSet).getFast(state.getCalculator().valInt(this.fieldSlotToSet))).getValue() :
                                          this.objectToSet.getFieldValue(this.fieldSlotToSet);
                    if (!checkCompare(state, current, toCompare)) {
                        this.objectToSet = null;
                    }
                } catch (ClassCastException e) {
                    //this should never happen
                    failExecution(e);
                }        
            } else {
                throw new UndefinedResultException("The offset parameter to sun.misc.Unsafe.compareAndSwap" + this.what + " was not a slot number of the object parameter");
            }
        } catch (ClassCastException e) {
            throwVerifyError(state);
            exitFromAlgorithm();
        } catch (InvalidOperandException | InvalidTypeException | FastArrayAccessNotAllowedException e) {
            //this should never happen
            failExecution(e);
        }        
    }


    @Override
    protected StrategyUpdate<DecisionAlternative_NONE> updater() {
        return (state, alt) -> {
            if (this.objectToSet == null) {
                state.pushOperand(state.getCalculator().valInt(0)); //false
            } else {
                if (this.objectToSet instanceof Array) {
                    try {
                        ((Array) this.objectToSet).setFast(state.getCalculator().valInt(this.fieldSlotToSet), this.toWrite);
                    } catch (InvalidOperandException | InvalidTypeException | FastArrayAccessNotAllowedException e) {
                        //this should never happen
                        failExecution(e);
                    }
                } else {
                    this.objectToSet.setFieldValue(this.fieldSlotToSet, this.toWrite);
                }
                state.pushOperand(state.getCalculator().valInt(1)); //true
            }
        };
    }
}
