/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:37:39 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.AnnotationElementValueGen;
import org.apache.bcel.generic.AnnotationEntryGen;
import org.apache.bcel.generic.ArrayElementValueGen;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ElementValueGen;
import org.apache.bcel.generic.ElementValuePairGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.SimpleElementValueGen;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationEntryGen_ESTest extends AnnotationEntryGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      List<AnnotationEntryGen>[] listArray0 = (List<AnnotationEntryGen>[]) Array.newInstance(List.class, 9);
      LinkedList<AnnotationEntryGen> linkedList0 = new LinkedList<AnnotationEntryGen>();
      listArray0[1] = (List<AnnotationEntryGen>) linkedList0;
      BasicType basicType0 = Type.BOOLEAN;
      LinkedList<ElementValuePairGen> linkedList1 = new LinkedList<ElementValuePairGen>();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(basicType0.THROWABLE, linkedList1, false, constantPoolGen0);
      linkedList0.add(annotationEntryGen0);
      AnnotationEntryGen.getParameterAnnotationAttributes(constantPoolGen0, listArray0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      List<AnnotationEntryGen>[] listArray0 = (List<AnnotationEntryGen>[]) Array.newInstance(List.class, 9);
      LinkedList<AnnotationEntryGen> linkedList0 = new LinkedList<AnnotationEntryGen>();
      listArray0[1] = (List<AnnotationEntryGen>) linkedList0;
      BasicType basicType0 = Type.BOOLEAN;
      LinkedList<ElementValuePairGen> linkedList1 = new LinkedList<ElementValuePairGen>();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(basicType0.THROWABLE, linkedList1, true, constantPoolGen0);
      linkedList0.add(annotationEntryGen0);
      AnnotationEntryGen.getParameterAnnotationAttributes(constantPoolGen0, listArray0);
      assertEquals(3, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      List<AnnotationEntryGen>[] listArray0 = (List<AnnotationEntryGen>[]) Array.newInstance(List.class, 9);
      LinkedList<AnnotationEntryGen> linkedList0 = new LinkedList<AnnotationEntryGen>();
      listArray0[1] = (List<AnnotationEntryGen>) linkedList0;
      Attribute[] attributeArray0 = AnnotationEntryGen.getParameterAnnotationAttributes(constantPoolGen0, listArray0);
      assertEquals(0, attributeArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-1);
      byteArray0[4] = (byte)62;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        AnnotationEntryGen.read(byteSequence0, constantPoolGen0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected element value kind in annotation: 0
         //
         verifyException("org.apache.bcel.generic.ElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, true);
      assertTrue(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      boolean boolean0 = annotationEntryGen0.isRuntimeVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      annotationEntryGen0.getValues();
      assertFalse(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectType objectType0 = ObjectType.getInstance("org.apache.bcel.generic.InstructionConstants");
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, true, constantPoolGen0);
      annotationEntryGen0.getTypeName();
      assertTrue(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      annotationEntryGen0.getTypeName();
      assertFalse(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectType objectType0 = new ObjectType("");
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, true, constantPoolGen0);
      int int0 = annotationEntryGen0.getTypeIndex();
      assertEquals(1, int0);
      assertTrue(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, true, constantPoolGen0);
      AnnotationEntry annotationEntry0 = annotationEntryGen0.getAnnotation();
      assertTrue(annotationEntry0.isRuntimeVisible());
      assertEquals(1, annotationEntry0.getAnnotationTypeIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(0, 0, constantPoolGen0);
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen("AnnotationGen:[Ljava/lang/StringBuffer; #0 {}]", simpleElementValueGen0, constantPoolGen0);
      annotationEntryGen0.addElementNameValuePair(elementValuePairGen0);
      // Undeclared exception!
      try { 
        annotationEntryGen0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValueGen class does not know how to stringify type 0
         //
         verifyException("org.apache.bcel.generic.SimpleElementValueGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      // Undeclared exception!
      try { 
        annotationEntryGen0.toShortString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.AnnotationEntryGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        AnnotationEntryGen.read(dataInputStream0, (ConstantPoolGen) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        AnnotationEntryGen.read(dataInputStream0, (ConstantPoolGen) null, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      try { 
        AnnotationEntryGen.read(dataInputStream0, constantPoolGen0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-56);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      // Undeclared exception!
      try { 
        annotationEntryGen0.getTypeSignature();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51200
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)7;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      // Undeclared exception!
      try { 
        annotationEntryGen0.getTypeName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1792
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      List<AnnotationEntryGen>[] listArray0 = (List<AnnotationEntryGen>[]) Array.newInstance(List.class, 9);
      LinkedList<AnnotationEntryGen> linkedList0 = new LinkedList<AnnotationEntryGen>();
      listArray0[0] = (List<AnnotationEntryGen>) linkedList0;
      linkedList0.add((AnnotationEntryGen) null);
      // Undeclared exception!
      try { 
        AnnotationEntryGen.getParameterAnnotationAttributes(constantPoolGen0, listArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, (List<ElementValuePairGen>) null, false, constantPoolGen0);
      MockFile mockFile0 = new MockFile("!s@2sWp'{JY)&8LjB/", "Field '");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        annotationEntryGen0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.AnnotationEntryGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, true, constantPoolGen0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        annotationEntryGen0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = null;
      try {
        annotationEntryGen0 = new AnnotationEntryGen((ObjectType) null, linkedList0, true, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.AnnotationEntryGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      ArrayElementValueGen arrayElementValueGen0 = new ArrayElementValueGen(constantPoolGen0);
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen((byte) (-105), arrayElementValueGen0, constantPoolGen0);
      annotationEntryGen0.addElementNameValuePair(elementValuePairGen0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0, 126);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      annotationEntryGen0.dump(dataOutputStream0);
      assertFalse(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      annotationEntryGen0.getTypeSignature();
      assertFalse(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, true, constantPoolGen0);
      boolean boolean0 = annotationEntryGen0.isRuntimeVisible();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      AnnotationEntryGen[] annotationEntryGenArray0 = new AnnotationEntryGen[5];
      annotationEntryGenArray0[0] = annotationEntryGen0;
      annotationEntryGenArray0[1] = annotationEntryGen0;
      annotationEntryGenArray0[2] = annotationEntryGen0;
      annotationEntryGenArray0[3] = annotationEntryGen0;
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen("@()", (ElementValueGen) null, constantPoolGen0);
      annotationEntryGenArray0[0].addElementNameValuePair(elementValuePairGen0);
      annotationEntryGenArray0[4] = annotationEntryGenArray0[2];
      // Undeclared exception!
      try { 
        AnnotationEntryGen.getAnnotationAttributes(constantPoolGen0, annotationEntryGenArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.ElementValuePairGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, true, constantPoolGen0);
      AnnotationEntryGen[] annotationEntryGenArray0 = new AnnotationEntryGen[6];
      annotationEntryGenArray0[0] = annotationEntryGen0;
      // Undeclared exception!
      try { 
        AnnotationEntryGen.getAnnotationAttributes(constantPoolGen0, annotationEntryGenArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.AnnotationEntryGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen[] annotationEntryGenArray0 = new AnnotationEntryGen[0];
      Attribute[] attributeArray0 = AnnotationEntryGen.getAnnotationAttributes(constantPoolGen0, annotationEntryGenArray0);
      assertEquals(0, attributeArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      AnnotationElementValueGen annotationElementValueGen0 = new AnnotationElementValueGen(annotationEntryGen0, constantPoolGen0);
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen(62316, annotationElementValueGen0, constantPoolGen0);
      linkedList0.add(elementValuePairGen0);
      // Undeclared exception!
      try { 
        annotationEntryGen0.toShortString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 62316
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      String string0 = annotationEntryGen0.toShortString();
      assertFalse(annotationEntryGen0.isRuntimeVisible());
      assertEquals("@Ljava/lang/Throwable;()", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ObjectType objectType0 = new ObjectType("");
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      ArrayElementValueGen arrayElementValueGen0 = new ArrayElementValueGen(constantPoolGen0);
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen((byte) (-105), arrayElementValueGen0, constantPoolGen0);
      annotationEntryGen0.addElementNameValuePair(elementValuePairGen0);
      List<ElementValuePairGen> list0 = annotationEntryGen0.getValues();
      AnnotationEntryGen annotationEntryGen1 = new AnnotationEntryGen(objectType0, list0, false, constantPoolGen0);
      // Undeclared exception!
      try { 
        annotationEntryGen1.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -105
         //
         verifyException("org.apache.bcel.generic.ConstantPoolGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      String string0 = annotationEntryGen0.toString();
      assertFalse(annotationEntryGen0.isRuntimeVisible());
      assertEquals("AnnotationGen:[Ljava/lang/Throwable; #0 {}]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      ArrayElementValueGen arrayElementValueGen0 = new ArrayElementValueGen(constantPoolGen0);
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen((byte) (-105), arrayElementValueGen0, constantPoolGen0);
      annotationEntryGen0.addElementNameValuePair(elementValuePairGen0);
      AnnotationEntryGen[] annotationEntryGenArray0 = new AnnotationEntryGen[6];
      annotationEntryGenArray0[0] = annotationEntryGen0;
      annotationEntryGenArray0[1] = annotationEntryGen0;
      annotationEntryGenArray0[2] = annotationEntryGen0;
      annotationEntryGenArray0[3] = annotationEntryGen0;
      annotationEntryGenArray0[4] = annotationEntryGen0;
      annotationEntryGenArray0[5] = annotationEntryGen0;
      AnnotationEntryGen.getAnnotationAttributes(constantPoolGen0, annotationEntryGenArray0);
      assertEquals(2, constantPoolGen0.getSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      ArrayElementValueGen arrayElementValueGen0 = new ArrayElementValueGen(constantPoolGen0);
      ElementValuePairGen elementValuePairGen0 = new ElementValuePairGen((byte)0, arrayElementValueGen0, constantPoolGen0);
      annotationEntryGen0.addElementNameValuePair(elementValuePairGen0);
      // Undeclared exception!
      try { 
        annotationEntryGen0.getAnnotation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, false, constantPoolGen0);
      AnnotationEntry annotationEntry0 = annotationEntryGen0.getAnnotation();
      assertEquals(1, annotationEntry0.getTypeIndex());
      assertFalse(annotationEntry0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(433, constantPool0, true);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      AnnotationEntryGen annotationEntryGen0 = null;
      try {
        annotationEntryGen0 = new AnnotationEntryGen(annotationEntry0, constantPoolGen0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 433. Constant pool size is: 2
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      AnnotationEntry annotationEntry0 = new AnnotationEntry(0, constantPool0, false);
      AnnotationEntryGen annotationEntryGen0 = null;
      try {
        annotationEntryGen0 = new AnnotationEntryGen(annotationEntry0, constantPoolGen0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.AnnotationEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      annotationEntryGen0.getValues();
      assertFalse(annotationEntryGen0.isRuntimeVisible());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      // Undeclared exception!
      try { 
        annotationEntryGen0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.AnnotationEntryGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = AnnotationEntryGen.read(byteSequence0, constantPoolGen0, false);
      int int0 = annotationEntryGen0.getTypeIndex();
      assertEquals(0, int0);
      assertFalse(annotationEntryGen0.isRuntimeVisible());
  }
}
