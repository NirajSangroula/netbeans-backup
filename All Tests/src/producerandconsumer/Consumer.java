/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerandconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sangr
 */
public class Consumer implements Runnable{
    Service service;
    Thread consumerThread;
    boolean produced = false;
    Consumer(Service s){
        this.service = s;
        consumerThread = new Thread(this, "ConsumerThread");
        consumerThread.start();
    }

    @Override
    public void run() {
        synchronized (service){
            while(true)
                service.get();
        }
    }
}
