/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionsolver;
import java.util.Scanner;

/**
 *
 * @author Niraj Sangroula
 */
public class ExpressionSolver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter expression");
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Calculator().calculate(scanner.nextLine()));
    }
}