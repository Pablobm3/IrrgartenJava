/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 * 
 * Dudas con la clase:
 * - Como se inicializa laberyinth, monsters y players
 * -
 *
 * @author pablo b
 */
public class Labyrinth {
    
    private static final char BLOCK_CHAR = 'X';
    private static final char EMPTY_CHAR = '-';
    private static final char MONSTER_CHAR= 'M';
    private static final char COMBAT_CHAR= 'C';
    private static final char EXIT_CHAR= 'E';
    private final static int ROW = 0;
    private final static int COL = 1;
    public int nRows;
    public int nCols;
    public int exitRow;
    public int exitCol;
    private Monster[][] monsters;
    private Player[][] players;
    private char labyrinth[][];
    
    public Labyrinth(int nRows,int nCols,int exitRow,int exitCol){
        this.nRows=nRows;
        this.nCols=nCols;
        this.exitRow=exitRow;
        this.exitCol=exitCol;
        monsters = new Monster[nRows][nCols];
        players = new Player[nRows][nCols];
        labyrinth = new char[EMPTY_CHAR][EXIT_CHAR];      
    }
    
    public boolean haveAWinner(){
       throw new UnsupportedOperationException();  
    }
    
    @Override
    public String toString(){
        
        return "Laberinto: {NºColumnas: "+this.nCols+", NºFilas: "+this.nRows+", Col de salida: "+this.exitCol+", Fil de salida: "+this.exitRow+ "}";
    }
    
    public void addMonster(int row,int col,Monster monster){
        
    }
    
   
}
