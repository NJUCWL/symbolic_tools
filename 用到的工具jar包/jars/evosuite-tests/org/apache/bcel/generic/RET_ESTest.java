/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 17:55:02 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RET_ESTest extends RET_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RET rET0 = new RET(1235);
      String string0 = rET0.toString(true);
      assertEquals("ret[169](4) 1235", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RET rET0 = new RET(1235);
      int int0 = rET0.getIndex();
      assertEquals(4, rET0.getLength());
      assertEquals(1235, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RET rET0 = new RET();
      // Undeclared exception!
      try { 
        rET0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RET rET0 = new RET(604);
      byte[] byteArray0 = new byte[1];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        rET0.initFromFile(byteSequence0, true);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RET rET0 = new RET(255);
      // Undeclared exception!
      try { 
        rET0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RET rET0 = new RET(0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        rET0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RET rET0 = new RET();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        rET0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.InstConstraintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RET rET0 = new RET();
      // Undeclared exception!
      try { 
        rET0.setIndex((-1823));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -1823
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RET rET0 = null;
      try {
        rET0 = new RET((-19));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -19
         //
         verifyException("org.apache.bcel.generic.RET", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RET rET0 = new RET();
      rET0.setIndex(0);
      assertEquals(2, rET0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RET rET0 = new RET();
      byte[] byteArray0 = new byte[14];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      rET0.initFromFile(byteSequence0, true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("es*$.P]W_5*IAIV6#");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      rET0.dump(dataOutputStream0);
      assertEquals(4, rET0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RET rET0 = new RET();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      rET0.dump(dataOutputStream0);
      assertEquals("\uFFFD\u0000", byteArrayOutputStream0.toString());
      assertEquals(2, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RET rET0 = new RET();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      rET0.accept(executionVisitor0);
      assertEquals(1, rET0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RET rET0 = new RET();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = rET0.getType(constantPoolGen0);
      assertEquals("<return address>", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RET rET0 = new RET();
      int int0 = rET0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RET rET0 = new RET(506);
      byte[] byteArray0 = new byte[4];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      rET0.initFromFile(byteSequence0, false);
      assertEquals(1, byteSequence0.getIndex());
      assertEquals(2, rET0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RET rET0 = new RET();
      // Undeclared exception!
      try { 
        rET0.toString(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
