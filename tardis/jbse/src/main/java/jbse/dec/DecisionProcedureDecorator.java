package jbse.dec;

import java.util.Collection;
import java.util.Map;

import jbse.bc.ClassFile;
import jbse.common.exc.InvalidInputException;
import jbse.dec.exc.DecisionException;
import jbse.mem.Clause;
import jbse.mem.Objekt;
import jbse.val.Expression;
import jbse.val.Primitive;
import jbse.val.PrimitiveSymbolic;
import jbse.val.ReferenceSymbolic;
import jbse.val.Simplex;

/**
 * A decision procedure which delegates its operation to another one 
 * without adding any other functionality. It still has a calculator and
 * a set of rewriters for its own sake, but it does not use them
 * (it's up to subclasses to decide when and how to use them). 
 * Used as base for Decorators.
 * 
 * @author Pietro Braione
 *
 */
public class DecisionProcedureDecorator implements DecisionProcedure {
    private final DecisionProcedure component;

    public DecisionProcedureDecorator(DecisionProcedure component) {
        this.component = component;
    }

    @Override
    public void goFastAndImprecise() {
        this.component.goFastAndImprecise();
    }

    @Override
    public void stopFastAndImprecise() {
        this.component.stopFastAndImprecise();
    }

    @Override
    public void pushAssumption(Clause c) 
    throws InvalidInputException, DecisionException {
        this.component.pushAssumption(c);
    }

    @Override
    public void clearAssumptions() throws DecisionException {
        this.component.clearAssumptions();
    }

    //we do not override addAssumptions and setAssumptions
    //because by default they perform a pushAssumption;
    //If a decision procedure overrides one of them, 
    //it cannot be decorated by this decorator, because
    //the decorator, in that case, must override these
    //methods and delegate to the component.

    @Override
    public Collection<Clause> getAssumptions() 
    throws DecisionException {
        return this.component.getAssumptions();
    }

    @Override
    public boolean isSat(Expression exp) 
    throws InvalidInputException, DecisionException {
        return this.component.isSat(exp);
    }

    @Override
    public boolean isSatNull(ReferenceSymbolic r) 
    throws InvalidInputException, DecisionException {
        return this.component.isSatNull(r);
    }

    @Override
    public boolean isSatAliases(ReferenceSymbolic r, long heapPos, Objekt o)
    throws InvalidInputException, DecisionException {
        return this.component.isSatAliases(r, heapPos, o);
    }

    @Override
    public boolean isSatExpands(ReferenceSymbolic r, ClassFile classFile)
    throws InvalidInputException, DecisionException {
        return this.component.isSatExpands(r, classFile);
    }

    @Override
    public boolean isSatInitialized(ClassFile classFile) 
    throws InvalidInputException, DecisionException {
        return this.component.isSatInitialized(classFile);
    }

    @Override
    public boolean isSatNotInitialized(ClassFile classFile) 
    throws InvalidInputException, DecisionException {
        return this.component.isSatNotInitialized(classFile);
    }

    @Override
    public Map<PrimitiveSymbolic, Simplex> getModel() throws DecisionException {
        return this.component.getModel();
    }

    @Override
    public Primitive simplify(Primitive c) throws DecisionException {
        return this.component.simplify(c);
    }

    @Override
    public void close() 
    throws DecisionException {
        this.component.close();
    }
}
