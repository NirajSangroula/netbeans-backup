/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sangr
 */
@Retention(RetentionPolicy.RUNTIME)
@interface GetName{
    String s();
}
public class Food {
    @GetName(s = "My Sastraastra") 
    public String getName(){
        return "hello";
    }
    public static void getInfo(int ... a){
        System.out.println(a[0]);
        Food food = new Food();
        Class<?> c = food.getClass();
        try {
            System.out.println(c.getMethod("getName").getAnnotation(GetName.class).s());
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
