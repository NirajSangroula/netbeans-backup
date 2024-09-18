/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver.operators;

import expressionsolver.UnitGroup;
import expressionsolver.abstractclasses.Operator;

/**
 *
 * @author Niraj Sangroula
 */
public class SmallBraces extends Operator{

    public SmallBraces() {
        super('(');
    }

    @Override
    public UnitGroup operate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
