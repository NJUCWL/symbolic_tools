/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 11:26:37 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.classfile.Utility;

public class Utility_16_Test {

  //Covered goal: org.apache.bcel.classfile.Utility.signatureToString(Ljava/lang/String;)Ljava/lang/String;: path condition EvoSuiteWrapper_16 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "class";
      // Undeclared exception!
      try { 
        Utility.signatureToString(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: `class'
         //
      }
  }
}
