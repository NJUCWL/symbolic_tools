/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:24:56 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ElementValue;
import org.apache.bcel.classfile.SimpleElementValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElementValue_ESTest extends ElementValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      ClassElementValue classElementValue0 = new ClassElementValue(3769, 0, (ConstantPool) null);
      classElementValue0.dump(dataOutputStream0);
      assertEquals("\uFFFD\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(3769, classElementValue0.getElementValueType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(0, 0, (ConstantPool) null);
      int int0 = simpleElementValue0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleElementValue simpleElementValue0 = new SimpleElementValue((-1339), (-1339), (ConstantPool) null);
      int int0 = simpleElementValue0.getType();
      assertEquals((-1339), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue(203, 203, (ConstantPool) null);
      int int0 = classElementValue0.getElementValueType();
      assertEquals(203, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue((-13), (-13), (ConstantPool) null);
      int int0 = classElementValue0.getElementValueType();
      assertEquals((-13), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(91, 0, (ConstantPool) null);
      simpleElementValue0.getConstantPool();
      assertEquals(91, simpleElementValue0.getElementValueType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue((-683), (-683), (ConstantPool) null);
      // Undeclared exception!
      try { 
        classElementValue0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ClassElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((byte)61, (-678), constantPool0);
      // Undeclared exception!
      try { 
        classElementValue0.toShortString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -678. Constant pool size is: 2
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(91, 0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        simpleElementValue0.toShortString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValue class does not know how to stringify type 91
         //
         verifyException("org.apache.bcel.classfile.SimpleElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      SimpleElementValue simpleElementValue0 = new SimpleElementValue((byte) (-6), (byte) (-6), constantPool0);
      // Undeclared exception!
      try { 
        simpleElementValue0.stringifyValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValue class does not know how to stringify type -6
         //
         verifyException("org.apache.bcel.classfile.SimpleElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue(0, 0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        classElementValue0.stringifyValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ClassElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ElementValue.readElementValue((DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        ElementValue.readElementValue(dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        ElementValue.readElementValue(dataInputStream0, constantPool0);
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
      SimpleElementValue simpleElementValue0 = new SimpleElementValue(0, 0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        simpleElementValue0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValue class does not know how to stringify type 0
         //
         verifyException("org.apache.bcel.classfile.SimpleElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ClassElementValue classElementValue0 = new ClassElementValue((byte) (-6), (byte) (-6), constantPool0);
      // Undeclared exception!
      try { 
        classElementValue0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -6. Constant pool size is: 2
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassElementValue classElementValue0 = new ClassElementValue(0, 0, (ConstantPool) null);
      int int0 = classElementValue0.getElementValueType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      ClassElementValue classElementValue0 = new ClassElementValue((-12), (-12), constantPool0);
      // Undeclared exception!
      try { 
        classElementValue0.toShortString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
