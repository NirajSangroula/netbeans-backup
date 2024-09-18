/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeverything;

import java.util.Scanner;

/**
 *
 * @author Niraj Sangroula
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        try {
            short n = scanner.nextShort();
            short temp = n;
            if (n > 999) {
                throw new Exception("Invalid 3 digit number damid...");
            }
            int a = n % 10;
            n /= 100;
            int c = n % 10;
            System.out.println("Sum of digits of " + temp + " is " + (a + c));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void easyWay(int n) {
        int temp = n;
        int sum = 0;
        sum += (n % 10);
        n /= 10;
        sum += (n % 10);
        n /= 10;
        sum += (n % 10);
        System.out.println("Sum of digits of " + temp + " = " + sum);
    }

}
