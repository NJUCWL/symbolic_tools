/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:28:46 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.DUP2_X2;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DUP2_X2_ESTest extends DUP2_X2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DUP2_X2 dUP2_X2_0 = new DUP2_X2();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        dUP2_X2_0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DUP2_X2 dUP2_X2_0 = new DUP2_X2();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables((byte)0);
      OperandStack operandStack0 = new OperandStack((byte)0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        dUP2_X2_0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction DUP2_X2 constraint violated: Cannot consume 4 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DUP2_X2 dUP2_X2_0 = new DUP2_X2();
      dUP2_X2_0.setOpcode((short)3626);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        dUP2_X2_0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3626
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
