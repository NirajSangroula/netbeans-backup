/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author sangr
 */
public interface StackInterface<T extends Number> {
    public void push(T t);
    public T pull();
    public boolean isEmpty();
    public int size();
    public int capacity();
}
