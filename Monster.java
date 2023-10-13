/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author pablo b
 */
public class Monster {
    
    private static int INITIAL_HEALTH = 5;
    private String name;
    private float intelligence;
    private float strength;
    private float health = 1.0f;
    private int row;
    private int col;
    
    public Monster(String name,float intelligence, float strength){
        this.name = name;
        this.intelligence = intelligence;
        this.strength= strength;
    }
    
    public boolean dead(){
        if(this.health == 0){
            return true;
        }
        
        return false;
    }
    
    public float attack(){
        return Dice.intensity(this.strength);
    }
    
    public void setPos(int row, int col){
        this.row=row;
        this.col=col;
    }
    
    @Override
    public String toString(){
        
        return "Nombre del mosntruo: " +this.name+ ", Inteligencia: "+this.intelligence+ " , Fuerza: "+this.strength+ " .";
    }
    
    private void gotWounded(){
        this.health--;
    }
    
    /*public boolean defend(float receivedAttack){
        
    }*/
}
