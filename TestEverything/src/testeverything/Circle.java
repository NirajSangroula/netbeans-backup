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
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float pi = (float)22/7;;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r = s.nextFloat();
        double area = pi * r * r;
        double circumference = 2 * pi * r;
        System.out.println("The area of circle with radius "+ r +" is "+ area +" and circumference = "+circumference);
        System.out.printf("The area of circle with radius %f is %f and circumference = %f.\n", r, area, circumference);
    }
    
}
