/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:57:56 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantString_ESTest extends ConstantString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(8);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      constantString0.accept(emptyVisitor0);
      assertEquals(8, constantString0.getStringIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(245);
      int int0 = constantString0.getStringIndex();
      assertEquals(245, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantString constantString0 = new ConstantString((-2527));
      int int0 = constantString0.getStringIndex();
      assertEquals((-2527), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(0);
      Constant[] constantArray0 = new Constant[9];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getCachedInstance("4EZhx\r<wL AS i");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Object object0 = constantString0.getConstantValue(constantPool0);
      assertEquals("4EZhx\r<wL AS i", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantString constantString0 = new ConstantString((-151));
      Constant[] constantArray0 = new Constant[9];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantString0.getConstantValue(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -151. Constant pool size is: 9
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantString constantString0 = new ConstantString((-754));
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        constantString0.getBytes(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -754. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantString constantString0 = new ConstantString((-1333));
      // Undeclared exception!
      try { 
        constantString0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantString", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(19);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        constantString0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantString constantString0 = null;
      try {
        constantString0 = new ConstantString((ConstantString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantString", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantString constantString0 = null;
      try {
        constantString0 = new ConstantString((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantString", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ConstantString constantString0 = null;
      try {
        constantString0 = new ConstantString(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ConstantString constantString0 = null;
      try {
        constantString0 = new ConstantString(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)27);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      ConstantString constantString0 = new ConstantString(dataInputStream0);
      assertEquals(0, constantString0.getStringIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(8);
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      // Undeclared exception!
      try { 
        constantString0.getConstantValue(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(245);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)3);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      constantString0.dump(dataOutputStream0);
      assertEquals("\b\u0000\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(245, constantString0.getStringIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(245);
      String string0 = constantString0.toString();
      assertEquals("CONSTANT_String[8](string_index = 245)", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(245);
      // Undeclared exception!
      try { 
        constantString0.getBytes((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantString", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(0);
      // Undeclared exception!
      try { 
        constantString0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantString", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(90);
      ConstantString constantString1 = new ConstantString(constantString0);
      assertEquals(90, constantString0.getStringIndex());
      assertTrue(constantString1.equals((Object)constantString0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(0);
      constantString0.setStringIndex(0);
      assertEquals(0, constantString0.getStringIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantString constantString0 = new ConstantString(0);
      int int0 = constantString0.getStringIndex();
      assertEquals(0, int0);
  }
}
