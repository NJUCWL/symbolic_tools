/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:17:43 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import org.apache.bcel.classfile.AnnotationDefault;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ElementValue;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.SimpleElementValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationDefault_ESTest extends AnnotationDefault_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(0, 0, (ConstantPool) null);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(1083, 1083, simpleElementValue0, (ConstantPool) null);
      annotationDefault0.setDefaultValue((ElementValue) null);
      ElementValue elementValue0 = annotationDefault0.getDefaultValue();
      assertNull(elementValue0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SimpleElementValue simpleElementValue0 = new SimpleElementValue((-1), 160, constantPool0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(0, 0, simpleElementValue0, constantPool0);
      ElementValue elementValue0 = annotationDefault0.getDefaultValue();
      assertEquals((byte)68, ElementValue.PRIMITIVE_DOUBLE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SimpleElementValue simpleElementValue0 = new SimpleElementValue((-1), 160, constantPool0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(0, 0, simpleElementValue0, constantPool0);
      Attribute attribute0 = annotationDefault0.copy(constantPool0);
      assertEquals(0, attribute0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant[] constantArray0 = new Constant[6];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault((-1036), (-1211), (ElementValue) null, constantPool0);
      Attribute attribute0 = annotationDefault0.copy(constantPool0);
      assertFalse(attribute0.equals((Object)annotationDefault0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue((-2696), 0, (ConstantPool) null);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(0, 0, classElementValue0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        annotationDefault0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationDefault annotationDefault0 = null;
      try {
        annotationDefault0 = new AnnotationDefault(3242, 1584, dataInputStream0, constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected element value kind in annotation: 0
         //
         verifyException("org.apache.bcel.classfile.ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(143);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      AnnotationDefault annotationDefault0 = null;
      try {
        annotationDefault0 = new AnnotationDefault(543, 143, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-125), (byte) (-106));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      AnnotationDefault annotationDefault0 = null;
      try {
        annotationDefault0 = new AnnotationDefault(0, 303, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnnotationDefault annotationDefault0 = null;
      try {
        annotationDefault0 = new AnnotationDefault((-75), 0, (DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(712, 712, (ConstantPool) null);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(1083, 2646, simpleElementValue0, (ConstantPool) null);
      ElementValue elementValue0 = annotationDefault0.getDefaultValue();
      assertEquals((byte)70, ElementValue.PRIMITIVE_FLOAT);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(6, 160, constantPool0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(6, 6, simpleElementValue0, constantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, (byte)74);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        annotationDefault0.dump(dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValue doesnt know how to write out type 6
         //
         verifyException("org.apache.bcel.classfile.SimpleElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(6, 160, constantPool0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(6, 6, simpleElementValue0, constantPool0);
      Attribute attribute0 = annotationDefault0.copy(constantPool0);
      assertEquals(6, attribute0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ClassElementValue classElementValue0 = new ClassElementValue(0, 226, constantPool0);
      AnnotationDefault annotationDefault0 = new AnnotationDefault(0, 0, classElementValue0, constantPool0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      annotationDefault0.accept(emptyVisitor0);
      assertEquals((byte)16, annotationDefault0.getTag());
  }
}
