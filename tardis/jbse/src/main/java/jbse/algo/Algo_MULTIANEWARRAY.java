package jbse.algo;

import static jbse.algo.Util.exitFromAlgorithm;
import static jbse.algo.Util.invokeClassLoaderLoadClass;
import static jbse.algo.Util.throwNew;
import static jbse.algo.Util.throwVerifyError;
import static jbse.bc.Offsets.MULTIANEWARRAY_OFFSET;
import static jbse.bc.Signatures.ILLEGAL_ACCESS_ERROR;
import static jbse.bc.Signatures.INCOMPATIBLE_CLASS_CHANGE_ERROR;
import static jbse.bc.Signatures.NO_CLASS_DEFINITION_FOUND_ERROR;
import static jbse.bc.Signatures.UNSUPPORTED_CLASS_VERSION_ERROR;

import java.util.function.Supplier;

import jbse.bc.ClassFile;
import jbse.bc.exc.BadClassFileVersionException;
import jbse.bc.exc.ClassFileIllFormedException;
import jbse.bc.exc.ClassFileNotAccessibleException;
import jbse.bc.exc.ClassFileNotFoundException;
import jbse.bc.exc.IncompatibleClassFileException;
import jbse.bc.exc.PleaseLoadClassException;
import jbse.bc.exc.WrongClassNameException;
import jbse.common.exc.ClasspathException;
import jbse.common.exc.InvalidInputException;
import jbse.mem.State;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.val.Primitive;

/**
 * Algorithm managing the multianewarray bytecode.
 * 
 * @author Pietro Braione
 */
final class Algo_MULTIANEWARRAY extends Algo_XNEWARRAY<BytecodeData_2CLUB> {

    @Override
    protected Supplier<Integer> numOperands() {
        return () -> (int) this.data.immediateUnsignedByte();
    }

    @Override
    protected Supplier<BytecodeData_2CLUB> bytecodeData() {
        return BytecodeData_2CLUB::get;
    }

    @Override
    protected void preCook(State state) 
    throws InterruptException, ThreadStackEmptyException, InvalidInputException, ClasspathException {
        //checks the number of dimensions
        final int ndims = this.data.immediateUnsignedByte();
        if (ndims <= 0) {
            throwVerifyError(state);
            exitFromAlgorithm();
        }

        //sets the array dimensions
        this.dimensionsCounts = new Primitive[ndims];
        try {
            for (int i = 0; i < ndims; ++i) {
                this.dimensionsCounts[i] = (Primitive) this.data.operand(i);
                //TODO length check?
            }
        } catch (ClassCastException e) {
            throwVerifyError(state);
            exitFromAlgorithm();
        }

        try {
            //performs resolution
            final ClassFile currentClass = state.getCurrentClass();
            this.arrayType = state.getClassHierarchy().resolveClass(currentClass, this.data.className(), state.bypassStandardLoading());
        } catch (PleaseLoadClassException e) {
            invokeClassLoaderLoadClass(state, e);
            exitFromAlgorithm();
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
    }

    @Override
    protected Supplier<Integer> programCounterUpdate() {
        return () -> MULTIANEWARRAY_OFFSET;
    }
}