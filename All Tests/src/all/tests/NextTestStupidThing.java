/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.tests;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.pow;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sangr
 */
public class NextTestStupidThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] i = new Integer[1];
        try {
            ProcessBuilder p = new ProcessBuilder("notepad.exe", "sastra");
            p.start();
        } catch (Exception ex) {
            System.out.println("Failed Opening Notepad");
        }
    }

    private static void sameLikeStringBuilder() {
        StringBuffer s = new StringBuffer("Sastraastra");
        s.ensureCapacity(4);
        s.append("sas").append("t");
        s.insert(1, "t");
        System.out.println(s.reverse().deleteCharAt(0).delete(0, 6).replace(1, 1,"S"));
    }

    private static void hello() {
        char[] c = {'n'};
        String s = new String(c, 0, 1);
        System.out.println(s);
        System.out.println(pow(4, 2));
        System.out.println("Sastraastra".length());
        System.out.println(s.matches("^[A-Z]$"));
    }
    
}
