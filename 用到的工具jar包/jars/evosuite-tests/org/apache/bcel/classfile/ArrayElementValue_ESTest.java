/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:53:50 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.bcel.classfile.ArrayElementValue;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ElementValue;
import org.apache.bcel.classfile.SimpleElementValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayElementValue_ESTest extends ArrayElementValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[0];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      int int0 = arrayElementValue0.getElementValuesArraySize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[1];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      int int0 = arrayElementValue0.getElementValuesArraySize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[5];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      ElementValue[] elementValueArray1 = arrayElementValue0.getElementValuesArray();
      assertSame(elementValueArray1, elementValueArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[0];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      ElementValue[] elementValueArray1 = arrayElementValue0.getElementValuesArray();
      assertSame(elementValueArray0, elementValueArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[1];
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(91, (-3260), (ConstantPool) null);
      elementValueArray0[0] = (ElementValue) simpleElementValue0;
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        arrayElementValue0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValue class does not know how to stringify type 91
         //
         verifyException("org.apache.bcel.classfile.SimpleElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, (ElementValue[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        arrayElementValue0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ArrayElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[1];
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(91, (-3260), (ConstantPool) null);
      elementValueArray0[0] = (ElementValue) simpleElementValue0;
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        arrayElementValue0.stringifyValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValue class does not know how to stringify type 91
         //
         verifyException("org.apache.bcel.classfile.SimpleElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, (ElementValue[]) null, (ConstantPool) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("]", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        arrayElementValue0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[18];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        arrayElementValue0.stringifyValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ArrayElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[0];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      String string0 = arrayElementValue0.stringifyValue();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[1];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-%|u?~Z5~yF", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        arrayElementValue0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ArrayElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[0];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("'(v=?`L=6=f{2 :]");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      arrayElementValue0.dump(dataOutputStream0);
      assertEquals((byte)101, ElementValue.ENUM_CONSTANT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayElementValue arrayElementValue0 = null;
      try {
        arrayElementValue0 = new ArrayElementValue((-2587), (ElementValue[]) null, (ConstantPool) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only element values of type array can be built with this ctor - type specified: -2587
         //
         verifyException("org.apache.bcel.classfile.ArrayElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElementValue[] elementValueArray0 = new ElementValue[18];
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, elementValueArray0, (ConstantPool) null);
      String string0 = arrayElementValue0.toString();
      assertEquals("{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, (ElementValue[]) null, (ConstantPool) null);
      ElementValue[] elementValueArray0 = arrayElementValue0.getElementValuesArray();
      assertNull(elementValueArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayElementValue arrayElementValue0 = new ArrayElementValue(91, (ElementValue[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        arrayElementValue0.getElementValuesArraySize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ArrayElementValue", e);
      }
  }
}
