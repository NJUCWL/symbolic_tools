/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:46:47 GMT 2021
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
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Visitor;
import org.apache.bcel.util.ClassLoaderRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantMethodref_ESTest extends ConstantMethodref_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-1624), (-1624));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      DescendingVisitor descendingVisitor0 = new DescendingVisitor(javaClass0, emptyVisitor0);
      constantMethodref0.accept(descendingVisitor0);
      assertEquals((-1624), constantMethodref0.getClassIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)1);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      pushbackInputStream0.close();
      ConstantMethodref constantMethodref0 = null;
      try {
        constantMethodref0 = new ConstantMethodref(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ConstantMethodref constantMethodref0 = null;
      try {
        constantMethodref0 = new ConstantMethodref(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantMethodref constantMethodref0 = new ConstantMethodref(93, 93);
      ConstantMethodref constantMethodref1 = new ConstantMethodref(constantMethodref0);
      assertEquals(93, constantMethodref1.getNameAndTypeIndex());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, (byte)65);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      ConstantMethodref constantMethodref0 = new ConstantMethodref(dataInputStream0);
      assertEquals(0, constantMethodref0.getNameAndTypeIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstantMethodref constantMethodref0 = null;
      try {
        constantMethodref0 = new ConstantMethodref((ConstantMethodref) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodref", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstantMethodref constantMethodref0 = new ConstantMethodref((-2733), (-2733));
      // Undeclared exception!
      try { 
        constantMethodref0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantMethodref", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConstantMethodref constantMethodref0 = null;
      try {
        constantMethodref0 = new ConstantMethodref((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantCP", e);
      }
  }
}
