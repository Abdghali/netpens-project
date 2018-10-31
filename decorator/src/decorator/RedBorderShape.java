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
public class RedBorderShape extends DecoratorSape{

    public RedBorderShape(Shape decoratS) {
        super(decoratS);
        
        
    }

    @Override
    public void drow() {
       decoratS.drow();
       setRedBorder(decoratS);
    }
    
    private void setRedBorder(Shape S ){
        System.out.println("the coler of boder is red");
    }
    
    
}
