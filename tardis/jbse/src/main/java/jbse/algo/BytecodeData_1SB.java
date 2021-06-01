package jbse.algo;

import jbse.common.exc.ClasspathException;
import jbse.mem.State;
import jbse.mem.exc.FrozenStateException;

/**
 * Zero implicits, 
 * one immediate (signed byte).
 * 
 * @author Pietro Braione
 */
public final class BytecodeData_1SB extends BytecodeData {
    @Override
    protected void readImmediates(State state) 
    throws InterruptException, ClasspathException, FrozenStateException {
        readImmediateSignedByte(state, 1);
    }

    /**
     * Do not instantiate!
     */
    private BytecodeData_1SB() {
        //nothing to do
    }    

    /**
     * Factory method.
     * 
     * @return a {@link BytecodeData_1SB}.
     */
    public static BytecodeData_1SB get() {
        return new BytecodeData_1SB();
    }
}
