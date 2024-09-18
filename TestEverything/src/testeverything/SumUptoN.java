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
public class SumUptoN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find sum upto");
        int n = scanner.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Sum from 1 to "+n+" is "+sum);
    }
    
}
