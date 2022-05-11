/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.deligatedemo;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Shape 
{
        //Define the data in shape class as attributes 
    public double length1=0.0;
    public double length2=0.0;
    public double width=0.0;
    public double radius1=0.0;
    public double radius2=0.0;
    public double aria=0.0;
    public double PI=Math.PI;
            
    //Method for calulate rectange or paraloogram
    public void CalculateRectangle(double length,double width)
    {
        this.length1= length;
        this.width=width;
        aria=length1*width;
        System.out.println("Aria of Rectangle or Paralogram ="+aria);
        
    } 
    //Calculate Trapizoid
    public double CalculateTrapizoid(double length1,double length2 ,double width)
    {
        aria= (length1+length2)/2*width;
        return aria;
    }
    
    public double CalculateCircle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the radiuse of circle :");
        this.radius1=sc.nextDouble();
        
        return this.PI*this.radius1*this.radius1;
    }
    
    public void CalculateEllips()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the radiuse1 of Ellips :");
        this.radius1=sc.nextDouble();

        System.out.print("Please enter the radiuse2 of Ellips :");
        this.radius2=sc.nextDouble();   
        
        aria=this.PI*this.radius1*this.radius2;
        
        System.out.println("Aria of Ellips ="+aria);

    }
    
}
