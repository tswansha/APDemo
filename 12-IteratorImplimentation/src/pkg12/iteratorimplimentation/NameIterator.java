/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12.iteratorimplimentation;

/**
 *
 * @author dell
 */
public class NameIterator implements Iterator
{
    int index;
    NameRepo nr=new NameRepo();
    
    @Override
    public boolean HasNext()
    {
        if(index<nr.names.length)
        {
            return true;
        }
        return false;
    }
    
    @Override
    public Object next()
    {
        if(this.HasNext())
        {
            return nr.names[index++];
        }
        return null;
    }
    
}
