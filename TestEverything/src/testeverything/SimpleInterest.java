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
public class SimpleInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal, rate and time");
        int p = s.nextInt();
        float r = s.nextFloat();
        float t = s.nextFloat();
        double sI = (double)p * t * r / 100;
        System.out.printf("The simple interest of %d on %f years with %f rate of interest is %f", p, t, r, sI);
    }
    
}
