/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 08:28:29 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.SALOAD;

public class InstructionList_7_Test {

  //Covered goal: org.apache.bcel.generic.InstructionList.getByteCode()[B: path condition EvoSuiteWrapper_7 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SALOAD sALOAD0 = (SALOAD)InstructionConstants.SALOAD;
      InstructionList instructionList0 = new InstructionList(sALOAD0);
      instructionList0.getInstructions();
  }
}
