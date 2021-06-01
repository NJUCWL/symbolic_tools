# Replace the Java, Yices and Boolector home directories below with
# the directories used in your system

# Java home directory
JDK_HOME = /usr/lib/jvm/java-6-openjdk

# Yices directory
YICES_HOME = /home/ktkahkon/tools/yices-1.0.18

# Boolector directory
BOOLECTOR_HOME = /home/ktkahkon/tools/boolector-1.1-IA-32

# It should not be necessary to modify the rest of the Makefile
yices: YicesSolver.c++
	gcc JNIYices.c++ YicesSolver.c++ -o ./libyices.so -shared  -I$(JDK_HOME)/include/ -I$(JDK_HOME)/include/linux -I$(YICES_HOME)/include -L$(YICES_HOME)/lib -lyices -lgmp -lstdc++

boolector: BoolectorSolver.c++
	gcc -g -Wall -W -Wextra JNIBoolector.c++ BoolectorSolver.c++ -o ./libboolector.so -shared -I$(JDK_HOME)/include/ -I$(JDK_HOME)/include/linux -I$(BOOLECTOR_HOME)/include -L$(BOOLECTOR_HOME)/lib -lboolector -lstdc++

