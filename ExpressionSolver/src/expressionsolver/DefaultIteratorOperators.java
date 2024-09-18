/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver;

import expressionsolver.abstractclasses.Operator;
import expressionsolver.operators.Divide;
import expressionsolver.operators.Minus;
import expressionsolver.operators.Multiply;
import expressionsolver.operators.Plus;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Niraj Sangroula
 */
public class DefaultIteratorOperators implements Iterator{

    private final ArrayList<Operator> operators;
    private int index = 0;
    public DefaultIteratorOperators(){
        operators = new ArrayList<>();
        operators.add(new Divide());
        operators.add(new Multiply());
        operators.add(new Plus());
        operators.add(new Minus());
    }
    @Override
    public boolean hasNext() {
        try{
            operators.get(index);
            return true;
        }
        catch(IndexOutOfBoundsException e){
            return false;
        }
    }

    @Override
    public Object next() {
        return operators.get(index++);
    }
}
