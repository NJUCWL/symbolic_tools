/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:08:22 GMT 2021
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.OperandStack;
import org.apache.bcel.verifier.structurals.UninitializedObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OperandStack_ESTest extends OperandStack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = new OperandStack(149, uninitializedObjectType0.OBJECT);
      operandStack0.push(uninitializedObjectType0);
      OperandStack operandStack1 = operandStack0.getClone();
      operandStack1.merge(operandStack0);
      assertEquals(2, operandStack0.slotsUsed());
      assertEquals(149, operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(1320);
      ObjectType objectType0 = Type.STRINGBUFFER;
      OperandStack operandStack1 = new OperandStack(1320, objectType0);
      // Undeclared exception!
      try { 
        operandStack0.merge(operandStack1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot merge stacks of different size:
         // OperandStack A:
         // Slots used: 0 MaxStack: 1320.
         // 
         // OperandStack B:
         // Slots used: 1 MaxStack: 1320.
         // java.lang.StringBuffer (Size: 1)
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(149, objectType0);
      operandStack0.pop((-3217));
      assertEquals(1, operandStack0.slotsUsed());
      assertEquals(149, operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-1));
      int int0 = operandStack0.slotsUsed();
      assertEquals((-1), operandStack0.maxStack());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(352);
      operandStack0.size();
      assertEquals(352, operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(43);
      BasicType basicType0 = Type.VOID;
      operandStack0.push(basicType0);
      operandStack0.pop();
      assertEquals(43, operandStack0.maxStack());
      assertEquals(0, operandStack0.slotsUsed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(895);
      BasicType basicType0 = Type.VOID;
      operandStack0.push(basicType0);
      operandStack0.peek(0);
      assertEquals(895, operandStack0.maxStack());
      assertEquals(0, operandStack0.slotsUsed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(898);
      BasicType basicType0 = Type.INT;
      operandStack0.push(basicType0);
      operandStack0.peek(0);
      assertEquals(1, operandStack0.slotsUsed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(0);
      int int0 = operandStack0.maxStack();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-1410));
      int int0 = operandStack0.maxStack();
      assertEquals((-1410), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(0);
      OperandStack operandStack1 = operandStack0.getClone();
      operandStack1.equals(operandStack0);
      assertEquals(0, operandStack1.maxStack());
      assertNotSame(operandStack1, operandStack0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-1));
      OperandStack operandStack1 = operandStack0.getClone();
      assertEquals((-1), operandStack1.maxStack());
      assertNotSame(operandStack1, operandStack0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectType objectType0 = ObjectType.getInstance("/S0<ur");
      OperandStack operandStack0 = new OperandStack(3782, objectType0);
      // Undeclared exception!
      try { 
        operandStack0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: L/S0<ur;
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      OperandStack operandStack0 = new OperandStack(86, objectType0);
      operandStack0.pop();
      // Undeclared exception!
      try { 
        operandStack0.pop();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-596));
      // Undeclared exception!
      try { 
        operandStack0.peek((-1462));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1461, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-1));
      // Undeclared exception!
      try { 
        operandStack0.peek();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(0);
      // Undeclared exception!
      try { 
        operandStack0.merge((OperandStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = null;
      try {
        operandStack0 = new OperandStack(0, uninitializedObjectType0.CLASS);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: OperandStack too small, should have thrown proper Exception elsewhere. Stack: Slots used: 0 MaxStack: 0.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(2296, objectType0);
      int int0 = operandStack0.slotsUsed();
      assertEquals(1, int0);
      assertEquals(2296, operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = new OperandStack(149, uninitializedObjectType0.OBJECT);
      OperandStack operandStack1 = (OperandStack)operandStack0.clone();
      assertEquals(149, operandStack1.maxStack());
      assertEquals(1, operandStack1.slotsUsed());
      assertNotSame(operandStack1, operandStack0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(2296, objectType0);
      operandStack0.size();
      assertEquals(1, operandStack0.slotsUsed());
      assertEquals(2296, operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(43);
      // Undeclared exception!
      try { 
        operandStack0.peek(1005);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(46);
      BasicType basicType0 = Type.INT;
      operandStack0.push(basicType0);
      OperandStack operandStack1 = new OperandStack(46, basicType0.STRING);
      // Undeclared exception!
      try { 
        operandStack1.merge(operandStack0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot merge stacks of different types:
         // Stack A:
         // Slots used: 1 MaxStack: 46.
         // java.lang.String (Size: 1)
         // 
         // Stack B:
         // Slots used: 1 MaxStack: 46.
         // int (Size: 1)
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(20);
      BasicType basicType0 = Type.INT;
      operandStack0.push(basicType0);
      OperandStack operandStack1 = new OperandStack(20, basicType0.STRING);
      // Undeclared exception!
      try { 
        operandStack0.merge(operandStack1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot merge stacks of different types:
         // Stack A:
         // Slots used: 1 MaxStack: 20.
         // int (Size: 1)
         // 
         // Stack B:
         // Slots used: 1 MaxStack: 20.
         // java.lang.String (Size: 1)
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = new OperandStack(149);
      operandStack0.push(uninitializedObjectType0);
      operandStack0.initializeObject(uninitializedObjectType0);
      OperandStack operandStack1 = new OperandStack(149, uninitializedObjectType0.OBJECT);
      operandStack1.merge(operandStack0);
      assertEquals(1, operandStack0.slotsUsed());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = new OperandStack(149);
      operandStack0.push(uninitializedObjectType0);
      OperandStack operandStack1 = new OperandStack(149, uninitializedObjectType0.OBJECT);
      // Undeclared exception!
      try { 
        operandStack1.merge(operandStack0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Backwards branch with an uninitialized object on the stack detected.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(895);
      OperandStack operandStack1 = operandStack0.getClone();
      BasicType basicType0 = Type.VOID;
      operandStack0.push(basicType0);
      // Undeclared exception!
      try { 
        operandStack1.merge(operandStack0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot merge stacks of different size:
         // OperandStack A:
         // Slots used: 0 MaxStack: 895.
         // 
         // OperandStack B:
         // Slots used: 0 MaxStack: 895.
         // void (Size: 0)
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ObjectType objectType0 = new ObjectType("Ma?UU(#YdhA ");
      OperandStack operandStack0 = new OperandStack(17, objectType0);
      OperandStack operandStack1 = new OperandStack(216);
      // Undeclared exception!
      try { 
        operandStack0.merge(operandStack1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot merge stacks of different size:
         // OperandStack A:
         // Slots used: 1 MaxStack: 17.
         // Ma?UU(#YdhA  (Size: 1)
         // 
         // OperandStack B:
         // Slots used: 0 MaxStack: 216.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(341, objectType0);
      String string0 = operandStack0.toString();
      assertEquals("Slots used: 1 MaxStack: 341.\njava.lang.Object (Size: 1)\n", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-1580));
      ObjectType objectType0 = Type.STRINGBUFFER;
      // Undeclared exception!
      try { 
        operandStack0.push(objectType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: OperandStack too small, should have thrown proper Exception elsewhere. Stack: Slots used: 0 MaxStack: -1580.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(895);
      BasicType basicType0 = Type.SHORT;
      // Undeclared exception!
      try { 
        operandStack0.push(basicType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: The OperandStack does not know about 'short'; use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(43);
      BIPUSH bIPUSH0 = new BIPUSH((byte) (-97));
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = bIPUSH0.getType(constantPoolGen0);
      // Undeclared exception!
      try { 
        operandStack0.push(type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: The OperandStack does not know about 'byte'; use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-164));
      BasicType basicType0 = Type.CHAR;
      // Undeclared exception!
      try { 
        operandStack0.push(basicType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: The OperandStack does not know about 'char'; use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(895);
      BasicType basicType0 = Type.BOOLEAN;
      // Undeclared exception!
      try { 
        operandStack0.push(basicType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: The OperandStack does not know about 'boolean'; use Type.INT instead.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(1);
      // Undeclared exception!
      try { 
        operandStack0.push((Type) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL ERROR: Cannot push NULL onto OperandStack.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(341, objectType0);
      operandStack0.pop(1);
      assertTrue(operandStack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(352);
      boolean boolean0 = operandStack0.isEmpty();
      assertEquals(352, operandStack0.maxStack());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(192, objectType0);
      boolean boolean0 = operandStack0.isEmpty();
      assertEquals(192, operandStack0.maxStack());
      assertFalse(boolean0);
      assertEquals(1, operandStack0.slotsUsed());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(10);
      Integer integer0 = new Integer(10);
      boolean boolean0 = operandStack0.equals(integer0);
      assertEquals(10, operandStack0.maxStack());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack((-1));
      operandStack0.clear();
      assertEquals((-1), operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      OperandStack operandStack0 = new OperandStack(2296, objectType0);
      // Undeclared exception!
      try { 
        operandStack0.pop(2296);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(2795);
      operandStack0.hashCode();
      assertEquals(2795, operandStack0.maxStack());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OperandStack operandStack0 = new OperandStack(10);
      int int0 = operandStack0.maxStack();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = new OperandStack(149, uninitializedObjectType0.OBJECT);
      operandStack0.peek();
      assertEquals(149, operandStack0.maxStack());
      assertEquals(1, operandStack0.slotsUsed());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      UninitializedObjectType uninitializedObjectType0 = new UninitializedObjectType(objectType0);
      OperandStack operandStack0 = new OperandStack(149, uninitializedObjectType0.OBJECT);
      operandStack0.push(uninitializedObjectType0);
      OperandStack operandStack1 = operandStack0.getClone();
      operandStack0.initializeObject(uninitializedObjectType0);
      // Undeclared exception!
      try { 
        operandStack1.merge(operandStack0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Backwards branch with an uninitialized object on the stack detected.
         //
         verifyException("org.apache.bcel.verifier.structurals.OperandStack", e);
      }
  }
}
