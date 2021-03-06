package fi.hut.ics.lime.aspectmonitor.aspect.generator;

import java.util.Map;
import java.util.Map.Entry;

import fi.hut.ics.lime.aspectmonitor.LogUtility;
import fi.hut.ics.lime.aspectmonitor.aspect.AspectJAspect;
import fi.hut.ics.lime.aspectmonitor.aspect.components.JavaAroundAdvice;
import fi.hut.ics.lime.aspectmonitor.aspect.components.JavaProceed;
import fi.hut.ics.lime.aspectmonitor.lctsupport.SpecExecutionSampler;
import fi.hut.ics.lime.common.annotation.SpecType;
import fi.hut.ics.lime.common.aspect.Aspect;
import fi.hut.ics.lime.common.aspect.AspectException;
import fi.hut.ics.lime.common.aspect.components.CodeFragment;
import fi.hut.ics.lime.common.aspect.generator.UndefinedValueException;
import fi.hut.ics.lime.common.automaton.guardedTransitionAutomaton.GuardedTransition;
import fi.hut.ics.lime.common.automaton.guardedTransitionAutomaton.GuardedTransitionAutomaton;
import fi.hut.ics.lime.common.automaton.guardedTransitionAutomaton.State;
import fi.hut.ics.lime.common.logic.ast.node.BooleanExpression;
import fi.hut.ics.lime.common.logic.ast.node.Literal;
import fi.hut.ics.lime.common.logic.ast.node.PropositionNode;
import fi.hut.ics.lime.common.logic.ast.visitors.ValueAssigningVisitor;
import fi.hut.ics.lime.common.sourcecode.Method;
import fi.hut.ics.lime.common.specification.PltlSpecification;
import fi.hut.ics.lime.common.specification.Specification;
import fi.hut.ics.lime.common.specification.propositions.Proposition;
import fi.hut.ics.lime.common.specification.propositions.PropositionException;
import fi.hut.ics.lime.common.specification.propositions.PropositionFactory;

/**
 * A generator for creating aspect contents from a specification.
 * @author jalampin
 */
public class CodeGenerator 
	extends AbstractCodeGenerator {
	private static final PropositionFactory propositionFactory = PropositionFactory.instance();
	private Method currentMethod = null;
	private JavaAroundAdvice currentAdvice = null;
	private CodeFragment fragment;
	private Map<PropositionNode, Integer> propositionsValues;
	private GuardedTransitionAutomaton automaton;
	private boolean specStateCounting;
	private boolean calculateHeuristic;
	private int samplingDepth, samplesPerHeuristic, maxHeuristics;
	
	/**
	 * Construct a CodeGenerator.
	 * @param specification the specification to generate code for.
	 * @param specStateCounting whether to generate calls to the SpecStateCounter.
	 */
	public CodeGenerator(Specification specification, boolean specStateCounting, boolean calculateHeuristic,
			int samplingDepth, int samplesPerHeuristic, int maxHeuristics) {
		super(specification);
		automaton = specification.getAutomaton();
		this.specStateCounting = specStateCounting;
		this.calculateHeuristic = calculateHeuristic;
		this.samplingDepth = samplingDepth;
		this.samplesPerHeuristic = samplesPerHeuristic;
		this.maxHeuristics = maxHeuristics;
	}
	
	@Override
	public void addToAspect(Aspect aspect) throws AspectException {
		super.addToAspect(aspect);
		
		if(automaton == null || automaton.acceptingStates() == null) {
			return;
		}
		
		if(automaton.acceptingStates().size() == 0) {
			throw new AspectException("unable to enforce - resulting automaton contains no accepting states.\n");
		}
		
		propositionsValues = specification.getPropositionValues();
		
		// ADVICES:		
		for(Entry<Method, JavaAroundAdvice> entry : advices.entrySet()) {
			currentMethod = entry.getKey();
			currentAdvice = entry.getValue();
			
			JavaProceed proceed = new JavaProceed();
			currentAdvice.setProceed(proceed);
			
			// select the correct code fragment to work on:
			if(specification.getSpecType() == SpecType.CALL)
				fragment = currentAdvice.getPreProceedCode();
			else
				fragment = currentAdvice.getPostProceedUnconditionalCode();
			
			createPropositionCode();
			createRefreshCode();
			
			// write the "around <methodname>" part to the logfile here
			currentAdvice.getPreProceedCode().addBegin(LogUtility.getInstance().getAroundCode(specification, currentMethod.getSimpleName()));		
		
			String specType = "Call";
			if (specification.getSpecType() == SpecType.RETURN)
				specType = "Return";
			
			for(State acceptingState : automaton.acceptingStates()) {
				String exceptionName = specification.getException(currentMethod);
				fragment.addEnd("if (state == "+acceptingState.getNumber()+") {\n");
				// write the error message to the logfile here
				fragment.addEnd(LogUtility.getInstance().getErrorCode(specification));
				fragment.addEnd("    if (fi.hut.ics.lime.aspectmonitor.ExceptionOverride.get"+specType+
						"Exception(callTarget) == null)\n");
				fragment.addEnd("        throw new "+exceptionName+"(\""+specification.getName()+"\");\n");
				fragment.addEnd("    else {\n");
				fragment.addEnd("        RuntimeException rtexc;\n");
				fragment.addEnd("        try {\n");
				fragment.addEnd("            rtexc = fi.hut.ics.lime.aspectmonitor.ExceptionOverride.get"+
						specType+"Exception(callTarget).getConstructor(\n");
				fragment.addEnd("                new Class[] { String.class }).newInstance(new Object[] { \""+
						specification.getName()+"\" });\n");
				fragment.addEnd("        } catch (IllegalAccessException e) {\n" +
								"            throw new Error(\"Aspect: barf: \"+e.toString());\n" +
								"        } catch (java.lang.reflect.InvocationTargetException e) {\n" +
								"            throw new Error(\"Aspect: barf: \"+e.toString());\n" +
								"        } catch (NoSuchMethodException e) {\n" +
								"            throw new Error(\"Aspect: barf: \"+e.toString());\n" +
								"        } catch (InstantiationException e) {\n" +
								"            throw new Error(\"Aspect: barf: \"+e.toString());\n" +
								"        }\n");
				fragment.addEnd("        throw rtexc;\n");
				fragment.addEnd("    }\n");
				fragment.addEnd("}\n");
			}
			//createReturn(currentMethod);
			
			if (specStateCounting)
				createSpecStateCountingCode(specification, currentAdvice);
		}
		if (specStateCounting)
			createSpecStateCountingInitializationCode((AspectJAspect) aspect);
		
		createTransitionMethod(aspect);
		
		if (calculateHeuristic) {
			SpecExecutionSampler sampler = new SpecExecutionSampler(specification, samplingDepth, samplesPerHeuristic,
					maxHeuristics);
			sampler.calculateHeuristics();
			sampler.addToAspect((AspectJAspect) aspect);
			transitionMethod.addEnd("updateHeuristic();");
			((AspectJAspect) aspect).getConstructor().addCode("updateHeuristic();\n");
		}
		
		// write the initialization message to the logfile here
		((AspectJAspect) aspect).getConstructor().addCode(LogUtility.getInstance().getInitCode(specification));
	}

	/**
	 * Adds specification state counting code to the given advice.
	 * 
	 * @param advice
	 *            the advice to add the code to.
	 */
	private void createSpecStateCountingCode(Specification specification, JavaAroundAdvice advice) {
		final String specStateCounterInstance = "fi.hut.ics.lime.aspectmonitor.lctsupport.SpecStateCounter.instance()";

		if (specification.getSpecType() == SpecType.CALL) {
			advice.getPreProceedCode().addEnd(specStateCounterInstance + ".enteredCallSpec(this);\n");
		} else {
			advice.getPreProceedCode().addEnd(specStateCounterInstance + ".enteredReturnSpec(this);\n");
			advice.getPostProceedUnconditionalCode().addBegin(specStateCounterInstance + ".exitedReturnSpec();\n");
		}
	}

	/**
	 * Adds specification state counting code to the given advice.
	 * 
	 * @param advice
	 *            the advice to add the code to.
	 */
	private void createSpecStateCountingInitializationCode(AspectJAspect aspect) {
		final String specStateCounterInstance = "fi.hut.ics.lime.aspectmonitor.lctsupport.SpecStateCounter.instance()";

		if (specification.getSpecType() == SpecType.CALL) {
			aspect.getConstructor().addCode(specStateCounterInstance + ".addCallSpec(this);\n");
		} else {
			aspect.getConstructor().addCode(specStateCounterInstance + ".addReturnSpec(this);\n");
		}
	}

	/**
	 * Adds fresh state statement to the end of the currently
	 * handled fragment. For example: refreshState(p0, p1);
	 */
	private void createRefreshCode() {
		String args = null;
		for(int i = 0; i < propositionsValues.size(); i++) {
			args = args == null ? "p"+i : args+", p"+i;
		}
		args = args == null ? "" : args;
		fragment.addEnd(transitionMethod.getName()+"("+args+");\n");
	}

	/**
	 * Adds proposition update code to the end of the currently
	 * handled fragment and creates the needed bindings to
	 * join point context.
	 * 
	 * @throws AspectException on error
	 */
	private void createPropositionCode() throws AspectException {
		Proposition proposition;
		for (Entry<PropositionNode, Integer> entry: propositionsValues.entrySet()) {
			PropositionNode propositionNode = entry.getKey();
			Integer i = entry.getValue();
			propositionNode.setValue("p"+i);
			try {
				proposition = propositionFactory.createProposition(propositionNode);
			} catch (PropositionException e) {
				throw new RuntimeException();
			}
			try {
				generatePropositionCode(proposition, currentMethod, currentAdvice);
			} catch (UndefinedValueException e) {
				//propositionNode.setValue("false");
				// FIXME make sure that at least one execution ends without an
				// exception; if the value proposition is not defined in a particular
				// method, it is defined to be false. However, if it is not defined
				// in any method, it should be an error.
				fragment.addEnd("boolean "+propositionNode.getValue()+" = false; // "+proposition.toString()+"\n");
			}

			currentAdvice.setTarget(specification.getSourceType().getQualifiedName());
			
			if(specification.getSpecType() != SpecType.RETURN) {
				continue;
			}

			bindValues(currentMethod, proposition);
			CodeFragment preFragment = currentAdvice.getPreProceedCode();
			Map<String, String> types = proposition.getPreTypes();
			Map<String, String> values = proposition.getPreValues();
			
			for(String pre : values.keySet()) {
				String c = types.get(pre)+" "+pre+" = "+values.get(pre)+";\n";
				preFragment.addBegin(c);
			}
		}
	}
	
	/**
	 * Adds a transition method to the end of the currently
	 * handled fragment. The transition method consists of
	 * past time formula updates and a switch statement
	 * for updating the automaton state.
	 * 
	 * @throws AspectException if past time formula code
	 * generation fails (e.g., unsupported operators)
	 */
	private void createTransitionMethod(Aspect aspect)
	throws AspectException	{
		for(int i = 0; i < propositionsValues.size(); i++) {
			transitionMethod.addArgument("boolean p"+i);
		}

		// past time code:
		if(specification instanceof PltlSpecification) {
			PltlSpecification pltlSpecification = (PltlSpecification) specification;
			BooleanExpression node = pltlSpecification.getNode();
			if(node.isPastTimeFormula())
				new PtLtlCodeGenerator(((AspectJAspect)aspect).getConstructor(), transitionMethod).processNodes(node);
		}
		
		transitionMethod.addEnd("int trDone=0;\n");
		
		// write the current observer state information to the logfile here
		transitionMethod.addEnd(LogUtility.getInstance().getUpdateCode(specification));	
		
		transitionMethod.addEnd("switch(state) {\n");
		for(State state : automaton) {
			transitionMethod.addEnd("    case "+state.getNumber()+":\n");
			if(state.isAccepting()) {
				transitionMethod.addEnd("        break;\n");
				continue;
			}
			for(GuardedTransition transition : state) {
				BooleanExpression guard = transition.getGuard();
				if (guard instanceof Literal) {
					if (guard.getTruthValue()) {
						transitionMethod.addEnd("        state = "+transition.getTarget().getNumber()+"; trDone++;\n");
					} else {
						// Do not generate code for guards that are always false.
					}
				} else {
					new ValueAssigningVisitor(guard, propositionsValues);
					transitionMethod.addEnd("        if("+guard.getValue()+") ");
					transitionMethod.addEnd("{ state = "+transition.getTarget().getNumber()+"; trDone++; }\n");
				}
			}
			transitionMethod.addEnd("        break;\n");
		}
		transitionMethod.addEnd("}\n");
		transitionMethod.addEnd("if (trDone == 0)\n");
		transitionMethod.addEnd("    state = -1; // sink reject state\n");
		transitionMethod.addEnd("else if (trDone > 1)\n");
		transitionMethod.addEnd(
				"    throw new Error(\"Internal error - automaton is nondeterministic?\");\n");
	}
}
