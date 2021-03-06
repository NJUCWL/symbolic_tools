/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:17:53 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayType_ESTest extends ArrayType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType("x:pJP&9j3vo]?g2", 88);
      ArrayType arrayType1 = new ArrayType(arrayType0, 5);
      boolean boolean0 = arrayType0.equals(arrayType1);
      assertEquals(93, arrayType1.getDimensions());
      assertFalse(boolean0);
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[Lx:pJP&9j3vo]?g2;", arrayType0.getSignature());
      assertFalse(arrayType1.equals((Object)arrayType0));
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[Lx:pJP&9j3vo]?g2;", arrayType1.getSignature());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType((Type) null, 120);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType((String) null, (-1378));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ArrayType arrayType0 = new ArrayType(referenceType0, 179);
      Type type0 = arrayType0.getElementType();
      boolean boolean0 = arrayType0.equals(type0);
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[<null object>", type0.getSignature());
      assertFalse(type0.equals((Object)arrayType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType(",k", 2);
      boolean boolean0 = arrayType0.equals("ZDqi-7Y&\"iTv\"kWHHO");
      assertEquals("[[L,k;", arrayType0.getSignature());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType("v;)Qw?u", 1);
      arrayType0.getElementType();
      assertEquals("[Lv;)Qw?u;", arrayType0.getSignature());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicType basicType0 = Type.VOID;
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType(basicType0, 177);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid type: void[]
         //
         verifyException("org.apache.bcel.generic.ArrayType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType(referenceType0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid number of dimensions: 0
         //
         verifyException("org.apache.bcel.generic.ArrayType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType(",k", 2);
      int int0 = arrayType0.getDimensions();
      assertEquals("[[L,k;", arrayType0.getSignature());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType((byte)6, 37);
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[F", arrayType0.getSignature());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType("x:pJP&9j3vo]?g2", 91);
      ArrayType arrayType1 = new ArrayType("zwyvD7NR>", 91);
      boolean boolean0 = arrayType0.equals(arrayType1);
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[LzwyvD7NR>;", arrayType1.getSignature());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType("x:pJP&9j3vo]?g2", 91);
      boolean boolean0 = arrayType0.equals(arrayType0);
      assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[Lx:pJP&9j3vo]?g2;", arrayType0.getSignature());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ARETURN aRETURN0 = new ARETURN();
      Type type0 = aRETURN0.getType();
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType(type0, 1652);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid number of dimensions: 1652
         //
         verifyException("org.apache.bcel.generic.ArrayType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType("ZB(z5DKa0Ux^Z^y", (-694));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid number of dimensions: -694
         //
         verifyException("org.apache.bcel.generic.ArrayType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType(",k", 2);
      arrayType0.getBasicType();
      assertEquals("[[L,k;", arrayType0.getSignature());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayType arrayType0 = null;
      try {
        arrayType0 = new ArrayType((byte)12, (byte)12);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid type: void[]
         //
         verifyException("org.apache.bcel.generic.ArrayType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayType arrayType0 = new ArrayType(",k", 2);
      arrayType0.hashCode();
      assertEquals("[[L,k;", arrayType0.getSignature());
  }
}
