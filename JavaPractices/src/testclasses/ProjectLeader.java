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
public class ProjectLeader extends Employee{
    private final Employee[] managedEmployees;
    public ProjectLeader(String name, double salary, Employee[] managedEmployees) {
        super(name, salary);
        this.managedEmployees = managedEmployees;
    }
    public void managedEmployees(){
        for(Employee e: managedEmployees){
            System.out.println("******************************************************");
            e.printName();
            System.out.println("Salary per month: "+e.salaryRate());
        }
    }

    
}
