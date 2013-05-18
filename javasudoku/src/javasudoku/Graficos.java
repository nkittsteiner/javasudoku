/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasudoku;

/**
 *
 */
public class Graficos {
    
    /**
     * Imprime la matriz del juego
     * @param matriz
     */   
    public void ImprimeSudoku(int matriz[][])
    {       
        System.out.print("   ");
        for (int a = 1; a < 10; a++) {
            System.out.print(" "+a+"  ");
        }
        System.out.println("");
        System.out.println("  -------------------------------------");
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i+1);
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]==0)
                    System.out.print(" | "+" ");
                else
                    System.out.print(" | "+matriz[i][j]);
            }
            System.out.print(" |");
            System.out.println("");
            System.out.println("  -------------------------------------");
        }
    }   
}
