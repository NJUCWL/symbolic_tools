/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:47:59 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.LocalVariableTypeTable;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalVariableTypeTable_ESTest extends LocalVariableTypeTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[3];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(480, 783, localVariableArray0, constantPool0);
      int int0 = localVariableTypeTable0.getTableLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-770), (-770), (LocalVariable[]) null, (ConstantPool) null);
      LocalVariable[] localVariableArray0 = localVariableTypeTable0.getLocalVariableTypeTable();
      assertNull(localVariableArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[3];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-354), 225, localVariableArray0, constantPool0);
      LocalVariable[] localVariableArray1 = localVariableTypeTable0.getLocalVariableTypeTable();
      assertSame(localVariableArray1, localVariableArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariable localVariable0 = new LocalVariable(72, 72, 2243, 10, (-3256), (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(72, 10, localVariableArray0, (ConstantPool) null);
      Attribute attribute0 = localVariableTypeTable0.copy((ConstantPool) null);
      assertNotSame(attribute0, localVariableTypeTable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariable localVariable0 = new LocalVariable((-1), (-1), 2243, 0, (-3256), (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-1), (-1), localVariableArray0, (ConstantPool) null);
      Attribute attribute0 = localVariableTypeTable0.copy((ConstantPool) null);
      assertNotSame(attribute0, localVariableTypeTable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-770), (-770), (LocalVariable[]) null, (ConstantPool) null);
      // Undeclared exception!
      try { 
        localVariableTypeTable0.getLocalVariable(528);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[3];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(480, 783, localVariableArray0, constantPool0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("zqt$~!Jqf;12Cuoa");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        localVariableTypeTable0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      LocalVariable[] localVariableArray0 = new LocalVariable[3];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(480, 783, localVariableArray0, constantPool0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("zqt$~!Jqf;12Cuoa");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        localVariableTypeTable0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[3];
      Constant[] constantArray0 = new Constant[4];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(480, 783, localVariableArray0, constantPool0);
      // Undeclared exception!
      try { 
        localVariableTypeTable0.copy(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[3];
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(480, 783, localVariableArray0, constantPool0);
      // Undeclared exception!
      try { 
        localVariableTypeTable0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalVariableTypeTable localVariableTypeTable0 = null;
      try {
        localVariableTypeTable0 = new LocalVariableTypeTable((LocalVariableTypeTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      LocalVariableTypeTable localVariableTypeTable0 = null;
      try {
        localVariableTypeTable0 = new LocalVariableTypeTable(0, 10, (DataInput) null, constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-120), 2141);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      LocalVariableTypeTable localVariableTypeTable0 = null;
      try {
        localVariableTypeTable0 = new LocalVariableTypeTable(2141, 2141, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -120
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 266, (-822));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      pushbackInputStream0.close();
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      LocalVariableTypeTable localVariableTypeTable0 = null;
      try {
        localVariableTypeTable0 = new LocalVariableTypeTable(0, 0, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      LocalVariableTypeTable localVariableTypeTable0 = null;
      try {
        localVariableTypeTable0 = new LocalVariableTypeTable((-1683), 60, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-770), (-770), (LocalVariable[]) null, (ConstantPool) null);
      int int0 = localVariableTypeTable0.getTableLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-1), 10, localVariableArray0, (ConstantPool) null);
      // Undeclared exception!
      try { 
        localVariableTypeTable0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.LocalVariableTypeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[0];
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(213, 213, localVariableArray0, (ConstantPool) null);
      String string0 = localVariableTypeTable0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariable localVariable0 = new LocalVariable((-1), (-1), (-1), 0, 0, (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-1), 10, localVariableArray0, (ConstantPool) null);
      LocalVariable localVariable1 = localVariableTypeTable0.getLocalVariable(0);
      assertEquals(0, localVariable1.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariable localVariable0 = new LocalVariable((-1), (-1), 2243, 0, (-1), (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-1), 10, localVariableArray0, (ConstantPool) null);
      LocalVariable localVariable1 = localVariableTypeTable0.getLocalVariable(0);
      assertNull(localVariable1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariable localVariable0 = new LocalVariable((-1), (-1), 2243, 0, (-1), (ConstantPool) null);
      localVariableArray0[0] = localVariable0;
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-1), 10, localVariableArray0, (ConstantPool) null);
      MockFile mockFile0 = new MockFile("mWY", "mWY");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      localVariableTypeTable0.dump(dataOutputStream0);
      assertEquals(18L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[1];
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable((-1), 10, localVariableArray0, (ConstantPool) null);
      LocalVariableTypeTable localVariableTypeTable1 = new LocalVariableTypeTable(localVariableTypeTable0);
      assertFalse(localVariableTypeTable1.equals((Object)localVariableTypeTable0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalVariable[] localVariableArray0 = new LocalVariable[0];
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(10, (-770), localVariableArray0, constantPool0);
      LocalVariable[] localVariableArray1 = localVariableTypeTable0.getLocalVariableTypeTable();
      assertSame(localVariableArray0, localVariableArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(2423, 641, (LocalVariable[]) null, (ConstantPool) null);
      localVariableTypeTable0.setLocalVariableTable((LocalVariable[]) null);
      assertEquals(0, localVariableTypeTable0.getTableLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalVariableTypeTable localVariableTypeTable0 = new LocalVariableTypeTable(2423, 641, (LocalVariable[]) null, (ConstantPool) null);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      localVariableTypeTable0.accept(emptyVisitor0);
      assertEquals(641, localVariableTypeTable0.getLength());
  }
}
