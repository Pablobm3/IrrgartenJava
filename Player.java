/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;


/* Dudas de la clase Player:
-Row y col hay que inicializarlos también en el constructor?
-La implementación de attack()es buena?
-En que momento le damos valores a los arrays de armas y escudos
*/

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
    
    public Player(char number, float intelligence, float strength){
        this.number=number;
        this.intelligence=intelligence;
        this.strength=strength;
        this.health=INITIAL_HEALTH;
        this.name="Player# "+number;
        this.row=0;
        this.col=0;
        this.consecutiveHits=0;
        ArrayList<Weapon> weapons = new ArrayList<>(10);
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
        return this.health==0.0f;
    }
    
    public float attack(){
       float sumaFuerza = sumWeapons();
       
       float total = this.strength+sumaFuerza;
       
       return total;
    }
    
    public boolean defend(float receivedAttack){
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString(){
        return "Jugador[ Nombre: " +this.name+ " , Numero:  "+this.number+ " , Inteligencia: "+this.intelligence+" , Fuerza: "+this.strength+ " , Salud: "+this.health+" ]";
    }
    
    private Weapon newWeapon(){
        
        Weapon arma = new Weapon(Dice.weaponPower(),Dice.usesLeft()); 
        
        return arma;
        
    }
    
    private Shield newShield(){
        
        Shield escudo = new Shield(Dice.shieldPower(),Dice.usesLeft());
        
        return escudo;
    }
    
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
        float suma = 0.0f;
        
        Weapon arma = newWeapon();
        
        for(int i=0;i<weapons.size();i++){
            arma=weapons.get(i);
            suma +=arma.attack();
            
            
        }
        return suma;
    }
    
    private float sumShields(){
        throw new UnsupportedOperationException();
    }
    
    
}
