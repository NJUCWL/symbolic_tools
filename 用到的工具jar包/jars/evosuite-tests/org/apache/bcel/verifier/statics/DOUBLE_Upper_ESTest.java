/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:25:30 GMT 2021
 */

package org.apache.bcel.verifier.statics;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.verifier.statics.DOUBLE_Upper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DOUBLE_Upper_ESTest extends DOUBLE_Upper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DOUBLE_Upper dOUBLE_Upper0 = DOUBLE_Upper.theInstance();
      assertEquals(1, dOUBLE_Upper0.getSize());
  }
}
