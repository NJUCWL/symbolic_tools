package jbse.algo.meta;

import static jbse.algo.Util.exitFromAlgorithm;
import static jbse.algo.Util.failExecution;
import static jbse.algo.Util.throwNew;
import static jbse.algo.Util.throwVerifyError;
import static jbse.common.Type.internalClassName;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;
import java.util.zip.ZipFile;

import jbse.algo.Algo_INVOKEMETA_Nonbranching;
import jbse.algo.InterruptException;
import jbse.algo.StrategyUpdate;
import jbse.algo.exc.SymbolicValueNotAllowedException;
import jbse.common.exc.ClasspathException;
import jbse.common.exc.InvalidInputException;
import jbse.mem.State;
import jbse.tree.DecisionAlternative_NONE;
import jbse.val.Primitive;
import jbse.val.Simplex;

/**
 * Meta-level implementation of {@link java.util.zip.ZipFile#getEntryTime(long)}.
 * 
 * @author Pietro Braione
 */
//TODO merge with Algo_JAVA_ZIPFILE_STARTSWITHLOC and Algo_JAVA_ZIPFILE_GETENTRYFLAG and Algo_JAVA_ZIPFILE_GETTOTAL and Algo_JAVA_ZIPFILE_GETENTRYCRC and Algo_JAVA_ZIPFILE_GETENTRYSIZE and Algo_JAVA_ZIPFILE_GETENTRYCSIZE and Algo_JAVA_ZIPFILE_GETENTRYMETHOD
public final class Algo_JAVA_ZIPFILE_GETENTRYTIME extends Algo_INVOKEMETA_Nonbranching {
    private Simplex toPush; //set by cookMore
    
    @Override
    protected Supplier<Integer> numOperands() {
        return () -> 1;
    }

    @Override
    protected void cookMore(State state) 
    throws InterruptException, ClasspathException, SymbolicValueNotAllowedException, InvalidInputException {
        try {
            //gets the (long jzentry) parameter
            final Primitive _jzentry = (Primitive) this.data.operand(0);
            if (_jzentry.isSymbolic()) {
                throw new SymbolicValueNotAllowedException("The long jzentry parameter to invocation of method java.util.zip.ZipFile.getEntryTime cannot be a symbolic value.");
            }
            final long jzentry = ((Long) ((Simplex) _jzentry).getActualValue()).longValue();
            //TODO what if jzentry is not open?
            
            //invokes metacircularly the getEntryTime method
            final Method method = ZipFile.class.getDeclaredMethod("getEntryTime", long.class);
            method.setAccessible(true);
            final long retVal = (long) method.invoke(null, state.getZipFileEntryJz(jzentry));
            this.toPush = state.getCalculator().valLong(retVal);
        } catch (InvocationTargetException e) {
            final String cause = internalClassName(e.getCause().getClass().getName());
            throwNew(state, cause);
            exitFromAlgorithm();
        } catch (ClassCastException e) {
            throwVerifyError(state);
            exitFromAlgorithm();
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException | IllegalArgumentException e) {
            //this should not happen
            failExecution(e);
        }
    }

    @Override
    protected StrategyUpdate<DecisionAlternative_NONE> updater() {
        return (state, alt) -> {
            state.pushOperand(this.toPush);
        };
    }
}
