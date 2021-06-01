/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 08:28:55 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionList;

public class InstructionList_31_Test {

  //Covered goal: org.apache.bcel.generic.InstructionList.insert(Lorg/apache/bcel/generic/Instruction;Lorg/apache/bcel/generic/Instruction;)Lorg/apache/bcel/generic/InstructionHandle;: path condition EvoSuiteWrapper_31 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      DADD dADD0 = (DADD)InstructionConstants.DADD;
      IFLT iFLT0 = new IFLT();
      // Undeclared exception!
      try { 
        instructionList0.insert((Instruction) dADD0, (Instruction) iFLT0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
}
