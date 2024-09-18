/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sangr
 */
public class ListsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap();
        m.put("sastraastra", 53);
        m.put("next", 5355);
        System.out.println(m.get("next"));
        for(String s:m.keySet())
            System.out.println(s+"->"+m.get(s));
        
    }

    private static void just() {
        List<String> a = new ArrayList();
        a.add("Malai chhodi mero chhaya");
        a.add("Kattai jharechha, Temi samma aai pugda saanjhai parechha");
        System.out.println(a.get(0));
        for(String s: a)
            System.out.println(s);
    }
    
}
