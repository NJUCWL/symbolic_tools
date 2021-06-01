package org.apache.bcel.classfile;

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
public class Utility_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try { 
        Utility.typeOfSignature(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = false;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      PrintStream printStream0 = new PrintStream(filterOutputStream0, boolean0);
      Object[] objectArray0 = new Object[0];
      Utility.printArray(printStream0, objectArray0);
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = Utility.equals(byteArray0, byteArray0);
      String string0 = "codeToString(Lorg/apache/bcel/util/ByteSequence;Lorg/apache/bcel/classfile/ConstantPool;Z)Ljava/lang/String;";
      Utility.methodSignatureReturnType(string0, boolean0);
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)0;
      ConstantPool constantPool0 = null;
      // Undeclared exception!
      Utility.codeToString(byteArray0, constantPool0, (int) byte0, (int) byteArray0[1]);
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Utility.printArray(objectArray0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = ">.1HH3.uL@@53";
      try { 
        Utility.typeOfMethodSignature(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: >.1HH3.uL@@53
         //
      }
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 1321;
      Utility.classOrInterface(int0);
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = 7;
      String string0 = Utility.accessToString(int0);
      try { 
        Utility.methodSignatureReturnType(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: `public private protected'
         //
      }
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = "u";
      Utility.replace(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String string0 = "class";
      // Undeclared exception!
      try { 
        Utility.signatureToString(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: `class'
         //
      }
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 221;
      char char0 = '4';
      Utility.setBit(int0, char0);
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "zx8LF<p";
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        Utility.methodTypeToSignature(string0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = null;
      boolean boolean0 = true;
      String string0 = Utility.printArray(objectArray0, boolean0, boolean0);
      // Undeclared exception!
      try { 
        Utility.methodSignatureArgumentTypes(string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = (-1704);
      boolean boolean0 = true;
      char char0 = 'm';
      Utility.format(int0, int0, boolean0, char0);
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = null;
      Object[] objectArray0 = null;
      // Undeclared exception!
      try { 
        Utility.printArray(printWriter0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try { 
        Utility.methodSignatureToString(string0, string0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: 
         //
      }
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Utility.toHexString(byteArray0);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        Utility.signatureToString(string0, boolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid signature: `00 00 00 00 00 00 00'
         //
      }
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = (-904);
      Utility.isSet(int0, int0);
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = (-993);
      String string0 = Utility.classOrInterface(int0);
      Utility.compactClassName(string0);
  }
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = true;
      try { 
        Utility.decode(string0, boolean0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Utility.toHexString(byteArray0);
  }
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Utility.printArray(objectArray0);
  }
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "";
      Utility.convertString(string0);
  }
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = null;
      ConstantPool constantPool0 = null;
      int int0 = (-342);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        Utility.codeToString(byteArray0, constantPool0, int0, int0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "6bCs%4bl:!%;2L]";
      short short0 = Utility.searchOpcode(string0);
      char char0 = 'q';
      Utility.clearBit(char0, short0);
  }
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 281;
      boolean boolean0 = true;
      Utility.accessToString(int0, boolean0);
  }
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "41w6c0";
      Utility.searchOpcode(string0);
  }
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "";
      Utility.compactClassName(string0);
  }
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteSequence byteSequence0 = null;
      ConstantPool constantPool0 = null;
      // Undeclared exception!
      try { 
        Utility.codeToString(byteSequence0, constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "short";
      try { 
        Utility.methodSignatureArgumentTypes(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: short
         //
      }
  }
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "null";
      int int0 = 1333;
      boolean boolean0 = true;
      char char0 = 'o';
      String string1 = Utility.fillup(string0, int0, boolean0, char0);
      Utility.compactClassName(string1);
  }
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = (-2712);
      Utility.accessToString(int0);
  }
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = ",R5?=[aV";
      // Undeclared exception!
      try { 
        Utility.methodSignatureToString(string0, string0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: ,R5?=[aV
         //
      }
  }
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "qt!$QB[&,\\)X";
      // Undeclared exception!
      try { 
        Utility.methodSignatureToString(string0, string0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: qt!$QB[&,\\)X
         //
      }
  }
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      boolean boolean0 = false;
      PrintWriter printWriter0 = new PrintWriter(pipedOutputStream0, boolean0);
      Object[] objectArray0 = null;
      Utility.printArray(printWriter0, objectArray0);
  }
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char char0 = 'K';
      Utility.isJavaIdentifierPart(char0);
  }
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "-DR\"F,Y>+]]MO";
      boolean boolean0 = false;
      String string1 = Utility.compactClassName(string0, string0, boolean0);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        Utility.methodTypeToSignature(string1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = Utility.equals(byteArray0, byteArray0);
      String string0 = Utility.classOrInterface(byteArray0[1]);
      char char0 = ')';
      Utility.fillup(string0, byteArray0[0], boolean0, char0);
  }
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPool constantPool0 = null;
      Utility.codeToString(byteSequence0, constantPool0);
  }
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = null;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        Utility.encode(byteArray0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}