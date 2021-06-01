
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstructionListMergedTest_20s {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test001"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    org.apache.bcel.generic.Instruction instruction4 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList2.delete(instruction4);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test002"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.BranchInstruction branchInstruction3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle4 = instructionList2.insert(branchInstruction3);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test003"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    org.apache.bcel.generic.BranchInstruction branchInstruction18 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle19 = instructionList2.insert(instructionHandle17, branchInstruction18);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test004"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = null;
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver9 = null;
    instructionList8.removeObserver(instructionListObserver9);
    int i11 = instructionList8.getLength();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.insert(instructionHandle5, instructionList8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test005"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    org.apache.bcel.generic.BranchInstruction branchInstruction18 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle19 = instructionList6.append(instructionHandle17, branchInstruction18);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test006"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList2.append(compoundInstruction5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test007"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver8 = null;
    instructionList7.addObserver(instructionListObserver8);
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList7.getStart();
    org.apache.bcel.generic.Instruction instruction11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.append(instructionHandle10, instruction11);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle10);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test008"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    org.apache.bcel.generic.Instruction instruction6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList2.append(instruction6);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test009"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.Instruction instruction3 = null;
    org.apache.bcel.generic.Instruction instruction4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.append(instruction3, instruction4);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test010"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.Instruction instruction5 = null;
    org.apache.bcel.generic.CompoundInstruction compoundInstruction6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList2.append(instruction5, compoundInstruction6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test011"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    org.apache.bcel.generic.Instruction instruction4 = null;
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array8 = instructionList7.getInstructionHandles();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList2.insert(instruction4, instructionList7);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array8);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test012"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    byte[] byte_array19 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList20 = new org.apache.bcel.generic.InstructionList(byte_array19);
    int i21 = instructionList20.size();
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    int i25 = instructionList24.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList20.append(instructionList24);
    byte[] byte_array28 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList29 = new org.apache.bcel.generic.InstructionList(byte_array28);
    int i30 = instructionList29.size();
    byte[] byte_array32 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList33 = new org.apache.bcel.generic.InstructionList(byte_array32);
    int i34 = instructionList33.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle35 = instructionList29.append(instructionList33);
    byte[] byte_array37 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList38 = new org.apache.bcel.generic.InstructionList(byte_array37);
    int i39 = instructionList38.size();
    byte[] byte_array41 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList42 = new org.apache.bcel.generic.InstructionList(byte_array41);
    int i43 = instructionList42.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle44 = instructionList38.append(instructionList42);
    org.apache.bcel.generic.InstructionHandle instructionHandle45 = instructionList20.insert(instructionHandle35, instructionList38);
    byte[] byte_array47 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList48 = new org.apache.bcel.generic.InstructionList(byte_array47);
    int i49 = instructionList48.size();
    byte[] byte_array51 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList52 = new org.apache.bcel.generic.InstructionList(byte_array51);
    int i53 = instructionList52.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle54 = instructionList48.append(instructionList52);
    byte[] byte_array56 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList57 = new org.apache.bcel.generic.InstructionList(byte_array56);
    int i58 = instructionList57.size();
    byte[] byte_array60 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList61 = new org.apache.bcel.generic.InstructionList(byte_array60);
    int i62 = instructionList61.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle63 = instructionList57.append(instructionList61);
    byte[] byte_array65 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList66 = new org.apache.bcel.generic.InstructionList(byte_array65);
    int i67 = instructionList66.size();
    byte[] byte_array69 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList70 = new org.apache.bcel.generic.InstructionList(byte_array69);
    int i71 = instructionList70.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle72 = instructionList66.append(instructionList70);
    org.apache.bcel.generic.InstructionHandle instructionHandle73 = instructionList48.insert(instructionHandle63, instructionList66);
    // The following exception was thrown during execution in test generation
    try {
    instructionList6.move(instructionHandle17, instructionHandle45, instructionHandle63);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle73);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test013"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    org.apache.bcel.generic.BranchInstruction branchInstruction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle9 = instructionList2.insert(branchInstruction8);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test014"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    byte[] byte_array19 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList20 = new org.apache.bcel.generic.InstructionList(byte_array19);
    int i21 = instructionList20.size();
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    int i25 = instructionList24.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList20.append(instructionList24);
    org.apache.bcel.generic.InstructionHandle instructionHandle27 = instructionList2.insert(instructionHandle17, instructionList20);
    org.apache.bcel.generic.LocalVariableGen localVariableGen28 = null;
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array29 = new org.apache.bcel.generic.LocalVariableGen[] { localVariableGen28 };
    byte[] byte_array31 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList32 = new org.apache.bcel.generic.InstructionList(byte_array31);
    int i33 = instructionList32.size();
    byte[] byte_array35 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList(byte_array35);
    int i37 = instructionList36.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle38 = instructionList32.append(instructionList36);
    byte[] byte_array40 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList41 = new org.apache.bcel.generic.InstructionList(byte_array40);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver42 = null;
    instructionList41.addObserver(instructionListObserver42);
    org.apache.bcel.generic.InstructionHandle instructionHandle44 = instructionList41.getStart();
    byte[] byte_array46 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList47 = new org.apache.bcel.generic.InstructionList(byte_array46);
    int i48 = instructionList47.size();
    byte[] byte_array50 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList51 = new org.apache.bcel.generic.InstructionList(byte_array50);
    int i52 = instructionList51.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle53 = instructionList47.append(instructionList51);
    byte[] byte_array55 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList56 = new org.apache.bcel.generic.InstructionList(byte_array55);
    int i57 = instructionList56.size();
    byte[] byte_array59 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList60 = new org.apache.bcel.generic.InstructionList(byte_array59);
    int i61 = instructionList60.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle62 = instructionList56.append(instructionList60);
    byte[] byte_array64 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList65 = new org.apache.bcel.generic.InstructionList(byte_array64);
    int i66 = instructionList65.size();
    byte[] byte_array68 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList69 = new org.apache.bcel.generic.InstructionList(byte_array68);
    int i70 = instructionList69.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle71 = instructionList65.append(instructionList69);
    org.apache.bcel.generic.InstructionHandle instructionHandle72 = instructionList47.insert(instructionHandle62, instructionList65);
    byte[] byte_array74 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList75 = new org.apache.bcel.generic.InstructionList(byte_array74);
    int i76 = instructionList75.size();
    byte[] byte_array78 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList79 = new org.apache.bcel.generic.InstructionList(byte_array78);
    int i80 = instructionList79.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle81 = instructionList75.append(instructionList79);
    instructionList41.move(instructionHandle62, instructionHandle81);
    // The following exception was thrown during execution in test generation
    try {
    instructionList20.redirectLocalVariables(localVariableGen_array29, instructionHandle38, instructionHandle62);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle81);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test015"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    org.apache.bcel.generic.Instruction instruction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList2.delete(instruction8);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test016"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    instructionList2.setPositions(false);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver5 = null;
    instructionList2.addObserver(instructionListObserver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test017"); }

    byte[] byte_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList(byte_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test018"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    byte[] byte_array4 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver6 = null;
    instructionList5.addObserver(instructionListObserver6);
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList5.getStart();
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList2.insert(instructionHandle8, instructionList11);
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array17 = instructionList16.getInstructionHandles();
    instructionList16.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList16.getEnd();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction21 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle22 = instructionList2.append(instructionHandle20, compoundInstruction21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test019"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.getEnd();
    org.apache.bcel.generic.Instruction instruction9 = null;
    org.apache.bcel.generic.Instruction instruction10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = instructionList2.insert(instruction9, instruction10);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test020"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    org.apache.bcel.generic.Instruction instruction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList2.delete(instruction4, instruction5);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test021"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.Instruction instruction5 = null;
    org.apache.bcel.generic.CompoundInstruction compoundInstruction6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList2.insert(instruction5, compoundInstruction6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test022"); }

    org.apache.bcel.generic.BranchInstruction branchInstruction0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList(branchInstruction0);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test023"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array7 = instructionList6.getInstructionHandles();
    instructionList6.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList6.getEnd();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.insert(instructionHandle10, compoundInstruction11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle10);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test024"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.Instruction instruction5 = null;
    org.apache.bcel.generic.Instruction instruction6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList2.append(instruction5, instruction6);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test025"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.InstructionList instructionList5 = instructionList2.copy();
    org.apache.bcel.generic.Instruction instruction6 = null;
    org.apache.bcel.generic.Instruction instruction7 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList5.delete(instruction6, instruction7);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList5);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test026"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    byte[] byte_array9 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList10 = new org.apache.bcel.generic.InstructionList(byte_array9);
    int i11 = instructionList10.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList6.append(instructionList10);
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    byte[] byte_array18 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList19 = new org.apache.bcel.generic.InstructionList(byte_array18);
    int i20 = instructionList19.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList15.append(instructionList19);
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    int i25 = instructionList24.size();
    byte[] byte_array27 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList28 = new org.apache.bcel.generic.InstructionList(byte_array27);
    int i29 = instructionList28.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle30 = instructionList24.append(instructionList28);
    org.apache.bcel.generic.InstructionHandle instructionHandle31 = instructionList6.insert(instructionHandle21, instructionList24);
    byte[] byte_array33 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList34 = new org.apache.bcel.generic.InstructionList(byte_array33);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array35 = instructionList34.getInstructionHandles();
    byte[] byte_array36 = instructionList34.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen37 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen38 = null;
    instructionList34.replaceConstantPool(constantPoolGen37, constantPoolGen38);
    org.apache.bcel.generic.InstructionHandle instructionHandle40 = instructionList34.getEnd();
    byte[] byte_array42 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList43 = new org.apache.bcel.generic.InstructionList(byte_array42);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array44 = instructionList43.getInstructionHandles();
    instructionList43.setPositions(false);
    java.lang.String str48 = instructionList43.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array49 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array51 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList52 = new org.apache.bcel.generic.InstructionList(byte_array51);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array53 = instructionList52.getInstructionHandles();
    instructionList52.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle56 = instructionList52.getEnd();
    byte[] byte_array58 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList59 = new org.apache.bcel.generic.InstructionList(byte_array58);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array60 = instructionList59.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle61 = instructionList59.getEnd();
    instructionList43.redirectLocalVariables(localVariableGen_array49, instructionHandle56, instructionHandle61);
    instructionList2.move(instructionHandle21, instructionHandle40, instructionHandle61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "   0: nop\n"+ "'", str48.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle61);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test027"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array7 = instructionList6.getInstructionHandles();
    int[] i_array8 = instructionList6.getInstructionPositions();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = org.apache.bcel.generic.InstructionList.findHandle(instructionHandle_array3, i_array8, (int)' ', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test028"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.InstructionList instructionList5 = instructionList2.copy();
    org.apache.bcel.generic.LocalVariableGen localVariableGen6 = null;
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array7 = new org.apache.bcel.generic.LocalVariableGen[] { localVariableGen6 };
    byte[] byte_array9 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList10 = new org.apache.bcel.generic.InstructionList(byte_array9);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver11 = null;
    instructionList10.addObserver(instructionListObserver11);
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList10.getStart();
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array17 = instructionList16.getInstructionHandles();
    instructionList16.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList16.getEnd();
    // The following exception was thrown during execution in test generation
    try {
    instructionList2.redirectLocalVariables(localVariableGen_array7, instructionHandle13, instructionHandle20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test029"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver10 = null;
    instructionList9.addObserver(instructionListObserver10);
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList9.getStart();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList6.insert(instructionHandle12, instructionList15);
    org.apache.bcel.generic.Instruction instruction18 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList2.insert(instructionHandle12, instruction18);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test030"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array12 = instructionList11.getInstructionHandles();
    byte[] byte_array13 = instructionList11.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen14 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen15 = null;
    instructionList11.replaceConstantPool(constantPoolGen14, constantPoolGen15);
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.getEnd();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction18 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList6.append(instructionHandle17, compoundInstruction18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test031"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.BranchInstruction branchInstruction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle6 = instructionList2.append(branchInstruction5);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test032"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array9 = instructionList8.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList8.getEnd();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.append(instructionHandle10, compoundInstruction11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test033"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    boolean b5 = instructionList2.contains(instruction4);
    org.apache.bcel.generic.Instruction instruction6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList2.append(instruction6);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test034"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList2.insert(compoundInstruction8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test035"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    java.lang.String str10 = instructionList6.toString(true);
    java.lang.String str11 = instructionList6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test036"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    int i4 = instructionList2.getLength();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList2.insert(compoundInstruction5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test037"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.Instruction instruction5 = null;
    org.apache.bcel.generic.CompoundInstruction compoundInstruction6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle7 = instructionList2.append(instruction5, compoundInstruction6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test038"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.removeObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionList instructionList5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList2.insert(instructionList5);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test039"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.Instruction instruction3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.insert(instruction3);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test040"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.removeObserver(instructionListObserver3);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList2.append(compoundInstruction5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test041"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    int i4 = instructionList2.getLength();
    org.apache.bcel.generic.Instruction instruction5 = null;
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver12 = null;
    instructionList11.addObserver(instructionListObserver12);
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList11.getStart();
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    int i18 = instructionList17.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList8.insert(instructionHandle14, instructionList17);
    byte[] byte_array21 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList22 = new org.apache.bcel.generic.InstructionList(byte_array21);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver23 = null;
    instructionList22.removeObserver(instructionListObserver23);
    byte[] byte_array26 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList27 = new org.apache.bcel.generic.InstructionList(byte_array26);
    int i28 = instructionList27.size();
    byte[] byte_array30 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList31 = new org.apache.bcel.generic.InstructionList(byte_array30);
    int i32 = instructionList31.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle33 = instructionList27.append(instructionList31);
    byte[] byte_array35 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList(byte_array35);
    int i37 = instructionList36.size();
    byte[] byte_array39 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList40 = new org.apache.bcel.generic.InstructionList(byte_array39);
    int i41 = instructionList40.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle42 = instructionList36.append(instructionList40);
    instructionList22.delete(instructionHandle33, instructionHandle42);
    instructionList8.delete(instructionHandle42);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle45 = instructionList2.append(instruction5, instructionList8);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle42);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test042"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    org.apache.bcel.generic.InstructionList instructionList6 = instructionList2.copy();
    org.apache.bcel.generic.Instruction instruction7 = null;
    org.apache.bcel.generic.CompoundInstruction compoundInstruction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList6.append(instruction7, compoundInstruction8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList6);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test043"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList2.getStart();
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver13 = null;
    instructionList12.addObserver(instructionListObserver13);
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList9.insert(instructionList12);
    org.apache.bcel.generic.BranchInstruction branchInstruction16 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle17 = instructionList2.insert(instructionHandle15, branchInstruction16);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test044"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    org.apache.bcel.generic.InstructionList instructionList6 = instructionList2.copy();
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    int i10 = instructionList9.size();
    byte[] byte_array12 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    int i14 = instructionList13.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList9.append(instructionList13);
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array19 = instructionList18.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList18.getEnd();
    byte[] byte_array22 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList23 = new org.apache.bcel.generic.InstructionList(byte_array22);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array24 = instructionList23.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle25 = instructionList23.getEnd();
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList13.append(instructionHandle20, instructionList23);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction27 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle28 = instructionList2.append(instructionHandle20, compoundInstruction27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test045"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.lang.String str7 = instructionList2.toString(false);
    org.apache.bcel.generic.Instruction instruction8 = null;
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    java.lang.String str19 = instructionList15.toString(true);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList2.append(instruction8, instructionList15);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "   0: nop\n"+ "'", str7.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test046"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    int i12 = instructionList11.size();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    int i16 = instructionList15.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList11.append(instructionList15);
    byte[] byte_array19 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList20 = new org.apache.bcel.generic.InstructionList(byte_array19);
    int i21 = instructionList20.size();
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    int i25 = instructionList24.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList20.append(instructionList24);
    org.apache.bcel.generic.InstructionHandle instructionHandle27 = instructionList2.insert(instructionHandle17, instructionList20);
    instructionList20.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle27);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test047"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.getEnd();
    org.apache.bcel.generic.InstructionListObserver instructionListObserver5 = null;
    instructionList2.removeObserver(instructionListObserver5);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver7 = null;
    instructionList2.removeObserver(instructionListObserver7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle4);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test048"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    int i9 = instructionList8.size();
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    int i13 = instructionList12.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList8.append(instructionList12);
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    int i18 = instructionList17.size();
    byte[] byte_array20 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList21 = new org.apache.bcel.generic.InstructionList(byte_array20);
    int i22 = instructionList21.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = instructionList17.append(instructionList21);
    byte[] byte_array25 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList26 = new org.apache.bcel.generic.InstructionList(byte_array25);
    int i27 = instructionList26.size();
    byte[] byte_array29 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList30 = new org.apache.bcel.generic.InstructionList(byte_array29);
    int i31 = instructionList30.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle32 = instructionList26.append(instructionList30);
    org.apache.bcel.generic.InstructionHandle instructionHandle33 = instructionList8.insert(instructionHandle23, instructionList26);
    byte[] byte_array35 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList(byte_array35);
    int i37 = instructionList36.size();
    byte[] byte_array39 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList40 = new org.apache.bcel.generic.InstructionList(byte_array39);
    int i41 = instructionList40.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle42 = instructionList36.append(instructionList40);
    instructionList2.move(instructionHandle23, instructionHandle42);
    int i44 = instructionList2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test049"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.lang.String str7 = instructionList2.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array8 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array12 = instructionList11.getInstructionHandles();
    instructionList11.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList11.getEnd();
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array19 = instructionList18.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList18.getEnd();
    instructionList2.redirectLocalVariables(localVariableGen_array8, instructionHandle15, instructionHandle20);
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = instructionList2.findHandle((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "   0: nop\n"+ "'", str7.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(instructionHandle23);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test050"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.InstructionList instructionList5 = instructionList2.copy();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    int i9 = instructionList8.size();
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    int i13 = instructionList12.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList8.append(instructionList12);
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    int i18 = instructionList17.size();
    byte[] byte_array20 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList21 = new org.apache.bcel.generic.InstructionList(byte_array20);
    int i22 = instructionList21.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = instructionList17.append(instructionList21);
    byte[] byte_array25 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList26 = new org.apache.bcel.generic.InstructionList(byte_array25);
    int i27 = instructionList26.size();
    byte[] byte_array29 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList30 = new org.apache.bcel.generic.InstructionList(byte_array29);
    int i31 = instructionList30.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle32 = instructionList26.append(instructionList30);
    org.apache.bcel.generic.InstructionHandle instructionHandle33 = instructionList8.insert(instructionHandle23, instructionList26);
    byte[] byte_array35 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList(byte_array35);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array37 = instructionList36.getInstructionHandles();
    byte[] byte_array38 = instructionList36.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle39 = instructionList2.insert(instructionHandle23, instructionList36);
    instructionList2.setPositions(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle39);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test051"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.removeObserver(instructionListObserver3);
    int i5 = instructionList2.getLength();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array9 = instructionList8.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList8.getEnd();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.append(instructionHandle10, compoundInstruction11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test052"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.getEnd();
    org.apache.bcel.generic.InstructionListObserver instructionListObserver5 = null;
    instructionList2.removeObserver(instructionListObserver5);
    instructionList2.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle4);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test053"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    org.apache.bcel.generic.Instruction instruction6 = null;
    org.apache.bcel.generic.CompoundInstruction compoundInstruction7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instruction6, compoundInstruction7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test054"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getEnd();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    java.lang.String str10 = instructionList8.toString(true);
    byte[] byte_array12 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    byte[] byte_array14 = instructionList13.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList8.insert(instructionList13);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction16 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList2.insert(instructionHandle15, compoundInstruction16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "   0: nop[0](1)\n"+ "'", str10.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test055"); }

    org.apache.bcel.generic.CompoundInstruction compoundInstruction0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList(compoundInstruction0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test056"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    boolean b5 = instructionList2.contains(instruction4);
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array9 = instructionList8.getInstructionHandles();
    instructionList8.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList8.getEnd();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver19 = null;
    instructionList18.addObserver(instructionListObserver19);
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList15.insert(instructionList18);
    org.apache.bcel.generic.InstructionHandle instructionHandle22 = instructionList2.insert(instructionHandle12, instructionList18);
    byte[] byte_array24 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList25 = new org.apache.bcel.generic.InstructionList(byte_array24);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array26 = instructionList25.getInstructionHandles();
    instructionList25.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle29 = instructionList25.getStart();
    org.apache.bcel.generic.Instruction instruction30 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle31 = instructionList18.append(instructionHandle29, instruction30);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle29);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test057"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    byte[] byte_array4 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver6 = null;
    instructionList5.addObserver(instructionListObserver6);
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.insert(instructionList5);
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = null;
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver13 = null;
    instructionList12.removeObserver(instructionListObserver13);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList2.append(instructionHandle9, instructionList12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test058"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    instructionList2.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test059"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle8 = instructionList2.spliterator();
    java.lang.String str9 = instructionList2.toString();
    instructionList2.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "   0: nop[0](1)\n"+ "'", str9.equals("   0: nop[0](1)\n"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test060"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    byte[] byte_array4 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver6 = null;
    instructionList5.addObserver(instructionListObserver6);
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.insert(instructionList5);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver12 = null;
    instructionList11.addObserver(instructionListObserver12);
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList11.getStart();
    // The following exception was thrown during execution in test generation
    try {
    instructionList5.delete(instructionHandle14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test061"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    int[] i_array4 = instructionList2.getInstructionPositions();
    int[] i_array5 = instructionList2.getInstructionPositions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test062"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    boolean b5 = instructionList2.contains(instruction4);
    org.apache.bcel.generic.Instruction instruction6 = null;
    org.apache.bcel.generic.Instruction instruction7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instruction6, instruction7);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test063"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    boolean b5 = instructionList2.contains(instruction4);
    instructionList2.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test064"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver9 = null;
    instructionList8.addObserver(instructionListObserver9);
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = instructionList8.getStart();
    byte[] byte_array13 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList14 = new org.apache.bcel.generic.InstructionList(byte_array13);
    int i15 = instructionList14.size();
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    int i19 = instructionList18.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList14.append(instructionList18);
    byte[] byte_array22 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList23 = new org.apache.bcel.generic.InstructionList(byte_array22);
    int i24 = instructionList23.size();
    byte[] byte_array26 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList27 = new org.apache.bcel.generic.InstructionList(byte_array26);
    int i28 = instructionList27.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle29 = instructionList23.append(instructionList27);
    byte[] byte_array31 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList32 = new org.apache.bcel.generic.InstructionList(byte_array31);
    int i33 = instructionList32.size();
    byte[] byte_array35 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList(byte_array35);
    int i37 = instructionList36.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle38 = instructionList32.append(instructionList36);
    org.apache.bcel.generic.InstructionHandle instructionHandle39 = instructionList14.insert(instructionHandle29, instructionList32);
    byte[] byte_array41 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList42 = new org.apache.bcel.generic.InstructionList(byte_array41);
    int i43 = instructionList42.size();
    byte[] byte_array45 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList46 = new org.apache.bcel.generic.InstructionList(byte_array45);
    int i47 = instructionList46.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle48 = instructionList42.append(instructionList46);
    instructionList8.move(instructionHandle29, instructionHandle48);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction50 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle51 = instructionList2.insert(instructionHandle29, compoundInstruction50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle48);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test065"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.lang.String str7 = instructionList2.toString(false);
    org.apache.bcel.generic.Instruction instruction8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = instructionList2.append(instruction8);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "   0: nop\n"+ "'", str7.equals("   0: nop\n"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test066"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle6 = instructionList2.getEnd();
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array10 = instructionList9.getInstructionHandles();
    byte[] byte_array12 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array14 = instructionList13.getInstructionHandles();
    int[] i_array15 = instructionList13.getInstructionPositions();
    org.apache.bcel.generic.InstructionHandle instructionHandle18 = org.apache.bcel.generic.InstructionList.findHandle(instructionHandle_array10, i_array15, (int)(short)0, (int)(short)0);
    org.apache.bcel.generic.BranchInstruction branchInstruction19 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle20 = instructionList2.append(instructionHandle18, branchInstruction19);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle18);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test067"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    // The following exception was thrown during execution in test generation
    try {
    instructionList2.delete(instruction4);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test068"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array7 = instructionList6.getInstructionHandles();
    int[] i_array8 = instructionList6.getInstructionPositions();
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = org.apache.bcel.generic.InstructionList.findHandle(instructionHandle_array3, i_array8, (int)(short)0, (int)(short)0);
    byte[] byte_array13 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList14 = new org.apache.bcel.generic.InstructionList(byte_array13);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array15 = instructionList14.getInstructionHandles();
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array19 = instructionList18.getInstructionHandles();
    int[] i_array20 = instructionList18.getInstructionPositions();
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = org.apache.bcel.generic.InstructionList.findHandle(instructionHandle_array15, i_array20, (int)(short)0, (int)(short)0);
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = org.apache.bcel.generic.InstructionList.findHandle(instructionHandle_array3, i_array20, (int)(byte)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test069"); }

    org.apache.bcel.generic.InstructionList instructionList0 = new org.apache.bcel.generic.InstructionList();
    byte[] byte_array2 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array2);
    instructionList3.setPositions(false);
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array9 = instructionList8.getInstructionHandles();
    instructionList8.setPositions(false);
    java.lang.String str13 = instructionList8.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array14 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array18 = instructionList17.getInstructionHandles();
    instructionList17.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList17.getEnd();
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array25 = instructionList24.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList24.getEnd();
    instructionList8.redirectLocalVariables(localVariableGen_array14, instructionHandle21, instructionHandle26);
    byte[] byte_array29 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList30 = new org.apache.bcel.generic.InstructionList(byte_array29);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver31 = null;
    instructionList30.addObserver(instructionListObserver31);
    org.apache.bcel.generic.InstructionHandle instructionHandle33 = instructionList30.getStart();
    instructionList3.redirectBranches(instructionHandle26, instructionHandle33);
    byte[] byte_array36 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList37 = new org.apache.bcel.generic.InstructionList(byte_array36);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver38 = null;
    instructionList37.addObserver(instructionListObserver38);
    org.apache.bcel.generic.InstructionHandle instructionHandle40 = instructionList37.getStart();
    byte[] byte_array42 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList43 = new org.apache.bcel.generic.InstructionList(byte_array42);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array44 = instructionList43.getInstructionHandles();
    instructionList43.setPositions(false);
    java.lang.String str48 = instructionList43.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array49 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array51 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList52 = new org.apache.bcel.generic.InstructionList(byte_array51);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array53 = instructionList52.getInstructionHandles();
    instructionList52.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle56 = instructionList52.getEnd();
    byte[] byte_array58 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList59 = new org.apache.bcel.generic.InstructionList(byte_array58);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array60 = instructionList59.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle61 = instructionList59.getEnd();
    instructionList43.redirectLocalVariables(localVariableGen_array49, instructionHandle56, instructionHandle61);
    byte[] byte_array64 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList65 = new org.apache.bcel.generic.InstructionList(byte_array64);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array66 = instructionList65.getInstructionHandles();
    byte[] byte_array67 = instructionList65.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen68 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen69 = null;
    instructionList65.replaceConstantPool(constantPoolGen68, constantPoolGen69);
    org.apache.bcel.generic.InstructionHandle instructionHandle71 = instructionList65.getEnd();
    byte[] byte_array73 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList74 = new org.apache.bcel.generic.InstructionList(byte_array73);
    int i75 = instructionList74.size();
    byte[] byte_array77 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList78 = new org.apache.bcel.generic.InstructionList(byte_array77);
    int i79 = instructionList78.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle80 = instructionList74.append(instructionList78);
    instructionList37.move(instructionHandle56, instructionHandle71, instructionHandle80);
    instructionList0.move(instructionHandle26, instructionHandle80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "   0: nop\n"+ "'", str13.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "   0: nop\n"+ "'", str48.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle80);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test070"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    org.apache.bcel.generic.InstructionList instructionList6 = instructionList2.copy();
    org.apache.bcel.generic.InstructionListObserver instructionListObserver7 = null;
    instructionList6.addObserver(instructionListObserver7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test071"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    int i5 = instructionList2.size();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array9 = instructionList8.getInstructionHandles();
    instructionList8.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList8.getEnd();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    byte[] byte_array16 = instructionList15.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList2.insert(instructionHandle12, instructionList15);
    java.util.Iterator<org.apache.bcel.generic.InstructionHandle> iterator_instructionHandle18 = instructionList2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_instructionHandle18);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test072"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getEnd();
    int[] i_array6 = instructionList2.getInstructionPositions();
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver10 = null;
    instructionList9.removeObserver(instructionListObserver10);
    byte[] byte_array13 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList14 = new org.apache.bcel.generic.InstructionList(byte_array13);
    int i15 = instructionList14.size();
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    int i19 = instructionList18.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList14.append(instructionList18);
    byte[] byte_array22 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList23 = new org.apache.bcel.generic.InstructionList(byte_array22);
    int i24 = instructionList23.size();
    byte[] byte_array26 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList27 = new org.apache.bcel.generic.InstructionList(byte_array26);
    int i28 = instructionList27.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle29 = instructionList23.append(instructionList27);
    instructionList9.delete(instructionHandle20, instructionHandle29);
    org.apache.bcel.generic.Instruction instruction31 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle32 = instructionList2.append(instructionHandle29, instruction31);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle29);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test073"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    boolean b5 = instructionList2.contains(instruction4);
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array9 = instructionList8.getInstructionHandles();
    instructionList8.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList8.getEnd();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver19 = null;
    instructionList18.addObserver(instructionListObserver19);
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList15.insert(instructionList18);
    org.apache.bcel.generic.InstructionHandle instructionHandle22 = instructionList2.insert(instructionHandle12, instructionList18);
    org.apache.bcel.generic.BranchInstruction branchInstruction23 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle24 = instructionList18.insert(branchInstruction23);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle22);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test074"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    instructionList2.setPositions();
    instructionList2.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test075"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle8 = instructionList2.spliterator();
    java.lang.String str9 = instructionList2.toString();
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array13 = instructionList12.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList12.getEnd();
    org.apache.bcel.generic.CompoundInstruction compoundInstruction15 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle16 = instructionList2.insert(instructionHandle14, compoundInstruction15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "   0: nop[0](1)\n"+ "'", str9.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test076"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test077"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    byte[] byte_array4 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver6 = null;
    instructionList5.addObserver(instructionListObserver6);
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.insert(instructionList5);
    org.apache.bcel.generic.InstructionHandle instructionHandle9 = null;
    org.apache.bcel.generic.CompoundInstruction compoundInstruction10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = instructionList2.insert(instructionHandle9, compoundInstruction10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test078"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    instructionList2.setPositions(false);
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array8 = instructionList7.getInstructionHandles();
    instructionList7.setPositions(false);
    java.lang.String str12 = instructionList7.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array13 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array17 = instructionList16.getInstructionHandles();
    instructionList16.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList16.getEnd();
    byte[] byte_array22 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList23 = new org.apache.bcel.generic.InstructionList(byte_array22);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array24 = instructionList23.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle25 = instructionList23.getEnd();
    instructionList7.redirectLocalVariables(localVariableGen_array13, instructionHandle20, instructionHandle25);
    byte[] byte_array28 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList29 = new org.apache.bcel.generic.InstructionList(byte_array28);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver30 = null;
    instructionList29.addObserver(instructionListObserver30);
    org.apache.bcel.generic.InstructionHandle instructionHandle32 = instructionList29.getStart();
    instructionList2.redirectBranches(instructionHandle25, instructionHandle32);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction34 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle35 = instructionList2.insert(compoundInstruction34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "   0: nop\n"+ "'", str12.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle32);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test079"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array5 = instructionList2.getInstructionHandles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array5);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test080"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.getEnd();
    int i5 = instructionList2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test081"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver12 = null;
    instructionList11.addObserver(instructionListObserver12);
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList11.getStart();
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    int i18 = instructionList17.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList8.insert(instructionHandle14, instructionList17);
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList2.insert(instructionList17);
    int[] i_array21 = instructionList2.getInstructionPositions();
    org.apache.bcel.generic.InstructionList instructionList22 = instructionList2.copy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList22);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test082"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    org.apache.bcel.generic.InstructionHandle instructionHandle5 = instructionList2.getStart();
    instructionList2.setPositions();
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver13 = null;
    instructionList12.addObserver(instructionListObserver13);
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList9.insert(instructionList12);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction16 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList2.insert(instructionHandle15, compoundInstruction16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test083"); }

    org.apache.bcel.generic.Instruction instruction0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionList instructionList1 = new org.apache.bcel.generic.InstructionList(instruction0);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test084"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver12 = null;
    instructionList11.addObserver(instructionListObserver12);
    org.apache.bcel.generic.InstructionHandle instructionHandle14 = instructionList11.getStart();
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    int i18 = instructionList17.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList8.insert(instructionHandle14, instructionList17);
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList2.insert(instructionList17);
    int[] i_array21 = instructionList2.getInstructionPositions();
    org.apache.bcel.generic.Instruction instruction22 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = instructionList2.append(instruction22);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test085"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    org.apache.bcel.generic.Instruction instruction9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList6.insert(instruction9);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test086"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    org.apache.bcel.generic.Instruction instruction4 = null;
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array8 = instructionList7.getInstructionHandles();
    instructionList7.setPositions(false);
    byte[] byte_array12 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver17 = null;
    instructionList16.addObserver(instructionListObserver17);
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList16.getStart();
    byte[] byte_array21 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList22 = new org.apache.bcel.generic.InstructionList(byte_array21);
    int i23 = instructionList22.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle24 = instructionList13.insert(instructionHandle19, instructionList22);
    org.apache.bcel.generic.InstructionHandle instructionHandle25 = instructionList7.insert(instructionList22);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList2.insert(instruction4, instructionList22);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle25);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test087"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.lang.String str7 = instructionList2.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array8 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array12 = instructionList11.getInstructionHandles();
    instructionList11.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList11.getEnd();
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array19 = instructionList18.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList18.getEnd();
    instructionList2.redirectLocalVariables(localVariableGen_array8, instructionHandle15, instructionHandle20);
    org.apache.bcel.generic.Instruction instruction22 = null;
    org.apache.bcel.generic.InstructionList instructionList23 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle24 = instructionList2.insert(instruction22, instructionList23);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "   0: nop\n"+ "'", str7.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test088"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.getEnd();
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver8 = null;
    instructionList7.addObserver(instructionListObserver8);
    int i10 = instructionList7.size();
    byte[] byte_array12 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array14 = instructionList13.getInstructionHandles();
    instructionList13.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList13.getEnd();
    byte[] byte_array19 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList20 = new org.apache.bcel.generic.InstructionList(byte_array19);
    byte[] byte_array21 = instructionList20.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle22 = instructionList7.insert(instructionHandle17, instructionList20);
    org.apache.bcel.generic.BranchInstruction branchInstruction23 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle24 = instructionList2.append(instructionHandle22, branchInstruction23);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle22);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test089"); }

    org.apache.bcel.generic.InstructionList instructionList0 = new org.apache.bcel.generic.InstructionList();
    org.apache.bcel.generic.CodeExceptionGen codeExceptionGen1 = null;
    org.apache.bcel.generic.CodeExceptionGen[] codeExceptionGen_array2 = new org.apache.bcel.generic.CodeExceptionGen[] { codeExceptionGen1 };
    byte[] byte_array4 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList5 = new org.apache.bcel.generic.InstructionList(byte_array4);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver6 = null;
    instructionList5.addObserver(instructionListObserver6);
    int i8 = instructionList5.size();
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array12 = instructionList11.getInstructionHandles();
    instructionList11.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle15 = instructionList11.getEnd();
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    byte[] byte_array19 = instructionList18.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle20 = instructionList5.insert(instructionHandle15, instructionList18);
    byte[] byte_array22 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList23 = new org.apache.bcel.generic.InstructionList(byte_array22);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array24 = instructionList23.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction25 = null;
    boolean b26 = instructionList23.contains(instruction25);
    byte[] byte_array28 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList29 = new org.apache.bcel.generic.InstructionList(byte_array28);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array30 = instructionList29.getInstructionHandles();
    instructionList29.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle33 = instructionList29.getEnd();
    byte[] byte_array35 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList36 = new org.apache.bcel.generic.InstructionList(byte_array35);
    byte[] byte_array38 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList39 = new org.apache.bcel.generic.InstructionList(byte_array38);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver40 = null;
    instructionList39.addObserver(instructionListObserver40);
    org.apache.bcel.generic.InstructionHandle instructionHandle42 = instructionList36.insert(instructionList39);
    org.apache.bcel.generic.InstructionHandle instructionHandle43 = instructionList23.insert(instructionHandle33, instructionList39);
    // The following exception was thrown during execution in test generation
    try {
    instructionList0.redirectExceptionHandlers(codeExceptionGen_array2, instructionHandle15, instructionHandle33);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeExceptionGen_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle43);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test090"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle6 = instructionList2.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle6);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test091"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionList instructionList3 = new org.apache.bcel.generic.InstructionList(byte_array1);
    byte[] byte_array4 = instructionList3.getByteCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test092"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction4 = null;
    boolean b5 = instructionList2.contains(instruction4);
    org.apache.bcel.generic.CodeExceptionGen[] codeExceptionGen_array6 = new org.apache.bcel.generic.CodeExceptionGen[] {  };
    byte[] byte_array8 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList9 = new org.apache.bcel.generic.InstructionList(byte_array8);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array10 = instructionList9.getInstructionHandles();
    byte[] byte_array11 = instructionList9.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList9.getEnd();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    byte[] byte_array17 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList18 = new org.apache.bcel.generic.InstructionList(byte_array17);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver19 = null;
    instructionList18.addObserver(instructionListObserver19);
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList18.getStart();
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    int i25 = instructionList24.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList15.insert(instructionHandle21, instructionList24);
    instructionList2.redirectExceptionHandlers(codeExceptionGen_array6, instructionHandle12, instructionHandle26);
    org.apache.bcel.generic.InstructionHandle instructionHandle28 = instructionList2.getStart();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(codeExceptionGen_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle28);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test093"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    int[] i_array4 = instructionList2.getInstructionPositions();
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array8 = instructionList7.getInstructionHandles();
    instructionList7.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = instructionList7.getEnd();
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.append(instructionList7);
    java.lang.String str14 = instructionList2.toString(true);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction15 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle16 = instructionList2.insert(compoundInstruction15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "   0: nop[0](1)\n   0: nop[0](1)\n"+ "'", str14.equals("   0: nop[0](1)\n   0: nop[0](1)\n"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test094"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.lang.String str7 = instructionList2.toString(false);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen8 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen9 = null;
    instructionList2.replaceConstantPool(constantPoolGen8, constantPoolGen9);
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.findHandle(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "   0: nop\n"+ "'", str7.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(instructionHandle12);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test095"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    byte[] byte_array5 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList6 = new org.apache.bcel.generic.InstructionList(byte_array5);
    int i7 = instructionList6.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle8 = instructionList2.append(instructionList6);
    byte[] byte_array10 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList11 = new org.apache.bcel.generic.InstructionList(byte_array10);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array12 = instructionList11.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList11.getEnd();
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array17 = instructionList16.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle18 = instructionList16.getEnd();
    org.apache.bcel.generic.InstructionHandle instructionHandle19 = instructionList6.append(instructionHandle13, instructionList16);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver20 = null;
    instructionList16.addObserver(instructionListObserver20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle19);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test096"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    int[] i_array4 = instructionList2.getInstructionPositions();
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array8 = instructionList7.getInstructionHandles();
    instructionList7.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle11 = instructionList7.getEnd();
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList2.append(instructionList7);
    java.lang.String str14 = instructionList2.toString(true);
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array18 = instructionList17.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction19 = null;
    boolean b20 = instructionList17.contains(instruction19);
    java.lang.String str22 = instructionList17.toString(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = instructionList17.getEnd();
    instructionList2.delete(instructionHandle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "   0: nop[0](1)\n   0: nop[0](1)\n"+ "'", str14.equals("   0: nop[0](1)\n   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "   0: nop\n"+ "'", str22.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle23);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test097"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver8 = null;
    instructionList7.addObserver(instructionListObserver8);
    org.apache.bcel.generic.InstructionHandle instructionHandle10 = instructionList7.getStart();
    byte[] byte_array12 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList13 = new org.apache.bcel.generic.InstructionList(byte_array12);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array14 = instructionList13.getInstructionHandles();
    instructionList13.setPositions(false);
    java.lang.String str18 = instructionList13.toString(false);
    org.apache.bcel.generic.LocalVariableGen[] localVariableGen_array19 = new org.apache.bcel.generic.LocalVariableGen[] {  };
    byte[] byte_array21 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList22 = new org.apache.bcel.generic.InstructionList(byte_array21);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array23 = instructionList22.getInstructionHandles();
    instructionList22.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle26 = instructionList22.getEnd();
    byte[] byte_array28 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList29 = new org.apache.bcel.generic.InstructionList(byte_array28);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array30 = instructionList29.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle31 = instructionList29.getEnd();
    instructionList13.redirectLocalVariables(localVariableGen_array19, instructionHandle26, instructionHandle31);
    byte[] byte_array34 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList35 = new org.apache.bcel.generic.InstructionList(byte_array34);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array36 = instructionList35.getInstructionHandles();
    byte[] byte_array37 = instructionList35.getByteCode();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen38 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen39 = null;
    instructionList35.replaceConstantPool(constantPoolGen38, constantPoolGen39);
    org.apache.bcel.generic.InstructionHandle instructionHandle41 = instructionList35.getEnd();
    byte[] byte_array43 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList44 = new org.apache.bcel.generic.InstructionList(byte_array43);
    int i45 = instructionList44.size();
    byte[] byte_array47 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList48 = new org.apache.bcel.generic.InstructionList(byte_array47);
    int i49 = instructionList48.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle50 = instructionList44.append(instructionList48);
    instructionList7.move(instructionHandle26, instructionHandle41, instructionHandle50);
    byte[] byte_array53 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList54 = new org.apache.bcel.generic.InstructionList(byte_array53);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array55 = instructionList54.getInstructionHandles();
    org.apache.bcel.generic.Instruction instruction56 = null;
    boolean b57 = instructionList54.contains(instruction56);
    byte[] byte_array59 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList60 = new org.apache.bcel.generic.InstructionList(byte_array59);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array61 = instructionList60.getInstructionHandles();
    instructionList60.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle64 = instructionList60.getEnd();
    byte[] byte_array66 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList67 = new org.apache.bcel.generic.InstructionList(byte_array66);
    byte[] byte_array69 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList70 = new org.apache.bcel.generic.InstructionList(byte_array69);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver71 = null;
    instructionList70.addObserver(instructionListObserver71);
    org.apache.bcel.generic.InstructionHandle instructionHandle73 = instructionList67.insert(instructionList70);
    org.apache.bcel.generic.InstructionHandle instructionHandle74 = instructionList54.insert(instructionHandle64, instructionList70);
    byte[] byte_array76 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList77 = new org.apache.bcel.generic.InstructionList(byte_array76);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array78 = instructionList77.getInstructionHandles();
    instructionList77.setPositions(false);
    byte[] byte_array82 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList83 = new org.apache.bcel.generic.InstructionList(byte_array82);
    byte[] byte_array85 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList86 = new org.apache.bcel.generic.InstructionList(byte_array85);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver87 = null;
    instructionList86.addObserver(instructionListObserver87);
    org.apache.bcel.generic.InstructionHandle instructionHandle89 = instructionList86.getStart();
    byte[] byte_array91 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList92 = new org.apache.bcel.generic.InstructionList(byte_array91);
    int i93 = instructionList92.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle94 = instructionList83.insert(instructionHandle89, instructionList92);
    org.apache.bcel.generic.InstructionHandle instructionHandle95 = instructionList77.insert(instructionList92);
    instructionList2.move(instructionHandle50, instructionHandle74, instructionHandle95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "   0: nop\n"+ "'", str18.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localVariableGen_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle95);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test098"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    instructionList2.setPositions(false);
    java.lang.String str7 = instructionList2.toString(false);
    byte[] byte_array9 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList10 = new org.apache.bcel.generic.InstructionList(byte_array9);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array11 = instructionList10.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle12 = instructionList10.getEnd();
    org.apache.bcel.generic.InstructionListObserver instructionListObserver13 = null;
    instructionList10.removeObserver(instructionListObserver13);
    byte[] byte_array16 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList17 = new org.apache.bcel.generic.InstructionList(byte_array16);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array18 = instructionList17.getInstructionHandles();
    instructionList17.setPositions(false);
    org.apache.bcel.generic.InstructionHandle instructionHandle21 = instructionList17.getStart();
    byte[] byte_array23 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList24 = new org.apache.bcel.generic.InstructionList(byte_array23);
    int i25 = instructionList24.size();
    byte[] byte_array27 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList28 = new org.apache.bcel.generic.InstructionList(byte_array27);
    int i29 = instructionList28.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle30 = instructionList24.append(instructionList28);
    instructionList10.delete(instructionHandle21, instructionHandle30);
    org.apache.bcel.generic.Instruction instruction32 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle33 = instructionList2.insert(instructionHandle21, instruction32);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "   0: nop\n"+ "'", str7.equals("   0: nop\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle30);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test099"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    int i3 = instructionList2.size();
    int[] i_array4 = instructionList2.getInstructionPositions();
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    byte[] byte_array9 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList10 = new org.apache.bcel.generic.InstructionList(byte_array9);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver11 = null;
    instructionList10.addObserver(instructionListObserver11);
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList10.getStart();
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    int i17 = instructionList16.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle18 = instructionList7.insert(instructionHandle13, instructionList16);
    byte[] byte_array20 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList21 = new org.apache.bcel.generic.InstructionList(byte_array20);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver22 = null;
    instructionList21.removeObserver(instructionListObserver22);
    byte[] byte_array25 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList26 = new org.apache.bcel.generic.InstructionList(byte_array25);
    int i27 = instructionList26.size();
    byte[] byte_array29 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList30 = new org.apache.bcel.generic.InstructionList(byte_array29);
    int i31 = instructionList30.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle32 = instructionList26.append(instructionList30);
    byte[] byte_array34 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList35 = new org.apache.bcel.generic.InstructionList(byte_array34);
    int i36 = instructionList35.size();
    byte[] byte_array38 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList39 = new org.apache.bcel.generic.InstructionList(byte_array38);
    int i40 = instructionList39.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle41 = instructionList35.append(instructionList39);
    instructionList21.delete(instructionHandle32, instructionHandle41);
    instructionList7.delete(instructionHandle41);
    org.apache.bcel.generic.InstructionList instructionList44 = new org.apache.bcel.generic.InstructionList();
    byte[] byte_array46 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList47 = new org.apache.bcel.generic.InstructionList(byte_array46);
    byte[] byte_array48 = instructionList47.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle49 = instructionList44.append(instructionList47);
    byte[] byte_array51 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList52 = new org.apache.bcel.generic.InstructionList(byte_array51);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array53 = instructionList52.getInstructionHandles();
    byte[] byte_array54 = instructionList52.getByteCode();
    org.apache.bcel.generic.InstructionHandle instructionHandle55 = instructionList52.getEnd();
    org.apache.bcel.generic.InstructionHandle instructionHandle56 = instructionList47.insert(instructionList52);
    instructionList2.redirectBranches(instructionHandle41, instructionHandle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle56);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test100"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.getEnd();
    org.apache.bcel.generic.InstructionListObserver instructionListObserver5 = null;
    instructionList2.removeObserver(instructionListObserver5);
    java.util.Spliterator<org.apache.bcel.generic.InstructionHandle> spliterator_instructionHandle7 = instructionList2.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_instructionHandle7);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test101"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = null;
    instructionList2.replaceConstantPool(constantPoolGen5, constantPoolGen6);
    int[] i_array8 = instructionList2.getInstructionPositions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test102"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle4 = instructionList2.getEnd();
    org.apache.bcel.generic.InstructionList instructionList5 = instructionList2.copy();
    byte[] byte_array7 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList8 = new org.apache.bcel.generic.InstructionList(byte_array7);
    java.lang.String str10 = instructionList8.toString(true);
    org.apache.bcel.generic.InstructionList instructionList11 = instructionList8.copy();
    int i12 = instructionList8.getLength();
    byte[] byte_array14 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList15 = new org.apache.bcel.generic.InstructionList(byte_array14);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array16 = instructionList15.getInstructionHandles();
    org.apache.bcel.generic.InstructionHandle instructionHandle17 = instructionList15.getEnd();
    byte[] byte_array19 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList20 = new org.apache.bcel.generic.InstructionList(byte_array19);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver21 = null;
    instructionList20.addObserver(instructionListObserver21);
    org.apache.bcel.generic.InstructionHandle instructionHandle23 = instructionList20.getStart();
    org.apache.bcel.generic.InstructionList instructionList24 = instructionList20.copy();
    org.apache.bcel.generic.InstructionHandle instructionHandle25 = instructionList8.insert(instructionHandle17, instructionList20);
    byte[] byte_array27 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList28 = new org.apache.bcel.generic.InstructionList(byte_array27);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array29 = instructionList28.getInstructionHandles();
    int i30 = instructionList28.getLength();
    org.apache.bcel.generic.InstructionHandle instructionHandle31 = instructionList2.insert(instructionHandle25, instructionList28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "   0: nop[0](1)\n"+ "'", str10.equals("   0: nop[0](1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionList24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle31);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test103"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.removeObserver(instructionListObserver3);
    int i5 = instructionList2.getLength();
    org.apache.bcel.generic.InstructionListObserver instructionListObserver6 = null;
    instructionList2.removeObserver(instructionListObserver6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test104"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    java.lang.String str4 = instructionList2.toString(true);
    org.apache.bcel.generic.BranchInstruction branchInstruction5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.BranchHandle branchHandle6 = instructionList2.insert(branchInstruction5);
      org.junit.Assert.fail("Expected exception of type org.apache.bcel.generic.ClassGenException");
    } catch (org.apache.bcel.generic.ClassGenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "   0: nop[0](1)\n"+ "'", str4.equals("   0: nop[0](1)\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test105"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionHandle[] instructionHandle_array3 = instructionList2.getInstructionHandles();
    byte[] byte_array4 = instructionList2.getByteCode();
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver8 = null;
    instructionList7.removeObserver(instructionListObserver8);
    byte[] byte_array11 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList12 = new org.apache.bcel.generic.InstructionList(byte_array11);
    int i13 = instructionList12.size();
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    int i17 = instructionList16.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle18 = instructionList12.append(instructionList16);
    byte[] byte_array20 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList21 = new org.apache.bcel.generic.InstructionList(byte_array20);
    int i22 = instructionList21.size();
    byte[] byte_array24 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList25 = new org.apache.bcel.generic.InstructionList(byte_array24);
    int i26 = instructionList25.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle27 = instructionList21.append(instructionList25);
    instructionList7.delete(instructionHandle18, instructionHandle27);
    org.apache.bcel.generic.CompoundInstruction compoundInstruction29 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.generic.InstructionHandle instructionHandle30 = instructionList2.append(instructionHandle18, compoundInstruction29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle27);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test106"); }

    byte[] byte_array1 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList2 = new org.apache.bcel.generic.InstructionList(byte_array1);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver3 = null;
    instructionList2.addObserver(instructionListObserver3);
    byte[] byte_array6 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList7 = new org.apache.bcel.generic.InstructionList(byte_array6);
    byte[] byte_array9 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList10 = new org.apache.bcel.generic.InstructionList(byte_array9);
    org.apache.bcel.generic.InstructionListObserver instructionListObserver11 = null;
    instructionList10.addObserver(instructionListObserver11);
    org.apache.bcel.generic.InstructionHandle instructionHandle13 = instructionList10.getStart();
    byte[] byte_array15 = new byte[] { (byte)0 };
    org.apache.bcel.generic.InstructionList instructionList16 = new org.apache.bcel.generic.InstructionList(byte_array15);
    int i17 = instructionList16.size();
    org.apache.bcel.generic.InstructionHandle instructionHandle18 = instructionList7.insert(instructionHandle13, instructionList16);
    boolean b19 = instructionList2.contains(instructionHandle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instructionHandle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

}
