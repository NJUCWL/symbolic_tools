/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 15:34:12 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.AALOAD;
import org.apache.bcel.generic.AASTORE;
import org.apache.bcel.generic.BALOAD;
import org.apache.bcel.generic.BASTORE;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.CASTORE;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DALOAD;
import org.apache.bcel.generic.DASTORE;
import org.apache.bcel.generic.FALOAD;
import org.apache.bcel.generic.FASTORE;
import org.apache.bcel.generic.IALOAD;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.LALOAD;
import org.apache.bcel.generic.LASTORE;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.SALOAD;
import org.apache.bcel.generic.SASTORE;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayInstruction_ESTest extends ArrayInstruction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SASTORE sASTORE0 = new SASTORE();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = sASTORE0.getType(constantPoolGen0);
      assertEquals("S", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CASTORE cASTORE0 = new CASTORE();
      Type type0 = cASTORE0.getType((ConstantPoolGen) null);
      assertEquals((byte)5, type0.getType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BASTORE bASTORE0 = new BASTORE();
      Constant[] constantArray0 = new Constant[7];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = bASTORE0.getType(constantPoolGen0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AASTORE aASTORE0 = new AASTORE();
      Constant[] constantArray0 = new Constant[10];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      ObjectType objectType0 = (ObjectType)aASTORE0.getType(constantPoolGen0);
      assertEquals("java.lang.Object", objectType0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DASTORE dASTORE0 = new DASTORE();
      Type type0 = dASTORE0.getType((ConstantPoolGen) null);
      assertEquals(2, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FASTORE fASTORE0 = new FASTORE();
      Type type0 = fASTORE0.getType(constantPoolGen0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LASTORE lASTORE0 = new LASTORE();
      byte[] byteArray0 = new byte[9];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPool constantPool0 = new ConstantPool(byteSequence0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Type type0 = lASTORE0.getType(constantPoolGen0);
      assertEquals("J", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SASTORE sASTORE0 = new SASTORE();
      sASTORE0.setOpcode((short)77);
      // Undeclared exception!
      try { 
        sASTORE0.getType((ConstantPoolGen) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: unknown case in switch77
         //
         verifyException("org.apache.bcel.generic.ArrayInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SASTORE sASTORE0 = new SASTORE();
      sASTORE0.setOpcode((short)68);
      // Undeclared exception!
      try { 
        sASTORE0.getType((ConstantPoolGen) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: unknown case in switch68
         //
         verifyException("org.apache.bcel.generic.ArrayInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SASTORE sASTORE0 = new SASTORE();
      sASTORE0.setOpcode((short)66);
      // Undeclared exception!
      try { 
        sASTORE0.getType((ConstantPoolGen) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: unknown case in switch66
         //
         verifyException("org.apache.bcel.generic.ArrayInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AASTORE aASTORE0 = new AASTORE();
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      aASTORE0.setOpcode((short)65);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      // Undeclared exception!
      try { 
        aASTORE0.getType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: unknown case in switch65
         //
         verifyException("org.apache.bcel.generic.ArrayInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IASTORE iASTORE0 = (IASTORE)InstructionConstants.IASTORE;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte)112;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)57;
      byteArray0[4] = (byte)105;
      byteArray0[5] = (byte)119;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-1);
      iASTORE0.toString(false);
      iASTORE0.getType((ConstantPoolGen) null);
      SASTORE sASTORE0 = new SASTORE();
      sASTORE0.setOpcode(byteArray0[5]);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        sASTORE0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SASTORE sASTORE0 = new SASTORE();
      sASTORE0.setOpcode((short)56);
      // Undeclared exception!
      try { 
        sASTORE0.getType((ConstantPoolGen) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: unknown case in switch56
         //
         verifyException("org.apache.bcel.generic.ArrayInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SASTORE sASTORE0 = new SASTORE();
      sASTORE0.setOpcode((short)55);
      // Undeclared exception!
      try { 
        sASTORE0.getType((ConstantPoolGen) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: unknown case in switch55
         //
         verifyException("org.apache.bcel.generic.ArrayInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IASTORE iASTORE0 = (IASTORE)InstructionConstants.IASTORE;
      Type type0 = iASTORE0.getType((ConstantPoolGen) null);
      assertEquals((byte)10, type0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SALOAD sALOAD0 = new SALOAD();
      Type type0 = sALOAD0.getType((ConstantPoolGen) null);
      assertEquals((byte)9, type0.getType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BALOAD bALOAD0 = new BALOAD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = bALOAD0.getType(constantPoolGen0);
      assertEquals((byte)8, type0.getType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AALOAD aALOAD0 = new AALOAD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = aALOAD0.getType(constantPoolGen0);
      assertEquals((byte)14, type0.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DALOAD dALOAD0 = new DALOAD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = dALOAD0.getType(constantPoolGen0);
      assertEquals("D", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FALOAD fALOAD0 = new FALOAD();
      Type type0 = fALOAD0.getType((ConstantPoolGen) null);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      LALOAD lALOAD0 = new LALOAD();
      Type type0 = lALOAD0.getType(constantPoolGen0);
      assertEquals((byte)11, type0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CALOAD cALOAD0 = new CALOAD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = cALOAD0.getType(constantPoolGen0);
      assertEquals("C", type0.getSignature());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IALOAD iALOAD0 = new IALOAD();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = iALOAD0.getType(constantPoolGen0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AASTORE aASTORE0 = new AASTORE();
      Class<?>[] classArray0 = aASTORE0.getExceptions();
      assertEquals(2, classArray0.length);
  }
}
