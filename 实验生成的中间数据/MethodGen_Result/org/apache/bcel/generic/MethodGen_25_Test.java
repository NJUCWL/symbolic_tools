/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:14:44 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;

public class MethodGen_25_Test {

  //Covered goal: org.apache.bcel.generic.MethodGen.removeCodeAttribute(Lorg/apache/bcel/classfile/Attribute;)V: path condition EvoSuiteWrapper_25 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      String string0 = "stripAttributes(Z)V";
      ObjectType objectType0 = new ObjectType(string0);
      Type[] typeArray0 = null;
      String[] stringArray0 = new String[2];
      stringArray0[1] = string0;
      LDC lDC0 = new LDC();
      InstructionList instructionList0 = new InstructionList(lDC0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen(int0, objectType0, typeArray0, stringArray0, string0, stringArray0[1], instructionList0, constantPoolGen0);
      methodGen0.getMethod();
  }
}
