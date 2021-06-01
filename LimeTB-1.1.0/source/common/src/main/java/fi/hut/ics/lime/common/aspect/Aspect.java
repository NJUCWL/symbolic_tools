package fi.hut.ics.lime.common.aspect;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fi.hut.ics.lime.common.aspect.components.Advice;
import fi.hut.ics.lime.common.aspect.components.AspectMethod;

/**
 * A compound that contains aspect code for an aspect and the
 * internal representation for the aspect. 
 * @author jalampin
 */
public class Aspect {
	protected final String name;
	protected Set<Advice> advices;
	/* Variables associated with this aspect represented as a map;
	 * the name of the variable is contained in the key, while the type
	 * of the variable is in the value */
	protected Map<String, String> variables;
	protected String comment = null;
	protected List<AspectMethod> methods;
	
	/**
	 * Construct a new aspect.
	 * @param name the name of the new aspect
	 * @author jalampin
	 */
	public Aspect(String name) {
		this.name = name;
		advices = new HashSet<Advice>();
		variables = new Hashtable<String, String>();
		methods = new LinkedList<AspectMethod>();
	}

	/**
	 * Add new advice to the aspect.
	 * @param advice the advice to add
	 * @author jalampin
	 */
	public void addAdvice(Advice advice) {
		advices.add(advice);
	}
	
	/**
	 * @return the set of advice in this aspect
	 * @author jalampin
	 */
	public Set<Advice> getAdvices() {
		return advices;
	}
	
	/**
	 * @return a map containing the variables in this aspect, with
	 * 		   variable names as keys and variable types (expressed
	 * 		   as Strings) as values 
	 * @author jalampin
	 */
	public Map<String, String> getVariables() {
		return variables;
	}

	/**
	 * Add a new variable to this aspect.
	 * @param type the type of the new variable, expressed as a String 
	 * 		  (e.g "int", class names as qualified names: "java.util.Set")
	 * @param name the name of the new variable
	 * @author jalampin
	 */
	public void addVariable(String type, String name) {
		variables.put(name, type);
	}
	
	/**
	 * @return the name of this aspect
	 * @author jalampin
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the comment associated with this aspect.
	 * @return a string containing the comment
	 * @author jalampin
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Set the comment associated with this aspect.
	 * @param comment a string containing the comment
	 * @author jalampin
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * Add a method to this aspect.
	 * @param method the new method
	 * @author jalampin
	 */
	public void addMethod(AspectMethod method) {
		methods.add(method);
	}
	
	/**
	 * Remove a method from this aspect.
	 * @param method the method to remove.
	 * @author jalampin
	 */
	public void removeMethod(AspectMethod method) {
		methods.remove(method);
	}

}
