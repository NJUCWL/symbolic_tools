/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:31:21 GMT 2021
 */

package org.apache.bcel.verifier.exc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.verifier.exc.LinkingConstraintException;
import org.apache.bcel.verifier.exc.StaticCodeInstructionOperandConstraintException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeConstraintException_ESTest extends CodeConstraintException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticCodeInstructionOperandConstraintException staticCodeInstructionOperandConstraintException0 = new StaticCodeInstructionOperandConstraintException("Q=5CQOly]1H)H");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkingConstraintException linkingConstraintException0 = new LinkingConstraintException();
  }
}
