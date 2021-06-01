
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class  ConstantPoolGenMergedTest {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test001"); }

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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test002"); }

    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test003"); }

    short s0 = org.apache.bcel.Const.AASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)83);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test004"); }

    org.apache.bcel.generic.FRETURN fRETURN0 = new org.apache.bcel.generic.FRETURN();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test005"); }

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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test006"); }

    short s0 = org.apache.bcel.Constants.LDC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)203);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test007"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.ObjectType objectType1 = null;
    org.apache.bcel.generic.PUSH pUSH2 = new org.apache.bcel.generic.PUSH(constantPoolGen0, objectType1);

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

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ILOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test014"); }

    short s0 = org.apache.bcel.Constants.INVOKEVIRTUAL_QUICK_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)226);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test015"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Long;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test016"); }

    byte byte0 = org.apache.bcel.Const.ATTR_SIGNATURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test017"); }

    byte byte0 = org.apache.bcel.Const.ITEM_Long;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test018"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConst.SWAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test019"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.I2S;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test020"); }

    short s0 = org.apache.bcel.Constants.ILOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)27);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test021"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test022"); }

    short s0 = org.apache.bcel.Constants.ASTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)78);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test023"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.I2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test024"); }

    short s0 = org.apache.bcel.Constants.LCMP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)148);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test025"); }

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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test026"); }

    short s0 = org.apache.bcel.Constants.ASTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)77);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test027"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.PRIMITIVE_SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)83);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test028"); }

    short s0 = org.apache.bcel.Const.RESERVED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)-3);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test029"); }

    short s0 = org.apache.bcel.Const.IF_ICMPNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)160);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test030"); }

    org.apache.bcel.classfile.Attribute.removeAttributeReader("");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test031"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.DMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test032"); }

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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test033"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LXOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test034"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.ARRAYLENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test035"); }

    short s0 = org.apache.bcel.Const.PUTFIELD_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)207);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test036"); }

    short s0 = org.apache.bcel.Constants.IFLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)158);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test037"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.IAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test038"); }

    java.lang.String str1 = org.apache.bcel.Const.getAccessName((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "abstract"+ "'", str1.equals("abstract"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test039"); }

    short s0 = org.apache.bcel.Const.ICONST_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)6);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test040"); }

    org.apache.bcel.generic.Type[] type_array0 = org.apache.bcel.generic.Type.NO_ARGS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type_array0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test041"); }

    org.apache.bcel.classfile.Attribute.removeAttributeReader("hi!");

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test042"); }

    short s0 = org.apache.bcel.Constants.INSTANCEOF;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)193);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test043"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ATHROW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test044"); }

    short s0 = org.apache.bcel.Const.DUP2_X2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)94);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test045"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.ICONST_5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

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

    org.apache.bcel.generic.FREM fREM0 = new org.apache.bcel.generic.FREM();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test063"); }

    short s0 = org.apache.bcel.Const.GETFIELD_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)206);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test064"); }

    short s0 = org.apache.bcel.Const.ASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)58);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test065"); }

    short s0 = org.apache.bcel.Const.ATHROW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)191);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test066"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.PRIMITIVE_FLOAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)70);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test067"); }

    short s0 = org.apache.bcel.Constants.JSR_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)201);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test068"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ILOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test069"); }

    short s0 = org.apache.bcel.Const.POP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)88);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test070"); }

    short s0 = org.apache.bcel.Constants.MINOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)3);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test071"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ISTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test072"); }

    byte byte0 = org.apache.bcel.Const.ATTR_SOURCE_FILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test073"); }

    short s0 = org.apache.bcel.Constants.ICONST_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)6);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test074"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ACONST_NULL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test075"); }

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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test076"); }

    short s0 = org.apache.bcel.Constants.LALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)47);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test077"); }

    short s0 = org.apache.bcel.Const.FCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)149);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test078"); }

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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test079"); }

    short s0 = org.apache.bcel.Constants.IREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)112);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test080"); }

    short s0 = org.apache.bcel.Const.ARETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)176);

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

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.PUSH pUSH2 = new org.apache.bcel.generic.PUSH(constantPoolGen0, (float)(short)1);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test085"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)48);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test086"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.LASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test087"); }

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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test088"); }

    short s0 = org.apache.bcel.Constants.FCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)11);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test089"); }

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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test090"); }

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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test091"); }

    short s0 = org.apache.bcel.Const.GOTO_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)200);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test092"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_CONSTANT_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test093"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_SYNTHETIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test094"); }

    short s0 = org.apache.bcel.Const.DCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)151);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test095"); }

    short s0 = org.apache.bcel.Constants.IALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)46);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test096"); }

    short s0 = org.apache.bcel.Constants.ISTORE_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)60);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test097"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "hi!" };
    org.apache.bcel.util.ClassLoader classLoader3 = new org.apache.bcel.util.ClassLoader(str_array2);
    org.apache.bcel.util.ClassLoader classLoader4 = new org.apache.bcel.util.ClassLoader((java.lang.ClassLoader)classLoader3);
    classLoader3.setPackageAssertionStatus("", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test098"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test099"); }

    short s0 = org.apache.bcel.Constants.ACC_ANNOTATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)8192);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test100"); }

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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test101"); }

    short s0 = org.apache.bcel.Constants.ALOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)42);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test102"); }

    short s0 = org.apache.bcel.Constants.ACC_SYNCHRONIZED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)32);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test103"); }

    byte byte0 = org.apache.bcel.Const.REF_invokeVirtual;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test104"); }

    org.apache.bcel.generic.LDIV lDIV0 = new org.apache.bcel.generic.LDIV();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test105"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.ISHL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test106"); }

    short s0 = org.apache.bcel.Constants.ACC_SYNTHETIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)4096);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test107"); }

    org.apache.bcel.generic.LUSHR lUSHR0 = new org.apache.bcel.generic.LUSHR();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test108"); }

    org.apache.bcel.generic.F2I f2I0 = new org.apache.bcel.generic.F2I();

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test109"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.THIS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test110"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_NameAndType;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test111"); }

    short s0 = org.apache.bcel.Constants.ACC_STRICT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)2048);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test112"); }

    short s0 = org.apache.bcel.Const.GETFIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)180);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test113"); }

    short s0 = org.apache.bcel.Const.IF_ICMPEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)159);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test114"); }

    short s0 = org.apache.bcel.Const.ACC_SUPER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)32);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test115"); }

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
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test116"); }

    org.apache.bcel.verifier.statics.DOUBLE_Upper dOUBLE_Upper0 = org.apache.bcel.verifier.statics.DOUBLE_Upper.theInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dOUBLE_Upper0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test117"); }

    short s0 = org.apache.bcel.Constants.LLOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)31);

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
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test123"); }

    short s0 = org.apache.bcel.Constants.KNOWN_ATTRIBUTES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)12);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test124"); }

    short s0 = org.apache.bcel.Constants.DUP_X1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)90);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test125"); }

    short s0 = org.apache.bcel.Constants.LMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)105);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test126"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConstants.DUP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test127"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.I2B;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test128"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.INEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test129"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ALOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test130"); }

    short s0 = org.apache.bcel.Const.ACC_ENUM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)16384);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test131"); }

    short s0 = org.apache.bcel.Constants.MONITOREXIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)195);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test132"); }

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
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test133"); }

    short s0 = org.apache.bcel.Const.PUTFIELD_QUICK_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)228);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test134"); }

    org.apache.bcel.generic.SWAP sWAP0 = new org.apache.bcel.generic.SWAP();

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test135"); }

    short s0 = org.apache.bcel.Constants.LSTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)65);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test136"); }

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
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test137"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.IADD;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    int i2 = arithmeticInstruction0.produceStack(constantPoolGen1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test138"); }

    short s0 = org.apache.bcel.Const.ISTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)62);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test139"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ILOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test140"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.PUSH pUSH2 = new org.apache.bcel.generic.PUSH(constantPoolGen0, (java.lang.Number)0.0f);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test141"); }

    short s0 = org.apache.bcel.Const.IFEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)153);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test142"); }

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
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test143"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.LNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test144"); }

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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test145"); }

    java.lang.String str0 = org.apache.bcel.Constants.STATIC_INITIALIZER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<clinit>"+ "'", str0.equals("<clinit>"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test146"); }

    short s0 = org.apache.bcel.Const.ACC_STATIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)8);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test147"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)49);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test148"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_LONG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 74);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test149"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.IALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test150"); }

    short s0 = org.apache.bcel.Const.MINOR_1_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test151"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.STRING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)115);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test152"); }

    short s0 = org.apache.bcel.Constants.INVOKEVIRTUAL_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)214);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test153"); }

    short s0 = org.apache.bcel.Const.LCONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)10);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test154"); }

    short s0 = org.apache.bcel.Constants.D2F;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)144);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test155"); }

    org.apache.bcel.generic.DUP dUP0 = new org.apache.bcel.generic.DUP();

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test156"); }

    short s0 = org.apache.bcel.Const.AALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)50);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test157"); }

    short s0 = org.apache.bcel.Const.FADD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)98);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test158"); }

    short s0 = org.apache.bcel.Constants.PUTFIELD2_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)209);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test159"); }

    byte byte0 = org.apache.bcel.Const.REF_putStatic;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test160"); }

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
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test161"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.FCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test162"); }

    org.apache.bcel.generic.FCMPG fCMPG0 = new org.apache.bcel.generic.FCMPG();

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test163"); }

    java.lang.Class<java.lang.ExceptionInInitializerError> cls0 = org.apache.bcel.ExceptionConst.EXCEPTION_IN_INITIALIZER_ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test164"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.L2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test165"); }

    java.awt.Frame frame0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, true);
      org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException");
    } catch (java.awt.HeadlessException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test166"); }

    short s0 = org.apache.bcel.Const.I2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)133);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test167"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.L2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test168"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_SIGNATURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test169"); }

    short s0 = org.apache.bcel.Const.FCONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)12);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test170"); }

    byte byte0 = org.apache.bcel.Const.ATTR_LOCAL_VARIABLE_TYPE_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)17);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test171"); }

    short s0 = org.apache.bcel.Constants.ACC_ABSTRACT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)1024);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test172"); }

    org.apache.bcel.verifier.statics.LONG_Upper lONG_Upper0 = org.apache.bcel.verifier.statics.LONG_Upper.theInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lONG_Upper0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test173"); }

    short s0 = org.apache.bcel.Const.IMPDEP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)255);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test174"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.L2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test175"); }

    org.apache.bcel.generic.F2L f2L0 = new org.apache.bcel.generic.F2L();

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test176"); }

    org.apache.bcel.generic.LDC lDC1 = new org.apache.bcel.generic.LDC((int)(short)191);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test177"); }

    org.apache.bcel.generic.LSTORE lSTORE1 = new org.apache.bcel.generic.LSTORE((int)(short)161);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    int i3 = lSTORE1.produceStack(constantPoolGen2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test178"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.F2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test179"); }

    short s0 = org.apache.bcel.Constants.MULTIANEWARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)197);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test180"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.EnumElementValue enumElementValue5 = new org.apache.bcel.classfile.EnumElementValue((int)(short)255, (int)(short)-1, (int)(short)46, constantPool4);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test181"); }

    short s0 = org.apache.bcel.Const.INVOKEVIRTUAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)182);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test182"); }

    short[][] s_array_array0 = org.apache.bcel.Constants.TYPE_OF_OPERANDS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(s_array_array0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test183"); }

    short s0 = org.apache.bcel.Const.DRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)175);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test184"); }

    java.io.DataInput dataInput0 = null;
    org.apache.bcel.classfile.LocalVariable localVariable3 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array4 = new org.apache.bcel.classfile.LocalVariable[] { localVariable3 };
    org.apache.bcel.classfile.Constant[] constant_array5 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constant_array5);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPool6.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable8 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array4, constantPool6);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Attribute attribute9 = org.apache.bcel.classfile.Attribute.readAttribute(dataInput0, constantPool6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test185"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Unknown unknown4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitUnknown(unknown4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test186"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.ATHROW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test187"); }

    org.apache.bcel.generic.MethodGen methodGen0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.structurals.ExceptionHandlers exceptionHandlers1 = new org.apache.bcel.verifier.structurals.ExceptionHandlers(methodGen0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test188"); }

    byte byte0 = org.apache.bcel.Const.ITEM_Null;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test189"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.SASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test190"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Float;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test191"); }

    short s0 = org.apache.bcel.Constants.DREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)115);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test192"); }

    short s0 = org.apache.bcel.Constants.DDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)111);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test193"); }

    org.apache.bcel.generic.Instruction[] instruction_array0 = org.apache.bcel.generic.InstructionConstants.INSTRUCTIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction_array0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test194"); }

    short s0 = org.apache.bcel.Const.UNPREDICTABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)-2);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test195"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ConstantMethodType constantMethodType4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantMethodType(constantMethodType4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test196"); }

    int i0 = java.awt.Frame.MAXIMIZED_HORIZ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test197"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test198"); }

    short s0 = org.apache.bcel.Const.L2F;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)137);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test199"); }

    java.io.DataInput dataInput0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen3 = org.apache.bcel.generic.AnnotationEntryGen.read(dataInput0, constantPoolGen1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test200"); }

    org.apache.bcel.generic.LADD lADD0 = new org.apache.bcel.generic.LADD();

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test201"); }

    org.apache.bcel.generic.INVOKESPECIAL iNVOKESPECIAL1 = new org.apache.bcel.generic.INVOKESPECIAL(0);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = iNVOKESPECIAL1.getMethodName(constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test202"); }

    int i1 = org.apache.bcel.Const.getProduceStack(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test203"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.Signature signature6 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool5);
    signature6.setSignatureIndex((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = signature6.toString();
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test204"); }

    org.apache.bcel.generic.F2D f2D0 = new org.apache.bcel.generic.F2D();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    f2D0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test205"); }

    byte byte0 = org.apache.bcel.Const.T_INT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test206"); }

    short s0 = org.apache.bcel.Const.INVOKESTATIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)184);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test207"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.AASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test208"); }

    org.apache.bcel.generic.CASTORE cASTORE0 = new org.apache.bcel.generic.CASTORE();

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test209"); }

    short s0 = org.apache.bcel.Const.PUTSTATIC2_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)213);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test210"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.DCONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test211"); }

    org.apache.bcel.classfile.ConstantValue constantValue0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.ConstantValue constantValue1 = new org.apache.bcel.classfile.ConstantValue(constantValue0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test212"); }

    org.apache.bcel.generic.GETSTATIC gETSTATIC1 = new org.apache.bcel.generic.GETSTATIC(10);
    org.apache.bcel.generic.Visitor visitor2 = null;
    // The following exception was thrown during execution in test generation
    try {
    gETSTATIC1.accept(visitor2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test213"); }

    short s0 = org.apache.bcel.Constants.LSHL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)121);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test214"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.Signature signature10 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool9);
    stringRepresentation3.visitSignature(signature10);
    org.apache.bcel.classfile.ParameterAnnotationEntry parameterAnnotationEntry12 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitParameterAnnotationEntry(parameterAnnotationEntry12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test215"); }

    short s0 = org.apache.bcel.Const.IF_ACMPNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)166);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test216"); }

    short s0 = org.apache.bcel.Constants.DLOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)24);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test217"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.ARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)91);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test218"); }

    short s0 = org.apache.bcel.Constants.FNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)118);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test219"); }

    org.apache.bcel.generic.ObjectType objectType1 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType3 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType1, (int)(short)193);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction4 = org.apache.bcel.generic.InstructionFactory.createBinaryOperation("", (org.apache.bcel.generic.Type)arrayType3);
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType1);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test220"); }

    org.apache.bcel.generic.LOR lOR0 = new org.apache.bcel.generic.LOR();
    short s1 = lOR0.getOpcode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s1 == (short)129);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test221"); }

    org.apache.bcel.classfile.LocalVariable localVariable2 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array3 = new org.apache.bcel.classfile.LocalVariable[] { localVariable2 };
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable7 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array3, constantPool5);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.LocalVariable localVariable10 = localVariableTable7.getLocalVariable((int)(short)255, (int)(short)16384);
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

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test222"); }

    short s0 = org.apache.bcel.Constants.DSTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)57);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test223"); }

    short s0 = org.apache.bcel.Constants.LOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)129);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test224"); }

    java.lang.Class<java.lang.ClassFormatError> cls0 = org.apache.bcel.ExceptionConst.CLASS_FORMAT_ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test225"); }

    byte byte0 = org.apache.bcel.classfile.ElementValue.PRIMITIVE_CHAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)67);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test226"); }

    int i0 = javax.swing.JFrame.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test227"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.F2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test228"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.Signature signature10 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool9);
    stringRepresentation3.visitSignature(signature10);
    org.apache.bcel.classfile.StackMap stackMap12 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitStackMap(stackMap12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test229"); }

    byte byte0 = org.apache.bcel.Constants.T_INT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)10);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test230"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.VerifierAppFrame verifierAppFrame0 = new org.apache.bcel.verifier.VerifierAppFrame();
      org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException");
    } catch (java.awt.HeadlessException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test231"); }

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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test232"); }

    short s0 = org.apache.bcel.Constants.GOTO_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)200);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test233"); }

    org.apache.bcel.generic.SASTORE sASTORE0 = new org.apache.bcel.generic.SASTORE();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test234"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    byte[] byte_array3 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList4 = new org.apache.bcel.generic.InstructionList(byte_array3);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle5 = instructionList4.spliterator();
    org.apache.bcel.generic.CodeExceptionGen codeExceptionGen6 = null;
    org.apache.bcel.generic.CodeExceptionGen[] codeExceptionGen_array7 = new org.apache.bcel.generic.CodeExceptionGen[] { codeExceptionGen6 };
    // The following exception was thrown during execution in test generation
    try {
    int i8 = org.apache.bcel.generic.MethodGen.getMaxStack(constantPoolGen0, instructionList4, codeExceptionGen_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeExceptionGen_array7);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test235"); }

    byte byte0 = org.apache.bcel.Const.ITEM_Object;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test236"); }

    short s0 = org.apache.bcel.Const.GETSTATIC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)210);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test237"); }

    boolean b1 = org.apache.bcel.classfile.Signature.isFormalParameterList("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test238"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.IASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test239"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.ISHR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test240"); }

    org.apache.bcel.generic.D2I d2I0 = new org.apache.bcel.generic.D2I();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test241"); }

    short s0 = org.apache.bcel.Constants.DUP2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)92);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test242"); }

    short s0 = org.apache.bcel.Constants.IMPDEP1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)254);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test243"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.AnnotationDefault annotationDefault4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitAnnotationDefault(annotationDefault4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test244"); }

    short s0 = org.apache.bcel.Const.LOOKUPSWITCH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)171);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test245"); }

    org.apache.bcel.verifier.exc.LoadingException loadingException1 = new org.apache.bcel.verifier.exc.LoadingException("abstract");
    loadingException1.extendMessage("hi!", "");

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test246"); }

    int i0 = java.awt.Frame.ICONIFIED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test247"); }

    short s0 = org.apache.bcel.Constants.LREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)113);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test248"); }

    org.apache.bcel.generic.INVOKESPECIAL iNVOKESPECIAL1 = new org.apache.bcel.generic.INVOKESPECIAL(0);
    int i2 = iNVOKESPECIAL1.getIndex();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = iNVOKESPECIAL1.getClassName(constantPoolGen3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test249"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.SourceFile sourceFile5 = new org.apache.bcel.classfile.SourceFile(0, (int)(short)228, (int)(short)90, constantPool4);
    sourceFile5.setLength((int)(byte)67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test250"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    lineNumber2.setLineNumber(3);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test251"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle4 = instructionList3.spliterator();
    org.apache.bcel.generic.Instruction instruction5 = org.apache.bcel.generic.InstructionConst.FCONST_2;
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList3.insert(instruction5, instructionList9);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test252"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.SASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test253"); }

    short s0 = org.apache.bcel.Constants.INVOKESUPER_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)216);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test254"); }

    java.lang.String str0 = org.apache.bcel.util.ClassPath.getClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/root/Desktop/bcel/target/classes/:/root/Desktop/jars/junit-4.12.jar:/root/Desktop/jars/hamcrest-core-1.3.jar:/root/Desktop/jdoop/lib/randoop.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar"+ "'", str0.equals("/root/Desktop/bcel/target/classes/:/root/Desktop/jars/junit-4.12.jar:/root/Desktop/jars/hamcrest-core-1.3.jar:/root/Desktop/jdoop/lib/randoop.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test255"); }

    short s0 = org.apache.bcel.Const.IFGT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)157);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test256"); }

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
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test257"); }

    short s0 = org.apache.bcel.Const.DUP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)89);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test258"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Utf8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test259"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.ENUM_CONSTANT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 101);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test260"); }

    byte byte0 = org.apache.bcel.Const.REF_invokeSpecial;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test261"); }

    short s0 = org.apache.bcel.Const.F2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)140);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test262"); }

    org.apache.bcel.generic.LDC2_W lDC2_W1 = new org.apache.bcel.generic.LDC2_W((int)(short)92);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test263"); }

    org.apache.bcel.classfile.Method method0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Method method1 = new org.apache.bcel.classfile.Method(method0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test264"); }

    short s0 = org.apache.bcel.Constants.ARETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)176);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test265"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ElementValuePairGen[] elementValuePairGen_array1 = new org.apache.bcel.generic.ElementValuePairGen[] {  };
    java.util.ArrayList<org.apache.bcel.generic.ElementValuePairGen> arraylist_elementValuePairGen2 = new java.util.ArrayList<org.apache.bcel.generic.ElementValuePairGen>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.bcel.generic.ElementValuePairGen>)arraylist_elementValuePairGen2, elementValuePairGen_array1);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen6 = new org.apache.bcel.generic.AnnotationEntryGen(objectType0, (java.util.List<org.apache.bcel.generic.ElementValuePairGen>)arraylist_elementValuePairGen2, false, constantPoolGen5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(elementValuePairGen_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test266"); }

    org.apache.bcel.generic.DUP2_X2 dUP2_X2_0 = new org.apache.bcel.generic.DUP2_X2();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test267"); }

    short s0 = org.apache.bcel.Constants.MAJOR_1_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)46);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test268"); }

    short s0 = org.apache.bcel.Constants.MAX_ACC_FLAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)16384);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test269"); }

    org.apache.bcel.generic.SIPUSH sIPUSH1 = new org.apache.bcel.generic.SIPUSH((short)193);
    java.lang.Number number2 = sIPUSH1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + number2 + "' != '" + 193+ "'", number2.equals(193));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test270"); }

    short s0 = org.apache.bcel.Const.BIPUSH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)16);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test271"); }

    int i0 = org.apache.bcel.Const.APPEND_FRAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 252);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test272"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)50);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test273"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ICONST_4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test274"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ClassElementValueGen classElementValueGen2 = new org.apache.bcel.generic.ClassElementValueGen(objectType0, constantPoolGen1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test275"); }

    short s0 = org.apache.bcel.Const.IRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)172);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test276"); }

    java.io.DataInput dataInput2 = null;
    org.apache.bcel.classfile.Constant[] constant_array6 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool7 = new org.apache.bcel.classfile.ConstantPool(constant_array6);
    org.apache.bcel.classfile.ConstantPool constantPool8 = constantPool7.copy();
    org.apache.bcel.classfile.Signature signature9 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations runtimeVisibleParameterAnnotations10 = new org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations(0, 10, dataInput2, constantPool8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool8);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test277"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_Class;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test278"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ASTORE_0;
    java.lang.String str2 = localVariableInstruction0.toString(true);
    int i3 = localVariableInstruction0.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "astore_0[75](1)"+ "'", str2.equals("astore_0[75](1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test279"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConstants.DUP2_X1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test280"); }

    short s0 = org.apache.bcel.Const.FSTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)67);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test281"); }

    byte byte0 = org.apache.bcel.Constants.T_VOID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test282"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_MethodHandle;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)15);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test283"); }

    short s0 = org.apache.bcel.Const.DLOAD_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)41);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test284"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.ANNOTATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test285"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.EnclosingMethod enclosingMethod6 = null;
    // The following exception was thrown during execution in test generation
    try {
    descendingVisitor5.visitEnclosingMethod(enclosingMethod6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test286"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.ObjectType objectType1 = org.apache.bcel.generic.Type.STRING;
    boolean b2 = objectType1.referencesClass();
    boolean b3 = objectType1.referencesClass();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.PUSH pUSH4 = new org.apache.bcel.generic.PUSH(constantPoolGen0, objectType1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test287"); }

    short s0 = org.apache.bcel.Constants.D2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)143);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test288"); }

    short s0 = org.apache.bcel.Const.LLOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)32);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test289"); }

    int i0 = org.apache.bcel.verifier.VerificationResult.VERIFIED_OK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test290"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.ConstantValue constantValue6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitConstantValue(constantValue6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test291"); }

    short s0 = org.apache.bcel.Constants.MULTIANEWARRAY_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)223);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test292"); }

    org.apache.bcel.generic.BasicType basicType0 = org.apache.bcel.generic.Type.INT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType0);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test293"); }

    org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException staticCodeInstructionConstraintException1 = new org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException("");

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test294"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    boolean b1 = objectType0.referencesClass();
    org.apache.bcel.generic.ObjectType objectType2 = org.apache.bcel.generic.Type.OBJECT;
    boolean b3 = objectType0.subclassOf(objectType2);
    
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test295"); }

    byte byte0 = org.apache.bcel.Const.ITEM_InitObject;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test296"); }

    byte byte0 = org.apache.bcel.Const.T_OBJECT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)14);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test297"); }

    org.apache.bcel.generic.GETSTATIC gETSTATIC1 = new org.apache.bcel.generic.GETSTATIC((int)(short)3);
    int i2 = gETSTATIC1.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test298"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.Signature signature10 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool9);
    stringRepresentation3.visitSignature(signature10);
    org.apache.bcel.classfile.ConstantMethodHandle constantMethodHandle12 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantMethodHandle(constantMethodHandle12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test299"); }

    short s0 = org.apache.bcel.Constants.IFEQ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)153);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test300"); }

    int i0 = org.apache.bcel.Constants.MAX_BYTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 255);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test301"); }

    byte byte0 = org.apache.bcel.Const.REF_newInvokeSpecial;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)8);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test302"); }

    org.apache.bcel.verifier.exc.LocalVariableInfoInconsistentException localVariableInfoInconsistentException0 = new org.apache.bcel.verifier.exc.LocalVariableInfoInconsistentException();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test303"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_Object;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test304"); }

    java.awt.Frame frame0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, "");
      org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException");
    } catch (java.awt.HeadlessException e) {
      // Expected exception.
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test305"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction2 = org.apache.bcel.generic.InstructionConst.IOR;
    // The following exception was thrown during execution in test generation
    try {
    instructionList1.delete((org.apache.bcel.generic.Instruction)arithmeticInstruction2);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction2);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test306"); }

    short s0 = org.apache.bcel.Constants.LDC_W_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)204);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test307"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ASTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test308"); }

    org.apache.bcel.generic.CALOAD cALOAD0 = new org.apache.bcel.generic.CALOAD();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test309"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.ConstantMethodType constantMethodType6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitConstantMethodType(constantMethodType6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test310"); }

    org.apache.bcel.generic.StackInstruction stackInstruction1 = org.apache.bcel.generic.InstructionFactory.createDup(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction1);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test311"); }

    short s0 = org.apache.bcel.Constants.FMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)106);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test312"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.LocalVariableTypeTable localVariableTypeTable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    descendingVisitor5.visitLocalVariableTypeTable(localVariableTypeTable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test313"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.Annotations annotations6 = null;
    // The following exception was thrown during execution in test generation
    try {
    descendingVisitor5.visitAnnotation(annotations6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test314"); }

    byte byte0 = org.apache.bcel.Constants.T_BYTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)8);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test315"); }

    short s0 = org.apache.bcel.Const.ACC_STRICT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)2048);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test316"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = null;
    org.apache.bcel.classfile.JavaClass.setComparator(bCELComparator0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test317"); }

    org.apache.bcel.verifier.VerifierFactoryObserver verifierFactoryObserver0 = null;
    org.apache.bcel.verifier.VerifierFactory.detach(verifierFactoryObserver0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test318"); }

    short s0 = org.apache.bcel.Constants.FCONST_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)13);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test319"); }

    byte byte0 = org.apache.bcel.Const.T_UNKNOWN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)15);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test320"); }

    org.apache.bcel.classfile.ConstantMethodType constantMethodType0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.ConstantMethodType constantMethodType1 = new org.apache.bcel.classfile.ConstantMethodType(constantMethodType0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test321"); }

    org.apache.bcel.classfile.ClassFormatException classFormatException0 = new org.apache.bcel.classfile.ClassFormatException();

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test322"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = null;
    org.apache.bcel.generic.FieldGen.setComparator(bCELComparator0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test323"); }

    byte byte0 = org.apache.bcel.Constants.T_OBJECT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)14);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test324"); }

    short s0 = org.apache.bcel.Constants.LLOAD_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)33);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test325"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.OBJECT;
    java.lang.String str1 = objectType0.getClassName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "java.lang.Object"+ "'", str1.equals("java.lang.Object"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test326"); }

    short s0 = org.apache.bcel.Const.PUTFIELD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)181);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test327"); }

    int i0 = org.apache.bcel.Const.MAX_ARRAY_DIMENSIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 255);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test328"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.util.JavaWrapper javaWrapper0 = new org.apache.bcel.util.JavaWrapper();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test329"); }

    short s0 = org.apache.bcel.Const.INSTANCEOF;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)193);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test330"); }

    short s0 = org.apache.bcel.Constants.DASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)82);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test331"); }

    int i0 = org.apache.bcel.Constants.MAX_SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 65535);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test332"); }

    short s0 = org.apache.bcel.Const.I2B;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)145);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test333"); }

    short s0 = org.apache.bcel.Const.RETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)177);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test334"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array6 = null;
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool11 = new org.apache.bcel.classfile.ConstantPool(constant_array10);
    org.apache.bcel.classfile.SourceFile sourceFile12 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool11);
    org.apache.bcel.classfile.StackMap stackMap13 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array6, constantPool11);
    stringRepresentation3.visitStackMap(stackMap13);
    org.apache.bcel.classfile.ConstantLong constantLong15 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitConstantLong(constantLong15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test335"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_INT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 73);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test336"); }

    org.apache.bcel.generic.RETURN rETURN0 = new org.apache.bcel.generic.RETURN();

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test337"); }

    boolean b1 = org.apache.bcel.generic.Instruction.isValidShort((int)(short)78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test338"); }

    java.awt.Dialog.ModalityType modalityType0 = java.awt.Dialog.DEFAULT_MODALITY_TYPE;
    org.junit.Assert.assertTrue("'" + modalityType0 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType0.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test339"); }

    int i0 = org.apache.bcel.Const.SAME_FRAME_MAX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 63);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test340"); }

    short s0 = org.apache.bcel.Constants.PUTFIELD_QUICK_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)228);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test341"); }

    org.apache.bcel.generic.ATHROW aTHROW0 = new org.apache.bcel.generic.ATHROW();

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test342"); }

    short s0 = org.apache.bcel.Constants.INVOKESTATIC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)217);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test343"); }

    short s0 = org.apache.bcel.Const.FMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)106);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test344"); }

    short s0 = org.apache.bcel.Const.I2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)135);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test345"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.NOP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test346"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPool1.copy();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = constantPool1.constantToString(0, (byte)0);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test347"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.PUSH pUSH2 = new org.apache.bcel.generic.PUSH(constantPoolGen0, (long)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test348"); }

    byte byte0 = org.apache.bcel.Const.ATTR_SYNTHETIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test349"); }

    java.lang.Iterable<java.lang.String> iterable_str0 = org.apache.bcel.Const.getInterfacesImplementedByArrays();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterable_str0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test350"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.IADD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test351"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.D2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test352"); }

    int i0 = java.awt.Frame.N_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test353"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.CLASS;
    org.apache.bcel.generic.ElementValuePairGen[] elementValuePairGen_array1 = new org.apache.bcel.generic.ElementValuePairGen[] {  };
    java.util.ArrayList<org.apache.bcel.generic.ElementValuePairGen> arraylist_elementValuePairGen2 = new java.util.ArrayList<org.apache.bcel.generic.ElementValuePairGen>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.bcel.generic.ElementValuePairGen>)arraylist_elementValuePairGen2, elementValuePairGen_array1);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen6 = new org.apache.bcel.generic.AnnotationEntryGen(objectType0, (java.util.List<org.apache.bcel.generic.ElementValuePairGen>)arraylist_elementValuePairGen2, true, constantPoolGen5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(elementValuePairGen_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test354"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.FALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test355"); }

    byte[] byte_array6 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.classfile.CodeException codeException8 = null;
    org.apache.bcel.classfile.CodeException[] codeException_array9 = new org.apache.bcel.classfile.CodeException[] { codeException8 };
    org.apache.bcel.classfile.Constant[] constant_array13 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool14 = new org.apache.bcel.classfile.ConstantPool(constant_array13);
    org.apache.bcel.classfile.ConstantPool constantPool15 = constantPool14.copy();
    org.apache.bcel.classfile.Signature signature16 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool15);
    signature16.setSignatureIndex((int)(short)0);
    org.apache.bcel.classfile.LocalVariable localVariable21 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array22 = new org.apache.bcel.classfile.LocalVariable[] { localVariable21 };
    org.apache.bcel.classfile.Constant[] constant_array23 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool24 = new org.apache.bcel.classfile.ConstantPool(constant_array23);
    org.apache.bcel.classfile.ConstantPool constantPool25 = constantPool24.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable26 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array22, constantPool24);
    org.apache.bcel.classfile.LineNumber lineNumber29 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation30 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber29);
    org.apache.bcel.classfile.Constant[] constant_array34 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool35 = new org.apache.bcel.classfile.ConstantPool(constant_array34);
    org.apache.bcel.classfile.ConstantPool constantPool36 = constantPool35.copy();
    org.apache.bcel.classfile.Signature signature37 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool36);
    stringRepresentation30.visitSignature(signature37);
    org.apache.bcel.classfile.Attribute[] attribute_array39 = new org.apache.bcel.classfile.Attribute[] { signature16, localVariableTable26, signature37 };
    org.apache.bcel.classfile.Constant[] constant_array40 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool41 = new org.apache.bcel.classfile.ConstantPool(constant_array40);
    org.apache.bcel.classfile.Code code42 = new org.apache.bcel.classfile.Code((int)(short)131, (int)(byte)15, (int)(short)148, 64, byte_array6, codeException_array9, attribute_array39, constantPool41);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str43 = code42.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeException_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array40);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test356"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.I2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test357"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)53);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test358"); }

    short s0 = org.apache.bcel.Const.INT2BYTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)145);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test359"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.InnerClasses innerClasses6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitInnerClasses(innerClasses6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test360"); }

    short s0 = org.apache.bcel.Constants.DSTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)73);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test361"); }

    org.apache.bcel.generic.ISHR iSHR0 = new org.apache.bcel.generic.ISHR();

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test362"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.ExceptionTable exceptionTable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitExceptionTable(exceptionTable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test363"); }

    java.awt.Frame frame0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.VerifyDialog verifyDialog2 = new org.apache.bcel.verifier.VerifyDialog(frame0, "<clinit>");
      org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException");
    } catch (java.awt.HeadlessException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test364"); }

    short s0 = org.apache.bcel.Const.ICONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)3);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test365"); }

    org.apache.bcel.generic.StackInstruction stackInstruction1 = org.apache.bcel.generic.InstructionFactory.createDup_1((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction1);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test366"); }

    org.apache.bcel.generic.IINC iINC2 = new org.apache.bcel.generic.IINC((int)(short)175, (int)(short)90);
    java.io.DataOutputStream dataOutputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    iINC2.dump(dataOutputStream3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test367"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.Instruction instruction4 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList3.delete(instruction4);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test368"); }

    org.apache.bcel.verifier.exc.ClassConstraintException classConstraintException0 = new org.apache.bcel.verifier.exc.ClassConstraintException();

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test369"); }

    byte byte0 = org.apache.bcel.Const.ATTR_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)14);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test370"); }

    org.apache.bcel.generic.DSUB dSUB0 = new org.apache.bcel.generic.DSUB();

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test371"); }

    short s0 = org.apache.bcel.Const.LSHR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)123);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test372"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.MONITORENTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test373"); }

    short s0 = org.apache.bcel.Constants.DCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)14);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test374"); }

    short s0 = org.apache.bcel.Constants.FASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)81);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test375"); }

    org.apache.bcel.util.ClassPath classPath0 = null;
    org.apache.bcel.util.ClassPath classPath2 = new org.apache.bcel.util.ClassPath(classPath0, "<clinit>");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = classPath2.getPath("", "abstract");
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test376"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.L2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test377"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    byte[] byte_array6 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList7.findHandle(0);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList13.findHandle(0);
    org.apache.bcel.generic.InstructionHandle instructionHandle16 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList3.move(instructionHandle9, instructionHandle15, instructionHandle16);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test378"); }

    int i0 = org.apache.bcel.Const.MAX_CP_ENTRIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 65535);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test379"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction0);
    org.apache.bcel.generic.BranchInstruction branchInstruction2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle3 = instructionList1.append(branchInstruction2);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test380"); }

    org.apache.bcel.util.BCELifier.FLAGS fLAGS1 = null;
    java.lang.String str2 = org.apache.bcel.util.BCELifier.printFlags((int)(short)200, fLAGS1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Const.ACC_STATIC | Const.ACC_VOLATILE | Const.ACC_TRANSIENT"+ "'", str2.equals("Const.ACC_STATIC | Const.ACC_VOLATILE | Const.ACC_TRANSIENT"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test381"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LSHL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test382"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.I2C;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test383"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.SourceFile sourceFile6 = new org.apache.bcel.classfile.SourceFile((int)(short)228, (int)(short)46, (int)(byte)83, constantPool5);
    int i7 = sourceFile6.getSourceFileIndex();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = sourceFile6.toString();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 83);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test384"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.IUSHR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test385"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_InitObject;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test386"); }

    byte byte0 = org.apache.bcel.Const.T_BOOLEAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test387"); }

    short s0 = org.apache.bcel.Const.FDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)110);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test388"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionFactory.createThis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test389"); }

    org.apache.bcel.generic.INVOKEVIRTUAL iNVOKEVIRTUAL1 = new org.apache.bcel.generic.INVOKEVIRTUAL(15);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test390"); }

    short s0 = org.apache.bcel.Const.MAJOR_1_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)45);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test391"); }

    org.apache.bcel.classfile.AnnotationEntry annotationEntry1 = null;
    org.apache.bcel.classfile.Constant[] constant_array2 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool3 = new org.apache.bcel.classfile.ConstantPool(constant_array2);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool3.copy();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.AnnotationElementValue annotationElementValue5 = new org.apache.bcel.classfile.AnnotationElementValue((int)(short)92, annotationEntry1, constantPool3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test392"); }

    java.io.DataInput dataInput2 = null;
    org.apache.bcel.classfile.Constant[] constant_array6 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool7 = new org.apache.bcel.classfile.ConstantPool(constant_array6);
    org.apache.bcel.classfile.SourceFile sourceFile8 = new org.apache.bcel.classfile.SourceFile(0, (int)(short)228, (int)(short)90, constantPool7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations runtimeInvisibleParameterAnnotations9 = new org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations((int)(byte)100, 2, dataInput2, constantPool7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array6);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test393"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConst.DUP_X1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test394"); }

    org.apache.bcel.classfile.Constant[] constant_array2 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool3 = new org.apache.bcel.classfile.ConstantPool(constant_array2);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool3.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue5 = new org.apache.bcel.classfile.ClassElementValue((int)(short)177, (int)(short)181, constantPool3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = classElementValue5.toShortString();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test395"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = org.apache.bcel.classfile.Field.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bCELComparator0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test396"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.EnclosingMethod enclosingMethod4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitEnclosingMethod(enclosingMethod4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test397"); }

    org.apache.bcel.verifier.VerificationResult verificationResult0 = org.apache.bcel.verifier.VerificationResult.VR_NOTYET;
    boolean b2 = verificationResult0.equals((java.lang.Object)(short)184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(verificationResult0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test398"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.F2L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test399"); }

    org.apache.bcel.generic.AALOAD aALOAD0 = new org.apache.bcel.generic.AALOAD();

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test400"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.FCMPG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test401"); }

    short s0 = org.apache.bcel.Constants.MINOR_1_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)3);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test402"); }

    org.apache.bcel.generic.SIPUSH sIPUSH1 = new org.apache.bcel.generic.SIPUSH((short)193);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    org.apache.bcel.generic.Type type3 = sIPUSH1.getType(constantPoolGen2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type3);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test403"); }

    int i0 = java.awt.Frame.MOVE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 13);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test404"); }

    org.apache.bcel.classfile.ClassParser classParser2 = new org.apache.bcel.classfile.ClassParser("abstract", "");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.JavaClass javaClass3 = classParser2.parse();
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test405"); }

    short s0 = org.apache.bcel.Const.ACC_SYNCHRONIZED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)32);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test406"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.SourceFile sourceFile6 = new org.apache.bcel.classfile.SourceFile((int)(short)228, (int)(short)46, (int)(byte)83, constantPool5);
    sourceFile6.setNameIndex((int)(byte)17);
    java.io.DataOutputStream dataOutputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    sourceFile6.dump(dataOutputStream9);
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
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test407"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.VerifyDialog verifyDialog0 = new org.apache.bcel.verifier.VerifyDialog();
      org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException");
    } catch (java.awt.HeadlessException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test408"); }

    short s0 = org.apache.bcel.Const.NEWARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)188);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test409"); }

    byte byte0 = org.apache.bcel.Const.T_REFERENCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)14);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test410"); }

    short s0 = org.apache.bcel.Constants.LNEG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)117);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test411"); }

    byte byte0 = org.apache.bcel.Constants.T_SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)9);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test412"); }

    org.apache.bcel.util.BCELifier.FLAGS fLAGS0 = org.apache.bcel.util.BCELifier.FLAGS.CLASS;
    org.junit.Assert.assertTrue("'" + fLAGS0 + "' != '" + org.apache.bcel.util.BCELifier.FLAGS.CLASS + "'", fLAGS0.equals(org.apache.bcel.util.BCELifier.FLAGS.CLASS));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test413"); }

    org.apache.bcel.generic.BasicType basicType2 = org.apache.bcel.generic.Type.LONG;
    org.apache.bcel.generic.Type type3 = basicType2.normalizeForStackOrLocal();
    byte[] byte_array6 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList7.findHandle(0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction10 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction10);
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle16 = instructionList15.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    org.apache.bcel.generic.LocalVariableGen localVariableGen18 = new org.apache.bcel.generic.LocalVariableGen((int)(byte)6, "hi!", type3, instructionHandle9, instructionHandle17);
    org.apache.bcel.generic.Instruction instruction19 = org.apache.bcel.generic.InstructionConstants.DCONST_0;
    java.lang.Object obj20 = instructionHandle9.getAttribute((java.lang.Object)instruction19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test414"); }

    org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException staticCodeInstructionConstraintException1 = new org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException("<clinit>");

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test415"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.Instruction[] instruction_array4 = instructionList3.getInstructions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction_array4);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test416"); }

    short s0 = org.apache.bcel.Const.GETFIELD2_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)208);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test417"); }

    short s0 = org.apache.bcel.Constants.GETSTATIC_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)210);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test418"); }

    org.apache.bcel.generic.ASTORE aSTORE1 = new org.apache.bcel.generic.ASTORE((int)(short)191);
    org.apache.bcel.generic.Visitor visitor2 = null;
    // The following exception was thrown during execution in test generation
    try {
    aSTORE1.accept(visitor2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test419"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ILOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test420"); }

    int i1 = org.apache.bcel.Const.getProduceStack(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test421"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConstants.ISTORE_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test422"); }

    short s0 = org.apache.bcel.Const.INVOKEVIRTUAL_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)214);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test423"); }

    short s0 = org.apache.bcel.Constants.INVOKESPECIAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)183);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test424"); }

    org.apache.bcel.util.BCELComparator bCELComparator0 = org.apache.bcel.generic.MethodGen.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bCELComparator0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test425"); }

    short s0 = org.apache.bcel.Const.INT2SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)147);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test426"); }

    short s0 = org.apache.bcel.Constants.ILOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)28);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test427"); }

    boolean b1 = org.apache.bcel.generic.Instruction.isValidByte((int)(byte)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test428"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.JavaClass javaClass4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitJavaClass(javaClass4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test429"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.D2F;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test430"); }

    org.apache.bcel.generic.INVOKESPECIAL iNVOKESPECIAL1 = new org.apache.bcel.generic.INVOKESPECIAL(0);
    int i2 = iNVOKESPECIAL1.getIndex();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = iNVOKESPECIAL1.produceStack(constantPoolGen3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test431"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array6 = null;
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool11 = new org.apache.bcel.classfile.ConstantPool(constant_array10);
    org.apache.bcel.classfile.SourceFile sourceFile12 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool11);
    org.apache.bcel.classfile.StackMap stackMap13 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array6, constantPool11);
    stringRepresentation3.visitStackMap(stackMap13);
    org.apache.bcel.classfile.JavaClass javaClass15 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitJavaClass(javaClass15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test432"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber(lineNumber2);
    lineNumber2.setLineNumber(1);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test433"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType2 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType0, (int)(short)193);
    org.apache.bcel.generic.ObjectType objectType3 = org.apache.bcel.generic.Type.STRING;
    boolean b5 = objectType3.equals((java.lang.Object)(short)148);
    boolean b6 = objectType0.isAssignmentCompatibleWith((org.apache.bcel.generic.Type)objectType3);
    org.apache.bcel.generic.Instruction instruction7 = org.apache.bcel.generic.InstructionConst.ICONST_2;
    boolean b8 = objectType0.equals((java.lang.Object)instruction7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test434"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = constantPool1.getConstantString((int)(short)171, (byte)67);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test435"); }

    org.apache.bcel.generic.INVOKEDYNAMIC iNVOKEDYNAMIC1 = new org.apache.bcel.generic.INVOKEDYNAMIC((int)(short)6);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i3 = iNVOKEDYNAMIC1.produceStack(constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test436"); }

    org.apache.bcel.generic.DUP2_X1 dUP2_X1_0 = new org.apache.bcel.generic.DUP2_X1();

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test437"); }

    short s0 = org.apache.bcel.Const.GOTO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)167);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test438"); }

    short s0 = org.apache.bcel.Constants.DLOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)40);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test439"); }

    org.apache.bcel.verifier.Verifier[] verifier_array0 = org.apache.bcel.verifier.VerifierFactory.getVerifiers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(verifier_array0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test440"); }

    short s0 = org.apache.bcel.Const.ALOAD_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)43);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test441"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.ISUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test442"); }

    short s0 = org.apache.bcel.Const.LLOAD_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)33);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test443"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.MONITOREXIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test444"); }

    short s0 = org.apache.bcel.Constants.F2D;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)141);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test445"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test446"); }

    short s0 = org.apache.bcel.Constants.IDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)108);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test447"); }

    short s0 = org.apache.bcel.Constants.IFGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)156);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test448"); }

    org.apache.bcel.generic.ILOAD iLOAD1 = new org.apache.bcel.generic.ILOAD((int)(byte)0);
    short s2 = iLOAD1.getCanonicalTag();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)21);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test449"); }

    short s0 = org.apache.bcel.Const.MAJOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)45);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test450"); }

    java.lang.Class<java.lang.IllegalMonitorStateException> cls0 = org.apache.bcel.ExceptionConst.ILLEGAL_MONITOR_STATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test451"); }

    short s0 = org.apache.bcel.Constants.INT2SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)147);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test452"); }

    short s0 = org.apache.bcel.Constants.LDC2_W_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)205);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test453"); }

    org.apache.bcel.generic.ObjectType objectType0 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType2 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType0, (int)(short)193);
    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction4 = org.apache.bcel.generic.InstructionFactory.createStore((org.apache.bcel.generic.Type)arrayType2, (int)(short)156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction4);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test454"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ICONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test455"); }

    org.apache.bcel.generic.LocalVariableInstruction localVariableInstruction0 = org.apache.bcel.generic.InstructionConst.ALOAD_2;
    java.lang.String str2 = localVariableInstruction0.toString(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aload_2[44](1)"+ "'", str2.equals("aload_2[44](1)"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test456"); }

    byte byte0 = org.apache.bcel.Const.CONSTANT_Double;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test457"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction0);
    java.lang.String str3 = instructionList1.toString(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "  -1: fmul\n"+ "'", str3.equals("  -1: fmul\n"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test458"); }

    short s0 = org.apache.bcel.Const.DMUL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)107);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test459"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ClassGen classGen1 = new org.apache.bcel.generic.ClassGen(javaClass0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test460"); }

    org.apache.bcel.verifier.exc.LoadingException loadingException0 = new org.apache.bcel.verifier.exc.LoadingException();

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test461"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction0);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction2 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction2);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver4 = null;
    instructionList3.removeObserver(instructionListObserver4);
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList1.insert(instructionList3);
    org.apache.bcel.generic.InstructionList instructionList7 = instructionList3.copy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList7);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test462"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConstants.I2C;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test463"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_NameAndType;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)12);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test464"); }

    org.apache.bcel.generic.AASTORE aASTORE0 = new org.apache.bcel.generic.AASTORE();

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test465"); }

    org.apache.bcel.generic.InstructionConstants.Clinit clinit0 = org.apache.bcel.generic.InstructionConstants.bla;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clinit0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test466"); }

    int i0 = org.apache.bcel.Const.FULL_FRAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 255);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test467"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.FCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test468"); }

    short s0 = org.apache.bcel.Const.ANEWARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)189);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test469"); }

    short s0 = org.apache.bcel.Constants.DCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)151);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test470"); }

    short s0 = org.apache.bcel.Const.MINOR_1_4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test471"); }

    short s0 = org.apache.bcel.Constants.SALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)53);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test472"); }

    short s0 = org.apache.bcel.Constants.FSTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)67);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test473"); }

    org.apache.bcel.generic.IRETURN iRETURN0 = new org.apache.bcel.generic.IRETURN();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    iRETURN0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test474"); }

    int i0 = org.apache.bcel.Const.MAX_CODE_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 65536);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test475"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber(lineNumber2);
    lineNumber2.setLineNumber(101);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test476"); }

    short s0 = org.apache.bcel.Const.JSR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)168);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test477"); }

    short s0 = org.apache.bcel.Constants.IF_ACMPNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)166);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test478"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ICONST_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test479"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.LineNumber lineNumber8 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation9 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber8);
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array12 = null;
    org.apache.bcel.classfile.Constant[] constant_array16 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool17 = new org.apache.bcel.classfile.ConstantPool(constant_array16);
    org.apache.bcel.classfile.SourceFile sourceFile18 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool17);
    org.apache.bcel.classfile.StackMap stackMap19 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array12, constantPool17);
    stringRepresentation9.visitStackMap(stackMap19);
    // The following exception was thrown during execution in test generation
    try {
    descendingVisitor5.visitStackMap(stackMap19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array16);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test480"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.LocalVariable localVariable8 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array9 = new org.apache.bcel.classfile.LocalVariable[] { localVariable8 };
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool11 = new org.apache.bcel.classfile.ConstantPool(constant_array10);
    org.apache.bcel.classfile.ConstantPool constantPool12 = constantPool11.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable13 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array9, constantPool11);
    stringRepresentation4.visitLocalVariableTable(localVariableTable13);
    org.apache.bcel.classfile.ConstantClass constantClass15 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitConstantClass(constantClass15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool12);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test481"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = descendingVisitor5.current();
      org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test482"); }

    org.apache.bcel.classfile.AnnotationElementValue annotationElementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationElementValueGen annotationElementValueGen3 = new org.apache.bcel.generic.AnnotationElementValueGen(annotationElementValue0, constantPoolGen1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test483"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen3 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)144, constantPoolGen1, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test484"); }

    short s0 = org.apache.bcel.Const.PUTSTATIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)179);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test485"); }

    int[] i_array2 = org.apache.bcel.Constants.CONSUME_STACK;
    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ExceptionTable exceptionTable6 = new org.apache.bcel.classfile.ExceptionTable((int)(byte)15, (int)(short)153, i_array2, constantPool5);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.Attribute attribute9 = exceptionTable6.copy(constantPool8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String[] str_array10 = exceptionTable6.getExceptionNames();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute9);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test486"); }

    short s0 = org.apache.bcel.Const.FLOAD_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)37);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test487"); }

    org.apache.bcel.generic.MethodGen methodGen0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.structurals.ControlFlowGraph controlFlowGraph2 = new org.apache.bcel.verifier.structurals.ControlFlowGraph(methodGen0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test488"); }

    org.apache.bcel.generic.ClassGen classGen0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionFactory instructionFactory1 = new org.apache.bcel.generic.InstructionFactory(classGen0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test489"); }

    short s0 = org.apache.bcel.Const.ALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)25);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test490"); }

    short s0 = org.apache.bcel.Const.DALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)49);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test491"); }

    org.apache.bcel.generic.LREM lREM0 = new org.apache.bcel.generic.LREM();

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test492"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_EXCEPTIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)3);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test493"); }

    byte byte0 = org.apache.bcel.Const.T_CHAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)5);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test494"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "hi!" };
    org.apache.bcel.util.ClassLoader classLoader3 = new org.apache.bcel.util.ClassLoader(str_array2);
    classLoader3.clearAssertionStatus();
    org.apache.bcel.util.ClassLoader classLoader5 = new org.apache.bcel.util.ClassLoader((java.lang.ClassLoader)classLoader3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test495"); }

    org.apache.bcel.generic.IUSHR iUSHR0 = new org.apache.bcel.generic.IUSHR();

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test496"); }

    java.lang.String str0 = org.apache.bcel.Const.CONSTRUCTOR_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<init>"+ "'", str0.equals("<init>"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test497"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.FREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test498"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.Signature signature10 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool9);
    stringRepresentation3.visitSignature(signature10);
    org.apache.bcel.classfile.ConstantPool constantPool12 = signature10.getConstantPool();
    signature10.setSignatureIndex((int)(short)98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool12);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test499"); }

    org.apache.bcel.verifier.exc.AssertionViolatedException assertionViolatedException0 = new org.apache.bcel.verifier.exc.AssertionViolatedException();
    java.lang.String str1 = assertionViolatedException0.toString();
    java.lang.String str2 = assertionViolatedException0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.bcel.verifier.exc.AssertionViolatedException"+ "'", str1.equals("org.apache.bcel.verifier.exc.AssertionViolatedException"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.bcel.verifier.exc.AssertionViolatedException"+ "'", str2.equals("org.apache.bcel.verifier.exc.AssertionViolatedException"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test500"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test501() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test501"); }

    byte byte0 = org.apache.bcel.Constants.T_ARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)13);

  }

  @Test
  public void test502() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test502"); }

    short s0 = org.apache.bcel.Constants.FREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)114);

  }

  @Test
  public void test503() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test503"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.D2I;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    int i2 = conversionInstruction0.consumeStack(constantPoolGen1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test504() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test504"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test505() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test505"); }

    short s0 = org.apache.bcel.Constants.ACC_VOLATILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)64);

  }

  @Test
  public void test506() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test506"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.TYPE_NAMES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test507() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test507"); }

    org.apache.bcel.generic.DRETURN dRETURN0 = new org.apache.bcel.generic.DRETURN();

  }

  @Test
  public void test508() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test508"); }

    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  @Test
  public void test509() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test509"); }

    java.lang.Class<java.lang.UnsatisfiedLinkError> cls0 = org.apache.bcel.ExceptionConst.UNSATISFIED_LINK_ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls0);

  }

  @Test
  public void test510() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test510"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.DDIV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test511() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test511"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.Type[] type_array1 = org.apache.bcel.generic.Type.getArgumentTypes("java.lang.Object");
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }

  }

  @Test
  public void test512() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test512"); }

    org.apache.bcel.generic.I2L i2L0 = new org.apache.bcel.generic.I2L();

  }

  @Test
  public void test513() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test513"); }

    byte byte0 = org.apache.bcel.Const.T_ADDRESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)16);

  }

  @Test
  public void test514() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test514"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen3 = new org.apache.bcel.generic.SimpleElementValueGen((int)(byte)-1, constantPoolGen1, (int)(short)46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test515() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test515"); }

    short s0 = org.apache.bcel.Const.ISTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)54);

  }

  @Test
  public void test516() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test516"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_Long;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)4);

  }

  @Test
  public void test517() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test517"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.IASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test518() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test518"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array6 = null;
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool11 = new org.apache.bcel.classfile.ConstantPool(constant_array10);
    org.apache.bcel.classfile.SourceFile sourceFile12 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool11);
    org.apache.bcel.classfile.StackMap stackMap13 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array6, constantPool11);
    stringRepresentation3.visitStackMap(stackMap13);
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array15 = stackMap13.getStackMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stackMapEntry_array15);

  }

  @Test
  public void test519() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test519"); }

    java.lang.String[] str_array4 = org.apache.bcel.Constants.ACCESS_NAMES;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ClassGen classGen6 = new org.apache.bcel.generic.ClassGen("  -1: fmul\n", "  -1: fmul\n", "<init>", (int)(short)1, str_array4, constantPoolGen5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test520() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test520"); }

    org.apache.bcel.generic.ILOAD iLOAD1 = new org.apache.bcel.generic.ILOAD((int)(short)204);

  }

  @Test
  public void test521() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test521"); }

    java.lang.String str1 = org.apache.bcel.Const.getConstantName(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CONSTANT_String"+ "'", str1.equals("CONSTANT_String"));

  }

  @Test
  public void test522() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test522"); }

    short s0 = org.apache.bcel.Constants.ACC_TRANSIENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)128);

  }

  @Test
  public void test523() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test523"); }

    short s0 = org.apache.bcel.Constants.FSTORE_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)70);

  }

  @Test
  public void test524() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test524"); }

    org.apache.bcel.generic.GETSTATIC gETSTATIC1 = new org.apache.bcel.generic.GETSTATIC((int)(short)3);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.Type type3 = gETSTATIC1.getType(constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test525() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test525"); }

    short s0 = org.apache.bcel.Const.IF_ICMPGT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)163);

  }

  @Test
  public void test526() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test526"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BYTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 66);

  }

  @Test
  public void test527() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test527"); }

    short s0 = org.apache.bcel.Const.ILOAD_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)26);

  }

  @Test
  public void test528() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test528"); }

    org.apache.bcel.generic.StackInstruction stackInstruction1 = org.apache.bcel.generic.InstructionFactory.createDup_2(73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction1);

  }

  @Test
  public void test529() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test529"); }

    byte[] byte_array2 = null;
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array5 = null;
    org.apache.bcel.classfile.Constant[] constant_array9 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool10 = new org.apache.bcel.classfile.ConstantPool(constant_array9);
    org.apache.bcel.classfile.SourceFile sourceFile11 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool10);
    org.apache.bcel.classfile.StackMap stackMap12 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array5, constantPool10);
    org.apache.bcel.classfile.Deprecated deprecated13 = new org.apache.bcel.classfile.Deprecated((int)(short)1, (int)(short)111, byte_array2, constantPool10);
    org.apache.bcel.classfile.Deprecated deprecated14 = new org.apache.bcel.classfile.Deprecated(deprecated13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array9);

  }

  @Test
  public void test530() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test530"); }

    short s0 = org.apache.bcel.Const.DSTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)71);

  }

  @Test
  public void test531() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test531"); }

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
  public void test532() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test532"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.LCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test533() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test533"); }

    short s0 = org.apache.bcel.Constants.INVOKEINTERFACE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)185);

  }

  @Test
  public void test534() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test534"); }

    org.apache.bcel.generic.DUP_X2 dUP_X2_0 = new org.apache.bcel.generic.DUP_X2();

  }

  @Test
  public void test535() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test535"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen3 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)157, constantPoolGen1, (int)(short)141);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test536() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test536"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConstants.CASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test537() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test537"); }

    short s0 = org.apache.bcel.Const.LCONST_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)9);

  }

  @Test
  public void test538() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test538"); }

    org.apache.bcel.classfile.InnerClass innerClass4 = new org.apache.bcel.classfile.InnerClass((int)(short)-2, (int)(short)98, (int)(short)117, 1);
    org.apache.bcel.classfile.InnerClass innerClass5 = new org.apache.bcel.classfile.InnerClass(innerClass4);

  }

  @Test
  public void test539() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test539"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.ACCESS_NAMES;
    org.apache.bcel.util.ClassLoader classLoader1 = new org.apache.bcel.util.ClassLoader(str_array0);
    java.util.Enumeration<java.net.URL> enumeration_uRL3 = classLoader1.getResources("Const.ACC_STATIC | Const.ACC_VOLATILE | Const.ACC_TRANSIENT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_uRL3);

  }

  @Test
  public void test540() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test540"); }

    short s0 = org.apache.bcel.Const.CHECKCAST_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)224);

  }

  @Test
  public void test541() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test541"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.ParameterAnnotationEntry parameterAnnotationEntry4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitParameterAnnotationEntry(parameterAnnotationEntry4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test542() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test542"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.FSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test543() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test543"); }

    org.apache.bcel.verifier.VerifierFactoryListModel verifierFactoryListModel0 = new org.apache.bcel.verifier.VerifierFactoryListModel();

  }

  @Test
  public void test544() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test544"); }

    org.apache.bcel.generic.FCMPL fCMPL0 = new org.apache.bcel.generic.FCMPL();
    org.apache.bcel.generic.Visitor visitor1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fCMPL0.accept(visitor1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test545() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test545"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_NewObject;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)8);

  }

  @Test
  public void test546() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test546"); }

    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue7 = new org.apache.bcel.classfile.ClassElementValue((int)(short)177, (int)(short)181, constantPool5);
    org.apache.bcel.classfile.Constant[] constant_array11 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool12 = new org.apache.bcel.classfile.ConstantPool(constant_array11);
    org.apache.bcel.classfile.ConstantPool constantPool13 = constantPool12.copy();
    org.apache.bcel.classfile.Signature signature14 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool13);
    org.apache.bcel.classfile.AnnotationDefault annotationDefault15 = new org.apache.bcel.classfile.AnnotationDefault((int)(short)140, (int)(short)143, (org.apache.bcel.classfile.ElementValue)classElementValue7, constantPool13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool13);

  }

  @Test
  public void test547() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test547"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.LSHR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test548() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test548"); }

    byte byte0 = org.apache.bcel.Const.ATTR_STACK_MAP_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)19);

  }

  @Test
  public void test549() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test549"); }

    org.apache.bcel.classfile.PMGClass pMGClass0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.PMGClass pMGClass1 = new org.apache.bcel.classfile.PMGClass(pMGClass0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test550() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test550"); }

    int i0 = java.awt.Frame.TEXT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test551() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test551"); }

    org.apache.bcel.generic.BasicType basicType2 = org.apache.bcel.generic.Type.LONG;
    org.apache.bcel.generic.Type type3 = basicType2.normalizeForStackOrLocal();
    byte[] byte_array6 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList7.findHandle(0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction10 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction10);
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle16 = instructionList15.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    org.apache.bcel.generic.LocalVariableGen localVariableGen18 = new org.apache.bcel.generic.LocalVariableGen((int)(byte)6, "hi!", type3, instructionHandle9, instructionHandle17);
    java.lang.String str19 = localVariableGen18.getName();
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction20 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList21 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction20);
    byte[] byte_array24 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList25 = new org.apache.bcel.generic.InstructionList(byte_array24);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle26 = instructionList25.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle27 = instructionList21.append(instructionList25);
    org.apache.bcel.generic.ReturnaddressType returnaddressType28 = new org.apache.bcel.generic.ReturnaddressType(instructionHandle27);
    boolean b29 = localVariableGen18.containsTarget(instructionHandle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test552() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test552"); }

    org.apache.bcel.classfile.InnerClass innerClass4 = new org.apache.bcel.classfile.InnerClass((int)(short)65, (int)' ', (int)(short)1, (int)(short)171);
    org.apache.bcel.classfile.Constant[] constant_array6 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool7 = new org.apache.bcel.classfile.ConstantPool(constant_array6);
    org.apache.bcel.classfile.AnnotationEntry annotationEntry9 = new org.apache.bcel.classfile.AnnotationEntry((int)(byte)67, constantPool7, false);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = innerClass4.toString(constantPool7);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array6);

  }

  @Test
  public void test553() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test553"); }

    short s0 = org.apache.bcel.Constants.INVOKEDYNAMIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)186);

  }

  @Test
  public void test554() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test554"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.classfile.CodeException codeException12 = null;
    org.apache.bcel.classfile.CodeException[] codeException_array13 = new org.apache.bcel.classfile.CodeException[] { codeException12 };
    org.apache.bcel.classfile.Constant[] constant_array17 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool18 = new org.apache.bcel.classfile.ConstantPool(constant_array17);
    org.apache.bcel.classfile.ConstantPool constantPool19 = constantPool18.copy();
    org.apache.bcel.classfile.Signature signature20 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool19);
    signature20.setSignatureIndex((int)(short)0);
    org.apache.bcel.classfile.LocalVariable localVariable25 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array26 = new org.apache.bcel.classfile.LocalVariable[] { localVariable25 };
    org.apache.bcel.classfile.Constant[] constant_array27 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool28 = new org.apache.bcel.classfile.ConstantPool(constant_array27);
    org.apache.bcel.classfile.ConstantPool constantPool29 = constantPool28.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable30 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array26, constantPool28);
    org.apache.bcel.classfile.LineNumber lineNumber33 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation34 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber33);
    org.apache.bcel.classfile.Constant[] constant_array38 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool39 = new org.apache.bcel.classfile.ConstantPool(constant_array38);
    org.apache.bcel.classfile.ConstantPool constantPool40 = constantPool39.copy();
    org.apache.bcel.classfile.Signature signature41 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool40);
    stringRepresentation34.visitSignature(signature41);
    org.apache.bcel.classfile.Attribute[] attribute_array43 = new org.apache.bcel.classfile.Attribute[] { signature20, localVariableTable30, signature41 };
    org.apache.bcel.classfile.Constant[] constant_array44 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool45 = new org.apache.bcel.classfile.ConstantPool(constant_array44);
    org.apache.bcel.classfile.Code code46 = new org.apache.bcel.classfile.Code((int)(short)131, (int)(byte)15, (int)(short)148, 64, byte_array10, codeException_array13, attribute_array43, constantPool45);
    stringRepresentation3.visitCode(code46);
    org.apache.bcel.classfile.Attribute[] attribute_array48 = code46.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeException_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute_array48);

  }

  @Test
  public void test555() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test555"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction0);
    byte[] byte_array4 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle6 = instructionList5.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList1.append(instructionList5);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction8 = org.apache.bcel.generic.InstructionConst.FSUB;
    // The following exception was thrown during execution in test generation
    try {
    instructionList5.delete((org.apache.bcel.generic.Instruction)arithmeticInstruction8);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction8);

  }

  @Test
  public void test556() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test556"); }

    short s0 = org.apache.bcel.Const.D2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)142);

  }

  @Test
  public void test557() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test557"); }

    org.apache.bcel.generic.FNEG fNEG0 = new org.apache.bcel.generic.FNEG();

  }

  @Test
  public void test558() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test558"); }

    int i0 = java.awt.image.ImageObserver.ALLBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 32);

  }

  @Test
  public void test559() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test559"); }

    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constant_array1);
    org.apache.bcel.classfile.AnnotationEntry annotationEntry4 = new org.apache.bcel.classfile.AnnotationEntry((int)(byte)67, constantPool2, false);
    java.io.DataOutputStream dataOutputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    annotationEntry4.dump(dataOutputStream5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);

  }

  @Test
  public void test560() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test560"); }

    byte[] byte_array2 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList3.findHandle(0);
    java.lang.Object obj7 = instructionHandle5.getAttribute((java.lang.Object)(short)171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test561() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test561"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = null;
    org.apache.bcel.generic.InstructionFactory instructionFactory1 = new org.apache.bcel.generic.InstructionFactory(constantPoolGen0);
    org.apache.bcel.generic.ObjectType objectType2 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType4 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType2, (int)(short)193);
    org.apache.bcel.generic.Type type5 = arrayType4.getBasicType();
    org.apache.bcel.generic.ObjectType objectType6 = org.apache.bcel.generic.Type.STRING;
    boolean b7 = objectType6.referencesClass();
    boolean b8 = objectType6.referencesClass();
    boolean b9 = arrayType4.isCastableTo((org.apache.bcel.generic.Type)objectType6);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.INSTANCEOF iNSTANCEOF10 = instructionFactory1.createInstanceOf((org.apache.bcel.generic.ReferenceType)objectType6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test562() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test562"); }

    short s0 = org.apache.bcel.Constants.BREAKPOINT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)202);

  }

  @Test
  public void test563() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test563"); }

    byte byte0 = org.apache.bcel.Const.ITEM_Double;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)3);

  }

  @Test
  public void test564() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test564"); }

    org.apache.bcel.classfile.Constant[] constant_array2 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool3 = new org.apache.bcel.classfile.ConstantPool(constant_array2);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool3.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue5 = new org.apache.bcel.classfile.ClassElementValue((int)(short)177, (int)(short)181, constantPool3);
    org.apache.bcel.classfile.Constant[] constant_array6 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool7 = new org.apache.bcel.classfile.ConstantPool(constant_array6);
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array6);
    constantPool3.setConstantPool(constant_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array6);

  }

  @Test
  public void test565() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test565"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.ConstantMethodHandle constantMethodHandle6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitConstantMethodHandle(constantMethodHandle6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test566() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test566"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.DADD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test567() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test567"); }

    java.lang.String[] str_array0 = org.apache.bcel.Constants.ACCESS_NAMES;
    org.apache.bcel.util.ClassLoader classLoader1 = new org.apache.bcel.util.ClassLoader(str_array0);
    java.util.Enumeration<java.net.URL> enumeration_uRL3 = classLoader1.getResources("abstract");
    classLoader1.clearAssertionStatus();
    org.apache.bcel.util.ClassLoaderRepository classLoaderRepository5 = new org.apache.bcel.util.ClassLoaderRepository((java.lang.ClassLoader)classLoader1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_uRL3);

  }

  @Test
  public void test568() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test568"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.ConstantDouble constantDouble6 = null;
    // The following exception was thrown during execution in test generation
    try {
    descendingVisitor5.visitConstantDouble(constantDouble6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test569() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test569"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.Constant constant2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = constantPool1.constantToString(constant2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);

  }

  @Test
  public void test570() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test570"); }

    short s0 = org.apache.bcel.Const.MINOR_1_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)3);

  }

  @Test
  public void test571() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test571"); }

    short s0 = org.apache.bcel.Constants.MAJOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)45);

  }

  @Test
  public void test572() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test572"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction0);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction2 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction2);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver4 = null;
    instructionList3.removeObserver(instructionListObserver4);
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList1.insert(instructionList3);
    org.apache.bcel.generic.Visitor visitor7 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionHandle6.accept(visitor7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle6);

  }

  @Test
  public void test573() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test573"); }

    short s0 = org.apache.bcel.Constants.LDC2_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)20);

  }

  @Test
  public void test574() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test574"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test575() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test575"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array6 = null;
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool11 = new org.apache.bcel.classfile.ConstantPool(constant_array10);
    org.apache.bcel.classfile.SourceFile sourceFile12 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool11);
    org.apache.bcel.classfile.StackMap stackMap13 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array6, constantPool11);
    stringRepresentation3.visitStackMap(stackMap13);
    org.apache.bcel.classfile.InnerClass innerClass19 = new org.apache.bcel.classfile.InnerClass((int)(short)65, (int)' ', (int)(short)1, (int)(short)171);
    innerClass19.setInnerAccessFlags((-2));
    stringRepresentation3.visitInnerClass(innerClass19);
    int[] i_array25 = org.apache.bcel.Constants.CONSUME_STACK;
    org.apache.bcel.classfile.Constant[] constant_array26 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool27 = new org.apache.bcel.classfile.ConstantPool(constant_array26);
    org.apache.bcel.classfile.ConstantPool constantPool28 = new org.apache.bcel.classfile.ConstantPool(constant_array26);
    org.apache.bcel.classfile.ExceptionTable exceptionTable29 = new org.apache.bcel.classfile.ExceptionTable((int)(byte)15, (int)(short)153, i_array25, constantPool28);
    stringRepresentation3.visitExceptionTable(exceptionTable29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array26);

  }

  @Test
  public void test576() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test576"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.IXOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test577() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test577"); }

    short s0 = org.apache.bcel.Constants.I2C;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)146);

  }

  @Test
  public void test578() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test578"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.bcel.Const.getConstantName(63);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test579() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test579"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.IREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test580() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test580"); }

    org.apache.bcel.classfile.Constant[] constant_array5 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constant_array5);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPool6.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue8 = new org.apache.bcel.classfile.ClassElementValue((int)(short)177, (int)(short)181, constantPool6);
    org.apache.bcel.classfile.Constant[] constant_array12 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool13 = new org.apache.bcel.classfile.ConstantPool(constant_array12);
    org.apache.bcel.classfile.ConstantPool constantPool14 = constantPool13.copy();
    org.apache.bcel.classfile.Signature signature15 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool14);
    org.apache.bcel.classfile.AnnotationDefault annotationDefault16 = new org.apache.bcel.classfile.AnnotationDefault((int)(short)140, (int)(short)143, (org.apache.bcel.classfile.ElementValue)classElementValue8, constantPool14);
    org.apache.bcel.classfile.Constant[] constant_array19 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool20 = new org.apache.bcel.classfile.ConstantPool(constant_array19);
    org.apache.bcel.classfile.ConstantPool constantPool21 = constantPool20.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue22 = new org.apache.bcel.classfile.ClassElementValue((int)(short)177, (int)(short)181, constantPool20);
    org.apache.bcel.classfile.Constant[] constant_array25 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool26 = new org.apache.bcel.classfile.ConstantPool(constant_array25);
    org.apache.bcel.classfile.ConstantPool constantPool27 = constantPool26.copy();
    org.apache.bcel.classfile.ClassElementValue classElementValue28 = new org.apache.bcel.classfile.ClassElementValue((int)(short)177, (int)(short)181, constantPool26);
    org.apache.bcel.classfile.ElementValue[] elementValue_array29 = new org.apache.bcel.classfile.ElementValue[] { classElementValue8, classElementValue22, classElementValue28 };
    org.apache.bcel.classfile.Constant[] constant_array31 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool32 = new org.apache.bcel.classfile.ConstantPool(constant_array31);
    org.apache.bcel.classfile.AnnotationEntry annotationEntry34 = new org.apache.bcel.classfile.AnnotationEntry((int)(byte)67, constantPool32, false);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.ArrayElementValue arrayElementValue35 = new org.apache.bcel.classfile.ArrayElementValue((int)(short)186, elementValue_array29, constantPool32);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(elementValue_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array31);

  }

  @Test
  public void test581() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test581"); }

    short s0 = org.apache.bcel.Constants.WIDE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)196);

  }

  @Test
  public void test582() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test582"); }

    org.apache.bcel.generic.MethodGen methodGen0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.structurals.ControlFlowGraph controlFlowGraph2 = new org.apache.bcel.verifier.structurals.ControlFlowGraph(methodGen0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test583() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test583"); }

    byte byte0 = org.apache.bcel.Const.ATTR_RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)15);

  }

  @Test
  public void test584() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test584"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.BALOAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test585() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test585"); }

    short s0 = org.apache.bcel.Constants.GETFIELD_QUICK_W;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)227);

  }

  @Test
  public void test586() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test586"); }

    org.apache.bcel.generic.ARRAYLENGTH aRRAYLENGTH0 = new org.apache.bcel.generic.ARRAYLENGTH();
    java.lang.Class<?>[] cls_array1 = aRRAYLENGTH0.getExceptions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls_array1);

  }

  @Test
  public void test587() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test587"); }

    short s0 = org.apache.bcel.Constants.L2I;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)136);

  }

  @Test
  public void test588() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test588"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction0);
    org.apache.bcel.generic.Instruction[] instruction_array2 = instructionList1.getInstructions();
    org.apache.bcel.generic.InstructionHandle instructionHandle3 = null;
    org.apache.bcel.generic.BasicType basicType6 = org.apache.bcel.generic.Type.LONG;
    org.apache.bcel.generic.Type type7 = basicType6.normalizeForStackOrLocal();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList11.findHandle(0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction14 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction14);
    byte[] byte_array18 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList19 = new org.apache.bcel.generic.InstructionList(byte_array18);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle20 = instructionList19.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList15.append(instructionList19);
    org.apache.bcel.generic.LocalVariableGen localVariableGen22 = new org.apache.bcel.generic.LocalVariableGen((int)(byte)6, "hi!", type7, instructionHandle13, instructionHandle21);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction23 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction23);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction25 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList26 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction25);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver27 = null;
    instructionList26.removeObserver(instructionListObserver27);
    org.apache.bcel.generic.InstructionHandle instructionHandle29 = instructionList24.insert(instructionList26);
    // The following exception was thrown during execution in test generation
    try {
    instructionList1.move(instructionHandle3, instructionHandle13, instructionHandle29);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle29);

  }

  @Test
  public void test589() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test589"); }

    org.apache.bcel.classfile.MethodParameter methodParameter0 = new org.apache.bcel.classfile.MethodParameter();
    boolean b1 = methodParameter0.isFinal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test590() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test590"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.classfile.CodeException codeException12 = null;
    org.apache.bcel.classfile.CodeException[] codeException_array13 = new org.apache.bcel.classfile.CodeException[] { codeException12 };
    org.apache.bcel.classfile.Constant[] constant_array17 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool18 = new org.apache.bcel.classfile.ConstantPool(constant_array17);
    org.apache.bcel.classfile.ConstantPool constantPool19 = constantPool18.copy();
    org.apache.bcel.classfile.Signature signature20 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool19);
    signature20.setSignatureIndex((int)(short)0);
    org.apache.bcel.classfile.LocalVariable localVariable25 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array26 = new org.apache.bcel.classfile.LocalVariable[] { localVariable25 };
    org.apache.bcel.classfile.Constant[] constant_array27 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool28 = new org.apache.bcel.classfile.ConstantPool(constant_array27);
    org.apache.bcel.classfile.ConstantPool constantPool29 = constantPool28.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable30 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array26, constantPool28);
    org.apache.bcel.classfile.LineNumber lineNumber33 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation34 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber33);
    org.apache.bcel.classfile.Constant[] constant_array38 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool39 = new org.apache.bcel.classfile.ConstantPool(constant_array38);
    org.apache.bcel.classfile.ConstantPool constantPool40 = constantPool39.copy();
    org.apache.bcel.classfile.Signature signature41 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool40);
    stringRepresentation34.visitSignature(signature41);
    org.apache.bcel.classfile.Attribute[] attribute_array43 = new org.apache.bcel.classfile.Attribute[] { signature20, localVariableTable30, signature41 };
    org.apache.bcel.classfile.Constant[] constant_array44 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool45 = new org.apache.bcel.classfile.ConstantPool(constant_array44);
    org.apache.bcel.classfile.Code code46 = new org.apache.bcel.classfile.Code((int)(short)131, (int)(byte)15, (int)(short)148, 64, byte_array10, codeException_array13, attribute_array43, constantPool45);
    stringRepresentation3.visitCode(code46);
    org.apache.bcel.classfile.Constant[] constant_array48 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool49 = new org.apache.bcel.classfile.ConstantPool(constant_array48);
    org.apache.bcel.classfile.ConstantPool constantPool50 = new org.apache.bcel.classfile.ConstantPool(constant_array48);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Attribute attribute51 = code46.copy(constantPool50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeException_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array48);

  }

  @Test
  public void test591() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test591"); }

    org.apache.bcel.verifier.Verifier verifier0 = null;
    org.apache.bcel.verifier.structurals.Pass3bVerifier pass3bVerifier2 = new org.apache.bcel.verifier.structurals.Pass3bVerifier(verifier0, 0);
    pass3bVerifier2.addMessage("  -1: fmul\n");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.verifier.VerificationResult verificationResult5 = pass3bVerifier2.do_verify();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test592() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test592"); }

    short s0 = org.apache.bcel.Const.IAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)126);

  }

  @Test
  public void test593() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test593"); }

    org.apache.bcel.generic.MULTIANEWARRAY mULTIANEWARRAY2 = new org.apache.bcel.generic.MULTIANEWARRAY((int)(short)195, (short)88);

  }

  @Test
  public void test594() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test594"); }

    org.apache.bcel.generic.StackInstruction stackInstruction0 = org.apache.bcel.generic.InstructionConst.DUP_X2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stackInstruction0);

  }

  @Test
  public void test595() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test595"); }

    short s0 = org.apache.bcel.Constants.IF_ICMPNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)160);

  }

  @Test
  public void test596() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test596"); }

    short s0 = org.apache.bcel.Const.INSTANCEOF_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)225);

  }

  @Test
  public void test597() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test597"); }

    short s0 = org.apache.bcel.Const.IFLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)158);

  }

  @Test
  public void test598() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test598"); }

    org.apache.bcel.verifier.VerificationResult verificationResult0 = org.apache.bcel.verifier.VerificationResult.VR_OK;
    java.lang.Object obj1 = null;
    boolean b2 = verificationResult0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(verificationResult0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test599() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test599"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test600() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test600"); }

    byte byte0 = org.apache.bcel.Constants.CONSTANT_Class;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)7);

  }

  @Test
  public void test601() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test601"); }

    short s0 = org.apache.bcel.Constants.CHECKCAST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)192);

  }

  @Test
  public void test602() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test602"); }

    int i0 = java.awt.image.ImageObserver.FRAMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test603() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test603"); }

    java.io.DataInput dataInput0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Constant constant1 = org.apache.bcel.classfile.Constant.readConstant(dataInput0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test604() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test604"); }

    short s0 = org.apache.bcel.Constants.CASTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)85);

  }

  @Test
  public void test605() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test605"); }

    org.apache.bcel.generic.ConversionInstruction conversionInstruction0 = org.apache.bcel.generic.InstructionConst.I2B;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(conversionInstruction0);

  }

  @Test
  public void test606() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test606"); }

    org.apache.bcel.generic.Type type0 = org.apache.bcel.generic.Type.UNKNOWN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type0);

  }

  @Test
  public void test607() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test607"); }

    org.apache.bcel.generic.RET rET1 = new org.apache.bcel.generic.RET((int)(byte)100);
    java.lang.String str3 = rET1.toString(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ret[169](2) 100"+ "'", str3.equals("ret[169](2) 100"));

  }

  @Test
  public void test608() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test608"); }

    java.lang.String str0 = org.apache.bcel.Constants.CONSTRUCTOR_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<init>"+ "'", str0.equals("<init>"));

  }

  @Test
  public void test609() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test609"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.ISUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test610() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test610"); }

    org.apache.bcel.generic.ARRAYLENGTH aRRAYLENGTH0 = new org.apache.bcel.generic.ARRAYLENGTH();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    int i2 = aRRAYLENGTH0.produceStack(constantPoolGen1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test611() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test611"); }

    byte byte0 = org.apache.bcel.Constants.T_FLOAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)6);

  }

  @Test
  public void test612() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test612"); }

    org.apache.bcel.generic.SIPUSH sIPUSH1 = new org.apache.bcel.generic.SIPUSH((short)193);
    org.apache.bcel.generic.Visitor visitor2 = null;
    // The following exception was thrown during execution in test generation
    try {
    sIPUSH1.accept(visitor2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test613() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test613"); }

    short s0 = org.apache.bcel.Const.FLOAD_2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)36);

  }

  @Test
  public void test614() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test614"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "hi!", "hi!" };
    org.apache.bcel.util.ClassLoader classLoader3 = new org.apache.bcel.util.ClassLoader(str_array2);
    classLoader3.clearAssertionStatus();
    classLoader3.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test615() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test615"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BOOLEAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 90);

  }

  @Test
  public void test616() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test616"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction0);
    org.apache.bcel.generic.DCMPG dCMPG2 = new org.apache.bcel.generic.DCMPG();
    org.apache.bcel.generic.InstructionList instructionList3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList1.append((org.apache.bcel.generic.Instruction)dCMPG2, instructionList3);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);

  }

  @Test
  public void test617() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test617"); }

    short s0 = org.apache.bcel.Constants.ACC_NATIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)256);

  }

  @Test
  public void test618() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test618"); }

    org.apache.bcel.generic.ReturnInstruction returnInstruction0 = org.apache.bcel.generic.InstructionConstants.LRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction0);

  }

  @Test
  public void test619() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test619"); }

    short s0 = org.apache.bcel.Const.ISTORE_0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)59);

  }

  @Test
  public void test620() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test620"); }

    org.apache.bcel.generic.ReturnInstruction returnInstruction0 = org.apache.bcel.generic.InstructionConst.LRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction0);

  }

  @Test
  public void test621() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test621"); }

    byte byte0 = org.apache.bcel.Constants.ITEM_Integer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)1);

  }

  @Test
  public void test622() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test622"); }

    org.apache.bcel.generic.ArrayInstruction arrayInstruction0 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction0);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction2 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction2);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver4 = null;
    instructionList3.removeObserver(instructionListObserver4);
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList1.insert(instructionList3);
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionHandle6.getPrev();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(instructionHandle7);

  }

  @Test
  public void test623() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test623"); }

    short s0 = org.apache.bcel.Constants.ACC_BRIDGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)64);

  }

  @Test
  public void test624() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test624"); }

    org.apache.bcel.generic.ReturnInstruction returnInstruction0 = org.apache.bcel.generic.InstructionConst.IRETURN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction0);

  }

  @Test
  public void test625() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test625"); }

    org.apache.bcel.generic.BasicType basicType2 = org.apache.bcel.generic.Type.LONG;
    org.apache.bcel.generic.Type type3 = basicType2.normalizeForStackOrLocal();
    byte[] byte_array6 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList7.findHandle(0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction10 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction10);
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle16 = instructionList15.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    org.apache.bcel.generic.LocalVariableGen localVariableGen18 = new org.apache.bcel.generic.LocalVariableGen((int)(byte)6, "hi!", type3, instructionHandle9, instructionHandle17);
    org.apache.bcel.generic.Type type19 = localVariableGen18.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(basicType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(type19);

  }

  @Test
  public void test626() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test626"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen3 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)12, constantPoolGen1, (short)159);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test627() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test627"); }

    short s0 = org.apache.bcel.Constants.LUSHR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)125);

  }

  @Test
  public void test628() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test628"); }

    byte[] byte_array6 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.classfile.CodeException codeException8 = null;
    org.apache.bcel.classfile.CodeException[] codeException_array9 = new org.apache.bcel.classfile.CodeException[] { codeException8 };
    org.apache.bcel.classfile.Constant[] constant_array13 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool14 = new org.apache.bcel.classfile.ConstantPool(constant_array13);
    org.apache.bcel.classfile.ConstantPool constantPool15 = constantPool14.copy();
    org.apache.bcel.classfile.Signature signature16 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool15);
    signature16.setSignatureIndex((int)(short)0);
    org.apache.bcel.classfile.LocalVariable localVariable21 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array22 = new org.apache.bcel.classfile.LocalVariable[] { localVariable21 };
    org.apache.bcel.classfile.Constant[] constant_array23 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool24 = new org.apache.bcel.classfile.ConstantPool(constant_array23);
    org.apache.bcel.classfile.ConstantPool constantPool25 = constantPool24.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable26 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array22, constantPool24);
    org.apache.bcel.classfile.LineNumber lineNumber29 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation30 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber29);
    org.apache.bcel.classfile.Constant[] constant_array34 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool35 = new org.apache.bcel.classfile.ConstantPool(constant_array34);
    org.apache.bcel.classfile.ConstantPool constantPool36 = constantPool35.copy();
    org.apache.bcel.classfile.Signature signature37 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool36);
    stringRepresentation30.visitSignature(signature37);
    org.apache.bcel.classfile.Attribute[] attribute_array39 = new org.apache.bcel.classfile.Attribute[] { signature16, localVariableTable26, signature37 };
    org.apache.bcel.classfile.Constant[] constant_array40 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool41 = new org.apache.bcel.classfile.ConstantPool(constant_array40);
    org.apache.bcel.classfile.Code code42 = new org.apache.bcel.classfile.Code((int)(short)131, (int)(byte)15, (int)(short)148, 64, byte_array6, codeException_array9, attribute_array39, constantPool41);
    org.apache.bcel.classfile.AnnotationEntry[] annotationEntry_array43 = org.apache.bcel.classfile.AnnotationEntry.createAnnotationEntries(attribute_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeException_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(annotationEntry_array43);

  }

  @Test
  public void test629() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test629"); }

    org.apache.bcel.generic.FMUL fMUL0 = new org.apache.bcel.generic.FMUL();

  }

  @Test
  public void test630() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test630"); }

    org.apache.bcel.generic.IINC iINC2 = new org.apache.bcel.generic.IINC((int)(short)175, (int)(short)90);
    int i3 = iINC2.getIncrement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 90);

  }

  @Test
  public void test631() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test631"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.Constant[] constant_array7 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constant_array7);
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool8.copy();
    org.apache.bcel.classfile.Signature signature10 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool9);
    stringRepresentation3.visitSignature(signature10);
    org.apache.bcel.classfile.JavaClass javaClass12 = null;
    org.apache.bcel.classfile.LineNumber lineNumber15 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation16 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber15);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor17 = new org.apache.bcel.classfile.DescendingVisitor(javaClass12, (org.apache.bcel.classfile.Visitor)stringRepresentation16);
    org.apache.bcel.classfile.LocalVariable localVariable20 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array21 = new org.apache.bcel.classfile.LocalVariable[] { localVariable20 };
    org.apache.bcel.classfile.Constant[] constant_array22 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool23 = new org.apache.bcel.classfile.ConstantPool(constant_array22);
    org.apache.bcel.classfile.ConstantPool constantPool24 = constantPool23.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable25 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array21, constantPool23);
    stringRepresentation16.visitLocalVariableTable(localVariableTable25);
    stringRepresentation3.visitLocalVariableTable(localVariableTable25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool24);

  }

  @Test
  public void test632() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test632"); }

    short s0 = org.apache.bcel.Constants.IF_ICMPGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)162);

  }

  @Test
  public void test633() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test633"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConstants.IAND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test634() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test634"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test635() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test635"); }

    short s0 = org.apache.bcel.Constants.LSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)101);

  }

  @Test
  public void test636() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test636"); }

    short s0 = org.apache.bcel.Constants.POP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)87);

  }

  @Test
  public void test637() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test637"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.FCMPL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test638() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test638"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.LREM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test639() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test639"); }

    int[] i_array2 = org.apache.bcel.Constants.CONSUME_STACK;
    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ExceptionTable exceptionTable6 = new org.apache.bcel.classfile.ExceptionTable((int)(byte)15, (int)(short)153, i_array2, constantPool5);
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList10 = new org.apache.bcel.generic.InstructionList(byte_array9);
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList10.findHandle(0);
    java.lang.Object obj14 = instructionHandle12.getAttribute((java.lang.Object)(short)171);
    byte[] byte_array17 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList18.findHandle(0);
    byte[] byte_array23 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList24.findHandle(0);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction27 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList28 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction27);
    byte[] byte_array31 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList32 = new org.apache.bcel.generic.InstructionList(byte_array31);
    org.apache.bcel.generic.InstructionHandle instructionHandle34 = instructionList32.findHandle(0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction35 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction35);
    byte[] byte_array39 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList40 = new org.apache.bcel.generic.InstructionList(byte_array39);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle41 = instructionList40.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle42 = instructionList36.append(instructionList40);
    instructionList28.delete(instructionHandle34, instructionHandle42);
    instructionList18.delete(instructionHandle26, instructionHandle34);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array45 = new org.apache.bcel.generic.InstructionHandle[] { instructionHandle12, instructionHandle26 };
    byte[] byte_array48 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList49 = new org.apache.bcel.generic.InstructionList(byte_array48);
    org.apache.bcel.generic.InstructionHandle instructionHandle51 = instructionList49.findHandle(0);
    byte[] byte_array54 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList55 = new org.apache.bcel.generic.InstructionList(byte_array54);
    org.apache.bcel.generic.InstructionHandle instructionHandle57 = instructionList55.findHandle(0);
    org.apache.bcel.generic.ArrayInstruction arrayInstruction58 = org.apache.bcel.generic.InstructionConst.LASTORE;
    org.apache.bcel.generic.InstructionList instructionList59 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arrayInstruction58);
    byte[] byte_array62 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList63 = new org.apache.bcel.generic.InstructionList(byte_array62);
    org.apache.bcel.generic.InstructionHandle instructionHandle65 = instructionList63.findHandle(0);
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction66 = org.apache.bcel.generic.InstructionConst.FMUL;
    org.apache.bcel.generic.InstructionList instructionList67 = new org.apache.bcel.generic.InstructionList((org.apache.bcel.generic.Instruction)arithmeticInstruction66);
    byte[] byte_array70 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList71 = new org.apache.bcel.generic.InstructionList(byte_array70);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle72 = instructionList71.spliterator();
    org.apache.bcel.generic.InstructionHandle instructionHandle73 = instructionList67.append(instructionList71);
    instructionList59.delete(instructionHandle65, instructionHandle73);
    instructionList49.delete(instructionHandle57, instructionHandle65);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.LOOKUPSWITCH lOOKUPSWITCH76 = new org.apache.bcel.generic.LOOKUPSWITCH(i_array2, instructionHandle_array45, instructionHandle57);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayInstruction58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle73);

  }

  @Test
  public void test640() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test640"); }

    short s0 = org.apache.bcel.Constants.GETFIELD2_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)208);

  }

  @Test
  public void test641() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test641"); }

    org.apache.bcel.generic.ObjectType objectType2 = org.apache.bcel.generic.Type.STRING;
    org.apache.bcel.generic.ArrayType arrayType4 = new org.apache.bcel.generic.ArrayType((org.apache.bcel.generic.Type)objectType2, (int)(short)193);
    org.apache.bcel.generic.ObjectType objectType5 = org.apache.bcel.generic.Type.STRING;
    boolean b7 = objectType5.equals((java.lang.Object)(short)148);
    boolean b8 = objectType2.isAssignmentCompatibleWith((org.apache.bcel.generic.Type)objectType5);
    byte[] byte_array11 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList12.getStart();
    byte[] byte_array16 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList17.findHandle(0);
    org.apache.bcel.generic.LocalVariableGen localVariableGen20 = new org.apache.bcel.generic.LocalVariableGen((int)(short)3, "aload_2[44](1)", (org.apache.bcel.generic.Type)objectType5, instructionHandle13, instructionHandle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(objectType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle19);

  }

  @Test
  public void test642() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test642"); }

    org.apache.bcel.classfile.Constant[] constant_array3 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool4 = new org.apache.bcel.classfile.ConstantPool(constant_array3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool4.copy();
    org.apache.bcel.classfile.SourceFile sourceFile6 = new org.apache.bcel.classfile.SourceFile((int)(short)228, (int)(short)46, (int)(byte)83, constantPool5);
    int i7 = sourceFile6.getSourceFileIndex();
    byte byte8 = sourceFile6.getTag();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);

  }

  @Test
  public void test643() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test643"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_STACK_MAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)11);

  }

  @Test
  public void test644() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test644"); }

    org.apache.bcel.generic.POP pOP0 = new org.apache.bcel.generic.POP();

  }

  @Test
  public void test645() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test645"); }

    org.apache.bcel.generic.InstructionHandle instructionHandle0 = null;
    org.apache.bcel.generic.ReturnaddressType returnaddressType1 = new org.apache.bcel.generic.ReturnaddressType(instructionHandle0);
    org.apache.bcel.generic.InstructionHandle instructionHandle2 = returnaddressType1.getTarget();
    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction3 = org.apache.bcel.generic.InstructionConstants.DSUB;
    boolean b4 = returnaddressType1.equals((java.lang.Object)arithmeticInstruction3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(instructionHandle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test646() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test646"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.SimpleElementValueGen simpleElementValueGen3 = new org.apache.bcel.generic.SimpleElementValueGen((int)(short)193, constantPoolGen1, (float)(short)65);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test647() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test647"); }

    short s0 = org.apache.bcel.Const.DUP_X2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)91);

  }

  @Test
  public void test648() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test648"); }

    org.apache.bcel.generic.ClassGen classGen0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    org.apache.bcel.generic.InstructionFactory instructionFactory2 = new org.apache.bcel.generic.InstructionFactory(classGen0, constantPoolGen1);

  }

  @Test
  public void test649() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test649"); }

    short s0 = org.apache.bcel.Constants.ACC_STATIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)8);

  }

  @Test
  public void test650() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test650"); }

    short s0 = org.apache.bcel.Constants.INVOKEVIRTUALOBJECT_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)219);

  }

  @Test
  public void test651() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test651"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    org.apache.bcel.classfile.BootstrapMethods bootstrapMethods4 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation3.visitBootstrapMethods(bootstrapMethods4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test652() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test652"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.FCONST_1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test653() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test653"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.LineNumberTable lineNumberTable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    descendingVisitor5.visitLineNumberTable(lineNumberTable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test654() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test654"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_PMG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)9);

  }

  @Test
  public void test655() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test655"); }

    org.apache.bcel.ExceptionConst.EXCS eXCS0 = org.apache.bcel.ExceptionConst.EXCS.EXCS_INTERFACE_METHOD_RESOLUTION;
    org.apache.bcel.generic.ReturnInstruction returnInstruction1 = org.apache.bcel.generic.InstructionConstants.RETURN;
    java.lang.Class<?>[] cls_array2 = returnInstruction1.getExceptions();
    java.lang.Class<?>[] cls_array3 = org.apache.bcel.ExceptionConst.createExceptions(eXCS0, cls_array2);
    org.junit.Assert.assertTrue("'" + eXCS0 + "' != '" + org.apache.bcel.ExceptionConst.EXCS.EXCS_INTERFACE_METHOD_RESOLUTION + "'", eXCS0.equals(org.apache.bcel.ExceptionConst.EXCS.EXCS_INTERFACE_METHOD_RESOLUTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(returnInstruction1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cls_array3);

  }

  @Test
  public void test656() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test656"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.LDC lDC1 = new org.apache.bcel.generic.LDC((-1));
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }

  }

  @Test
  public void test657() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test657"); }

    byte byte0 = org.apache.bcel.Constants.ATTR_RUNTIMEVISIBLE_PARAMETER_ANNOTATIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte0 == (byte)14);

  }

  @Test
  public void test658() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test658"); }

    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constant_array1);
    org.apache.bcel.classfile.AnnotationEntry annotationEntry4 = new org.apache.bcel.classfile.AnnotationEntry((int)(byte)67, constantPool2, false);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = annotationEntry4.toString();
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);

  }

  @Test
  public void test659() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test659"); }

    short s0 = org.apache.bcel.Const.ANEWARRAY_QUICK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)222);

  }

  @Test
  public void test660() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test660"); }

    org.apache.bcel.generic.ArithmeticInstruction arithmeticInstruction0 = org.apache.bcel.generic.InstructionConst.DSUB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arithmeticInstruction0);

  }

  @Test
  public void test661() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test661"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPool1.copy();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = constantPool1.constantToString((int)(byte)9, (byte)115);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException");
    } catch (org.apache.bcel.classfile.ClassFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);

  }

  @Test
  public void test662() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test662"); }

    org.apache.bcel.generic.ISTORE iSTORE1 = new org.apache.bcel.generic.ISTORE((int)(short)151);

  }

  @Test
  public void test663() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test663"); }

    byte[] byte_array2 = null;
    org.apache.bcel.classfile.StackMapEntry[] stackMapEntry_array5 = null;
    org.apache.bcel.classfile.Constant[] constant_array9 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool10 = new org.apache.bcel.classfile.ConstantPool(constant_array9);
    org.apache.bcel.classfile.SourceFile sourceFile11 = new org.apache.bcel.classfile.SourceFile((int)(byte)1, 0, (int)(short)27, constantPool10);
    org.apache.bcel.classfile.StackMap stackMap12 = new org.apache.bcel.classfile.StackMap((int)(short)214, 0, stackMapEntry_array5, constantPool10);
    org.apache.bcel.classfile.Deprecated deprecated13 = new org.apache.bcel.classfile.Deprecated((int)(short)1, (int)(short)111, byte_array2, constantPool10);
    byte[] byte_array14 = deprecated13.getBytes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);

  }

  @Test
  public void test664() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test664"); }

    org.apache.bcel.classfile.JavaClass javaClass0 = null;
    org.apache.bcel.classfile.LineNumber lineNumber3 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation4 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber3);
    org.apache.bcel.classfile.DescendingVisitor descendingVisitor5 = new org.apache.bcel.classfile.DescendingVisitor(javaClass0, (org.apache.bcel.classfile.Visitor)stringRepresentation4);
    org.apache.bcel.classfile.ParameterAnnotationEntry parameterAnnotationEntry6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stringRepresentation4.visitParameterAnnotationEntry(parameterAnnotationEntry6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test665() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test665"); }

    org.apache.bcel.generic.DDIV dDIV0 = new org.apache.bcel.generic.DDIV();

  }

  @Test
  public void test666() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test666"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(constant_array0);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.Constant constant3 = null;
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = new org.apache.bcel.generic.ConstantPoolGen(constant_array4);
    // The following exception was thrown during execution in test generation
    try {
    int i7 = constantPoolGen2.addConstant(constant3, constantPoolGen6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);

  }

  @Test
  public void test667() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test667"); }

    org.apache.bcel.generic.DCMPL dCMPL0 = new org.apache.bcel.generic.DCMPL();

  }

  @Test
  public void test668() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test668"); }

    org.apache.bcel.classfile.LocalVariable localVariable2 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array3 = new org.apache.bcel.classfile.LocalVariable[] { localVariable2 };
    org.apache.bcel.classfile.Constant[] constant_array4 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constant_array4);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPool5.copy();
    org.apache.bcel.classfile.LocalVariableTypeTable localVariableTypeTable7 = new org.apache.bcel.classfile.LocalVariableTypeTable((int)(short)101, (int)(short)31, localVariable_array3, constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);

  }

  @Test
  public void test669() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test669"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConst.ICONST_M1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test670() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test670"); }

    org.apache.bcel.generic.Instruction instruction0 = org.apache.bcel.generic.InstructionConstants.ICONST_3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instruction0);

  }

  @Test
  public void test671() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test671"); }

    org.apache.bcel.classfile.LineNumber lineNumber2 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation3 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber2);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)12 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.classfile.CodeException codeException12 = null;
    org.apache.bcel.classfile.CodeException[] codeException_array13 = new org.apache.bcel.classfile.CodeException[] { codeException12 };
    org.apache.bcel.classfile.Constant[] constant_array17 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool18 = new org.apache.bcel.classfile.ConstantPool(constant_array17);
    org.apache.bcel.classfile.ConstantPool constantPool19 = constantPool18.copy();
    org.apache.bcel.classfile.Signature signature20 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool19);
    signature20.setSignatureIndex((int)(short)0);
    org.apache.bcel.classfile.LocalVariable localVariable25 = null;
    org.apache.bcel.classfile.LocalVariable[] localVariable_array26 = new org.apache.bcel.classfile.LocalVariable[] { localVariable25 };
    org.apache.bcel.classfile.Constant[] constant_array27 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool28 = new org.apache.bcel.classfile.ConstantPool(constant_array27);
    org.apache.bcel.classfile.ConstantPool constantPool29 = constantPool28.copy();
    org.apache.bcel.classfile.LocalVariableTable localVariableTable30 = new org.apache.bcel.classfile.LocalVariableTable((int)(short)158, 15, localVariable_array26, constantPool28);
    org.apache.bcel.classfile.LineNumber lineNumber33 = new org.apache.bcel.classfile.LineNumber((-1), (int)(short)78);
    org.apache.bcel.verifier.statics.StringRepresentation stringRepresentation34 = new org.apache.bcel.verifier.statics.StringRepresentation((org.apache.bcel.classfile.Node)lineNumber33);
    org.apache.bcel.classfile.Constant[] constant_array38 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool39 = new org.apache.bcel.classfile.ConstantPool(constant_array38);
    org.apache.bcel.classfile.ConstantPool constantPool40 = constantPool39.copy();
    org.apache.bcel.classfile.Signature signature41 = new org.apache.bcel.classfile.Signature((int)(short)160, (int)(short)255, (int)(short)45, constantPool40);
    stringRepresentation34.visitSignature(signature41);
    org.apache.bcel.classfile.Attribute[] attribute_array43 = new org.apache.bcel.classfile.Attribute[] { signature20, localVariableTable30, signature41 };
    org.apache.bcel.classfile.Constant[] constant_array44 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.classfile.ConstantPool constantPool45 = new org.apache.bcel.classfile.ConstantPool(constant_array44);
    org.apache.bcel.classfile.Code code46 = new org.apache.bcel.classfile.Code((int)(short)131, (int)(byte)15, (int)(short)148, 64, byte_array10, codeException_array13, attribute_array43, constantPool45);
    stringRepresentation3.visitCode(code46);
    code46.setMaxLocals(74);
    int i50 = code46.getMaxLocals();
    int i51 = code46.getMaxLocals();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeException_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariable_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(attribute_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 74);

  }

}
