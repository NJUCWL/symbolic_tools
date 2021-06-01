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
public class FieldOrMethod_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      INVOKEVIRTUAL iNVOKEVIRTUAL0 = new INVOKEVIRTUAL();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEVIRTUAL0.getReferenceType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      PUTSTATIC pUTSTATIC0 = new PUTSTATIC();
      // Undeclared exception!
      try { 
        instConstraintVisitor0.visitPUTSTATIC(pUTSTATIC0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      INVOKESPECIAL iNVOKESPECIAL0 = new INVOKESPECIAL();
      ConstantPoolGen constantPoolGen0 = null;
      // Undeclared exception!
      try { 
        iNVOKESPECIAL0.getLoadClassType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 0;
      GETFIELD gETFIELD0 = new GETFIELD(int0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        gETFIELD0.getClassType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      INVOKEINTERFACE iNVOKEINTERFACE0 = new INVOKEINTERFACE();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      // Undeclared exception!
      try { 
        iNVOKEINTERFACE0.getType(constantPoolGen0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}