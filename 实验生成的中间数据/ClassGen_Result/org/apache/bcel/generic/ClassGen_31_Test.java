/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:29:58 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ClassGen;

public class ClassGen_31_Test {

  //Covered goal: org.apache.bcel.generic.ClassGen.getMethodAt(I)Lorg/apache/bcel/classfile/Method;: path condition EvoSuiteWrapper_31 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "org.apache.bcel.generic.ClassGen$1";
      int int0 = 3627;
      String[] stringArray0 = new String[5];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      // Undeclared exception!
      try { 
        classGen0.getMethodAt(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3627, Size: 0
         //
      }
  }
}
