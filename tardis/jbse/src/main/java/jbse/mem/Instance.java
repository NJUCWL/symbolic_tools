package jbse.mem;

/**
 * Class that represent an instance of an object in the heap.
 */
public interface Instance extends Objekt {
	Instance clone();
}