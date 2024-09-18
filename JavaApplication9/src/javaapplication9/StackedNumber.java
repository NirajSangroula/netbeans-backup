/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author sangr
 */
public class StackedNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 0;
        do {
            Scanner s = new Scanner(System.in);
            try {
                System.out.println("Enter number or negative number to exit: ");
                n = s.nextLong();
                if(isStacked(n))
                    System.out.println(n+" is a stacked number");
                else
                    System.out.println(n+" is not a stacked number");
            } catch (NegativeNumberException e) {
                System.out.println("Negative number entered");
            }
        } while (n >= 0);
    }

    public static boolean isStacked(long number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
        int stackedNumber = 0;
        for (int i = 1; i <= (number + 1); i++) {
            if (stackedNumber == number) {
                return true;
            }
            if (stackedNumber > number) {//Dummy comment: Impossible to be stacked. I would rather extract a function named isStackedImpossible
                return false;
            }
            stackedNumber += i;//Next stacked number
        }
        return false;//Dummy commentIf number excreeds max value.
    }
}
