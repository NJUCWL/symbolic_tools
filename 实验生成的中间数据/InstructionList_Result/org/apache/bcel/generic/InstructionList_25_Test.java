/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 08:28:47 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.DALOAD;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;

public class InstructionList_25_Test {

  //Covered goal: org.apache.bcel.generic.InstructionList.delete(Lorg/apache/bcel/generic/InstructionHandle;Lorg/apache/bcel/generic/InstructionHandle;)V: path condition EvoSuiteWrapper_25 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      DALOAD dALOAD0 = new DALOAD();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(dALOAD0);
      // Undeclared exception!
      try { 
        instructionList0.delete(instructionHandle0, instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
