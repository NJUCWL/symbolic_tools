/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:49:22 GMT 2021
 */

package org.apache.bcel.verifier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.apache.bcel.verifier.VerifierAppFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VerifierAppFrame_ESTest extends VerifierAppFrame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VerifierAppFrame verifierAppFrame0 = null;
      try {
        verifierAppFrame0 = new VerifierAppFrame();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
