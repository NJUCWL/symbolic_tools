/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 17:21:11 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.SWAP;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.verifier.structurals.LocalVariables;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SWAP_ESTest extends SWAP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SWAP sWAP0 = new SWAP();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(0, 0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        sWAP0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction SWAP constraint violated: Cannot consume 2 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SWAP sWAP0 = new SWAP();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LocalVariables localVariables0 = new LocalVariables(0);
      OperandStack operandStack0 = new OperandStack(0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      executionVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        sWAP0.accept(executionVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SWAP sWAP0 = new SWAP();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        sWAP0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
