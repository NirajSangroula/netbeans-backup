/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver.operators;

import expressionsolver.UnitGroup;
import expressionsolver.abstractclasses.BinaryOperator;

/**
 *
 * @author Niraj Sangroula
 */
public class Minus extends BinaryOperator{

    public Minus(){
        super('-');
        this.priority = 7;
    }

    @Override
    public void operate(UnitGroup unitGroup) {
        if (unitGroup.hasPreceedingUnitGroup()) {
            UnitGroup preceedingUnitGroup = unitGroup.preceedingUnitGroup;
            Double firstUnitValue = unitGroup.unit().value().doubleValue();
            Double preceedingUnitValue = preceedingUnitGroup.unit().value().doubleValue();
            if(preceedingUnitGroup.presymbol instanceof Minus){
                preceedingUnitGroup.unit().setValue(firstUnitValue + preceedingUnitValue);
            }
            else
                preceedingUnitGroup.unit().setValue(preceedingUnitValue - firstUnitValue);
            if (unitGroup.hasSuceedingUnitGroup()) {
                unitGroup.succeedingUnitGroup.preceedingUnitGroup = preceedingUnitGroup;
                preceedingUnitGroup.succeedingUnitGroup = unitGroup.succeedingUnitGroup;
            }
        }
    }
}
