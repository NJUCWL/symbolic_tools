/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 16:25:43 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.MONITOREXIT;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.Frame;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MONITOREXIT_ESTest extends MONITOREXIT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MONITOREXIT mONITOREXIT0 = new MONITOREXIT();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        mONITOREXIT0.accept(executionVisitor0);
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
      MONITOREXIT mONITOREXIT0 = new MONITOREXIT();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(1, (byte)0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        mONITOREXIT0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction MONITOREXIT constraint violated: Cannot consume 1 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MONITOREXIT mONITOREXIT0 = new MONITOREXIT();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      mONITOREXIT0.setOpcode((short) (-3089));
      // Undeclared exception!
      try { 
        mONITOREXIT0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3089
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MONITOREXIT mONITOREXIT0 = new MONITOREXIT();
      Class<?>[] classArray0 = mONITOREXIT0.getExceptions();
      assertEquals(1, classArray0.length);
  }
}
