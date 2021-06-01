/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 20:18:51 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantInvokeDynamic_ESTest extends ConstantInvokeDynamic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(0, 0);
      int int0 = constantInvokeDynamic0.getBootstrapMethodAttrIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-559), 77);
      int int0 = constantInvokeDynamic0.getBootstrapMethodAttrIndex();
      assertEquals((-559), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(1096, 5326);
      // Undeclared exception!
      try { 
        constantInvokeDynamic0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantInvokeDynamic", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = null;
      try {
        constantInvokeDynamic0 = new ConstantInvokeDynamic((ConstantInvokeDynamic) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantInvokeDynamic", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 2475);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantInvokeDynamic constantInvokeDynamic0 = null;
      try {
        constantInvokeDynamic0 = new ConstantInvokeDynamic(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ConstantInvokeDynamic constantInvokeDynamic0 = null;
      try {
        constantInvokeDynamic0 = new ConstantInvokeDynamic(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ConstantInvokeDynamic constantInvokeDynamic0 = null;
      try {
        constantInvokeDynamic0 = new ConstantInvokeDynamic(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(dataInputStream0);
      assertEquals(0, constantInvokeDynamic0.getClassIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic(1096, 5326);
      int int0 = constantInvokeDynamic0.getBootstrapMethodAttrIndex();
      assertEquals(1096, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-2244), (-2244));
      String string0 = constantInvokeDynamic0.toString();
      assertEquals("CONSTANT_InvokeDynamic[18](bootstrap_method_attr_index = -2244, name_and_type_index = -2244)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-2244), (-2244));
      ConstantInvokeDynamic constantInvokeDynamic1 = new ConstantInvokeDynamic(constantInvokeDynamic0);
      assertEquals((-2244), constantInvokeDynamic1.getClassIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = new ConstantInvokeDynamic((-2244), (-2244));
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      constantInvokeDynamic0.accept(emptyVisitor0);
      assertEquals((-2244), constantInvokeDynamic0.getNameAndTypeIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantInvokeDynamic constantInvokeDynamic0 = null;
      try {
        constantInvokeDynamic0 = new ConstantInvokeDynamic((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantInvokeDynamic", e);
      }
  }
}
