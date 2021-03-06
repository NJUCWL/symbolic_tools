/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:20:21 GMT 2021
 */

package org.apache.bcel.verifier.statics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.statics.LocalVariableInfo;
import org.apache.bcel.verifier.statics.LocalVariablesInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalVariablesInfo_ESTest extends LocalVariablesInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(1139);
      BasicType basicType0 = Type.LONG;
      localVariablesInfo0.add(0, "", 4162, 4205, basicType0);
      assertEquals("J", basicType0.getSignature());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(2693);
      DADD dADD0 = new DADD();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dADD0.getType(constantPoolGen0);
      // Undeclared exception!
      try { 
        localVariablesInfo0.add(4359, "zF0iU#%-n?", 1741, 1741, type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Slot number for local variable information out of range.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(1524);
      // Undeclared exception!
      try { 
        localVariablesInfo0.getLocalVariableInfo(3831);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Slot number for local variable information out of range.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(198);
      BasicType basicType0 = Type.VOID;
      localVariablesInfo0.add(40, "6IJws 8", (-844), 9980, basicType0);
      assertEquals((byte)12, basicType0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(117);
      // Undeclared exception!
      try { 
        localVariablesInfo0.add(1, (String) null, 1, 0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(65535);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = null;
      try {
        localVariablesInfo0 = new LocalVariablesInfo((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(1678);
      BIPUSH bIPUSH0 = new BIPUSH((byte)0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = bIPUSH0.getType(constantPoolGen0);
      localVariablesInfo0.add(0, "TT6v`kQ'-Ie2zQBAY", 1126, 0, type0);
      try { 
        localVariablesInfo0.add(0, "TT6v`kQ'-Ie2zQBAY", 133, 1498, type0.THROWABLE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // At bytecode offset '1126' a local variable has two different types: 'byte' and 'java.lang.Throwable'.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariableInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(1139);
      BasicType basicType0 = Type.LONG;
      // Undeclared exception!
      try { 
        localVariablesInfo0.add(1139, "", 243, 243, basicType0.CLASS);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Slot number for local variable information out of range.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(4365);
      BasicType basicType0 = Type.BOOLEAN;
      // Undeclared exception!
      try { 
        localVariablesInfo0.add((-1110), "b>Q?ges~", 4365, 37, basicType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Slot number for local variable information out of range.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(81);
      // Undeclared exception!
      try { 
        localVariablesInfo0.getLocalVariableInfo(81);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Slot number for local variable information out of range.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(1678);
      LocalVariableInfo localVariableInfo0 = localVariablesInfo0.getLocalVariableInfo((byte)0);
      assertNotNull(localVariableInfo0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(0);
      // Undeclared exception!
      try { 
        localVariablesInfo0.getLocalVariableInfo((-1513));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Slot number for local variable information out of range.
         //
         verifyException("org.apache.bcel.verifier.statics.LocalVariablesInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalVariablesInfo localVariablesInfo0 = new LocalVariablesInfo(2693);
      DADD dADD0 = new DADD();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dADD0.getType(constantPoolGen0);
      localVariablesInfo0.add(2234, "&^ W", (-1448), (-2901), type0);
      assertEquals((byte)7, type0.getType());
  }
}
