package javasudoku;

import java.util.Date;

/**
 *
 * Estructura para el manejo de movimientos durante el juego
 */
public class Movimientos {
    private String tipo;
    private int fila;
    private int columna;
    private int valor;
    private Date fechaHora;
    
    /**
     * Constructor de la clase
     * @param _tipo Corresponde al tipo de movimiento efectuado
     * @param _fila Fila donde se realizó el movimiento
     * @param _columna Columna donde se realizó el documento
     * @param _valor Valor del movimiento
     * @param _fechaHora Fecha y hora del movimiento
     */
    public Movimientos(String _tipo, int _fila, int _columna, int _valor, Date _fechaHora)
    {
        this.tipo = _tipo;
        this.fila = _fila;
        this.columna = _columna;
        this.valor = _valor; 
        this.fechaHora = _fechaHora;
    }

    /**
     * @return Retorna el tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo Tipo de movimiento a setear
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return Retorna la fila del movimiento
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila Actualiza el valor de la fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return Retorna la columna del movimiento
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna Columna del movimiento a actualizar
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return Valor del movimiento
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor Actualiza el valor del movimiento
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return Fecha del movimiento
     */
    public Date getFechaHora() {
        return fechaHora;
    }

    /**
     * @param fechaHora Actualiza la fecha del movimientos
     */
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
