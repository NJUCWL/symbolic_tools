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
public class MULTIANEWARRAY_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 63;
      short short0 = (short)2589;
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(int0, short0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      mULTIANEWARRAY0.consumeStack(constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      mULTIANEWARRAY0.getExceptions();
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      mULTIANEWARRAY0.getDimensions();
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 4925;
      short short0 = (short)74;
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(int0, short0);
      OutputStream outputStream0 = null;
      DataOutputStream dataOutputStream0 = new DataOutputStream(outputStream0);
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY();
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = mULTIANEWARRAY0.equals(byteArray0);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      mULTIANEWARRAY0.initFromFile(byteSequence0, boolean0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 855;
      short short0 = (short)63;
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(int0, short0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 855. Constant pool size is: 256
         //
      }
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 74;
      short short0 = (short)76;
      MULTIANEWARRAY mULTIANEWARRAY0 = new MULTIANEWARRAY(int0, short0);
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        mULTIANEWARRAY0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}