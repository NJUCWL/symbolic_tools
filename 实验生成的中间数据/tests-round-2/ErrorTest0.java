
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    org.apache.bcel.generic.InstructionHandle instructionHandle0 = null;
    org.apache.bcel.generic.GOTO_W gOTO_W1 = new org.apache.bcel.generic.GOTO_W(instructionHandle0);
    
    // Checks the contract:  gOTO_W1.equals(gOTO_W1)
    org.junit.Assert.assertTrue("Contract failed: gOTO_W1.equals(gOTO_W1)", gOTO_W1.equals(gOTO_W1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    org.apache.bcel.generic.InstructionHandle instructionHandle0 = null;
    org.apache.bcel.generic.IF_ICMPLE iF_ICMPLE1 = new org.apache.bcel.generic.IF_ICMPLE(instructionHandle0);
    
    // Checks the contract:  iF_ICMPLE1.equals(iF_ICMPLE1)
    org.junit.Assert.assertTrue("Contract failed: iF_ICMPLE1.equals(iF_ICMPLE1)", iF_ICMPLE1.equals(iF_ICMPLE1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    org.apache.bcel.generic.InstructionHandle instructionHandle0 = null;
    org.apache.bcel.generic.IFGE iFGE1 = new org.apache.bcel.generic.IFGE(instructionHandle0);
    
    // Checks the contract:  iFGE1.equals(iFGE1)
    org.junit.Assert.assertTrue("Contract failed: iFGE1.equals(iFGE1)", iFGE1.equals(iFGE1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    org.apache.bcel.classfile.ConstantClass constantClass1 = new org.apache.bcel.classfile.ConstantClass((int)(short)94);
    
    // Checks the contract:  !constantClass1.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constantClass1.equals(null)", !constantClass1.equals(null));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    org.apache.bcel.classfile.ConstantString constantString1 = new org.apache.bcel.classfile.ConstantString((int)(short)226);
    
    // Checks the contract:  !constantString1.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constantString1.equals(null)", !constantString1.equals(null));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.apache.bcel.generic.InstructionHandle instructionHandle0 = null;
    org.apache.bcel.generic.IFNULL iFNULL1 = new org.apache.bcel.generic.IFNULL(instructionHandle0);
    
    // Checks the contract:  iFNULL1.equals(iFNULL1)
    org.junit.Assert.assertTrue("Contract failed: iFNULL1.equals(iFNULL1)", iFNULL1.equals(iFNULL1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    org.apache.bcel.generic.InstructionHandle instructionHandle0 = null;
    org.apache.bcel.generic.IF_ACMPEQ iF_ACMPEQ1 = new org.apache.bcel.generic.IF_ACMPEQ(instructionHandle0);
    
    // Checks the contract:  iF_ACMPEQ1.equals(iF_ACMPEQ1)
    org.junit.Assert.assertTrue("Contract failed: iF_ACMPEQ1.equals(iF_ACMPEQ1)", iF_ACMPEQ1.equals(iF_ACMPEQ1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    org.apache.bcel.verifier.structurals.LocalVariables localVariables0 = null;
    org.apache.bcel.verifier.structurals.OperandStack operandStack1 = null;
    org.apache.bcel.verifier.structurals.Frame frame2 = new org.apache.bcel.verifier.structurals.Frame(localVariables0, operandStack1);
    
    // Checks the contract:  frame2.equals(frame2)
    org.junit.Assert.assertTrue("Contract failed: frame2.equals(frame2)", frame2.equals(frame2));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList3.findHandle(0);
    org.apache.bcel.generic.IFLE iFLE6 = new org.apache.bcel.generic.IFLE(instructionHandle5);
    
    // Checks the contract:  iFLE6.equals(iFLE6)
    org.junit.Assert.assertTrue("Contract failed: iFLE6.equals(iFLE6)", iFLE6.equals(iFLE6));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    org.apache.bcel.classfile.ConstantMethodref constantMethodref2 = new org.apache.bcel.classfile.ConstantMethodref(0, 8);
    
    // Checks the contract:  !constantMethodref2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constantMethodref2.equals(null)", !constantMethodref2.equals(null));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    org.apache.bcel.classfile.ConstantClass constantClass1 = new org.apache.bcel.classfile.ConstantClass((int)(short)40);
    
    // Checks the contract:  !constantClass1.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constantClass1.equals(null)", !constantClass1.equals(null));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.apache.bcel.util.ClassPath classPath0 = null;
    org.apache.bcel.util.ClassPath classPath2 = new org.apache.bcel.util.ClassPath(classPath0, "<clinit>");
    org.apache.bcel.util.ClassPath classPath4 = new org.apache.bcel.util.ClassPath(classPath2, "<clinit>");
    
    // Checks the contract:  classPath4.equals(classPath4)
    org.junit.Assert.assertTrue("Contract failed: classPath4.equals(classPath4)", classPath4.equals(classPath4));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.apache.bcel.util.ClassPath classPath0 = null;
    org.apache.bcel.util.ClassPath classPath2 = new org.apache.bcel.util.ClassPath(classPath0, "<clinit>");
    org.apache.bcel.util.ClassPath classPath4 = new org.apache.bcel.util.ClassPath(classPath2, "astore_0[75](1)");
    
    // Checks the contract:  classPath4.equals(classPath4)
    org.junit.Assert.assertTrue("Contract failed: classPath4.equals(classPath4)", classPath4.equals(classPath4));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction0);
    byte[] byte_array4 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle6 = instructionList5.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList1.append(instructionList5);
    org.apache.bcel.generic.ReturnaddressType returnaddressType8 = new org.apache.bcel.generic.ReturnaddressType(instructionHandle7);
    org.apache.bcel.generic.IF_ICMPEQ iF_ICMPEQ9 = new org.apache.bcel.generic.IF_ICMPEQ(instructionHandle7);
    
    // Checks the contract:  iF_ICMPEQ9.equals(iF_ICMPEQ9)
    org.junit.Assert.assertTrue("Contract failed: iF_ICMPEQ9.equals(iF_ICMPEQ9)", iF_ICMPEQ9.equals(iF_ICMPEQ9));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction0);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction2 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction2);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver4 = null;
    instructionList3.removeObserver(instructionListObserver4);
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList1.insert(instructionList3);
    org.apache.bcel.generic.IF_ACMPNE iF_ACMPNE7 = new org.apache.bcel.generic.IF_ACMPNE(instructionHandle6);
    
    // Checks the contract:  iF_ACMPNE7.equals(iF_ACMPNE7)
    org.junit.Assert.assertTrue("Contract failed: iF_ACMPNE7.equals(iF_ACMPNE7)", iF_ACMPNE7.equals(iF_ACMPNE7));

  }

}
