/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:34:54 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.D2F;
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
public class D2F_ESTest extends D2F_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      D2F d2F0 = new D2F();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      LocalVariables localVariables0 = new LocalVariables(0);
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(1649, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      executionVisitor0.setFrame(frame0);
      d2F0.accept(executionVisitor0);
      assertEquals(1, d2F0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      D2F d2F0 = new D2F();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Frame frame0 = new Frame(871, 0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        d2F0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction D2F constraint violated: Cannot consume 2 stack slots: only 0 slot(s) left on stack!
         // Stack:
         // Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      D2F d2F0 = new D2F();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      d2F0.setOpcode((short) (-3636));
      // Undeclared exception!
      try { 
        d2F0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3636
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      D2F d2F0 = new D2F();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        d2F0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
