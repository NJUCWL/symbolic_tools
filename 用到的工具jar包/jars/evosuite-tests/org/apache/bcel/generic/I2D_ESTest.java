/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:51:18 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.I2D;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class I2D_ESTest extends I2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      I2D i2D0 = new I2D();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LocalVariables localVariables0 = new LocalVariables(1322);
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(1322, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      executionVisitor0.setFrame(frame0);
      i2D0.accept(executionVisitor0);
      assertEquals((short)135, i2D0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      I2D i2D0 = new I2D();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      i2D0.setOpcode((short)1296);
      // Undeclared exception!
      try { 
        i2D0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1296
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      I2D i2D0 = new I2D();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        i2D0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
