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
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n = s.nextInt();
        if(n > 15)
            System.out.println("Number "+n+" is greater than 15");
        else
            System.out.println("Number "+n+" is not greater than 15");
    }
    
}
