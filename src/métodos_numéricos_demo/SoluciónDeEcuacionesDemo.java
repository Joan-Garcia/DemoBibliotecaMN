package métodos_numéricos_demo;

import métodos_numéricos.polinomio.Ecuación;
import métodos_numéricos.polinomio.algoritmos.Bisección;
import métodos_numéricos.polinomio.algoritmos.Newton;
import métodos_numéricos.polinomio.algoritmos.ReglaFalsa;
import métodos_numéricos.polinomio.algoritmos.Secante;

/**
 *  Demo de métodos_numéricos.jar. Prueba de los métodos de solución de
 *  ecuaciones.
 * 
 @author ITL. López Miguel, García Joan.
 */
public class SoluciónDeEcuacionesDemo {
    
    Ecuación ec;
    
    public SoluciónDeEcuacionesDemo(){
        ec = new Ecuación(2, 3, 1, 2, 4);
    }
    
    private void imprimeEcuación(){
        System.out.println(ec.getA() + "x4 + " + ec.getB() + "x3 + " + ec.getC()
                + "x2 + " + ec.getD() + "x + " + ec.getE());
    }
    
    public void prueba(){
        System.out.println("Ecuación de prueba:");
        imprimeEcuación();
        System.out.println("Solución de Bisección (xi = 2, xu = 3, tol = 0.0001, itmax = 5)");
        System.out.println(Bisección.algoritmoBisección(ec, 2, 3, 0.0001, 5));
        System.out.println("Solución de Newton (p0 = 2, tol = 0.0001, itmax = 5)");
        System.out.println(Newton.algoritmoNewton(ec, 2, 0.0001, 5));
        System.out.println("Solución de Secante (p0 = 2, p1 = 3, tol = 0.0001, itmax = 5)");
        System.out.println(Secante.algoritmoSecante(ec, 2, 3, 0.0001, 5));
        System.out.println("Solución de Regla Falsa (xi = 2, xu = 3, tol = 0.0001, itmax = 5)");
        System.out.println(ReglaFalsa.ObtenerSolucion(ec, 2, 3, 0.0001, 5));
    }
    public static void main(String[] args) {
        new SoluciónDeEcuacionesDemo().prueba();
    }
    
}
