/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:58:30 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.OutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.ANEWARRAY;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GETFIELD;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.INSTANCEOF;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.NEW;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.util.ByteSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CPInstruction_ESTest extends CPInstruction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC();
      byte[] byteArray0 = new byte[6];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      iNVOKEDYNAMIC0.initFromFile(byteSequence0, true);
      assertEquals(0, iNVOKEDYNAMIC0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ANEWARRAY aNEWARRAY0 = new ANEWARRAY();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        aNEWARRAY0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 0 is null.
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(74, 74);
      String string0 = iNVOKEINTERFACE0.toString(true);
      assertEquals("invokeinterface[185](5) 74", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)7);
      int int0 = mULTIANEWARRAY0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      mULTIANEWARRAY0.index = (-2769);
      int int0 = mULTIANEWARRAY0.getIndex();
      assertEquals((-2769), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ANEWARRAY aNEWARRAY0 = new ANEWARRAY();
      byte[] byteArray0 = new byte[5];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPool constantPool0 = new ConstantPool(byteSequence0);
      // Undeclared exception!
      try { 
        aNEWARRAY0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 0. Constant pool size is: 0
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF(0);
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNSTANCEOF0.toString(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      INSTANCEOF iNSTANCEOF0 = new INSTANCEOF();
      byte[] byteArray0 = new byte[0];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        iNSTANCEOF0.initFromFile(byteSequence0, true);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.getType((ConstantPoolGen) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GETSTATIC gETSTATIC0 = new GETSTATIC(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        gETSTATIC0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(0, (short)7);
      mULTIANEWARRAY0.setIndex(0);
      assertEquals(0, mULTIANEWARRAY0.getIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PUTSTATIC pUTSTATIC0 = new PUTSTATIC(77);
      int int0 = pUTSTATIC0.getIndex();
      assertEquals(77, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.setIndex((-3366));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Negative index value: -3366
         //
         verifyException("org.apache.bcel.generic.CPInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GETFIELD gETFIELD0 = new GETFIELD();
      MockPrintStream mockPrintStream0 = new MockPrintStream("_t**h.r3Ye7N|Mp37'5");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      gETFIELD0.dump(dataOutputStream0);
      assertEquals(0, gETFIELD0.getIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NEW nEW0 = new NEW();
      // Undeclared exception!
      try { 
        nEW0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
