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
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service s = new Service();
        Producer producer = new Producer(s);
        Consumer consumer = new Consumer(s);
    }
    
}
