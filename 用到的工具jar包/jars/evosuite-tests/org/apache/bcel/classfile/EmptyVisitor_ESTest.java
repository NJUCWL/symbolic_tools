/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 21:01:08 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import org.apache.bcel.classfile.AnnotationDefault;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.BootstrapMethods;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInterfaceMethodref;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.ConstantValue;
import org.apache.bcel.classfile.Deprecated;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.EnclosingMethod;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.InnerClass;
import org.apache.bcel.classfile.InnerClasses;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LineNumber;
import org.apache.bcel.classfile.LineNumberTable;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.LocalVariableTable;
import org.apache.bcel.classfile.LocalVariableTypeTable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.MethodParameters;
import org.apache.bcel.classfile.ParameterAnnotationEntry;
import org.apache.bcel.classfile.ParameterAnnotations;
import org.apache.bcel.classfile.RuntimeInvisibleAnnotations;
import org.apache.bcel.classfile.Signature;
import org.apache.bcel.classfile.SourceFile;
import org.apache.bcel.classfile.StackMap;
import org.apache.bcel.classfile.StackMapEntry;
import org.apache.bcel.classfile.Synthetic;
import org.apache.bcel.classfile.Unknown;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyVisitor_ESTest extends EmptyVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      LineNumber lineNumber0 = new LineNumber((-1), (-1));
      emptyVisitor0.visitLineNumber(lineNumber0);
      assertEquals(65535, lineNumber0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantFloat constantFloat0 = new ConstantFloat((-2570.0F));
      emptyVisitor0.visitConstantFloat(constantFloat0);
      assertEquals((-2570.0F), constantFloat0.getBytes(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      Method method0 = new Method();
      emptyVisitor0.visitMethod(method0);
      assertFalse(method0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantString constantString0 = new ConstantString(0);
      emptyVisitor0.visitConstantString(constantString0);
      assertEquals(0, constantString0.getStringIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantNameAndType((ConstantNameAndType) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitJavaClass((JavaClass) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitAnnotationDefault((AnnotationDefault) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      byte[] byteArray0 = new byte[1];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Synthetic synthetic0 = new Synthetic(2315, 2315, byteArray0, constantPool0);
      emptyVisitor0.visitSynthetic(synthetic0);
      assertEquals(2315, synthetic0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitField((Field) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      LocalVariable[] localVariableArray0 = new LocalVariable[5];
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-997), 1845, localVariableArray0, (ConstantPool) null);
      emptyVisitor0.visitLocalVariableTypeTable(localVariableTypeTable0);
      assertEquals(1845, localVariableTypeTable0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitParameterAnnotation((ParameterAnnotations) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantClass constantClass0 = new ConstantClass((-1));
      emptyVisitor0.visitConstantClass(constantClass0);
      assertEquals((-1), constantClass0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitStackMap((StackMap) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitStackMapEntry((StackMapEntry) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      InnerClass innerClass0 = new InnerClass(0, 0, 147, (-483));
      emptyVisitor0.visitInnerClass(innerClass0);
      assertEquals(147, innerClass0.getInnerNameIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantUtf8((ConstantUtf8) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantLong constantLong0 = new ConstantLong(333L);
      emptyVisitor0.visitConstantLong(constantLong0);
      assertEquals((byte)5, constantLong0.getTag());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      RuntimeInvisibleAnnotations runtimeInvisibleAnnotations0 = new RuntimeInvisibleAnnotations(160, 160, dataInputStream0, (ConstantPool) null);
      emptyVisitor0.visitAnnotation(runtimeInvisibleAnnotations0);
      assertEquals(160, runtimeInvisibleAnnotations0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitDeprecated((Deprecated) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      byte[] byteArray0 = new byte[5];
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      Code code0 = new Code(96, 0, 1, 0, byteArray0, (CodeException[]) null, (Attribute[]) null, constantPool0);
      emptyVisitor0.visitCode(code0);
      assertEquals(17, code0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantDouble constantDouble0 = new ConstantDouble((-1014.45955963));
      emptyVisitor0.visitConstantDouble(constantDouble0);
      assertEquals((byte)6, constantDouble0.getTag());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitBootstrapMethods((BootstrapMethods) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitParameterAnnotationEntry((ParameterAnnotationEntry) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantFieldref constantFieldref0 = new ConstantFieldref(209, 263);
      emptyVisitor0.visitConstantFieldref(constantFieldref0);
      assertEquals(209, constantFieldref0.getClassIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitLineNumberTable((LineNumberTable) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitInnerClasses((InnerClasses) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      emptyVisitor0.visitConstantPool(constantPool0);
      assertEquals(2, constantPool0.getLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantInteger((ConstantInteger) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantInvokeDynamic((ConstantInvokeDynamic) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitLocalVariableTable((LocalVariableTable) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitSourceFile((SourceFile) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitMethodParameters((MethodParameters) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantInterfaceMethodref constantInterfaceMethodref0 = new ConstantInterfaceMethodref((-7), 452);
      emptyVisitor0.visitConstantInterfaceMethodref(constantInterfaceMethodref0);
      assertEquals(452, constantInterfaceMethodref0.getNameAndTypeIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitEnclosingMethod((EnclosingMethod) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(2315, 2315);
      emptyVisitor0.visitConstantMethodHandle(constantMethodHandle0);
      assertEquals(2315, constantMethodHandle0.getReferenceIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry((-2590), constantPool0, false);
      emptyVisitor0.visitAnnotationEntry(annotationEntry0);
      assertFalse(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitUnknown((Unknown) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantMethodType constantMethodType0 = new ConstantMethodType(0);
      emptyVisitor0.visitConstantMethodType(constantMethodType0);
      assertEquals((byte)16, constantMethodType0.getTag());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitSignature((Signature) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      int[] intArray0 = new int[0];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ExceptionTable exceptionTable0 = new ExceptionTable((-1239), (-1239), intArray0, constantPool0);
      emptyVisitor0.visitExceptionTable(exceptionTable0);
      assertEquals(0, exceptionTable0.getNumberOfExceptions());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      ConstantMethodref constantMethodref0 = new ConstantMethodref(1454, 0);
      emptyVisitor0.visitConstantMethodref(constantMethodref0);
      assertEquals(0, constantMethodref0.getNameAndTypeIndex());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitLocalVariable((LocalVariable) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      emptyVisitor0.visitConstantValue((ConstantValue) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      CodeException codeException0 = new CodeException((-884), (-884), (-2), 0);
      emptyVisitor0.visitCodeException(codeException0);
      assertEquals(0, codeException0.getCatchType());
  }
}
