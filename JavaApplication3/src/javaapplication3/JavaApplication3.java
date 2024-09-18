/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import javaapplication3.numbers.Prime;
import java.util.Scanner;
/**
 *
 * @author sangr
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prime prime = new Prime();
        Scanner scanner = getScanner();
        long input;
        do{
            System.out.println("Enter a number to check if it is prime: enter 0 to exit");
            input = scanner.nextInt();
            prime.setNumber(input);
            if(prime.is())
                System.out.println(input+" is Prime number");
            else
                System.out.println(input+" isn't a Prime number");
        }
        while(input != 0);
        System.out.println("Enter range of number to display: eg 1 10");
        int initial = scanner.nextInt();
        long last = scanner.nextInt();
        System.out.println("************ Prime numbers "+initial+" to "+last+" ********************");
        for(long n: prime.getNumbersInRange(initial, last)){
            System.out.print(n+"\t");
        }
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
    
}
