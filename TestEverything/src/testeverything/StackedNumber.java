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
public class StackedNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        boolean flag = false;
        int stackedNo = 1;
        for(int i = 2; i <= n+1; i++){
            if(n == stackedNo)
                flag = true;
            stackedNo += i;
        }
        if(flag)
            System.out.println(n+" is a stacked number");
        else
            System.out.println(n+" is not a stacked number");
    }
    
}
