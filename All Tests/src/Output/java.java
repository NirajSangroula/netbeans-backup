/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author sangr
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("hello.txt");
        
        PrintWriter pw = new PrintWriter(System.out, false);
        pw.println("Malaai na sodha kaha dukchha ghaau \n");
    }

    private static void systemOutWrite() {
        System.out.write((int)'b');
        System.out.write('\n');
    }
    
}
