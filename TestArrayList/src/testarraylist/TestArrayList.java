/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author sangr
 */
public class TestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("niraj.txt");
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        }
        catch(FileNotFoundException exception){
            
        }
    }
    
}
