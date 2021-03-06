/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:59:56 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.generic.AALOAD;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.DCMPL;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.FieldObserver;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.generic.ReturnaddressType;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.BCELComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldGen_ESTest extends FieldGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DCMPL dCMPL0 = new DCMPL();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCMPL0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen(2, type0, "t*", constantPoolGen0);
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen1 = new ConstantPoolGen(constantPool0);
      FieldGen fieldGen1 = fieldGen0.copy(constantPoolGen1);
      assertNotSame(fieldGen1, fieldGen0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(0, referenceType0, "", constantPoolGen0);
      FieldGen fieldGen1 = fieldGen0.copy(constantPoolGen0);
      boolean boolean0 = fieldGen1.equals(fieldGen0);
      assertNotSame(fieldGen1, fieldGen0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DCMPL dCMPL0 = new DCMPL();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCMPL0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen(2, type0, "t*", constantPoolGen0);
      Field field0 = fieldGen0.getField();
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(2, field0.getSignatureIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCONST0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-105), type0, "b10XO>B", constantPoolGen0);
      Field field0 = fieldGen0.getField();
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, field0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(232, objectType0, "?7c_){BeNhZ*.1'@Q$J", constantPoolGen0);
      Field field0 = fieldGen0.getField();
      assertEquals(3, constantPoolGen0.getSize());
      assertEquals(1, field0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DADD dADD0 = new DADD();
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Type type0 = dADD0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-2391), type0, " vs. ", constantPoolGen0);
      FieldGen fieldGen1 = fieldGen0.copy(constantPoolGen0);
      assertNotSame(fieldGen1, fieldGen0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(232, objectType0, "?7c_){BeNhZ*.1'@Q$J", constantPoolGen0);
      FieldGen fieldGen1 = fieldGen0.copy(constantPoolGen0);
      assertNotSame(fieldGen1, fieldGen0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCONST0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-42), type0, "910XO>B", constantPoolGen0);
      String string0 = fieldGen0.toString();
      assertEquals("private protected final volatile transient native interface abstract strictfp synthetic annotation enum double 910XO>B", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      FieldGen fieldGen0 = new FieldGen(154, objectType0, "I()I>", (ConstantPoolGen) null);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue((short)26);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Types are not compatible: java.lang.Object vs. short
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICONST iCONST0 = new ICONST();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = iCONST0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-379), type0, "6%m4bJ#gpQCa#V~d:p", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue("6%m4bJ#gpQCa#V~d:p");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only final fields may have an initial value!
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DCMPL dCMPL0 = new DCMPL();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCMPL0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen(2, type0, "t*", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue(2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only final fields may have an initial value!
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DADD dADD0 = new DADD();
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      Type type0 = dADD0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-2391), type0, " vs. ", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue((double) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only final fields may have an initial value!
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(232, objectType0, "?7c_){BeNhZ*.1'@Q$J", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue('l');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only final fields may have an initial value!
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = Type.UNKNOWN;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(2421, type0, "FW4hj /W9B5lys\"", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue((byte)95);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Types are not compatible: <unknown object> vs. byte
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      FieldGen fieldGen0 = new FieldGen((-1313), objectType0, ")6Jv^%V5hKS", (ConstantPoolGen) null);
      // Undeclared exception!
      try { 
        fieldGen0.getField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(0, referenceType0, "", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldGen$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AALOAD aALOAD0 = new AALOAD();
      Type type0 = aALOAD0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-168), type0.FLOAT, "java.lang.String", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.equals("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.bcel.generic.FieldGen
         //
         verifyException("org.apache.bcel.generic.FieldGen$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      Field field0 = new Field(80, 651, (-25), (Attribute[]) null, constantPool0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      FieldGen fieldGen0 = null;
      try {
        fieldGen0 = new FieldGen(field0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -25. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      FieldGen fieldGen0 = null;
      try {
        fieldGen0 = new FieldGen((Field) null, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = null;
      try {
        fieldGen0 = new FieldGen((-3530), (Type) null, (String) null, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.FieldGenOrMethodGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = null;
      try {
        fieldGen0 = new FieldGen((-437), returnaddressType0, "", constantPoolGen0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type can not be <return address>
         //
         verifyException("org.apache.bcel.generic.FieldGenOrMethodGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = new ObjectType("java.lang.String");
      FieldGen fieldGen0 = new FieldGen((-170), objectType0.BYTE, "java.lang.String", constantPoolGen0);
      String string0 = fieldGen0.getSignature();
      assertEquals("B", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LCMP lCMP0 = new LCMP();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = lCMP0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen(0, type0, "fmul", constantPoolGen0);
      String string0 = fieldGen0.toString();
      assertEquals("long fmul", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCONST0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-42), type0, "b10XO>B", constantPoolGen0);
      String string0 = fieldGen0.getInitValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      FieldGen fieldGen0 = new FieldGen(65535, objectType0, "nB3L\"ehVjti", (ConstantPoolGen) null);
      fieldGen0.update();
      assertTrue(fieldGen0.isInterface());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(0, referenceType0, "", constantPoolGen0);
      FieldObserver fieldObserver0 = mock(FieldObserver.class, new ViolatedAssumptionAnswer());
      fieldGen0.addObserver(fieldObserver0);
      fieldGen0.removeObserver((FieldObserver) null);
      assertFalse(fieldGen0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DCMPL dCMPL0 = new DCMPL();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCMPL0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen(2, type0, "t*", constantPoolGen0);
      FieldObserver fieldObserver0 = mock(FieldObserver.class, new ViolatedAssumptionAnswer());
      fieldGen0.removeObserver(fieldObserver0);
      assertFalse(fieldGen0.isPublic());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(0, referenceType0, "", constantPoolGen0);
      FieldObserver fieldObserver0 = mock(FieldObserver.class, new ViolatedAssumptionAnswer());
      fieldGen0.addObserver(fieldObserver0);
      fieldGen0.addObserver((FieldObserver) null);
      assertFalse(fieldGen0.isNative());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCONST0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-42), type0, "b10XO>B", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue((float) (-42));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Types are not compatible: double vs. float
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ReferenceType referenceType0 = Type.NULL;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      FieldGen fieldGen0 = new FieldGen(0, referenceType0, "", constantPoolGen0);
      // Undeclared exception!
      try { 
        fieldGen0.setInitValue(true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only final fields may have an initial value!
         //
         verifyException("org.apache.bcel.generic.FieldGen", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DCONST dCONST0 = new DCONST();
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCONST0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-42), type0, "b10XO>B", constantPoolGen0);
      Integer integer0 = new Integer((-42));
      fieldGen0.setInitValue((double) integer0);
      Field field0 = fieldGen0.getField();
      assertEquals(6, constantPoolGen0.getSize());
      assertEquals(1, field0.getNameIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AALOAD aALOAD0 = new AALOAD();
      Type type0 = aALOAD0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-168), type0.FLOAT, "java.lang.String", constantPoolGen0);
      fieldGen0.setInitValue((float) 6);
      assertFalse(fieldGen0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AALOAD aALOAD0 = new AALOAD();
      Type type0 = aALOAD0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen((-168), type0.LONG, "java.lang.String", constantPoolGen0);
      fieldGen0.setInitValue((long) (-168));
      assertEquals("java.lang.String", fieldGen0.getName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BCELComparator bCELComparator0 = FieldGen.getComparator();
      assertNotNull(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = new ObjectType("java.lang.String");
      FieldGen fieldGen0 = new FieldGen((-170), objectType0.CHAR, "java.lang.String", constantPoolGen0);
      FieldGen fieldGen1 = fieldGen0.copy(constantPoolGen0);
      assertNotSame(fieldGen1, fieldGen0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BCELComparator bCELComparator0 = JavaClass.getComparator();
      FieldGen.setComparator(bCELComparator0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = new ObjectType("java.lang.String");
      FieldGen fieldGen0 = new FieldGen((-170), objectType0.CHAR, "java.lang.String", constantPoolGen0);
      fieldGen0.cancelInitValue();
      assertTrue(fieldGen0.isInterface());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DCMPL dCMPL0 = new DCMPL();
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      Type type0 = dCMPL0.getType(constantPoolGen0);
      FieldGen fieldGen0 = new FieldGen(2, type0, "t*", constantPoolGen0);
      fieldGen0.hashCode();
  }
}
