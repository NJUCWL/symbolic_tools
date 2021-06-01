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
public class SimpleElementValueGen_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(int0, constantPoolGen0, (float) int0);
      // Undeclared exception!
      try { 
        simpleElementValueGen0.getValueString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Dont call getValueString() on a non STRING ElementValue
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 3781;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(int0, int0, constantPoolGen0);
      // Undeclared exception!
      try { 
        simpleElementValueGen0.getValueInt();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Dont call getValueString() on a non STRING ElementValue
         //
      }
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = (-1289);
      Constant[] constantArray0 = new Constant[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      short short0 = (short) (-1458);
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(int0, constantPoolGen0, short0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      int int1 = 2278;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, int1);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        simpleElementValueGen0.dump(dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValueGen doesnt know how to write out type -1289
         //
      }
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = (-2403);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(int0, int0, constantPoolGen0);
      simpleElementValueGen0.getElementValue();
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = (-1583);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "<init>(ILorg/apache/bcel/generic/ConstantPoolGen;B)V";
      int int1 = constantPoolGen0.lookupMethodref(string0, string0, string0);
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(int0, constantPoolGen0, (float) int1);
      // Undeclared exception!
      try { 
        simpleElementValueGen0.stringifyValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SimpleElementValueGen class does not know how to stringify type -1583
         //
      }
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 0;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      SimpleElementValueGen simpleElementValueGen0 = new SimpleElementValueGen(int0, int0, constantPoolGen0);
      simpleElementValueGen0.getIndex();
  }
}