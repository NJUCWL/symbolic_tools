/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 17:44:39 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LDC_W;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LDC_ESTest extends LDC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(0);
      Constant[] constantArray0 = new Constant[2];
      ConstantString constantString0 = new ConstantString(90);
      constantArray0[0] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC_W0.getValue(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LDC lDC0 = new LDC(1543);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1543);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      lDC0.dump(dataOutputStream0);
      assertEquals(3, byteArrayOutputStream0.size());
      assertEquals("\u0013\u0006\u0007", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(0);
      lDC_W0.setSize();
      assertEquals((short)18, lDC_W0.getOpcode());
      assertEquals(0, lDC_W0.getIndex());
      assertEquals(2, lDC_W0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LDC lDC0 = new LDC();
      byte[] byteArray0 = new byte[2];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      lDC0.initFromFile(byteSequence0, true);
      assertEquals(2, lDC0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[1];
      ConstantClass constantClass0 = new ConstantClass((byte) (-81));
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      constantClass0.setNameIndex(1);
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LDC lDC0 = new LDC(211);
      // Undeclared exception!
      try { 
        lDC0.setIndex((-982));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -982
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LDC lDC0 = new LDC(255);
      byte[] byteArray0 = new byte[1];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.skipBytes(755);
      try { 
        lDC0.initFromFile(byteSequence0, true);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(2398);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC_W0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 2398. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LDC lDC0 = new LDC(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      // Undeclared exception!
      try { 
        lDC_W0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(1392);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        lDC_W0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        lDC_W0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LDC lDC0 = null;
      try {
        lDC0 = new LDC((-281));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -281
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LDC lDC0 = new LDC(0);
      Constant[] constantArray0 = new Constant[1];
      ConstantNameAndType constantNameAndType0 = new ConstantNameAndType(0, 0);
      constantArray0[0] = (Constant) constantNameAndType0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[2];
      ConstantString constantString0 = new ConstantString((byte) (-74));
      constantArray0[0] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ObjectType objectType0 = (ObjectType)lDC_W0.getType(constantPoolGen0);
      assertEquals("java.lang.String", objectType0.getClassName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[1];
      ConstantClass constantClass0 = new ConstantClass((byte) (-81));
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lDC_W0.getType(constantPoolGen0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[18];
      lDC0.setIndex(1);
      ConstantDouble constantDouble0 = new ConstantDouble(1);
      constantArray0[1] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown or invalid constant type at 1
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LDC lDC0 = new LDC(0);
      Constant[] constantArray0 = new Constant[4];
      ConstantLong constantLong0 = new ConstantLong(0);
      constantArray0[0] = (Constant) constantLong0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        lDC0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[1];
      ConstantFloat constantFloat0 = new ConstantFloat(518);
      constantArray0[0] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lDC0.getType(constantPoolGen0);
      assertEquals("F", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[1];
      ConstantInteger constantInteger0 = new ConstantInteger(255);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = lDC_W0.getType(constantPoolGen0);
      assertEquals((byte)10, type0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[1];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle(1, 1);
      constantArray0[0] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(0);
      Constant[] constantArray0 = new Constant[2];
      ConstantString constantString0 = new ConstantString((byte)0);
      constantArray0[0] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC_W0.getValue(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantString cannot be cast to org.apache.bcel.classfile.ConstantUtf8
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[1];
      ConstantClass constantClass0 = new ConstantClass((byte) (-81));
      constantArray0[0] = (Constant) constantClass0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC_W0.getValue(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -81. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[18];
      lDC0.setIndex(1);
      ConstantDouble constantDouble0 = new ConstantDouble(1);
      constantArray0[1] = (Constant) constantDouble0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown or invalid constant type at 1
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[1];
      ConstantLong constantLong0 = new ConstantLong(0L);
      constantArray0[0] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        lDC0.getValue(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown or invalid constant type at 0
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LDC lDC0 = new LDC();
      Constant[] constantArray0 = new Constant[1];
      ConstantFloat constantFloat0 = new ConstantFloat(518);
      constantArray0[0] = (Constant) constantFloat0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Object object0 = lDC0.getValue(constantPoolGen0);
      assertEquals(518.0F, object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W();
      Constant[] constantArray0 = new Constant[1];
      ConstantInteger constantInteger0 = new ConstantInteger(255);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Object object0 = lDC_W0.getValue(constantPoolGen0);
      assertEquals(255, object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.bcel.generic.LDC");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lDC_W0.dump(dataOutputStream0);
      assertEquals(0, lDC_W0.getIndex());
      assertEquals(2, lDC_W0.getLength());
      assertEquals((short)18, lDC_W0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LDC lDC0 = new LDC();
      MockPrintStream mockPrintStream0 = new MockPrintStream("J^<lo [hL ^m@,.50");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lDC0.dump(dataOutputStream0);
      assertEquals(1, lDC0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LDC lDC0 = new LDC(163);
      // Undeclared exception!
      try { 
        lDC0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LDC", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LDC_W lDC_W0 = new LDC_W(1392);
      Class<?>[] classArray0 = lDC_W0.getExceptions();
      assertEquals(0, classArray0.length);
      assertEquals((short)19, lDC_W0.getOpcode());
      assertEquals(3, lDC_W0.getLength());
      assertEquals(1392, lDC_W0.getIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LDC lDC0 = new LDC(145);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        lDC0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }
}
