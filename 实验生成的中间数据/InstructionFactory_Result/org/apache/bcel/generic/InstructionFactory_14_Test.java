/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:21:19 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.Type;

public class InstructionFactory_14_Test {

  //Covered goal: org.apache.bcel.generic.InstructionFactory.createStore(Lorg/apache/bcel/generic/Type;I)Lorg/apache/bcel/generic/LocalVariableInstruction;: path condition EvoSuiteWrapper_14 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Type type0 = null;
      int int0 = 198;
      // Undeclared exception!
      try { 
        InstructionFactory.createStore(type0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
