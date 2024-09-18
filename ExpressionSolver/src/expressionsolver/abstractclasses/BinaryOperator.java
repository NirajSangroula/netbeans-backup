/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver.abstractclasses;

import expressionsolver.UnitGroup;
import expressionsolver.interfaces.BinaryOperatorInterface;

/**
 *
 * @author Niraj Sangroula
 */
public abstract class BinaryOperator extends Operator implements BinaryOperatorInterface{
    
    public BinaryOperator(Character c) {
        super(c);
    }
}
