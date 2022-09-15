/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11.observerimplimentation;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dell
 */
public class Subject
{
    private List<Observer> observers=new ArrayList <Observer>();
    private int state;
    
    public int getState()
    {
        return state;
    }
    
    public void setState(int state)
    {
        this.state=state;
        NotifyAllObservers();
    }
    
    public void Attach(Observer ob)
    {
        observers.add(ob);
    }
    
    public void NotifyAllObservers()
    {
        for(Observer observers:observers)
        {
            observers.Update();
        }
    }
}
