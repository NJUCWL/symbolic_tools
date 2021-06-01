/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:21:30 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.Type;

public class InstructionFactory_6_Test {

  //Covered goal: org.apache.bcel.generic.InstructionFactory.createInvoke(Ljava/lang/String;Ljava/lang/String;Lorg/apache/bcel/generic/Type;[Lorg/apache/bcel/generic/Type;S)Lorg/apache/bcel/generic/InvokeInstruction;: path condition EvoSuiteWrapper_6 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      String string0 = "@,\"y--wN@FEA.&";
      Type[] typeArray0 = new Type[3];
      short short0 = (short)1565;
      // Undeclared exception!
      try { 
        instructionFactory0.createInvoke(string0, string0, basicType0, typeArray0, short0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
