/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enacapsualtiondemo;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class EnacapsualtionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Shape S1=new Shape();
        
        
        //S1.CalCulateCircle(3.0);
        
        System.out.println("Value of PI ="+S1.getPI());
        System.out.println("Please  input radiuse of Circlr ");
        
        Scanner sc=new Scanner(System.in);
        double input=sc.nextDouble();
        S1.setRadiuse(input);
        
        System.out.println("Radiouse of cricle is "+S1.getRadiuse());
        
        

    }
    
}
