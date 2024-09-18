/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.*;

/**
 *
 * @author sangr
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        inputStreamReader();
    }

    private static void systemIn() throws IOException {
        int c = System.in.read();
        System.out.println((char)c);
        c = System.in.read();
        System.out.println((char)c);
    }

    private static void inputStreamReader() throws IOException {
        InputStreamReader iSR = new InputStreamReader(System.in);
        char c = (char)iSR.read();
        System.out.println(c);
        c = (char)iSR.read();
        System.out.println(c);
    }

    private static void bufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] c = new String[2];
        c[0] = br.readLine();
        c[1] = br.readLine();
        System.out.println(br.readLine());
    }

    private static void BufferedInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        int t = bis.read();
        System.out.println(bis.available()+" "+(char)t);
    }
    
}
