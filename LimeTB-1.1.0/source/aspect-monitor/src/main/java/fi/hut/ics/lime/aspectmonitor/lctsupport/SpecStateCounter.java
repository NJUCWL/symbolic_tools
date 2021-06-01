package fi.hut.ics.lime.aspectmonitor.lctsupport;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Singleton used for keeping track of active specification observers.
 * 
 * @author osaariki
 */
public class SpecStateCounter {

	private Map<Object, Integer> returnSpecObservedCount;
	private Map<Object, Integer> callSpecObservedCount;
	private int activeReturnSpecs;
	private int returnSpecsObserved;
	private int callSpecsObserved;

	private SpecStateCounter() {
		returnSpecObservedCount = new IdentityHashMap<Object, Integer>();
		callSpecObservedCount = new IdentityHashMap<Object, Integer>();
	}

	/*
	 * Using a static class to hold the instance allows for lazy instantiation.
	 */
	private static class SingletonHolder {
		static SpecStateCounter instance = new SpecStateCounter();
	}

	/**
	 * @return the singleton instance.
	 */
	public static SpecStateCounter instance() {
		return SingletonHolder.instance;
	}

	/**
	 * Call specification observer advices call this.
	 * 
	 * @param specification
	 *            the specification.
	 */
	public void addCallSpec(Object specification) {
		callSpecObservedCount.put(specification, 0);
	}

	/**
	 * Return specification observer advices call this.
	 * 
	 * @param specification
	 *            the specification.
	 */
	public void addReturnSpec(Object specification) {
		returnSpecObservedCount.put(specification, 0);
	}

	/**
	 * Call specification observer advices call this.
	 */
	public void enteredCallSpec(Object specification) {
		callSpecObservedCount.put(specification, callSpecObservedCount.get(specification) + 1);
		++callSpecsObserved;
	}

	/**
	 * Return specification observer advices call this.
	 */
	public void enteredReturnSpec(Object specification) {
		returnSpecObservedCount.put(specification, returnSpecObservedCount.get(specification) + 1);
		++activeReturnSpecs;
		++returnSpecsObserved;
	}

	/**
	 * Return specification observer advices call this.
	 */
	public void exitedReturnSpec() {
		--activeReturnSpecs;
	}

	/**
	 * @return number of return specification observers that have been entered but have not been exited.
	 */
	public int getActiveReturnSpecs() {
		return activeReturnSpecs;
	}

	/**
	 * @return number of times call specifications have been observed.
	 */
	public int getCallSpecsObserved() {
		return callSpecsObserved;
	}

	/**
	 * @return number of times return specifications have been observed.
	 */
	public int getReturnSpecsObserved() {
		return returnSpecsObserved;
	}
}
