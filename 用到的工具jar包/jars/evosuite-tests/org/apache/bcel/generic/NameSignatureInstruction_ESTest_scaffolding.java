/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 16 16:37:35 GMT 2021
 */

package org.apache.bcel.generic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NameSignatureInstruction_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.bcel.generic.NameSignatureInstruction"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NameSignatureInstruction_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.bcel.generic.IMPDEP1",
      "org.apache.bcel.generic.ISTORE",
      "org.apache.bcel.generic.LDC2_W",
      "org.apache.bcel.generic.INVOKESTATIC",
      "org.apache.bcel.generic.TypedInstruction",
      "org.apache.bcel.generic.StackProducer",
      "org.apache.bcel.generic.InvokeInstruction",
      "org.apache.bcel.generic.MULTIANEWARRAY",
      "org.apache.bcel.generic.IMPDEP2",
      "org.apache.bcel.generic.DSTORE",
      "org.apache.bcel.generic.LLOAD",
      "org.apache.bcel.generic.ANEWARRAY",
      "org.apache.bcel.generic.LoadInstruction",
      "org.apache.bcel.generic.Select",
      "org.apache.bcel.generic.NameSignatureInstruction",
      "org.apache.bcel.generic.StoreInstruction",
      "org.apache.bcel.generic.IF_ICMPEQ",
      "org.apache.bcel.generic.Instruction",
      "org.apache.bcel.generic.GOTO",
      "org.apache.bcel.generic.RET",
      "org.apache.bcel.generic.NEW",
      "org.apache.bcel.generic.JSR_W",
      "org.apache.bcel.generic.IF_ICMPNE",
      "org.apache.bcel.generic.LOOKUPSWITCH",
      "org.apache.bcel.generic.IFLT",
      "org.apache.bcel.generic.IFEQ",
      "org.apache.bcel.generic.IF_ICMPGE",
      "org.apache.bcel.generic.FieldInstruction",
      "org.apache.bcel.generic.INVOKESPECIAL",
      "org.apache.bcel.generic.LDC",
      "org.apache.bcel.generic.ILOAD",
      "org.apache.bcel.generic.SIPUSH",
      "org.apache.bcel.generic.FieldOrMethod",
      "org.apache.bcel.generic.CHECKCAST",
      "org.apache.bcel.generic.IFNE",
      "org.apache.bcel.generic.VariableLengthInstruction",
      "org.apache.bcel.generic.InstructionTargeter",
      "org.apache.bcel.generic.PUTSTATIC",
      "org.apache.bcel.generic.UnconditionalBranch",
      "org.apache.bcel.generic.IndexedInstruction",
      "org.apache.bcel.generic.BIPUSH",
      "org.apache.bcel.generic.InstructionComparator$1",
      "org.apache.bcel.generic.LocalVariableInstruction",
      "org.apache.bcel.generic.GETFIELD",
      "org.apache.bcel.generic.INVOKEDYNAMIC",
      "org.apache.bcel.generic.GOTO_W",
      "org.apache.bcel.generic.JsrInstruction",
      "org.apache.bcel.generic.TABLESWITCH",
      "org.apache.bcel.generic.PushInstruction",
      "org.apache.bcel.generic.ALOAD",
      "org.apache.bcel.generic.LSTORE",
      "org.apache.bcel.generic.FLOAD",
      "org.apache.bcel.generic.JSR",
      "org.apache.bcel.generic.IF_ICMPLE",
      "org.apache.bcel.generic.BREAKPOINT",
      "org.apache.bcel.generic.GotoInstruction",
      "org.apache.bcel.generic.ConstantPushInstruction",
      "org.apache.bcel.generic.IFNULL",
      "org.apache.bcel.generic.ASTORE",
      "org.apache.bcel.generic.INVOKEVIRTUAL",
      "org.apache.bcel.generic.INSTANCEOF",
      "org.apache.bcel.generic.IFNONNULL",
      "org.apache.bcel.generic.LoadClass",
      "org.apache.bcel.generic.INVOKEINTERFACE",
      "org.apache.bcel.generic.InstructionComparator",
      "org.apache.bcel.generic.IF_ICMPGT",
      "org.apache.bcel.generic.AllocationInstruction",
      "org.apache.bcel.generic.NEWARRAY",
      "org.apache.bcel.generic.ClassGenException",
      "org.apache.bcel.generic.GETSTATIC",
      "org.apache.bcel.generic.IF_ACMPEQ",
      "org.apache.bcel.generic.StackConsumer",
      "org.apache.bcel.generic.BranchInstruction",
      "org.apache.bcel.generic.IFGT",
      "org.apache.bcel.generic.LDC_W",
      "org.apache.bcel.generic.DLOAD",
      "org.apache.bcel.generic.IINC",
      "org.apache.bcel.generic.IFLE",
      "org.apache.bcel.generic.IFGE",
      "org.apache.bcel.generic.IF_ICMPLT",
      "org.apache.bcel.generic.PUTFIELD",
      "org.apache.bcel.generic.PopInstruction",
      "org.apache.bcel.generic.ExceptionThrower",
      "org.apache.bcel.generic.CPInstruction",
      "org.apache.bcel.generic.IF_ACMPNE",
      "org.apache.bcel.generic.IfInstruction",
      "org.apache.bcel.generic.FSTORE"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NameSignatureInstruction_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.bcel.generic.InstructionComparator$1",
      "org.apache.bcel.generic.InstructionComparator",
      "org.apache.bcel.generic.Instruction",
      "org.apache.bcel.generic.CPInstruction",
      "org.apache.bcel.generic.NameSignatureInstruction"
    );
  }
}
