/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 18:02:13 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IFGT;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.LOOKUPSWITCH;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LOOKUPSWITCH_ESTest extends LOOKUPSWITCH_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      byte[] byteArray0 = new byte[15];
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      byteSequence0.readShort();
      lOOKUPSWITCH0.initFromFile(byteSequence0, true);
      assertEquals(2, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, (-1697L));
      InstructionList instructionList0 = new InstructionList(pUSH0);
      LLOAD lLOAD0 = new LLOAD(0);
      InstructionHandle instructionHandle0 = new InstructionHandle(lLOAD0);
      IFGT iFGT0 = new IFGT(instructionHandle0);
      IfInstruction ifInstruction0 = iFGT0.negate();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) ifInstruction0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, branchHandle0);
      lOOKUPSWITCH0.setPosition(16);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.bcel.generic.LOOKUPSWITCH");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Target of lookupswitch[171](17) is invalid null handle
         //
         verifyException("org.apache.bcel.generic.BranchInstruction", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.initFromFile((ByteSequence) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-38);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.initFromFile(byteSequence0, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.LOOKUPSWITCH", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
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
  public void test06()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        lOOKUPSWITCH0.dump(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      ExecutionVisitor executionVisitor0 = new ExecutionVisitor();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.accept(executionVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.verifier.structurals.ExecutionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[0];
      Constant[] constantArray0 = new Constant[0];
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantArray0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, (-1697L));
      InstructionList instructionList0 = new InstructionList(pUSH0);
      LLOAD lLOAD0 = new LLOAD();
      InstructionHandle instructionHandle0 = new InstructionHandle(lLOAD0);
      IFGT iFGT0 = new IFGT(instructionHandle0);
      IfInstruction ifInstruction0 = iFGT0.negate();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) ifInstruction0);
      LOOKUPSWITCH lOOKUPSWITCH0 = null;
      try {
        lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, branchHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Match and target array have not the same length: Match length: 1 Target length: 0
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[9];
      LOOKUPSWITCH lOOKUPSWITCH0 = null;
      try {
        lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, (InstructionHandle[]) null, (InstructionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.generic.Select", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      byte[] byteArray0 = new byte[20];
      byteArray0[7] = (byte) (-4);
      ByteSequence byteSequence0 = new ByteSequence(byteArray0);
      try { 
        lOOKUPSWITCH0.initFromFile(byteSequence0, false);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[1];
      InstructionList instructionList0 = new InstructionList();
      LLOAD lLOAD0 = new LLOAD(0);
      InstructionHandle instructionHandle0 = new InstructionHandle(lLOAD0);
      IFGT iFGT0 = new IFGT(instructionHandle0);
      IfInstruction ifInstruction0 = iFGT0.negate();
      BranchHandle branchHandle0 = instructionList0.insert(instructionHandle0, (BranchInstruction) ifInstruction0);
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH(intArray0, instructionHandleArray0, branchHandle0);
      lOOKUPSWITCH0.setTarget(0, (InstructionHandle) branchHandle0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.bcel.generic.LOOKUPSWITCH");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      lOOKUPSWITCH0.dump(dataOutputStream0);
      assertEquals(17, lOOKUPSWITCH0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LOOKUPSWITCH lOOKUPSWITCH0 = new LOOKUPSWITCH();
      InstConstraintVisitor instConstraintVisitor0 = new InstConstraintVisitor();
      // Undeclared exception!
      try { 
        lOOKUPSWITCH0.accept(instConstraintVisitor0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.bcel.Const", e);
      }
  }
}
