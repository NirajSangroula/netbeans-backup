/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploringjavalang;

import java.lang.Iterable;
import java.util.Iterator;

/**
 *
 * @author Niraj Sangroula
 */
public class Members implements Iterable{
    private Person person;
    public Members(){
        String s[] = {"hello", "How", "Are", "You"};
        person = new Person<>(s);
    }
    @Override
    public Iterator iterator() {
        return person;
    }
    
}
