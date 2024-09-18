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
public interface OperatorInterface {
    public UnitGroup operate();
    public boolean canUse(Character c);
}
