/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 29 07:10:31 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ConstantPoolGen;

public class ConstantPoolGen_23_Test {

  //Covered goal: org.apache.bcel.generic.ConstantPoolGen.lookupUtf8(Ljava/lang/String;)I: path condition EvoSuiteWrapper_23 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = null;
      String string1 = "hBt/8/|N!+S|X<";
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref(string1, string1, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes must not be null!
         //
      }
  }
}
