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
public class FractionalFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++)
            sum += (float)1/factorial(i);
        System.out.println("Sum of fraction of factorial = "+sum);
    }

    private static long factorial(int i) {
        long factorial = 1;
        for(int j = 1; j <= i; j++)
            factorial *= j;
        return factorial;
    }
    
}
