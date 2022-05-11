/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.deligatedemo;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class DeligateDemo {

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
        System.out.print("Paralogram =5");
        int Choice=sc.nextInt();
        
        //Create Object of Deligate Class 
        ShapeDeligate SD=new ShapeDeligate();
        
        if(Choice==1)
        {
            SD.CalculateRectangleDeligate();
        }
    }
    
}
