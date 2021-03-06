/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:45:49 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MULTIANEWARRAY_ESTest extends MULTIANEWARRAY_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(1868, (short)2988);
      String string0 = mULTIANEWARRAY0.toString(true);
      assertEquals("multianewarray[197](4) 1868 1868 2988", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)2358);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(2, (short)176);
      Constant[] constantArray0 = new Constant[5];
      ConstantDouble constantDouble0 = new ConstantDouble((short)176);
      constantArray0[2] = (Constant) constantDouble0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = mULTIANEWARRAY0.toString(constantPool0);
      assertEquals("multianewarray 176.0 176", string0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)841);
      short short0 = mULTIANEWARRAY0.getDimensions();
      assertEquals((short)841, short0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)841);
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-1);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      mULTIANEWARRAY0.initFromFile(byteSequence0, false);
      short short0 = mULTIANEWARRAY0.getDimensions();
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(8, (short)230);
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      int int0 = mULTIANEWARRAY0.consumeStack(constantPoolGen0);
      assertEquals(230, int0);
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)180);
      assertEquals((short)180, mULTIANEWARRAY0.getDimensions());
      
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-35);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      mULTIANEWARRAY0.initFromFile(byteSequence0, true);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = mULTIANEWARRAY0.consumeStack(constantPoolGen0);
      assertEquals((-35), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(true);
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
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)71;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      mULTIANEWARRAY0.initFromFile(byteSequence0, true);
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 18176. Constant pool size is: 7
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Constant[] constantArray0 = new Constant[4];
      ConstantFloat constantFloat0 = new ConstantFloat((byte) (-119));
      constantArray0[0] = (Constant) constantFloat0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      byte[] byteArray0 = new byte[1];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        mULTIANEWARRAY0.initFromFile(byteSequence0, true);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.getLoadClassType((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.dump((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.MULTIANEWARRAY", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY((short)715, (short)715);
      try { 
        mULTIANEWARRAY0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = null;
      try {
        mULTIANEWARRAY0 = new MULTIANEWARRAY(176, (short) (-166));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid dimensions value: -166
         //
         verifyException("org.apache.bcel.generic.MULTIANEWARRAY", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Class<?>[] classArray0 = mULTIANEWARRAY0.getExceptions();
      assertEquals(8, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      short short0 = mULTIANEWARRAY0.getDimensions();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.toString(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = mULTIANEWARRAY0.consumeStack(constantPoolGen0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY((short)715, (short)715);
      mULTIANEWARRAY0.dump(dataOutputStream0);
      assertEquals((short)715, mULTIANEWARRAY0.getDimensions());
      assertEquals(4, mULTIANEWARRAY0.getLength());
  }
}
