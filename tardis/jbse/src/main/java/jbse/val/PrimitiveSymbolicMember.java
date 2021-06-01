package jbse.val;

import jbse.common.exc.InvalidInputException;
import jbse.val.exc.InvalidTypeException;

/**
 * Class that represent a {@link PrimitiveSymbolicAtomic} whose origin is not a root
 * (that is, is a member of an object transitively referred by a root). 
 */
public abstract class PrimitiveSymbolicMember extends PrimitiveSymbolicAtomic implements SymbolicMember {
    private final ReferenceSymbolic container;

    /**
     * Constructor.
     * 
     * @param container a {@link ReferenceSymbolic}, the container object
     *        this symbol originates from. It must not be {@code null}.
     * @param id an {@link int}, the identifier of the symbol. Different
     *        object with same identifier will be treated as equal.
     * @param type the type of the represented value.
     * @param calc a {@link Calculator}. It must not be {@code null}.
     * @throws InvalidTypeException if {@code type} is not primitive.
     * @throws InvalidInputException if {@code calc == null}. 
     * @throws NullPointerException if {@code container == null}.
     */
    PrimitiveSymbolicMember(ReferenceSymbolic container, int id, char type, Calculator calc) 
    throws InvalidTypeException, InvalidInputException {
    	super(id, type, container.historyPoint(), calc);
    	this.container = container;
    }

    @Override
    public final ReferenceSymbolic getContainer() {
        return this.container;
    }
}