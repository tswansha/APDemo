/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg06.calculateariainheriance;

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
    
    protected void setLength1(double input1)
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
    
    protected void setLength2(double input2)
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
    
    protected void setWidth(double input3)
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
    
    protected void setRadiuse1(double input1)
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
    
    protected void setRadiuse2(double input2)
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
    
    protected void setAria(double input)
    {
        if(input>=0)
        {
            this.aria=input;
        }
        else
        {
            System.out.println("Length cannot be less than 0");
        }
        
    }
    
    protected double getRadiuse1()
    {
        return this.radius1;
    }
    
    protected double getRadiuse2()
    {
        return this.radius2;
    }
    
    protected double getAria()
    {
        return this.aria;
    }
    
    protected double getPI()
    {
        return this.PI;
    }
 
}
