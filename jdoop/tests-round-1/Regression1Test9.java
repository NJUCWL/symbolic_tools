
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression1Test9 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test01"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addFloat((float)0L);
    int i5 = constantPoolGen1.addDouble(1.0d);
    int i7 = constantPoolGen1.lookupInteger((int)(short)-1);
    int i9 = constantPoolGen1.addDouble((double)257);
    int i13 = constantPoolGen1.addMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Float[4](bytes = -1.0)\n", "1)CONSTANT_Float[4](bytes = 0.0)\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Float[4](bytes = 0.0)\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n");
    int i15 = constantPoolGen1.lookupFloat((float)23);
    org.apache.bcel.classfile.Constant constant16 = null;
    org.apache.bcel.classfile.Constant[] constant_array17 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen18 = new org.apache.bcel.generic.ConstantPoolGen(constant_array17);
    org.apache.bcel.classfile.Constant constant20 = constantPoolGen18.getConstant(0);
    int i22 = constantPoolGen18.addDouble(1.0d);
    org.apache.bcel.classfile.ConstantPool constantPool23 = constantPoolGen18.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen24 = new org.apache.bcel.generic.ConstantPoolGen(constantPool23);
    int i26 = constantPoolGen24.addDouble(0.0d);
    // The following exception was thrown during execution in test generation
    try {
    int i27 = constantPoolGen1.addConstant(constant16, constantPoolGen24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 256);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test02"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i4 = constantPoolGen0.addFieldref("", "", "hi!");
    int i6 = constantPoolGen0.lookupDouble((double)' ');
    java.lang.String str7 = constantPoolGen0.toString();
    java.lang.String str8 = constantPoolGen0.toString();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.bcel.classfile.Constant constant10 = constantPoolGen0.getConstant((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n"+ "'", str7.equals("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n"+ "'", str8.equals("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test03"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i3 = constantPoolGen0.addString("");
    org.apache.bcel.classfile.Constant constant5 = constantPoolGen0.getConstant(0);
    int i7 = constantPoolGen0.lookupDouble((double)2);
    int i9 = constantPoolGen0.lookupString("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n");
    java.lang.String str10 = constantPoolGen0.toString();
    int i12 = constantPoolGen0.lookupString("1)CONSTANT_Integer[3](bytes = 257)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_String[8](string_index = 1)\n"+ "'", str10.equals("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_String[8](string_index = 1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test04"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i3 = constantPoolGen0.addFloat(10.0f);
    int i6 = constantPoolGen0.lookupNameAndType("", "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n");
    int i10 = constantPoolGen0.lookupMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n2)CONSTANT_Utf8[1](\"\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n5)CONSTANT_Class[7](name_index = 4)\n6)CONSTANT_Methodref[10](class_index = 5, name_and_type_index = 3)\n7)CONSTANT_Double[6](bytes = 0.0)\n8)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n");
    int i14 = constantPoolGen0.lookupFieldref("1)CONSTANT_Integer[3](bytes = 9)\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 10/0)\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\\n\")\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\n");
    int i16 = constantPoolGen0.addFloat((float)18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test05"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    java.lang.String str2 = constantPoolGen1.toString();
    int i4 = constantPoolGen1.lookupLong((long)257);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen1.getFinalConstantPool();
    int i7 = constantPoolGen1.lookupLong((long)12);
    org.apache.bcel.classfile.Constant constant9 = null;
    // The following exception was thrown during execution in test generation
    try {
    constantPoolGen1.setConstant((int)(byte)-1, constant9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test06"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.Constant constant4 = constantPoolGen0.getConstant(7);
    int i8 = constantPoolGen0.lookupMethodref("1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n");
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPoolGen0.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen10 = new org.apache.bcel.generic.ConstantPoolGen(constantPool9);
    int i12 = constantPoolGen10.lookupDouble(0.0d);
    int i14 = constantPoolGen10.lookupInteger((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test07"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getConstantPool();
    int i4 = constantPoolGen1.addDouble((double)1);
    int i6 = constantPoolGen1.lookupFloat(100.0f);
    int i8 = constantPoolGen1.lookupLong((long)1);
    org.apache.bcel.classfile.Constant constant10 = null;
    constantPoolGen1.setConstant((int)(short)0, constant10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test08"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i4 = constantPoolGen0.lookupDouble((double)1.0f);
    int i6 = constantPoolGen0.addFloat(0.0f);
    int i10 = constantPoolGen0.lookupFieldref("1)CONSTANT_Long[5](bytes = 100)\n2)null\n", "1)CONSTANT_Long[5](bytes = 10)\n2)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    int i12 = constantPoolGen0.lookupClass("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    org.apache.bcel.generic.MethodGen methodGen13 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i14 = constantPoolGen0.addInterfaceMethodref(methodGen13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test09"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getConstantPool();
    int i5 = constantPoolGen0.addInteger(257);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen0.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = new org.apache.bcel.generic.ConstantPoolGen(constantPool6);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen8 = new org.apache.bcel.generic.ConstantPoolGen(constantPool6);
    org.apache.bcel.classfile.Constant constant10 = null;
    constantPoolGen8.setConstant(18, constant10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test10"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addFloat((float)0L);
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPoolGen1.getConstantPool();
    int i6 = constantPoolGen1.lookupInteger((int)' ');
    int i8 = constantPoolGen1.addInteger(9);
    int i9 = constantPoolGen1.getSize();
    int i11 = constantPoolGen1.addClass("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 11.0)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 7)\n");
    int i13 = constantPoolGen1.addUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n");
    java.lang.String str14 = constantPoolGen1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Integer[3](bytes = 9)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_String[8](string_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1/0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 11/0)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 7)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n2)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n\")\n"+ "'", str14.equals("1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Integer[3](bytes = 9)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_String[8](string_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1/0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 11/0)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 7)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n2)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n\")\n"));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test11"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i3 = constantPoolGen0.addFloat(10.0f);
    int i5 = constantPoolGen0.addFloat((float)(byte)1);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen0.getFinalConstantPool();
    int i8 = constantPoolGen0.addDouble((double)0L);
    int i10 = constantPoolGen0.lookupInteger(9);
    int i12 = constantPoolGen0.lookupFloat(100.0f);
    int i14 = constantPoolGen0.addInteger(8);
    org.apache.bcel.classfile.Constant constant16 = null;
    constantPoolGen0.setConstant(22, constant16);
    int i18 = constantPoolGen0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test12"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    int i6 = constantPoolGen0.lookupFieldref("", "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n", "hi!");
    int i8 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    int i12 = constantPoolGen0.lookupMethodref("1)CONSTANT_Integer[3](bytes = 1)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n4)CONSTANT_Utf8[1](\"\")\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_NameAndType[12](name_index = 4, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 3, name_and_type_index = 6)\n8)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n9)CONSTANT_Class[7](name_index = 8)\n10)CONSTANT_NameAndType[12](name_index = 8, signature_index = 2)\n11)CONSTANT_InterfaceMethodref[11](class_index = 9, name_and_type_index = 10)\n", "1)CONSTANT_Integer[3](bytes = 9)\n", "");
    org.apache.bcel.classfile.Constant constant14 = null;
    constantPoolGen0.setConstant(18, constant14);
    int i19 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Long[5](bytes = 2)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Integer[3](bytes = 0)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\\n\")\n4)CONSTANT_Float[4](bytes = 32.0)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n\")\n", "1)null\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n2)CONSTANT_Utf8[1](\"\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n3)CONSTANT_String[8](string_index = 2)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\\n5)CONSTANT_String[8](string_index = 4)\\n\")\n4)CONSTANT_NameAndType[12](name_index = 2, signature_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_Class[7](name_index = 5)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 4)\n");
    org.apache.bcel.classfile.ConstantPool constantPool20 = constantPoolGen0.getFinalConstantPool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool20);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test13"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.Constant constant3 = null;
    constantPoolGen1.setConstant((int)(byte)0, constant3);
    java.lang.String str5 = constantPoolGen1.toString();
    int i7 = constantPoolGen1.addInteger(7);
    int i9 = constantPoolGen1.lookupString("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test14"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i4 = constantPoolGen0.lookupDouble((double)1.0f);
    int i6 = constantPoolGen0.addFloat(0.0f);
    int i8 = constantPoolGen0.addLong((long)(byte)10);
    int i10 = constantPoolGen0.addString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    int i12 = constantPoolGen0.addFloat((float)12);
    int i15 = constantPoolGen0.lookupNameAndType("1)CONSTANT_Float[4](bytes = -1.0)\n", "1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Class[7](name_index = 3)\n");
    int i19 = constantPoolGen0.lookupMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 10/0)\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Class[7](name_index = 2)\\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n2)CONSTANT_Double[6](bytes = 0.0)\n3)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n2)CONSTANT_Float[4](bytes = 0.0)\\n3)CONSTANT_Integer[3](bytes = 52)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n4)CONSTANT_Long[5](bytes = 8)\\n5)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test15"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupLong((long)10);
    int i5 = constantPoolGen1.lookupClass("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    org.apache.bcel.classfile.Constant constant7 = null;
    constantPoolGen1.setConstant(4, constant7);
    int i10 = constantPoolGen1.lookupLong((long)'a');
    int i14 = constantPoolGen1.addFieldref("1)CONSTANT_Integer[3](bytes = 32)\n2)CONSTANT_Integer[3](bytes = 264)\n", "1)CONSTANT_Integer[3](bytes = 32)\n2)CONSTANT_Double[6](bytes = 97.0)\n3)null\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n5)CONSTANT_String[8](string_index = 4)\n", "1)CONSTANT_Integer[3](bytes = 32)\n2)CONSTANT_Integer[3](bytes = 264)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test16"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i4 = constantPoolGen1.lookupNameAndType("", "");
    int i6 = constantPoolGen1.lookupInteger((int)' ');
    int i8 = constantPoolGen1.addDouble((double)10.0f);
    int i10 = constantPoolGen1.addFloat((float)' ');
    int i14 = constantPoolGen1.lookupFieldref("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n", "1)CONSTANT_Integer[3](bytes = 9)\n", "1)CONSTANT_Integer[3](bytes = 9)\n");
    java.lang.String str15 = constantPoolGen1.toString();
    int i17 = constantPoolGen1.lookupFloat((float)10L);
    int i19 = constantPoolGen1.addLong((long)'#');
    int i21 = constantPoolGen1.lookupFloat((float)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n3)CONSTANT_Float[4](bytes = 32.0)\n"+ "'", str15.equals("1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n3)CONSTANT_Float[4](bytes = 32.0)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test17"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupLong((long)261);
    org.apache.bcel.classfile.Constant constant5 = null;
    constantPoolGen1.setConstant(6, constant5);
    int i8 = constantPoolGen1.addString("1)CONSTANT_Integer[3](bytes = -1)\n");
    int i10 = constantPoolGen1.lookupString("1)CONSTANT_Integer[3](bytes = 9)\n");
    int i11 = constantPoolGen1.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test18"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getConstantPool();
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen1.getConstantPool();
    int i5 = constantPoolGen1.lookupUtf8("hi!");
    int i7 = constantPoolGen1.lookupFloat((float)(short)100);
    int i9 = constantPoolGen1.lookupString("1)CONSTANT_Integer[3](bytes = 32)\n");
    int i11 = constantPoolGen1.addFloat(0.0f);
    int i13 = constantPoolGen1.lookupLong((long)11);
    int i15 = constantPoolGen1.addFloat(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test19"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    int i5 = constantPoolGen0.addNameAndType("1)CONSTANT_Integer[3](bytes = 1)\n", "1)CONSTANT_Integer[3](bytes = 1)\n");
    int i7 = constantPoolGen0.addClass("1)CONSTANT_Integer[3](bytes = 32)\n");
    int i8 = constantPoolGen0.getSize();
    int i10 = constantPoolGen0.addUtf8("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n");
    int i12 = constantPoolGen0.addString("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n\")\n4)CONSTANT_String[8](string_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_NameAndType[12](name_index = 5, signature_index = 1)\n7)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\\n2)CONSTANT_String[8](string_index = 1)\\n\")\n8)CONSTANT_String[8](string_index = 7)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test20"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    java.lang.String str2 = constantPoolGen0.toString();
    int i4 = constantPoolGen0.lookupDouble(0.0d);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen0.getConstantPool();
    int i7 = constantPoolGen0.lookupLong((long)(short)10);
    int i9 = constantPoolGen0.addInteger(0);
    int i12 = constantPoolGen0.addNameAndType("1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Double[6](bytes = 8.0)\n257)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Integer[3](bytes = 0)\n4)CONSTANT_Integer[3](bytes = 256)\n");
    org.apache.bcel.classfile.Constant constant14 = constantPoolGen0.getConstant(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant14);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test21"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i3 = constantPoolGen0.addString("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i5 = constantPoolGen0.lookupDouble(1.0d);
    org.apache.bcel.classfile.Constant constant7 = constantPoolGen0.getConstant(9);
    org.apache.bcel.classfile.ConstantPool constantPool8 = constantPoolGen0.getConstantPool();
    org.apache.bcel.classfile.Constant constant9 = null;
    org.apache.bcel.classfile.Constant[] constant_array10 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen11 = new org.apache.bcel.generic.ConstantPoolGen(constant_array10);
    int i13 = constantPoolGen11.addDouble((double)' ');
    org.apache.bcel.classfile.ConstantPool constantPool14 = constantPoolGen11.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen15 = new org.apache.bcel.generic.ConstantPoolGen(constantPool14);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen16 = new org.apache.bcel.generic.ConstantPoolGen(constantPool14);
    int i18 = constantPoolGen16.lookupDouble((double)257);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = constantPoolGen0.addConstant(constant9, constantPoolGen16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test22"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    java.lang.String str3 = constantPoolGen0.toString();
    int i5 = constantPoolGen0.addInteger(18);
    int i7 = constantPoolGen0.lookupLong((long)257);
    int i11 = constantPoolGen0.addFieldref("", "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    int i13 = constantPoolGen0.lookupString("1)CONSTANT_Utf8[1](\"\")\n");
    org.apache.bcel.classfile.Constant constant15 = null;
    // The following exception was thrown during execution in test generation
    try {
    constantPoolGen0.setConstant(268, constant15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n"+ "'", str3.equals("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test23"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i3 = constantPoolGen0.addFloat(10.0f);
    int i5 = constantPoolGen0.addInteger(0);
    int i7 = constantPoolGen0.addClass("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\n");
    int i9 = constantPoolGen0.lookupInteger(257);
    org.apache.bcel.classfile.ConstantPool constantPool10 = constantPoolGen0.getConstantPool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test24"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    java.lang.String str1 = constantPoolGen0.toString();
    int i3 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 10)\n2)null\n");
    int i5 = constantPoolGen0.lookupInteger(15);
    org.apache.bcel.classfile.Constant constant6 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = new org.apache.bcel.generic.ConstantPoolGen();
    int i9 = constantPoolGen7.addInteger((int)'#');
    int i13 = constantPoolGen7.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i17 = constantPoolGen7.lookupInterfaceMethodref("1)CONSTANT_Long[5](bytes = 1)\n2)null\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n");
    // The following exception was thrown during execution in test generation
    try {
    int i18 = constantPoolGen0.addConstant(constant6, constantPoolGen7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test25"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupLong((long)10);
    int i5 = constantPoolGen1.addInteger((-1));
    java.lang.String str6 = constantPoolGen1.toString();
    int i10 = constantPoolGen1.lookupFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = -1/0)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n", "1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Integer[3](bytes = 35)\\n3)CONSTANT_Integer[3](bytes = 0)\\n\")\n4)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n");
    java.lang.String str11 = constantPoolGen1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1)CONSTANT_Integer[3](bytes = -1)\n"+ "'", str6.equals("1)CONSTANT_Integer[3](bytes = -1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1)CONSTANT_Integer[3](bytes = -1)\n"+ "'", str11.equals("1)CONSTANT_Integer[3](bytes = -1)\n"));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test26"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i5 = constantPoolGen0.addNameAndType("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Double[6](bytes = 100.0)\n3)null\n", "1)CONSTANT_Integer[3](bytes = 1)\n2)CONSTANT_Long[5](bytes = 9)\n3)null\n4)CONSTANT_Long[5](bytes = 0)\n5)null\n");
    int i9 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = -1.0)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n", "1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Double[6](bytes = 262.0)\n5)null\n");
    int i11 = constantPoolGen0.lookupClass("1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"\")\n257)CONSTANT_String[8](string_index = 256)\n258)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n\")\n259)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n260)CONSTANT_NameAndType[12](name_index = 258, signature_index = 259)\n261)CONSTANT_Float[4](bytes = 97.0)\n");
    org.apache.bcel.generic.MethodGen methodGen12 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i13 = constantPoolGen0.lookupMethodref(methodGen12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test27"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    int i5 = constantPoolGen0.addUtf8("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n");
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen0.getFinalConstantPool();
    int i8 = constantPoolGen0.addFloat((float)261);
    int i10 = constantPoolGen0.lookupDouble((double)18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test28"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    java.lang.String str1 = constantPoolGen0.toString();
    int i3 = constantPoolGen0.lookupLong(0L);
    int i5 = constantPoolGen0.lookupLong((long)1);
    int i7 = constantPoolGen0.lookupClass("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test29"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i5 = constantPoolGen1.addInterfaceMethodref("", "hi!", "hi!");
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen1.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = new org.apache.bcel.generic.ConstantPoolGen(constantPool6);
    int i9 = constantPoolGen7.addClass("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 257);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test30"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i4 = constantPoolGen0.lookupMethodref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "", "1)CONSTANT_Integer[3](bytes = 9)\n");
    int i6 = constantPoolGen0.addUtf8("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    int i8 = constantPoolGen0.addInteger(264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test31"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constantPool2);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool2);
    int i6 = constantPoolGen4.addLong((long)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 256);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test32"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addFloat((float)(-1L));
    int i4 = constantPoolGen0.addDouble((double)(-1.0f));
    int i6 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 3, signature_index = 3)\n5)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 4)\n6)CONSTANT_Long[5](bytes = 97)\n7)null\n8)CONSTANT_Float[4](bytes = -1.0)\n9)CONSTANT_Float[4](bytes = 0.0)\n10)CONSTANT_Long[5](bytes = 35)\n11)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test33"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i3 = constantPoolGen0.addFloat(10.0f);
    int i5 = constantPoolGen0.addClass("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    java.lang.String str6 = constantPoolGen0.toString();
    java.lang.String str7 = constantPoolGen0.toString();
    int i9 = constantPoolGen0.addLong((long)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n"+ "'", str6.equals("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n"+ "'", str7.equals("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test34"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getFinalConstantPool();
    int i4 = constantPoolGen1.lookupLong((long)(byte)0);
    int i6 = constantPoolGen1.lookupFloat((float)(byte)10);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPoolGen1.getFinalConstantPool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test35"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger((int)' ');
    org.apache.bcel.classfile.Constant constant4 = null;
    constantPoolGen0.setConstant(3, constant4);
    int i9 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n", "1)CONSTANT_Integer[3](bytes = 1)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i11 = constantPoolGen0.addLong((long)(byte)-1);
    int i12 = constantPoolGen0.getSize();
    int i14 = constantPoolGen0.addClass("hi!");
    int i16 = constantPoolGen0.lookupLong(0L);
    org.apache.bcel.classfile.ConstantPool constantPool17 = constantPoolGen0.getFinalConstantPool();
    int i19 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n3)CONSTANT_Float[4](bytes = 0.0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test36"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i4 = constantPoolGen0.lookupDouble((double)1.0f);
    int i6 = constantPoolGen0.addFloat(0.0f);
    int i10 = constantPoolGen0.lookupFieldref("1)CONSTANT_Long[5](bytes = 100)\n2)null\n", "1)CONSTANT_Long[5](bytes = 10)\n2)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n");
    int i12 = constantPoolGen0.lookupClass("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    int i16 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n3)CONSTANT_Float[4](bytes = 32.0)\n", "1)CONSTANT_Integer[3](bytes = 35)\n");
    int i18 = constantPoolGen0.lookupUtf8("1)null\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n2)CONSTANT_Utf8[1](\"\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n3)CONSTANT_String[8](string_index = 2)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\\n5)CONSTANT_String[8](string_index = 4)\\n\")\n4)CONSTANT_NameAndType[12](name_index = 2, signature_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_Class[7](name_index = 5)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 4)\n");
    int i20 = constantPoolGen0.lookupClass("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n");
    int i24 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Integer[3](bytes = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"\")\n257)CONSTANT_String[8](string_index = 256)\n258)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\n259)CONSTANT_Class[7](name_index = 258)\n260)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n261)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n\")\n262)CONSTANT_NameAndType[12](name_index = 260, signature_index = 261)\n263)CONSTANT_Fieldref[9](class_index = 259, name_and_type_index = 262)\n");
    org.apache.bcel.classfile.Constant constant26 = constantPoolGen0.getConstant(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant26);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test37"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i4 = constantPoolGen0.lookupDouble((double)100.0f);
    int i6 = constantPoolGen0.lookupFloat(0.0f);
    int i10 = constantPoolGen0.lookupInterfaceMethodref("1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Double[6](bytes = 8.0)\n257)null\n", "1)CONSTANT_Long[5](bytes = -1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Integer[3](bytes = 35)\\n3)CONSTANT_Integer[3](bytes = 0)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Double[6](bytes = 100.0)\n3)null\n");
    int i14 = constantPoolGen0.lookupFieldref("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Double[6](bytes = 8.0)\n257)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n2)CONSTANT_Utf8[1](\"\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n5)CONSTANT_Class[7](name_index = 4)\n6)CONSTANT_Methodref[10](class_index = 5, name_and_type_index = 3)\n7)CONSTANT_Double[6](bytes = 0.0)\n8)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test38"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupDouble((double)100.0f);
    int i4 = constantPoolGen0.addDouble((double)263);
    int i6 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n2)CONSTANT_Integer[3](bytes = 35)\n3)CONSTANT_Integer[3](bytes = 0)\n");
    int i10 = constantPoolGen0.addFieldref("1)CONSTANT_Integer[3](bytes = 0)\n2)CONSTANT_Long[5](bytes = 97)\n3)null\n", "1)CONSTANT_Float[4](bytes = 100.0)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 8);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test39"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getConstantPool();
    int i7 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\\n7)CONSTANT_Double[6](bytes = -1.0)\\n8)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n");
    int i9 = constantPoolGen0.lookupClass("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    int i11 = constantPoolGen0.lookupInteger((int)(short)100);
    java.lang.String str12 = constantPoolGen0.toString();
    java.lang.String str13 = constantPoolGen0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n"+ "'", str12.equals("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n"+ "'", str13.equals("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test40"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    java.lang.String str2 = constantPoolGen1.toString();
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen1.getConstantPool();
    int i5 = constantPoolGen1.addFloat((float)(short)100);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen1.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = new org.apache.bcel.generic.ConstantPoolGen(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test41"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupLong((long)10);
    int i5 = constantPoolGen1.addInteger((-1));
    java.lang.String str6 = constantPoolGen1.toString();
    int i10 = constantPoolGen1.lookupInterfaceMethodref("1)CONSTANT_Long[5](bytes = 100)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n", "1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Float[4](bytes = 1.0)\n3)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\n");
    int i14 = constantPoolGen1.lookupMethodref("1)CONSTANT_Long[5](bytes = 2)\n2)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Float[4](bytes = -1.0)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 3, signature_index = 3)\n5)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 4)\n6)CONSTANT_Long[5](bytes = 97)\n7)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1)CONSTANT_Integer[3](bytes = -1)\n"+ "'", str6.equals("1)CONSTANT_Integer[3](bytes = -1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test42"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i3 = constantPoolGen0.addUtf8("1)CONSTANT_Double[6](bytes = 10.0)\n2)null\n");
    int i7 = constantPoolGen0.lookupFieldref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Integer[3](bytes = 10)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n\")\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"hi!\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n");
    int i9 = constantPoolGen0.lookupUtf8("1)null\n2)null\n3)CONSTANT_Double[6](bytes = 10.0)\n4)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test43"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("hi!");
    int i6 = constantPoolGen0.lookupMethodref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n", "", "hi!");
    int i8 = constantPoolGen0.addFloat((float)(byte)-1);
    int i10 = constantPoolGen0.lookupClass("1)CONSTANT_Float[4](bytes = -1.0)\n");
    int i14 = constantPoolGen0.addMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n3)CONSTANT_String[8](string_index = 2)\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\n5)CONSTANT_String[8](string_index = 4)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n");
    int i16 = constantPoolGen0.lookupLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test44"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger((int)' ');
    int i4 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n");
    int i8 = constantPoolGen0.addFieldref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1/0)\\n2)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n2)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_String[8](string_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n9)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n10)CONSTANT_Class[7](name_index = 9)\n11)CONSTANT_Utf8[1](\"\")\n12)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n13)CONSTANT_NameAndType[12](name_index = 11, signature_index = 12)\n14)CONSTANT_InterfaceMethodref[11](class_index = 10, name_and_type_index = 13)\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "");
    int i10 = constantPoolGen0.addString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n3)CONSTANT_Float[4](bytes = 0.0)\n");
    int i12 = constantPoolGen0.addLong((long)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test45"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addClass("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_String[8](string_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n");
    org.apache.bcel.classfile.ConstantPool constantPool4 = constantPoolGen1.getFinalConstantPool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool4);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test46"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    java.lang.String str3 = constantPoolGen0.toString();
    java.lang.String str4 = constantPoolGen0.toString();
    int i6 = constantPoolGen0.addUtf8("");
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPoolGen0.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen8 = new org.apache.bcel.generic.ConstantPoolGen(constantPool7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n"+ "'", str3.equals("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n"+ "'", str4.equals("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test47"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger(9);
    int i4 = constantPoolGen0.lookupDouble((double)100.0f);
    java.lang.String str5 = constantPoolGen0.toString();
    int i7 = constantPoolGen0.addFloat((float)1L);
    java.lang.String str8 = constantPoolGen0.toString();
    int i12 = constantPoolGen0.addMethodref("1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Float[4](bytes = 0.0)\n3)CONSTANT_Long[5](bytes = 0)\n4)null\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n6)CONSTANT_Class[7](name_index = 5)\n7)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\n8)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\n9)CONSTANT_NameAndType[12](name_index = 7, signature_index = 8)\n10)CONSTANT_InterfaceMethodref[11](class_index = 6, name_and_type_index = 9)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\\n7)CONSTANT_Double[6](bytes = -1/0)\\n8)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n", "1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Double[6](bytes = 5.0)\n257)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1)CONSTANT_Integer[3](bytes = 9)\n"+ "'", str5.equals("1)CONSTANT_Integer[3](bytes = 9)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Float[4](bytes = 1.0)\n"+ "'", str8.equals("1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Float[4](bytes = 1.0)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test48"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addLong((long)(byte)100);
    int i5 = constantPoolGen1.addUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Class[7](name_index = 2)\n5)CONSTANT_Methodref[10](class_index = 4, name_and_type_index = 3)\n");
    int i8 = constantPoolGen1.addNameAndType("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Class[7](name_index = 3)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\n", "1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Float[4](bytes = 0.0)\n3)CONSTANT_Integer[3](bytes = 52)\n");
    int i10 = constantPoolGen1.lookupString("");
    int i12 = constantPoolGen1.lookupFloat((float)12);
    int i16 = constantPoolGen1.lookupFieldref("1)CONSTANT_Integer[3](bytes = 32)\n2)CONSTANT_Utf8[1](\"\")\n3)CONSTANT_String[8](string_index = 2)\n4)CONSTANT_Integer[3](bytes = 100)\n", "1)null\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n2)CONSTANT_Utf8[1](\"\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n3)CONSTANT_String[8](string_index = 2)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\\n5)CONSTANT_String[8](string_index = 4)\\n\")\n4)CONSTANT_NameAndType[12](name_index = 2, signature_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_Class[7](name_index = 5)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 4)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n7)CONSTANT_Double[6](bytes = -1.0)\n8)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test49"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen5 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    int i10 = constantPoolGen7.addNameAndType("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Float[4](bytes = 1.0)\n3)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test50"); }

    org.apache.bcel.classfile.Constant constant0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] { constant0 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    int i5 = constantPoolGen3.lookupDouble(0.0d);
    int i7 = constantPoolGen3.lookupInteger((int)(byte)-1);
    int i8 = constantPoolGen3.getSize();
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPoolGen3.getFinalConstantPool();
    int i11 = constantPoolGen3.addFloat((float)11);
    int i13 = constantPoolGen3.addString("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test51"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.Constant constant3 = constantPoolGen1.getConstant(0);
    int i5 = constantPoolGen1.addUtf8("");
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen1.getFinalConstantPool();
    int i10 = constantPoolGen1.lookupInterfaceMethodref("1)CONSTANT_Long[5](bytes = 10)\n2)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 2)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n7)CONSTANT_Class[7](name_index = 6)\\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\\n7)CONSTANT_Double[6](bytes = -1.0)\\n8)null\\n\")\n5)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"\")\\n257)CONSTANT_String[8](string_index = 256)\\n258)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\\n259)CONSTANT_Class[7](name_index = 258)\\n260)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n261)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n\")\\n262)CONSTANT_NameAndType[12](name_index = 260, signature_index = 261)\\n263)CONSTANT_Fieldref[9](class_index = 259, name_and_type_index = 262)\\n\")\n6)CONSTANT_NameAndType[12](name_index = 4, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 3, name_and_type_index = 6)\n");
    int i11 = constantPoolGen1.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test52"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i3 = constantPoolGen0.addUtf8("1)CONSTANT_Integer[3](bytes = 9)\n");
    int i5 = constantPoolGen0.addInteger((int)'#');
    int i7 = constantPoolGen0.addFloat((float)10L);
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen0.getConstant(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant9);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test53"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addLong((long)5);
    java.lang.String str3 = constantPoolGen0.toString();
    int i5 = constantPoolGen0.lookupString("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\n");
    int i8 = constantPoolGen0.lookupNameAndType("1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 32)\\n2)CONSTANT_Long[5](bytes = 261)\\n3)null\\n4)CONSTANT_Utf8[1](\"hi!\")\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n6)CONSTANT_NameAndType[12](name_index = 4, signature_index = 5)\\n7)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 32)\\n\")\\n8)CONSTANT_Class[7](name_index = 7)\\n9)CONSTANT_Methodref[10](class_index = 8, name_and_type_index = 6)\\n10)CONSTANT_Long[5](bytes = 10)\\n11)null\\n\")\n257)CONSTANT_Class[7](name_index = 256)\n258)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\n259)CONSTANT_Utf8[1](\"\")\n260)CONSTANT_NameAndType[12](name_index = 258, signature_index = 259)\n261)CONSTANT_Fieldref[9](class_index = 257, name_and_type_index = 260)\n", "1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Integer[3](bytes = -1)\n");
    org.apache.bcel.classfile.ConstantPool constantPool9 = constantPoolGen0.getConstantPool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1)CONSTANT_Long[5](bytes = 5)\n2)null\n"+ "'", str3.equals("1)CONSTANT_Long[5](bytes = 5)\n2)null\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool9);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test54"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addClass("hi!");
    int i4 = constantPoolGen0.lookupInteger((int)'4');
    int i6 = constantPoolGen0.addInteger((int)'a');
    int i8 = constantPoolGen0.lookupFloat((float)268);
    int i10 = constantPoolGen0.addClass("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\\n\")\n4)CONSTANT_String[8](string_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_NameAndType[12](name_index = 5, signature_index = 1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 5);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test55"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    java.lang.String str4 = constantPoolGen0.toString();
    int i7 = constantPoolGen0.addNameAndType("1)CONSTANT_Float[4](bytes = -1.0)\n", "");
    org.apache.bcel.generic.ArrayType arrayType8 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = constantPoolGen0.addArrayClass(arrayType8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n"+ "'", str4.equals("1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 5);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test56"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i3 = constantPoolGen0.addLong((long)2);
    int i5 = constantPoolGen0.lookupDouble(0.0d);
    int i9 = constantPoolGen0.lookupMethodref("", "1)CONSTANT_Long[5](bytes = 100)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Integer[3](bytes = 10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test57"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    int i5 = constantPoolGen0.addMethodref("1)CONSTANT_Long[5](bytes = 1)\n2)null\n", "1)CONSTANT_Integer[3](bytes = 9)\n", "1)CONSTANT_Long[5](bytes = 1)\n2)null\n");
    int i6 = constantPoolGen0.getSize();
    int i8 = constantPoolGen0.addDouble((double)(byte)100);
    int i12 = constantPoolGen0.addInterfaceMethodref("1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n7)CONSTANT_Double[6](bytes = -1.0)\n8)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 13);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test58"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger((int)'#');
    int i4 = constantPoolGen0.addInteger(2);
    int i6 = constantPoolGen0.lookupInteger(7);
    int i7 = constantPoolGen0.getSize();
    org.apache.bcel.classfile.ConstantPool constantPool8 = constantPoolGen0.getConstantPool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool8);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test59"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getConstantPool();
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen1.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    int i8 = constantPoolGen4.addMethodref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Class[7](name_index = 3)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\n", "1)CONSTANT_Long[5](bytes = 10)\n2)null\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n");
    int i10 = constantPoolGen4.addDouble((double)1.0f);
    org.apache.bcel.generic.ArrayType arrayType11 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i12 = constantPoolGen4.addArrayClass(arrayType11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 262);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test60"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.Constant constant3 = constantPoolGen1.getConstant(0);
    int i5 = constantPoolGen1.addUtf8("");
    int i7 = constantPoolGen1.lookupClass("");
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen1.getConstant(0);
    int i11 = constantPoolGen1.addFloat(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test61"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool3 = constantPoolGen0.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen4 = new org.apache.bcel.generic.ConstantPoolGen(constantPool3);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen4.getConstantPool();
    org.apache.bcel.generic.MethodGen methodGen6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = constantPoolGen4.lookupMethodref(methodGen6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test62"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    java.lang.String str2 = constantPoolGen0.toString();
    int i4 = constantPoolGen0.lookupDouble(0.0d);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen0.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen6 = new org.apache.bcel.generic.ConstantPoolGen(constantPool5);
    org.apache.bcel.classfile.ConstantPool constantPool7 = constantPoolGen6.getFinalConstantPool();
    org.apache.bcel.classfile.Constant constant9 = constantPoolGen6.getConstant(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant9);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test63"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupLong((long)10);
    int i5 = constantPoolGen1.addDouble((double)10L);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen1.getFinalConstantPool();
    int i8 = constantPoolGen1.lookupUtf8("1)CONSTANT_Long[5](bytes = 100)\n2)null\n");
    int i10 = constantPoolGen1.addInteger(1);
    int i12 = constantPoolGen1.addFloat((float)269);
    org.apache.bcel.generic.MethodGen methodGen13 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i14 = constantPoolGen1.lookupMethodref(methodGen13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test64"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i3 = constantPoolGen0.addNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i5 = constantPoolGen0.addString("1)CONSTANT_Long[5](bytes = 10)\n2)null\n");
    int i7 = constantPoolGen0.addFloat((float)12);
    int i9 = constantPoolGen0.lookupClass("1)CONSTANT_Integer[3](bytes = 35)\n");
    int i13 = constantPoolGen0.addMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1/0)\\n2)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Integer[3](bytes = 0)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Double[6](bytes = 256.0)\\n4)null\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Integer[3](bytes = 5)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n4)CONSTANT_Double[6](bytes = 262.0)\n5)null\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test65"); }

    org.apache.bcel.classfile.Constant constant0 = null;
    org.apache.bcel.classfile.Constant[] constant_array1 = new org.apache.bcel.classfile.Constant[] { constant0 };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array1);
    org.apache.bcel.classfile.Constant constant4 = null;
    constantPoolGen2.setConstant(6, constant4);
    int i9 = constantPoolGen2.addInterfaceMethodref("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n", "hi!", "hi!");
    int i13 = constantPoolGen2.addMethodref("1)CONSTANT_Float[4](bytes = -1.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\n3)CONSTANT_Long[5](bytes = 9)\n4)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Float[4](bytes = -1.0)\n", "1)CONSTANT_Integer[3](bytes = 35)\n");
    org.apache.bcel.classfile.ConstantPool constantPool14 = constantPoolGen2.getFinalConstantPool();
    int i16 = constantPoolGen2.addClass("1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\\n7)CONSTANT_Double[6](bytes = -1.0)\\n8)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 13);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test66"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i3 = constantPoolGen0.addNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i5 = constantPoolGen0.lookupDouble((double)0);
    int i6 = constantPoolGen0.getSize();
    int i10 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Float[4](bytes = 10.0)\n2)CONSTANT_Float[4](bytes = 1.0)\n3)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "", "1)CONSTANT_Long[5](bytes = 100)\n2)null\n3)CONSTANT_Double[6](bytes = -1.0)\n4)null\n");
    org.apache.bcel.classfile.ConstantPool constantPool11 = constantPoolGen0.getConstantPool();
    org.apache.bcel.classfile.Constant constant13 = null;
    constantPoolGen0.setConstant(19, constant13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool11);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test67"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.lookupFloat((float)(-1L));
    int i7 = constantPoolGen1.addMethodref("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    org.apache.bcel.generic.MethodGen methodGen8 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = constantPoolGen1.lookupInterfaceMethodref(methodGen8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 6);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test68"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    int i5 = constantPoolGen0.lookupNameAndType("1)CONSTANT_Long[5](bytes = 1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n");
    int i7 = constantPoolGen0.addString("1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n");
    int i11 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 32)\\n2)CONSTANT_Double[6](bytes = 97.0)\\n3)null\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n5)CONSTANT_String[8](string_index = 4)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)CONSTANT_Long[5](bytes = -1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Integer[3](bytes = 35)\\n3)CONSTANT_Integer[3](bytes = 0)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Double[6](bytes = 100.0)\n3)null\n");
    int i15 = constantPoolGen0.lookupFieldref("1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Integer[3](bytes = -1)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)CONSTANT_Double[6](bytes = 18.0)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 10/0)\\n2)CONSTANT_Float[4](bytes = 1/0)\\n3)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n257)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n258)CONSTANT_NameAndType[12](name_index = 256, signature_index = 257)\\n\")\\n4)CONSTANT_Class[7](name_index = 3)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_String[8](string_index = 1)\\n\")\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test69"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupString("hi!");
    int i4 = constantPoolGen0.lookupLong((long)(short)1);
    int i6 = constantPoolGen0.lookupLong((long)261);
    int i8 = constantPoolGen0.addClass("1)CONSTANT_Integer[3](bytes = 32)\n2)CONSTANT_Double[6](bytes = 97.0)\n3)null\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\n5)CONSTANT_String[8](string_index = 4)\n");
    int i12 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n3)CONSTANT_Integer[3](bytes = 0)\n4)CONSTANT_Integer[3](bytes = 256)\n", "1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10/0)\\n2)null\\n\")\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test70"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addInteger((int)' ');
    int i4 = constantPoolGen0.lookupInteger((int)(short)0);
    org.apache.bcel.classfile.Constant constant6 = null;
    constantPoolGen0.setConstant((int)(byte)1, constant6);
    org.apache.bcel.classfile.ConstantPool constantPool8 = constantPoolGen0.getConstantPool();
    int i10 = constantPoolGen0.addDouble((double)272);
    org.apache.bcel.generic.MethodGen methodGen11 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i12 = constantPoolGen0.lookupInterfaceMethodref(methodGen11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test71"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    org.apache.bcel.classfile.ConstantPool constantPool1 = constantPoolGen0.getConstantPool();
    java.lang.String str2 = constantPoolGen0.toString();
    int i4 = constantPoolGen0.addInteger(257);
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen0.getConstantPool();
    int i7 = constantPoolGen0.addInteger(260);
    int i9 = constantPoolGen0.lookupFloat((float)(byte)100);
    org.apache.bcel.classfile.ConstantPool constantPool10 = constantPoolGen0.getConstantPool();
    org.apache.bcel.generic.MethodGen methodGen11 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i12 = constantPoolGen0.addInterfaceMethodref(methodGen11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool10);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test72"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i3 = constantPoolGen0.addInteger(16);
    int i7 = constantPoolGen0.lookupFieldref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n", "1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n", "1)CONSTANT_Integer[3](bytes = -1)\n");
    int i9 = constantPoolGen0.lookupUtf8("1)CONSTANT_Float[4](bytes = 2.0)\n");
    java.lang.String str10 = constantPoolGen0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1)CONSTANT_Integer[3](bytes = 16)\n"+ "'", str10.equals("1)CONSTANT_Integer[3](bytes = 16)\n"));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test73"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i5 = constantPoolGen3.addDouble((double)1);
    org.apache.bcel.classfile.ConstantPool constantPool6 = constantPoolGen3.getFinalConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen7 = new org.apache.bcel.generic.ConstantPoolGen(constantPool6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool6);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test74"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addDouble((double)(short)1);
    int i5 = constantPoolGen0.lookupNameAndType("1)CONSTANT_Long[5](bytes = 1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 10)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n");
    int i7 = constantPoolGen0.addString("1)CONSTANT_Float[4](bytes = 0.0)\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n");
    int i11 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 32)\\n2)CONSTANT_Double[6](bytes = 97.0)\\n3)null\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_Class[7](name_index = 3)\\n5)CONSTANT_Utf8[1](\"\")\\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\\n\")\\n5)CONSTANT_String[8](string_index = 4)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n", "1)CONSTANT_Long[5](bytes = -1)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Integer[3](bytes = 35)\\n3)CONSTANT_Integer[3](bytes = 0)\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Double[6](bytes = 100.0)\n3)null\n");
    int i15 = constantPoolGen0.lookupInterfaceMethodref("1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Integer[3](bytes = 32)\n2)CONSTANT_Integer[3](bytes = 264)\n", "1)CONSTANT_Double[6](bytes = 1.0)\n2)null\n3)CONSTANT_Utf8[1](\"\")\n4)CONSTANT_Utf8[1](\"hi!\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test75"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addUtf8("");
    int i6 = constantPoolGen1.addNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Integer[3](bytes = 35)\n");
    int i8 = constantPoolGen1.lookupInteger(261);
    int i10 = constantPoolGen1.addString("1)null\n2)null\n3)null\n4)null\n5)null\n6)null\n7)null\n8)null\n9)null\n10)null\n11)null\n12)null\n13)null\n14)null\n15)null\n16)null\n17)null\n18)null\n19)null\n20)null\n21)null\n22)null\n23)null\n24)null\n25)null\n26)null\n27)null\n28)null\n29)null\n30)null\n31)null\n32)null\n33)null\n34)null\n35)null\n36)null\n37)null\n38)null\n39)null\n40)null\n41)null\n42)null\n43)null\n44)null\n45)null\n46)null\n47)null\n48)null\n49)null\n50)null\n51)null\n52)null\n53)null\n54)null\n55)null\n56)null\n57)null\n58)null\n59)null\n60)null\n61)null\n62)null\n63)null\n64)null\n65)null\n66)null\n67)null\n68)null\n69)null\n70)null\n71)null\n72)null\n73)null\n74)null\n75)null\n76)null\n77)null\n78)null\n79)null\n80)null\n81)null\n82)null\n83)null\n84)null\n85)null\n86)null\n87)null\n88)null\n89)null\n90)null\n91)null\n92)null\n93)null\n94)null\n95)null\n96)null\n97)null\n98)null\n99)null\n100)null\n101)null\n102)null\n103)null\n104)null\n105)null\n106)null\n107)null\n108)null\n109)null\n110)null\n111)null\n112)null\n113)null\n114)null\n115)null\n116)null\n117)null\n118)null\n119)null\n120)null\n121)null\n122)null\n123)null\n124)null\n125)null\n126)null\n127)null\n128)null\n129)null\n130)null\n131)null\n132)null\n133)null\n134)null\n135)null\n136)null\n137)null\n138)null\n139)null\n140)null\n141)null\n142)null\n143)null\n144)null\n145)null\n146)null\n147)null\n148)null\n149)null\n150)null\n151)null\n152)null\n153)null\n154)null\n155)null\n156)null\n157)null\n158)null\n159)null\n160)null\n161)null\n162)null\n163)null\n164)null\n165)null\n166)null\n167)null\n168)null\n169)null\n170)null\n171)null\n172)null\n173)null\n174)null\n175)null\n176)null\n177)null\n178)null\n179)null\n180)null\n181)null\n182)null\n183)null\n184)null\n185)null\n186)null\n187)null\n188)null\n189)null\n190)null\n191)null\n192)null\n193)null\n194)null\n195)null\n196)null\n197)null\n198)null\n199)null\n200)null\n201)null\n202)null\n203)null\n204)null\n205)null\n206)null\n207)null\n208)null\n209)null\n210)null\n211)null\n212)null\n213)null\n214)null\n215)null\n216)null\n217)null\n218)null\n219)null\n220)null\n221)null\n222)null\n223)null\n224)null\n225)null\n226)null\n227)null\n228)null\n229)null\n230)null\n231)null\n232)null\n233)null\n234)null\n235)null\n236)null\n237)null\n238)null\n239)null\n240)null\n241)null\n242)null\n243)null\n244)null\n245)null\n246)null\n247)null\n248)null\n249)null\n250)null\n251)null\n252)null\n253)null\n254)null\n255)null\n256)CONSTANT_Utf8[1](\"\")\n257)CONSTANT_String[8](string_index = 256)\n258)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 5)\\n\")\n259)CONSTANT_Class[7](name_index = 258)\n260)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n261)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n\")\n262)CONSTANT_NameAndType[12](name_index = 260, signature_index = 261)\n263)CONSTANT_Fieldref[9](class_index = 259, name_and_type_index = 262)\n");
    int i12 = constantPoolGen1.lookupString("1)null\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 35)\\n2)CONSTANT_Utf8[1](\"\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n3)CONSTANT_String[8](string_index = 2)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 100)\\n2)null\\n\")\\n5)CONSTANT_String[8](string_index = 4)\\n\")\n4)CONSTANT_NameAndType[12](name_index = 2, signature_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n6)CONSTANT_Class[7](name_index = 5)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 4)\n");
    int i14 = constantPoolGen1.lookupString("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Utf8[1](\"hi!\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"\")\n6)CONSTANT_NameAndType[12](name_index = 3, signature_index = 5)\n7)CONSTANT_InterfaceMethodref[11](class_index = 4, name_and_type_index = 6)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test76"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.lookupDouble((double)100.0f);
    int i4 = constantPoolGen0.lookupFloat((float)(short)1);
    int i6 = constantPoolGen0.addDouble((double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test77"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen2 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    java.lang.String str3 = constantPoolGen2.toString();
    int i6 = constantPoolGen2.addNameAndType("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n");
    int i8 = constantPoolGen2.addClass("1)CONSTANT_Long[5](bytes = 2)\n2)null\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\\n\")\n7)CONSTANT_Class[7](name_index = 6)\n8)CONSTANT_Methodref[10](class_index = 7, name_and_type_index = 5)\n");
    org.apache.bcel.classfile.Constant constant10 = null;
    constantPoolGen2.setConstant(13, constant10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test78"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    int i3 = constantPoolGen1.addDouble((double)' ');
    int i7 = constantPoolGen1.lookupFieldref("", "hi!", "");
    org.apache.bcel.generic.MethodGen methodGen8 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = constantPoolGen1.addMethodref(methodGen8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test79"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i1 = constantPoolGen0.getSize();
    int i4 = constantPoolGen0.lookupNameAndType("1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "hi!");
    org.apache.bcel.classfile.ConstantPool constantPool5 = constantPoolGen0.getFinalConstantPool();
    int i9 = constantPoolGen0.lookupMethodref("", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Long[5](bytes = -1)\n4)null\n", "1)CONSTANT_Utf8[1](\"\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 1)\n4)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"hi!\")\\n4)CONSTANT_NameAndType[12](name_index = 1, signature_index = 3)\\n5)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 4)\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 2, name_and_type_index = 7)\n");
    int i11 = constantPoolGen0.lookupUtf8("1)CONSTANT_Utf8[1](\"1)CONSTANT_Long[5](bytes = 1)\\n2)null\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n3)CONSTANT_Class[7](name_index = 2)\n");
    int i15 = constantPoolGen0.addInterfaceMethodref("1)CONSTANT_Double[6](bytes = 32.0)\n2)null\n3)CONSTANT_Integer[3](bytes = 0)\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\n", "1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 1.0)\\n2)null\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_InterfaceMethodref[11](class_index = 2, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\n2)CONSTANT_String[8](string_index = 1)\n");
    org.apache.bcel.classfile.Constant constant17 = constantPoolGen0.getConstant(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant17);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test80"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i2 = constantPoolGen0.addLong((long)(short)1);
    org.apache.bcel.classfile.Constant constant4 = constantPoolGen0.getConstant((int)(byte)10);
    java.lang.String str5 = constantPoolGen0.toString();
    int i7 = constantPoolGen0.lookupInteger((int)'#');
    int i8 = constantPoolGen0.getSize();
    int i10 = constantPoolGen0.lookupDouble(100.0d);
    int i12 = constantPoolGen0.addClass("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32/0)\\n2)null\\n3)CONSTANT_Integer[3](bytes = 0)\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\\n6)CONSTANT_Class[7](name_index = 3)\\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\\n\")\\n\")\n4)CONSTANT_Class[7](name_index = 3)\n5)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 32.0)\\n2)null\\n3)CONSTANT_Double[6](bytes = 256.0)\\n4)null\\n\")\n6)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Integer[3](bytes = 5)\\n\")\n7)CONSTANT_NameAndType[12](name_index = 5, signature_index = 6)\n8)CONSTANT_Fieldref[9](class_index = 4, name_and_type_index = 7)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(constant4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1)CONSTANT_Long[5](bytes = 1)\n2)null\n"+ "'", str5.equals("1)CONSTANT_Long[5](bytes = 1)\n2)null\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test81"); }

    org.apache.bcel.classfile.Constant[] constant_array0 = new org.apache.bcel.classfile.Constant[] {  };
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = new org.apache.bcel.generic.ConstantPoolGen(constant_array0);
    org.apache.bcel.classfile.ConstantPool constantPool2 = constantPoolGen1.getConstantPool();
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen3 = new org.apache.bcel.generic.ConstantPoolGen(constantPool2);
    int i5 = constantPoolGen3.lookupString("1)CONSTANT_Long[5](bytes = 1)\n2)null\n");
    org.apache.bcel.classfile.Constant constant7 = null;
    constantPoolGen3.setConstant(258, constant7);
    int i10 = constantPoolGen3.addUtf8("1)CONSTANT_Integer[3](bytes = -1)\n");
    int i13 = constantPoolGen3.addNameAndType("1)CONSTANT_Utf8[1](\"hi!\")\n2)CONSTANT_Class[7](name_index = 1)\n3)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n4)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"\")\\n2)CONSTANT_Class[7](name_index = 1)\\n3)CONSTANT_Long[5](bytes = -1)\\n4)null\\n\")\n5)CONSTANT_NameAndType[12](name_index = 3, signature_index = 4)\n6)CONSTANT_Class[7](name_index = 3)\n7)CONSTANT_Methodref[10](class_index = 6, name_and_type_index = 5)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n\")\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n");
    int i14 = constantPoolGen3.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constant_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(constantPool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 260);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Regression1Test9.test82"); }

    org.apache.bcel.generic.ConstantPoolGen constantPoolGen0 = new org.apache.bcel.generic.ConstantPoolGen();
    int i4 = constantPoolGen0.addFieldref("", "", "hi!");
    int i6 = constantPoolGen0.lookupDouble((double)' ');
    int i10 = constantPoolGen0.lookupMethodref("", "hi!", "hi!");
    int i14 = constantPoolGen0.addInterfaceMethodref("1)CONSTANT_Integer[3](bytes = 9)\n2)CONSTANT_Integer[3](bytes = -1)\n", "1)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 1)\\n2)CONSTANT_Long[5](bytes = 9)\\n3)null\\n4)CONSTANT_Long[5](bytes = 0)\\n5)null\\n\")\n2)CONSTANT_Class[7](name_index = 1)\n", "1)CONSTANT_Utf8[1](\"1)null\\n2)null\\n3)null\\n4)null\\n5)null\\n6)null\\n7)null\\n8)null\\n9)null\\n10)null\\n11)null\\n12)null\\n13)null\\n14)null\\n15)null\\n16)null\\n17)null\\n18)null\\n19)null\\n20)null\\n21)null\\n22)null\\n23)null\\n24)null\\n25)null\\n26)null\\n27)null\\n28)null\\n29)null\\n30)null\\n31)null\\n32)null\\n33)null\\n34)null\\n35)null\\n36)null\\n37)null\\n38)null\\n39)null\\n40)null\\n41)null\\n42)null\\n43)null\\n44)null\\n45)null\\n46)null\\n47)null\\n48)null\\n49)null\\n50)null\\n51)null\\n52)null\\n53)null\\n54)null\\n55)null\\n56)null\\n57)null\\n58)null\\n59)null\\n60)null\\n61)null\\n62)null\\n63)null\\n64)null\\n65)null\\n66)null\\n67)null\\n68)null\\n69)null\\n70)null\\n71)null\\n72)null\\n73)null\\n74)null\\n75)null\\n76)null\\n77)null\\n78)null\\n79)null\\n80)null\\n81)null\\n82)null\\n83)null\\n84)null\\n85)null\\n86)null\\n87)null\\n88)null\\n89)null\\n90)null\\n91)null\\n92)null\\n93)null\\n94)null\\n95)null\\n96)null\\n97)null\\n98)null\\n99)null\\n100)null\\n101)null\\n102)null\\n103)null\\n104)null\\n105)null\\n106)null\\n107)null\\n108)null\\n109)null\\n110)null\\n111)null\\n112)null\\n113)null\\n114)null\\n115)null\\n116)null\\n117)null\\n118)null\\n119)null\\n120)null\\n121)null\\n122)null\\n123)null\\n124)null\\n125)null\\n126)null\\n127)null\\n128)null\\n129)null\\n130)null\\n131)null\\n132)null\\n133)null\\n134)null\\n135)null\\n136)null\\n137)null\\n138)null\\n139)null\\n140)null\\n141)null\\n142)null\\n143)null\\n144)null\\n145)null\\n146)null\\n147)null\\n148)null\\n149)null\\n150)null\\n151)null\\n152)null\\n153)null\\n154)null\\n155)null\\n156)null\\n157)null\\n158)null\\n159)null\\n160)null\\n161)null\\n162)null\\n163)null\\n164)null\\n165)null\\n166)null\\n167)null\\n168)null\\n169)null\\n170)null\\n171)null\\n172)null\\n173)null\\n174)null\\n175)null\\n176)null\\n177)null\\n178)null\\n179)null\\n180)null\\n181)null\\n182)null\\n183)null\\n184)null\\n185)null\\n186)null\\n187)null\\n188)null\\n189)null\\n190)null\\n191)null\\n192)null\\n193)null\\n194)null\\n195)null\\n196)null\\n197)null\\n198)null\\n199)null\\n200)null\\n201)null\\n202)null\\n203)null\\n204)null\\n205)null\\n206)null\\n207)null\\n208)null\\n209)null\\n210)null\\n211)null\\n212)null\\n213)null\\n214)null\\n215)null\\n216)null\\n217)null\\n218)null\\n219)null\\n220)null\\n221)null\\n222)null\\n223)null\\n224)null\\n225)null\\n226)null\\n227)null\\n228)null\\n229)null\\n230)null\\n231)null\\n232)null\\n233)null\\n234)null\\n235)null\\n236)null\\n237)null\\n238)null\\n239)null\\n240)null\\n241)null\\n242)null\\n243)null\\n244)null\\n245)null\\n246)null\\n247)null\\n248)null\\n249)null\\n250)null\\n251)null\\n252)null\\n253)null\\n254)null\\n255)null\\n256)CONSTANT_Utf8[1](\"1)CONSTANT_Float[4](bytes = 0/0)\\n2)CONSTANT_Utf8[1](\"1)CONSTANT_Utf8[1](\"hi!\")\\n2)CONSTANT_Class[7](name_index = 1)\\n\")\\n3)CONSTANT_Class[7](name_index = 2)\\n\")\\n257)CONSTANT_Class[7](name_index = 256)\\n258)CONSTANT_Utf8[1](\"1)CONSTANT_Integer[3](bytes = 9)\\n2)CONSTANT_Float[4](bytes = 0.0)\\n3)CONSTANT_Integer[3](bytes = 52)\\n\")\\n259)CONSTANT_Utf8[1](\"1)CONSTANT_Double[6](bytes = 10.0)\\n2)null\\n3)CONSTANT_Float[4](bytes = 32.0)\\n\")\\n260)CONSTANT_NameAndType[12](name_index = 258, signature_index = 259)\\n261)CONSTANT_Fieldref[9](class_index = 257, name_and_type_index = 260)\\n\")\n2)CONSTANT_Utf8[1](\"\")\n3)CONSTANT_NameAndType[12](name_index = 1, signature_index = 2)\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);

  }

}
