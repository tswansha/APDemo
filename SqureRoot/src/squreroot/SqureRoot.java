/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squreroot;

import java.util.Scanner;


/**
 *
 * @author dell
 */
public class SqureRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the upper limit :");
        int upper=sc.nextInt();
        
        for(int counter=0;counter<=upper;counter++)
        {
            System.out.println(counter*counter);
        }
        
    }
    
}
