/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 17:33:08 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICONST_ESTest extends ICONST_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ICONST iCONST0 = new ICONST();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      Frame frame0 = new Frame(1131, 2464);
      executionVisitor0.setFrame(frame0);
      iCONST0.accept(executionVisitor0);
      assertEquals((short) (-1), iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ICONST iCONST0 = new ICONST();
      Number number0 = iCONST0.getValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ICONST iCONST0 = new ICONST((-1));
      Number number0 = iCONST0.getValue();
      assertEquals((-1), number0);
      assertEquals((short)2, iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ICONST iCONST0 = new ICONST();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      Frame frame0 = new Frame(499, (-165));
      executionVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        iCONST0.accept(executionVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: OperandStack too small, should have thrown proper Exception elsewhere. Stack: Slots used: 0 MaxStack: -165.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ICONST iCONST0 = new ICONST();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        iCONST0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ICONST iCONST0 = null;
      try {
        iCONST0 = new ICONST(167);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ICONST can be used only for value between -1 and 5: 167
         //
         verifyException("org.apache.bcel.generic.ICONST", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ICONST iCONST0 = null;
      try {
        iCONST0 = new ICONST((-996));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ICONST can be used only for value between -1 and 5: -996
         //
         verifyException("org.apache.bcel.generic.ICONST", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ICONST iCONST0 = new ICONST(1);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      iCONST0.getType(constantPoolGen0);
      assertEquals((short)4, iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ICONST iCONST0 = new ICONST(1);
      Number number0 = iCONST0.getValue();
      assertEquals(1, number0);
      assertEquals((short)4, iCONST0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ICONST iCONST0 = new ICONST();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        iCONST0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
