/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
  
    /**
     * Test of CalculatedSalary method, of class Employee.
     */
    @Test
     public void testCalculatedSalary() {
//        System.out.println("CalculatedSalary");
//        double bonus = 0.0;
//        double taxRate = 0.0;
//        Employee instance = null;
//        instance.CalculatedSalary(bonus, taxRate);
//        // TODO review the generated test code and remove the default call to fail.
//       
    // manual
     double salary = 5000;
     double bonusTwo = 1000;
     double taxRateTwo = 0.15;
     
     //Create an Instance of Employee
     Employee empl = new Employee(salary);
     
     // Expecyed | Acutal
     double expected = 5100 ;
     double actual = empl.CalculatedSalary(bonusTwo, taxRateTwo);
            
     //Implement Test 
        Assertions.assertEquals(expected,actual);
             
             
             
             
    }    
}
