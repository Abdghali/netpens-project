/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author abdghali
 */
public class BlueBorderShape extends DecoratorSape{

    public BlueBorderShape(Shape decoratS) {
        super(decoratS);
    }

  
    
    
    
    
     @Override
    public void drow() {
       decoratS.drow();
       setBlueBorder(decoratS);
    }
    
    private void setBlueBorder(Shape S ){
        System.out.println("the coler of boder is Blue");
    }
    
}
