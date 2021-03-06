/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:47:42 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.MethodParameter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodParameter_ESTest extends MethodParameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      MockPrintStream mockPrintStream0 = new MockPrintStream("#CIi!bj1#M=S'@");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      methodParameter0.dump(dataOutputStream0);
      assertFalse(methodParameter0.isFinal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MethodParameter methodParameter0 = new MethodParameter(dataInputStream0);
      assertFalse(methodParameter0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setNameIndex(184);
      int int0 = methodParameter0.getNameIndex();
      assertEquals(184, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setNameIndex((-32768));
      int int0 = methodParameter0.getNameIndex();
      assertEquals((-32768), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags(12);
      int int0 = methodParameter0.getAccessFlags();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags((-1351));
      int int0 = methodParameter0.getAccessFlags();
      assertEquals((-1351), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags((-2767));
      MethodParameter methodParameter1 = methodParameter0.copy();
      assertEquals((-2767), methodParameter1.getAccessFlags());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setNameIndex(236);
      MethodParameter methodParameter1 = methodParameter0.copy();
      assertEquals(236, methodParameter1.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setNameIndex((-32768));
      MethodParameter methodParameter1 = methodParameter0.copy();
      assertEquals((-32768), methodParameter1.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags(184);
      MethodParameter methodParameter1 = methodParameter0.copy();
      assertEquals(184, methodParameter1.getAccessFlags());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setNameIndex((-163));
      // Undeclared exception!
      try { 
        methodParameter0.getParameterName((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.MethodParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        methodParameter0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1295), (byte)89);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 688);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      boolean boolean0 = methodParameter0.isMandated();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags((-2767));
      boolean boolean0 = methodParameter0.isSynthetic();
      assertTrue(methodParameter0.isMandated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      boolean boolean0 = methodParameter0.isSynthetic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags((-2767));
      boolean boolean0 = methodParameter0.isFinal();
      assertTrue(methodParameter0.isMandated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      boolean boolean0 = methodParameter0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      String string0 = methodParameter0.getParameterName((ConstantPool) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setNameIndex(236);
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        methodParameter0.getParameterName(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 236. Constant pool size is: 3
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MethodParameter methodParameter0 = null;
      try {
        methodParameter0 = new MethodParameter((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.MethodParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      int int0 = methodParameter0.getNameIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      int int0 = methodParameter0.getAccessFlags();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      methodParameter0.setAccessFlags((-32768));
      boolean boolean0 = methodParameter0.isMandated();
      assertEquals((-32768), methodParameter0.getAccessFlags());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MethodParameter methodParameter0 = new MethodParameter();
      // Undeclared exception!
      try { 
        methodParameter0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.MethodParameter", e);
      }
  }
}
