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
public class ShapeDeligate 
{
    double input1;
    double input2;
    double input3;
    double output;
    Scanner sc=new Scanner(System.in);
    Shape S1=new Shape();
    
    public void CalculateRectangleDeligate()
    {
            System.out.println("Please enter the length of Rectangle or Paraloram");
            input1=sc.nextDouble();
            
            System.out.println("Please enter the width of Rectangle or Paraloram");
            input2=sc.nextDouble();
            
            S1.CalculateRectangle(input1, input2);
    }
}
