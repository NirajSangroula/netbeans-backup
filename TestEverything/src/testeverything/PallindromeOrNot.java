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
public class PallindromeOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = scanner.nextLong();
        long temp = n;
        long reverse = 0;
        while(n > 0){
            long remainder = n % 10;
            reverse = reverse*10 + remainder;
            n/=10;
        }
        if(reverse == temp)
            System.out.println(temp+" is Pallindrome number");
        else
            System.out.println(temp+" is not a Pallindrome number");
    }
    
}
