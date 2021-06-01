package jbse.algo.meta;

import static jbse.algo.Util.exitFromAlgorithm;
import static jbse.algo.Util.failExecution;
import static jbse.algo.Util.throwNew;
import static jbse.algo.Util.throwVerifyError;
import static jbse.common.Type.internalClassName;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;
import java.util.zip.Inflater;

import jbse.algo.Algo_INVOKEMETA_Nonbranching;
import jbse.algo.InterruptException;
import jbse.algo.StrategyUpdate;
import jbse.algo.exc.SymbolicValueNotAllowedException;
import jbse.algo.meta.exc.UndefinedResultException;
import jbse.common.exc.ClasspathException;
import jbse.common.exc.InvalidInputException;
import jbse.mem.State;
import jbse.tree.DecisionAlternative_NONE;
import jbse.val.Primitive;
import jbse.val.Simplex;

/**
 * Meta-level implementation of {@link java.util.zip.Inflater#end(long)}.
 * 
 * @author Pietro Braione
 */
public final class Algo_JAVA_INFLATER_END extends Algo_INVOKEMETA_Nonbranching {
    private long addr; //set by cookMore
    
    @Override
    protected Supplier<Integer> numOperands() {
        return () -> 1;
    }

    @Override
    protected void cookMore(State state) 
    throws InterruptException, ClasspathException, SymbolicValueNotAllowedException, 
    UndefinedResultException, InvalidInputException {
        try {
            //gets the (long addr) parameter
            final Primitive _addr = (Primitive) this.data.operand(0);
            if (_addr.isSymbolic()) {
                throw new SymbolicValueNotAllowedException("The long addr parameter to invocation of method java.util.zip.Inflater.end cannot be a symbolic value.");
            }
            this.addr = ((Long) ((Simplex) _addr).getActualValue()).longValue();
            //TODO check that addr is valid, and react appropriately in the negative case
            
            //invokes metacircularly the end method
            final Method method = Inflater.class.getDeclaredMethod("end", long.class);
            method.setAccessible(true);
            method.invoke(null, state.getInflater(this.addr));
        } catch (InvocationTargetException e) {
            final String cause = internalClassName(e.getCause().getClass().getName());
            throwNew(state, cause);
            exitFromAlgorithm();
        } catch (ClassCastException e) {
            throwVerifyError(state);
            exitFromAlgorithm();
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException e) {
            //this should not happen
            failExecution(e);
        }
    }

    @Override
    protected StrategyUpdate<DecisionAlternative_NONE> updater() {
        return (state, alt) -> {
            state.removeInflater(this.addr);
        };
    }
}
