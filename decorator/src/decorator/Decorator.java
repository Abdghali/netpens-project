
package decorator;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdghali
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Circlee c = new Circlee();
         BlueBorderShape  rd = new BlueBorderShape(c);
         rd.drow();
         
         
         
         Rectangle r = new Rectangle();
         WightBorderShape  rEight= new WightBorderShape(r);
         rEight.drow();
         
        Siqure R =new Siqure();
        RedBorderShape  Rred= new RedBorderShape(R);
         Rred.drow();
        
         
         
         
        
        
        
        
        
        
      
    }
    
}
