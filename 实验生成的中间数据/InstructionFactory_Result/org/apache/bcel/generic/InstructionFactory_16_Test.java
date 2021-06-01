/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:23:45 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;

public class InstructionFactory_16_Test {

  //Covered goal: org.apache.bcel.generic.InstructionFactory.createNew(Ljava/lang/String;)Lorg/apache/bcel/generic/NEW;: path condition EvoSuiteWrapper_16 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      String string0 = "wx!";
      // Undeclared exception!
      try { 
        instructionFactory0.createNew(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
