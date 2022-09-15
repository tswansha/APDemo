/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13.factorypatternimplimentation;

/**
 *
 * @author dell
 */
public class ShapeFactory 
{
    public Shape getShape(int ch)
    {
        Shape S1;
        int choice=ch;
        if(choice==1)
        {
            S1=new Circle();
            //S1.Draw();
        }
        else if(choice==2)
        {
            S1=new Rectangle();
            //S1.Draw();
        }
        else if(choice==3)
        {
            S1=new Square();
            //S1.Draw();
        }
        else
        {
            S1=null;
        }
        
        return S1;
    }

    
}
