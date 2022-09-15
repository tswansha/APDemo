/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.compositimplimentation;

import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author dell
 */
public class Employee 
{
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
    
    public Employee(String name,String dept,,int salary)
    {
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        subordinates=new ArrayList<Employee>();
    }
    
    public void add(Employee e)
    {
        subordinates.add(e)
    }
    

    
}
