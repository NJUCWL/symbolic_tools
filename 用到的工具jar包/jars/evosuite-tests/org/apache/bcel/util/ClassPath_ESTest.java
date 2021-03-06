/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:31:04 GMT 2021
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import org.apache.bcel.util.ClassPath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassPath_ESTest extends ClassPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getBytes("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: .class
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getPath(".jar");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: .jar
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPath classPath1 = new ClassPath(classPath0, "");
      boolean boolean0 = classPath1.equals(classPath0);
      assertFalse(classPath0.equals((Object)classPath1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("(7Y");
      ClassPath classPath1 = new ClassPath(classPath0, "org.apache.bcel.util.ClassPath");
      classPath1.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string0 = classPath0.getPath("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      InputStream inputStream0 = classPath0.SYSTEM_CLASS_PATH.getInputStream("org.apache.bcel.util.ClassPath$Zip");
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/jsse.jar");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "3hoE91)`B#w]-U_FJ");
      ClassPath classPath0 = new ClassPath();
      // Undeclared exception!
      try { 
        classPath0.getResources((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/jsse.jar");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "3hoE91)`B#w]-U_FJ");
      ClassPath classPath0 = new ClassPath();
      // Undeclared exception!
      try { 
        classPath0.getPath((String) null, ".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassPath$Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassPath classPath0 = new ClassPath((ClassPath) null, "=h$j)F![N/>sb");
      // Undeclared exception!
      try { 
        classPath0.getPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      // Undeclared exception!
      try { 
        classPath0.getInputStream((String) null, "*7.zip");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassPath$Dir", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      // Undeclared exception!
      try { 
        classPath0.SYSTEM_CLASS_PATH.getInputStream((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath();
      // Undeclared exception!
      try { 
        classPath0.getBytes((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassPath$Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath();
      // Undeclared exception!
      try { 
        classPath0.getBytes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.ClassPath$Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      ClassPath classPath1 = null;
      try {
        classPath1 = new ClassPath(classPath0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassPath classPath0 = null;
      try {
        classPath0 = new ClassPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      ClassPath classPath1 = new ClassPath(classPath0, "");
      try { 
        classPath1.getClassFile("", "");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: 
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getInputStream("org.apache.bcel.util.ClassPath$Zip", "org.apache.bcel.util.ClassPath$Zip");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: org.apache.bcel.util.ClassPath$Ziporg.apache.bcel.util.ClassPath$Zip
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      InputStream inputStream0 = classPath0.getInputStream("", "");
      assertEquals(13, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/jce.jar");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = ClassPath.getClassPath();
      assertEquals("/opt/jdk8u282-b08/jre/lib/jce.jar", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPath classPath1 = new ClassPath(classPath0, ".class");
      String string0 = classPath1.toString();
      assertEquals(":.class", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Jw");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath("Jw");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(">NuNmk~");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath("w?Y:>NuNmk~");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("org.apache.bcel.util.ClassPath$Dir$1");
      try { 
        classPath0.getBytes("org.apache.bcel.util.ClassPath$Dir$1", "]r");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: org.apache.bcel.util.ClassPath$Dir$1]r
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("");
      try { 
        classPath0.getPath("", "org.apache.bcel.util.ClassPath$Dir$1");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: org.apache.bcel.util.ClassPath$Dir$1
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getClassFile("", "");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: 
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath();
      InputStream inputStream0 = classPath0.getResourceAsStream("");
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      InputStream inputStream0 = classPath0.getResourceAsStream("");
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      URL uRL0 = classPath0.getResource("{");
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getPath("file.jar");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: file.jar
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getBytes("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: .class
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/jsse.jar");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "3hoE91)`B#w]-U_FJ");
      ClassPath classPath0 = new ClassPath();
      Enumeration<URL> enumeration0 = classPath0.getResources("3hoE91)`B#w]-U_FJ");
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      Enumeration<URL> enumeration0 = classPath0.getResources("");
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      URL uRL0 = classPath0.getResource("");
      assertNull(uRL0.getAuthority());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      InputStream inputStream0 = classPath0.getResourceAsStream("3qE%N6\u0001+'");
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      byte[] byteArray0 = classPath0.getBytes("", "");
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/ext");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      String string0 = ClassPath.getClassPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/usr/java/packages/lib/ext");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = ClassPath.getClassPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      boolean boolean0 = classPath0.SYSTEM_CLASS_PATH.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      classPath0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("");
      ClassPath classPath1 = new ClassPath(classPath0, "org.apache.bcel.util.ClassPath$Dir");
      boolean boolean0 = classPath1.equals(classPath1);
      assertFalse(classPath0.equals((Object)classPath1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      String string0 = classPath0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/sunrsasign.jar");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ClassPath classPath0 = new ClassPath();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      try { 
        classPath0.getClassFile("org.apache.bcel.util.ClassPath$Dir");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: org.apache.bcel.util.ClassPath$Dir.class
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassPath classPath0 = new ClassPath();
      try { 
        classPath0.getInputStream("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: .class
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPath classPath1 = new ClassPath(classPath0, "jar:file:");
      try { 
        classPath1.getClassFile("org.apache.bcel.util.ClassPath$Dir");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Couldn't find: org.apache.bcel.util.ClassPath$Dir.class
         //
         verifyException("org.apache.bcel.util.ClassPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/opt/jdk8u282-b08/jre/lib/rt.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassPath classPath0 = new ClassPath();
      String string0 = classPath0.getPath("");
      assertEquals("/opt/jdk8u282-b08/jre/lib/rt.jar", string0);
  }
}
