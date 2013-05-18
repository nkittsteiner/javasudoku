
package javasudoku;

public class Javasudoku {

    /**
     * Clase main de la aplicación
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Menu menu = new Menu();
            menu.Inicio();
        }
        catch(Exception e)
        {
            System.out.println("Se ha encontrado un error. Por favor reintente nuevamente");
        }
    }
}
