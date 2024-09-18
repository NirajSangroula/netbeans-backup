/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver.abstractclasses;

import expressionsolver.UnitGroup;
import expressionsolver.interfaces.OperatorInterface;

/**
 *
 * @author Niraj Sangroula
 */
public abstract class Operator implements OperatorInterface, Comparable {

    protected int priority = 0;
    private final char operator;

    public Operator(Character c) {
        operator = c;
    }

    @Override
    public boolean canUse(Character c) {
        return c == operator;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Object o) {
        Operator u = (Operator) o;
        return this.priority - u.getPriority();
    }

    @Override
    public UnitGroup operate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
