/*
Copyright (c) 2008 Helsinki University of Technology (TKK)

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

package fi.hut.ics.lime.tester.symbolicexecution;


public class CallStatement {
    
    public static void putArgument (String identifier, String argument)
    {

  //      System.out.println("putArg: " + identifier + " " + argument);

        if (Symbolic.parameterQueue.size() > 0 && !Symbolic.parameterQueue.getFirst().startsWith(identifier))
            Symbolic.parameterQueue.clear();

        String temp = identifier + " " + argument;

        Symbolic.parameterQueue.addLast(temp);
    }



    // Is it possible to get arguments in wrong order?
    public static String getArgument (String identifier, String concrete)
    {
        String result = null;

        if (identifier == null || Symbolic.parameterQueue == null) // test fix. check properly later.
            return concrete;

        if (Symbolic.parameterQueue.size() > 0 && Symbolic.parameterQueue.getLast().startsWith(identifier))
            result = Symbolic.parameterQueue.removeLast().substring(identifier.length() + 1);
        else if (Symbolic.parameterQueue.size() > 0) {
            Symbolic.parameterQueue.clear();
            result = concrete;
        }
        else {
            result = concrete;
        }

  //      System.out.println("getArg: " + identifier + " " + result);

        return result;
    }
}
