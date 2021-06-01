# 注意不要使用～，使用绝对路径/home/book
java -cp TestsClasses/tests/:/home/book/Desktop/bcel/target/classes/:junit-4.12.jar:hamcrest-core-1.3.jar:evosuite-standalone-runtime-1.0.6.jar:evosuite-shaded-1.0.6-SNAPSHOT.jar   -javaagent:jacocoagent.jar=output=file,destfile=/home/book/Desktop/jars/TestsClasses/tests/jacoco.exec,append=true org.junit.runner.JUnitCore org.apache.bcel.generic.ConstantPoolGen_MergedTest

