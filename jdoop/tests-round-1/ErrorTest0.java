
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    int i7 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n");
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen0.getConstant(6);
    
    // Checks the contract:  !constant9.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant9.equals(null)", !constant9.equals(null));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i6 = constantPoolGen0.lookupFieldref("1)CONSTANT_Long[5](bytes = 2)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n7)CONSTANT_Class[7](name_index = 6)\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\n", "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    org.apache.bcel.classfile.Constant constant8 = constantPoolGen0.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant8.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant8.equals(null)", !constant8.equals(null));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addUtf8("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    org.apache.bcel.classfile.Constant constant5 = constantPoolGen1.getConstant((int)(short)1);
    
    // Checks the contract:  !constant5.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant5.equals(null)", !constant5.equals(null));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("hi!");
    int i4 = constantPoolGen0.addLong((long)(short)1);
    int i6 = constantPoolGen0.lookupLong((long)10);
    org.apache.bcel.classfile.Constant constant8 = constantPoolGen0.getConstant(1);
    
    // Checks the contract:  !constant8.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant8.equals(null)", !constant8.equals(null));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i3 = constantPoolGen0.addNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i5 = constantPoolGen0.addString("1)CONSTANT_Long[5](bytes = 10)\n2)null\n");
    org.apache.bcel.classfile.Constant constant7 = constantPoolGen0.getConstant(2);
    
    // Checks the contract:  !constant7.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant7.equals(null)", !constant7.equals(null));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    int i4 = constantPoolGen0.addClass("1)CONSTANT_Long[5](bytes = 1)\n2)null\n");
    int i8 = constantPoolGen0.lookupFieldref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Integer[3](bytes = 9)\n");
    int i10 = constantPoolGen0.lookupFloat((float)(byte)0);
    int i12 = constantPoolGen0.lookupDouble((double)(byte)1);
    org.apache.bcel.classfile.Constant constant14 = constantPoolGen0.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant14.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant14.equals(null)", !constant14.equals(null));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupDouble((double)100.0f);
    int i6 = constantPoolGen0.addMethodref("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\n", "");
    int i8 = constantPoolGen0.addClass("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    org.apache.bcel.classfile.Constant constant10 = constantPoolGen0.getConstant(4);
    
    // Checks the contract:  !constant10.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant10.equals(null)", !constant10.equals(null));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    int i4 = constantPoolGen0.addString("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n");
    int i7 = constantPoolGen0.addNameAndType("1)CONSTANT_Long[5](bytes = 1)\n2)null\n", "hi!");
    int i11 = constantPoolGen0.lookupFieldref("", "1)CONSTANT_Integer[3](bytes = 1)\n", "");
    int i15 = constantPoolGen0.addMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.Constant constant17 = constantPoolGen0.getConstant(9);
    
    // Checks the contract:  !constant17.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant17.equals(null)", !constant17.equals(null));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getConstantPool();
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen1.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    int i6 = constantPoolGen4.addInteger(7);
    int i8 = constantPoolGen4.addClass("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i10 = constantPoolGen4.addInteger(264);
    org.apache.bcel.classfile.Constant constant12 = constantPoolGen4.getConstant(256);
    
    // Checks the contract:  !constant12.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant12.equals(null)", !constant12.equals(null));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i4 = constantPoolGen0.lookupMethodref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "", "1)CONSTANT_Integer[3](bytes = 9)\n");
    int i7 = constantPoolGen0.addNameAndType("1)CONSTANT_Integer[3](bytes = 9)\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i9 = constantPoolGen0.addUtf8("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    java.lang.String str10 = constantPoolGen0.toString();
    org.apache.bcel.classfile.Constant constant12 = constantPoolGen0.getConstant((int)(short)1);
    
    // Checks the contract:  !constant12.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant12.equals(null)", !constant12.equals(null));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    org.apache.bcel.classfile.Constant constant0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] { constant0 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    int i4 = constantPoolGen2.addClass("");
    java.lang.String str5 = constantPoolGen2.toString();
    int i9 = constantPoolGen2.lookupFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n");
    int i13 = constantPoolGen2.addFieldref("1)CONSTANT_Float[4](bytes = -1.0)\n", "1)CONSTANT_Integer[3](bytes = 9)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n");
    org.apache.bcel.classfile.ConstantPool constantPool14 = constantPoolGen2.getFinalConstantPool();
    int i16 = constantPoolGen2.lookupClass("1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n3)CONSTANT_Float[4](bytes = 32.0)\n");
    org.apache.bcel.classfile.Constant constant18 = constantPoolGen2.getConstant(4);
    
    // Checks the contract:  !constant18.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant18.equals(null)", !constant18.equals(null));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.apache.bcel.classfile.Constant constant0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] { constant0 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPoolGen3.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = new org.apache.bcel.generic.ConstantPoolGen(constantPool4);
    java.lang.String str6 = constantPoolGen5.toString();
    int i8 = constantPoolGen5.addDouble((double)100.0f);
    int i12 = constantPoolGen5.addMethodref("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n", "1)CONSTANT_Long[5](bytes = 100)\n2)null\n3)CONSTANT_Float[4](bytes = 259.0)\n");
    int i16 = constantPoolGen5.addFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 11.0)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 7)\n", "1)CONSTANT_Integer[3](bytes = 1)\n", "1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Double[6](bytes = 256.0)\n4)null\n");
    org.apache.bcel.classfile.Constant constant18 = constantPoolGen5.getConstant(266);
    
    // Checks the contract:  !constant18.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant18.equals(null)", !constant18.equals(null));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addDouble((double)' ');
    int i7 = constantPoolGen1.lookupFieldref("", "hi!", "");
    int i9 = constantPoolGen1.lookupLong(1L);
    int i11 = constantPoolGen1.addClass("1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\n");
    org.apache.bcel.classfile.Constant constant13 = constantPoolGen1.getConstant(3);
    
    // Checks the contract:  !constant13.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant13.equals(null)", !constant13.equals(null));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i4 = constantPoolGen0.lookupInterfaceMethodref("", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    java.lang.String str5 = constantPoolGen0.toString();
    int i9 = constantPoolGen0.addMethodref("1)CONSTANT_Long[5](bytes = 100)\n2)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool10 = constantPoolGen0.getFinalConstantPool();
    int i14 = constantPoolGen0.addFieldref("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Float[4](bytes = 1.0)\n3)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_String[8](string_index = 1)\n");
    org.apache.bcel.classfile.Constant constant16 = constantPoolGen0.getConstant(7);
    
    // Checks the contract:  !constant16.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant16.equals(null)", !constant16.equals(null));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addDouble((double)' ');
    int i5 = constantPoolGen1.lookupDouble((double)1L);
    int i7 = constantPoolGen1.addInteger(0);
    int i11 = constantPoolGen1.lookupMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 10/0)\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\n", "");
    org.apache.bcel.classfile.Constant constant13 = constantPoolGen1.getConstant(1);
    
    // Checks the contract:  !constant13.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant13.equals(null)", !constant13.equals(null));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    int i7 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n");
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen0.getConstant(3);
    
    // Checks the contract:  !constant9.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant9.equals(null)", !constant9.equals(null));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i4 = constantPoolGen0.addInterfaceMethodref("", "", "");
    int i6 = constantPoolGen0.lookupDouble((double)(byte)-1);
    int i10 = constantPoolGen0.addInterfaceMethodref("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Float[4](bytes = 1.0)\n3)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n\")\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n");
    org.apache.bcel.classfile.Constant constant12 = constantPoolGen0.getConstant((int)(short)1);
    
    // Checks the contract:  !constant12.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant12.equals(null)", !constant12.equals(null));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addInteger((int)(byte)1);
    int i5 = constantPoolGen1.lookupString("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n");
    int i7 = constantPoolGen1.lookupDouble((double)261);
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen1.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant9.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant9.equals(null)", !constant9.equals(null));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getConstantPool();
    int i5 = constantPoolGen0.addInteger(257);
    int i7 = constantPoolGen0.lookupDouble((double)10.0f);
    int i9 = constantPoolGen0.lookupUtf8("1)CONSTANT_Integer[3](bytes = 9)\n");
    org.apache.bcel.classfile.Constant constant11 = null;
    constantPoolGen0.setConstant((int)(short)10, constant11);
    org.apache.bcel.classfile.ConstantPool constantPool13 = constantPoolGen0.getFinalConstantPool();
    int i17 = constantPoolGen0.addMethodref("", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n", "1)CONSTANT_Integer[3](bytes = 35)\n2)CONSTANT_Utf8[1](\"\")\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_NameAndType[12](name_index = 2, signature_index = 3)\n");
    org.apache.bcel.classfile.Constant constant19 = constantPoolGen0.getConstant(3);
    
    // Checks the contract:  !constant19.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant19.equals(null)", !constant19.equals(null));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    org.apache.bcel.classfile.Constant constant0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] { constant0 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPoolGen3.getConstantPool();
    int i6 = constantPoolGen3.addString("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i8 = constantPoolGen3.lookupUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n");
    int i10 = constantPoolGen3.addInteger((int)(byte)10);
    int i12 = constantPoolGen3.addUtf8("1)CONSTANT_Integer[3](bytes = 0)\n2)CONSTANT_Long[5](bytes = 97)\n3)null\n");
    org.apache.bcel.classfile.Constant constant14 = constantPoolGen3.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant14.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant14.equals(null)", !constant14.equals(null));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addFloat((float)0L);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPoolGen1.getConstantPool();
    int i6 = constantPoolGen1.lookupClass("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n");
    org.apache.bcel.classfile.Constant constant8 = constantPoolGen1.getConstant(1);
    
    // Checks the contract:  !constant8.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant8.equals(null)", !constant8.equals(null));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getConstantPool();
    int i5 = constantPoolGen0.addInteger(2);
    int i7 = constantPoolGen0.addDouble((double)257);
    org.apache.bcel.classfile.ConstantPool constantPool8 = constantPoolGen0.getFinalConstantPool();
    int i10 = constantPoolGen0.addInteger((int)'#');
    int i12 = constantPoolGen0.addInteger(9);
    int i16 = constantPoolGen0.addFieldref("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Integer[3](bytes = 0)\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n", "1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\n3)CONSTANT_String[8](string_index = 2)\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n");
    org.apache.bcel.classfile.Constant constant18 = constantPoolGen0.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant18.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant18.equals(null)", !constant18.equals(null));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addString("");
    int i4 = constantPoolGen0.addString("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n7)CONSTANT_Double[6](bytes = -1.0)\n8)null\n");
    int i8 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n");
    org.apache.bcel.classfile.Constant constant10 = constantPoolGen0.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant10.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant10.equals(null)", !constant10.equals(null));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    java.lang.String str3 = constantPoolGen0.toString();
    int i5 = constantPoolGen0.lookupInteger((int)(short)1);
    int i8 = constantPoolGen0.lookupNameAndType("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n");
    int i12 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n2)CONSTANT_Long[5](bytes = 9)\\n3)null\\n4)CONSTANT_Long[5](bytes = 0)\\n5)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n", "", "1)CONSTANT_Long[5](bytes = 10)\n2)null\n");
    org.apache.bcel.classfile.Constant constant14 = constantPoolGen0.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant14.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant14.equals(null)", !constant14.equals(null));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("hi!");
    int i5 = constantPoolGen0.addNameAndType("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n", "1)CONSTANT_Integer[3](bytes = 9)\n");
    int i7 = constantPoolGen0.addInteger((int)(byte)-1);
    int i11 = constantPoolGen0.lookupMethodref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Class[7](name_index = 3)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool12 = constantPoolGen0.getConstantPool();
    org.apache.bcel.classfile.Constant constant14 = constantPoolGen0.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant14.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant14.equals(null)", !constant14.equals(null));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i5 = constantPoolGen0.addMethodref("1)CONSTANT_Long[5](bytes = 1)\n2)null\n", "1)CONSTANT_Integer[3](bytes = 9)\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n");
    int i7 = constantPoolGen0.addFloat((float)'4');
    int i9 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i11 = constantPoolGen0.lookupString("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Integer[3](bytes = 0)\n4)CONSTANT_Integer[3](bytes = 256)\n");
    org.apache.bcel.classfile.Constant constant13 = constantPoolGen0.getConstant(6);
    
    // Checks the contract:  !constant13.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant13.equals(null)", !constant13.equals(null));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("hi!");
    int i4 = constantPoolGen0.lookupLong((long)(short)1);
    int i6 = constantPoolGen0.addClass("1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n3)CONSTANT_Float[4](bytes = 32.0)\n");
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPoolGen0.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen8 = new org.apache.bcel.generic.ConstantPoolGen(constantPool7);
    int i12 = constantPoolGen8.addFieldref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n", "", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n7)CONSTANT_Double[6](bytes = -1.0)\n8)null\n");
    org.apache.bcel.classfile.Constant constant14 = constantPoolGen8.getConstant(260);
    
    // Checks the contract:  !constant14.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant14.equals(null)", !constant14.equals(null));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    org.apache.bcel.classfile.Constant constant0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] { constant0 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    int i4 = constantPoolGen2.addClass("");
    int i8 = constantPoolGen2.addMethodref("1)CONSTANT_Integer[3](bytes = 9)\n", "1)CONSTANT_Long[5](bytes = 100)\n2)null\n", "hi!");
    int i9 = constantPoolGen2.getSize();
    int i12 = constantPoolGen2.addNameAndType("", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\\n7)CONSTANT_Double[6](bytes = -1.0)\\n8)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n");
    int i14 = constantPoolGen2.lookupString("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n3)CONSTANT_Integer[3](bytes = 257)\n");
    org.apache.bcel.classfile.Constant constant16 = constantPoolGen2.getConstant(5);
    
    // Checks the contract:  !constant16.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant16.equals(null)", !constant16.equals(null));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addInteger((int)(byte)1);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPoolGen1.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = new org.apache.bcel.generic.ConstantPoolGen(constantPool4);
    int i8 = constantPoolGen5.addNameAndType("1)CONSTANT_Integer[3](bytes = 9)\n", "");
    int i10 = constantPoolGen5.lookupClass("1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\n3)CONSTANT_String[8](string_index = 2)\n");
    org.apache.bcel.classfile.Constant constant12 = constantPoolGen5.getConstant((int)(byte)1);
    
    // Checks the contract:  !constant12.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant12.equals(null)", !constant12.equals(null));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    int i5 = constantPoolGen0.addUtf8("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n");
    int i7 = constantPoolGen0.addDouble((double)0.0f);
    org.apache.bcel.classfile.Constant constant9 = null;
    constantPoolGen0.setConstant((int)(byte)0, constant9);
    int i12 = constantPoolGen0.addFloat((float)262);
    int i14 = constantPoolGen0.addString("");
    int i16 = constantPoolGen0.addFloat((float)(byte)10);
    int i20 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n", "", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    org.apache.bcel.classfile.Constant constant22 = constantPoolGen0.getConstant((int)(short)10);
    
    // Checks the contract:  !constant22.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant22.equals(null)", !constant22.equals(null));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupLong((long)10);
    int i5 = constantPoolGen1.addDouble((double)10L);
    int i7 = constantPoolGen1.lookupClass("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n");
    int i10 = constantPoolGen1.lookupNameAndType("1)CONSTANT_Long[5](bytes = 2)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n7)CONSTANT_Class[7](name_index = 6)\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n");
    int i13 = constantPoolGen1.addNameAndType("1)CONSTANT_Integer[3](bytes = 32)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    int i17 = constantPoolGen1.lookupFieldref("1)CONSTANT_Long[5](bytes = 2)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n7)CONSTANT_Class[7](name_index = 6)\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\n", "1)CONSTANT_Long[5](bytes = 10)\n2)null\n", "1)CONSTANT_Float[4](bytes = 0.0)\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n");
    org.apache.bcel.classfile.Constant constant19 = constantPoolGen1.getConstant(3);
    
    // Checks the contract:  !constant19.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant19.equals(null)", !constant19.equals(null));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addUtf8("");
    int i6 = constantPoolGen1.addNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Integer[3](bytes = 35)\n");
    int i8 = constantPoolGen1.addInteger(9);
    org.apache.bcel.classfile.Constant constant10 = constantPoolGen1.getConstant(3);
    
    // Checks the contract:  !constant10.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant10.equals(null)", !constant10.equals(null));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i3 = constantPoolGen0.addString("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i5 = constantPoolGen0.addString("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n");
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen0.getConstantPool();
    java.lang.String str7 = constantPoolGen0.toString();
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen0.getConstant(3);
    
    // Checks the contract:  !constant9.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant9.equals(null)", !constant9.equals(null));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    int i5 = constantPoolGen0.addNameAndType("", "hi!");
    int i7 = constantPoolGen0.lookupDouble((double)(-1L));
    int i11 = constantPoolGen0.addFieldref("1)CONSTANT_Integer[3](bytes = -1)\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n", "hi!");
    int i13 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    org.apache.bcel.classfile.Constant constant15 = constantPoolGen0.getConstant(6);
    
    // Checks the contract:  !constant15.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant15.equals(null)", !constant15.equals(null));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i4 = constantPoolGen0.lookupNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "hi!");
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen0.getFinalConstantPool();
    int i9 = constantPoolGen0.lookupMethodref("", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\n");
    int i11 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n");
    org.apache.bcel.classfile.ConstantPool constantPool12 = constantPoolGen0.getFinalConstantPool();
    int i16 = constantPoolGen0.addMethodref("1)CONSTANT_Integer[3](bytes = 32)\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Class[7](name_index = 3)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n");
    org.apache.bcel.classfile.Constant constant18 = constantPoolGen0.getConstant((int)(short)1);
    
    // Checks the contract:  !constant18.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant18.equals(null)", !constant18.equals(null));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    int i4 = constantPoolGen0.lookupInteger(256);
    int i6 = constantPoolGen0.addLong((long)264);
    org.apache.bcel.classfile.Constant constant8 = constantPoolGen0.getConstant(3);
    
    // Checks the contract:  !constant8.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !constant8.equals(null)", !constant8.equals(null));

  }

}
