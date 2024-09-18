/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(FileOutputStream f = new FileOutputStream("hello.sql")){
            String s = "Malai chhodi mero chhaya kattai jharechha \n Temi samma aai pugda saanjhai \n parechha";
            f.write(s.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void readFile() {
        FileInputStream f = null;
        try {
            f = new FileInputStream("hello.sql");
            String s = "";
            int character;
            do{
                character = f.read();
                if(character != -1)
                    s += new Character((char)character).toString();
            }
            while(character != -1);
            printWriter().println(s);
            
        } catch (FileNotFoundException ex) {
            PrintWriter print = printWriter();
            print.println("File not found");
        } catch (IOException ex) {
            printWriter().println("An IO exception occured " + ex);
        }
    }

    private static PrintWriter printWriter() {
        PrintWriter print = new PrintWriter(System.out, true);
        return print;
    }

    private static void writeToFile() throws FileNotFoundException {
        File f = new File("hello.sql");
        PrintWriter p = new PrintWriter(f);
        p.println("Bachha nai kahile khaaye theea");
        p.println("pani ma aaula chhopera sandhi nai kahile gare theea");
        p.close();
    }

    private static String String(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
