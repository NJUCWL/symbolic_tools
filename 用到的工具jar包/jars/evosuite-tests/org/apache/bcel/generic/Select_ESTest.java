/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 16:49:53 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GETFIELD;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.LOOKUPSWITCH;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.SWITCH;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.util.ByteSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Select_ESTest extends Select_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[21];
      byteArray0[0] = (byte)1;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      tABLESWITCH0.initFromFile(byteSequence0, false);
      assertEquals(16, byteSequence0.getIndex());
      assertEquals(16777216, tABLESWITCH0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "(1C*ib;:5");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setMatch((-93), (-93));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -93
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.padding = 4;
      int int0 = lOOKUPSWITCH0.getFixed_length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      // Undeclared exception!
      try { 
        tABLESWITCH0.getIndices((-742));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[0];
      lOOKUPSWITCH0.indices = intArray0;
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getMatch(6119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[4];
      lOOKUPSWITCH0.indices = intArray0;
      int[] intArray1 = lOOKUPSWITCH0.getMatchs();
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList0 = new InstructionList();
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) lOOKUPSWITCH0);
      BranchHandle branchHandle1 = instructionList0.append((InstructionHandle) branchHandle0, (BranchInstruction) lOOKUPSWITCH0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.updateTarget(branchHandle1, branchHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.updatePosition(1571, (-411));
      lOOKUPSWITCH0.setOpcode((short)132);
      lOOKUPSWITCH0.toString();
      assertEquals(0, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.padding = 1571;
      lOOKUPSWITCH0.setOpcode((short)132);
      String string0 = lOOKUPSWITCH0.toString();
      assertEquals("iinc[132](1) -> null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      tABLESWITCH0.setIndex((byte) (-95));
      int int0 = tABLESWITCH0.updatePosition(39, 0);
      assertEquals(0, tABLESWITCH0.getLength());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      tABLESWITCH0.setMatch_length(256);
      int int0 = tABLESWITCH0.updatePosition(39, 0);
      assertEquals(0, tABLESWITCH0.getLength());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      lOOKUPSWITCH0.setTargets(instructionHandleArray0);
      assertEquals(0, lOOKUPSWITCH0.getIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      lOOKUPSWITCH0.setFixed_length((-361));
      assertEquals(1, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[2];
      lOOKUPSWITCH0.setMatches(intArray0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      tABLESWITCH0.updatePosition(6115, 0);
      int int0 = tABLESWITCH0.getFixed_length();
      assertEquals(0, tABLESWITCH0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.setMatch_length(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int int0 = lOOKUPSWITCH0.getPadding();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.updatePosition(1882, 120);
      assertEquals(0, int0);
      
      int int1 = tABLESWITCH0.getPadding();
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      tABLESWITCH0.padding = (-1);
      int int0 = tABLESWITCH0.getPadding();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.getMatch_length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      InstructionList instructionList0 = new InstructionList();
      JSR jSR0 = new JSR();
      BranchHandle branchHandle0 = instructionList0.insert((BranchInstruction) jSR0);
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH(intArray0, instructionHandleArray0, branchHandle0);
      int int0 = tABLESWITCH0.getMatch_length();
      assertTrue(branchHandle0.hasTargeters());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int int0 = tABLESWITCH0.setMatch_length((-113));
      int int1 = tABLESWITCH0.getMatch_length();
      assertEquals((-113), int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = new int[13];
      lOOKUPSWITCH0.setIndices(intArray0);
      int int0 = lOOKUPSWITCH0.getIndices(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[8];
      tABLESWITCH0.setIndices(intArray0);
      int[] intArray1 = tABLESWITCH0.getIndices();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.toString(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) lOOKUPSWITCH0);
      InstructionHandle instructionHandle0 = instructionList0.getStart();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setTarget(1040, instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      // Undeclared exception!
      try { 
        tABLESWITCH0.setMatch((-442), (-442));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      int[] intArray0 = new int[3];
      tABLESWITCH0.setIndices(intArray0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.setIndices(245, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 245
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.initFromFile((ByteSequence) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[22];
      byteArray0[4] = (byte)103;
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      // Undeclared exception!
      try { 
        tABLESWITCH0.initFromFile(byteSequence0, false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.TABLESWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      // Undeclared exception!
      try { 
        tABLESWITCH0.dispose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.containsTarget(instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setTarget((-93), instructionHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -93
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionList instructionList1 = new InstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList1);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      boolean boolean0 = lOOKUPSWITCH0.containsTarget((InstructionHandle) null);
      assertEquals(17, lOOKUPSWITCH0.getLength());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[0]);
      boolean boolean0 = lOOKUPSWITCH0.containsTarget(instructionHandle0);
      assertFalse(boolean0);
      assertEquals(17, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionList instructionList1 = new InstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList1);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      lOOKUPSWITCH0.updateTarget((InstructionHandle) null, (InstructionHandle) null);
      assertEquals(17, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      tABLESWITCH0.setOpcode((short)145);
      String string0 = tABLESWITCH0.toString(false);
      assertEquals("i2b -> null ...", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      byte[] byteArray0 = new byte[7];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.readUnsignedByte();
      try { 
        tABLESWITCH0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      File file0 = MockFile.createTempFile("NQ,/F#oG.A", "NQ,/F#oG.A");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      lOOKUPSWITCH0.updatePosition(0, 0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(6119);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid branch target position offset for lookupswitch[171](17):-1:  -1: ldc[18](2) 3
         //
         verifyException("org.apache.bcel.generic.BranchInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-135);
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[8];
      GETFIELD gETFIELD0 = new GETFIELD();
      InstructionList instructionList0 = new InstructionList(gETFIELD0);
      InstructionHandle instructionHandle0 = instructionList0.append((Instruction) gETFIELD0);
      SWITCH sWITCH0 = null;
      try {
        sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Match and target array have not the same length: Match length: 2 Target length: 8
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TABLESWITCH tABLESWITCH0 = new TABLESWITCH();
      InstructionHandle[] instructionHandleArray0 = tABLESWITCH0.getTargets();
      assertNull(instructionHandleArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.setIndices(6143, 6122);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      int[] intArray0 = lOOKUPSWITCH0.getIndices();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, "' does not implement '");
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append(instructionList0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, instructionHandle0);
      lOOKUPSWITCH0.updateTarget((InstructionHandle) null, (InstructionHandle) null);
      assertTrue(instructionHandle0.hasTargeters());
      assertEquals(17, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.getTarget((-1379));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }
}
