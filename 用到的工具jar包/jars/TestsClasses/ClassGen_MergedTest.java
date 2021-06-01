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
public class ClassGen_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "7H8V6F<Ma`]PH)N[E";
      int int0 = (-1269);
      String[] stringArray0 = null;
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      Method method0 = new Method();
      classGen0.replaceMethod(method0, method0);
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "s]_5&91P2L1A";
      int int0 = 186;
      String[] stringArray0 = new String[0];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      ClassObserver classObserver0 = mock(ClassObserver.class, new ViolatedAssumptionAnswer());
      classGen0.addObserver(classObserver0);
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "getMethodAt(I)Lorg/apache/bcel/classfile/Method;";
      int int0 = 1736;
      String[] stringArray0 = new String[1];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.addEmptyConstructor(int0);
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "";
      int int0 = 0;
      String[] stringArray0 = new String[9];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.setClassName(string0);
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassGen.getComparator();
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "";
      int int0 = 3;
      String[] stringArray0 = new String[2];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.containsField(stringArray0[0]);
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = "()V";
      int int0 = (-2385);
      String[] stringArray0 = new String[8];
      stringArray0[0] = string0;
      stringArray0[1] = string0;
      stringArray0[2] = string0;
      stringArray0[3] = string0;
      stringArray0[4] = string0;
      stringArray0[5] = string0;
      stringArray0[6] = string0;
      stringArray0[7] = string0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0, constantPoolGen0);
      classGen0.getJavaClass();
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = "org.apache.bcel.generic.ClassGen$1";
      int int0 = 3627;
      String[] stringArray0 = new String[5];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      // Undeclared exception!
      try { 
        classGen0.getMethodAt(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3627, Size: 0
         //
      }
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = "";
      int int0 = 1970;
      String[] stringArray0 = new String[0];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String string0 = "";
      int int0 = 61;
      String[] stringArray0 = new String[6];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      // Undeclared exception!
      try { 
        classGen0.setSuperclassNameIndex(int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant pool at index 61 is null.
         //
      }
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "";
      int int0 = (-4138);
      String[] stringArray0 = new String[7];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      Method method0 = classGen0.containsMethod(stringArray0[5], stringArray0[5]);
      // Undeclared exception!
      try { 
        classGen0.setMethodAt(method0, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4138
         //
      }
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "},F<sFsM_0{b$]";
      int int0 = 0;
      String[] stringArray0 = new String[4];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.containsMethod(stringArray0[2], string0);
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Deprecated> class0 = Deprecated.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      ClassGen classGen0 = new ClassGen(javaClass0);
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "%}]PUE%tDk11&";
      int int0 = (-1082);
      String[] stringArray0 = new String[9];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.hashCode();
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "k";
      int int0 = 1244;
      String[] stringArray0 = new String[6];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.getInterfaceNames();
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      int int0 = 1401;
      String[] stringArray0 = new String[1];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.setSuperclassName(string0);
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BCELComparator bCELComparator0 = JavaClass.getComparator();
      ClassGen.setComparator(bCELComparator0);
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "getConstantPool()Lorg/apache/bcel/generic/ConstantPoolGen;";
      int int0 = 23;
      String[] stringArray0 = new String[3];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      // Undeclared exception!
      try { 
        classGen0.getJavaClass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<LineNumberTable> class0 = LineNumberTable.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      ClassGen classGen0 = new ClassGen(javaClass0);
      int int0 = 1235;
      // Undeclared exception!
      try { 
        classGen0.setClassNameIndex(int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1235. Constant pool size is: 256
         //
      }
  }
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "#";
      int int0 = 29;
      String[] stringArray0 = new String[3];
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "setSuperclassNameIndex(I)V";
      int int0 = 24;
      String[] stringArray0 = new String[9];
      stringArray0[0] = string0;
      stringArray0[1] = string0;
      stringArray0[2] = string0;
      stringArray0[3] = string0;
      stringArray0[4] = string0;
      stringArray0[5] = string0;
      stringArray0[6] = string0;
      stringArray0[7] = string0;
      stringArray0[8] = string0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0, constantPoolGen0);
      classGen0.getJavaClass();
  }
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<ConstantValue> class0 = ConstantValue.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      ClassGen classGen0 = new ClassGen(javaClass0);
  }
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassPath classPath0 = null;
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      ClassGen classGen0 = new ClassGen(javaClass0);
      classGen0.update();
  }
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "tIB/-/:wmL=";
      int int0 = 4991;
      String[] stringArray0 = new String[5];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.setMinor(int0);
  }
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "constantvalue_index";
      int int0 = 24;
      String[] stringArray0 = new String[0];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.getFileName();
  }
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "getJavaClass()Lorg/apache/bcel/classfile/JavaClass;";
      int int0 = 181;
      String[] stringArray0 = new String[6];
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.getSuperclassName();
  }
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "";
      int int0 = 0;
      String[] stringArray0 = new String[4];
      stringArray0[0] = string0;
      stringArray0[1] = string0;
      stringArray0[2] = string0;
      stringArray0[3] = string0;
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0);
      classGen0.getJavaClass();
  }
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "++UU%Dy$!k";
      int int0 = 0;
      String[] stringArray0 = new String[8];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      ClassGen classGen0 = new ClassGen(string0, string0, string0, int0, stringArray0, constantPoolGen0);
      // Undeclared exception!
      try { 
        classGen0.getJavaClass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      ClassGen classGen0 = new ClassGen(javaClass0);
      ClassObserver classObserver0 = mock(ClassObserver.class, new ViolatedAssumptionAnswer());
      classGen0.removeObserver(classObserver0);
  }
}