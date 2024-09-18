/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploringjavalang;

import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author Niraj Sangroula
 */
public class ExploringMathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)
            System.out.println(new Float(Math.random() * 1000).intValue());
        for(Package p:Package.getPackages())
            System.out.println(p.getName());
        try{
            throw new Exception();
        }
        catch(Exception e){
            for(StackTraceElement s: e.getStackTrace())
                System.out.println(s.getFileName()+" fname "+s.getMethodName()+" method name "+s.getLineNumber());
        }
        new Comparable<String>(){
            @Override
            public int compareTo(String o) {
                return 0;
            }
            
        };
        new Appendable(){
            @Override
            public Appendable append(CharSequence csq) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Appendable append(char c) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        new Iterator(){
            @Override
            public boolean hasNext() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object next() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        
        for(Object i: new Members())
            System.out.println(i);
    }
}
