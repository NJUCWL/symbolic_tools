# 注意使用-cp的时候jar的位置有时候也会影响结果，最后把所有jar写在一起
# 使用-Xlint:deprecation 是因为使用了过时的API
javac -Xlint:deprecation -cp ~/Desktop/bcel/target/classes/:junit-4.12.jar:hamcrest-core-1.3.jar:evosuite-standalone-runtime-1.0.6.jar:evosuite-shaded-1.0.6-SNAPSHOT.jar::~/Desktop/jars/TestsClasses/tests    ~/Desktop/jars/TestsClasses/tests/org/apache/bcel/generic/ConstantPoolGen_MergedTest.java
