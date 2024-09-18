/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver;
import expressionsolver.interfaces.ExpressionSolver;
/**
 *
 * @author Niraj Sangroula
 */
public class Calculator implements ExpressionSolver{

    @Override
    public double calculate(String s) {
        UnitGroup u = new UnitGroup(s, true);
        return (Double)u.unit().value();
    }
}