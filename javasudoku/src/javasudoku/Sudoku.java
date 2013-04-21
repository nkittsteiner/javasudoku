package javasudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase estructura de Sudoku
 */
public class Sudoku {
    private int[][] matriz_solucion;
    private int[][] matriz_inicial;
    private int[][] matriz_actual;
    private List<Movimientos> listadoMovimientos;
    /**
     * Constructor
     */
    public Sudoku()
    {
        this.matriz_solucion = new int[8][8]; 
        this.matriz_inicial = new int[8][8]; 
        this.matriz_actual = new int[8][8]; 
        this.listadoMovimientos = new ArrayList<Movimientos>();

    }

    /**
     * @return the matriz_solucion
     */
    public int[][] getMatriz_solucion() {
        return matriz_solucion;
    }

    /**
     * @param matriz_solucion the matriz_solucion to set
     */
    public void setMatriz_solucion(int[][] matriz_solucion) {
        this.matriz_solucion = matriz_solucion;
    }

    /**
     * @return the matriz_inicial
     */
    public int[][] getMatriz_inicial() {
        return matriz_inicial;
    }

    /**
     * @param matriz_inicial the matriz_inicial to set
     */
    public void setMatriz_inicial(int[][] matriz_inicial) {
        this.matriz_inicial = matriz_inicial;
    }

    /**
     * @return the matriz_actual
     */
    public int[][] getMatriz_actual() {
        return matriz_actual;
    }

    /**
     * @param matriz_actual the matriz_actual to set
     */
    public void setMatriz_actual(int[][] matriz_actual) {
        this.matriz_actual = matriz_actual;
    }

    /**
     * @return the listadoMovimientos
     */
    public List<Movimientos> getListadoMovimientos() {
        return listadoMovimientos;
    }

    /**
     * @param listadoMovimientos the listadoMovimientos to set
     */
    public void setListadoMovimientos(List<Movimientos> listadoMovimientos) {
        this.listadoMovimientos = listadoMovimientos;
    }
}
