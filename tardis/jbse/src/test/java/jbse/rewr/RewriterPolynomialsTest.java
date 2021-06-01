package jbse.rewr;

import static org.junit.Assert.assertEquals;

import jbse.common.Type;
import jbse.common.exc.InvalidInputException;
import jbse.val.Expression;
import jbse.val.HistoryPoint;
import jbse.val.Operator;
import jbse.val.Primitive;
import jbse.val.Simplex;
import jbse.val.Term;
import jbse.val.exc.InvalidOperandException;
import jbse.val.exc.InvalidOperatorException;
import jbse.val.exc.InvalidTypeException;

import org.junit.Before;
import org.junit.Test;

public class RewriterPolynomialsTest {
	HistoryPoint hist;
	CalculatorRewriting calc;
	
	@Before
	public void before() {
		this.hist = HistoryPoint.unknown();
		this.calc = new CalculatorRewriting();
		this.calc.addRewriter(new RewriterOperationOnSimplex());
		this.calc.addRewriter(new RewriterPolynomials());
	}
	
	@Test
	public void testDivision1() throws InvalidOperandException, InvalidTypeException {
		//(A * B) / (B * C) -> A / C
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Term C = this.calc.valTerm(Type.INT, "C");
		final Primitive p_post = A.mul(B).div(B.mul(C));
		assertEquals(A.div(C), p_post);
	}
	
	@Test
	public void testDivision2() throws InvalidOperandException, InvalidTypeException {
		//(2 * A * A * B + 4 * A * B) / (A * B) -> 2 * A + 4
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = this.calc.valInt(2).mul(A).mul(A).mul(B).add(this.calc.valInt(4).mul(A).mul(B)).div(A.mul(B));
		assertEquals(this.calc.valInt(2).mul(A).add(this.calc.valInt(4)), p_post);
	}
	
	@Test
	public void testDivision3() throws InvalidOperandException, InvalidOperatorException, InvalidTypeException, InvalidInputException {
		//(A - B) / (C - D) preserves division
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Term C = this.calc.valTerm(Type.INT, "C");
		final Term D = this.calc.valTerm(Type.INT, "D");
		final Primitive p1 = A.sub(B);
		final Primitive p2 = C.sub(D);
		final Primitive p_actual = p1.div(p2);
		assertEquals(Expression.makeExpressionBinary(this.calc, p1, Operator.DIV, p2), p_actual);
	}
	
	@Test
	public void testDivision4() throws InvalidOperandException, InvalidTypeException {
		//(-2 * A * B) / (3 * B * C) -> (-2 * A) / (3 * C)
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Term C = this.calc.valTerm(Type.INT, "C");
		final Primitive p_post = this.calc.valInt(-2).mul(A).mul(B).div(this.calc.valInt(3).mul(B).mul(C));
		assertEquals(this.calc.valInt(-2).mul(A).div(this.calc.valInt(3).mul(C)), p_post);
	}
	
	@Test
	public void testDivision5() throws InvalidOperandException, InvalidTypeException {
		//A / (-2) -> - (A / 2)
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Simplex two = this.calc.valInt(2);
		final Simplex minusTwo = this.calc.valInt(-2);
		final Primitive p_post = A.div(minusTwo);
		assertEquals(A.div(two).neg(), p_post);
	}
	
	@Test
	public void testSum1() throws InvalidOperandException, InvalidTypeException {
		//(A + B) - A  -> B
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = A.add(B).sub(A);
		assertEquals(B, p_post);
	}
	
	@Test
	public void testSum2() throws InvalidOperandException, InvalidTypeException {
		//A / (A + B) + B / (A + B) -> 1
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = A.div(A.add(B)).add(B.div(A.add(B)));
		assertEquals(this.calc.valInt(1), p_post);
	}
	
	@Test
	public void testSum3() throws InvalidOperandException, InvalidTypeException {
		//A / (A + B) - B / (A + B) -> (A * A - B * B) / (A * A + 2 * A * B + B * B)
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = A.div(A.add(B)).sub(B.div(A.add(B)));
		assertEquals(A.mul(A).sub(B.mul(B)).div(A.mul(A).add(this.calc.valInt(2).mul(B).mul(A)).add(B.mul(B))), p_post);
	}
	
	@Test
	public void testMultiplication1() throws InvalidOperandException, InvalidTypeException {
		//-1 * (A / B) -> (-1 * A) / B
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = this.calc.valInt(-1).mul(A.div(B));
		assertEquals(this.calc.valInt(-1).mul(A).div(B), p_post);
	}
	
	@Test
	public void testMultiplication2() throws InvalidOperandException, InvalidTypeException {
		//(A + B) * (A + B) -> A * A + 2 * A * B + B * B
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = A.add(B).mul(A.add(B));
		assertEquals(A.mul(A).add(B.mul(B)).add(this.calc.valInt(2).mul(A).mul(B)), p_post);
	}
	
	@Test
	public void testMultiplication3() throws InvalidOperandException, InvalidTypeException, InvalidInputException {
		//(A + C) * D -> (A * D) + (C * D) with polynomial normalization
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Term C = this.calc.valTerm(Type.INT, "C");
		final Term D = this.calc.valTerm(Type.INT, "D");
		final Primitive p1 = this.calc.applyFunctionPrimitive(Type.INT, this.hist, "foo", A, B);
		final Primitive p_actual = p1.add(C).mul(D);
		assertEquals(p1.mul(D).add(C.mul(D)), p_actual); 
	}   
	
	@Test
	public void testMultiplication4() throws InvalidOperandException, InvalidTypeException {
		//-1 * (-1 * A) -> A
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Primitive p_post = this.calc.valInt(-1).mul(this.calc.valInt(-1).mul(A));
		assertEquals(A, p_post);
	}
	
	@Test
	public void testNegation1() throws InvalidOperandException, InvalidTypeException {
		//- (- A) -> A
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Primitive p_post = A.neg().neg();
		assertEquals(A, p_post);
	}
	
	@Test
	public void testNegation2() throws InvalidOperandException, InvalidTypeException {
		// A * (- B + C) -> -1 * A * B + A * C
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Term C = this.calc.valTerm(Type.INT, "C");
		final Primitive p_post = A.mul(B.neg().add(C));
		assertEquals(this.calc.valInt(-1).mul(A).mul(B).add(A.mul(C)), p_post);
	}
	
	@Test
	public void testNegation3() throws InvalidOperandException, InvalidTypeException {
		// - (- (A + B)) -> A + B
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = A.add(B).neg().neg();
		assertEquals(A.add(B), p_post);
	}
	
	@Test
	public void testConstant1() throws InvalidOperandException, InvalidTypeException {
		// -A / -B -> A / B
		final Term A = this.calc.valTerm(Type.INT, "A");
		final Term B = this.calc.valTerm(Type.INT, "B");
		final Primitive p_post = A.neg().div(B.neg());
		assertEquals(A.div(B), p_post);
	}
}
