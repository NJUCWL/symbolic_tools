/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 16:29:33 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvokeInstruction_ESTest extends InvokeInstruction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(203);
      iNVOKEDYNAMIC0.setOpcode((short)242);
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.accept(instConstraintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(0, 186);
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("jah)d!k-t-0_;3");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.toString(constantPool0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(254);
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.getClassName(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.InvokeInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = iNVOKEINTERFACE0.consumeStack(constantPoolGen0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(1341, 1341);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = iNVOKEINTERFACE0.consumeStack(constantPoolGen0);
      assertEquals(1341, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL();
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.toString(constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      Constant[] constantArray0 = new Constant[5];
      ConstantUtf8 constantUtf8_0 = ConstantUtf8.getInstance("M}z[a2rAjcNxY'R");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.toString(constantPool0);
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
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(3787);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.produceStack(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 3787. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      Constant[] constantArray0 = new Constant[2];
      ConstantString constantString0 = new ConstantString(295);
      constantArray0[0] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.produceStack(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantString cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      Constant[] constantArray0 = new Constant[2];
      ConstantString constantString0 = new ConstantString(295);
      constantArray0[0] = (Constant) constantString0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getType(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantString cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)83;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      iNVOKEINTERFACE0.initFromFile(byteSequence0, true);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getReturnType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 21248. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      Constant[] constantArray0 = new Constant[1];
      ConstantLong constantLong0 = new ConstantLong((-1930L));
      constantArray0[0] = (Constant) constantLong0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getReturnType(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantLong cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(730, 730);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getMethodName(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 730. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL();
      Constant[] constantArray0 = new Constant[2];
      ConstantMethodHandle constantMethodHandle0 = new ConstantMethodHandle((-1), (-1));
      constantArray0[0] = (Constant) constantMethodHandle0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getMethodName(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantMethodHandle cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(0);
      Constant[] constantArray0 = new Constant[1];
      ConstantInteger constantInteger0 = new ConstantInteger(0);
      constantArray0[0] = (Constant) constantInteger0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.getClassName(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantInteger cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.InvokeInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(3012);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.getArgumentTypes(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 3012. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(0);
      Constant[] constantArray0 = new Constant[2];
      ConstantUtf8 constantUtf8_0 = new ConstantUtf8("%u^pRMv$U");
      constantArray0[0] = (Constant) constantUtf8_0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getArgumentTypes(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantUtf8 cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL();
      Constant[] constantArray0 = new Constant[2];
      ConstantMethodType constantMethodType0 = new ConstantMethodType(182);
      constantArray0[0] = (Constant) constantMethodType0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.consumeStack(constantPoolGen0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.bcel.classfile.ConstantMethodType cannot be cast to org.apache.bcel.classfile.ConstantCP
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL();
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.consumeStack(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.consumeStack(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(4212);
      Constant[] constantArray0 = new Constant[7];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 4212. Constant pool size is: 7
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      INVOKESTATIC iNVOKESTATIC0 = new INVOKESTATIC(1970);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKESTATIC0.consumeStack(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1970. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(3787);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 3787. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(73);
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getMethodName(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL(0);
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getArgumentTypes(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      INVOKEDYNAMIC iNVOKEDYNAMIC0 = new INVOKEDYNAMIC(0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEDYNAMIC0.produceStack(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE(506, 506);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getClassName(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 506. Constant pool size is: 256
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getReturnType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldOrMethod", e);
      }
  }
}
