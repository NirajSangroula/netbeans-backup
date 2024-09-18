/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author sangr
 */
public class SystemTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd LLLL HH: hhh mm ss");
        System.out.println(sdf.format(d));
        
    }
    
}
