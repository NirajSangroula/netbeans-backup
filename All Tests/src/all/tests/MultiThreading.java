/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.tests;

import all.tests.threads.Thread1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread1 t1 = new Thread1();
        t.startThreading();
        t.startThreading();
        
    }
    
}
