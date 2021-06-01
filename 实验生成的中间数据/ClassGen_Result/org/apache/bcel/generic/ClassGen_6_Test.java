/*
 * This file was automatically generated by EvoSuite
 * Mon May 10 09:29:42 GMT 2021
 */

package org.apache.bcel.generic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LineNumberTable;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.util.ClassLoaderRepository;

public class ClassGen_6_Test {

  //Covered goal: org.apache.bcel.generic.ClassGen.setClassNameIndex(I)V: path condition EvoSuiteWrapper_6 (id = 0)

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<LineNumberTable> class0 = LineNumberTable.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      ClassGen classGen0 = new ClassGen(javaClass0);
      int int0 = 1235;
      // Undeclared exception!
      try { 
        classGen0.setClassNameIndex(int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1235. Constant pool size is: 256
         //
      }
  }
}
