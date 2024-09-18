/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currents;
import java.io.PrintWriter;
/**
 *
 * @author sangr
 */
public class User{
    private String name;
    private int age;
    @Override
     protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return this;
        }
    }
    User(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void printData(){
        printer().println("Name: "+name);
        printer().println("Age: "+age);
    }
    PrintWriter printer(){
        return new PrintWriter(System.out, true);
    }
}
