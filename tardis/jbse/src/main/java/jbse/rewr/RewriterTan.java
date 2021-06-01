package jbse.rewr;

import jbse.common.exc.InvalidInputException;
import jbse.common.exc.UnexpectedInternalException;
import jbse.rewr.exc.NoResultException;
import jbse.val.Expression;
import jbse.val.PrimitiveSymbolicApply;
import jbse.val.Operator;
import jbse.val.Primitive;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidTypeException;

/**
 * A {@link Rewriter} which rewrites {@code sin(X) / cos(X)} to {@code tan(X)}.
 * Does not work with, e.g., {@code (sin(X) * A) / cos(X)}.
 * 
 * @author Pietro Braione
 *
 */
public class RewriterTan extends Rewriter {

	public RewriterTan() { }
	
	@Override
	protected void rewriteExpression(Expression x) 
	throws NoResultException {
		final Operator operator = x.getOperator();
		if (operator == Operator.DIV) {
			final Primitive first = x.getFirstOperand();
			final Primitive second = x.getSecondOperand();
			if (first instanceof PrimitiveSymbolicApply && second instanceof PrimitiveSymbolicApply) {
				final PrimitiveSymbolicApply firstFA = (PrimitiveSymbolicApply) first;
				final PrimitiveSymbolicApply secondFA = (PrimitiveSymbolicApply) second;
				if (firstFA.getOperator().equals(PrimitiveSymbolicApply.SIN) &&
					secondFA.getOperator().equals(PrimitiveSymbolicApply.COS) &&
					firstFA.getArgs()[0].equals(secondFA.getArgs()[0])) {
					try {
						setResult(this.calc.applyFunctionPrimitive(x.getType(), firstFA.historyPoint(), PrimitiveSymbolicApply.TAN, firstFA.getArgs()[0]));
					} catch (InvalidOperandException | InvalidTypeException | InvalidInputException e) {
						//this should never happen
						throw new UnexpectedInternalException(e);
					}
					return;
				}
			}
		}
		super.rewriteExpression(x);
	}
}
