/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12.iteratorimplimentation;

/**
 *
 * @author dell
 */
public class NameRepo implements Container
{
    public String names[]={"Robert","John","Ned","Brian","Jeffry"};
    
    @Override
    public Iterator getIterator()
    {
        return new NameIterator();
    }
    
}
