package jbse.val;

import static jbse.common.Type.INT;

import jbse.common.exc.InvalidInputException;
import jbse.val.exc.InvalidTypeException;

/**
 * Class that represent a {@link PrimitiveSymbolicMember} whose origin is the
 * length of an array.
 */
public final class PrimitiveSymbolicMemberArrayLength extends PrimitiveSymbolicMember {
	private final String originString;
	private final int hashCode;
	
    /**
     * Constructor.
     * 
     * @param container a {@link ReferenceSymbolic}, the container object
     *        this symbol originates from. It must not be {@code null} and 
     *        it must refer an array.
     * @param index a {@link Primitive}, the index of the slot in the 
     *        container array this symbol originates from.
     * @param id an {@link int}, the identifier of the symbol. Different
     *        object with same identifier will be treated as equal.
     * @param calc a {@link Calculator}. It must not be {@code null}.
     * @throws InvalidTypeException never.
     * @throws InvalidInputException if {@code calc == null}. 
     * @throws NullPointerException if {@code container == null}.
     */
    PrimitiveSymbolicMemberArrayLength(ReferenceSymbolic container, int id, Calculator calc) 
    throws InvalidTypeException, InvalidInputException {
    	super(container, id, INT, calc);
    	this.originString = getContainer().asOriginString() + ".length";

    	//calculates hashCode
		final int prime = 2357;
		int result = 1;
		result = prime * result + getContainer().hashCode();
		this.hashCode = result;
    }
    
    @Override
    public String asOriginString() {
        return this.originString;
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
		final PrimitiveSymbolicMemberArrayLength other = (PrimitiveSymbolicMemberArrayLength) obj;
		if (!getContainer().equals(other.getContainer())) {
			return false;
		}
		return true;
	}
}