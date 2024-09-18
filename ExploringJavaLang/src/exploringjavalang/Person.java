/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploringjavalang;

import java.util.Iterator;

/**
 *
 * @author Niraj Sangroula
 */
public class Person<T> implements Iterator{
    private T[] t;
    private int index = 0;
    public Person(T[] t){
        this.t = t;
    }
    @Override
    public boolean hasNext() {
        return (index+1 < t.length);
    }

    @Override
    public Object next() {
        return t[index++];
    }
    
}
