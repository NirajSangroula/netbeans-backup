/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeverything;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

/**
 *
 * @author Niraj Sangroula
 */
public class TestEverything {

    /**
     * @param arguements
     */
    public static void main(String[] arguements) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] c = new String[2];
        c[0] = br.readLine();
        c[1] = br.readLine();
        System.out.println(Integer.valueOf(c[0]));
    }

    private static void inputStreamReader() {
        InputStreamReader iSR = new InputStreamReader(System.in);
        char c;
        try {
            c = (char) iSR.read();
            System.out.println(c);
            c = (char) iSR.read();
            System.out.println(c);
        } catch (IOException ex) {
        }
    }

    private static void oneScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean booleans = scanner.nextBoolean();
        int sum = a + b;
        System.out.printf("Sum of %d and %d is %d.", a, b, sum);
        System.out.println(booleans);
    }
}
