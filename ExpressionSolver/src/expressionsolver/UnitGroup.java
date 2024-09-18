/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver;

import expressionsolver.abstractclasses.BinaryOperator;
import expressionsolver.abstractclasses.Operator;
import expressionsolver.interfaces.SimplificationOrderInterface;
import expressionsolver.operators.Minus;
import expressionsolver.operators.Plus;
import java.util.ArrayList;

/**
 *
 * @author Niraj Sangroula
 */
public final class UnitGroup implements Comparable {

    public String expression;
    public ArrayList<UnitGroup> unitGroups;
    public BinaryOperator presymbol;
    public UnitGroup preceedingUnitGroup;
    public UnitGroup succeedingUnitGroup;
    public Unit unit;
    public SimplificationOrderInterface simplificationOrder;

    public UnitGroup() {

    }

    public UnitGroup(String expression, UnitGroup preceedingUnitGroup) {
        this(expression);
        this.preceedingUnitGroup = preceedingUnitGroup;
    }

    public UnitGroup(String expression, boolean isMain) {
        this.expression = expression;
        unit = new Unit(this);
        unitGroups = new ArrayList<>();
        simplificationOrder = new DefaultSimplificationOrder();
    }

    public UnitGroup(String expression) {
        this.expression = expression;
        unit = new Unit(this);
        unitGroups = new ArrayList<>();
        simplificationOrder = new DefaultSimplificationOrder();
        presymbol = identifyOperator(expression.charAt(0));
        if (isOperator(expression.charAt(0))) {
            this.expression = expression.substring(1);
        }
    }

    public boolean isOperator(Character c) {
        for (Object o : simplificationOrder) {
            Operator operator = (Operator) o;
            if (operator.canUse(c)) {
                return true;
            }
        }
        return false;
    }

    public Unit unit() {
        if (unit.value() == null) {
            createUnitGroups();
            sortUnitGroups();
            operateUnitGroupsUnit();
        }
        return unit;
    }

    public boolean hasUnitGroups() {
        return !unitGroups.isEmpty();
    }

    public UnitGroup lastUnitGroup() {
        return this.unitGroups.get(unitGroups.size() - 1);
    }

    public BinaryOperator getPreSymbol() {
        return presymbol;
    }

    public boolean hasPreceedingUnitGroup() {
        return this.preceedingUnitGroup != null;
    }

    public boolean hasSuceedingUnitGroup() {
        return this.succeedingUnitGroup != null;
    }

    public void createUnitGroups() {
        String exp = "";
        for (int i = 0; i < expression.length(); i++) {
            if (i == 0 && isOperator(expression.charAt(i))) {
                exp += expression.charAt(i);
                continue;
            }
            Character c = expression.charAt(i);
            if (isOperator(c)) {
                createUnitGroup(exp);
                exp = "";
            }
            exp += c;
        }
        if (hasUnitGroups()) {
            createUnitGroup(exp);
        }
    }

    public void createUnitGroup(String exp) {
        if (hasUnitGroups()) {
            UnitGroup lastUnitGroup = lastUnitGroup();
            this.unitGroups.add(new UnitGroup(exp, lastUnitGroup()));
            lastUnitGroup.succeedingUnitGroup = lastUnitGroup();
        } else {
            unitGroups.add(new UnitGroup(exp));
        }
    }

    private BinaryOperator identifyOperator(Character c) {
        for (Object o : simplificationOrder) {
            BinaryOperator operator = (BinaryOperator) o;
            if (operator.canUse(c)) {
                return operator;
            }
        }
        return new Plus();
    }

    protected void operateUnitGroupsUnit() {
        if (!hasUnitGroups()) {
            operateOnNoOperands();
        } else {
            operateOnUnitsOfUnitGroups();
        }
    }

    public void operateOnNoOperands() {
        this.unit.setValue(Double.valueOf(expression));
    }

    public void operateOnUnitsOfUnitGroups() {
        for (int i = 0; i < unitGroups.size(); i++) {
            UnitGroup unitGroup = unitGroups.get(i);
            unitGroup.presymbol.operate(unitGroup);
        }
        this.unit.setValue(grandResult());
    }

    private Number grandResult() {
        for(UnitGroup u: unitGroups){
            if(!u.hasPreceedingUnitGroup()){
                return u.unit().realValue();
            }
        }
        return this.unit().realValue();
    }

    @Override
    public int compareTo(Object o) {
        UnitGroup u = (UnitGroup) o;
        return this.presymbol.compareTo(u.getPreSymbol());
    }

    public void sortUnitGroups() {
        for (int i = 0; i < unitGroups.size() - 1; i++) {
            for (int j = i + 1; j < unitGroups.size(); j++) {
                if (unitGroups.get(i).compareTo(unitGroups.get(j)) < 0) {
                    UnitGroup temp = unitGroups.get(i);
                    unitGroups.set(i, unitGroups.get(j));
                    unitGroups.set(j, temp);
                }
            }
        }
    }
}