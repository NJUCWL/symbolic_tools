package jbse.tree;

import java.util.LinkedList;

import jbse.common.exc.InvalidInputException;
import jbse.common.exc.UnexpectedInternalException;
import jbse.mem.State;
import jbse.mem.State.Phase;
import jbse.mem.exc.FrozenStateException;
import jbse.val.HistoryPoint;

/**
 * Class storing the {@link State}s in the symbolic execution
 * tree which have been discovered but not yet analyzed. It stores
 * only the states at branch points.
 * 
 * @author Pietro Braione
 * @author unknown
 */

public class StateTree {
    /**
     * Enumeration of the different kinds of state identifiers.
     * 
     * @author Pietro Braione
     */
    public static enum StateIdentificationMode { 
        /** 
         * Each branch is identified by a number
         * which represents the extraction order 
         * from this tree. This identification is highly dependent
         * on the decision procedure, which may prune some branches,
         * but it is compact and exec-faithful (i.e., the  
         * lexicographic order of branch identifiers reflects the
         * visiting order of the symbolic execution).
         */
        COMPACT, 

        /**
         * Each branch is identified by a number reflecting
         * the decision which generated it. This identification is
         * not exec-faithful but generates short identifiers and is 
         * less dependent on the decision procedure.
         */
        REPLICABLE,

        /**
         * Each branch is identified by a complex string 
         * identifier reflecting the decision which generated it.
         * This identification may be complex and not exec-faithful, 
         * but univocally identifies symbolic execution
         * traces up to target code recompilation.
         */
        LONG;
    };
    
    /**
     * Enumeration indicating how many branches will be created.
     * 
     * @author Pietro Braione
     */
    public static enum BreadthMode {
        /**
         * Create a branch only when a decision produces
         * at least two different results. If the execution
         * is guided, it will not produce any branch. 
         * This yields the most breadth-compact tree. 
         */
        MORE_THAN_ONE,

        /**
         * Creates a branch only when a decision involving
         * symbolic values is taken, filtering out all the
         * symbolic decisions that have been resolved before
         * (just on references).
         */
        ALL_DECISIONS_NONTRIVIAL,

        /**
         * Create a branch whenever a decision involving 
         * symbolic values is taken, independently on 
         * the number of possible outcomes.
         */
        ALL_DECISIONS_SYMBOLIC,

        /**
         * Create a branch whenever we hit a bytecode that
         * may invoke a decision procedure, independently
         * on whether all the involved values are concrete
         * or not.
         */
        ALL_DECISIONS;
    }

    /**
     * A Memento for tree branches.
     * 
     * @author Pietro Braione
     */
    public static class BranchPoint { }

    /** 
     * Private class gathering information on a branch.
     * 
     * @author Pietro Braione
     */ 
    private static class BranchInfo {
        /** A {@link BranchPoint}. */
        BranchPoint branch;

        /** 
         * The total number of states in the branch identified by {@code branch}. 
         * Used for COMPACT branch identification.
         */ 
        int totalStates;

        /** 
         * The number of states of {@code branch} already emitted. 
         * Used for COMPACT branch identification.
         */
        int emittedStates;

        /** 
         * Constructor for branch identification.
         */
        BranchInfo() {
            this.branch = new BranchPoint();
            this.totalStates = 0;
            this.emittedStates = 0;
        }
    }

    /** State identification mode. */
    private final StateIdentificationMode stateIdMode;

    /** Breadth mode. */
    private final BreadthMode breadthMode;

    /** Buffer of the inserted {@link State}s. */
    private final LinkedList<State> stateBuffer = new LinkedList<State>();

    /** Buffer of the inserted {@link BranchInfo}s. */
    private final LinkedList<BranchInfo> branchList = new LinkedList<BranchInfo>();

    /** 
     * Flag indicating whether the tree level has been increased 
     * since the last inspection by invocation of {@link #createdBranch()}.
     */
    private boolean createdBranch = false;

    
    /**
     * Constructor.
     */
    public StateTree(StateIdentificationMode stateIdMode, BreadthMode breadthMode) {
        this.stateIdMode = stateIdMode;
        this.breadthMode = breadthMode;
    }

    /**
     * Returns the branch identification mode.
     * 
     * @return a {@link StateIdentificationMode}.
     */
    public StateIdentificationMode getBranchIdentificationMode() {
        return this.stateIdMode;
    }
    
    /**
     * Returns the pre-initial history point, based
     * on the branch identification mode.
     * 
     * @return a {@link HistoryPoint}.
     */
    public HistoryPoint getPreInitialHistoryPoint() {
    	return HistoryPoint.startingPreInitial(this.stateIdMode == StateIdentificationMode.COMPACT);
    }
    
    /**
     * Adds a state to the store without specifying
     * its branch identification. This method works
     * for pre-initial and initial states (secretly also
     * for post-initial states whose identification 
     * mode is compact).
     * 
     * @param s the {@link State} to be added.
     * @throws InvalidInputException if this method is
     *         used to add a state when the state identification
     *         mode is replicable or long, or if it is invoked
     *         when there is a pre-initial or initial state to be emitted.
     */
    public void addState(State s) throws InvalidInputException {
    	final Phase phase = s.phase();
    	if (phase == Phase.PRE_INITIAL || phase == Phase.INITIAL) {
    		if (hasStates()) {
    			throw new InvalidInputException("Tried to add a state with a not yet emitted " + (phase == Phase.PRE_INITIAL ? "pre-" : "") + "initial state.");
    		}
    		s.resetDepth();
    		s.resetCount();
    		addBranchPoint();
    	} else { //(phase == Phase.POST_INITIAL)
    		if (this.stateIdMode == StateIdentificationMode.COMPACT) {
        		//does nothing, in compact mode nextState() will update it            
    		} else {
        		throw new InvalidInputException("Tried to add a post-initial state in non-compact mode without specifing its branch identification.");
    		}
    	}
    	add(s);
    }

    /**
     * Adds a state to the store. This method works only
     * for the post-initial states.
     * 
     * @param s the {@link State} to be added.
     * @param branchNumber a {@link int}, the number of the branch starting from {@code s}
     *        (used when the state identification mode is {@link StateIdentificationMode#REPLICABLE}).
     * @param branchIdentifier a {@link String}, the identifier of the branch starting from {@code s}
     *        (used when the state identification mode is {@link StateIdentificationMode#LONG}).
     * @throws InvalidInputException if {@code s} is frozen, or if this method is used to add a pre-initial 
     *         or initial state.
     */
    public void addState(State s, int branchNumber, String branchIdentifier) throws InvalidInputException {
    	if (s.phase() == Phase.POST_INITIAL) {
    		//updates the state identifier
    		if (this.stateIdMode == StateIdentificationMode.COMPACT) {
    			addState(s);
    		} else if (this.stateIdMode == StateIdentificationMode.REPLICABLE) {
    			s.addBranchToHistoryPoint(String.valueOf(branchNumber));
        		add(s);
    		} else { // (this.stateIdMode == StateIdentificationMode.LONG)
    			s.addBranchToHistoryPoint(branchIdentifier);
        		add(s);
    		}
    	} else { 
    		throw new InvalidInputException("Tried to add a " + (s.phase() == Phase.PRE_INITIAL ? "pre-" : "") + "initial state by specifing its branch identification.");
    	}
    }

    /**
     * Checks whether some {@link State} can be emitted.
     * 
     * @return true iff the store has one or more states 
     *              to emit.
     */
    public boolean hasStates() {
        return !this.stateBuffer.isEmpty();
    }
    
    /**
     * Returns the number of states that remain to be explored
     * at a given branch.
     * 
     * @param bp a {@link BranchPoint}.
     * @return the number of states at the branch identified by {@code bp} 
     *         that must be emitted yet.
     */
    public int getNumOfStatesAtBranch(BranchPoint bp) {
    	for (BranchInfo info : this.branchList) {
    		if (info.branch == bp) {
    			return info.totalStates - info.emittedStates;
    		}
    	}
    	return 0;
    }

    /**
     * Returns the number of states that remain to be explored
     * at a given branch.
     * 
     * @param bp a {@link BranchPoint}.
     * @return the number of states at the branch identified by {@code bp} 
     *         that must be emitted.
     * @throws InvalidInputException if
     */
    public State getStateAtBranch(BranchPoint bp, int index) throws InvalidInputException {
    	if (index < 0 || index > getNumOfStatesAtBranch(bp)) {
    		throw new InvalidInputException("Tried to get state at branch " + bp + " with index " + index + " (total number of states at branch is " + getNumOfStatesAtBranch(bp) + ").");
    	}
    	int position = 0;
    	boolean found = false;
    	for (BranchInfo info : this.branchList) {
    		if (info.branch == bp) {
    			found = true;
    			break;
    		}
    		position += info.totalStates - info.emittedStates;
    	}
    	if (found) {
    		return this.stateBuffer.get(position + index);
    	} else {
    		throw new InvalidInputException("Tried to get state at branch " + bp + " but no state seems to exist at branch.");
    	}
    }

    /**
     * Removes the next state from the store and emits it.
     * 
     * @return the {@link State} removed from the store.
     * @throws FrozenStateException if the returned {@link State} is frozen.
     * @throws NoSuchElementException if {@link #hasStates()} {@code == false}.
     */
    public State nextState() throws FrozenStateException {
        final State s = this.stateBuffer.removeFirst();
        final BranchInfo b = this.branchList.getFirst();
        ++b.emittedStates;
        if (b.emittedStates == b.totalStates) {
            this.branchList.removeFirst();
        }
        
        if (this.stateIdMode == StateIdentificationMode.COMPACT && s.phase() == Phase.POST_INITIAL) {
            s.addBranchToHistoryPoint(String.valueOf(b.emittedStates));
        } //else, the history point was already set by addState

        return s;
    }    
    
    
    /**
     * Possibly increases by one the level of the tree. 
     * Note that increasing the level without adding a 
     * {@code State} will crash the engine.
     * 
     * @param moreThanOne {@code true} iff the 
     *        created branch will have more than one state. 
     * @param trivial iff the branch originates from a 
     *        trivial decision.
     * @param concrete iff the branch originates from a 
     *        concrete decision.
     * @param noDecision iff the branch originates from a
     *        bytecode that takes no decision.
     * @return {@code true} iff the method has increased
     *         the tree level.
     */
    public boolean possiblyAddBranchPoint(boolean moreThanOne, boolean trivial, boolean concrete, boolean noDecision) {
        boolean retVal = moreThanOne;
        switch (this.breadthMode) {
        case MORE_THAN_ONE:
            break;
        case ALL_DECISIONS_NONTRIVIAL:
            retVal = retVal || !trivial;
            break;
        case ALL_DECISIONS_SYMBOLIC:
            retVal = retVal || !concrete;
            break;
        case ALL_DECISIONS:
            retVal = retVal || !noDecision;
            break;
        default: 
            throw new UnexpectedInternalException("Unexpected breadth mode " + this.breadthMode + ".");	    		
        }

        if (retVal) {
            addBranchPoint();
        }

        return retVal;
    }

    /**
     * Increases by one the level of the tree. Note that 
     * increasing the level without adding a {@code State}
     * will crash the engine.
     */
    private void addBranchPoint() {
        this.branchList.addFirst(new BranchInfo());
        this.createdBranch = true;
    }

    /**
     * Checks whether a new level of the tree has been created 
     * since the last invocation of this method.
     * 
     * @return {@code true} if {@link #addBranchPoint}
     *         has been invoked since the previous invocation 
     *         of {@code createdBranch}, {@code false} 
     *         otherwise.
     */
    public boolean createdBranch() {
        final boolean retval = this.createdBranch;

        this.createdBranch = false;
        return retval;
    }

    /**
     * Returns the next branch point.
     * 
     * @return the {@link BranchPoint} associated to the next
     *         state as it would be returned 
     *         by a call to {@link #nextState}, 
     *         or {@code null} in the case such state does not 
     *         exist.  
     */
    public BranchPoint nextBranch() {
        if (this.branchList.isEmpty()) {
            return null;
        } else {
            return this.branchList.getFirst().branch;
        }
    }    

    /**
     * Adds a state to the buffer and increases the 
     * total count of states in the branch.
     * 
     * @param s the {@link State} to be added.
     */
    private void add(State s) {
        this.stateBuffer.addFirst(s);
        ++(this.branchList.getFirst().totalStates);
    }
}
