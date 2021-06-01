package jbse.algo.meta;

import static jbse.algo.Util.continueWith;
import static jbse.algo.Util.exitFromAlgorithm;
import static jbse.algo.Util.throwVerifyError;
import static jbse.common.Type.INT;

import java.util.function.Supplier;

import jbse.algo.Algo_INVOKEMETA_Nonbranching;
import jbse.algo.InterruptException;
import jbse.algo.StrategyUpdate;
import jbse.algo.exc.CannotManageStateException;
import jbse.algo.exc.SymbolicValueNotAllowedException;
import jbse.algo.meta.exc.UndefinedResultException;
import jbse.common.exc.ClasspathException;
import jbse.common.exc.UnexpectedInternalException;
import jbse.dec.exc.DecisionException;
import jbse.mem.Array;
import jbse.mem.Objekt;
import jbse.mem.State;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.tree.DecisionAlternative_NONE;
import jbse.val.Primitive;
import jbse.val.Reference;
import jbse.val.Simplex;
import jbse.val.Value;

/**
 * Meta-level implementation of {@link sun.misc.Unsafe#getIntVolatile(Object, long)}.
 * 
 * @author Pietro Braione
 */
//TODO refactor together with Algo_SUN_UNSAFE_GETOBJECTVOLATILE
@SuppressWarnings("restriction")
public final class Algo_SUN_UNSAFE_GETINTVOLATILE extends Algo_INVOKEMETA_Nonbranching {
    private final Algo_SUN_UNSAFE_GETINTVOLATILE_Array algoArray = new Algo_SUN_UNSAFE_GETINTVOLATILE_Array();
    private Value read; //set by cookMore

    @Override
    protected Supplier<Integer> numOperands() {
        return () -> 3;
    }

    @Override
    protected void cookMore(State state)
    throws ThreadStackEmptyException, DecisionException, ClasspathException,
    CannotManageStateException, InterruptException, FrozenStateException {
        try {           
            //gets and checks the object parameter
            final Reference objRef = (Reference) this.data.operand(1);
            if (state.isNull(objRef)) {
                throw new UndefinedResultException("The object parameter to sun.misc.Unsafe.getIntVolatile was null.");
            }
            final Objekt obj = state.getObject(objRef); //TODO objRef from getStaticFieldBase
            if (objRef == null) {
                throw new UnexpectedInternalException("Unexpected unresolved symbolic reference on the operand stack while invoking sun.misc.Unsafe.getIntVolatile.");
            }

            //gets and checks the offset parameter
            final Primitive ofstPrimitive = (Primitive) this.data.operand(2);
            final int ofst;
            if (ofstPrimitive instanceof Simplex) {
                ofst = ((Long) ((Simplex) ofstPrimitive).getActualValue()).intValue();
            } else {
                throw new SymbolicValueNotAllowedException("The offset parameter to sun.misc.Unsafe.getIntVolatile cannot be a symbolic value");
            }

            if (obj instanceof Array) {
                continueWith(this.algoArray);
            }
            
            //reads the value
            if (obj.hasSlot(ofst)) {
                this.read = obj.getFieldValue(ofst);
            } else {
                throw new UndefinedResultException("The offset parameter to sun.misc.Unsafe.getIntVolatile was not a slot number of the object parameter");
            }
            
            //checks the value
            if (this.read.getType() != INT) {
                throw new UndefinedResultException("The value read by sun.misc.Unsafe.getIntVolatile was not an int");
            }
        } catch (ClassCastException e) {
            throwVerifyError(state);
            exitFromAlgorithm();
        }
    }

    @Override
    protected StrategyUpdate<DecisionAlternative_NONE> updater() {
        return (state, alt) -> {
            state.pushOperand(this.read);
        };
    }
}
