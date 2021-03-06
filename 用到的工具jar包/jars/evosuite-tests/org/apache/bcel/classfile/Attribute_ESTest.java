/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:23:44 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantValue;
import org.apache.bcel.classfile.Deprecated;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.EnclosingMethod;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.PMGClass;
import org.apache.bcel.classfile.Synthetic;
import org.apache.bcel.classfile.UnknownAttributeReader;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant[] constantArray0 = new Constant[4];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ExceptionTable exceptionTable0 = new ExceptionTable(1, 49, (int[]) null, constantPool0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Unrecognized attribute type tag parsed: ");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(objectOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      exceptionTable0.dump(dataOutputStream0);
      assertEquals(49, exceptionTable0.getLength());
      assertEquals(1, exceptionTable0.getNameIndex());
      assertEquals((byte)3, exceptionTable0.getTag());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Deprecated deprecated0 = new Deprecated((-3187), (-3688), byteArray0, (ConstantPool) null);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      deprecated0.accept(emptyVisitor0);
      assertEquals((-3187), deprecated0.getNameIndex());
      assertEquals((byte)8, deprecated0.getTag());
      assertEquals((-3688), deprecated0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Deprecated deprecated0 = new Deprecated((-3187), (-3688), byteArray0, (ConstantPool) null);
      assertEquals((byte)8, deprecated0.getTag());
      
      deprecated0.tag = (byte) (-97);
      deprecated0.copy((ConstantPool) null);
      assertEquals((-3187), deprecated0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Deprecated deprecated0 = new Deprecated((-3187), (-3187), byteArray0, (ConstantPool) null);
      assertEquals((-3187), deprecated0.getNameIndex());
      
      deprecated0.setNameIndex((byte)0);
      deprecated0.copy((ConstantPool) null);
      assertEquals(0, deprecated0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Deprecated deprecated0 = new Deprecated((-3187), (-3688), byteArray0, (ConstantPool) null);
      Attribute attribute0 = deprecated0.copy((ConstantPool) null);
      assertEquals((-3187), attribute0.getNameIndex());
      
      attribute0.name_index = 662;
      attribute0.copy((ConstantPool) null);
      assertEquals((-3187), deprecated0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Deprecated deprecated0 = new Deprecated((-3187), (-3688), byteArray0, (ConstantPool) null);
      assertEquals((-3688), deprecated0.getLength());
      
      deprecated0.length = 16;
      deprecated0.copy((ConstantPool) null);
      assertEquals((byte)8, deprecated0.getTag());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        Attribute.readAttribute((DataInput) dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Synthetic synthetic0 = new Synthetic((-1898), 131, byteArray0, constantPool0);
      // Undeclared exception!
      try { 
        synthetic0.getName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -1898. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PMGClass pMGClass0 = new PMGClass(0, (-279), (-279), (-279), (ConstantPool) null);
      pMGClass0.setConstantPool((ConstantPool) null);
      assertEquals((-279), pMGClass0.getLength());
      assertEquals((byte)9, pMGClass0.getTag());
      assertEquals(0, pMGClass0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Synthetic synthetic0 = new Synthetic(786, 0, byteArray0, (ConstantPool) null);
      synthetic0.setLength((byte)77);
      assertEquals(77, synthetic0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        Attribute.readAttribute(dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant[] constantArray0 = new Constant[4];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantValue constantValue0 = new ConstantValue(123, 49, 0, constantPool0);
      constantValue0.getConstantPool();
      assertEquals((byte)1, constantValue0.getTag());
      assertEquals(49, constantValue0.getLength());
      assertEquals(123, constantValue0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodeException[] codeExceptionArray0 = new CodeException[2];
      Code code0 = new Code(0, 786, (-2513), (byte)77, byteArray0, codeExceptionArray0, (Attribute[]) null, (ConstantPool) null);
      Code code1 = (Code)code0.clone();
      assertEquals(29, code1.getLength());
      assertNotSame(code1, code0);
      assertEquals((byte)2, code1.getTag());
      assertEquals(0, code1.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnknownAttributeReader unknownAttributeReader0 = mock(UnknownAttributeReader.class, new ViolatedAssumptionAnswer());
      Attribute.addAttributeReader("", unknownAttributeReader0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<EnclosingMethod> class0 = EnclosingMethod.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      assertEquals("EnclosingMethod.java", javaClass0.getSourceFileName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attribute.removeAttributeReader("caload");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Deprecated deprecated0 = new Deprecated((-3187), (-3187), byteArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        deprecated0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Synthetic synthetic0 = new Synthetic(786, 0, byteArray0, (ConstantPool) null);
      Synthetic synthetic1 = new Synthetic(synthetic0);
      assertEquals(786, synthetic0.getNameIndex());
      assertEquals(0, synthetic1.getLength());
      assertEquals((byte)7, synthetic1.getTag());
  }
}
