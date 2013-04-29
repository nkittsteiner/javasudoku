/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasudoku;

/**
 *
 * @author nico
 */
public class Graficos {
    
    
    /*
     * Imprime sodoku
     * recibe la matriz  y la muestra por pantalla.
     */
    public void ImprimeSodoku(int omatriz[][]){
         try{            
              for (int i = 0; i < omatriz.length; i++) {
                  ImprimeSeparadores(i, "-");
                for (int j = 0; j < omatriz[i].length; j++) {
                      ImprimeSeparadores(j, "|");
                      System.out.print(" " + omatriz[i][j] + " ");
              }
                ImprimeSeparadores(9, "|");
                System.out.println();
            }
              ImprimeSeparadores(9, "-");
          }
          catch(Exception e){
                 System.out.println("ERROR al imprimir Sodoku" + e.getStackTrace());
          }
    }
    
    /*
     * Imprime el tipo de separador.
     */
    private void ImprimeSeparadores(int ij,String pSeparador ){
        String separador = ((pSeparador.equals("|")? "|":"-------------------------------"));
        switch(ij){
            case 0:
            case 3:
            case 6:
            case 9:
                if(separador.equals("|"))
                    System.out.print(separador);
                else
                     System.out.println(separador);
            break;
        }
    }
}
