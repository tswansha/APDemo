/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11.observerimplimentation;

/**
 *
 * @author dell
 */
public class HexaObserver extends Observer 
{
    public HexaObserver(Subject subject)
    {
        this.sub=subject;
        this.sub.Attach(this);
    }
    
    @Override 
    public void Update()
    {
        System.out.println("Hexa Strig ="+Integer.toHexString(sub.getState()));
    }
    
}
