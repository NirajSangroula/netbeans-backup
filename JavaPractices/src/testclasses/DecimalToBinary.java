/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclasses;

/**
 *
 * @author sangr
 */
public class DecimalToBinary {
    public static long convert(int decimal){
        int n = decimal;
        long binary = 0;
        int nextMultiple = 1;
        while(n > 0){
            int rem = n % 2;
            binary += rem * nextMultiple;
            nextMultiple *= 10;
            n/=2;
        }
        return binary;
    }
}
