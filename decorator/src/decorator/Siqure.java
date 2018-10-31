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

    
    public class Siqure implements Shape{
  
    private String title ;
    
    public void setTitel(String titl){
        this.title=titl;
    }
    public String getTitle(){
        return title;
    }
    
    
    public Siqure() {
      this.title="Siqure";  
    }
    
    
    
   
    
    
    @Override
    public void drow() {
        System.out.println("Siqure");
    }
    
    
  
    
    
}
