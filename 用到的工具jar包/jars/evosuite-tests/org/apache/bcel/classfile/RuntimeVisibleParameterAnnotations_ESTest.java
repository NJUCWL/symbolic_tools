/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:45:27 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RuntimeVisibleParameterAnnotations_ESTest extends RuntimeVisibleParameterAnnotations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RuntimeVisibleParameterAnnotations runtimeVisibleParameterAnnotations0 = null;
      try {
        runtimeVisibleParameterAnnotations0 = new RuntimeVisibleParameterAnnotations(0, 0, (DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.ParameterAnnotations", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(51);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      RuntimeVisibleParameterAnnotations runtimeVisibleParameterAnnotations0 = null;
      try {
        runtimeVisibleParameterAnnotations0 = new RuntimeVisibleParameterAnnotations(0, 0, dataInputStream0, constantPool0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)79;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 165);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      RuntimeVisibleParameterAnnotations runtimeVisibleParameterAnnotations0 = null;
      try {
        runtimeVisibleParameterAnnotations0 = new RuntimeVisibleParameterAnnotations(7, 0, dataInputStream0, (ConstantPool) null);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      RuntimeVisibleParameterAnnotations runtimeVisibleParameterAnnotations0 = new RuntimeVisibleParameterAnnotations(0, 0, dataInputStream0, (ConstantPool) null);
      assertEquals(0, runtimeVisibleParameterAnnotations0.getNameIndex());
  }
}
