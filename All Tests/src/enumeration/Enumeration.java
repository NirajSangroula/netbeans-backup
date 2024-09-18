/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeration;

/**
 *
 * @author sangr
 */

enum Color{
    RED(200), WHITE(500), BLUE(143), GREEN(433);
    int i;
    Color(int i){
        this.i = i;
    }
}
public class Enumeration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Color c = Color.RED;
        System.out.println(Color.valueOf("RED")+" "+c.compareTo(Color.BLUE));
        
    }
    
}
