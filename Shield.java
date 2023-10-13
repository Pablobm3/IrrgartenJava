/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author pablo b
 */
public class Shield {
    
    private float protection;
    
    private int uses;
    
    
    
    Shield(float protection, int uses){
        this.protection = protection;
        this.uses = uses;
    }
    
    public float protect(){
        
        if(this.uses>0){
            this.uses--;
            return protection;
            
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        
        return "S[" +this.protection+ " , " +this.uses+"]";
    }
    
     public boolean discard(){
         
       
        
       return Dice.discardElement(this.uses);
    }
    
}
