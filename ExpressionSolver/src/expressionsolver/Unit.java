/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver;

import expressionsolver.operators.Minus;

/**
 *
 * @author Niraj Sangroula
 * @param <N>
 */
public class Unit{
    UnitGroup unitGroup;
    Number n;
    public Unit(UnitGroup unitGroup){
        this.unitGroup = unitGroup;
    }
    public Number value(){
        return n;
    }
    public Number realValue(){
        if(unitGroup.presymbol instanceof Minus)
            return (double)(-1)*(double)n;
        return n;
    }
    public <N extends Number> void setValue(N n){
        this.n = n;
    }
    public UnitGroup getUnitGroup(){
        return unitGroup;
    }
}
