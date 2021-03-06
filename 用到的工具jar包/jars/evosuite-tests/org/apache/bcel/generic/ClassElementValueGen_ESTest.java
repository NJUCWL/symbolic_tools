/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 16:41:09 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ClassElementValueGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ElementValueGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassElementValueGen_ESTest extends ClassElementValueGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.stringifyValue();
      assertEquals("Ljava/lang/StringBuffer;", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(0, (ConstantPoolGen) null);
      int int0 = classElementValueGen0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-579), constantPoolGen0);
      int int0 = classElementValueGen0.getIndex();
      assertEquals((-579), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectType objectType0 = new ObjectType("O,3D{2.+~uo3");
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.getClassString();
      assertEquals("LO,3D{2/+~uo3;", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      String string0 = classElementValueGen0.getClassString();
      assertEquals("Ljava/lang/StringBuffer;", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.addClass("filename\t\t");
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(2, constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.stringifyValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantClass cannot be cast to org.apache.bcel.classfile.ConstantUtf8
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(1635, constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.stringifyValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1635
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(1582, (ConstantPoolGen) null);
      // Undeclared exception!
      try { 
        classElementValueGen0.getElementValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(126, constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.getClassString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantInteger constantInteger0 = new ConstantInteger(0);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue(1, 0, constantPool0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(classElementValue0, constantPoolGen0, false);
      // Undeclared exception!
      try { 
        classElementValueGen0.getClassString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantInteger cannot be cast to org.apache.bcel.classfile.ConstantUtf8
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((-72), (-72), constantPool0);
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(classElementValue0, (ConstantPoolGen) null, false);
      // Undeclared exception!
      try { 
        classElementValueGen0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      ClassElementValueGen classElementValueGen0 = null;
      try {
        classElementValueGen0 = new ClassElementValueGen(objectType0, (ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue((-3341), (-3341), (ConstantPool) null);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = null;
      try {
        classElementValueGen0 = new ClassElementValueGen(classElementValue0, constantPoolGen0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ClassElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(91, constantPoolGen0);
      ClassElementValue classElementValue0 = (ClassElementValue)classElementValueGen0.getElementValue();
      ClassElementValueGen classElementValueGen1 = null;
      try {
        classElementValueGen1 = new ClassElementValueGen(classElementValue0, constantPoolGen0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 91 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(2, constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.stringifyValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ClassElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(2, constantPoolGen0);
      int int0 = classElementValueGen0.getIndex();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-1867), constantPoolGen0);
      // Undeclared exception!
      try { 
        classElementValueGen0.getClassString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1867
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen((-1867), constantPoolGen0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      classElementValueGen0.dump(dataOutputStream0);
      assertEquals("c\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassElementValueGen classElementValueGen0 = new ClassElementValueGen(objectType0, constantPoolGen0);
      assertEquals(101, ElementValueGen.ENUM_CONSTANT);
  }
}
