/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeverything;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Niraj Sangroula
 */
public class AbsoluteValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        long n = scanner.nextLong();
        if(n < 0)
            n*=-1;
        System.out.println(n);
        
    }
    
}
