/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 11:26:23 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.classfile.Utility;

public class Utility_4_Test {

  //Covered goal: org.apache.bcel.classfile.Utility.methodTypeToSignature(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;: path condition EvoSuiteWrapper_4 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "zx8LF<p";
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        Utility.methodTypeToSignature(string0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
