/*
Copyright (c) 2008 - 2009 Helsinki University of Technology (TKK)

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
 */

package fi.hut.ics.lime.tester.server;

import java.io.*;
import java.net.*;

import fi.hut.ics.lime.tester.server.strategies.RandomPriority;
import fi.hut.ics.lime.tester.server.strategies.RandomSelection;
import fi.hut.ics.lime.tester.server.strategies.BranchCoverageStrategy;
import fi.hut.ics.lime.tester.server.strategies.DFS;
import fi.hut.ics.lime.tester.server.strategies.BFS;
import fi.hut.ics.lime.tester.server.strategies.Random;
import fi.hut.ics.lime.tester.server.strategies.ExecutionStrategy;

public class Worker implements Runnable {
    private Socket client;
    private Object executionTree;

    private String inputString;
    private String objectString;
    private String scheduleString;

    private boolean isDropped;

    
    public Worker (Socket s, Object eT)
    {
        client            = s;
        executionTree     = eT;
        inputString       = "";
        objectString      = "";
        scheduleString    = "";
        isDropped         = false;
    }



    //TODO: make this more modular and clean up the code
    public void run()
    {
        ExecutionStrategy execution = chooseStrategy();

        BufferedReader in   = null;
        PrintWriter out     = null;

        try {
            in  = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        }
        catch (IOException e) {
            System.out.println("ERROR: TCP connection failure.");
            System.exit(-1);
        }

        String clientType = null;
        try {
            clientType = in.readLine();
        }
        catch (IOException e) {
             //TODO: error handling
        }


        if (clientType.equals("launcher")) {
          //  out.println("Ack");
            SystemInformation.lock.lock();
            out.println("Testing has been finished");
            SystemInformation.lock.unlock();
            return;
        }
        else if (clientType.equals("stop")) {
            SystemInformation.setFinished();
            
            try {
                SystemInformation.server.close();
            }
            catch(IOException e) {
                System.err.println(e);
            }

            return;
        }


        // Check if the user has set a maximum number of test runs in properties file
        if (SystemInformation.getNumberOfRuns() != -1) {
            if (SystemInformation.getNumberOfRuns() == 0) {
                execution.setFinished("All done.");
                System.out.println("Max number of test runs reached.");
                try {
                    SystemInformation.setFinished();
                    SystemInformation.server.close();
                }
                catch(IOException e) {
                    System.err.println(e);
                }
            }
            else
                execution.computeNewInputs();

            SystemInformation.setNumberOfRuns(SystemInformation.getNumberOfRuns() - 1);
        }
        else
            execution.computeNewInputs();

        out.println(execution.getPrimitiveInputs());
        out.println(execution.getReferenceInputs());
        out.println(execution.getScheduling());
        out.println(SystemInformation.getMaxDepth());

        long seed = 0;
        
        if (SystemInformation.getSeed() == null || SystemInformation.getSeed().startsWith("current"))
            seed = System.currentTimeMillis();
        else
            seed = Long.valueOf(SystemInformation.getSeed()).longValue();

        out.println(seed);

        if (execution.getPrimitiveInputs().equals("All done.")) {
            SystemInformation.setFinished();
            try {
                SystemInformation.server.close();
            }
            catch(IOException e) {
                System.err.println(e);
            }
        }

        String line                 = null;
        String JUnitInputs          = "";
        int objectCounter           = 1;
        boolean isInputObjectField  = false;
        String inputObject          = "";
        String inputField           = "";

        while (!execution.isFinished()) { 
            try { 
                line = in.readLine();
            }
            catch (IOException e) {
                line = null; // for C-client compatibility
                
                // TODO: originally this exception handler terminated
                // the worker thread without reporting an error in the
                // program under test. This modification was made for
                // C-client compatibility but now the server might report
                // spurious errors if there are problems with the network
                // connection. Some redesigning of the error detection
                // system might be needed.
            }

            if (SystemInformation.getVerbosity() > 4)
                System.out.println("[DEBUG] message: " + line);

            if (line == null) {
                if (SystemInformation.checkAndDecreaseMaxDefects()) {
                    System.out.println("Error found");
                    //System.out.println("Input values used: " + inputString);
                    System.out.println("Inputs used: " + JUnitInputs);
                   // System.out.println("Seed value used: " + seed + "\n");

                    execution.setFinished("error");
                    SystemInformation.addErrorCount();
                    
                    if (SystemInformation.getMaxDefects() == 0)
                        SystemInformation.setFinished();
                    
                    break;
                }
                else {
                    execution.setFinished("error");
                    SystemInformation.setFinished();
                    break;
                }
            }
            else if (line.equals("All done.")) {
                execution.setFinished("All done.");
                SystemInformation.addTotalCount();
            }
            else if (line.equals("Drop test")) {
                execution.setFinished("depth"); //todo: change depth to something else
                isDropped = true;
            }
         //   else if (line.equals("Maximum number of gotos reached")) {
            else if (line.equals("Maximum depth reached")) {
                execution.setFinished("depth");
                SystemInformation.addReachedDepthCount();
            }

            else if (line.startsWith("New arithmetic condition:")) {
                String[] condition = line.substring(26).split(" ");

                boolean branch = false;

                if (condition[3].equals("true"))
                    branch = true;
                else
                    branch = false;

                execution.addBranch(condition[0] + " " + condition[1] + " " + condition[2], branch, 0, condition[4]);  
            }
            else if (line.startsWith("New input:")) {  
                String[] names = null;                 

                names = line.substring(11).split(" ");

                execution.addAssignment(names[0] + " " + names[1]);
            }
            else if (line.startsWith("New assignment:")) {
                String string = null;

                string = line.substring(16);

                execution.addAssignment(string);
            }
            else if (line.startsWith("Branch ID:")) {
                String[] s = line.substring(11).split(" ");

                if (s[1].equals("true"))
                    SystemInformation.coverBranch(Integer.valueOf(s[0]).intValue(), true);
                else
                    SystemInformation.coverBranch(Integer.valueOf(s[0]).intValue(), false);

                
            }
            else if (line.startsWith("Instrumented branches:")) {
                String s = line.substring(23);

                SystemInformation.setMaxBranchCoverage(Integer.valueOf(s).intValue() * 2);

            }
            else if (line.startsWith("Add limit:")) {
                String[] limits = null;

                limits = line.substring(11).split(" ");

                execution.addLimits(limits[0], limits[1], limits[2]);
            }
            else if (line.startsWith("Unsatisfiable input constraint")) {
                //addUnsatCount???
                execution.setFinished("unsat");
                execution.computeNewInputs();
                
                out.println(execution.getPrimitiveInputs());
                out.println(execution.getReferenceInputs());
                out.println(execution.getScheduling());

                if (execution.getPrimitiveInputs().equals("All done."))
                    SystemInformation.setFinished();
            }
            else if (line.startsWith("Buffered path: ")) {
                String branch = line.substring(15);

                execution.updatePath(branch);
            }
            else if (line.startsWith("New reference condition:")) {
                String[] condition = line.substring(25).split(" ");

                boolean branch = false;

                if (condition[3].equals("true"))
                    branch = true;
                else
                    branch = false;

                execution.addPointerCondition(condition[0] + " " + condition[1] + " " + condition[2], branch, condition[4]);
            }
//            else if (line.startsWith("depthTest:")) {
//                 String[] s = line.substring(1).split(" ");
//
//                 int i = Integer.valueOf(s[1]).intValue();
//
//                 SystemInformation.reportDepth(i);
//            }

            if (line.startsWith("Deadlock")) {
                System.out.println("Error found (deadlock)!");
                System.out.println("Input values used: " + inputString);
                System.out.println("Schedule: " + scheduleString);
                System.out.println("Seed value used: " + seed + "\n");

                execution.setFinished("error");
                SystemInformation.addErrorCount();

                break;

            }
            else if (line.startsWith("Object field:")) {
                String s[] = line.substring(14).split(" ");
                isInputObjectField = true;
                inputObject = s[0];
                inputField  = s[1];
            }
            else if (line.startsWith("Concrete input:")) {
                if (inputString.equals(""))
                    inputString = line.substring(16);
                else
                    inputString = inputString + " " + line.substring(16);

                if (isInputObjectField) {
                    JUnitInputs += "o" + inputObject + "." + inputField + "=" + line.substring(16) + " ";
                }
                else {
                    JUnitInputs += line.substring(16) + " ";
                }
                isInputObjectField = false;

                execution.inform(line);
            }
            else if (line.startsWith("Concrete object:")) {

                if (objectString.equals(""))
                    objectString = line.substring(17);
                else
                    objectString = objectString + " " + line.substring(17);

                if (isInputObjectField) {
                    JUnitInputs += "o" + inputObject + "." + inputField + "=o" + line.substring(17) + " ";
                }
                else {
                    JUnitInputs += "o" + objectCounter + "=o" + line.substring(17) + " ";
                }
                objectCounter++;
                isInputObjectField = false;

                execution.inform(line);
            }
            else if (line.startsWith("Scheduling:")) {

                String s[] = line.substring(12).split(" Selected: ");
                if (scheduleString.equals(""))
                    scheduleString = s[1];
                else
                    scheduleString = scheduleString + " " + s[1];

                execution.inform(line);
            }
            else if (line.startsWith("Solver time:")) {
                String time = line.substring(13);

                SystemInformation.increaseSolverTime(Long.valueOf(time));
            }
            else
                execution.inform(line);

        }

        try {
            out.close();
            in.close();
            client.close();
        }
        catch (IOException e) {
            System.out.println("Closing failed");
            System.exit(-1);
        }
      //  System.out.println("DEBUG: Closed");

        //System.out.println("Input string for JUnit generation:\n" + JUnitInputs);
        if (SystemInformation.testWriter != null && !isDropped) {
            try {
                SystemInformation.testWriter.write(JUnitInputs + "\n");
            }
            catch (IOException e) {
                //TODO: error handling
            }
        }
    }



    private ExecutionStrategy chooseStrategy()
    {
        ExecutionStrategy e = null;

        if (SystemInformation.getStrategy().equals("DFS"))
            e = new DFS(executionTree);
        else if (SystemInformation.getStrategy().equals("random priority"))
            e = new RandomPriority(executionTree);
        else if (SystemInformation.getStrategy().equals("BFS"))
            e = new BFS(executionTree);
        else if (SystemInformation.getStrategy().equals("random")) {
            e = new Random(executionTree);
        }
        else if (SystemInformation.getStrategy().equals("random selection")) {
            e = new RandomSelection(executionTree);
        }
        else if (SystemInformation.getStrategy().equals("branch coverage")) {
            e = new BranchCoverageStrategy(executionTree);
        }
        else {
            System.err.println("ERROR: Unknown strategy (" + SystemInformation.getStrategy() + ").");
            System.exit(-1);
        }

        return e;
    }

}
