/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:38:21 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.RuntimeVisibleAnnotations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RuntimeVisibleAnnotations_ESTest extends RuntimeVisibleAnnotations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 228, 191);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ConstantPool constantPool0 = new ConstantPool((Constant[]) null);
      RuntimeVisibleAnnotations runtimeVisibleAnnotations0 = null;
      try {
        runtimeVisibleAnnotations0 = new RuntimeVisibleAnnotations(0, (-3029), dataInputStream0, constantPool0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RuntimeVisibleAnnotations runtimeVisibleAnnotations0 = null;
      try {
        runtimeVisibleAnnotations0 = new RuntimeVisibleAnnotations(12, (-3375), (DataInput) null, (ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.Annotations", e);
      }
  }
}
