/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:59:00 GMT 2021
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.UninitializedObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UninitializedObjectType_ESTest extends UninitializedObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      boolean boolean0 = uninitializedObjectType0.equals(uninitializedObjectType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      uninitializedObjectType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      ObjectType objectType1 = uninitializedObjectType0.getInitialized();
      assertEquals("java.lang.StringBuffer", objectType1.getClassName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UninitializedObjectType uninitializedObjectType0 = null;
      try {
        uninitializedObjectType0 = new UninitializedObjectType((ObjectType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.UninitializedObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      boolean boolean0 = uninitializedObjectType0.equals(objectType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      boolean boolean0 = uninitializedObjectType0.equals(uninitializedObjectType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      ObjectType objectType1 = uninitializedObjectType0.getInitialized();
      assertEquals("java.lang.String", objectType1.getClassName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      uninitializedObjectType0.hashCode();
  }
}
