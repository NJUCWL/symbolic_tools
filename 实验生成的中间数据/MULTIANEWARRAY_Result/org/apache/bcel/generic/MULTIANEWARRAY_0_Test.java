/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:08:46 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;

public class MULTIANEWARRAY_0_Test {

  //Covered goal: org.apache.bcel.generic.MULTIANEWARRAY.accept(Lorg/apache/bcel/generic/Visitor;)V: path condition EvoSuiteWrapper_0 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 74;
      short short0 = (short)76;
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(int0, short0);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
