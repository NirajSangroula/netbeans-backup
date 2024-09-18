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
public class FractionalSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upto");
        int n = scanner.nextInt();
        float s = 0;
        for(int i = 1; i <= n; i++)
            s += (float)1/i;
        System.out.println("Sum upto 1/"+n+" = "+s);
    }
    
}
