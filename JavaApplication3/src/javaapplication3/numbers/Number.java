/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.numbers;

/**
 *
 * @author sangr
 */
public abstract class Number {
    protected long number;
    public void setNumber(long number){
        this.number = number;
    }
    public abstract boolean is();
    public abstract long[] getNumbersInRange(int initial, long upto);
}