/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.iteratorimplimentation;

/**
 *
 * @author dell
 */
public class IteratorImplimentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        NameRepo nr=new NameRepo();
        
        for(Iterator it=nr.getIterator();it.HasNext();)
        {
            String name=(String) it.next();
            System.out.println("Name ="+name);
        }
    }
    
}
