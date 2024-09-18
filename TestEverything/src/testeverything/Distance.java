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
public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial velocity, time and acceleration");
        float u = scanner.nextFloat();
        int t = scanner.nextInt();
        float a = scanner.nextFloat();
        double s = u * t + (float)1/2*a * t * t;
        System.out.print("Distance travelled by a body moving with initial velocity ");
        System.out.print(u+" with acceleration of "+a+" after time "+t+" is "+s);
    }
    
}