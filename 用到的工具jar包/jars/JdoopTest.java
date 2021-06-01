
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JdoopTest {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test001"); }

    org.apache.bcel.generic.ILOAD iLOAD1 = new org.apache.bcel.generic.ILOAD((int)(byte)0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test002"); }

    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array0 = new org.apache.bcel.generic.InstructionHandle[] {  };
    int[] i_array3 = new int[] { (short)1, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = org.apache.bcel.generic.InstructionList.findHandle(instructionHandle_array0, i_array3, (int)(byte)10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test003"); }

    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test004"); }

    short s0 = org.apache.bcel.Const.AASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)83);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test005"); }

    org.apache.bcel.generic.FRETURN fRETURN0 = new org.apache.bcel.generic.FRETURN();

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test006"); }

    int[] i_array6 = new int[] { (byte)0, (short)10, (short)10, (byte)-1, '#', '#' };
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = null;
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array8 = new org.apache.bcel.generic.InstructionHandle[] { instructionHandle7 };
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.TABLESWITCH tABLESWITCH10 = new org.apache.bcel.generic.TABLESWITCH(i_array6, instructionHandle_array8, instructionHandle9);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array8);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test007"); }

    short s0 = org.apache.bcel.Constants.LDC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)203);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test008"); }

    short s0 = org.apache.bcel.Constants.IF_ICMPLT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)161);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test009"); }

    short s0 = org.apache.bcel.Constants.MAJOR_1_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)45);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test010"); }

    short s0 = org.apache.bcel.Const.ACC_NATIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)256);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test011"); }

    short s0 = org.apache.bcel.Const.LALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)47);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test012"); }

    short s0 = org.apache.bcel.Constants.GETFIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)180);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test013"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test014"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ILOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test015"); }

    short s0 = org.apache.bcel.Constants.INVOKEVIRTUAL_QUICK_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)226);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test016"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Long;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test017"); }

    byte byte0 = org.apache.bcel.Const.ATTR_SIGNATURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test018"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ALOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test019"); }

    byte byte0 = org.apache.bcel.Const.ITEM_Long;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test020"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConst.SWAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test021"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.I2S;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test022"); }

    short s0 = org.apache.bcel.Constants.ILOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)27);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test023"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test024"); }

    short s0 = org.apache.bcel.Constants.ASTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)78);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test025"); }

    short s0 = org.apache.bcel.Constants.LCMP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)148);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test026"); }

    org.apache.bcel.classfile.CodeException codeException0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.CodeException codeException1 = new org.apache.bcel.classfile.CodeException(codeException0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test027"); }

    short s0 = org.apache.bcel.Constants.ASTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)77);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test028"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.PRIMITIVE_SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)83);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test029"); }

    short s0 = org.apache.bcel.Const.RESERVED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)-3);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test030"); }

    short s0 = org.apache.bcel.Const.IF_ICMPNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)160);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test031"); }

    org.apache.bcel.classfile.Attribute.removeAttributeReader("");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test032"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.DMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test033"); }

    org.apache.bcel.generic.ISUB iSUB0 = new org.apache.bcel.generic.ISUB();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    iSUB0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test034"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LXOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test035"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.ACCESS_NAMES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test036"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.ARRAYLENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test037"); }

    short s0 = org.apache.bcel.Const.PUTFIELD_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)207);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test038"); }

    short s0 = org.apache.bcel.Constants.IFLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)158);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test039"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.IAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test040"); }

    java.lang.String str1 = org.apache.bcel.Const.getAccessName((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "abstract"+ "'", str1.equals("abstract"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test041"); }

    short s0 = org.apache.bcel.Const.ICONST_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)6);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test042"); }

    org.apache.bcel.classfile.Attribute.removeAttributeReader("hi!");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test043"); }

    short s0 = org.apache.bcel.Constants.INSTANCEOF;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)193);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test044"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ATHROW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test045"); }

    short s0 = org.apache.bcel.Const.DUP2_X2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)94);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test046"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.I2S;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test047"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.ENUM_CONSTANT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)101);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test048"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.ATTRIBUTE_NAMES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test049"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ISTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test050"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.IDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test051"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.LDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test052"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ILOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test053"); }

    short s0 = org.apache.bcel.Constants.IMPDEP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)255);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test054"); }

    short s0 = org.apache.bcel.Constants.LXOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)131);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test055"); }

    short s0 = org.apache.bcel.Constants.DCMPG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)152);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test056"); }

    short s0 = org.apache.bcel.Constants.ARRAYLENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)190);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test057"); }

    int i0 = org.apache.bcel.Const.ACCESS_NAMES_LENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 15);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test058"); }

    short s0 = org.apache.bcel.Constants.FSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)102);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test059"); }

    java.io.DataInput dataInput2 = null;
    org.apache.bcel.classfile.ConstantPool constantPool3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.RuntimeInvisibleAnnotations runtimeInvisibleAnnotations4 = new org.apache.bcel.classfile.RuntimeInvisibleAnnotations((int)(short)47, 0, dataInput2, constantPool3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test060"); }

    java.lang.Class<java.lang.InstantiationError> cls0 = org.apache.bcel.ExceptionConst.INSTANTIATION_ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test061"); }

    short s0 = org.apache.bcel.Const.IFGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)156);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test062"); }

    short s0 = org.apache.bcel.Const.GETFIELD_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)206);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test063"); }

    short s0 = org.apache.bcel.Const.ASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)58);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test064"); }

    short s0 = org.apache.bcel.Const.ATHROW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)191);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test065"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.PRIMITIVE_FLOAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)70);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test066"); }

    short s0 = org.apache.bcel.Constants.JSR_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)201);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test067"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ILOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test068"); }

    short s0 = org.apache.bcel.Const.POP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)88);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test069"); }

    short s0 = org.apache.bcel.Constants.MINOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test070"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ISTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test071"); }

    byte byte0 = org.apache.bcel.Const.ATTR_SOURCE_FILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test072"); }

    short s0 = org.apache.bcel.Constants.ICONST_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)6);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test073"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ACONST_NULL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test074"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    boolean b2 = objectType0.equals((java.lang.Object)(short)148);
    org.apache.bcel.generic.ElementValuePairGen[] elementValuePairGen_array3 = new org.apache.bcel.generic.ElementValuePairGen[] {  };
    java.util.ArrayList<org.apache.bcel.generic.ElementValuePairGen> arraylist_elementValuePairGen4 = new java.util.ArrayList<org.apache.bcel.generic.ElementValuePairGen>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.bcel.generic.ElementValuePairGen>)arraylist_elementValuePairGen4, elementValuePairGen_array3);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen8 = new org.apache.bcel.generic.AnnotationEntryGen(objectType0, (java.util.List<org.apache.bcel.generic.ElementValuePairGen>)arraylist_elementValuePairGen4, false, constantPoolGen7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(elementValuePairGen_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test075"); }

    short s0 = org.apache.bcel.Constants.LALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)47);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test076"); }

    short s0 = org.apache.bcel.Const.FCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)149);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test077"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.LocalVariableTable localVariableTable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitLocalVariableTable(localVariableTable4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test078"); }

    short s0 = org.apache.bcel.Constants.IREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)112);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test079"); }

    short s0 = org.apache.bcel.Const.ARETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)176);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test080"); }

    org.apache.bcel.generic.FCMPL fCMPL0 = new org.apache.bcel.generic.FCMPL();

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test081"); }

    java.lang.Class<java.lang.Throwable> cls0 = org.apache.bcel.ExceptionConst.THROWABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test082"); }

    int[] i_array4 = new int[] { (short)203, 15, (short)6, (short)161 };
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = null;
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array6 = new org.apache.bcel.generic.InstructionHandle[] { instructionHandle5 };
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.SWITCH sWITCH9 = new org.apache.bcel.generic.SWITCH(i_array4, instructionHandle_array6, instructionHandle7, (int)(short)88);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array6);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test083"); }

    org.apache.bcel.generic.INVOKEDYNAMIC iNVOKEDYNAMIC1 = new org.apache.bcel.generic.INVOKEDYNAMIC((int)(short)6);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.Type type3 = iNVOKEDYNAMIC1.getReturnType(constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test084"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)48);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test085"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.LASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test086"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = constantPool1.getConstantString((int)(short)0, (byte)10);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test087"); }

    short s0 = org.apache.bcel.Constants.FCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)11);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test088"); }

    org.apache.bcel.generic.INVOKESPECIAL iNVOKESPECIAL1 = new org.apache.bcel.generic.INVOKESPECIAL(0);
    org.apache.bcel.generic.Visitor visitor2 = null;
    // The following exception was thrown during execution in test generation
    try {
    iNVOKESPECIAL1.accept(visitor2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test089"); }

    org.apache.bcel.classfile.LocalVariableTypeTable localVariableTypeTable0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.LocalVariableTypeTable localVariableTypeTable1 = new org.apache.bcel.classfile.LocalVariableTypeTable(localVariableTypeTable0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test090"); }

    short s0 = org.apache.bcel.Const.GOTO_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)200);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test091"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_CONSTANT_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test092"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_SYNTHETIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test093"); }

    short s0 = org.apache.bcel.Const.DCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)151);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test094"); }

    short s0 = org.apache.bcel.Constants.IALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)46);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test095"); }

    short s0 = org.apache.bcel.Constants.ISTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)60);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test096"); }

    short s0 = org.apache.bcel.Constants.ACC_ANNOTATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)8192);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test097"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.EnumElementValue enumElementValue5 = new org.apache.bcel.classfile.EnumElementValue((int)(short)148, (int)(short)148, (int)(short)191, constantPool4);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test098"); }

    short s0 = org.apache.bcel.Constants.ALOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)42);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test099"); }

    short s0 = org.apache.bcel.Constants.ACC_SYNCHRONIZED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)32);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test100"); }

    byte byte0 = org.apache.bcel.Const.REF_invokeVirtual;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test101"); }

    org.apache.bcel.generic.LDIV lDIV0 = new org.apache.bcel.generic.LDIV();

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test102"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.ISHL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test103"); }

    short s0 = org.apache.bcel.Constants.ACC_SYNTHETIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)4096);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test104"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.DSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test105"); }

    org.apache.bcel.verifier.exc.LoadingException loadingException1 = new org.apache.bcel.verifier.exc.LoadingException("abstract");

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test106"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.THIS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test107"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_NameAndType;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test108"); }

    short s0 = org.apache.bcel.Constants.ACC_STRICT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)2048);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test109"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test110"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.FCONST_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test111"); }

    short s0 = org.apache.bcel.Const.GETFIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)180);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test112"); }

    short s0 = org.apache.bcel.Const.IF_ICMPEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)159);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test113"); }

    short s0 = org.apache.bcel.Const.ACC_SUPER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)32);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test114"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Deprecated deprecated4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitDeprecated(deprecated4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test115"); }

    org.apache.bcel.verifier.statics.DOUBLE_Upper dOUBLE_Upper0 = org.apache.bcel.verifier.statics.DOUBLE_Upper.theInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dOUBLE_Upper0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test116"); }

    short s0 = org.apache.bcel.Constants.LLOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)31);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test117"); }

    org.apache.bcel.generic.LSTORE lSTORE1 = new org.apache.bcel.generic.LSTORE((int)(short)161);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test118"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.DNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test119"); }

    org.apache.bcel.classfile.ElementValue elementValue1 = null;
    org.apache.bcel.classfile.ElementValue[] elementValue_array2 = new org.apache.bcel.classfile.ElementValue[] { elementValue1 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ArrayElementValueGen arrayElementValueGen4 = new org.apache.bcel.generic.ArrayElementValueGen((int)(short)151, elementValue_array2, constantPoolGen3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(elementValue_array2);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test120"); }

    org.apache.bcel.classfile.AttributeReader attributeReader1 = null;
    org.apache.bcel.classfile.Attribute.addAttributeReader("hi!", attributeReader1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test121"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_INNER_CLASSES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test122"); }

    org.apache.bcel.generic.INVOKESPECIAL iNVOKESPECIAL1 = new org.apache.bcel.generic.INVOKESPECIAL(0);
    int i2 = iNVOKESPECIAL1.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test123"); }

    java.io.DataInput dataInput0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(dataInput0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test124"); }

    short s0 = org.apache.bcel.Constants.KNOWN_ATTRIBUTES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)12);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test125"); }

    short s0 = org.apache.bcel.Constants.DUP_X1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)90);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test126"); }

    short s0 = org.apache.bcel.Constants.LMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)105);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test127"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConstants.DUP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test128"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.I2B;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test129"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.INEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test130"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ALOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test131"); }

    short s0 = org.apache.bcel.Const.ACC_ENUM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)16384);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test132"); }

    short s0 = org.apache.bcel.Constants.MONITOREXIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)195);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test133"); }

    org.apache.bcel.generic.F2D f2D0 = new org.apache.bcel.generic.F2D();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test134"); }

    org.apache.bcel.classfile.ElementValue elementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ElementValueGen elementValueGen3 = org.apache.bcel.generic.ElementValueGen.copy(elementValue0, constantPoolGen1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test135"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.Signature signature6 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool5);
    signature6.setSignatureIndex((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test136"); }

    short s0 = org.apache.bcel.Const.PUTFIELD_QUICK_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)228);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test137"); }

    org.apache.bcel.generic.SWAP sWAP0 = new org.apache.bcel.generic.SWAP();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test138"); }

    short s0 = org.apache.bcel.Constants.LSTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)65);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test139"); }

    org.apache.bcel.classfile.SourceFile sourceFile0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.SourceFile sourceFile1 = new org.apache.bcel.classfile.SourceFile(sourceFile0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test140"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.IADD;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    int i2 = arithmeticInstruction0.produceStack(constantPoolGen1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test141"); }

    short s0 = org.apache.bcel.Const.ISTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)62);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test142"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ILOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test143"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.PUSH pUSH2 = new org.apache.bcel.generic.PUSH(constantPoolGen0, (java.lang.Number)0.0f);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test144"); }

    short s0 = org.apache.bcel.Const.IFEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)153);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test145"); }

    org.apache.bcel.classfile.AnnotationElementValue annotationElementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationElementValueGen annotationElementValueGen3 = new org.apache.bcel.generic.AnnotationElementValueGen(annotationElementValue0, constantPoolGen1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test146"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.LNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test147"); }

    org.apache.bcel.classfile.LocalVariable localVariable2 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array3 = new org.apache.bcel.classfile.LocalVariable[] { localVariable2 };
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable7 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array3, constantPool5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = localVariableTable7.getName();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test148"); }

    java.lang.String str0 = org.apache.bcel.Constants.STATIC_INITIALIZER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<clinit>"+ "'", str0.equals("<clinit>"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test149"); }

    short s0 = org.apache.bcel.Const.ACC_STATIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)8);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test150"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)49);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test151"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_LONG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 74);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test152"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.IALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test153"); }

    short s0 = org.apache.bcel.Const.MINOR_1_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test154"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.STRING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)115);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test155"); }

    short s0 = org.apache.bcel.Constants.INVOKEVIRTUAL_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)214);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test156"); }

    short s0 = org.apache.bcel.Const.LCONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)10);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test157"); }

    short s0 = org.apache.bcel.Constants.D2F;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)144);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test158"); }

    org.apache.bcel.generic.DUP dUP0 = new org.apache.bcel.generic.DUP();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test159"); }

    short s0 = org.apache.bcel.Const.AALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)50);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test160"); }

    short s0 = org.apache.bcel.Const.FADD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)98);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test161"); }

    short s0 = org.apache.bcel.Constants.PUTFIELD2_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)209);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test162"); }

    byte byte0 = org.apache.bcel.Const.REF_putStatic;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test163"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Method method4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitMethod(method4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test164"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.FCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test165"); }

    org.apache.bcel.generic.FCMPG fCMPG0 = new org.apache.bcel.generic.FCMPG();

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test166"); }

    java.lang.Class<java.lang.ExceptionInInitializerError> cls0 = org.apache.bcel.ExceptionConst.EXCEPTION_IN_INITIALIZER_ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test167"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.L2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test168"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.DCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test169"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ParameterAnnotations parameterAnnotations4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitParameterAnnotation(parameterAnnotations4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test170"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_Float;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test171"); }

    short s0 = org.apache.bcel.Constants.DUP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)92);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test172"); }

    short s0 = org.apache.bcel.Const.LRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)173);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test173"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = null;
    org.apache.bcel.generic.LSUB lSUB5 = new org.apache.bcel.generic.LSUB();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList3.insert(instructionHandle4, (org.apache.bcel.generic.Instruction)lSUB5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test174"); }

    org.apache.bcel.ExceptionConst.EXCS eXCS0 = org.apache.bcel.ExceptionConst.EXCS.EXCS_FIELD_AND_METHOD_RESOLUTION;
    org.junit.Assert.assertTrue("'" + eXCS0 + "' != '" + org.apache.bcel.ExceptionConst.EXCS.EXCS_FIELD_AND_METHOD_RESOLUTION + "'", eXCS0.equals(org.apache.bcel.ExceptionConst.EXCS.EXCS_FIELD_AND_METHOD_RESOLUTION));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test175"); }

    short s0 = org.apache.bcel.Const.ISTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)59);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test176"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_Object;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test177"); }

    short s0 = org.apache.bcel.Constants.IFEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)153);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test178"); }

    short s0 = org.apache.bcel.Constants.MAJOR_1_5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)49);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test179"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.D2F;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test180"); }

    org.apache.bcel.generic.FREM fREM0 = new org.apache.bcel.generic.FREM();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fREM0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test181"); }

    org.apache.bcel.generic.INVOKESPECIAL iNVOKESPECIAL1 = new org.apache.bcel.generic.INVOKESPECIAL(0);
    java.io.DataOutputStream dataOutputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    iNVOKESPECIAL1.dump(dataOutputStream2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test182"); }

    short s0 = org.apache.bcel.Const.D2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)143);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test183"); }

    org.apache.bcel.generic.RETURN rETURN0 = new org.apache.bcel.generic.RETURN();

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test184"); }

    short s0 = org.apache.bcel.Const.FSTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)68);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test185"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_Bogus;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test186"); }

    java.lang.String str1 = org.apache.bcel.Const.getShortTypeName((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<illegal type>"+ "'", str1.equals("<illegal type>"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test187"); }

    short s0 = org.apache.bcel.Const.L2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)136);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test188"); }

    org.apache.bcel.generic.LUSHR lUSHR0 = new org.apache.bcel.generic.LUSHR();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    lUSHR0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test189"); }

    short s0 = org.apache.bcel.Constants.LOOKUPSWITCH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)171);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test190"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test191"); }

    org.apache.bcel.generic.BasicType basicType0 = org.apache.bcel.generic.Type.CHAR;
    boolean b2 = basicType0.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test192"); }

    short s0 = org.apache.bcel.Const.IUSHR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)124);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test193"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ConstantUtf8 constantUtf8_4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantUtf8(constantUtf8_4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test194"); }

    org.apache.bcel.generic.ReturnInstruction returnInstruction0 = org.apache.bcel.generic.InstructionConst.FRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test195"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.FSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test196"); }

    org.apache.bcel.verifier.exc.StructuralCodeConstraintException structuralCodeConstraintException1 = new org.apache.bcel.verifier.exc.StructuralCodeConstraintException("");

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test197"); }

    org.apache.bcel.classfile.CodeException codeException4 = new org.apache.bcel.classfile.CodeException(0, (int)(short)228, (int)(short)112, (int)(short)112);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue10 = new org.apache.bcel.classfile.ClassElementValue((int)(short)256, (int)'4', constantPool8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = codeException4.toString(constantPool8, false);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test198"); }

    byte byte0 = org.apache.bcel.Constants.T_INT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test199"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BOOLEAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 90);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test200"); }

    java.io.DataInput dataInput0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constant_array1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.AnnotationEntry annotationEntry4 = org.apache.bcel.classfile.AnnotationEntry.read(dataInput0, constantPool2, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test201"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.LSHL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test202"); }

    org.apache.bcel.verifier.Verifier verifier0 = null;
    org.apache.bcel.verifier.statics.Pass2Verifier pass2Verifier1 = new org.apache.bcel.verifier.statics.Pass2Verifier(verifier0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test203"); }

    short s0 = org.apache.bcel.Const.IALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)46);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test204"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_RUNTIMEVISIBLE_PARAMETER_ANNOTATIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)14);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test205"); }

    short s0 = org.apache.bcel.Const.ACC_PROTECTED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)4);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test206"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType2 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType0, (int)(short)193);
    org.apache.bcel.generic.ReturnInstruction returnInstruction3 = org.apache.bcel.generic.InstructionFactory.createReturn((org.apache.bcel.generic.Type)arrayType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction3);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test207"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    lineNumber2.setStartPC((int)(short)42);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test208"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.FNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test209"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.awt.Color color4 = null;
    verifyDialog2.setForeground(color4);
    java.awt.Frame frame6 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog8 = new org.apache.bcel.verifier.VerifyDialog(frame6, true);
    boolean b9 = verifyDialog8.isFontSet();
    java.awt.Image image10 = null;
    java.awt.Frame frame11 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog13 = new org.apache.bcel.verifier.VerifyDialog(frame11, true);
    java.lang.String str14 = verifyDialog13.toString();
    int i15 = verifyDialog8.checkImage(image10, (java.awt.image.ImageObserver)verifyDialog13);
    boolean b16 = verifyDialog2.isAncestorOf((java.awt.Component)verifyDialog8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog4,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog4,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog5,67,27,0str14,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str14,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str14.equals("org.apache.bcel.verifier.VerifyDialog[dialog5,67,27,0str14,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str14,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test210"); }

    short s0 = org.apache.bcel.Const.ILOAD_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)29);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test211"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.AnnotationEntry annotationEntry4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitAnnotationEntry(annotationEntry4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test212"); }

    org.apache.bcel.generic.DRETURN dRETURN0 = new org.apache.bcel.generic.DRETURN();

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test213"); }

    short s0 = org.apache.bcel.Const.DSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)103);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test214"); }

    org.apache.bcel.classfile.UnknownAttributeReader unknownAttributeReader1 = null;
    org.apache.bcel.classfile.Attribute.addAttributeReader("org.apache.bcel.verifier.VerifyDialog[dialog3,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", unknownAttributeReader1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test215"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.ConstantFloat constantFloat6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantFloat(constantFloat6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test216"); }

    int i0 = org.apache.bcel.Const.MAX_CP_ENTRIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 65535);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test217"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.FALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test218"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.IREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test219"); }

    org.apache.bcel.generic.ALOAD aLOAD1 = new org.apache.bcel.generic.ALOAD((int)(short)159);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test220"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.ConstantClass constantClass6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantClass(constantClass6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test221"); }

    byte byte0 = org.apache.bcel.Const.T_VOID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test222"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.Signature signature6 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool5);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Constant constant9 = constantPool5.getConstant((int)(short)88, (byte)10);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test223"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.bcel.classfile.Signature.translate("org.apache.bcel.verifier.VerifyDialog[dialog6,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test224"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.INVOKESTATIC iNVOKESTATIC1 = new org.apache.bcel.generic.INVOKESTATIC((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test225"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    verifyDialog2.transferFocusBackward();
    java.awt.Frame frame4 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog6 = new org.apache.bcel.verifier.VerifyDialog(frame4, true);
    // The following exception was thrown during execution in test generation
    try {
    verifyDialog2.setContentPane((java.awt.Container)verifyDialog6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test226"); }

    short s0 = org.apache.bcel.Constants.ILOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)21);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test227"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_Class;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test228"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.SourceFile sourceFile6 = new org.apache.bcel.classfile.SourceFile((int)(short)228, (int)(short)46, (int)(byte)83, constantPool5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = sourceFile6.toString();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test229"); }

    org.apache.bcel.generic.F2I f2I0 = new org.apache.bcel.generic.F2I();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    f2I0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test230"); }

    int i0 = java.awt.Frame.ICONIFIED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test231"); }

    byte byte0 = org.apache.bcel.Const.ATTR_LOCAL_VARIABLE_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test232"); }

    org.apache.bcel.generic.StackInstruction stackInstruction1 = org.apache.bcel.generic.InstructionFactory.createPop(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test233"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
    org.apache.bcel.generic.ObjectType objectType3 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.classfile.Constant[] constant_array5 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constant_array5);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPool6.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen8 = new org.apache.bcel.generic.ConstantPoolGen(constantPool6);
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen9 = new org.apache.bcel.generic.EnumElementValueGen(objectType3, "<illegal type>", constantPoolGen8);
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen11 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)226, constantPoolGen8, (float)(short)195);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen12 = new org.apache.bcel.generic.EnumElementValueGen(objectType0, "org.apache.bcel.verifier.VerifyDialog[dialog2,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", constantPoolGen8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test234"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.Font font4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics5 = verifyDialog2.getFontMetrics(font4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test235"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.DASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test236"); }

    org.apache.bcel.generic.InstructionComparator instructionComparator0 = null;
    org.apache.bcel.generic.Instruction.setComparator(instructionComparator0);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test237"); }

    short s0 = org.apache.bcel.Constants.LSTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)66);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test238"); }

    short s0 = org.apache.bcel.Constants.ICONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)4);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test239"); }

    short s0 = org.apache.bcel.Const.SWITCH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)4712);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test240"); }

    short s0 = org.apache.bcel.Constants.ISTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)61);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test241"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.INTERFACES_IMPLEMENTED_BY_ARRAYS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test242"); }

    short s0 = org.apache.bcel.Constants.LSHL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)121);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test243"); }

    org.apache.bcel.classfile.LocalVariable localVariable2 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array3 = new org.apache.bcel.classfile.LocalVariable[] { localVariable2 };
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable7 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array3, constantPool5);
    int i8 = localVariableTable7.getTableLength();
    java.io.DataOutputStream dataOutputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    localVariableTable7.dump(dataOutputStream9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test244"); }

    short s0 = org.apache.bcel.Const.NEW_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)221);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test245"); }

    org.apache.bcel.classfile.LocalVariable localVariable2 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array3 = new org.apache.bcel.classfile.LocalVariable[] { localVariable2 };
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable7 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array3, constantPool5);
    int i8 = localVariableTable7.getTableLength();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable9 = new org.apache.bcel.classfile.LocalVariableTable(localVariableTable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test246"); }

    short s0 = org.apache.bcel.Const.F2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)139);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test247"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Toolkit toolkit3 = verifyDialog2.getToolkit();
    java.awt.Window.Type type4 = null;
    // The following exception was thrown during execution in test generation
    try {
    verifyDialog2.setType(type4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test248"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.ARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)91);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test249"); }

    short s0 = org.apache.bcel.Constants.LSTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)64);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test250"); }

    int i0 = java.awt.Frame.DEFAULT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test251"); }

    short s0 = org.apache.bcel.Const.IADD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)96);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test252"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Synthetic synthetic4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitSynthetic(synthetic4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test253"); }

    boolean b0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test254"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver4 = null;
    instructionList3.addObserver(instructionListObserver4);
    org.apache.bcel.generic.ReturnInstruction returnInstruction6 = org.apache.bcel.generic.InstructionConstants.RETURN;
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList3.append((org.apache.bcel.generic.Instruction)returnInstruction6);
    org.apache.bcel.generic.Instruction instruction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionHandle7.setInstruction(instruction8);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle7);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test255"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Point point3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = verifyDialog2.contains(point3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test256"); }

    short s0 = org.apache.bcel.Const.IF_ICMPGT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)163);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test257"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.bcel.Const.getAccessName((int)(short)105);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test258"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.awt.Color color4 = null;
    verifyDialog2.setForeground(color4);
    javax.swing.TransferHandler transferHandler6 = verifyDialog2.getTransferHandler();
    java.awt.Window.Type type7 = null;
    // The following exception was thrown during execution in test generation
    try {
    verifyDialog2.setType(type7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog8,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog8,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler6);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test259"); }

    short s0 = org.apache.bcel.Const.DRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)175);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test260"); }

    org.apache.bcel.generic.ObjectType objectType1 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = new org.apache.bcel.generic.ConstantPoolGen(constantPool4);
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen7 = new org.apache.bcel.generic.EnumElementValueGen(objectType1, "<illegal type>", constantPoolGen6);
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen9 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)226, constantPoolGen6, (float)(short)195);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = simpleElementValueGen9.stringifyValue();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test261"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    javax.swing.JMenuBar jMenuBar3 = verifyDialog2.getJMenuBar();
    java.util.Locale locale4 = null;
    // The following exception was thrown during execution in test generation
    try {
    jMenuBar3.setLocale(locale4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar3);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test262"); }

    short s0 = org.apache.bcel.Const.IFLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)158);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test263"); }

    byte byte0 = org.apache.bcel.Const.ATTR_PMG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)9);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test264"); }

    byte[] byte_array3 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList4 = new org.apache.bcel.generic.InstructionList(byte_array3);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver5 = null;
    instructionList4.addObserver(instructionListObserver5);
    org.apache.bcel.generic.ReturnInstruction returnInstruction7 = org.apache.bcel.generic.InstructionConstants.RETURN;
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList4.append((org.apache.bcel.generic.Instruction)returnInstruction7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchInstruction branchInstruction9 = org.apache.bcel.generic.InstructionFactory.createBranchInstruction((short)58, instructionHandle8);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test265"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.PUSH pUSH2 = new org.apache.bcel.generic.PUSH(constantPoolGen0, (int)(short)214);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test266"); }

    byte byte0 = org.apache.bcel.Const.T_FLOAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test267"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.StackMapEntry stackMapEntry6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitStackMapEntry(stackMapEntry6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test268"); }

    short s0 = org.apache.bcel.Const.DMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)107);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test269"); }

    short s0 = org.apache.bcel.Const.RETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)177);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test270"); }

    short s0 = org.apache.bcel.Constants.PUTSTATIC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)211);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test271"); }

    org.apache.bcel.verifier.VerifierFactoryObserver verifierFactoryObserver0 = null;
    org.apache.bcel.verifier.VerifierFactory.detach(verifierFactoryObserver0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test272"); }

    org.apache.bcel.classfile.BootstrapMethods bootstrapMethods0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.BootstrapMethods bootstrapMethods1 = new org.apache.bcel.classfile.BootstrapMethods(bootstrapMethods0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test273"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    boolean b1 = objectType0.referencesClass();
    org.apache.bcel.generic.ObjectType objectType2 = org.apache.bcel.generic.Type.STRING;
    boolean b3 = objectType0.accessibleTo(objectType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test274"); }

    short s0 = org.apache.bcel.Const.IDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)108);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test275"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Container container3 = verifyDialog2.getParent();
    java.awt.Insets insets4 = container3.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets4);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test276"); }

    int i0 = org.apache.bcel.Const.APPEND_FRAME_MAX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 254);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test277"); }

    short s0 = org.apache.bcel.Constants.MAX_ACC_FLAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)16384);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test278"); }

    short s0 = org.apache.bcel.Const.IF_ACMPNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)166);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test279"); }

    short s0 = org.apache.bcel.Const.ACC_VARARGS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)128);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test280"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_InitObject;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test281"); }

    java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uRL1);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test282"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.classfile.Constant[] constant_array2 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool3 = new org.apache.bcel.classfile.ConstantPool(constant_array2);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool3.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen6 = new org.apache.bcel.generic.EnumElementValueGen(objectType0, "<illegal type>", constantPoolGen5);
    int i8 = constantPoolGen5.addLong((long)(byte)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test283"); }

    org.apache.bcel.util.BCELifier.FLAGS fLAGS1 = null;
    java.lang.String str2 = org.apache.bcel.util.BCELifier.printFlags((int)(short)16384, fLAGS1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Const.ACC_ENUM"+ "'", str2.equals("Const.ACC_ENUM"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test284"); }

    byte byte0 = org.apache.bcel.Const.ATTR_ENCLOSING_METHOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)18);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test285"); }

    short s0 = org.apache.bcel.Const.LSTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)55);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test286"); }

    short s0 = org.apache.bcel.Constants.F2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)139);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test287"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_RUNTIMEINVISIBLE_ANNOTATIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)13);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test288"); }

    short s0 = org.apache.bcel.Constants.IFLT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)155);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test289"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.Graphics graphics4 = null;
    verifyDialog2.printComponents(graphics4);
    java.awt.event.ActionEvent actionEvent6 = null;
    verifyDialog2.pass4Button_ActionPerformed(actionEvent6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test290"); }

    org.apache.bcel.verifier.statics.LocalVariableInfo localVariableInfo0 = new org.apache.bcel.verifier.statics.LocalVariableInfo();

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test291"); }

    int[] i_array6 = new int[] { (short)48, (short)45, (short)88, (short)124, (short)148, '4' };
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array7 = new org.apache.bcel.generic.InstructionHandle[] {  };
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver12 = null;
    instructionList11.addObserver(instructionListObserver12);
    org.apache.bcel.generic.ReturnInstruction returnInstruction14 = org.apache.bcel.generic.InstructionConstants.RETURN;
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList11.append((org.apache.bcel.generic.Instruction)returnInstruction14);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.TABLESWITCH tABLESWITCH16 = new org.apache.bcel.generic.TABLESWITCH(i_array6, instructionHandle_array7, instructionHandle15);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test292"); }

    short s0 = org.apache.bcel.Constants.IFGT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)157);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test293"); }

    short s0 = org.apache.bcel.Constants.IF_ACMPEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)165);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test294"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.im.InputContext inputContext4 = verifyDialog2.getInputContext();
    java.awt.event.HierarchyListener hierarchyListener5 = null;
    verifyDialog2.removeHierarchyListener(hierarchyListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext4);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test295"); }

    byte byte0 = org.apache.bcel.Const.ATTR_LOCAL_VARIABLE_TYPE_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)17);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test296"); }

    org.apache.bcel.classfile.Attribute[] attribute_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.ParameterAnnotationEntry[] parameterAnnotationEntry_array1 = org.apache.bcel.classfile.ParameterAnnotationEntry.createParameterAnnotationEntries(attribute_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test297"); }

    int i0 = org.apache.bcel.Const.SAME_FRAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test298"); }

    short s0 = org.apache.bcel.Constants.FCMPG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)150);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test299"); }

    short s0 = org.apache.bcel.Const.SIPUSH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)17);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test300"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ConstantValue constantValue4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantValue(constantValue4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test301"); }

    byte byte0 = org.apache.bcel.Const.ATTR_STACK_MAP_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)19);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test302"); }

    org.apache.bcel.verifier.exc.StructuralCodeConstraintException structuralCodeConstraintException1 = new org.apache.bcel.verifier.exc.StructuralCodeConstraintException("org.apache.bcel.verifier.VerifyDialog[dialog9,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test303"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.PRIMITIVE_LONG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)74);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test304"); }

    short s0 = org.apache.bcel.Const.IMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)104);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test305"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.Image image4 = null;
    java.awt.Frame frame5 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog7 = new org.apache.bcel.verifier.VerifyDialog(frame5, true);
    java.lang.String str8 = verifyDialog7.toString();
    int i9 = verifyDialog2.checkImage(image4, (java.awt.image.ImageObserver)verifyDialog7);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array10 = verifyDialog7.getHierarchyBoundsListeners();
    java.awt.event.InputMethodListener inputMethodListener11 = null;
    verifyDialog7.addInputMethodListener(inputMethodListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog10,67,27,0str8,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str8,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str8.equals("org.apache.bcel.verifier.VerifyDialog[dialog10,67,27,0str8,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str8,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array10);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test306"); }

    int i0 = org.apache.bcel.Const.SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 247);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test307"); }

    int i0 = java.awt.image.ImageObserver.WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test308"); }

    short s0 = org.apache.bcel.Constants.DASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)82);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test309"); }

    short s0 = org.apache.bcel.Const.ILOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)27);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test310"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ConstantString constantString4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantString(constantString4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test311"); }

    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constant_array1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPool2.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool2);
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen6 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)221, constantPoolGen4, (byte)0);
    org.apache.bcel.generic.PUSH pUSH8 = new org.apache.bcel.generic.PUSH(constantPoolGen4, (long)(short)121);
    int i12 = constantPoolGen4.addInterfaceMethodref("Const.ACC_ENUM", "hi!", "abstract");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test312"); }

    short s0 = org.apache.bcel.Constants.LRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)173);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test313"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.InnerClasses innerClasses4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitInnerClasses(innerClasses4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test314"); }

    short s0 = org.apache.bcel.Const.FSTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)70);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test315"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.awt.event.InputMethodListener inputMethodListener4 = null;
    verifyDialog2.removeInputMethodListener(inputMethodListener4);
    verifyDialog2.setBounds(100, (int)(byte)74, (int)(short)50, (int)(short)112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog11,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog11,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test316"); }

    short s0 = org.apache.bcel.Const.PUTSTATIC2_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)213);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test317"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.AnnotationEntry annotationEntry4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitAnnotationEntry(annotationEntry4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test318"); }

    short s0 = org.apache.bcel.Const.MINOR_1_8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test319"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.LineNumberTable lineNumberTable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitLineNumberTable(lineNumberTable4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test320"); }

    org.apache.bcel.verifier.statics.LONG_Upper lONG_Upper0 = org.apache.bcel.verifier.statics.LONG_Upper.theInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lONG_Upper0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test321"); }

    short s0 = org.apache.bcel.Constants.CHECKCAST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)192);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test322"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Methodref;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test323"); }

    short s0 = org.apache.bcel.Const.DASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)82);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test324"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point4 = verifyDialog2.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog13,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog13,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test325"); }

    org.apache.bcel.generic.BasicType basicType0 = org.apache.bcel.generic.Type.CHAR;
    org.apache.bcel.generic.Type[] type_array1 = org.apache.bcel.generic.Type.NO_ARGS;
    java.lang.String str2 = org.apache.bcel.generic.Type.getMethodSignature((org.apache.bcel.generic.Type)basicType0, type_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "()C"+ "'", str2.equals("()C"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test326"); }

    short s0 = org.apache.bcel.Const.I2C;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)146);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test327"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Rectangle rectangle3 = verifyDialog2.bounds();
    java.awt.Window window4 = verifyDialog2.getOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window4);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test328"); }

    boolean b1 = org.apache.bcel.generic.Instruction.isValidByte((int)(short)160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test329"); }

    short s0 = org.apache.bcel.Const.NEW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)187);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test330"); }

    org.apache.bcel.generic.GETSTATIC gETSTATIC1 = new org.apache.bcel.generic.GETSTATIC((int)(short)3);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.Type type3 = gETSTATIC1.getFieldType(constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test331"); }

    org.apache.bcel.classfile.Synthetic synthetic0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Synthetic synthetic1 = new org.apache.bcel.classfile.Synthetic(synthetic0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test332"); }

    java.lang.Iterable<java.lang.String> iterable_str0 = org.apache.bcel.Const.getInterfacesImplementedByArrays();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterable_str0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test333"); }

    int[] i_array4 = new int[] { 254, (short)128, (short)173 };
    org.apache.bcel.classfile.BootstrapMethod bootstrapMethod5 = new org.apache.bcel.classfile.BootstrapMethod((int)(short)3, i_array4);
    java.io.DataOutputStream dataOutputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    bootstrapMethod5.dump(dataOutputStream6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test334"); }

    java.io.DataInput dataInput2 = null;
    org.apache.bcel.classfile.LocalVariable localVariable5 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array6 = new org.apache.bcel.classfile.LocalVariable[] { localVariable5 };
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable10 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array6, constantPool8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations runtimeInvisibleParameterAnnotations11 = new org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations((int)(short)105, (int)(short)112, dataInput2, constantPool8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test335"); }

    short s0 = org.apache.bcel.Constants.DNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)119);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test336"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, "org.apache.bcel.verifier.VerifyDialog[dialog5,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.Point point3 = null;
    java.awt.Point point4 = verifyDialog2.getLocation(point3);
    java.awt.Frame frame5 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog7 = new org.apache.bcel.verifier.VerifyDialog(frame5, true);
    boolean b8 = verifyDialog7.isFontSet();
    java.awt.im.InputContext inputContext9 = verifyDialog7.getInputContext();
    java.awt.Dimension dimension10 = verifyDialog7.minimumSize();
    verifyDialog2.setPreferredSize(dimension10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test337"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.im.InputContext inputContext4 = verifyDialog2.getInputContext();
    boolean b5 = verifyDialog2.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test338"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Container container3 = verifyDialog2.getParent();
    java.awt.event.MouseMotionListener mouseMotionListener4 = null;
    verifyDialog2.addMouseMotionListener(mouseMotionListener4);
    java.awt.event.HierarchyListener hierarchyListener6 = null;
    verifyDialog2.addHierarchyListener(hierarchyListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container3);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test339"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Rectangle rectangle3 = verifyDialog2.bounds();
    verifyDialog2.hide();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test340"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPool1.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constantPool1);
    org.apache.bcel.generic.MethodGen methodGen4 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = constantPoolGen3.lookupMethodref(methodGen4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test341"); }

    short s0 = org.apache.bcel.Const.DSTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)72);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test342"); }

    org.apache.bcel.generic.LSUB lSUB0 = new org.apache.bcel.generic.LSUB();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    lSUB0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test343"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)47);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test344"); }

    short s0 = org.apache.bcel.Const.DCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)14);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test345"); }

    byte byte0 = org.apache.bcel.Const.ATTR_RUNTIME_VISIBLE_ANNOTATIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test346"); }

    short s0 = org.apache.bcel.Constants.DLOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)40);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test347"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.ArrayElementValueGen arrayElementValueGen1 = new org.apache.bcel.generic.ArrayElementValueGen(constantPoolGen0);
    java.util.List<org.apache.bcel.generic.ElementValueGen> list_elementValueGen2 = arrayElementValueGen1.getElementValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_elementValueGen2);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test348"); }

    short s0 = org.apache.bcel.Const.F2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)141);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test349"); }

    org.apache.bcel.classfile.LocalVariable localVariable2 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array3 = new org.apache.bcel.classfile.LocalVariable[] { localVariable2 };
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable7 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array3, constantPool5);
    int i8 = localVariableTable7.getTableLength();
    org.apache.bcel.classfile.LocalVariable[] localVariable_array9 = localVariableTable7.getLocalVariableTable();
    int i10 = localVariableTable7.getTableLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test350"); }

    short s0 = org.apache.bcel.Const.IFNONNULL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)199);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test351"); }

    boolean b1 = org.apache.bcel.generic.Instruction.isValidByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test352"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Toolkit toolkit3 = verifyDialog2.getToolkit();
    java.awt.Point point4 = verifyDialog2.location();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point4);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test353"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.awt.Color color4 = null;
    verifyDialog2.setForeground(color4);
    verifyDialog2.removeNotify();
    verifyDialog2.invalidate();
    java.io.PrintStream printStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    verifyDialog2.list(printStream8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog16,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog16,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test354"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "hi!" };
    org.apache.bcel.util.ClassLoader classLoader3 = new org.apache.bcel.util.ClassLoader(str_array2);
    org.apache.bcel.util.ClassLoader classLoader4 = new org.apache.bcel.util.ClassLoader((java.lang.ClassLoader)classLoader3);
    classLoader3.setPackageAssertionStatus("", true);
    org.apache.bcel.util.ClassLoader classLoader8 = new org.apache.bcel.util.ClassLoader((java.lang.ClassLoader)classLoader3);
    java.net.URL uRL10 = classLoader8.getResource("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uRL10);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test355"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.Image image4 = null;
    java.awt.Frame frame5 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog7 = new org.apache.bcel.verifier.VerifyDialog(frame5, true);
    java.lang.String str8 = verifyDialog7.toString();
    int i9 = verifyDialog2.checkImage(image4, (java.awt.image.ImageObserver)verifyDialog7);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array10 = verifyDialog7.getHierarchyBoundsListeners();
    boolean b11 = verifyDialog7.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog17,67,27,0str8,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str8,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str8.equals("org.apache.bcel.verifier.VerifyDialog[dialog17,67,27,0str8,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str8,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test356"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.awt.Color color4 = null;
    verifyDialog2.setForeground(color4);
    verifyDialog2.removeNotify();
    verifyDialog2.invalidate();
    float f8 = verifyDialog2.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog18,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog18,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.5f);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test357"); }

    short s0 = org.apache.bcel.Constants.GETSTATIC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)210);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test358"); }

    short s0 = org.apache.bcel.Const.LOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)129);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test359"); }

    short s0 = org.apache.bcel.Const.INVOKESTATIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)184);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test360"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.Graphics graphics4 = null;
    verifyDialog2.printComponents(graphics4);
    java.awt.Image image6 = null;
    java.awt.Frame frame7 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog9 = new org.apache.bcel.verifier.VerifyDialog(frame7, "org.apache.bcel.verifier.VerifyDialog[dialog7,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.peer.ComponentPeer componentPeer10 = verifyDialog9.getPeer();
    int i11 = verifyDialog2.checkImage(image6, (java.awt.image.ImageObserver)verifyDialog9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test361"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.ConstantValue constantValue6 = new org.apache.bcel.classfile.ConstantValue((int)(short)200, (int)(short)4712, (int)(byte)74, constantPool4);
    java.lang.String str7 = constantPool4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test362"); }

    short s0 = org.apache.bcel.Const.ALOAD_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)45);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test363"); }

    short s0 = org.apache.bcel.Constants.RESERVED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)-3);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test364"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = org.apache.bcel.generic.ClassGen.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bCELComparator0);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test365"); }

    org.apache.bcel.classfile.Constant[] constant_array5 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constant_array5);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPool6.copy();
    org.apache.bcel.classfile.ConstantValue constantValue8 = new org.apache.bcel.classfile.ConstantValue((int)(short)200, (int)(short)4712, (int)(byte)74, constantPool6);
    org.apache.bcel.classfile.SimpleElementValue simpleElementValue9 = new org.apache.bcel.classfile.SimpleElementValue((int)'4', (int)(short)165, constantPool6);
    // The following exception was thrown during execution in test generation
    try {
    float f10 = simpleElementValue9.getValueFloat();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test366"); }

    short s0 = org.apache.bcel.Constants.DUP_X2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)91);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test367"); }

    short s0 = org.apache.bcel.Const.PUSH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)4711);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test368"); }

    short s0 = org.apache.bcel.Const.ICONST_M1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)2);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test369"); }

    java.io.DataInput dataInput0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.ConstantUtf8 constantUtf8_1 = org.apache.bcel.classfile.ConstantUtf8.getInstance(dataInput0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test370"); }

    byte byte0 = org.apache.bcel.Constants.T_VOID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test371"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.awt.event.InputMethodListener inputMethodListener4 = null;
    verifyDialog2.removeInputMethodListener(inputMethodListener4);
    boolean b6 = verifyDialog2.isFocusCycleRoot();
    boolean b7 = verifyDialog2.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog19,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog19,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test372"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.LDC2_W lDC2_W1 = new org.apache.bcel.generic.LDC2_W((int)(short)-3);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test373"); }

    short s0 = org.apache.bcel.Const.LREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)113);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test374"); }

    short s0 = org.apache.bcel.Constants.DMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)107);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test375"); }

    java.io.DataInput dataInput0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constant_array1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPool2.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ElementValueGen elementValueGen5 = org.apache.bcel.generic.ElementValueGen.readElementValue(dataInput0, constantPoolGen4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test376"); }

    org.apache.bcel.classfile.Constant[] constant_array8 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool9 = new org.apache.bcel.classfile.ConstantPool(constant_array8);
    org.apache.bcel.classfile.ConstantPool constantPool10 = constantPool9.copy();
    org.apache.bcel.classfile.Signature signature11 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool10);
    org.apache.bcel.classfile.LocalVariable localVariable12 = new org.apache.bcel.classfile.LocalVariable(0, 0, (int)(short)213, (int)(short)8, (int)(short)92, constantPool10);
    localVariable12.setLength(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool10);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test377"); }

    java.lang.Class<java.lang.ArrayIndexOutOfBoundsException> cls0 = org.apache.bcel.ExceptionConst.ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test378"); }

    short s0 = org.apache.bcel.Constants.I2S;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)147);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test379"); }

    org.apache.bcel.verifier.exc.AssertionViolatedException assertionViolatedException0 = new org.apache.bcel.verifier.exc.AssertionViolatedException();
    assertionViolatedException0.extendMessage("org.apache.bcel.verifier.VerifyDialog[dialog3,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "");

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test380"); }

    short s0 = org.apache.bcel.Constants.ARETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)176);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test381"); }

    org.apache.bcel.generic.ClassGenException classGenException1 = new org.apache.bcel.generic.ClassGenException("org.apache.bcel.verifier.VerifyDialog[dialog9,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test382"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.SourceFile sourceFile5 = new org.apache.bcel.classfile.SourceFile((int)(short)3, (int)(short)124, (int)(short)209, constantPool4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = sourceFile5.toString();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test383"); }

    org.apache.bcel.generic.ObjectType objectType1 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = new org.apache.bcel.generic.ConstantPoolGen(constantPool4);
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen7 = new org.apache.bcel.generic.EnumElementValueGen(objectType1, "<illegal type>", constantPoolGen6);
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen9 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)226, constantPoolGen6, (float)(short)195);
    org.apache.bcel.generic.PUSH pUSH11 = new org.apache.bcel.generic.PUSH(constantPoolGen6, (long)(short)94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test384"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.bcel.Const.getClassTypeName((int)(short)17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test385"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    javax.swing.JMenuBar jMenuBar3 = verifyDialog2.getJMenuBar();
    boolean b4 = verifyDialog2.isFocusCycleRoot();
    java.awt.Image image5 = null;
    java.awt.Frame frame6 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog8 = new org.apache.bcel.verifier.VerifyDialog(frame6, "org.apache.bcel.verifier.VerifyDialog[dialog7,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.event.WindowFocusListener windowFocusListener9 = null;
    verifyDialog8.addWindowFocusListener(windowFocusListener9);
    int i11 = verifyDialog2.checkImage(image5, (java.awt.image.ImageObserver)verifyDialog8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test386"); }

    short s0 = org.apache.bcel.Const.INVOKEINTERFACE_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)218);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test387"); }

    short s0 = org.apache.bcel.Const.MINOR_1_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test388"); }

    byte byte0 = org.apache.bcel.Constants.T_FLOAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test389"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Class;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test390"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.CodeException codeException10 = new org.apache.bcel.classfile.CodeException(0, (int)(short)228, (int)(short)112, (int)(short)112);
    int i11 = codeException10.getHandlerPC();
    stringRepresentation3.visitCodeException(codeException10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 112);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test391"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.CodeException codeException10 = new org.apache.bcel.classfile.CodeException(0, (int)(short)228, (int)(short)112, (int)(short)112);
    stringRepresentation3.visitCodeException(codeException10);
    org.apache.bcel.classfile.Deprecated deprecated12 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitDeprecated(deprecated12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test392"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    lineNumber2.setStartPC((int)(short)50);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test393"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.LineNumber lineNumber4 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation5 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber4);
    org.apache.bcel.classfile.Code code6 = null;
    stringRepresentation5.visitCode(code6);
    org.apache.bcel.classfile.CodeException codeException12 = new org.apache.bcel.classfile.CodeException(0, (int)(short)228, (int)(short)112, (int)(short)112);
    stringRepresentation5.visitCodeException(codeException12);
    constantPool1.accept((org.apache.bcel.classfile.Visitor)stringRepresentation5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test394"); }

    int i1 = org.apache.bcel.Const.getProduceStack((int)(short)206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test395"); }

    org.apache.bcel.generic.INVOKEDYNAMIC iNVOKEDYNAMIC1 = new org.apache.bcel.generic.INVOKEDYNAMIC((int)(short)6);
    org.apache.bcel.classfile.Constant[] constant_array5 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constant_array5);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPool6.copy();
    org.apache.bcel.classfile.SourceFile sourceFile8 = new org.apache.bcel.classfile.SourceFile((int)(short)228, (int)(short)46, (int)(byte)83, constantPool7);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = iNVOKEDYNAMIC1.toString(constantPool7);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test396"); }

    short s0 = org.apache.bcel.Const.INVOKEDYNAMIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)186);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test397"); }

    int i0 = org.apache.bcel.Const.SAME_FRAME_MAX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 63);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test398"); }

    short s0 = org.apache.bcel.Constants.ASTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)75);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test399"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.util.InstructionFinder instructionFinder4 = new org.apache.bcel.util.InstructionFinder(instructionList3);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction5 = org.apache.bcel.generic.InstructionConst.FREM;
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    int i10 = instructionList9.size();
    java.lang.String str12 = instructionList9.toString(true);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList3.insert((org.apache.bcel.generic.Instruction)arithmeticInstruction5, instructionList9);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "   0: impdep2[255](1)\n   1: fconst_1[12](1)\n"+ "'", str12.equals("   0: impdep2[255](1)\n   1: fconst_1[12](1)\n"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test400"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ConstantDouble constantDouble4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantDouble(constantDouble4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test401"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.classfile.Constant[] constant_array2 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool3 = new org.apache.bcel.classfile.ConstantPool(constant_array2);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool3.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen6 = new org.apache.bcel.generic.EnumElementValueGen(objectType0, "<illegal type>", constantPoolGen5);
    java.io.DataOutputStream dataOutputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    enumElementValueGen6.dump(dataOutputStream7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test402"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPool1.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constantPool1);
    org.apache.bcel.generic.InstructionFactory instructionFactory4 = new org.apache.bcel.generic.InstructionFactory(constantPoolGen3);
    java.lang.String str5 = constantPoolGen3.toString();
    int i9 = constantPoolGen3.lookupInterfaceMethodref("hi!", "org.apache.bcel.verifier.VerifyDialog[dialog2,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "org.apache.bcel.verifier.VerifyDialog[dialog6,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test403"); }

    org.apache.bcel.util.ClassPath classPath0 = org.apache.bcel.util.ClassPath.SYSTEM_CLASS_PATH;
    org.apache.bcel.util.MemorySensitiveClassPathRepository memorySensitiveClassPathRepository1 = new org.apache.bcel.util.MemorySensitiveClassPathRepository(classPath0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(classPath0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test404"); }

    short s0 = org.apache.bcel.Const.FMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)106);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test405"); }

    short s0 = org.apache.bcel.Const.PUTFIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)181);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test406"); }

    short s0 = org.apache.bcel.Constants.FDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)110);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test407"); }

    short s0 = org.apache.bcel.Constants.IINC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)132);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test408"); }

    org.apache.bcel.classfile.Constant[] constant_array8 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool9 = new org.apache.bcel.classfile.ConstantPool(constant_array8);
    org.apache.bcel.classfile.ConstantPool constantPool10 = constantPool9.copy();
    org.apache.bcel.classfile.Signature signature11 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool10);
    org.apache.bcel.classfile.LocalVariable localVariable12 = new org.apache.bcel.classfile.LocalVariable(0, 0, (int)(short)213, (int)(short)8, (int)(short)92, constantPool10);
    localVariable12.setStartPC((int)(short)64);
    localVariable12.setSignatureIndex((int)(short)255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool10);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test409"); }

    org.apache.bcel.generic.ObjectType objectType1 = org.apache.bcel.generic.Type.STRING;
    boolean b3 = objectType1.equals((java.lang.Object)(short)148);
    org.apache.bcel.verifier.structurals.OperandStack operandStack4 = new org.apache.bcel.verifier.structurals.OperandStack((int)(short)2048, objectType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test410"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.ConstantValue constantValue6 = new org.apache.bcel.classfile.ConstantValue((int)(short)200, (int)(short)4712, (int)(byte)74, constantPool4);
    java.io.DataOutputStream dataOutputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    constantValue6.dump(dataOutputStream7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test411"); }

    short s0 = org.apache.bcel.Const.FSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)102);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test412"); }

    byte byte0 = org.apache.bcel.Const.ATTR_STACK_MAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)11);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test413"); }

    int i0 = java.awt.Frame.TEXT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test414"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.lang.String str3 = verifyDialog2.toString();
    java.lang.String str4 = verifyDialog2.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.bcel.verifier.VerifyDialog[dialog20,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("org.apache.bcel.verifier.VerifyDialog[dialog20,67,27,0str3,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test415"); }

    int i0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test416"); }

    byte byte0 = org.apache.bcel.classfile.JavaClass.HEAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)1);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test417"); }

    short s0 = org.apache.bcel.Constants.ASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)58);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test418"); }

    int[] i_array4 = new int[] { 254, (short)128, (short)173 };
    org.apache.bcel.classfile.BootstrapMethod bootstrapMethod5 = new org.apache.bcel.classfile.BootstrapMethod((int)(short)3, i_array4);
    org.apache.bcel.classfile.BootstrapMethod bootstrapMethod6 = bootstrapMethod5.copy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bootstrapMethod6);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test419"); }

    short s0 = org.apache.bcel.Const.ICONST_5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)8);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test420"); }

    // The following exception was thrown during execution in test generation
    try {
    short s2 = org.apache.bcel.Const.getOperandType(9, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test421"); }

    short s0 = org.apache.bcel.Const.DLOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)24);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test422"); }

    short s0 = org.apache.bcel.Constants.ANEWARRAY_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)222);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test423"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_EXCEPTIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)3);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test424"); }

    short s0 = org.apache.bcel.Const.LDC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)18);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test425"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, "org.apache.bcel.verifier.VerifyDialog[dialog7,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.peer.ComponentPeer componentPeer3 = verifyDialog2.getPeer();
    java.awt.image.ImageProducer imageProducer4 = null;
    java.awt.Image image5 = verifyDialog2.createImage(imageProducer4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image5);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test426"); }

    short s0 = org.apache.bcel.Const.INVOKESTATIC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)217);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test427"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, "org.apache.bcel.verifier.VerifyDialog[dialog7,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.event.WindowFocusListener windowFocusListener3 = null;
    verifyDialog2.addWindowFocusListener(windowFocusListener3);
    boolean b5 = verifyDialog2.isLightweight();
    boolean b8 = verifyDialog2.inside((int)(short)70, (int)(byte)115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test428"); }

    short s0 = org.apache.bcel.Constants.ATHROW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)191);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test429"); }

    java.lang.Class<?> cls0 = null;
    java.lang.Class[] class_array2 = new java.lang.Class[ 1 ];
    @SuppressWarnings("unchecked")
    java.lang.Class<?>[] cls_array3 = (java.lang.Class<?>[])class_array2;
    cls_array3[0] = cls0;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.Type[] type_array6 = org.apache.bcel.generic.Type.getTypes(cls_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls_array3);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test430"); }

    short s0 = org.apache.bcel.Constants.GOTO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)167);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test431"); }

    org.apache.bcel.verifier.structurals.GenericArray genericArray0 = new org.apache.bcel.verifier.structurals.GenericArray();

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test432"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    javax.swing.JMenuBar jMenuBar3 = verifyDialog2.getJMenuBar();
    boolean b4 = verifyDialog2.isFocusCycleRoot();
    int i7 = verifyDialog2.getBaseline((int)(short)64, (int)(byte)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test433"); }

    byte byte0 = org.apache.bcel.Const.T_BOOLEAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test434"); }

    org.apache.bcel.generic.INVOKEDYNAMIC iNVOKEDYNAMIC1 = new org.apache.bcel.generic.INVOKEDYNAMIC((int)(short)6);
    org.apache.bcel.generic.ClassGen classGen2 = null;
    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = new org.apache.bcel.generic.ConstantPoolGen(constantPool4);
    org.apache.bcel.generic.InstructionFactory instructionFactory7 = new org.apache.bcel.generic.InstructionFactory(classGen2, constantPoolGen6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = iNVOKEDYNAMIC1.getSignature(constantPoolGen6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test435"); }

    short[][] s_array_array0 = org.apache.bcel.Constants.TYPE_OF_OPERANDS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(s_array_array0);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test436"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPool1.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constantPool1);
    org.apache.bcel.generic.PUSH pUSH5 = new org.apache.bcel.generic.PUSH(constantPoolGen3, (java.lang.Number)(short)167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test437"); }

    short s0 = org.apache.bcel.Const.DUP_X2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)91);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test438"); }

    short s0 = org.apache.bcel.Const.IRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)172);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test439"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Rectangle rectangle3 = verifyDialog2.bounds();
    verifyDialog2.removeNotify();
    java.awt.im.InputContext inputContext5 = verifyDialog2.getInputContext();
    java.awt.Event event6 = null;
    boolean b8 = verifyDialog2.keyDown(event6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test440"); }

    int i0 = java.awt.Frame.HAND_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test441"); }

    byte[] byte_array4 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    org.apache.bcel.classfile.Constant[] constant_array6 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool7 = new org.apache.bcel.classfile.ConstantPool(constant_array6);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Unknown unknown8 = new org.apache.bcel.classfile.Unknown(0, 1, byte_array4, constantPool7);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array6);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test442"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber(lineNumber2);
    int i4 = lineNumber2.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 78);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test443"); }

    java.awt.Frame[] frame_array0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(frame_array0);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test444"); }

    int i0 = org.apache.bcel.Const.MAX_SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 65535);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test445"); }

    short s0 = org.apache.bcel.Constants.IDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)108);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test446"); }

    short s0 = org.apache.bcel.Constants.FLOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)35);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test447"); }

    org.apache.bcel.verifier.VerificationResult verificationResult0 = org.apache.bcel.verifier.VerificationResult.VR_NOTYET;
    boolean b2 = verificationResult0.equals((java.lang.Object)(short)141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(verificationResult0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test448"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType2 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType0, (int)(short)193);
    org.apache.bcel.generic.Type type3 = arrayType2.getBasicType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type3);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test449"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    java.awt.Container container3 = verifyDialog2.getParent();
    verifyDialog2.firePropertyChange("org.apache.bcel.verifier.VerifyDialog[dialog9,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (short)153, (short)151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container3);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test450"); }

    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constant_array1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPool2.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool2);
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen6 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)221, constantPoolGen4, (byte)0);
    org.apache.bcel.generic.PUSH pUSH8 = new org.apache.bcel.generic.PUSH(constantPoolGen4, (long)(short)121);
    int i10 = constantPoolGen4.lookupUtf8("org.apache.bcel.verifier.VerifyDialog[dialog3,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    int i13 = constantPoolGen4.addNameAndType("org.apache.bcel.verifier.VerifyDialog[dialog9,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "<illegal type>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 6);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test451"); }

    java.io.DataInput dataInput2 = null;
    org.apache.bcel.classfile.ConstantPool constantPool3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.RuntimeInvisibleAnnotations runtimeInvisibleAnnotations4 = new org.apache.bcel.classfile.RuntimeInvisibleAnnotations((int)(short)210, (int)(short)184, dataInput2, constantPool3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test452"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.ITEM_NAMES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test453"); }

    short s0 = org.apache.bcel.Constants.ALOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)43);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test454"); }

    org.apache.bcel.verifier.structurals.OperandStack operandStack1 = new org.apache.bcel.verifier.structurals.OperandStack((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.Type type2 = operandStack1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test455"); }

    short s0 = org.apache.bcel.Const.SALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)53);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test456"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.CodeException codeException10 = new org.apache.bcel.classfile.CodeException(0, (int)(short)228, (int)(short)112, (int)(short)112);
    stringRepresentation3.visitCodeException(codeException10);
    org.apache.bcel.classfile.Constant[] constant_array15 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool16 = new org.apache.bcel.classfile.ConstantPool(constant_array15);
    org.apache.bcel.classfile.ConstantPool constantPool17 = constantPool16.copy();
    org.apache.bcel.classfile.SourceFile sourceFile18 = new org.apache.bcel.classfile.SourceFile((int)(short)228, (int)(short)46, (int)(byte)83, constantPool17);
    stringRepresentation3.visitSourceFile(sourceFile18);
    org.apache.bcel.classfile.Synthetic synthetic20 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitSynthetic(synthetic20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool17);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test457"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPool1.copy();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constantPool1);
    org.apache.bcel.generic.PUSH pUSH5 = new org.apache.bcel.generic.PUSH(constantPoolGen3, (int)(short)103);
    org.apache.bcel.generic.MethodGen methodGen6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = constantPoolGen3.lookupMethodref(methodGen6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test458"); }

    java.lang.reflect.Method method0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.bcel.generic.Type.getSignature(method0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test459"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    boolean b3 = verifyDialog2.isFontSet();
    java.awt.Event event4 = null;
    boolean b6 = verifyDialog2.keyDown(event4, (int)(short)68);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array7 = verifyDialog2.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array7);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test460"); }

    org.apache.bcel.verifier.VerifierFactoryListModel verifierFactoryListModel0 = new org.apache.bcel.verifier.VerifierFactoryListModel();

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test461"); }

    byte byte0 = org.apache.bcel.Constants.T_DOUBLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test462"); }

    short s0 = org.apache.bcel.Const.IFGT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)157);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test463"); }

    short s0 = org.apache.bcel.Const.MINOR_1_5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)0);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test464"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "hi!" };
    org.apache.bcel.util.ClassLoader classLoader3 = new org.apache.bcel.util.ClassLoader(str_array2);
    org.apache.bcel.util.ClassLoader classLoader4 = new org.apache.bcel.util.ClassLoader((java.lang.ClassLoader)classLoader3);
    classLoader3.setPackageAssertionStatus("", true);
    org.apache.bcel.util.ClassLoader classLoader8 = new org.apache.bcel.util.ClassLoader((java.lang.ClassLoader)classLoader3);
    java.io.InputStream inputStream10 = classLoader3.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream10);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test465"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver4 = null;
    instructionList3.addObserver(instructionListObserver4);
    org.apache.bcel.generic.InstructionList instructionList6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList3.append(instructionList6);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test466"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, "org.apache.bcel.verifier.VerifyDialog[dialog7,67,27,0x0,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.event.WindowFocusListener windowFocusListener3 = null;
    verifyDialog2.addWindowFocusListener(windowFocusListener3);
    boolean b5 = verifyDialog2.isLightweight();
    boolean b6 = verifyDialog2.isEnabled();
    boolean b7 = verifyDialog2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test467"); }

    org.apache.bcel.verifier.structurals.InstConstraintVisitor instConstraintVisitor0 = new org.apache.bcel.verifier.structurals.InstConstraintVisitor();
    org.apache.bcel.generic.NOP nOP1 = null;
    instConstraintVisitor0.visitNOP(nOP1);
    org.apache.bcel.generic.ARRAYLENGTH aRRAYLENGTH3 = null;
    // The following exception was thrown during execution in test generation
    try {
    instConstraintVisitor0.visitARRAYLENGTH(aRRAYLENGTH3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test468"); }

    org.apache.bcel.classfile.AnnotationEntry annotationEntry1 = null;
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool11 = new org.apache.bcel.classfile.ConstantPool(constant_array10);
    org.apache.bcel.classfile.ConstantPool constantPool12 = constantPool11.copy();
    org.apache.bcel.classfile.Signature signature13 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool12);
    org.apache.bcel.classfile.LocalVariable localVariable14 = new org.apache.bcel.classfile.LocalVariable(0, 0, (int)(short)213, (int)(short)8, (int)(short)92, constantPool12);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.AnnotationElementValue annotationElementValue15 = new org.apache.bcel.classfile.AnnotationElementValue(6, annotationEntry1, constantPool12);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool12);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test469"); }

    short s0 = org.apache.bcel.Constants.INEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)116);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test470"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = org.apache.bcel.generic.MethodGen.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bCELComparator0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test471"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    javax.swing.JMenuBar jMenuBar3 = verifyDialog2.getJMenuBar();
    boolean b4 = verifyDialog2.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test472"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = org.apache.bcel.classfile.JavaClass.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bCELComparator0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test473"); }

    short s0 = org.apache.bcel.Constants.FSTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)68);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test474"); }

    java.awt.Frame frame0 = null;
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
    javax.swing.JMenuBar jMenuBar3 = verifyDialog2.getJMenuBar();
    boolean b4 = verifyDialog2.isFocusCycleRoot();
    java.awt.event.WindowListener[] windowListener_array5 = verifyDialog2.getWindowListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowListener_array5);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test475"); }

    short s0 = org.apache.bcel.Const.FDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)110);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test476"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Code code4 = null;
    stringRepresentation3.visitCode(code4);
    org.apache.bcel.classfile.Constant[] constant_array14 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool15 = new org.apache.bcel.classfile.ConstantPool(constant_array14);
    org.apache.bcel.classfile.ConstantPool constantPool16 = constantPool15.copy();
    org.apache.bcel.classfile.Signature signature17 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool16);
    org.apache.bcel.classfile.LocalVariable localVariable18 = new org.apache.bcel.classfile.LocalVariable(0, 0, (int)(short)213, (int)(short)8, (int)(short)92, constantPool16);
    stringRepresentation3.visitLocalVariable(localVariable18);
    org.apache.bcel.classfile.ConstantInteger constantInteger20 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantInteger(constantInteger20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool16);

  }

}
