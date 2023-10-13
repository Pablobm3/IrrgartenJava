/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author pablo b
 */
public class TestP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Directions dir = Directions.LEFT;
        
        System.out.println("La dirección es: "+dir);
        
        Weapon w1 = new Weapon(5.0f, 1);
        int contador = 0; 
        System.out.println("\"Descarte arma: ");
        for(int i=0;i<100;i++){
             System.out.println(w1.discard());
             if((w1.discard())== true){
                contador++;
            }  
         }
        
        System.out.println("Porcentaje de descartes: "+contador+ "%");
        
        w1.attack();
         
         //System.out.println("Arma 1: " + w1.toString());
         
         
         
         
         
        
         
         
         
         Shield s1 = new Shield(5,4);
         /* System.out.println("\"Descarte escudo: ");
         for(int i=0;i<10;i++){
             System.out.println(s1.discard());
         }*/
         
         //s1.protect();
         
        // System.out.println(s1.toString());
         
          /*System.out.println("Descarte dado: ");
         
          int contador = 0;
          for(int i=0;i<100;i++){
               
            System.out.println(Dice.discardElement(4));
            if((Dice.discardElement(4))== true){
                contador++;
            }    
         
          }
         
          
          
          System.out.println("Porcentaje de descartes: "+contador);*/
         
        
        /*System.out.println("Random intelligence: ");
        for(int i=0;i<10;i++)
            System.out.println(Dice.randomIntelligence());
        
        System.out.println("Max uses: ");
        for(int i=0;i<10;i++)
            System.out.println(Dice.usesLeft());*/
        
        
        
        /*Monster m = new Monster("Pablo", 2.0f, 3.0f);
        
        System.out.println(m.toString());
        
        System.out.println(m.dead());
        
        System.out.println(m.attack());
        
        m.setPos(5, 4);
        
        
        
        System.out.println(m.dead());*/
        
        Player p = new Player('P',5.0f,5.0f);
        
        System.out.println(p.toString());
        
        //System.out.println(p.dead());
        
        System.out.println(p.attack());
    }
    
}
