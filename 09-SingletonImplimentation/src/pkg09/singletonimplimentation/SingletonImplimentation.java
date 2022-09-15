/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.singletonimplimentation;

/**
 *
 * @author dell
 */
public class SingletonImplimentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SingletonClass.CreateInstance();
        SingletonClass object=SingletonClass.getInstance();
        SingletonClass.CreateInstance();
        SingletonClass object2=SingletonClass.getInstance();
        
    }
    
}
