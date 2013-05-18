/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasudoku;
import java.io.*;
/**
 *
 * Contiene los métodos para leer datos ingresados desde el teclado
 */
public class Leer {
    
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader _reader = new BufferedReader(input) ;
           
    /**
     * Lee desde el teclado una cadena de caracteres ingresada por el usuario
     * @return Retorna cadena ingresada
     */
    public String LeerDatos() 
    {
        try 
        {
            return _reader.readLine();
        }
        catch(IOException e)
        {
            return null;
        }

    }
    
    /**
     * Lee un dato numérico entero ingresado por el usuario
     * @return El dato entero capturado
     */
    public int LeerDatosInt() 
    {
        try
        {
            return Integer.parseInt(_reader.readLine());
        }
        catch(Exception e) {}
        return 0;
    }
}

