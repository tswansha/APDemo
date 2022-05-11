/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.calculateariapoymorphsm;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CalculateAriaPoymorphsm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Choice");
        System.out.println("Rectange =1");
        System.out.println("Trapizoid =2");
        System.out.println("Circle =3");
        System.out.println("Ellips=4");
        System.out.print("Square =5");
        int Choice=sc.nextInt();
        
        Shape S1=new Shape();
        
        CricularShape S2=new CricularShape();
        
        double input1;
        double input2;
        double input3;
        double output;
        
        if(Choice==1)
        {
            System.out.println("Please enter the length of Rectangle");
            input1=sc.nextDouble();
            
            System.out.println("Please enter the width of Rectangle");
            input2=sc.nextDouble();
            
            S1.CalculateAria(input1, input2);
        }
        else if(Choice==2)
        {
            System.out.println("Please enter the length1 of Trapizoid");
            input1=sc.nextDouble();
            
            System.out.println("Please enter the length2 of Trapizoid");
            input2=sc.nextDouble();
            
            System.out.println("Please enter the width of Trapizoid");
            input3=sc.nextDouble();
            
            S1.CalculateAria(input1, input2, input3);
        }
        else if(Choice==3)
        {
            System.out.println("Please enter the radiuse of Circle");
            input1=sc.nextDouble();
            
            S2.CalculateAria(10, 15, 8);
            S2.CalculateAria(input1);
        }
        else if(Choice==4)
        {
        }
        else if(Choice==5)
        {
            System.out.println("Please enter the length of square");
            input1=sc.nextDouble();
            
            
            S1.CalculateAria(input1);
        }
    }
    
}
