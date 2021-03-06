/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:45:11 GMT 2021
 */

package org.apache.bcel.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Visitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeException_ESTest extends CodeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 0, 852);
      int int0 = codeException0.getStartPC();
      assertEquals(0, int0);
      assertEquals(0, codeException0.getEndPC());
      assertEquals(0, codeException0.getHandlerPC());
      assertEquals(852, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeException codeException0 = new CodeException(3191, 612, 612, 0);
      int int0 = codeException0.getStartPC();
      assertEquals(3191, int0);
      assertEquals(0, codeException0.getCatchType());
      assertEquals(612, codeException0.getEndPC());
      assertEquals(612, codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, (-1483), 0, (-1483));
      codeException0.setHandlerPC(1795);
      int int0 = codeException0.getHandlerPC();
      assertEquals(1795, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      int int0 = codeException0.getHandlerPC();
      assertEquals((-1120), codeException0.getStartPC());
      assertEquals(0, codeException0.getEndPC());
      assertEquals((-1120), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeException codeException0 = new CodeException(1347, 1347, 1347, 1347);
      int int0 = codeException0.getEndPC();
      assertEquals(1347, int0);
      assertEquals(1347, codeException0.getCatchType());
      assertEquals(1347, codeException0.getStartPC());
      assertEquals(1347, codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeException codeException0 = new CodeException((-52), (-52), (-52), 0);
      int int0 = codeException0.getEndPC();
      assertEquals(0, codeException0.getCatchType());
      assertEquals((-52), int0);
      assertEquals((-52), codeException0.getStartPC());
      assertEquals((-52), codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 0, 0);
      int int0 = codeException0.getCatchType();
      assertEquals(0, codeException0.getEndPC());
      assertEquals(0, codeException0.getHandlerPC());
      assertEquals(0, codeException0.getStartPC());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeException codeException0 = new CodeException(1347, 1347, 1347, 1347);
      int int0 = codeException0.getCatchType();
      assertEquals(1347, int0);
      assertEquals(1347, codeException0.getStartPC());
      assertEquals(1347, codeException0.getHandlerPC());
      assertEquals(1347, codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, (-1483), 0, (-1483));
      codeException0.setHandlerPC(1795);
      codeException0.copy();
      assertEquals(1795, codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeException codeException0 = new CodeException(1485, 1485, 0, 1485);
      CodeException codeException1 = codeException0.copy();
      assertEquals(1485, codeException1.getCatchType());
      assertEquals(1485, codeException1.getStartPC());
      assertEquals(1485, codeException1.getEndPC());
      assertEquals(0, codeException1.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, (-1483), 0, (-1483));
      codeException0.setCatchType(2902);
      codeException0.copy();
      assertEquals(2902, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1754), 0, (-964), (-964));
      CodeException codeException1 = codeException0.copy();
      assertEquals((-964), codeException1.getCatchType());
      assertEquals((-1754), codeException1.getStartPC());
      assertEquals(0, codeException1.getEndPC());
      assertEquals((-964), codeException1.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 1, 0, 1);
      // Undeclared exception!
      try { 
        codeException0.toString((ConstantPool) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1970), (-1970), (-1970), (-1970));
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        codeException0.toString(constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -1970. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 1630, 1630, (-3298));
      // Undeclared exception!
      try { 
        codeException0.toString((ConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeException codeException0 = new CodeException(1347, 1347, 1347, 1347);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        codeException0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeException codeException0 = new CodeException(99, 99, 0, 99);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        codeException0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeException codeException0 = new CodeException(537, 2279, 21, 0);
      // Undeclared exception!
      try { 
        codeException0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException((CodeException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)24, (byte)24);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = codeException0.toString(constantPool0, false);
      assertEquals("-1120\t0\t-1120\t<Any exception>(0)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      CodeException codeException0 = new CodeException(dataInputStream0);
      assertEquals(0, codeException0.getEndPC());
      assertEquals(0, codeException0.getHandlerPC());
      assertEquals(0, codeException0.getStartPC());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1385), 0, 0, (-2590));
      int int0 = codeException0.getCatchType();
      assertEquals(0, codeException0.getEndPC());
      assertEquals((-2590), int0);
      assertEquals(0, codeException0.getHandlerPC());
      assertEquals((-1385), codeException0.getStartPC());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      int int0 = codeException0.getStartPC();
      assertEquals((-1120), int0);
      assertEquals((-1120), codeException0.getHandlerPC());
      assertEquals(0, codeException0.getEndPC());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      int int0 = codeException0.getEndPC();
      assertEquals((-1120), codeException0.getHandlerPC());
      assertEquals((-1120), codeException0.getStartPC());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 0, 0);
      int int0 = codeException0.getHandlerPC();
      assertEquals(0, codeException0.getStartPC());
      assertEquals(0, codeException0.getEndPC());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 0, 0);
      codeException0.setCatchType(2902);
      Constant[] constantArray0 = new Constant[1];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      // Undeclared exception!
      try { 
        codeException0.toString(constantPool0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 2902. Constant pool size is: 1
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 0, 0);
      codeException0.setEndPC(0);
      assertEquals(0, codeException0.getStartPC());
      assertEquals(0, codeException0.getEndPC());
      assertEquals(0, codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      String string0 = codeException0.toString();
      assertEquals("CodeException(start_pc = -1120, end_pc = 0, handler_pc = -1120, catch_type = 0)", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      assertEquals(0, codeException0.getCatchType());
      
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      String string0 = codeException0.toString(constantPool0);
      assertEquals("-1120\t0\t-1120\t<Any exception>(0)", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeException codeException0 = new CodeException(103, 103, 103, 103);
      EmptyVisitor emptyVisitor0 = new EmptyVisitor();
      DescendingVisitor descendingVisitor0 = new DescendingVisitor((JavaClass) null, emptyVisitor0);
      codeException0.accept(descendingVisitor0);
      assertEquals(103, codeException0.getEndPC());
      assertEquals(103, codeException0.getHandlerPC());
      assertEquals(103, codeException0.getStartPC());
      assertEquals(103, codeException0.getCatchType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeException codeException0 = new CodeException(0, 0, 0, 0);
      CodeException codeException1 = codeException0.copy();
      assertEquals(0, codeException1.getCatchType());
      assertEquals(0, codeException1.getEndPC());
      assertEquals(0, codeException1.getStartPC());
      assertEquals(0, codeException1.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      assertEquals((-1120), codeException0.getStartPC());
      
      codeException0.setStartPC(0);
      assertEquals((-1120), codeException0.getHandlerPC());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CodeException codeException0 = new CodeException((-1120), 0, (-1120), 0);
      CodeException codeException1 = new CodeException(codeException0);
      assertEquals((-1120), codeException0.getHandlerPC());
      assertEquals((-1120), codeException0.getStartPC());
      assertEquals(0, codeException1.getCatchType());
      assertEquals(0, codeException1.getEndPC());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CodeException codeException0 = null;
      try {
        codeException0 = new CodeException((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.classfile.CodeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CodeException codeException0 = new CodeException(103, 103, 103, 103);
      MockPrintStream mockPrintStream0 = new MockPrintStream("N]l3Hthgl04");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      codeException0.dump(dataOutputStream0);
      assertEquals(103, codeException0.getHandlerPC());
      assertEquals(103, codeException0.getEndPC());
      assertEquals(103, codeException0.getStartPC());
      assertEquals(103, codeException0.getCatchType());
  }
}
