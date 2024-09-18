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
public class OneToHundred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        long n = scanner.nextLong();
        System.out.println("Using for loop");
        for(long i = 1; i <= n; i+=2)
            System.out.println("For loop-->"+i);
        System.out.println("Using while loop");
        long j = 1;
        while(j <= n){
            System.out.println("while loop-->"+j);
            j+=2;
        }
        long k = 1;
        System.out.println("Using do while loop");
        do{
            System.out.println("do while loop-->"+k);
            k+=2;
        }
        while(k <= n);
    }
    
}
