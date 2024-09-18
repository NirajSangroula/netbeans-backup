/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;

/**
 *
 * @author sangr
 */
public class Currents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User niraj = new User("Niraj", 15);
        niraj.printData();
        User nitesh = (User)niraj.clone();
        nitesh.setName("Nitesh");
        nitesh.printData();
        niraj.printData();
    }
    
}
