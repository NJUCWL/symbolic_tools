package jbse.rules;

import static jbse.rules.Util.makePatternRelative;
import static jbse.rules.Util.findAny;
import static jbse.rules.Util.specializeAny;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jbse.bc.Signature;
import jbse.mem.Objekt;
import jbse.val.ReferenceSymbolic;

/**
 * An alias resolution rule mapping a pattern for
 * possible origins to a corresponding pattern of objects to which a
 * {@link ReferenceSymbolic} can be expanded.
 * 
 * @author Pietro Braione
 */
public class TriggerRuleAliasesOrigin extends TriggerRuleAliases {
	/** Should not be {@code null}. */
	private final String pathAllowedExp;
	
	/** When {@code true} only the maximal path matches. */
	private final boolean hasMax;
	
	public TriggerRuleAliasesOrigin(String originExp, String pathAllowedExp, Signature triggerMethod, String triggerParameter) {
		super(originExp, triggerMethod, triggerParameter);
		if (pathAllowedExp != null && pathAllowedExp.startsWith(Util.MAX)) {
			this.pathAllowedExp = pathAllowedExp.substring(Util.MAX.length());
			this.hasMax = true;
		} else {
			this.pathAllowedExp = pathAllowedExp;
			this.hasMax = false;
		}
	}

	@Override
	public boolean satisfies(ReferenceSymbolic ref, Objekt o) {
		//builds the pattern
		final String valueForAny = findAny(this.originExp, ref);
		final String specializedPathAllowedExp = specializeAny(this.pathAllowedExp, valueForAny);
		final Pattern p = makePatternRelative(specializedPathAllowedExp, ref);
		//checks if the origin of o matches the pattern
		final Matcher m = p.matcher(o.getOrigin().asOriginString());
		final boolean retVal = m.matches();
		
		return retVal;
	}
	
	@Override
	public boolean requiresMax() {
		return this.hasMax;
	}
	
	@Override
	public String toString() {
		return this.originExp + " ALIASES " + (this.hasMax ? Util.MAX : "") + this.pathAllowedExp + " TRIGGERS " + 
				this.getTriggerSignature() + "(" + this.getTriggerMethodParameter() + ")";
	}
}