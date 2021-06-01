
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstructionFinderMergedTest_10s {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test0.test1"); }

    org.apache.bcel.generic.InstructionList instructionList0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.util.InstructionFinder instructionFinder1 = new org.apache.bcel.util.InstructionFinder(instructionList0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
