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
public class AnnotationEntryGen_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectType objectType0 = Type.THROWABLE;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = true;
      Constant[] constantArray0 = new Constant[2];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
      annotationEntryGen0.getTypeSignature();
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = ")";
      ObjectType objectType0 = ObjectType.getInstance(string0);
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = true;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
      annotationEntryGen0.toShortString();
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectType objectType0 = Type.STRINGBUFFER;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = false;
      Constant[] constantArray0 = new Constant[3];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
      annotationEntryGen0.getAnnotation();
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      boolean boolean0 = true;
      AnnotationEntryGen.read(byteSequence0, constantPoolGen0, boolean0);
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      List<AnnotationEntryGen>[] listArray0 = null;
      // Undeclared exception!
      try { 
        AnnotationEntryGen.getParameterAnnotationAttributes(constantPoolGen0, listArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      LinkedList<ElementValuePairGen> linkedList0 = new LinkedList<ElementValuePairGen>();
      boolean boolean0 = false;
      Constant[] constantArray0 = new Constant[0];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      AnnotationEntryGen annotationEntryGen0 = new AnnotationEntryGen(objectType0, linkedList0, boolean0, constantPoolGen0);
      annotationEntryGen0.getTypeName();
  }
}