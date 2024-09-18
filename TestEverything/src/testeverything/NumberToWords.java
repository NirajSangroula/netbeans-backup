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
public class NumberToWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 5");
        byte n = scanner.nextByte();
        String s;
        if(n == 1)
            s = "One";
        else if(n == 2)
            s = "Two";
        else if(n == 3)
            s = "Three";
        else if(n == 4)
            s = "Four";
        else if(n == 5)
            s = "Five";
        else
            s = "Other than 1 to 5";
        System.out.println(s);
        
    }
    
}
