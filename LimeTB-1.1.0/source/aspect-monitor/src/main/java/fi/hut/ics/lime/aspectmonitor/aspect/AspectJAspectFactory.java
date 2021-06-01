package fi.hut.ics.lime.aspectmonitor.aspect;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

import dk.brics.automaton.Automaton;
import fi.hut.ics.lime.aspectmonitor.aspect.components.JavaConstructor;
import fi.hut.ics.lime.aspectmonitor.aspect.components.JavaPerClause;
import fi.hut.ics.lime.aspectmonitor.aspect.components.JavaPerType;
import fi.hut.ics.lime.aspectmonitor.aspect.generator.CodeGenerator;
import fi.hut.ics.lime.aspectmonitor.sourcecode.JavaSource;
import fi.hut.ics.lime.common.annotation.SpecType;
import fi.hut.ics.lime.common.aspect.Aspect;
import fi.hut.ics.lime.common.aspect.AspectException;
import fi.hut.ics.lime.common.aspect.components.Pointcut;
import fi.hut.ics.lime.common.automaton.BricsAutomatonAdapter;
import fi.hut.ics.lime.common.automaton.guardedTransitionAutomaton.GuardedTransitionAutomaton;
import fi.hut.ics.lime.common.logic.ast.node.PropositionNode;
import fi.hut.ics.lime.common.sourcecode.Method;
import fi.hut.ics.lime.common.sourcecode.Source;
import fi.hut.ics.lime.common.specification.BricsAutomatonSpecification;
import fi.hut.ics.lime.common.specification.PltlSpecification;
import fi.hut.ics.lime.common.specification.Specification;
import fi.hut.ics.lime.common.specification.propositions.PropositionFactory;



/**
 * The singleton factory for creating aspects from specifications.
 * @author jalampin
 *
 */
public class AspectJAspectFactory {
	
	protected static final PropositionFactory propositionFactory = PropositionFactory.instance();
	protected Map<Specification, Aspect> aspects = new Hashtable<Specification, Aspect>();;
	protected static final AspectJAspectFactory instance = new AspectJAspectFactory();
	
	/**
	 * Global access point for the aspect factory instance.
	 * @return the aspect factory instance.
	 */
	public static AspectJAspectFactory instance() {
		return instance;
	}
	
	/**
	 * Getter for the created aspects.
	 * @return mapping from specifications to their corresponding
	 * generated aspects.
	 */
	public Map<Specification, Aspect> getAspects() {
		return aspects;
	}
	
	/**
	 * Getter for all generated aspects.
	 * @return the aspects generated.
	 */
	public Collection<Aspect> getAllAspects() {
		return aspects.values();
	}
	
	/**
	 * Create an aspect from a PLTL specification.
	 * @param specification The specification from which the aspect is created.
	 * @throws AspectException If aspect construction is unsuccessful.
	 */
	public void createAspect(PltlSpecification specification, CodeGenerator generator) 
	throws AspectException {		
		Aspect aspect = makeAspect(specification);	
		aspects.put(specification, aspect);
		initVariables(specification);
		generator.addToAspect(aspect);
	}
	
	/**
	 * Create an aspect from a regular expression specification.
	 * @param specification The specification from which the aspect is created.
	 * @throws AspectException If aspect construction is unsuccessful.
	 */
	public void createAspect(BricsAutomatonSpecification specification, CodeGenerator generator) throws AspectException {		
		Aspect aspect = makeAspect(specification);
		aspects.put(specification, aspect);
		initVariables(specification);
		generator.addToAspect(aspect);
	}
	
	/**
	 * Create an aspect from the given specification.
	 * This only dispatches the call to the PLTL or BricsAutomaton (regexp or always_nfa)
	 * specific createAspect() calls, or throws an exception if <code>specification</code>
	 * is not an instance of either.   
	 * @param specification the specification to create an aspect for
	 * @throws AspectException on error
	 */
	public void createAspect(Specification specification, CodeGenerator generator) throws AspectException {
		if (specification instanceof PltlSpecification)
			createAspect((PltlSpecification)specification, generator);
		else if (specification instanceof BricsAutomatonSpecification)
			createAspect((BricsAutomatonSpecification)specification, generator);
		else
			throw new AssertionError("createAspect(abstract)");
	}
	
	/**
	 * Creates a call pointcut from a compile time representation
	 * of a method.
	 * @param method representation of a method.
	 * @return call pointcut that corresponds to a call to the
	 * given method.
	 */
	public Pointcut methodToPointcut(Method method) {
		Source sourceType = method.getDeclaringType();
		Pointcut pointcut = new Pointcut();
		String pString = "execution(";
		
		if (method.getVisibility() != null) {
			pString += method.getVisibility().toString() + " ";
		}
		 
		pString += method.getReturnType() +" ";	// getActualClass().getName()
		pString += sourceType.getQualifiedName()+"+.";
		pString += method.getSimpleName()+"(..))";
		pointcut.setPointcutString(pString);
		return pointcut;
	}
	
	/**
	 * Initializes the constructor of the aspect corresponding to the PLTL specification.
	 * If the PLTL formula contains past subformulas boolean arrays are allocated to
	 * accommodate them. The initial state of the DFA is initialized in the 
	 * constructor.
	 * @param specification PLTL specification
	 */
	private void initVariables(PltlSpecification specification) {
		Aspect aspect = aspects.get(specification);
		JavaConstructor constructor = new JavaConstructor();
		GuardedTransitionAutomaton automaton = specification.getAutomaton();
		int numberOfPtFormulas = specification.getNumberOfPastTimeOperators();
		constructor.setName(aspect.getName());
		
		if(numberOfPtFormulas > 0) {
			aspect.addVariable((boolean[].class).getCanonicalName(), specification.getNow());
			aspect.addVariable((boolean[].class).getCanonicalName(), specification.getPre());
			constructor.addCode(specification.getPre()+" = new boolean["+numberOfPtFormulas+"];\n");
			constructor.addCode(specification.getNow()+" = new boolean["+numberOfPtFormulas+"];\n");
		}
		
		if(automaton != null) {
			aspect.addVariable((int.class).getCanonicalName(), "state");
			constructor.addCode("state = "+automaton.getInitialState().getNumber()+";\n");
		}
		
		((AspectJAspect)aspect).setConstructor(constructor);
	}
	
	/**
	 * Assigns initial state of the specification automaton in
	 * the aspect constructor. 
	 * @param specification regular expression specification 
	 * to which the aspect corresponds to.
	 */
	private void initVariables(BricsAutomatonSpecification specification) {
		Aspect aspect = aspects.get(specification);
		JavaConstructor constructor = new JavaConstructor();
		BricsAutomatonAdapter adapter = specification.getAdapter();
		Automaton automaton = adapter.getComplementAutomaton();
		constructor.setName(aspect.getName());
	
		if(automaton != null) {
			aspect.addVariable((int.class).getCanonicalName(), "state");
			constructor.addCode("state = "+adapter.getStateMap().get(automaton.getInitialState())+";\n");
		}
		
		((AspectJAspect)aspect).setConstructor(constructor);
	}
	
	/**
	 * 
	 * @param specification
	 * @return
	 * @throws AspectException
	 */
	protected AspectJAspect makeAspect(Specification specification) 
	throws AspectException {
		String aspectName;
		AspectJAspect aspect;
		String comment = "Generated from property: \n";
		
		aspectName = specification.getSpecType() == SpecType.RETURN ? "RETURN" : "CALL";
		aspectName+= "Specification"+specification.getSourceType().getSimpleName()+specification.getName();
		aspect = new AspectJAspect(aspectName);
		comment += specification.getName()+" ::= "+specification.getDeclared()+"\n";
		comment += "Which is in parsed form "+specification.getParsed()+"\n";
		comment += "And internally represented as "+specification.getInternal()+"\n";
		
		Map<String, PropositionNode> namedPropositions = propositionFactory.getPropositionNodesByType(specification.getSourceType());
		
		if(namedPropositions != null && namedPropositions.size() > 0) {
			comment += "Named propositions and their values: \n";		
			for(String name : namedPropositions.keySet()) {
				PropositionNode node = namedPropositions.get(name);
				comment += "[NAMED]: "+name+" ::= ["+node.getPropositionKind().name()+"]: "+node.getProposition()+"\n";
			}
		}
		
		aspect.setComment(comment);
		initAspect(specification, aspect);
		return aspect;
	}
	
	/*
	 * Basic initialization method for all aspects:
	 *   - They are instantiated in pertarget of their enforced
	 *     methods.
	 *   - They declare precedence with CALLSpecifications dominating
	 *     the RETURNSpecifications.
	 *   - They are privileged.
	 *   - They belong into the same package as their corresponding
	 *     annotated type.
	 */
	private void initAspect(Specification specification, AspectJAspect aspect) throws AspectException {
		JavaPerClause perClause;
		Pointcut pointcut = null, pointcut2;
		perClause = new JavaPerClause();
		perClause.setPerType(JavaPerType.PERTARGET);
		aspect.setPerClause(perClause);
		
		aspect.setPrecedence("CALLSpecification*, RETURNSpecification*");
		aspects.put(specification, aspect);
		aspect.setPrivileged(true);
		aspect.setCtPackage(((JavaSource)specification.getSourceType()).getPackage());
		
		for (Method method : specification.getEnforcedMethods()) {
			pointcut2 = methodToPointcut(method);
			if(pointcut == null)
				pointcut =  pointcut2;
			else
				pointcut = pointcut.or(pointcut2);
		}
		
		aspect.getPerClause().setPointcut(pointcut);
	}
}
