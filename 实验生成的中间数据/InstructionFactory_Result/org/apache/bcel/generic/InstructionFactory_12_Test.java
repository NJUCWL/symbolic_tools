/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:21:22 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.InstructionFactory;

public class InstructionFactory_12_Test {

  //Covered goal: org.apache.bcel.generic.InstructionFactory.getConstantPool()Lorg/apache/bcel/generic/ConstantPoolGen;: path condition EvoSuiteWrapper_12 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Md=g?7_`CHG9B0j";
      int int0 = 340;
      String[] stringArray0 = new String[8];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0);
      instructionFactory0.getConstantPool();
  }
}
