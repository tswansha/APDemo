/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enacapsualtiondemo;

/**
 *
 * @author dell
 */
public class Shape
{
    private double Length=0.0;
    private  double width=0.0;
    private double radiuse=0.0;
    private double PI=Math.PI;
    private double aria=0.0;
    
    public double getPI()
    {
        return PI;
    }
    
    public double getAria()
    {
        return this.aria;
    }
    
    public void setRadiuse(double input)
    {
        if(input>=0)
        {
            this.radiuse=input;
        }
        else
        {
            System.out.println("Radiouse cannot be negative");
        }
    }
    
    public double getRadiuse()
    {
        return this.radiuse;
    }
    
    public void CalCulateCircle(double input)
    {
        this.radiuse=input;
        aria=PI*radiuse*radiuse;
        
        System.out.println("Aria of Circle ="+aria);
            
    }
    
}
