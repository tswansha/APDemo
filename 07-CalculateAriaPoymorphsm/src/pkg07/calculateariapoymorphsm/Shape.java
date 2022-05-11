/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.calculateariapoymorphsm;

/**
 *
 * @author dell
 */
public class Shape 
{
   public void CalculateAria(double input1)
   {
       System.out.println("Aria of square is="+input1*input1);
   }
   
   public void CalculateAria(double input1,double input2)
   {
       System.out.println("Aria of rectangle is="+input1*input2);
   } 
   
   public void CalculateAria(double input1,double input2,double input3)
   {
       System.out.println("Aria of Trapizoid is="+(input1+input2)/2*input3);
   } 
   
   
}
