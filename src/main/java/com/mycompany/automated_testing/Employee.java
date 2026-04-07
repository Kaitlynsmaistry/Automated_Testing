/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automated_testing;

/**
 *
 * @author lab_services_student
 */
public class Employee {
   
    private double salary;
    
    public Employee(double salary){
        this.salary = salary;
        
    }  
    public double CalculatedSalary(double bonus,double taxRate){
        double grossSalary = salary ;
        double tax = grossSalary * taxRate;
        return grossSalary - tax;
    }
    
    
}
