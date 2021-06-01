package org.apache.bcel.util;

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
public class InstructionFinder_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "dconst";
      PUSH pUSH0 = new PUSH(constantPoolGen0, string0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
      InstructionHandle instructionHandle0 = null;
      // Undeclared exception!
      try { 
        instructionFinder0.search(string0, instructionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction handle null not found in instruction list.
         //
      }
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
      String string0 = "]T|EDuaK~H)e";
      InstructionFinder.CodeConstraint instructionFinder_CodeConstraint0 = mock(InstructionFinder.CodeConstraint.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        instructionFinder0.search(string0, instructionFinder_CodeConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction unknown: t
         //
      }
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ARETURN aRETURN0 = (ARETURN)InstructionConstants.ARETURN;
      InstructionList instructionList0 = new InstructionList(aRETURN0);
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
      instructionFinder0.getInstructionList();
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      F2I f2I0 = new F2I();
      InstructionList instructionList0 = new InstructionList(f2I0);
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
      String string0 = "ifne";
      instructionFinder0.search(string0);
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      InstructionFinder instructionFinder0 = new InstructionFinder(instructionList0);
      String string0 = "fcmpl";
      InstructionFinder.CodeConstraint instructionFinder_CodeConstraint0 = mock(InstructionFinder.CodeConstraint.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        instructionFinder0.search(string0, instructionFinder_CodeConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction handle null not found in instruction list.
         //
      }
  }
}