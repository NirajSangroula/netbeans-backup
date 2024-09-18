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
public class Prime extends Number{
    @Override
    public boolean is() {
        int count = noOfDividingNumbers();
        return (count == 2);
    }

    @Override
    public long[] getNumbersInRange(int initial, long upto) {
        long maxNumbers = 1 + (upto - initial);
        long[] numberRange = new long[(int)maxNumbers];
        int nextIndex = 0;
        for(long i = (long)initial; i <= upto; i++){
            this.number = i;
            if(is())
                numberRange[nextIndex++] = i;
        }
        return getArrayUptoIndex(numberRange, nextIndex);
    }
    
    private int noOfDividingNumbers(){
        int count = 0;
        for(long i = 1; i <= this.number; i++){
            if(this.number % i == 0)
                count ++;
        }
        return count;
    }

    private long[] getArrayUptoIndex(long[] numberRange, int nextIndex) {
        long [] retValue = new long[nextIndex];
        System.arraycopy(numberRange, 0, retValue, 0, nextIndex);
        return retValue;
    }
}
