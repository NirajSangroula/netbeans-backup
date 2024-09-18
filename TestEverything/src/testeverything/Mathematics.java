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
public class Mathematics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long a = l % 10;
        l /= 10;
        long b = l % 10;
        l /= 10;
        long c = l % 10;
        System.out.println("Reverse = "+(a*100+b*10+c));
    }
}
