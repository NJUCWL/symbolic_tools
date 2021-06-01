package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.ClassLoader;
import java.util.LinkedList;
import shaded.org.evosuite.runtime.mock.java.util.MockRandom;
import java.util.Random;
import java.util.HashMap;
import java.util.*;
import java.text.NumberFormat;
import java.text.*;
import java.io.*;
import java.io.DataInput;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.la4j.*;
import org.la4j.decomposition.*;
import org.la4j.inversion.*;
import org.la4j.iterator.*;
import org.la4j.linear.*;
import org.la4j.matrix.*;
import org.la4j.matrix.dense.*;
import org.la4j.matrix.functor.*;
import org.la4j.matrix.sparse.*;
import org.la4j.operation.*;
import org.la4j.operation.inplace.*;
import org.la4j.operation.ooplace.*;
import org.la4j.vector.*;
import org.la4j.vector.dense.*;
import org.la4j.vector.functor.*;
import org.la4j.vector.sparse.*;
public class InstructionFactory_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectType objectType0 = Type.CLASS;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      instructionFactory0.createCheckCast(objectType0);
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicType basicType0 = Type.BYTE;
      int int0 = 1910;
      InstructionFactory.createLoad(basicType0, int0);
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      String string0 = "isString(Lorg/apache/bcel/generic/Type;)Z";
      FCMPG fCMPG0 = new FCMPG();
      Type type0 = fCMPG0.getType(constantPoolGen0);
      instructionFactory0.createGetStatic(string0, string0, type0);
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      short short0 = (short) (-1298);
      InstructionHandle instructionHandle0 = null;
      // Undeclared exception!
      try { 
        InstructionFactory.createBranchInstruction(short0, instructionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid opcode: -1298
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "@^IOmgZ+`";
      int int0 = (-675);
      String[] stringArray0 = new String[7];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      ConstantPoolGen constantPoolGen0 = classGen0.getConstantPool();
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      ObjectType objectType0 = Type.STRINGBUFFER;
      instructionFactory0.createInstanceOf(objectType0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassGen classGen0 = null;
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      String string0 = "";
      UninitializedObjectType uninitializedObjectType0 = Frame.getThis();
      // Undeclared exception!
      try { 
        instructionFactory0.createPutStatic(string0, string0, uninitializedObjectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      String string0 = "wx!";
      // Undeclared exception!
      try { 
        instructionFactory0.createNew(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = "&i&.N9KA]YV3Ut 1Zq";
      ObjectType objectType0 = ObjectType.getInstance(string0);
      // Undeclared exception!
      try { 
        InstructionFactory.createBinaryOperation(string0, objectType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid type &i&.N9KA]YV3Ut 1Zq
         //
      }
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int int0 = 0;
      String string0 = "createThis()Lorg/apache/bcel/generic/Instruction;";
      String[] stringArray0 = new String[8];
      stringArray0[0] = string0;
      ClassGen classGen0 = new ClassGen(string0, stringArray0[0], stringArray0[4], int0, stringArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      instructionFactory0.setConstantPool(constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = 169;
      InstructionFactory.createDup(int0);
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "_vx@f8Zh\\uA!f";
      int int0 = (-4406);
      String[] stringArray0 = new String[5];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0);
      instructionFactory0.setClassGen(classGen0);
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 3555;
      String string0 = "`MP/?\"m";
      String[] stringArray0 = null;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0, constantPoolGen0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      instructionFactory0.createPrintln(string0);
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      InstructionFactory.createNull(objectType0);
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "";
      int int0 = 4117;
      String[] stringArray0 = new String[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0, constantPoolGen0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0);
      AALOAD aALOAD0 = (AALOAD)InstructionConstants.AALOAD;
      Type type0 = aALOAD0.getType(constantPoolGen0);
      short short0 = (short)60;
      // Undeclared exception!
      try { 
        instructionFactory0.createFieldAccess(string0, string0, type0, short0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Oops: Unknown getfield kind:60
         //
      }
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InstructionFactory.createThis();
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = (-5798);
      InstructionFactory.createDup_2(int0);
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "#0SJkmG";
      int int0 = 5032;
      String[] stringArray0 = new String[7];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      instructionFactory0.getClassGen();
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "Md=g?7_`CHG9B0j";
      int int0 = 340;
      String[] stringArray0 = new String[8];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0);
      instructionFactory0.getConstantPool();
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "createNull(Lorg/apache/bcel/generic/Type;)Lorg/apache/bcel/generic/Instruction;";
      int int0 = 113;
      String[] stringArray0 = new String[0];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      ConstantPoolGen constantPoolGen0 = null;
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      ObjectType objectType0 = ObjectType.getInstance(string0);
      // Undeclared exception!
      try { 
        instructionFactory0.createAppend(objectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicType basicType0 = Type.BOOLEAN;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      String string0 = "@,\"y--wN@FEA.&";
      Type[] typeArray0 = new Type[3];
      short short0 = (short)1565;
      // Undeclared exception!
      try { 
        instructionFactory0.createInvoke(string0, string0, basicType0, typeArray0, short0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DUP dUP0 = new DUP();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = dUP0.getType(constantPoolGen0);
      // Undeclared exception!
      try { 
        InstructionFactory.createArrayLoad(type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid type 
         //
      }
  }
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Type type0 = null;
      int int0 = 198;
      // Undeclared exception!
      try { 
        InstructionFactory.createStore(type0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "hY)x";
      int int0 = (-700);
      String[] stringArray0 = new String[3];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      ConstantPoolGen constantPoolGen0 = classGen0.getConstantPool();
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0, constantPoolGen0);
      ObjectType objectType0 = Type.OBJECT;
      short short0 = (short)490;
      // Undeclared exception!
      try { 
        instructionFactory0.createNewArray(objectType0, short0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid number of dimensions: 490
         //
      }
  }
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = (-714);
      ReturnaddressType returnaddressType0 = ReturnaddressType.NO_TARGET;
      String string0 = "";
      String[] stringArray0 = new String[5];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      InstructionFactory instructionFactory0 = new InstructionFactory(classGen0);
      // Undeclared exception!
      try { 
        instructionFactory0.createGetField(stringArray0[1], stringArray0[1], returnaddressType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicType basicType0 = Type.SHORT;
      InstructionFactory.createArrayStore(basicType0);
  }
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Type type0 = null;
      // Undeclared exception!
      try { 
        InstructionFactory.createReturn(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      int int0 = 187;
      ArrayType arrayType0 = new ArrayType(objectType0, int0);
      ConstantPoolGen constantPoolGen0 = null;
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      // Undeclared exception!
      try { 
        instructionFactory0.createCast(arrayType0, arrayType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 195;
      InstructionFactory.createPop(int0);
  }
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 0;
      InstructionFactory.createDup_1(int0);
  }
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      InstructionFactory instructionFactory0 = new InstructionFactory(constantPoolGen0);
      ObjectType objectType0 = Type.STRING;
      // Undeclared exception!
      try { 
        instructionFactory0.createNew(objectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}