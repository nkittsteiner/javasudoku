
package javasudoku;

public class Javasudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sudoku sudoku = new Sudoku();
        Juego juego = new Juego();
        sudoku = juego.GeneraNuevoJuego(1);
        Graficos g = new Graficos();
        g.ImprimeSodoku(sudoku.getMatriz_solucion());
    }
}
