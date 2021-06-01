/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:49:08 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.ClassPath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantFloat_ESTest extends ConstantFloat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      float float0 = constantFloat0.getBytes();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat((-1662.0F));
      float float0 = constantFloat0.getBytes();
      assertEquals((-1662.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      InputStream inputStream0 = classPath0.getInputStream("", "");
      DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
      ConstantFloat constantFloat0 = new ConstantFloat(dataInputStream0);
      // Undeclared exception!
      try { 
        constantFloat0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%zObD.H@|Ikr6\"I^");
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        constantFloat0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      // Undeclared exception!
      try { 
        constantFloat0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantFloat constantFloat0 = null;
      try {
        constantFloat0 = new ConstantFloat((ConstantFloat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)18);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantFloat constantFloat0 = null;
      try {
        constantFloat0 = new ConstantFloat(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ConstantFloat constantFloat0 = null;
      try {
        constantFloat0 = new ConstantFloat(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ConstantFloat constantFloat0 = null;
      try {
        constantFloat0 = new ConstantFloat(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      InputStream inputStream0 = classPath0.getInputStream("", "");
      DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
      ConstantFloat constantFloat0 = new ConstantFloat(dataInputStream0);
      float float0 = constantFloat0.getBytes();
      assertEquals(2.06914576E8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      String string0 = constantFloat0.toString();
      assertEquals("CONSTANT_Float[4](bytes = 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      ConstantFloat constantFloat1 = new ConstantFloat(constantFloat0);
      assertEquals(0.0F, constantFloat0.getBytes(), 0.01F);
      assertTrue(constantFloat1.equals((Object)constantFloat0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      constantFloat0.setBytes(0.0F);
      assertEquals(0.0F, constantFloat0.getBytes(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      constantFloat0.dump(dataOutputStream0);
      assertEquals("\u0004\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantFloat constantFloat0 = null;
      try {
        constantFloat0 = new ConstantFloat((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      constantFloat0.accept(emptyVisitor0);
      assertEquals(0.0F, constantFloat0.getBytes(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(0.0F);
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Object object0 = constantFloat0.getConstantValue(constantPool0);
      assertEquals(0.0F, object0);
  }
}
