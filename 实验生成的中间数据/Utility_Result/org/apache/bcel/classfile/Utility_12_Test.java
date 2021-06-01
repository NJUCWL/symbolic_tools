/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 11:26:36 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.Utility;

public class Utility_12_Test {

  //Covered goal: org.apache.bcel.classfile.Utility.codeToString([BLorg/apache/bcel/classfile/ConstantPool;IIZ)Ljava/lang/String;: path condition EvoSuiteWrapper_12 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = null;
      ConstantPool constantPool0 = null;
      int int0 = (-342);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        Utility.codeToString(byteArray0, constantPool0, int0, int0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
