package javasudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase estructura de Sudoku
 */
public class Sudoku {
    public int[][] matriz_solucion;
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
        return this.matriz_solucion;
    }

    /**
     * @param matriz_solucion the matriz_solucion to set
     */
    public void setMatriz_solucion(int[][] _matriz_solucion) {
        this.matriz_solucion = _matriz_solucion;
    }

    /**
     * @return the matriz_inicial
     */
    public int[][] getMatriz_inicial() {
        return this.matriz_inicial;
    }

    /**
     * @param matriz_inicial the matriz_inicial to set
     */
    public void setMatriz_inicial(int[][] _matriz_inicial) {
        this.matriz_inicial = _matriz_inicial;
    }

    /**
     * @return the matriz_actual
     */
    public int[][] getMatriz_actual() {
        return this.matriz_actual;
    }

    /**
     * @param matriz_actual the matriz_actual to set
     */
    public void setMatriz_actual(int[][] _matriz_actual) {
        this.matriz_actual = _matriz_actual;
    }

    /**
     * @return the listadoMovimientos
     */
    public List<Movimientos> getListadoMovimientos() {
        return this.listadoMovimientos;
    }

    /**
     * @param listadoMovimientos the listadoMovimientos to set
     */
    public void setListadoMovimientos(List<Movimientos> _listadoMovimientos) {
        this.listadoMovimientos = _listadoMovimientos;
    }
}
