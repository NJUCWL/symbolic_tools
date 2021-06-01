/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 15:03:26 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.INSTANCEOF;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class INSTANCEOF_ESTest extends INSTANCEOF_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF(0);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        iNSTANCEOF0.accept(executionVisitor0);
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
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF(41);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNSTANCEOF0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 41 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF(775);
      // Undeclared exception!
      try { 
        iNSTANCEOF0.getLoadClassType((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      instConstraintVisitor0.setConstantPoolGen(constantPoolGen0);
      // Undeclared exception!
      try { 
        iNSTANCEOF0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = null;
      try {
        iNSTANCEOF0 = new INSTANCEOF((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -1
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF(36);
      Class<?>[] classArray0 = iNSTANCEOF0.getExceptions();
      assertEquals(6, classArray0.length);
  }
}
