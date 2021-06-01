/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 29 07:09:02 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static shaded.org.evosuite.shaded.org.mockito.Mockito.*;
import static shaded.org.evosuite.runtime.MockitoExtension.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.MethodGen;
import shaded.org.evosuite.runtime.ViolatedAssumptionAnswer;

public class ConstantPoolGen_34_Test {

  //Covered goal: org.apache.bcel.generic.ConstantPoolGen.lookupInterfaceMethodref(Lorg/apache/bcel/generic/MethodGen;)I: path condition EvoSuiteWrapper_34 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = mock(MethodGen.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(methodGen0).getName();
      doReturn((String) null).when(methodGen0).getClassName();
      doReturn((String) null).when(methodGen0).getSignature();
      constantPoolGen0.lookupInterfaceMethodref(methodGen0);
  }
}
