package jbse.val;

import jbse.common.exc.InvalidInputException;
import jbse.val.exc.InvalidTypeException;

/**
 * Class that represent a {@link PrimitiveSymbolicAtomic} whose origin is a 
 * local variable in the root frame. 
 */
public final class PrimitiveSymbolicLocalVariable extends PrimitiveSymbolicAtomic implements SymbolicLocalVariable {
    private final String variableName;
    private final String originString;
    private final int hashCode;
    
    /**
     * Constructor.
     * 
     * @param variableName a {@link String}, the name of the local variable
     *        in the root frame this symbol originates from.
     * @param id an {@link int}, the identifier of the symbol. Different
     *        object with same identifier will be treated as equal.
     * @param type the type of the represented value.
     * @param historyPoint the current {@link HistoryPoint}. It must not be {@code null}.
     * @param calc a {@link Calculator}. It must not be {@code null}.
     * @throws InvalidTypeException if {@code type} is not primitive.
     * @throws InvalidInputException if {@code calc == null || historyPoint == null}.
     */
    PrimitiveSymbolicLocalVariable(String variableName, int id, char type, HistoryPoint historyPoint, Calculator calc) 
    throws InvalidTypeException, InvalidInputException {
    	super(id, type, historyPoint, calc);
    	this.variableName = variableName;
    	this.originString = "{ROOT}:" + this.variableName;
    	
    	//calculates hashCode
		final int prime = 2699;
		int result = 1;
		result = prime * result + variableName.hashCode();
		this.hashCode = result;
    }
    
    @Override
    public String getVariableName() {
        return this.variableName;
    }
    
    @Override
    public String asOriginString() {
        return this.originString;
    }

	@Override
	public Symbolic root() {
		return this;
	}

	@Override
	public boolean hasContainer(Symbolic s) {
		if (s == null) {
			throw new NullPointerException();
		}
		return equals(s);
	}

	@Override
	public int hashCode() {
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final PrimitiveSymbolicLocalVariable other = (PrimitiveSymbolicLocalVariable) obj;
		if (!this.variableName.equals(other.variableName)) {
			return false;
		}
		return true;
	}
}