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
public class MethodGen_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "setComparator(Lorg/apache/bcel/util/BCELComparator;)V";
      int int0 = (-1963);
      ObjectType objectType0 = ObjectType.getInstance(string0);
      Type[] typeArray0 = null;
      String[] stringArray0 = new String[1];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = null;
      MethodGen methodGen0 = new MethodGen(int0, objectType0, typeArray0, stringArray0, string0, string0, instructionList0, constantPoolGen0);
      // Undeclared exception!
      try { 
        methodGen0.copy(string0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 115;
      ALOAD aLOAD0 = new ALOAD(int0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Type type0 = aLOAD0.getType(constantPoolGen0);
      Type[] typeArray0 = new Type[4];
      String[] stringArray0 = new String[9];
      PUSH pUSH0 = new PUSH(constantPoolGen0, stringArray0[2]);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = null;
      try {
        methodGen0 = new MethodGen(int0, type0, typeArray0, stringArray0, stringArray0[0], stringArray0[6], instructionList0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatch in argument array lengths: 4 vs. 9
         //
      }
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 0;
      BasicType basicType0 = Type.VOID;
      Type[] typeArray0 = new Type[7];
      String[] stringArray0 = new String[4];
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = null;
      try {
        methodGen0 = new MethodGen(int0, basicType0, typeArray0, stringArray0, stringArray0[0], stringArray0[0], instructionList0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatch in argument array lengths: 7 vs. 4
         //
      }
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = (-537);
      byte byte0 = (byte) (-95);
      BIPUSH bIPUSH0 = new BIPUSH(byte0);
      ConstantPoolGen constantPoolGen0 = null;
      Type type0 = bIPUSH0.getType(constantPoolGen0);
      Type[] typeArray0 = new Type[3];
      String[] stringArray0 = null;
      String string0 = "";
      InstructionList instructionList0 = new InstructionList();
      MethodGen methodGen0 = new MethodGen(int0, type0, typeArray0, stringArray0, string0, string0, instructionList0, constantPoolGen0);
      // Undeclared exception!
      try { 
        methodGen0.getLineNumberTable(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MethodGen.getComparator();
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BCELComparator bCELComparator0 = MethodGen.getComparator();
      MethodGen.setComparator(bCELComparator0);
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 359;
      ObjectType objectType0 = Type.CLASS;
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = new String[0];
      String string0 = "YTu|";
      IF_ICMPEQ iF_ICMPEQ0 = new IF_ICMPEQ();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) iF_ICMPEQ0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen(int0, objectType0, typeArray0, stringArray0, string0, string0, instructionList0, constantPoolGen0);
      // Undeclared exception!
      try { 
        methodGen0.copy(string0, constantPoolGen0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = (-1464);
      ARETURN aRETURN0 = new ARETURN();
      Type type0 = aRETURN0.getType();
      Type[] typeArray0 = new Type[5];
      String[] stringArray0 = new String[5];
      ConstantPoolGen constantPoolGen0 = null;
      PUSH pUSH0 = new PUSH(constantPoolGen0, int0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      MethodGen methodGen0 = null;
      try {
        methodGen0 = new MethodGen(int0, type0, typeArray0, stringArray0, stringArray0[3], stringArray0[0], instructionList0, constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int int0 = 1796;
      BasicType basicType0 = Type.BOOLEAN;
      Type[] typeArray0 = new Type[2];
      String[] stringArray0 = new String[2];
      String string0 = "G#T`6|<B+Gc7";
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen(int0, basicType0, typeArray0, stringArray0, stringArray0[0], string0, instructionList0, constantPoolGen0);
      methodGen0.removeException(stringArray0[0]);
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = 0;
      String string0 = "stripAttributes(Z)V";
      ObjectType objectType0 = new ObjectType(string0);
      Type[] typeArray0 = null;
      String[] stringArray0 = new String[2];
      stringArray0[1] = string0;
      LDC lDC0 = new LDC();
      InstructionList instructionList0 = new InstructionList(lDC0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen(int0, objectType0, typeArray0, stringArray0, string0, stringArray0[1], instructionList0, constantPoolGen0);
      methodGen0.getMethod();
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      BasicType basicType0 = Type.BYTE;
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = new String[5];
      String string0 = "=]lH9$;eC:";
      stringArray0[0] = string0;
      stringArray0[2] = stringArray0[0];
      stringArray0[3] = stringArray0[2];
      LXOR lXOR0 = new LXOR();
      InstructionList instructionList0 = new InstructionList(lXOR0);
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      MethodGen methodGen0 = null;
      try {
        methodGen0 = new MethodGen(int0, basicType0, typeArray0, stringArray0, stringArray0[3], stringArray0[3], instructionList0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatch in argument array lengths: 0 vs. 5
         //
      }
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-60);
      Type type0 = Type.UNKNOWN;
      Type[] typeArray0 = null;
      String[] stringArray0 = null;
      String string0 = "iZx'";
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = new MethodGen(int0, type0, typeArray0, stringArray0, string0, string0, instructionList0, constantPoolGen0);
      // Undeclared exception!
      try { 
        methodGen0.copy(string0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: <unknown object>
         //
      }
  }
}