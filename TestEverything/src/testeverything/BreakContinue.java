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
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    hello:for(int i = 1; i <= 10; i++){
            for(int j = 10; j >= 1; j--){
                if(i == 5)
                    continue hello;
                System.out.println(i+" and "+j);
            }
            System.out.println("Yeah");
        }
    }
    
}
