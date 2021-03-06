/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:14:02 GMT 2021
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
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.InnerClasses;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Code_ESTest extends Code_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 17, 4, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      int int0 = code0.getMaxStack();
      assertEquals(17, int0);
      assertEquals(4, code0.getMaxLocals());
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      int int0 = code0.getMaxStack();
      assertEquals(25, code0.getLength());
      assertEquals((-2053), int0);
      assertEquals(0, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      int int0 = code0.getMaxLocals();
      assertEquals(0, int0);
      assertEquals((-2053), code0.getMaxStack());
      assertEquals(25, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      CodeException[] codeExceptionArray0 = new CodeException[17];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      code0.getExceptionTable();
      assertEquals(157, code0.getLength());
      assertEquals((-2053), code0.getMaxStack());
      assertEquals(0, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      CodeException codeException0 = new CodeException(0, (byte)111, (-1), (byte)0);
      codeExceptionArray0[0] = codeException0;
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      Code code1 = (Code)code0.copy(constantPool0);
      assertEquals(25, code1.getLength());
      assertNotSame(code1, code0);
      assertEquals((-2053), code1.getMaxStack());
      assertEquals(0, code1.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      CodeException[] codeExceptionArray0 = new CodeException[17];
      CodeException codeException0 = new CodeException(0, (byte)99, (-1), (byte)18);
      codeExceptionArray0[0] = codeException0;
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        code0.toString(true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 18. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)18;
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        code0.toString(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)37;
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, 0, 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        code0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 37. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)18;
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, 0, 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        code0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Code code0 = null;
      try {
        code0 = new Code((Code) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Code code0 = null;
      try {
        code0 = new Code((-1296), (-1), (DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = null;
      try {
        code0 = new Code((-1602), (-1602), dataInputStream0, constantPool0);
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
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      String string0 = code0.toString(true);
      assertEquals("Code(max_stack = 0, max_locals = 8, code_length = 1)\n0:    nop\n", string0);
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      int int0 = code0.getMaxStack();
      assertEquals(13, code0.getLength());
      assertEquals(0, int0);
      assertEquals(8, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      Attribute[] attributeArray1 = code0.getAttributes();
      assertSame(attributeArray1, attributeArray0);
      assertEquals(8, code0.getMaxLocals());
      assertEquals(13, code0.getLength());
      assertEquals(0, code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      int int0 = code0.getMaxLocals();
      assertEquals(13, code0.getLength());
      assertEquals(8, int0);
      assertEquals(0, code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.getExceptionTable();
      assertEquals(8, code0.getMaxLocals());
      assertEquals(13, code0.getLength());
      assertEquals(0, code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.getCode();
      assertEquals(0, code0.getMaxStack());
      assertEquals(13, code0.getLength());
      assertEquals(8, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InnerClasses> class0 = InnerClasses.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      JavaClass javaClass1 = javaClass0.copy();
      assertNotSame(javaClass1, javaClass0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      Code code1 = (Code)code0.copy(constantPool0);
      assertEquals(8, code1.getMaxLocals());
      assertNotSame(code1, code0);
      assertEquals(0, code1.getMaxStack());
      assertEquals(13, code1.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      CodeException[] codeExceptionArray0 = new CodeException[17];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      // Undeclared exception!
      try { 
        code0.toString(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      code0.setExceptionTable(codeExceptionArray0);
      assertEquals(25, code0.getLength());
      assertEquals(0, code0.getMaxLocals());
      assertEquals((-2053), code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.setExceptionTable((CodeException[]) null);
      assertEquals(13, code0.getLength());
      assertEquals(0, code0.getMaxStack());
      assertEquals(8, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      code0.setCode(byteArray0);
      assertEquals(0, code0.getMaxLocals());
      assertEquals(25, code0.getLength());
      assertEquals((-2053), code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.setAttributes(attributeArray0);
      assertEquals(13, code0.getLength());
      assertEquals(0, code0.getMaxStack());
      assertEquals(8, code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      code0.setAttributes((Attribute[]) null);
      assertEquals(25, code0.getLength());
      assertEquals(0, code0.getMaxLocals());
      assertEquals((-2053), code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Attribute[] attributeArray0 = new Attribute[2];
      Code code0 = null;
      try {
        code0 = new Code(1557, 1557, 1557, 1557, (byte[]) null, codeExceptionArray0, attributeArray0, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.getLocalVariableTable();
      assertEquals(8, code0.getMaxLocals());
      assertEquals(13, code0.getLength());
      assertEquals(0, code0.getMaxStack());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.getLineNumberTable();
      assertEquals(8, code0.getMaxLocals());
      assertEquals(0, code0.getMaxStack());
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(0, 0, (-2053), 0, byteArray0, codeExceptionArray0, (Attribute[]) null, constantPool0);
      MockFile mockFile0 = new MockFile("YLLe");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        code0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Code", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      code0.dump(dataOutputStream0);
      assertEquals(19, byteArrayOutputStream0.size());
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InnerClasses> class0 = InnerClasses.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      JavaClass javaClass1 = javaClass0.getSuperClass();
      assertFalse(javaClass1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      code0.accept(emptyVisitor0);
      assertEquals(0, code0.getMaxStack());
      assertEquals(8, code0.getMaxLocals());
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.setMaxStack(0);
      assertEquals(0, code0.getMaxStack());
      assertEquals(8, code0.getMaxLocals());
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      code0.setMaxLocals((-3227));
      assertEquals((-3227), code0.getMaxLocals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      String string0 = code0.toString();
      assertEquals("Code(max_stack = 0, max_locals = 8, code_length = 1)\n0:    nop\n", string0);
      assertEquals(13, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Attribute[] attributeArray0 = new Attribute[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Code code0 = new Code(1975, 1975, 0, 8, byteArray0, (CodeException[]) null, attributeArray0, constantPool0);
      Code code1 = new Code(code0);
      assertEquals(13, code1.getLength());
      assertEquals(8, code0.getMaxLocals());
      assertEquals(0, code1.getMaxStack());
  }
}
