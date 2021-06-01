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
public class EnumElementValueGen_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 4838;
      ConstantPoolGen constantPoolGen0 = null;
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      // Undeclared exception!
      try { 
        enumElementValueGen0.getEnumValueString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = (-1);
      ConstantPoolGen constantPoolGen0 = null;
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      enumElementValueGen0.getValueIndex();
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      String string0 = "";
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(objectType0, string0, constantPoolGen0);
      enumElementValueGen0.stringifyValue();
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = (-1768);
      ConstantPoolGen constantPoolGen0 = null;
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      // Undeclared exception!
      try { 
        enumElementValueGen0.getElementValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = 464;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      OutputStream outputStream0 = null;
      DataOutputStream dataOutputStream0 = new DataOutputStream(outputStream0);
      // Undeclared exception!
      try { 
        enumElementValueGen0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 1;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      enumElementValueGen0.getTypeIndex();
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 3464;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      EnumElementValueGen enumElementValueGen0 = new EnumElementValueGen(int0, int0, constantPoolGen0);
      // Undeclared exception!
      try { 
        enumElementValueGen0.getElementValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3464
         //
      }
  }
}