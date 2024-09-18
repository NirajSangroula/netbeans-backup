/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;
import java.util.regex.*;
/**
 *
 * @author sangr
 */
public class PatternMatcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("niraj");
        System.out.println(p.matcher("nirajj").find());
    }
    
}
