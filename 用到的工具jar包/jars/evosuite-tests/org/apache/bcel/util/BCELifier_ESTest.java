/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 16 14:43:38 GMT 2021
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.BCELifier;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BCELifier_ESTest extends BCELifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = BCELifier.printType("Const.ACC_PUBLIC | Const.ACC_PRIVATE | Const.ACC_PROTECTED | Const.ACC_SUPER | Const.ACC_TRANSIENT | Const.ACC_NATIVE | Const.ACC_ABSTRACT | Const.ACC_STRICTFP | Const.ACC_SYNTHETIC | Const.ACC_ANNOTATION | Const.ACC_ENUM");
      assertEquals("Type.CHAR", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      String string0 = BCELifier.printArgumentTypes(typeArray0);
      assertEquals("Type.NO_ARGS", string0);
      assertNotNull(string0);
      assertEquals(0, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaClass javaClass0 = BCELifier.getJavaClass("org.apache.bcel.generic.RET");
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(javaClass0);
      assertEquals(27, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isPrivate());
      assertFalse(javaClass0.isSynthetic());
      assertEquals("org.apache.bcel.generic.Instruction", javaClass0.getSuperclassName());
      assertEquals(26, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isAbstract());
      assertEquals("org.apache.bcel.generic", javaClass0.getPackageName());
      assertEquals("RET.java", javaClass0.getSourceFileName());
      assertEquals(33, javaClass0.getModifiers());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isVarArgs());
      assertFalse(javaClass0.isProtected());
      assertTrue(javaClass0.isSuper());
      assertEquals(51, javaClass0.getMajor());
      assertFalse(javaClass0.isEnum());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(33, javaClass0.getAccessFlags());
      assertEquals(0, javaClass0.getMinor());
      assertTrue(javaClass0.isClass());
      assertEquals("org.apache.bcel.generic.RET", javaClass0.getFileName());
      assertEquals("org.apache.bcel.generic.RET", javaClass0.getClassName());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isStrictfp());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaClass javaClass0 = BCELifier.getJavaClass("java.lang.AbstractStringBuilder");
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)3, JavaClass.ZIP);
      assertNotNull(javaClass0);
      assertTrue(javaClass0.isClass());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isFinal());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isVarArgs());
      assertTrue(javaClass0.isSuper());
      assertEquals("AbstractStringBuilder.java", javaClass0.getSourceFileName());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isNative());
      assertEquals(8, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isStrictfp());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertEquals(1056, javaClass0.getAccessFlags());
      assertEquals("java.lang", javaClass0.getPackageName());
      assertEquals(1056, javaClass0.getModifiers());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isPrivate());
      assertFalse(javaClass0.isEnum());
      assertEquals("java.lang.AbstractStringBuilder", javaClass0.getClassName());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals("java.lang.AbstractStringBuilder", javaClass0.getFileName());
      assertFalse(javaClass0.isAnnotation());
      assertFalse(javaClass0.isStatic());
      assertEquals(94, javaClass0.getSuperclassNameIndex());
      assertTrue(javaClass0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertNotNull(byteArrayOutputStream0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      JavaClass javaClass0 = BCELifier.getJavaClass("org.apache.bcel.generic.Type$1");
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertNotNull(javaClass0);
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("org.apache.bcel.generic.Type$1", javaClass0.getClassName());
      assertFalse(javaClass0.isStatic());
      assertEquals(2, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isNative());
      assertTrue(javaClass0.isSuper());
      assertEquals(48, javaClass0.getModifiers());
      assertFalse(javaClass0.isVarArgs());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isPublic());
      assertFalse(javaClass0.isStrictfp());
      assertEquals("org.apache.bcel.generic.Type$1", javaClass0.getFileName());
      assertFalse(javaClass0.isProtected());
      assertTrue(javaClass0.isFinal());
      assertEquals(48, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isEnum());
      assertEquals("Type.java", javaClass0.getSourceFileName());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isPrivate());
      assertEquals("org.apache.bcel.generic", javaClass0.getPackageName());
      assertTrue(javaClass0.isClass());
      assertEquals("org.apache.bcel.generic.ReferenceType", javaClass0.getSuperclassName());
      assertEquals(3, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(51, javaClass0.getMajor());
      assertFalse(javaClass0.isAbstract());
      
      BCELifier bCELifier0 = new BCELifier(javaClass0, byteArrayOutputStream0);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertNotNull(bCELifier0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("org.apache.bcel.generic.Type$1", javaClass0.getClassName());
      assertFalse(javaClass0.isStatic());
      assertEquals(2, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isNative());
      assertTrue(javaClass0.isSuper());
      assertEquals(48, javaClass0.getModifiers());
      assertFalse(javaClass0.isVarArgs());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isPublic());
      assertFalse(javaClass0.isStrictfp());
      assertEquals("org.apache.bcel.generic.Type$1", javaClass0.getFileName());
      assertFalse(javaClass0.isProtected());
      assertTrue(javaClass0.isFinal());
      assertEquals(48, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isEnum());
      assertEquals("Type.java", javaClass0.getSourceFileName());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isPrivate());
      assertEquals("org.apache.bcel.generic", javaClass0.getPackageName());
      assertTrue(javaClass0.isClass());
      assertEquals("org.apache.bcel.generic.ReferenceType", javaClass0.getSuperclassName());
      assertEquals(3, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(51, javaClass0.getMajor());
      assertFalse(javaClass0.isAbstract());
      
      bCELifier0.visitJavaClass(javaClass0);
      assertEquals((byte)2, JavaClass.FILE);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("org.apache.bcel.generic.Type$1", javaClass0.getClassName());
      assertFalse(javaClass0.isStatic());
      assertEquals(2, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isNative());
      assertTrue(javaClass0.isSuper());
      assertEquals(48, javaClass0.getModifiers());
      assertFalse(javaClass0.isVarArgs());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isPublic());
      assertFalse(javaClass0.isStrictfp());
      assertEquals("org.apache.bcel.generic.Type$1", javaClass0.getFileName());
      assertFalse(javaClass0.isProtected());
      assertTrue(javaClass0.isFinal());
      assertEquals(48, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isVolatile());
      assertFalse(javaClass0.isEnum());
      assertEquals("Type.java", javaClass0.getSourceFileName());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertFalse(javaClass0.isPrivate());
      assertEquals("org.apache.bcel.generic", javaClass0.getPackageName());
      assertTrue(javaClass0.isClass());
      assertEquals("org.apache.bcel.generic.ReferenceType", javaClass0.getSuperclassName());
      assertEquals(3, javaClass0.getSuperclassNameIndex());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(51, javaClass0.getMajor());
      assertFalse(javaClass0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("F?G$~L");
      assertNotNull(classPath0);
      
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      assertNotNull(classPathRepository0);
      
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(javaClass0);
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isVolatile());
      assertEquals(15, javaClass0.getSuperclassNameIndex());
      assertEquals("java.io.InputStream", javaClass0.getClassName());
      assertEquals(52, javaClass0.getMajor());
      assertEquals(0, javaClass0.getMinor());
      assertEquals(1057, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isSynthetic());
      assertTrue(javaClass0.isClass());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertTrue(javaClass0.isSynchronized());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertFalse(javaClass0.isStrictfp());
      assertEquals("java.io.InputStream", javaClass0.getFileName());
      assertFalse(javaClass0.isProtected());
      assertTrue(javaClass0.isAbstract());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isVarArgs());
      assertTrue(javaClass0.isSuper());
      assertEquals((byte)2, javaClass0.getSource());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isAnnotation());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isInterface());
      assertEquals("InputStream.java", javaClass0.getSourceFileName());
      assertEquals(1057, javaClass0.getModifiers());
      assertEquals(9, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isFinal());
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      BCELifier bCELifier0 = new BCELifier(javaClass0, pipedOutputStream0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(bCELifier0);
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isVolatile());
      assertEquals(15, javaClass0.getSuperclassNameIndex());
      assertEquals("java.io.InputStream", javaClass0.getClassName());
      assertEquals(52, javaClass0.getMajor());
      assertEquals(0, javaClass0.getMinor());
      assertEquals(1057, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isSynthetic());
      assertTrue(javaClass0.isClass());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isPublic());
      assertFalse(javaClass0.isTransient());
      assertTrue(javaClass0.isSynchronized());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertFalse(javaClass0.isStrictfp());
      assertEquals("java.io.InputStream", javaClass0.getFileName());
      assertFalse(javaClass0.isProtected());
      assertTrue(javaClass0.isAbstract());
      assertEquals("java.io", javaClass0.getPackageName());
      assertFalse(javaClass0.isVarArgs());
      assertTrue(javaClass0.isSuper());
      assertEquals((byte)2, javaClass0.getSource());
      assertFalse(javaClass0.isEnum());
      assertFalse(javaClass0.isAnnotation());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isInterface());
      assertEquals("InputStream.java", javaClass0.getSourceFileName());
      assertEquals(1057, javaClass0.getModifiers());
      assertEquals(9, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isFinal());
      
      // Undeclared exception!
      try { 
        bCELifier0.visitJavaClass((JavaClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.BCELifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("F?G$~L");
      assertNotNull(classPath0);
      
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      assertNotNull(classPathRepository0);
      
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(javaClass0);
      assertFalse(javaClass0.isVolatile());
      assertEquals(15, javaClass0.getSuperclassNameIndex());
      assertEquals("java.io.InputStream", javaClass0.getClassName());
      assertEquals(1057, javaClass0.getModifiers());
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isFinal());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertTrue(javaClass0.isPublic());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isInterface());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isVarArgs());
      assertFalse(javaClass0.isStrictfp());
      assertEquals(52, javaClass0.getMajor());
      assertEquals("java.io.InputStream", javaClass0.getFileName());
      assertTrue(javaClass0.isAbstract());
      assertEquals("java.io", javaClass0.getPackageName());
      assertEquals(9, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("InputStream.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isEnum());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertEquals(1057, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isClass());
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      BCELifier bCELifier0 = new BCELifier(javaClass0, pipedOutputStream0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(bCELifier0);
      assertFalse(javaClass0.isVolatile());
      assertEquals(15, javaClass0.getSuperclassNameIndex());
      assertEquals("java.io.InputStream", javaClass0.getClassName());
      assertEquals(1057, javaClass0.getModifiers());
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isFinal());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertTrue(javaClass0.isPublic());
      assertTrue(javaClass0.isSynchronized());
      assertFalse(javaClass0.isInterface());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isProtected());
      assertFalse(javaClass0.isVarArgs());
      assertFalse(javaClass0.isStrictfp());
      assertEquals(52, javaClass0.getMajor());
      assertEquals("java.io.InputStream", javaClass0.getFileName());
      assertTrue(javaClass0.isAbstract());
      assertEquals("java.io", javaClass0.getPackageName());
      assertEquals(9, javaClass0.getClassNameIndex());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertEquals("InputStream.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isEnum());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals(0, javaClass0.getMinor());
      assertEquals(1057, javaClass0.getAccessFlags());
      assertFalse(javaClass0.isSynthetic());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isPrivate());
      assertTrue(javaClass0.isClass());
      
      // Undeclared exception!
      try { 
        bCELifier0.visitField((Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.BCELifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RET rET0 = new RET(3550);
      assertNotNull(rET0);
      assertEquals(4, rET0.getLength());
      assertEquals("ret", rET0.getName());
      assertEquals(3550, rET0.getIndex());
      assertEquals((short)169, rET0.getOpcode());
      
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      assertNotNull(constantPoolGen0);
      assertEquals(1, constantPoolGen0.getSize());
      
      Type type0 = rET0.getType(constantPoolGen0);
      assertNotNull(type0);
      assertEquals(4, rET0.getLength());
      assertEquals("ret", rET0.getName());
      assertEquals(3550, rET0.getIndex());
      assertEquals((short)169, rET0.getOpcode());
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals(1, type0.getSize());
      assertEquals((byte)16, type0.getType());
      assertEquals("<return address>", type0.getSignature());
      
      // Undeclared exception!
      try { 
        BCELifier.printType(type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: <return address>
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        BCELifier.printType((Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        BCELifier.printType("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: 
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        BCELifier.printType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type[] typeArray0 = new Type[5];
      BIPUSH bIPUSH0 = new BIPUSH((byte)3);
      assertNotNull(bIPUSH0);
      assertEquals((short)16, bIPUSH0.getOpcode());
      assertEquals(2, bIPUSH0.getLength());
      assertEquals("bipush", bIPUSH0.getName());
      
      ConstantPoolGen constantPoolGen0 = new ConstantPoolGen();
      assertNotNull(constantPoolGen0);
      assertEquals(1, constantPoolGen0.getSize());
      
      Type type0 = bIPUSH0.getType(constantPoolGen0);
      assertNotNull(type0);
      assertEquals((short)16, bIPUSH0.getOpcode());
      assertEquals(2, bIPUSH0.getLength());
      assertEquals("bipush", bIPUSH0.getName());
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals((byte)8, type0.getType());
      assertEquals("B", type0.getSignature());
      assertEquals(1, type0.getSize());
      
      typeArray0[0] = type0;
      ACONST_NULL aCONST_NULL0 = new ACONST_NULL();
      assertNotNull(aCONST_NULL0);
      assertEquals("aconst_null", aCONST_NULL0.getName());
      assertEquals(1, aCONST_NULL0.getLength());
      assertEquals((short)1, aCONST_NULL0.getOpcode());
      
      Type type1 = aCONST_NULL0.getType(constantPoolGen0);
      assertNotNull(type1);
      assertEquals(1, constantPoolGen0.getSize());
      assertEquals("aconst_null", aCONST_NULL0.getName());
      assertEquals(1, aCONST_NULL0.getLength());
      assertEquals((short)1, aCONST_NULL0.getOpcode());
      
      typeArray0[1] = type1;
      // Undeclared exception!
      try { 
        BCELifier.printArgumentTypes(typeArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid method signature: <null object>
         //
         verifyException("org.apache.bcel.classfile.Utility", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        BCELifier.printArgumentTypes((Type[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.BCELifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        BCELifier.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.BCELifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      try { 
        BCELifier.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name null
         //
         verifyException("org.apache.bcel.util.MemorySensitiveClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Const.ACC_PUBLIC | Const.ACC_PROTECTED | Const.ACC_VOLATILE | Const.ACC_NATIVE | Const.ACC_INTERFACE";
      try { 
        BCELifier.main(stringArray0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // Exception while looking for class Const.ACC_PUBLIC | Const.ACC_PROTECTED | Const.ACC_VOLATILE | Const.ACC_NATIVE | Const.ACC_INTERFACE: org.evosuite.runtime.mock.java.lang.MockThrowable: Couldn't find: Const/ACC_PUBLIC | Const/ACC_PROTECTED | Const/ACC_VOLATILE | Const/ACC_NATIVE | Const/ACC_INTERFACE.class
         //
         verifyException("org.apache.bcel.util.MemorySensitiveClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        BCELifier.getJavaClass("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name 
         //
         verifyException("org.apache.bcel.util.MemorySensitiveClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        BCELifier.getJavaClass("    _cg.addField(field.getField());");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // Exception while looking for class     _cg.addField(field.getField());: org.evosuite.runtime.mock.java.lang.MockThrowable: Couldn't find:     _cg/addField(field/getField());.class
         //
         verifyException("org.apache.bcel.util.MemorySensitiveClassPathRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BCELifier bCELifier0 = null;
      try {
        bCELifier0 = new BCELifier((JavaClass) null, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ARETURN aRETURN0 = new ARETURN();
      assertNotNull(aRETURN0);
      assertEquals((short)176, aRETURN0.getOpcode());
      assertEquals(1, aRETURN0.getLength());
      assertEquals("areturn", aRETURN0.getName());
      
      ObjectType objectType0 = (ObjectType)aRETURN0.getType();
      assertNotNull(objectType0);
      assertEquals((short)176, aRETURN0.getOpcode());
      assertEquals(1, aRETURN0.getLength());
      assertEquals("areturn", aRETURN0.getName());
      assertEquals(1, objectType0.getSize());
      assertEquals("Ljava/lang/Object;", objectType0.getSignature());
      assertEquals("java.lang.Object", objectType0.getClassName());
      assertEquals((byte)14, objectType0.getType());
      
      String string0 = BCELifier.printType(objectType0);
      assertEquals("Type.OBJECT", string0);
      assertNotNull(string0);
      assertEquals((short)176, aRETURN0.getOpcode());
      assertEquals(1, aRETURN0.getLength());
      assertEquals("areturn", aRETURN0.getName());
      assertEquals(1, objectType0.getSize());
      assertEquals("Ljava/lang/Object;", objectType0.getSignature());
      assertEquals("java.lang.Object", objectType0.getClassName());
      assertEquals((byte)14, objectType0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BCELifier.FLAGS bCELifier_FLAGS0 = BCELifier.FLAGS.CLASS;
      String string0 = BCELifier.printFlags((-388), bCELifier_FLAGS0);
      assertEquals("Const.ACC_PROTECTED | Const.ACC_STATIC | Const.ACC_FINAL | Const.ACC_SUPER | Const.ACC_VOLATILE | Const.ACC_INTERFACE | Const.ACC_ABSTRACT | Const.ACC_STRICTFP | Const.ACC_SYNTHETIC | Const.ACC_ANNOTATION | Const.ACC_ENUM", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BCELifier.FLAGS bCELifier_FLAGS0 = BCELifier.FLAGS.METHOD;
      String string0 = BCELifier.printFlags((-2059), bCELifier_FLAGS0);
      assertEquals("Const.ACC_PUBLIC | Const.ACC_PROTECTED | Const.ACC_FINAL | Const.ACC_SYNCHRONIZED | Const.ACC_BRIDGE | Const.ACC_VARARGS | Const.ACC_NATIVE | Const.ACC_INTERFACE | Const.ACC_ABSTRACT | Const.ACC_SYNTHETIC | Const.ACC_ANNOTATION | Const.ACC_ENUM", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BCELifier.FLAGS bCELifier_FLAGS0 = BCELifier.FLAGS.CLASS;
      String string0 = BCELifier.printFlags((-601), bCELifier_FLAGS0);
      assertEquals("Const.ACC_PUBLIC | Const.ACC_PRIVATE | Const.ACC_PROTECTED | Const.ACC_SUPER | Const.ACC_TRANSIENT | Const.ACC_NATIVE | Const.ACC_ABSTRACT | Const.ACC_STRICTFP | Const.ACC_SYNTHETIC | Const.ACC_ANNOTATION | Const.ACC_ENUM", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BCELifier.FLAGS bCELifier_FLAGS0 = BCELifier.FLAGS.UNKNOWN;
      String string0 = BCELifier.printFlags(0, bCELifier_FLAGS0);
      assertEquals("0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      assertNotNull(syntheticRepository0);
      
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(javaClass0);
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isFinal());
      assertTrue(javaClass0.isClass());
      assertEquals(0, javaClass0.getMinor());
      assertEquals(33, javaClass0.getAccessFlags());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isEnum());
      assertEquals(17, javaClass0.getClassNameIndex());
      assertEquals("java.lang.Object", javaClass0.getClassName());
      assertFalse(javaClass0.isVarArgs());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isProtected());
      assertEquals(33, javaClass0.getModifiers());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertTrue(javaClass0.isPublic());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isPrivate());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(0, javaClass0.getSuperclassNameIndex());
      assertTrue(javaClass0.isSynchronized());
      assertEquals("java.lang.Object", javaClass0.getFileName());
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isAbstract());
      assertEquals("java.lang", javaClass0.getPackageName());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals("Object.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isVolatile());
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("0");
      assertNotNull(mockFileOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      assertNotNull(mockPrintStream0);
      
      BCELifier bCELifier0 = new BCELifier(javaClass0, mockPrintStream0);
      assertEquals((byte)3, JavaClass.ZIP);
      assertEquals((byte)1, JavaClass.HEAP);
      assertEquals((byte)2, JavaClass.FILE);
      assertNotNull(bCELifier0);
      assertFalse(javaClass0.isInterface());
      assertFalse(javaClass0.isFinal());
      assertTrue(javaClass0.isClass());
      assertEquals(0, javaClass0.getMinor());
      assertEquals(33, javaClass0.getAccessFlags());
      assertTrue(javaClass0.isSuper());
      assertFalse(javaClass0.isEnum());
      assertEquals(17, javaClass0.getClassNameIndex());
      assertEquals("java.lang.Object", javaClass0.getClassName());
      assertFalse(javaClass0.isVarArgs());
      assertFalse(javaClass0.isStrictfp());
      assertFalse(javaClass0.isProtected());
      assertEquals(33, javaClass0.getModifiers());
      assertFalse(javaClass0.isTransient());
      assertFalse(javaClass0.isStatic());
      assertFalse(javaClass0.isAnnotation());
      assertTrue(javaClass0.isPublic());
      assertEquals("java.lang.Object", javaClass0.getSuperclassName());
      assertEquals(52, javaClass0.getMajor());
      assertFalse(javaClass0.isPrivate());
      assertFalse(javaClass0.isSynthetic());
      assertEquals(0, javaClass0.getSuperclassNameIndex());
      assertTrue(javaClass0.isSynchronized());
      assertEquals("java.lang.Object", javaClass0.getFileName());
      assertFalse(javaClass0.isNative());
      assertFalse(javaClass0.isAbstract());
      assertEquals("java.lang", javaClass0.getPackageName());
      assertEquals((byte)2, javaClass0.getSource());
      assertEquals("Object.java", javaClass0.getSourceFileName());
      assertFalse(javaClass0.isVolatile());
      
      Method method0 = new Method();
      assertNotNull(method0);
      assertEquals(0, method0.getNameIndex());
      assertFalse(method0.isPublic());
      assertEquals(0, method0.getModifiers());
      assertFalse(method0.isInterface());
      assertFalse(method0.isAnnotation());
      assertFalse(method0.isTransient());
      assertFalse(method0.isAbstract());
      assertEquals(0, method0.getAccessFlags());
      assertFalse(method0.isStrictfp());
      assertFalse(method0.isSynthetic());
      assertFalse(method0.isEnum());
      assertFalse(method0.isSynchronized());
      assertFalse(method0.isPrivate());
      assertFalse(method0.isVarArgs());
      assertFalse(method0.isNative());
      assertFalse(method0.isStatic());
      assertFalse(method0.isProtected());
      assertFalse(method0.isVolatile());
      assertEquals(0, method0.getSignatureIndex());
      assertFalse(method0.isFinal());
      
      // Undeclared exception!
      try { 
        bCELifier0.visitMethod(method0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[5];
      BCELifier.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance(classPath0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("    _cg.addMethod(method.getMethod());");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      BCELifier bCELifier0 = new BCELifier(javaClass0, mockPrintStream0);
      // Undeclared exception!
      bCELifier0.visitJavaClass(javaClass0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("    _cg.addField(field.getField());");
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance(classPath0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BCELifier bCELifier0 = new BCELifier(javaClass0, byteArrayOutputStream0);
      bCELifier0.start();
      // Undeclared exception!
      bCELifier0.start();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("F?G$~L");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BCELifier bCELifier0 = new BCELifier(javaClass0, pipedOutputStream0);
      bCELifier0.visitJavaClass(javaClass0);
      assertEquals("InputStream.java", javaClass0.getSourceFileName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = BCELifier.printFlags((-8));
      assertEquals("Const.ACC_STATIC | Const.ACC_FINAL | Const.ACC_SYNCHRONIZED | Const.ACC_VOLATILE | Const.ACC_TRANSIENT | Const.ACC_NATIVE | Const.ACC_INTERFACE | Const.ACC_ABSTRACT | Const.ACC_STRICTFP | Const.ACC_SYNTHETIC | Const.ACC_ANNOTATION | Const.ACC_ENUM", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.apache.bcel.generic.Type$1";
      BCELifier.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
