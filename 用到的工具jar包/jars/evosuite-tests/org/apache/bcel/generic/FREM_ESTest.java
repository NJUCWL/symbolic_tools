/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 17:28:22 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.FREM;
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
public class FREM_ESTest extends FREM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FREM fREM0 = new FREM();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      LocalVariables localVariables0 = new LocalVariables(0);
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(1, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        fREM0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FREM constraint violated: Cannot consume 2 stack slots: only 1 slot(s) left on stack!
         // Stack:
         // Slots used: 1 MaxStack: 1.
         // java.lang.String (Size: 1)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FREM fREM0 = new FREM();
      fREM0.setOpcode((short)1535);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        fREM0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1535
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FREM fREM0 = new FREM();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        fREM0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
