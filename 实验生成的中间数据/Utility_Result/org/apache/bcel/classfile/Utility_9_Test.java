/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 11:26:31 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintWriter;
import org.apache.bcel.classfile.Utility;

public class Utility_9_Test {

  //Covered goal: org.apache.bcel.classfile.Utility.printArray([Ljava/lang/Object;Z)Ljava/lang/String;: path condition EvoSuiteWrapper_9 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrintWriter printWriter0 = null;
      Object[] objectArray0 = null;
      // Undeclared exception!
      try { 
        Utility.printArray(printWriter0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
