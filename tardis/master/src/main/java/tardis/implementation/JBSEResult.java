package tardis.implementation;

import java.util.HashMap;
import java.util.Map;

import jbse.mem.State;

public class JBSEResult {
	private final String targetClassName;
	private final String targetMethodDescriptor;
	private final String targetMethodName;
	private final State initialState;
	private final State preState;
	private final State finalState;
	private final boolean atJump;
	private final HashMap<Long, String> stringLiterals;
	private final int depth;
	
	public JBSEResult(String targetClassName, String targetMethodDescriptor, String targetMethodName, State initialState, State preState, State finalState, boolean atJump, Map<Long, String> stringLiterals, int depth) {
		this.targetClassName = targetClassName;
		this.targetMethodDescriptor = targetMethodDescriptor;
		this.targetMethodName = targetMethodName;
		this.initialState = initialState.clone();
		this.preState = preState.clone();
		this.finalState = finalState.clone();
		this.atJump = atJump;
		this.stringLiterals = new HashMap<>(stringLiterals); //safety copy
		this.depth = depth;
	}
	
	public JBSEResult(EvosuiteResult er, State initialState, State preState, State finalState, boolean atJump, Map<Long, String> stringLiterals, int depth) {
		this.targetClassName = er.getTargetMethodClassName();
		this.targetMethodDescriptor = er.getTargetMethodDescriptor();
		this.targetMethodName = er.getTargetMethodName();
		this.initialState = initialState.clone();
		this.preState = preState.clone();
		this.finalState = finalState.clone();
		this.atJump = atJump;
		this.stringLiterals = new HashMap<>(stringLiterals); //safety copy
		this.depth = depth;
	}
	
	public String getTargetClassName() {
		return this.targetClassName;
	}
	
	public String getTargetMethodDescriptor() {
		return this.targetMethodDescriptor;
	}
	
	public String getTargetMethodName() {
		return this.targetMethodName;
	}
	
	public State getInitialState() {
		return this.initialState;
	}
	
	public State getPreState() {
		return this.preState;
	}
	
	public State getFinalState() {
		return this.finalState;
	}
	
	public boolean getAtJump() {
		return this.atJump;
	}
	
	public Map<Long, String> getStringLiterals() {
		return this.stringLiterals;
	}
	
	public int getDepth() {
		return this.depth;
	}	
}
