package jbse.val;

import jbse.common.exc.InvalidInputException;
import jbse.val.exc.InvalidTypeException;

/**
 * Class that represent a {@link PrimitiveSymbolic} atomic 
 * (non computed) value. 
 */
public abstract class PrimitiveSymbolicAtomic extends PrimitiveSymbolic implements SymbolicAtomic {    
    /** The string representation of this object. */
    private final String toString;
    
    /**
     * Constructor.
     * 
     * @param id an {@link int}, the identifier of the symbol. Different
     *        object with same identifier will be treated as equal.
     * @param type the type of the represented value.
     * @param historyPoint the current {@link HistoryPoint}. It must not be {@code null}.
     * @param calc a {@link Calculator}. It must not be {@code null}.
     * @throws InvalidTypeException if {@code type} is not primitive.
     * @throws InvalidInputException if {@code calc == null || historyPoint == null}.
     */
    PrimitiveSymbolicAtomic(int id, char type, HistoryPoint historyPoint, Calculator calc) 
    throws InvalidTypeException, InvalidInputException {
    	super(type, historyPoint, calc);
        
    	//calculates toString
    	this.toString = "{V" + id + "}";
    }

    @Override
    public final void accept(PrimitiveVisitor v) throws Exception {
        v.visitPrimitiveSymbolicAtomic(this);
    }

    @Override
    public final String toString() {
        return this.toString;
    }
}