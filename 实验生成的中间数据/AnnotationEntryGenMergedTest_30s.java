
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnnotationEntryGenMergedTest_30s {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test1"); }

    java.io.DataInput dataInput0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen3 = org.apache.bcel.generic.AnnotationEntryGen.read(dataInput0, constantPoolGen1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test2"); }

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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test3"); }

    org.apache.bcel.classfile.AnnotationEntry annotationEntry0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen3 = new org.apache.bcel.generic.AnnotationEntryGen(annotationEntry0, constantPoolGen1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test4"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
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
    org.junit.Assert.assertNotNull(elementValuePairGen_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test5"); }

    org.apache.bcel.classfile.AnnotationEntry annotationEntry0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen3 = new org.apache.bcel.generic.AnnotationEntryGen(annotationEntry0, constantPoolGen1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test6"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
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
    org.junit.Assert.assertNotNull(elementValuePairGen_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test7"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
    java.util.List<org.apache.bcel.generic.ElementValuePairGen> list_elementValuePairGen1 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen4 = new org.apache.bcel.generic.AnnotationEntryGen(objectType0, list_elementValuePairGen1, true, constantPoolGen3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test8"); }

    org.apache.bcel.generic.ObjectType objectType0 = null;
    java.util.List<org.apache.bcel.generic.ElementValuePairGen> list_elementValuePairGen1 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.AnnotationEntryGen annotationEntryGen4 = new org.apache.bcel.generic.AnnotationEntryGen(objectType0, list_elementValuePairGen1, false, constantPoolGen3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
