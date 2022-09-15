/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.factorypatternimplimentation;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class FactoryPatternImplimentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int choice;
        Shape S1;
        ShapeFactory sf=new ShapeFactory();
        System.out.println("Please enter the Shape you wish to draw ");
        System.out.println("1=Circle ");
        System.out.println("2=Rectangle ");
        System.out.println("3=Square ");
        System.out.println("0=Quit ");
        
        
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        
        for(;choice!=0;)
        {
            S1=sf.getShape(choice);
            S1.Draw();
            System.out.println("Please enter the Shape you wish to draw ");
            System.out.println("1=Circle ");
            System.out.println("2=Rectangle ");
            System.out.println("3=Square ");
            System.out.println("0=Quit ");
            choice=sc.nextInt();
        }
        
    }
    
}
