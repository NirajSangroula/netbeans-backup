/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author sangr
 * @param <T>
 */
public class Stack<T extends Number> implements StackInterface<T>{
    private T[] data;
    private int index;
    public Stack(T[] t){
        data = t;
        index = 0;
    }
    @Override
    public T pull() {
        return data[--index];
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public int capacity() {
        return data.length;
    }

    @Override
    public void push(T t) {
        data[index++] = t;
    }

    
}
