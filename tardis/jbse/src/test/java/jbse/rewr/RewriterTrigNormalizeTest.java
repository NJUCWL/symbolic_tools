package jbse.rewr;

import static org.junit.Assert.assertEquals;

import jbse.common.Type;
import jbse.common.exc.InvalidInputException;
import jbse.val.PrimitiveSymbolicApply;
import jbse.val.HistoryPoint;
import jbse.val.Primitive;
import jbse.val.Term;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidTypeException;

import org.junit.Before;
import org.junit.Test;

public class RewriterTrigNormalizeTest {
	HistoryPoint hist;
	CalculatorRewriting calc;
	
	@Before
	public void before() {
		this.hist = HistoryPoint.unknown();
		this.calc = new CalculatorRewriting();
		this.calc.addRewriter(new RewriterOperationOnSimplex());
		this.calc.addRewriter(new RewriterPolynomials());
		this.calc.addRewriter(new RewriterTrigNormalize());
	}
	
	@Test
	public void testSimple1() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//tan(A + PI) -> tan(A)
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A.add(this.calc.valDouble(Math.PI))); 
		assertEquals(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A), p_post);
	}
	
	@Test
	public void testSimple2() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//2 / tan(A + PI) -> 2 / tan(A)
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.valDouble(2.0d).div(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A.add(this.calc.valDouble(Math.PI)))); 
		assertEquals(this.calc.valDouble(2.0d).div(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A)), p_post);
	}
	
	@Test
	public void testSimple3() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//cos(A * A + 7) -> cos(A * A + (7 - 2 * PI))
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, A.mul(A).add(this.calc.valDouble(7.0d))); 
		assertEquals(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, A.mul(A).add(this.calc.valDouble(7 - 2 * Math.PI))), p_post);
	}
	
	@Test
	public void testSimple4() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//sin(A + PI) -> -sin(A)
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.SIN, A.add(this.calc.valDouble(Math.PI))); 
		assertEquals(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.SIN, A).neg(), p_post);
	}
	
	@Test
	public void testNested1() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//sin(4 + tan(A * A + 4)) -> sin(4 + tan(A * A + (4 - PI)))
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.SIN, this.calc.valDouble(4.0d).add(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A.mul(A).add(this.calc.valDouble(4.0d))))); 
		assertEquals(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.SIN, this.calc.valDouble(4.0d).add(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A.mul(A).add(this.calc.valDouble(4 - Math.PI))))), p_post);
	}

	@Test
	public void testNested2() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//cos(9 + tan(A * A - 1)) -> cos((9 - 2 * PI) + tan(A * A + (PI - 1)))
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, this.calc.valDouble(9.0d).add(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A.mul(A).sub(this.calc.valDouble(1.0d))))); 
		assertEquals(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, this.calc.valDouble(9 - 2 * Math.PI).add(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.TAN, A.mul(A).add(this.calc.valDouble(Math.PI - 1))))), p_post);
	}

	@Test
	public void testNested3() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//cos(4 + sin(A * A + 5)) -> -cos((4 - PI) - sin(A * A + (5 - PI)))
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, this.calc.valDouble(4.0d).add(this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.SIN, A.mul(A).add(this.calc.valDouble(5.0d)))));
		final Primitive expected = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, 
				this.calc.valDouble(4 - Math.PI).sub(
						this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.SIN, A.mul(A).add(this.calc.valDouble(5 - Math.PI))))).neg(); 
		assertEquals(expected, p_post);
	}

	@Test
	public void testDoNothing() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//cos(A) -> cos(A)
		final Term A = this.calc.valTerm(Type.DOUBLE, "A");
		final Primitive p_post = this.calc.applyFunctionPrimitive(Type.DOUBLE, this.hist, PrimitiveSymbolicApply.COS, A); 
		assertEquals(new PrimitiveSymbolicApply(Type.DOUBLE, this.hist, this.calc, PrimitiveSymbolicApply.COS, A), p_post);
	}
}
