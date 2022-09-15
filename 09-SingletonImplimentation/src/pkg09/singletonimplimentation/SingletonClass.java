/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.singletonimplimentation;
import java.text.SimpleDateFormat;  
import java.util.Date;  
/**
 *
 * @author dell
 */
public class SingletonClass
{
    private static SingletonClass S1;
    
    private SingletonClass()
    {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        System.out.println(formatter.format(date)); 
    }
    
    public static void CreateInstance()
    {
        
        if(S1==null)
        {
         System.out.println("Singleton Class creataed");
         S1=new SingletonClass();   
        }
        else
        {
            System.out.println("instance Already created");
        }        
    }
    
    public static SingletonClass getInstance()
    {
        return S1;
    }
    
    public static void DisplayInstance()
    {
       
    }   
    
}
