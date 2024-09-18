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
public class Service {
    int data;
    boolean produced = false;
    int get(){
        if(!produced){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("Returned "+data);
        notify();
        produced = false;
        return data;
    }
    void put(int data){
        while(produced){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted");
            }
        }
        this.data = data;
        System.out.println("Set data "+ this.data);
        produced = true;
        notify();
    }
}
