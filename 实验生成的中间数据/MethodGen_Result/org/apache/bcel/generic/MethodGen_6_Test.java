/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:14:58 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

public class MethodGen_6_Test {

  //Covered goal: org.apache.bcel.generic.MethodGen.copy(Ljava/lang/String;Lorg/apache/bcel/generic/ConstantPoolGen;)Lorg/apache/bcel/generic/MethodGen;: path condition EvoSuiteWrapper_6 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 359;
      ObjectType objectType0 = Type.CLASS;
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = new String[0];
      String string0 = "YTu|";
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) iF_ICMPEQ0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen(int0, objectType0, typeArray0, stringArray0, string0, string0, instructionList0, constantPoolGen0);
      // Undeclared exception!
      try { 
        methodGen0.copy(string0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
}
