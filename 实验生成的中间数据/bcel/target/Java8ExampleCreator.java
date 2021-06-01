import org.apache.bcel.generic.*;
import org.apache.bcel.classfile.*;
import org.apache.bcel.*;
import java.io.*;

public class Java8ExampleCreator {
  private InstructionFactory _factory;
  private ConstantPoolGen    _cp;
  private ClassGen           _cg;

  public Java8ExampleCreator() {
    _cg = new ClassGen("Java8Example", "java.lang.Object", "Java8Example.java", Const.ACC_PUBLIC | Const.ACC_INTERFACE | Const.ACC_ABSTRACT, new String[] {  });

    _cp = _cg.getConstantPool();
    _factory = new InstructionFactory(_cg, _cp);
  }

  public void create(OutputStream out) throws IOException {
    createMethod_0();
    createMethod_1();
    _cg.getJavaClass().dump(out);
  }

  private void createMethod_0() {
    InstructionList il = new InstructionList();
    MethodGen method = new MethodGen(Const.ACC_PUBLIC, Type.VOID, Type.NO_ARGS, new String[] {  }, "hello", "Java8Example", il, _cp);

    InstructionHandle ih_0 = il.append(new PUSH(_cp, 3));
    il.append(_factory.createNewArray(Type.STRING, (short) 1));
    il.append(InstructionConst.DUP);
    il.append(new PUSH(_cp, 0));
    il.append(new PUSH(_cp, "Hello"));
    il.append(InstructionConst.AASTORE);
    il.append(InstructionConst.DUP);
    il.append(new PUSH(_cp, 1));
    il.append(new PUSH(_cp, "World"));
    il.append(InstructionConst.AASTORE);
    il.append(InstructionConst.DUP);
    il.append(new PUSH(_cp, 2));
    il.append(new PUSH(_cp, "hi"));
    il.append(InstructionConst.AASTORE);
    il.append(_factory.createInvoke("java.util.Arrays", "asList", new ObjectType("java.util.List"), new Type[] { new ArrayType(Type.OBJECT, 1) }, Const.INVOKESTATIC));
    il.append(_factory.createStore(Type.OBJECT, 1));
    InstructionHandle ih_23 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Const.GETSTATIC));
    il.append(_factory.createLoad(Type.OBJECT, 1));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.OBJECT }, Const.INVOKEVIRTUAL));
    InstructionHandle ih_30 = il.append(_factory.createLoad(Type.OBJECT, 1));
    il.append(_factory.createInvoke("java.util.List", "stream", new ObjectType("java.util.stream.Stream"), Type.NO_ARGS, Const.INVOKEINTERFACE));
    il.append(_factory.createInvoke("test", "test", new ObjectType("java.util.function.Predicate"), Type.NO_ARGS, Const.INVOKEDYNAMIC));
    il.append(_factory.createInvoke("java.util.stream.Stream", "filter", new ObjectType("java.util.stream.Stream"), new Type[] { new ObjectType("java.util.function.Predicate") }, Const.INVOKEINTERFACE));
    il.append(_factory.createInvoke("java.util.stream.Collectors", "toList", new ObjectType("java.util.stream.Collector"), Type.NO_ARGS, Const.INVOKESTATIC));
    il.append(_factory.createInvoke("java.util.stream.Stream", "collect", Type.OBJECT, new Type[] { new ObjectType("java.util.stream.Collector") }, Const.INVOKEINTERFACE));
    il.append(_factory.createCheckCast(new ObjectType("java.util.List")));
    il.append(_factory.createStore(Type.OBJECT, 2));
    InstructionHandle ih_58 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Const.GETSTATIC));
    il.append(_factory.createLoad(Type.OBJECT, 2));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.OBJECT }, Const.INVOKEVIRTUAL));
    InstructionHandle ih_65 = il.append(_factory.createReturn(Type.VOID));
    method.setMaxStack();
    method.setMaxLocals();
    _cg.addMethod(method.getMethod());
    il.dispose();
  }

  private void createMethod_1() {
    InstructionList il = new InstructionList();
    MethodGen method = new MethodGen(Const.ACC_PRIVATE | Const.ACC_STATIC | Const.ACC_SYNTHETIC, Type.BOOLEAN, new Type[] { Type.STRING }, new String[] { "arg0" }, "lambda$hello$0", "Java8Example", il, _cp);

    InstructionHandle ih_0 = il.append(_factory.createLoad(Type.OBJECT, 0));
    il.append(_factory.createInvoke("java.lang.String", "length", Type.INT, Type.NO_ARGS, Const.INVOKEVIRTUAL));
    il.append(new PUSH(_cp, 2));
        BranchInstruction if_icmple_5 = _factory.createBranchInstruction(Const.IF_ICMPLE, null);
    il.append(if_icmple_5);
    il.append(new PUSH(_cp, 1));
        BranchInstruction goto_9 = _factory.createBranchInstruction(Const.GOTO, null);
    il.append(goto_9);
    InstructionHandle ih_12 = il.append(new PUSH(_cp, 0));
    InstructionHandle ih_13 = il.append(_factory.createReturn(Type.INT));
    if_icmple_5.setTarget(ih_12);
    goto_9.setTarget(ih_13);
    method.setMaxStack();
    method.setMaxLocals();
    _cg.addMethod(method.getMethod());
    il.dispose();
  }

  public static void main(String[] args) throws Exception {
    Java8ExampleCreator creator = new Java8ExampleCreator();
    creator.create(new FileOutputStream("Java8Example.class"));
  }
}
