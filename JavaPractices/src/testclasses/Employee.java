/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclasses;

/**
 *
 * @author sangr
 */
public class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double salaryRate(){
        return salary;
    }
    public double salary(int months){
        return salary * months;
    }
    public void printName(){
        System.out.println(this.name);
    }
    
    protected void finalize(){
        System.out.println("Closing employee object....................");
    }

    public void setName(String name) {
        this.name = name;
    }
    void hello(){
        System.out.println("Hello");
    }
}
