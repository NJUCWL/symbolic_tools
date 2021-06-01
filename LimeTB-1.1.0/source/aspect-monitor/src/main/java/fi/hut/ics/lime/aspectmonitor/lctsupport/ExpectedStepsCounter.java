package fi.hut.ics.lime.aspectmonitor.lctsupport;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Singleton used for keeping track of the expected steps to violation reported by observers.
 * 
 * @author osaariki
 */
public class ExpectedStepsCounter {

	/**
	 * The maximum number of expected steps representable (limitation of the LCT).
	 */
	public static final int MAX_EXPECTED_STEPS = 327;

	private Map<Object, Double> callSpecExpectedSteps;
	private Map<Object, Double> returnSpecExpectedSteps;
	private Map<Object, Integer> expectedStepsAge;

	private ExpectedStepsCounter() {
		callSpecExpectedSteps = new IdentityHashMap<Object, Double>();
		returnSpecExpectedSteps = new IdentityHashMap<Object, Double>();
		expectedStepsAge = new IdentityHashMap<Object, Integer>();
	}

	/*
	 * Using a static class to hold the instance allows for lazy instantiation.
	 */
	private static class SingletonHolder {
		static ExpectedStepsCounter instance = new ExpectedStepsCounter();
	}

	/**
	 * @return the singleton instance.
	 */
	public static ExpectedStepsCounter instance() {
		return SingletonHolder.instance;
	}

	/**
	 * @return map of observer objects to expected steps to a violation for all tracked call specification observers.
	 */
	public Map<Object, Double> getCallSpecExpectedSteps() {
		return callSpecExpectedSteps;
	}

	/**
	 * @return map of observer objects to expected steps to a violation for all tracked return specification observers.
	 */
	public Map<Object, Double> getReturnSpecExpectedSteps() {
		return returnSpecExpectedSteps;
	}

	/**
	 * @return map of observer objects to expected steps to a violation for all tracked observers.
	 */
	public Map<Object, Double> getExpectedSteps() {
		Map<Object, Double> allExpectedSteps = new IdentityHashMap<Object, Double>();
		allExpectedSteps.putAll(callSpecExpectedSteps);
		allExpectedSteps.putAll(returnSpecExpectedSteps);
		return allExpectedSteps;
	}

	/**
	 * @return a map from observer objects to to counts of how many other observers have been updated since the last
	 *         update of the observer in question.
	 */
	public Map<Object, Integer> getExpectedStepsAges() {
		return expectedStepsAge;
	}
	
	/**
	 * @return a set of all the observer objects.
	 */
	public Set<Object> getObservers() {
		return expectedStepsAge.keySet();
	}

	/**
	 * Called by observers to update their current fitness value.
	 * 
	 * @param observer
	 *            the observer instance to update.
	 * @param steps
	 *            the expected number of steps to violation.
	 */
	public void updateCallSpec(Object observer, double steps) {
		callSpecExpectedSteps.put(observer, steps);
		for (Object key : expectedStepsAge.keySet())
			expectedStepsAge.put(key, expectedStepsAge.get(key) + 1);
		expectedStepsAge.put(observer, 0);
	}

	/**
	 * Called by observers to update their current fitness value.
	 * 
	 * @param observer
	 *            the observer instance to update.
	 * @param steps
	 *            the expected number of steps to violation.
	 */
	public void updateReturnSpec(Object observer, double steps) {
		returnSpecExpectedSteps.put(observer, steps);
		for (Object key : expectedStepsAge.keySet())
			expectedStepsAge.put(key, expectedStepsAge.get(key) + 1);
		expectedStepsAge.put(observer, 0);
	}
}
