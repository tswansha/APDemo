/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05.calculateariaencapsulation;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Shape 
{
        //Define the data in shape class as attributes 
    private double length1=0.0;
    private double length2=0.0;
    private double width=0.0;
    private double radius1=0.0;
    private double radius2=0.0;
    private double aria=0.0;
    private double PI=Math.PI;
    
    public void setLength1(double input1)
    {
        if(input1>=0)
        {
            this.length1=input1;
        }
        else
        {
            System.out.println("Length cannot be less than 0");
        }
    }
    
    public void setLength2(double input2)
    {
        if(input2>=0)
        {
            this.width=input2;
        }
        else
        {
            System.out.println("Length cannot be less than 0");
        }
        
    }    
    
    public void setWidth(double input3)
    {
        if(input3>=0)
        {
            this.width=input3;
        }
        else
        {
            System.out.println("Length cannot be less than 0");
        }
        
    }
    
    public void setRadiuse1(double input1)
    {
        if(input1>=0)
        {
            this.radius1=input1;
        }
        else
        {
            System.out.println("Length cannot be less than 0");
        }
        
    }
    
    public void setRadiuse2(double input2)
    {
        if(input2>=0)
        {
            this.radius2=input2;
        }
        else
        {
            System.out.println("Length cannot be less than 0");
        }
        
    }
    
    public double getAria()
    {
        return this.aria;
    }
    
    public double getPI()
    {
        return this.PI;
    }
    
    
    
    
    
    
    
    //Method for calulate rectange or paraloogram
    public void CalculateRectangle(double length,double width)
    {
        this.setLength1(length);
        this.setWidth(width);
        aria=length1*width;
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
