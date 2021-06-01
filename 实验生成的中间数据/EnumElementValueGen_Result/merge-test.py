import os, sys, shutil
import argparse
import re
import pathlib

CWD = os.getcwd()

def get_test_case(suite_file_path):
    file_path = pathlib.Path(suite_file_path)
    index = 0
    suite_content = ""
    for file_name in file_path.glob("*.java"):
        with open(file_name) as file:
            file_string = file.read()
            r = re.compile(r'(\n\s+)@Test[\s\S]*?\1\}', re.M)
            results = r.finditer(file_string)     
            for result in results:
                # print(result.group(0))
                content = result.group(0)
                content = content.replace("void test0", f"void test{index}")
                suite_content += content
                index += 1
    # print(suite_content)
    return suite_content


def merge_test(suite_file_path,package_name,cut_name):
    if not os.path.exists(suite_file_path):
        print("The suite path not exists.")
        sys.exit()
    merged_test_file = suite_file_path + "/" + package_name.replace(".","/") + "/" + cut_name + "_MergedTest.java"
    with open(merged_test_file, 'w') as f:
        f.write("package " + package_name + ";\n\n")
        f.write("import org.junit.Test;\n")
        f.write("import static org.junit.Assert.*;\n")
        f.write("import java.lang.ClassLoader;\nimport java.util.LinkedList;\nimport shaded.org.evosuite.runtime.mock.java.util.MockRandom;\nimport java.util.Random;\nimport java.util.HashMap;\nimport java.util.*;\nimport java.text.NumberFormat;\nimport java.text.*;\n")
        f.write("import java.io.*;\nimport java.io.DataInput;\nimport java.io.File;\nimport java.io.RandomAccessFile;\nimport java.util.concurrent.*;\nimport java.util.concurrent.ExecutorService;\nimport java.util.concurrent.Executors;\nimport java.util.concurrent.Future;\nimport java.util.concurrent.TimeUnit;\n")
        # f.write("import org.apache.bcel.*;\n")
        # f.write("import org.apache.bcel.generic.*;\n")
        # f.write("import org.apache.bcel.util.*;\n")
        # f.write("import org.apache.bcel.classfile.*;\n")
        # f.write("import org.apache.bcel.verifier.*;\n")
        # f.write("import org.apache.bcel.verifier.statics.*;\n")
        # f.write("import org.apache.bcel.verifier.structurals.*;\n")
        # f.write("import org.apache.bcel.verifier.exc.*;\n")
        f.write("import org.la4j.*;\n")
        f.write("import org.la4j.decomposition.*;\n")
        f.write("import org.la4j.inversion.*;\n")
        f.write("import org.la4j.iterator.*;\n")
        f.write("import org.la4j.linear.*;\n")
        f.write("import org.la4j.matrix.*;\n")
        f.write("import org.la4j.matrix.dense.*;\n")
        f.write("import org.la4j.matrix.functor.*;\n")
        f.write("import org.la4j.matrix.sparse.*;\n")
        f.write("import org.la4j.operation.*;\n")
        f.write("import org.la4j.operation.inplace.*;\n")
        f.write("import org.la4j.operation.ooplace.*;\n")
        f.write("import org.la4j.vector.*;\n")
        f.write("import org.la4j.vector.dense.*;\n")
        f.write("import org.la4j.vector.functor.*;\n")
        f.write("import org.la4j.vector.sparse.*;\n")
        f.write("public class " + cut_name + "_MergedTest {")
        f.write(get_test_case(suite_file_path + "/" + package_name.replace(".","/")))
        f.write("\n}")
    print("Done!")


merge_test(*sys.argv[1:])
