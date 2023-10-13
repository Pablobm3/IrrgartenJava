/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;


import java.util.ArrayList;
/**
 *
 * @author pablo b
 */
public class Player {
    
    private static int MAX_WEAPONS = 2;
    private static int MAX_SHIELDS = 3;
    private static int INITIAL_HEALTH = 10;
    private static int HITS2LOSE = 3;
    private String name;
    private char number;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    private int consecutiveHits = 0;
    private ArrayList<Weapon> weapons;
    private ArrayList<Shield> shields;
    
    public Player(char number, float intelligence, float strength,float health){
        this.number=number;
        this.intelligence=intelligence;
        this.strength=strength;
        this.health=INITIAL_HEALTH;
        this.name="Player# "+number;
        ArrayList<Weapon> weapons = new ArrayList<>();
        ArrayList<Shield> shields = new ArrayList<>();
    }
    
    public void resurrect(){
        
        ArrayList<Weapon> weapons = new ArrayList<>();
        ArrayList<Shield> shields = new ArrayList<>();
        this.health=INITIAL_HEALTH;
        this.consecutiveHits=0;

    }
    
    public void setPos(int row,int col){
        this.row=row;
        this.col=col;
    }
    
    public boolean dead(){
        return this.health==0;
    }
    
    /*public float attack(){
       throw new UnsupportedOperationException(); 
    }
    
    public boolean defend(float receivedAttack){
        throw new UnsupportedOperationException();
    }*/
    
    @Override
    public String toString(){
        return "Jugador[ Nombre: " +this.name+ " , Numero:  "+this.number+ " , Inteligencia: "+this.intelligence+" , Fuerza: "+this.strength+ " , Salud: "+this.health+" .";
    }
    
    /*private Weapon newWeapon(){
        
         throw new UnsupportedOperationException(); 
        
    }*/
    
    private void resetHits(){
        this.consecutiveHits=0;
    }
    
    private void gotWounded(){
        this.health--;
    }
    
    private void incConsecutiveHits(){
        this.consecutiveHits++;
    }
    
    private float sumWeapons(){
        throw new UnsupportedOperationException();
    }
    
    private float sumShields(){
        throw new UnsupportedOperationException();
    }
    
    
}
