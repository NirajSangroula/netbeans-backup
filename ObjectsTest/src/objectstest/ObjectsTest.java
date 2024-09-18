/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectstest;
import objectstest.classes.Person;
/**
 *
 * @author sangr
 */
public class ObjectsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.hashCode());
        NewClass n = new NewClass();
        n.h = 43;
        System.out.println(n.h);
    }
    
}
