/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11.observerimplimentation;

/**
 *
 * @author dell
 */
public class BinaryObserver extends Observer 
{
    public BinaryObserver(Subject subject)
    {
        this.sub=subject;
        this.sub.Attach(this);
    }
    
    @Override 
    public void Update()
    {
        System.out.println("Binary Strig ="+Integer.toBinaryString(sub.getState()));
    }
    
}
