/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerandconsumer;

/**
 *
 * @author sangr
 */
public class Producer implements Runnable {

    Service service;
    Thread thread;

    Producer(Service s) {
        service = s;
        thread = new Thread(this, "New thread");
        thread.start();
    }

    @Override
    public void run() {
        synchronized (service) {
            int i = 1;
            while (true) {
                service.put(i++);
            }
        }
    }
}
