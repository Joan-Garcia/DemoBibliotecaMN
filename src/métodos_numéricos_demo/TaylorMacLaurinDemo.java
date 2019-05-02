package métodos_numéricos_demo;

import métodos_numéricos.polinomio.TaylorMaclaurin;

/**
 *  Demo de métodos_numéricos.jar. Prueba de polinomio de MacLaurin.
 * 
 @author ITL. López Miguel, García Joan.
 */
public class TaylorMacLaurinDemo {
    
    public void prueba(){
        System.out.println("Punto x = 3, número de terminos = 6.");
        System.out.println("COSENO:");
        System.out.println(TaylorMaclaurin.polinomios(TaylorMaclaurin.Funcion.COSENO, 3, 6));
        System.out.println("SENO:");
        System.out.println(TaylorMaclaurin.polinomios(TaylorMaclaurin.Funcion.SENO, 3, 6));
        System.out.println("EULER:");
        System.out.println(TaylorMaclaurin.polinomios(TaylorMaclaurin.Funcion.EULER, 3, 6));
    }
    public static void main(String[] args) {
        new TaylorMacLaurinDemo().prueba();
    }
    
}
