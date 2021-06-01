package jbse.algo;

import static jbse.mem.Array.arrayPrimitiveType;

import jbse.common.exc.ClasspathException;
import jbse.mem.State;
import jbse.mem.exc.FrozenStateException;

/**
 * Zero implicits,
 * one immediate (array primitive type).
 * 
 * @author Pietro Braione
 */
public final class BytecodeData_1AT extends BytecodeData {
    @Override
    protected void readImmediates(State state) 
    throws InterruptException, ClasspathException, FrozenStateException {
        readImmediateUnsignedByte(state, 1);
        setPrimitiveType(state, arrayPrimitiveType(immediateUnsignedByte()));
    }

    /**
     * Do not instantiate!
     */
    private BytecodeData_1AT() {
        //nothing to do
    }    

    /**
     * Factory method.
     * 
     * @return a {@link BytecodeData_1AT}.
     */
    public static BytecodeData_1AT get() {
        return new BytecodeData_1AT();
    }
}
