/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 15:46:14 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.NEWARRAY;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NEWARRAY_ESTest extends NEWARRAY_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      NEWARRAY nEWARRAY0 = new NEWARRAY(basicType0);
      byte byte0 = nEWARRAY0.getTypecode();
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY((byte) (-70));
      byte byte0 = nEWARRAY0.getTypecode();
      assertEquals((byte) (-70), byte0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      Instruction instruction0 = Instruction.readInstruction(byteSequence0);
      // Undeclared exception!
      try { 
        instruction0.toString(true);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      // Undeclared exception!
      try { 
        nEWARRAY0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY((byte) (-70));
      // Undeclared exception!
      try { 
        nEWARRAY0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.NEWARRAY", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicType basicType0 = Type.CHAR;
      NEWARRAY nEWARRAY0 = new NEWARRAY(basicType0);
      byte[] byteArray0 = new byte[5];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.readShort();
      byteSequence0.readByte();
      nEWARRAY0.initFromFile(byteSequence0, false);
      nEWARRAY0.initFromFile(byteSequence0, false);
      try { 
        nEWARRAY0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicType basicType0 = Type.DOUBLE;
      NEWARRAY nEWARRAY0 = new NEWARRAY(basicType0);
      MockFile mockFile0 = new MockFile(" ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.close();
      try { 
        nEWARRAY0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        nEWARRAY0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NEWARRAY nEWARRAY0 = null;
      try {
        nEWARRAY0 = new NEWARRAY((BasicType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.NEWARRAY", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY((byte)0);
      // Undeclared exception!
      try { 
        nEWARRAY0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.NEWARRAY", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      byte byte0 = nEWARRAY0.getTypecode();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      Class<?>[] classArray0 = nEWARRAY0.getExceptions();
      assertEquals(1, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicType basicType0 = Type.CHAR;
      NEWARRAY nEWARRAY0 = new NEWARRAY(basicType0);
      String string0 = nEWARRAY0.toString(false);
      assertEquals("newarray char", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      NEWARRAY nEWARRAY0 = new NEWARRAY(basicType0);
      nEWARRAY0.getType();
      assertEquals((byte)4, nEWARRAY0.getTypecode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      // Undeclared exception!
      try { 
        nEWARRAY0.getType();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid type: 0
         //
         verifyException("org.apache.bcel.generic.BasicType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        nEWARRAY0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NEWARRAY nEWARRAY0 = new NEWARRAY();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      nEWARRAY0.dump(dataOutputStream0);
      assertEquals((short) (-1), nEWARRAY0.getOpcode());
  }
}
