/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploringjavalang;

import java.io.IOException;

/**
 *
 * @author Niraj Sangroula
 */
public class ExploringJavaLang {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        final Runtime runtime = Runtime.getRuntime();
        final long freeMemory = runtime.freeMemory();
        System.out.println(runtime.totalMemory()+" "+freeMemory);
        Integer[] i = new Integer[10000];
        for(int r = 1; r <= 10000; r++)
            i[r-1] = r;
        System.out.println(freeMemory-runtime.freeMemory()+" "+runtime.freeMemory());   
        runtime.gc();
        System.out.println(runtime.freeMemory());
    }
    
}
