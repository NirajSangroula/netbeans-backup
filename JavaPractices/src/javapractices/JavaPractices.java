/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractices;
import testclasses.*;
/**
 *
 * @author sangr
 */
public class JavaPractices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] managed = new Employee[5];
        for (int i = 0; i < 5; i++) {
            managed[i] = new Employee("Employee no "+(i+1), (i+1) * 1900.43);
        }
        ProjectLeader leader = new ProjectLeader("Niraj Sangroula", 10000000.433, managed);
        leader.printName();
        System.out.println("Salary : "+leader.salaryRate());
        leader.managedEmployees();
    }
}