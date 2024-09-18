/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.tests.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class Thread1 implements Runnable {

    public Thread1() {

    }

    @Override
    public void run() {
        call();
    }

    private void call() {
        try {
            System.out.print("[43");
            Thread.sleep(500);
            System.out.println("]");
        } catch (InterruptedException e) {

        }
    }

    public void startThreading() {
        Thread thread = new Thread(this, "Custom Thread");
        System.out.println("Custon Thread, " + thread + "Started");
        thread.start();
    }

}
