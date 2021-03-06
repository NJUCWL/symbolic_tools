/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:33:24 GMT 2021
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
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.util.BCELComparator;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Constant_ESTest extends Constant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      constantUtf8_0.dump(dataOutputStream0);
      assertEquals("", constantUtf8_0.getBytes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(1934);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<ConstantClass> class0 = ConstantClass.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      DescendingVisitor descendingVisitor0 = new DescendingVisitor(javaClass0, emptyVisitor0);
      constantMethodType0.accept(descendingVisitor0);
      assertEquals(1934, constantMethodType0.getDescriptorIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantLong constantLong0 = new ConstantLong(869L);
      String string0 = constantLong0.toString();
      assertEquals("CONSTANT_Long[5](bytes = 869)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantLong constantLong0 = new ConstantLong(333L);
      boolean boolean0 = constantLong0.equals(constantLong0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat(2425.0F);
      ConstantInteger constantInteger0 = new ConstantInteger((byte) (-117));
      boolean boolean0 = constantFloat0.equals(constantInteger0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Constant.readConstant((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-126), (byte)60);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -126
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType((-2743));
      Constant.setComparator((BCELComparator) null);
      // Undeclared exception!
      try { 
        constantMethodType0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(62);
      BCELComparator bCELComparator0 = Method.getComparator();
      Constant.setComparator(bCELComparator0);
      // Undeclared exception!
      try { 
        constantMethodType0.hashCode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantMethodType cannot be cast to org.apache.bcel.classfile.Method
         //
         verifyException("org.apache.bcel.classfile.Method$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantClass constantClass0 = new ConstantClass((-1402));
      constantClass0.tag = (byte)63;
      // Undeclared exception!
      try { 
        constantClass0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 63
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(1934);
      BCELComparator bCELComparator0 = Field.getComparator();
      Constant.setComparator(bCELComparator0);
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("org.apache.bcel.classfile.Constant$1");
      // Undeclared exception!
      try { 
        constantMethodType0.equals(constantUtf8_0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantMethodType cannot be cast to org.apache.bcel.classfile.Field
         //
         verifyException("org.apache.bcel.classfile.Field$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantFloat constantFloat0 = new ConstantFloat((-1.0F));
      byte byte0 = constantFloat0.getTag();
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<ConstantClass> class0 = ConstantClass.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      JavaClass[] javaClassArray0 = javaClass0.getSuperClasses();
      assertEquals(2, javaClassArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BCELComparator bCELComparator0 = Constant.getComparator();
      assertNotNull(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantString constantString0 = new ConstantString((-1454));
      Constant constant0 = constantString0.copy();
      assertEquals((byte)8, constant0.getTag());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantClass constantClass0 = new ConstantClass((-1454));
      MockFile mockFile0 = new MockFile("ci<Y");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      constantClass0.dump(dataOutputStream0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      dataInputStream0.readUnsignedByte();
      try { 
        Constant.readConstant(dataInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid byte tag in constant pool: -6
         //
         verifyException("org.apache.bcel.classfile.Constant", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantString constantString0 = new ConstantString((-1454));
      ConstantString constantString1 = (ConstantString)constantString0.clone();
      assertEquals((byte)8, constantString1.getTag());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantClass constantClass0 = new ConstantClass((-1402));
      constantClass0.hashCode();
      assertEquals((byte)7, constantClass0.getTag());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantMethodType constantMethodType0 = new ConstantMethodType(1934);
      // Undeclared exception!
      try { 
        constantMethodType0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Constant$1", e);
      }
  }
}
