/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg06.calculateariainheriance;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Circle extends Shape 
{
    public double CalculateCircle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the radiuse of circle :");
        double input=sc.nextDouble();
        setRadiuse1(input);
        
        return getPI() *getRadiuse1()*getRadiuse1();
    }
    
    public void CalculateEllips()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the radiuse1 of Ellips :");
        double input1=sc.nextDouble();
        setRadiuse1(input1);

        System.out.print("Please enter the radiuse2 of Ellips :");
        double input2=sc.nextDouble();   
        setRadiuse2(input2);
        
        double aria=getPI()*getRadiuse1()*getRadiuse2();
        setAria(aria);
        
        System.out.println("Aria of Ellips ="+getAria());

    }
}
