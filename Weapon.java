/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;


public class Weapon {
    
    private float power;
    
    private int uses;
    
    
    
    public Weapon (float power, int uses){
        this.power = power;
        this.uses = uses;
        
        
       
    }
    
    public float attack(){
        
        if (this.uses > 0){
            this.uses--;
            return power;
        } 
            return 0;
        
     }
    
    @Override
    public String toString(){
        
        return "W[" +this.power+ " , " +this.uses+" ]";
    }
    
    public boolean discard(){
        
       
       return Dice.discardElement(this.uses);
    }
    
   
}
