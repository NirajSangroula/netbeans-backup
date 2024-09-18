/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver.interfaces;

import expressionsolver.UnitGroup;

/**
 *
 * @author Niraj Sangroula
 */
public interface BinaryOperatorInterface extends OperatorInterface{

    /**
     *
     * @param unitGroup
     */
    public void operate(UnitGroup unitGroup);
}
