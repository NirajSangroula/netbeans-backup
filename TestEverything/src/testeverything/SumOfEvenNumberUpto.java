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
public class SumOfEvenNumberUpto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number upto");
        int n = scanner.nextInt();
        long sum = 0;
        for(int i = 2; i <= n; i+=2)
            sum += i;
        System.out.println("Sum of even numbers upto "+n+" is "+sum);
    }
    
}
