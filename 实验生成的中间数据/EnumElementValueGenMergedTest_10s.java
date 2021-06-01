
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnumElementValueGenMergedTest_10s {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test01"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BYTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 66);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test02"); }

    java.io.DataInput dataInput0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ElementValueGen elementValueGen2 = org.apache.bcel.generic.ElementValueGen.readElementValue(dataInput0, constantPoolGen1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test03"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_CHAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 67);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test04"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen3 = new org.apache.bcel.generic.EnumElementValueGen(objectType0, "", constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test05"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_DOUBLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 68);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test06"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.CLASS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 99);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test07"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_INT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 73);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test08"); }

    org.apache.bcel.classfile.ElementValue elementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.ElementValueGen elementValueGen3 = org.apache.bcel.generic.ElementValueGen.copy(elementValue0, constantPoolGen1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test09"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.ARRAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 91);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test10"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.STRING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 115);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test11"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_SHORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 83);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test12"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BOOLEAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 90);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test13"); }

    org.apache.bcel.classfile.EnumElementValue enumElementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen3 = new org.apache.bcel.generic.EnumElementValueGen(enumElementValue0, constantPoolGen1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test14"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_FLOAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 70);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test15"); }

    org.apache.bcel.classfile.EnumElementValue enumElementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen3 = new org.apache.bcel.generic.EnumElementValueGen(enumElementValue0, constantPoolGen1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test16"); }

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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test17"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.ENUM_CONSTANT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 101);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test18"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.ANNOTATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test19"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.EnumElementValueGen enumElementValueGen3 = new org.apache.bcel.generic.EnumElementValueGen(objectType0, "hi!", constantPoolGen2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test20"); }

    int i0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_LONG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 74);

  }

}
