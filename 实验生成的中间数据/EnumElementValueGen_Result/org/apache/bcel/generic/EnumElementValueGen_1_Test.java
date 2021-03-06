/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 08:59:05 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.EnumElementValueGen;

public class EnumElementValueGen_1_Test {

  //Covered goal: org.apache.bcel.generic.EnumElementValueGen.getEnumTypeString()Ljava/lang/String;: path condition EvoSuiteWrapper_1 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 3464;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      // Undeclared exception!
      try { 
        enumElementValueGen0.getElementValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3464
         //
      }
  }
}
