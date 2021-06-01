package tardis.implementation;

import static tardis.implementation.Util.shorten;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import jbse.algo.exc.CannotManageStateException;
import jbse.bc.exc.InvalidClassFileFactoryClassException;
import jbse.common.exc.ClasspathException;
import jbse.dec.exc.DecisionException;
import jbse.jvm.exc.CannotBacktrackException;
import jbse.jvm.exc.CannotBuildEngineException;
import jbse.jvm.exc.EngineStuckException;
import jbse.jvm.exc.FailureException;
import jbse.jvm.exc.InitializationException;
import jbse.jvm.exc.NonexistingObservedVariablesException;
import jbse.mem.Clause;
import jbse.mem.State;
import jbse.mem.exc.ContradictionException;
import jbse.mem.exc.ThreadStackEmptyException;
import tardis.Options;
import tardis.framework.InputBuffer;
import tardis.framework.OutputBuffer;
import tardis.framework.Performer;

public final class PerformerJBSE extends Performer<EvosuiteResult, JBSEResult> {
	private final Options o;
	private final int maxDepth;
	private final CoverageSet coverageSet;

	public PerformerJBSE(Options o, InputBuffer<EvosuiteResult> in, OutputBuffer<JBSEResult> out, CoverageSet coverageSet) {
		super(in, out, o.getNumOfThreads(), 1, o.getGlobalTimeBudgetDuration(), o.getGlobalTimeBudgetUnit());
		this.o = o.clone();
		this.maxDepth = o.getMaxDepth();
		this.coverageSet = coverageSet;
	}
	
	@Override
	protected final Runnable makeJob(List<EvosuiteResult> items) {
		final EvosuiteResult item = items.get(0);
		final Runnable job = () -> {
			try {
				explore(item, item.getStartDepth());
			} catch (DecisionException | CannotBuildEngineException | InitializationException |
					InvalidClassFileFactoryClassException | NonexistingObservedVariablesException |
					ClasspathException | CannotBacktrackException | CannotManageStateException |
					ThreadStackEmptyException | ContradictionException | EngineStuckException |
					FailureException e ) {
				System.out.println("[JBSE    ] Unexpected exception raised while exploring test case " + item.getTestCase().getClassName() + ": " + e.getMessage());
			}
		};
		return job;
	}
	
	/**
	 * Executes a test case and generates tests for all the alternative branches
	 * starting from some depth up to some maximum depth.
	 * 
	 * @param item a {@link EvosuiteResult}.
	 * @param startDepth the depth to which generation of tests must be started.
	 * @throws DecisionException
	 * @throws CannotBuildEngineException
	 * @throws InitializationException
	 * @throws InvalidClassFileFactoryClassException
	 * @throws NonexistingObservedVariablesException
	 * @throws ClasspathException
	 * @throws CannotBacktrackException
	 * @throws CannotManageStateException
	 * @throws ThreadStackEmptyException
	 * @throws ContradictionException
	 * @throws EngineStuckException
	 * @throws FailureException
	 */
	private void explore(EvosuiteResult item, int startDepth) 
			throws DecisionException, CannotBuildEngineException, InitializationException, 
			InvalidClassFileFactoryClassException, NonexistingObservedVariablesException, 
			ClasspathException, CannotBacktrackException, CannotManageStateException, 
			ThreadStackEmptyException, ContradictionException, EngineStuckException, 
			FailureException {
		if (this.maxDepth <= 0) {
			return;
		}
		//runs the test case up to the final state, and takes the final state's path condition
		final RunnerPath rp = new RunnerPath(this.o, item);
		final State tcFinalState = rp.runProgram();
		final Collection<Clause> tcFinalPC = tcFinalState.getPathCondition();
		this.coverageSet.addAll(rp.getCoverage());
		
		//prints some feedback
		final TestCase tc = item.getTestCase();
		System.out.println("[JBSE    ] Run test case " + tc.getClassName() + ", path condition " + shorten(tcFinalPC).toString());
		final int coverage = this.coverageSet.size();
		System.out.println("[JBSE    ] Current coverage: " + coverage + " branch" + (coverage == 1 ? "" : "es"));
		final int tcFinalDepth = tcFinalState.getDepth();
		
		//reruns the test case, and generates all the modified path conditions
		boolean noPathConditionGenerated = true;
		for (int currentDepth = startDepth; currentDepth < Math.min(this.maxDepth, tcFinalDepth); ++currentDepth) {
			//runs the program
			final List<State> newStates = rp.runProgram(currentDepth);
			
			//checks shutdown of the performer
			if (Thread.interrupted()) {
				return;
			}
			
			//creates all the output jobs
			final State initialState = rp.getInitialState();
			final State preState = rp.getPreState();
			final boolean atJump = rp.getAtJump();
			final Map<Long, String> stringLiterals = rp.getStringLiterals();
			for (State newState : newStates) {
				final Collection<Clause> currentPC = newState.getPathCondition();
				if (alreadyExplored(currentPC, tcFinalPC)) {
					continue;
				}
				this.getOutputBuffer().add(new JBSEResult(item, initialState, preState, newState, atJump, stringLiterals, currentDepth));
				System.out.println("[JBSE    ] From test case " + tc.getClassName() + " generated path condition " + shorten(currentPC).toString());
				noPathConditionGenerated = false;
			}
		}
		if (noPathConditionGenerated) {
			System.out.println("[JBSE    ] From test case " + tc.getClassName() + " no path condition generated");
		}
	}

	private static boolean alreadyExplored(Collection<Clause> newPC, Collection<Clause> oldPC) {
		final List<Clause> donePC = 
				Arrays.asList(Arrays.copyOfRange(oldPC.toArray(new Clause[0]), 0, newPC.size()));
		if (donePC.toString().equals(newPC.toString())) {
			return true;
		} else {
			return false;
		}
	}	
}

