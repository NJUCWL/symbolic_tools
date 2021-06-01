/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 29 07:10:16 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static shaded.org.evosuite.shaded.org.mockito.Mockito.*;
import static shaded.org.evosuite.runtime.MockitoExtension.*;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.ConstantPoolGen;
import shaded.org.evosuite.runtime.ViolatedAssumptionAnswer;

public class ConstantPoolGen_10_Test {

  //Covered goal: org.apache.bcel.generic.ConstantPoolGen.addArrayClass(Lorg/apache/bcel/generic/ArrayType;)I: path condition EvoSuiteWrapper_10 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ArrayType arrayType0 = mock(ArrayType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(arrayType0).getSignature();
      // Undeclared exception!
      try { 
        constantPoolGen0.addArrayClass(arrayType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
