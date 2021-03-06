/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:06:39 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.Deprecated;
import org.apache.bcel.classfile.EmptyVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Deprecated_ESTest extends Deprecated_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Deprecated deprecated0 = new Deprecated((-15), (-15), byteArray0, (ConstantPool) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Deprecated", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      deprecated0.dump(dataOutputStream0);
      assertEquals((-15), deprecated0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Deprecated deprecated0 = new Deprecated(810, 0, dataInputStream0, constantPool0);
      byte[] byteArray0 = deprecated0.getBytes();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Deprecated deprecated0 = new Deprecated(114, 114, byteArray0, (ConstantPool) null);
      byte[] byteArray1 = deprecated0.getBytes();
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Deprecated deprecated0 = new Deprecated(596, 596, byteArray0, (ConstantPool) null);
      Attribute attribute0 = deprecated0.copy((ConstantPool) null);
      assertNotSame(attribute0, deprecated0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Deprecated deprecated0 = new Deprecated((-11), (-11), dataInputStream0, (ConstantPool) null);
      Attribute attribute0 = deprecated0.copy((ConstantPool) null);
      assertNotSame(attribute0, deprecated0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Deprecated deprecated0 = new Deprecated(165, (-1642), byteArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        deprecated0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Deprecated deprecated0 = new Deprecated((-15), (-15), byteArray0, (ConstantPool) null);
      MockFile mockFile0 = new MockFile("private", "private");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFile0.delete();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        deprecated0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Deprecated deprecated0 = null;
      try {
        deprecated0 = new Deprecated((Deprecated) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Deprecated", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Deprecated deprecated0 = new Deprecated((-341), 0, byteArray0, constantPool0);
      byte[] byteArray1 = deprecated0.getBytes();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Deprecated deprecated0 = new Deprecated((-341), 0, byteArray0, constantPool0);
      Attribute attribute0 = deprecated0.copy(constantPool0);
      assertNotSame(attribute0, deprecated0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Deprecated deprecated0 = new Deprecated(596, 596, byteArray0, (ConstantPool) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("CONSTANT_InterfaceMethodref");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      deprecated0.dump(dataOutputStream0);
      assertEquals(596, deprecated0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Deprecated deprecated0 = new Deprecated((-341), 0, byteArray0, constantPool0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("lload_1");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      deprecated0.dump(dataOutputStream0);
      assertEquals((byte)8, deprecated0.getTag());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Deprecated deprecated0 = new Deprecated(0, 0, dataInputStream0, (ConstantPool) null);
      Attribute attribute0 = deprecated0.copy((ConstantPool) null);
      assertNotSame(attribute0, deprecated0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Deprecated deprecated0 = new Deprecated(13, 13, byteArray0, (ConstantPool) null);
      String string0 = deprecated0.toString();
      assertEquals("Deprecated", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Deprecated deprecated0 = new Deprecated(13, 13, byteArray0, (ConstantPool) null);
      deprecated0.setBytes(byteArray0);
      assertEquals((byte)8, deprecated0.getTag());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Deprecated deprecated0 = new Deprecated(13, 13, byteArray0, (ConstantPool) null);
      Deprecated deprecated1 = new Deprecated(deprecated0);
      assertFalse(deprecated1.equals((Object)deprecated0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Deprecated deprecated0 = new Deprecated(13, 13, byteArray0, (ConstantPool) null);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      deprecated0.accept(emptyVisitor0);
      assertEquals((byte)8, deprecated0.getTag());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Deprecated deprecated0 = null;
      try {
        deprecated0 = new Deprecated(14, 14, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
}
