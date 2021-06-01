/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:39:28 GMT 2021
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantValue;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.InnerClass;
import org.apache.bcel.classfile.InnerClasses;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.LocalVariableTable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.Signature;
import org.apache.bcel.classfile.SourceFile;
import org.apache.bcel.util.AttributeHTML;
import org.apache.bcel.util.ConstantHTML;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AttributeHTML_ESTest extends AttributeHTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("", "", (ConstantPool) null, (ConstantHTML) null);
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariable localVariable0 = new LocalVariable(2, (-2664), 1262, (-1000), 1, (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTable localVariableTable0 = new LocalVariableTable(1262, (-2664), localVariableArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(localVariableTable0, "<H4> <A NAME=cp");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.AttributeHTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("<TR BGCOLOR=\"#C0C0C0\"><TD>", "", constantPool0, (ConstantHTML) null);
      InnerClass[] innerClassArray0 = new InnerClass[9];
      InnerClass innerClass0 = new InnerClass(254, 4, 47, 4);
      innerClassArray0[0] = innerClass0;
      InnerClasses innerClasses0 = new InnerClasses(1, 0, innerClassArray0, constantPool0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(innerClasses0, "", 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 47. Constant pool size is: 3
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("implements\t\t", "", constantPool0, (ConstantHTML) null);
      Signature signature0 = new Signature((-1017), 194, (-1040), constantPool0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(signature0, "implements\t\t");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -1040. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("ifge", "a", constantPool0, (ConstantHTML) null);
      InnerClass[] innerClassArray0 = new InnerClass[1];
      InnerClass innerClass0 = new InnerClass(0, 1, 0, 0);
      innerClassArray0[0] = innerClass0;
      InnerClasses innerClasses0 = new InnerClasses((-2664), 12, innerClassArray0, constantPool0);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(innerClasses0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.AttributeHTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Method[] methodArray0 = new Method[0];
      ConstantHTML constantHTML0 = new ConstantHTML("+AIwV\") Ez7Sog", ":", "+AIwV\") Ez7Sog", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML(":", "+AIwV\") Ez7Sog", constantPool0, constantHTML0);
      InnerClasses innerClasses0 = new InnerClasses(10, 2552, (InnerClass[]) null, constantPool0);
      attributeHTML0.writeAttribute(innerClasses0, "oA", 2552);
      assertEquals((byte)6, innerClasses0.getTag());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Method[] methodArray0 = new Method[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantHTML constantHTML0 = new ConstantHTML("\">Class(", "", "wMu_-;0v8r", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML("4if", "#%{Q 5rg.sglSamU", (ConstantPool) null, constantHTML0);
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[9];
      CodeException codeException0 = new CodeException(6389, (-678), (byte) (-56), 6389);
      codeExceptionArray0[0] = codeException0;
      Code code0 = new Code(20, (byte)86, (-1249), 2268, byteArray0, codeExceptionArray0, (Attribute[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(code0, (String) null, 1241);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6389
         //
         verifyException("org.apache.bcel.util.ConstantHTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Method[] methodArray0 = new Method[1];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantHTML constantHTML0 = new ConstantHTML("\">Class(", "", "wMu_-;0v8r", methodArray0, constantPool0);
      AttributeHTML attributeHTML0 = new AttributeHTML("4if", "#%{Q 5rg.sglSamU", (ConstantPool) null, constantHTML0);
      byte[] byteArray0 = new byte[5];
      CodeException[] codeExceptionArray0 = new CodeException[9];
      Code code0 = new Code(20, (byte)86, (-1249), 2268, byteArray0, codeExceptionArray0, (Attribute[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        attributeHTML0.writeAttribute(code0, (String) null, 1241);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.AttributeHTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AttributeHTML attributeHTML0 = new AttributeHTML("1K,*'D", "}u@Yu!2#", constantPool0, (ConstantHTML) null);
      ConstantValue constantValue0 = new ConstantValue(165, 598, 8, constantPool0);
      attributeHTML0.writeAttribute(constantValue0, "1K,*'D", (-12));
      assertEquals(165, constantValue0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("K+bAs", "K+bAs", (ConstantPool) null, (ConstantHTML) null);
      int[] intArray0 = new int[3];
      ExceptionTable exceptionTable0 = new ExceptionTable((-977), (-527), intArray0, (ConstantPool) null);
      attributeHTML0.writeAttribute(exceptionTable0, "S802t}?", 870);
      assertEquals((byte)3, exceptionTable0.getTag());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("", "", (ConstantPool) null, (ConstantHTML) null);
      SourceFile sourceFile0 = new SourceFile((-1715), (-1715), (-1715), (ConstantPool) null);
      attributeHTML0.writeAttribute(sourceFile0, "");
      attributeHTML0.writeAttribute(sourceFile0, "org.apache.bcel.classfile.ArrayElementValue");
      assertEquals((-1715), sourceFile0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeHTML attributeHTML0 = new AttributeHTML("", "", (ConstantPool) null, (ConstantHTML) null);
      attributeHTML0.close();
  }
}
