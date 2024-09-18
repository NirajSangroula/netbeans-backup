/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeverything;

import java.io.IOException;
/**
 *
 * @author Niraj Sangroula
 */
public class MoreAboutSwitches {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a, A , b or B");
        char n = (char)System.in.read();
        switch (n) {
            case 'a': 
            case 'A': System.out.println("appleApple");break;
            case 'b':
            case 'B': System.out.println("ballBall");break;
            default: System.out.println("You gave wrong input;");
        }
    }

}
