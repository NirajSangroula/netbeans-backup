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
public class Multiply extends BinaryOperator{

    public Multiply() {
        super('*');
        this.priority = 9;
    }

    @Override
    public void operate(UnitGroup unitGroup) {
        if (unitGroup.hasPreceedingUnitGroup()) {
            UnitGroup preceedingUnitGroup = unitGroup.preceedingUnitGroup;
            Double firstUnitValue = unitGroup.unit().value().doubleValue();
            Double secondUnitValue = preceedingUnitGroup.unit().value().doubleValue();
            preceedingUnitGroup.unit().setValue(secondUnitValue * firstUnitValue);
            if (unitGroup.hasSuceedingUnitGroup()) {
                unitGroup.succeedingUnitGroup.preceedingUnitGroup = preceedingUnitGroup;
                preceedingUnitGroup.succeedingUnitGroup = unitGroup.succeedingUnitGroup;
            }
        }
    }
}
