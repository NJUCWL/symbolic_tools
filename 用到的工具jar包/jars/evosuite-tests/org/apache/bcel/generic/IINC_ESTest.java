/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:32:27 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IINC;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IINC_ESTest extends IINC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IINC iINC0 = new IINC(132, 132);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-99);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      iINC0.initFromFile(byteSequence0, false);
      iINC0.toString(true);
      assertEquals(157, iINC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IINC iINC0 = new IINC();
      iINC0.setIncrement(127);
      assertEquals(127, iINC0.getIncrement());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IINC iINC0 = new IINC(255, 255);
      assertEquals(255, iINC0.getIncrement());
      assertEquals((short)132, iINC0.getOpcode());
      assertEquals(6, iINC0.getLength());
      assertEquals(255, iINC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IINC iINC0 = new IINC(5334, 0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      iINC0.dump(dataOutputStream0);
      assertEquals(6, pipedInputStream0.available());
      assertEquals(5334, iINC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IINC iINC0 = new IINC();
      int int0 = iINC0.getIncrement();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IINC iINC0 = new IINC(13, (-1704));
      int int0 = iINC0.getIncrement();
      assertEquals((-1704), int0);
      assertEquals(13, iINC0.getIndex());
      assertEquals(6, iINC0.getLength());
      assertEquals((short)132, iINC0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IINC iINC0 = new IINC();
      // Undeclared exception!
      try { 
        iINC0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IINC iINC0 = new IINC(132, 132);
      // Undeclared exception!
      try { 
        iINC0.initFromFile((ByteSequence) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.IINC", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IINC iINC0 = new IINC(0, 0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        iINC0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IINC iINC0 = new IINC(0, 0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        iINC0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IINC iINC0 = new IINC(0, 0);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        iINC0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IINC iINC0 = new IINC();
      // Undeclared exception!
      try { 
        iINC0.setIndex((byte) (-42));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -42
         //
         verifyException("org.apache.bcel.generic.IINC", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IINC iINC0 = new IINC(132, 132);
      byte[] byteArray0 = new byte[8];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      iINC0.initFromFile(byteSequence0, false);
      iINC0.setIndex(132);
      assertEquals(132, iINC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IINC iINC0 = new IINC(196, 196);
      byte[] byteArray0 = new byte[5];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      iINC0.initFromFile(byteSequence0, true);
      assertEquals(4, byteSequence0.getIndex());
      assertEquals((short)132, iINC0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IINC iINC0 = new IINC();
      byte[] byteArray0 = new byte[0];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        iINC0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IINC iINC0 = new IINC();
      MockPrintStream mockPrintStream0 = new MockPrintStream("L=|u");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      iINC0.dump(dataOutputStream0);
      assertEquals(1, iINC0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IINC iINC0 = new IINC(871, (byte)0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      iINC0.getType(constantPoolGen0);
      assertEquals(0, iINC0.getIncrement());
      assertEquals((short)132, iINC0.getOpcode());
      assertEquals(6, iINC0.getLength());
      assertEquals(871, iINC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IINC iINC0 = new IINC(196, 196);
      int int0 = iINC0.getIncrement();
      assertEquals((short)132, iINC0.getOpcode());
      assertEquals(196, int0);
      assertEquals(196, iINC0.getIndex());
      assertEquals(6, iINC0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IINC iINC0 = null;
      try {
        iINC0 = new IINC((byte) (-112), (byte) (-112));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -112
         //
         verifyException("org.apache.bcel.generic.IINC", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IINC iINC0 = new IINC();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      iINC0.accept(executionVisitor0);
      assertEquals((-1), iINC0.getIndex());
  }
}
