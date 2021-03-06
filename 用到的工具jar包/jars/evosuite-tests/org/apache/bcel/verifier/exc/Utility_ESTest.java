/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:34:58 GMT 2021
 */

package org.apache.bcel.verifier.exc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.verifier.exc.Utility;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utility_ESTest extends Utility_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      // Undeclared exception!
      try { 
        Utility.getStackTrace(mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      String string0 = Utility.getStackTrace(mockThrowable0);
      //  // Unstable assertion: assertEquals("sun.reflect.GeneratedConstructorAccessor37.newInstance(Unknown Source)\n<evosuite>.<evosuite>(<evosuite>)\n<evosuite>.<evosuite>(<evosuite>)\n<evosuite>.<evosuite>(<evosuite>)\n<evosuite>.<evosuite>(<evosuite>)\n<evosuite>.<evosuite>(<evosuite>)\n", string0);
  }
}
