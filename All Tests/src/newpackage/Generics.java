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
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(is5(5));
        System.out.println(is5(5.00));
        System.out.println(is5(5.054));
    }
    static <T extends Number> boolean is5(T t){
        return t.intValue() == 5;
    }
    
}
