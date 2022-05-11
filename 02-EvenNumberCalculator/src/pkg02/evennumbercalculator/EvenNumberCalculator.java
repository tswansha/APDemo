/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.evennumbercalculator;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class EvenNumberCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the upper limit :");
        int upper=sc.nextInt();
        int sum=0;
        
        for(int counter=0;counter<=upper;counter++)
        {
            if(counter%2==0)
            {
                sum=sum+counter;
            }
        }
        
        System.out.println("Sum of all even numbers ="+sum);
        
    }
    
}
