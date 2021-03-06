/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 19:06:55 GMT 2021
 */

package org.apache.bcel.verifier.structurals;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.generic.CompoundInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InstructionTargeter;
import org.apache.bcel.generic.LADD;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.Type;
import org.apache.bcel.verifier.structurals.ExceptionHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExceptionHandler_ESTest extends ExceptionHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, (InstructionHandle) null);
      InstructionHandle instructionHandle0 = exceptionHandler0.getHandlerStart();
      assertNull(instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LADD lADD0 = new LADD();
      InstructionList instructionList0 = new InstructionList(lADD0);
      InstructionHandle instructionHandle0 = instructionList0.insert((Instruction) lADD0, (Instruction) lADD0);
      instructionHandle0.addTargeter((InstructionTargeter) null);
      ExceptionHandler exceptionHandler0 = new ExceptionHandler((ObjectType) null, instructionHandle0);
      InstructionHandle instructionHandle1 = exceptionHandler0.getHandlerStart();
      assertTrue(instructionHandle1.hasTargeters());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectType objectType0 = Type.OBJECT;
      byte[] byteArray0 = new byte[2];
      InstructionList instructionList0 = new InstructionList(byteArray0);
      InstructionHandle instructionHandle0 = instructionList0.findHandle(0);
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, instructionHandle0);
      InstructionHandle instructionHandle1 = exceptionHandler0.getHandlerStart();
      assertEquals(0, instructionHandle1.getPosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Double double0 = new Double((-3248.681518415464));
      PUSH pUSH0 = new PUSH(constantPoolGen0, (Number) double0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      instructionList0.getByteCode();
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, instructionHandle0);
      InstructionHandle instructionHandle1 = exceptionHandler0.getHandlerStart();
      assertSame(instructionHandle1, instructionHandle0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectType objectType0 = Type.STRING;
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      Double double0 = new Double((-3248.681518415464));
      PUSH pUSH0 = new PUSH(constantPoolGen0, (Number) double0);
      InstructionList instructionList0 = pUSH0.getInstructionList();
      InstructionHandle instructionHandle0 = instructionList0.append((CompoundInstruction) pUSH0);
      ExceptionHandler exceptionHandler0 = new ExceptionHandler(objectType0, instructionHandle0);
      ObjectType objectType1 = exceptionHandler0.getExceptionType();
      assertEquals(1, objectType1.getSize());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      PUSH pUSH0 = new PUSH(constantPoolGen0, 0L);
      InstructionList instructionList0 = new InstructionList(pUSH0);
      InstructionHandle instructionHandle0 = instructionList0.insert(instructionList0);
      ExceptionHandler exceptionHandler0 = new ExceptionHandler((ObjectType) null, instructionHandle0);
      ObjectType objectType0 = exceptionHandler0.getExceptionType();
      assertNull(objectType0);
  }
}
