/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author sangr
 */
public class DaysConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter days: ");
        int days = s.nextInt();
        System.out.println("Number of months is "+(days/30)+" and days is "+(days%30)+".");
    }
    
}
