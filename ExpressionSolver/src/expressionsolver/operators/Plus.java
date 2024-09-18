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
public class Plus extends BinaryOperator {

    public Plus() {
        super('+');
        this.priority = 8;
    }

    @Override
    public void operate(UnitGroup unitGroup) {
        if (unitGroup.hasPreceedingUnitGroup()) {
            UnitGroup preceedingUnitGroup = unitGroup.preceedingUnitGroup;
            Double firstUnitValue = unitGroup.unit().value().doubleValue();
            Double preeceedingUnitValue = preceedingUnitGroup.unit().value().doubleValue();
            if(preceedingUnitGroup.presymbol instanceof Minus){
                preceedingUnitGroup.unit().setValue(preeceedingUnitValue - firstUnitValue);
            }
            else
                preceedingUnitGroup.unit().setValue(preeceedingUnitValue + firstUnitValue);
            if (unitGroup.hasSuceedingUnitGroup()) {
                unitGroup.succeedingUnitGroup.preceedingUnitGroup = preceedingUnitGroup;
                preceedingUnitGroup.succeedingUnitGroup = unitGroup.succeedingUnitGroup;
            }
        }
    }
}
