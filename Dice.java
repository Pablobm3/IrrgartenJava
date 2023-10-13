/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.Random;

/**
 *
 * @author pablo b
 */
public class Dice {
    
    static private final int MAX_USES = 5;
    
    static private final float MAX_INTELLIGENCE = 10.0f;
    
    static private final float MAX_STRENGTH = 10.0f;
    
    static private final double RESURRECT_PROB = 0.3;
    
    private static final int WEAPONS_REWARD = 2;
            
    private static final int SHIELDS_REWARD = 3;
            
    private static final int HEALTH_REWARD = 5;
            
    private static final float MAX_ATTACK = 3.0f;
            
    private static final float MAX_SHIELD = 2.0f;
    
    private static final Random generator = new Random();

    static public int randomPos(int max){
        
        return Dice.generator.nextInt(max);
    }
    
    static public int whoStarts(int nplayers){
        
        return Dice.generator.nextInt(nplayers);
    }
    
    static public float randomIntelligence(){
        
        return Dice.generator.nextFloat() * Dice.MAX_INTELLIGENCE;
    }

    static public float randomStrength(){
        
        return Dice.generator.nextFloat() * MAX_STRENGTH;
    }
    
    static public boolean resurrectPlayer(){
        
        float randomValue = Dice.generator.nextFloat();
        
        return randomValue < Dice.RESURRECT_PROB;
    }
    
    static public int weaponsReward(){
        
        return Dice.generator.nextInt(Dice.WEAPONS_REWARD+1);
    }
    
    static public int shieldsReward(){
        
        return Dice.generator.nextInt(Dice.SHIELDS_REWARD+1);
    }
    
    static public int healthReward(){
        
        return Dice.generator.nextInt(Dice.HEALTH_REWARD+1);
    }
    
    static public float weaponPower(){
        
        return Dice.generator.nextFloat() * Dice.MAX_ATTACK;
    }
    
    static public float shieldPower(){
        
        return Dice.generator.nextFloat()* Dice.MAX_SHIELD;
    }
    
    static public int usesLeft(){
        
        return Dice.generator.nextInt(Dice.MAX_USES+1);
    }
    
    static public float intensity(float competence){
        
        return Dice.generator.nextFloat() * competence;
    }
    
    static public boolean discardElement(int usesLeft){
        if (usesLeft == 0) {
            return true; 
        } else if (usesLeft == MAX_USES) {
            
            return false;

            
        } else{
        
            
            float randomValue = Dice.generator.nextFloat();
            
            
            float probability = 1.0f - ((float)usesLeft / MAX_USES);

            
            return probability > randomValue;
        }
    }
}
