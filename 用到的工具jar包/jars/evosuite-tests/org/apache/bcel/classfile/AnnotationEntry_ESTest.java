/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:11:32 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ElementValuePair;
import org.apache.bcel.classfile.EmptyVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationEntry_ESTest extends AnnotationEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      byteArrayInputStream0.reset();
      AnnotationEntry annotationEntry0 = AnnotationEntry.read(dataInputStream0, constantPool0, false);
      assertFalse(annotationEntry0.isRuntimeVisible());
      assertEquals(0, annotationEntry0.getAnnotationTypeIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      byteArray0[3] = (byte) (-112);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      AnnotationEntry annotationEntry0 = AnnotationEntry.read(dataInputStream0, constantPool0, true);
      assertTrue(annotationEntry0.isRuntimeVisible());
      assertEquals(144, annotationEntry0.getTypeIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(1042, constantPool0, true);
      boolean boolean0 = annotationEntry0.isRuntimeVisible();
      assertTrue(boolean0);
      assertEquals(1042, annotationEntry0.getAnnotationTypeIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(185, constantPool0, false);
      int int0 = annotationEntry0.getTypeIndex();
      assertFalse(annotationEntry0.isRuntimeVisible());
      assertEquals(185, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AnnotationEntry annotationEntry0 = new AnnotationEntry(3997, (ConstantPool) null, false);
      annotationEntry0.getConstantPool();
      assertFalse(annotationEntry0.isRuntimeVisible());
      assertEquals(3997, annotationEntry0.getTypeIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry((-4), constantPool0, false);
      annotationEntry0.getConstantPool();
      assertEquals((-4), annotationEntry0.getTypeIndex());
      assertFalse(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(0, constantPool0, true);
      int int0 = annotationEntry0.getAnnotationTypeIndex();
      assertTrue(annotationEntry0.isRuntimeVisible());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(1272, constantPool0, false);
      int int0 = annotationEntry0.getAnnotationTypeIndex();
      assertEquals(1272, int0);
      assertFalse(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnnotationEntry annotationEntry0 = new AnnotationEntry(1, (ConstantPool) null, false);
      // Undeclared exception!
      try { 
        annotationEntry0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(0, constantPool0, true);
      // Undeclared exception!
      try { 
        annotationEntry0.toShortString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnnotationEntry annotationEntry0 = new AnnotationEntry(0, (ConstantPool) null, true);
      // Undeclared exception!
      try { 
        annotationEntry0.toShortString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        AnnotationEntry.read((DataInput) null, (ConstantPool) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        AnnotationEntry.read(dataInputStream0, (ConstantPool) null, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      try { 
        AnnotationEntry.read(dataInputStream0, constantPool0, true);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnnotationEntry annotationEntry0 = new AnnotationEntry(1925, (ConstantPool) null, false);
      // Undeclared exception!
      try { 
        annotationEntry0.getElementValuePairs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(0, constantPool0, true);
      // Undeclared exception!
      try { 
        annotationEntry0.getAnnotationType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AnnotationEntry annotationEntry0 = new AnnotationEntry(3997, (ConstantPool) null, false);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, 3);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        annotationEntry0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        AnnotationEntry.createAnnotationEntries((Attribute[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      AnnotationEntry annotationEntry0 = AnnotationEntry.read(dataInputStream0, constantPool0, true);
      // Undeclared exception!
      try { 
        annotationEntry0.getAnnotationType();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 0. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute[] attributeArray0 = new Attribute[5];
      AnnotationEntry[] annotationEntryArray0 = AnnotationEntry.createAnnotationEntries(attributeArray0);
      assertEquals(0, annotationEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      AnnotationEntry annotationEntry0 = AnnotationEntry.read(dataInputStream0, constantPool0, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1493);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      annotationEntry0.dump(dataOutputStream0);
      assertEquals("\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertTrue(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      byteArray0[4] = (byte) (-30);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      // Undeclared exception!
      try { 
        AnnotationEntry.read(dataInputStream0, constantPool0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected element value kind in annotation: 0
         //
         verifyException("org.apache.bcel.classfile.ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry((-4), constantPool0, false);
      int int0 = annotationEntry0.getAnnotationTypeIndex();
      assertEquals((-4), int0);
      assertFalse(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      AnnotationEntry annotationEntry0 = AnnotationEntry.read(dataInputStream0, constantPool0, true);
      annotationEntry0.getElementValuePairs();
      assertEquals(0, annotationEntry0.getAnnotationTypeIndex());
      assertTrue(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(58, constantPool0, false);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      annotationEntry0.accept(emptyVisitor0);
      assertEquals(58, annotationEntry0.getAnnotationTypeIndex());
      assertFalse(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(1042, constantPool0, false);
      boolean boolean0 = annotationEntry0.isRuntimeVisible();
      assertFalse(boolean0);
      assertEquals(1042, annotationEntry0.getAnnotationTypeIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(58, constantPool0, false);
      // Undeclared exception!
      try { 
        annotationEntry0.addElementNameValuePair((ElementValuePair) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant[] constantArray0 = new Constant[8];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry((-1891), constantPool0, true);
      // Undeclared exception!
      try { 
        annotationEntry0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -1891. Constant pool size is: 8
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AnnotationEntry annotationEntry0 = new AnnotationEntry(3550, (ConstantPool) null, false);
      // Undeclared exception!
      try { 
        annotationEntry0.getNumElementValuePairs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool(dataInputStream0);
      AnnotationEntry annotationEntry0 = AnnotationEntry.read(dataInputStream0, constantPool0, true);
      annotationEntry0.getConstantPool();
      assertTrue(annotationEntry0.isRuntimeVisible());
      assertEquals(0, annotationEntry0.getAnnotationTypeIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Constant[] constantArray0 = new Constant[9];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry((-4), constantPool0, false);
      int int0 = annotationEntry0.getTypeIndex();
      assertEquals((-4), int0);
      assertFalse(annotationEntry0.isRuntimeVisible());
  }
}
