/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author sangr
 */
public class TypeWrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean b = new Boolean("true");
        System.out.println(b.booleanValue());
        Double d = new Double("43.53343");
        System.out.println(d.intValue()*10);
    }
    
}
