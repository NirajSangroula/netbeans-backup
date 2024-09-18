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
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        if(a > b && a > c)
            System.out.println(a+" is greatest");
        else if(b > a && b > c)
            System.out.println(b+" is greatest");
        else if(c > a && c > a)
            System.out.println(c+" is greatest");
        else
            System.out.println("Numbers are equal to "+a);
    }

    private static void positiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        if (n > 0) {
            System.out.println(n + " is positive number");
        } else if (n < 0) {
            System.out.println(n + " is negative number");
        } else {
            System.out.println("It is neither positive negative");
        }
    }

    private static void greatest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    private static void isOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        long n = scanner.nextLong();
        if (n % 2 == 1) {
            System.out.println(n + " is an odd number");
        } else {
            System.out.println(n + " is an even number");
        }
    }

}
