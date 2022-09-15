/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.observerimplimentation;

/**
 *
 * @author dell
 */
public class ObserverImplimentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Subject sub=new Subject();
        
        new HexaObserver(sub);
        new OctalObserver(sub);
        new BinaryObserver(sub);
        
        System.out.println("Set State 15");
        sub.setState(15);
        System.out.println("Set State 50");
        sub.setState(50);
    }
    
}
