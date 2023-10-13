/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author pablo b
 */
public class GameState {
    
    private String labyrinthv;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;
    
    GameState(String labyrinthv,String players, String monsters, int currentPlayer,boolean winner, String log){
        
        this.labyrinthv = labyrinthv;
        this.players = players;
        this.currentPlayer = currentPlayer;
        this.monsters = monsters;
        this.winner = winner;
        this.log = log;
    }

    public String getLabyrinthv() {
        return this.labyrinthv;
    }

   

    public String getPlayers() {
        return this.players;
    }

   

    public String getMonsters() {
        return this.monsters;
    }

   

    public int getCurrentPlayer() {
        return currentPlayer;
    }

   

    public boolean isWinner() {
        return winner;
    }

   

    public String getLog() {
        return log;
    }

    
    
    
    
}
