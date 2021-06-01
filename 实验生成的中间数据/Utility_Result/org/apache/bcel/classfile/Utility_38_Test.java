/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 11:29:30 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.classfile.Utility;

public class Utility_38_Test {

  //Covered goal: org.apache.bcel.classfile.Utility.methodSignatureArgumentTypes(Ljava/lang/String;)[Ljava/lang/String;: path condition EvoSuiteWrapper_38 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "short";
      try { 
        Utility.methodSignatureArgumentTypes(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: short
         //
      }
  }
}
