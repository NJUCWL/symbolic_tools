/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 17:57:30 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IMPDEP2_ESTest extends IMPDEP2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IMPDEP2 iMPDEP2_0 = new IMPDEP2();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      iMPDEP2_0.accept(executionVisitor0);
      assertEquals((short)255, iMPDEP2_0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IMPDEP2 iMPDEP2_0 = new IMPDEP2();
      // Undeclared exception!
      try { 
        iMPDEP2_0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.IMPDEP2", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IMPDEP2 iMPDEP2_0 = new IMPDEP2();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        iMPDEP2_0.accept(instConstraintVisitor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: In this JustIce verification pass there should not occur an illegal instruction such as IMPDEP2.
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }
}
