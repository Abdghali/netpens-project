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
public class Circlee implements Shape {
    
    
    
    // private static Circle circle;   
     private String titile;
     private int numberOfRibs;
     
     public void setNumberOfRibs(int number){
         this.numberOfRibs=number;
     }
     public int getNumberOfRibs(){
         return numberOfRibs;
     }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }
     
     public Circlee(){
          this.titile="Circle";
      } 
      
     
       

    @Override
    public void drow() {
        System.out.println("Circle");
    }
      
    
    
}
