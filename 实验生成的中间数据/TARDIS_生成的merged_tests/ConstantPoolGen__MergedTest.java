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
public class ConstantPoolGen__MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.STRINGBUFFER;
      constantPoolGen0.addClass(objectType0);
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = 0;
      constantPoolGen0.getConstant(int0);
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "<init>()V";
      constantPoolGen0.lookupClass(string0);
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = null;
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupInterfaceMethodref(methodGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      long long0 = (-2445L);
      constantPoolGen0.addLong(long0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      String string0 = "Unexpected constant type: ";
      constantPoolGen0.lookupInterfaceMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      float float0 = (-1.0F);
      constantPoolGen0.addFloat(float0);
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getSize();
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = null;
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = (-2067947214);
      // Undeclared exception!
      try { 
        constantPoolGen0.setConstant(int0, constantArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2067947214
         //
      }
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      String string0 = "";
      constantPoolGen0.addMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "lookupFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I";
      constantPoolGen0.addFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "[g2R{";
      int int0 = constantPoolGen0.addString(string0);
      constantPoolGen0.addDouble(int0);
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = ">r";
      constantPoolGen0.addString(string0);
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "]J'{B9A>C`eFQu";
      int int0 = constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
      ConstantLong constantLong0 = new ConstantLong(int0);
      constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.addString(string0);
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      MethodGen methodGen0 = null;
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupMethodref(methodGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      String string0 = "";
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
      constantPoolGen0.addDouble(int0);
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      constantPoolGen0.lookupMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      constantPoolGen0.addFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      int int0 = constantPoolGen0.lookupInterfaceMethodref(string0, string0, string0);
      constantPoolGen0.addInteger(int0);
  }
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "addInteger(I)I";
      int int0 = constantPoolGen0.addFieldref(string0, string0, string0);
      constantPoolGen0.addInteger(int0);
  }
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getFinalConstantPool();
  }
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.lookupFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      long long0 = (-288L);
      constantPoolGen0.addLong(long0);
  }
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "";
      ObjectType objectType0 = ObjectType.getInstance(string0);
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = false;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "addUtf8(Ljava/lang/String;)I";
      constantPoolGen0.addFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = true;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.addClass(string0);
  }
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ObjectType objectType0 = Type.STRINGBUFFER;
      constantPoolGen0.addClass(objectType0);
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = 0;
      constantPoolGen0.getConstant(int0);
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "<init>()V";
      constantPoolGen0.lookupClass(string0);
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      MethodGen methodGen0 = null;
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupInterfaceMethodref(methodGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      long long0 = (-2445L);
      constantPoolGen0.addLong(long0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      String string0 = "Unexpected constant type: ";
      constantPoolGen0.lookupInterfaceMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      float float0 = (-1.0F);
      constantPoolGen0.addFloat(float0);
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getSize();
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = null;
      // Undeclared exception!
      try { 
        constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = (-2067947214);
      // Undeclared exception!
      try { 
        constantPoolGen0.setConstant(int0, constantArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2067947214
         //
      }
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      String string0 = "";
      constantPoolGen0.addMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "lookupFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I";
      constantPoolGen0.addFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "[g2R{";
      int int0 = constantPoolGen0.addString(string0);
      constantPoolGen0.addDouble(int0);
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = ">r";
      constantPoolGen0.addString(string0);
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "]J'{B9A>C`eFQu";
      int int0 = constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
      ConstantLong constantLong0 = new ConstantLong(int0);
      constantPoolGen0.addConstant(constantLong0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.addString(string0);
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      MethodGen methodGen0 = null;
      // Undeclared exception!
      try { 
        constantPoolGen0.lookupMethodref(methodGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant[] constantArray0 = new Constant[1];
      String string0 = "";
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      int int0 = constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
      constantPoolGen0.addDouble(int0);
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      constantPoolGen0.lookupMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = constantPoolGen0.toString();
      constantPoolGen0.addFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      int int0 = constantPoolGen0.lookupInterfaceMethodref(string0, string0, string0);
      constantPoolGen0.addInteger(int0);
  }
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "addInteger(I)I";
      int int0 = constantPoolGen0.addFieldref(string0, string0, string0);
      constantPoolGen0.addInteger(int0);
  }
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getFinalConstantPool();
  }
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.lookupFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      long long0 = (-288L);
      constantPoolGen0.addLong(long0);
  }
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "";
      ObjectType objectType0 = ObjectType.getInstance(string0);
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = false;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "addUtf8(Ljava/lang/String;)I";
      constantPoolGen0.addFieldref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = true;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.addInterfaceMethodref(string0, string0, string0);
  }
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "";
      constantPoolGen0.addClass(string0);
  }
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstantPool();
  }
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = (-561);
      int int1 = constantPoolGen0.addLong(int0);
      constantPoolGen0.addFloat(int1);
  }
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      constantPoolGen0.getConstantPool();
  }
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      int int0 = (-561);
      int int1 = constantPoolGen0.addLong(int0);
      constantPoolGen0.addFloat(int1);
  }
}