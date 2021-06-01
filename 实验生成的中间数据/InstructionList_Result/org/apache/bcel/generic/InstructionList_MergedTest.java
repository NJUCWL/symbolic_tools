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
public class InstructionList_MergedTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      instructionList0.replaceConstantPool(constantPoolGen0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DALOAD dALOAD0 = (DALOAD)InstructionConstants.DALOAD;
      InstructionList instructionList0 = new InstructionList(dALOAD0);
      DCMPL dCMPL0 = new DCMPL();
      instructionList0.append((Instruction) dALOAD0, (Instruction) dCMPL0);
  }
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-91);
      byteArray0[2] = byte0;
      InstructionList instructionList0 = new InstructionList(byteArray0);
  }
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BALOAD bALOAD0 = new BALOAD();
      InstructionList instructionList0 = new InstructionList(bALOAD0);
      instructionList0.insert((Instruction) bALOAD0, (Instruction) bALOAD0);
  }
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DCMPL dCMPL0 = new DCMPL();
      InstructionList instructionList0 = new InstructionList(dCMPL0);
      instructionList0.delete((Instruction) dCMPL0);
  }
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IXOR iXOR0 = new IXOR();
      InstructionList instructionList0 = new InstructionList(iXOR0);
  }
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BranchInstruction branchInstruction0 = null;
      InstructionList instructionList0 = new InstructionList();
      // Undeclared exception!
      try { 
        instructionList0.insert(branchInstruction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Assigning null to handle
         //
      }
  }
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LNEG lNEG0 = new LNEG();
      InstructionList instructionList0 = new InstructionList(lNEG0);
      int[] intArray0 = new int[3];
      int int0 = 923;
      InstructionHandle[] instructionHandleArray0 = new InstructionHandle[3];
      SWITCH sWITCH0 = new SWITCH(intArray0, instructionHandleArray0, instructionHandleArray0[1], int0);
      instructionList0.insert((CompoundInstruction) sWITCH0);
  }
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Boolean boolean0 = Boolean.TRUE;
      PUSH pUSH0 = new PUSH(constantPoolGen0, boolean0);
      InstructionList instructionList0 = new InstructionList(pUSH0);
  }
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      Boolean boolean0 = Boolean.FALSE;
      PUSH pUSH0 = new PUSH(constantPoolGen0, boolean0);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      IF_ACMPNE iF_ACMPNE0 = new IF_ACMPNE();
      IfInstruction ifInstruction0 = iF_ACMPNE0.negate();
      BranchHandle branchHandle0 = BranchHandle.getBranchHandle(ifInstruction0);
      MONITOREXIT mONITOREXIT0 = new MONITOREXIT();
      instructionList0.append((InstructionHandle) branchHandle0, (Instruction) mONITOREXIT0);
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      InstructionListObserver instructionListObserver0 = mock(InstructionListObserver.class, new ViolatedAssumptionAnswer());
      instructionList0.addObserver(instructionListObserver0);
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      short short0 = Constants.LSTORE_3;
      PUSH pUSH0 = new PUSH(constantPoolGen0, (Number) short0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = null;
      instructionList0.redirectBranches(instructionHandle0, instructionHandle0);
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = null;
      int int0 = 246;
      PUSH pUSH0 = new PUSH(constantPoolGen0, int0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      instructionList0.dispose();
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      char char0 = 'R';
      Character character0 = Character.valueOf(char0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, character0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      Class<LDC_W> class0 = LDC_W.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[6];
      String[] stringArray0 = new String[3];
      String string0 = "`f]b=`e={gb}75";
      MethodGen methodGen0 = null;
      try {
        methodGen0 = new MethodGen(char0, type0, typeArray0, stringArray0, string0, stringArray0[0], instructionList0, constantPoolGen0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatch in argument array lengths: 6 vs. 3
         //
      }
  }
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      int int0 = 0;
      BasicType basicType0 = Type.BYTE;
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = new String[0];
      String string0 = " vvk[wzryw%.ow!Ev";
      Constant[] constantArray0 = new Constant[2];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen(constantPool0);
      MethodGen methodGen0 = new MethodGen(int0, basicType0, typeArray0, stringArray0, string0, string0, instructionList0, constantPoolGen0);
      methodGen0.copy(string0, constantPoolGen0);
  }
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      instructionList0.setPositions();
  }
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LCMP lCMP0 = (LCMP)InstructionConstants.LCMP;
      InstructionList instructionList0 = new InstructionList(lCMP0);
      instructionList0.append((Instruction) lCMP0, instructionList0);
  }
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BranchInstruction branchInstruction0 = null;
      InstructionList instructionList0 = null;
      try {
        instructionList0 = new InstructionList(branchInstruction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Assigning null to handle
         //
      }
  }
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      FDIV fDIV0 = new FDIV();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(fDIV0);
      instructionList0.append(instructionHandle0, instructionList0);
  }
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      String string0 = "<init>([B)V";
      Boolean boolean0 = new Boolean(string0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, boolean0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      instructionList0.size();
  }
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      boolean boolean0 = true;
      Boolean boolean1 = Boolean.valueOf(boolean0);
      PUSH pUSH0 = new PUSH(constantPoolGen0, boolean1);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      instructionList0.getEnd();
  }
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      instructionList0.copy();
  }
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IFNE iFNE0 = new IFNE();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) iFNE0);
      // Undeclared exception!
      try { 
        instructionList0.insert((Instruction) iFNE0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IFNULL iFNULL0 = new IFNULL();
      InstructionList instructionList0 = new InstructionList((BranchInstruction) iFNULL0);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) iFNULL0, instructionList0);
      // Undeclared exception!
      try { 
        instructionList0.insert(instructionHandle0, (Instruction) iFNULL0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      instructionList0.getInstructions();
  }
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ARETURN aRETURN0 = new ARETURN();
      InstructionList instructionList0 = new InstructionList(aRETURN0);
  }
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SALOAD sALOAD0 = (SALOAD)InstructionConstants.SALOAD;
      InstructionList instructionList0 = new InstructionList(sALOAD0);
      instructionList0.getInstructions();
  }
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      InstructionHandle instructionHandle0 = null;
      IFGT iFGT0 = new IFGT(instructionHandle0);
      // Undeclared exception!
      try { 
        instructionList0.append(instructionHandle0, (BranchInstruction) iFGT0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      LADD lADD0 = (LADD)InstructionConstants.LADD;
      // Undeclared exception!
      try { 
        instructionList0.delete((Instruction) lADD0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Instruction ladd[97](1) is not contained in this list.
         //
      }
  }
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      instructionList0.getByteCode();
  }
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.getEnd();
      POP2 pOP2_0 = (POP2)InstructionConstants.POP2;
      // Undeclared exception!
      try { 
        instructionList0.insert(instructionHandle0, (Instruction) pOP2_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      instructionList0.update();
  }
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      DADD dADD0 = (DADD)InstructionConstants.DADD;
      IFLT iFLT0 = new IFLT();
      // Undeclared exception!
      try { 
        instructionList0.insert((Instruction) dADD0, (Instruction) iFLT0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      DALOAD dALOAD0 = new DALOAD();
      InstructionHandle instructionHandle0 = InstructionHandle.getInstructionHandle(dALOAD0);
      // Undeclared exception!
      try { 
        instructionList0.delete(instructionHandle0, instructionHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InstructionList instructionList0 = new InstructionList();
      IFGE iFGE0 = new IFGE();
      BranchHandle branchHandle0 = instructionList0.append((BranchInstruction) iFGE0);
      // Undeclared exception!
      try { 
        instructionList0.move((InstructionHandle) branchHandle0, (InstructionHandle) branchHandle0, (InstructionHandle) branchHandle0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }
}