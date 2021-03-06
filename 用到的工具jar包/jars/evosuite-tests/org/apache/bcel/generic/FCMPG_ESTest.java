/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 16:33:43 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FCMPG;
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
public class FCMPG_ESTest extends FCMPG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FCMPG fCMPG0 = new FCMPG();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        fCMPG0.accept(executionVisitor0);
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
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCMPG fCMPG0 = new FCMPG();
      LocalVariables localVariables0 = new LocalVariables(458);
      ObjectType objectType0 = Type.THROWABLE;
      OperandStack operandStack0 = new OperandStack(214, objectType0);
      Frame frame0 = new Frame(localVariables0, operandStack0);
      instConstraintVisitor0.setFrame(frame0);
      // Undeclared exception!
      try { 
        fCMPG0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction FCMPG constraint violated: Cannot consume 2 stack slots: only 1 slot(s) left on stack!
         // Stack:
         // Slots used: 1 MaxStack: 214.
         // java.lang.Throwable (Size: 1)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      FCMPG fCMPG0 = new FCMPG();
      fCMPG0.setOpcode((short)1928);
      // Undeclared exception!
      try { 
        fCMPG0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1928
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FCMPG fCMPG0 = new FCMPG();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = fCMPG0.getType(constantPoolGen0);
      assertEquals("F", type0.getSignature());
  }
}
