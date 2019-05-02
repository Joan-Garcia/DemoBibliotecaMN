package métodos_numéricos_demo;

import métodos_numéricos.sistema.EcuacionesLineales;
import métodos_numéricos.sistema.algoritmos.Gauss;
import métodos_numéricos.sistema.algoritmos.Jacobi;

/**
 *  Demo de métodos_numéricos.jar. Prueba de los métodos de solución de los
 *  sistemas de ecuaciones.
 * 
 @author ITL. López Miguel, García Joan.
 */

public class SistemaDeEcuacionesDemo {
  EcuacionesLineales sistema;
  
  public SistemaDeEcuacionesDemo(){
    sistema = new EcuacionesLineales(new double[][]{{10, -1, 0, 9}, 
                                                    {-1, 10, -2, 7},
                                                    {0, -2, 10, 6}});
  }
  
  private void imprimeSistema(){
    for (int i = 0; i < sistema.getMatrizEcuacion().length; i++) {
      for (int j = 0; j < sistema.getMatrizEcuacion()[0].length; j++) 
        System.out.print(sistema.getCoeficiente(i, j) + "  ");
      System.out.println("");
    }
  }
  
  private void imprimeSolucion(double[] solucion){
    for (int i = 0; i < solucion.length; i++) 
      System.out.println("X" + i + " = " + solucion[i]);
  }
  
  public void prueba(){
    System.out.println("Sistema de prueba:");
    imprimeSistema();
    System.out.println("--- Solución de Gauss con X0 = 0, X1 = 0, X2 = 0. "+
                       "2 iteraciones y tolerancia de .0001");
    imprimeSolucion(Gauss.ObtenerSolucion(sistema, 0, 0, 0, .0001, 2));
    System.out.println("--- Solución de Jacobi con X0 = 0, X1 = 0, X2 = 0. "+
                       "2 iteraciones y tolerancia de .0001");
    imprimeSolucion(Jacobi.ObtenerSolucion(sistema, 0, 0, 0, .0001, 2));
  }
  
  public static void main(String[] args) {
    new SistemaDeEcuacionesDemo().prueba();
  }
 
}
