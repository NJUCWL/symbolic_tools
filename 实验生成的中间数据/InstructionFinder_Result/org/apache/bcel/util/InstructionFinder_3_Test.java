/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 11:02:39 GMT 2021
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static shaded.org.evosuite.shaded.org.mockito.Mockito.*;
import static shaded.org.evosuite.runtime.MockitoExtension.*;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.util.InstructionFinder;
import shaded.org.evosuite.runtime.ViolatedAssumptionAnswer;

public class InstructionFinder_3_Test {

  //Covered goal: org.apache.bcel.util.InstructionFinder.search(Ljava/lang/String;Lorg/apache/bcel/generic/InstructionHandle;Lorg/apache/bcel/util/InstructionFinder$CodeConstraint;)Ljava/util/Iterator;: path condition EvoSuiteWrapper_3 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
      String string0 = "]T|EDuaK~H)e";
      InstructionFinder.CodeConstraint instructionFinder_CodeConstraint0 = mock(InstructionFinder.CodeConstraint.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        instructionFinder0.search(string0, instructionFinder_CodeConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction unknown: t
         //
      }
  }
}
