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

package fi.hut.ics.lime.tester.server.strategies;

public class DFS extends BasicSearchStrategy implements ExecutionStrategy {


    public DFS (Object o)
    {
        super(o);
    }



    @Override
    SymbolicExecutionNode selectNextNode()
    {
        if (tree.getRoot().isFinished())
            return null;

        return search(tree.getRoot());
    }



    @Override
    synchronized void handleNewOpenBranch (SymbolicExecutionNode node)
    {
        this.notifyAll();
    }



    @Override
    synchronized SymbolicExecutionNode getNewNode (SymbolicExecutionNode node)
    {
        return new SymbolicExecutionNode(node);
    }



    private synchronized SymbolicExecutionNode search (SymbolicExecutionNode node)
    {
        if (node.getLeft() == null && node.getRight() == null)
            if (!node.isFinished())
                return node;
            else {
            try {
                this.wait();
            }
            catch (InterruptedException e) {}
                return search(tree.getRoot());
                //return null;
            }

        if (node.getLeft() != null && !node.getLeft().isFinished())
            return search(node.getLeft());
        else if (node.getRight() != null && !node.getRight().isFinished())
            return search(node.getRight());
        else {
            System.err.println("ERROR: DFS search failed. Symbolic execution tree is not well structured.");
            System.exit(-1);
        }

        return null; // not reachable
    }

}