package jbse.apps;

import static jbse.apps.Util.formatPrimitive;
import static jbse.mem.Frame.UNKNOWN_PC;
import static jbse.mem.Frame.UNKNOWN_SOURCE_ROW;

import jbse.common.exc.UnexpectedInternalException;
import jbse.mem.SnippetFrameNoWrap;
import jbse.mem.State;
import jbse.mem.exc.FrozenStateException;
import jbse.mem.exc.ThreadStackEmptyException;
import jbse.val.Primitive;
import jbse.val.Reference;
import jbse.val.Value;

/**
 * A {@link Formatter} which yields a one-line text rendition of 
 * the current {@link State}, including only the current identification
 * of the state in its trace, the current method and the current 
 * statement/bytecode. Useful to print execution traces.
 * 
 * @author Pietro Braione
 *
 */
public final class StateFormatterTrace implements Formatter {
    /** 
     * The {@link String} used by {@link StateFormatterTrace#formatState(State)} to
     * indicate a stuck {@link State}. 
     */
    private static final String LEAF = "LEAF";

    /** The {@link String} used by {@link StateFormatterTrace#formatState(State)} to separates fields. */
    private static final String FIELD_SEP = " ";

    /** Here the result of {@link StateFormatterTrace#formatState(State)}. */
    private String output;

    private BytecodeFormatter bcf = new BytecodeFormatter();

    public void formatState(State s) {
        this.output = s.getIdentifier() + "[" + s.getSequenceNumber() + "]" + FIELD_SEP + 
                      s.getDepth() + "," + s.getCount() + FIELD_SEP;
        try {
        	if (s.isStuck()) {
        		this.output += LEAF + FIELD_SEP;
        		if (s.getStuckException() != null) {
        			this.output += "exception" + FIELD_SEP + formatReturn(s, s.getStuckException());
        		} else if (s.getStuckReturn() != null) {
        			this.output += "return" + FIELD_SEP + formatReturn(s, s.getStuckReturn());
        		}
        	} else if (s.getStackSize() == 0) {
        		//we are at the initial state
        		this.output += "(no stack)";
        	} else {
        		try {
        			final boolean snippet = (s.getCurrentFrame() instanceof SnippetFrameNoWrap);
        			this.output += (snippet ? "(snippet)" : s.getCurrentMethodSignature()) + FIELD_SEP + 
        					(s.getSourceRow() == UNKNOWN_SOURCE_ROW ? "*" : s.getSourceRow()) + FIELD_SEP +
        					(s.getPC() == UNKNOWN_PC ? "*" : s.getPC()) + FIELD_SEP +
        					this.bcf.format(s);
        		} catch (ThreadStackEmptyException e) {
        			//this should never happen
        			throw new UnexpectedInternalException(e);
        		}
        	}
            this.output += "\n";
        } catch (FrozenStateException e) {
        	this.output = "";
        	return;
        }
    }

    private String formatReturn(State s, Value v) throws FrozenStateException {
        if (v instanceof Primitive) {
            return formatPrimitive((Primitive) v);
        } else if (v instanceof Reference) {
            if (s.isNull((Reference) v)) {
                return "null";
            } else {
                return s.getObject((Reference) v).getType().getClassName();
            }
        } else {
            throw new UnexpectedInternalException("Unexpected value " + v + " returned.");
        }
    }

    @Override
    public final String emit() {
        return this.output;
    }

    @Override
    public final void cleanup() {
        this.output = "";
    }
}
