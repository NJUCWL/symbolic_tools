/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:34:38 GMT 2021
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.ClassSet;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassSet_ESTest extends ClassSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classSet0.remove(javaClass0);
      assertTrue(classSet0.empty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<DataInputStream> class0 = DataInputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      classSet0.add(javaClass0);
      classSet0.toArray();
      assertFalse(classSet0.empty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      classSet0.add(javaClass0);
      classSet0.getClassNames();
      assertFalse(classSet0.empty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      // Undeclared exception!
      try { 
        classSet0.add((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      boolean boolean0 = classSet0.empty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      assertTrue(classSet0.empty());
      
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classSet0.add(javaClass0);
      boolean boolean0 = classSet0.empty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      classSet0.add(javaClass0);
      boolean boolean0 = classSet0.add(javaClass0);
      assertFalse(classSet0.empty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      String[] stringArray0 = classSet0.getClassNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      JavaClass[] javaClassArray0 = classSet0.toArray();
      assertEquals(0, javaClassArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassSet classSet0 = new ClassSet();
      // Undeclared exception!
      try { 
        classSet0.remove((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassSet", e);
      }
  }
}
