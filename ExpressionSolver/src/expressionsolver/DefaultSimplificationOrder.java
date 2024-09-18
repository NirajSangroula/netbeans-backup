/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver;

import expressionsolver.interfaces.SimplificationOrderInterface;
import java.util.Iterator;

/**
 *
 * @author Niraj Sangroula
 */
public class DefaultSimplificationOrder implements SimplificationOrderInterface{
    @Override
    public Iterator iterator() {
        return new DefaultIteratorOperators();
    }
    
}
