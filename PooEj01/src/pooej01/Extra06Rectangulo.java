
package pooej01;

import java.util.Scanner;
import pooej01.estanteria.Rectangulo2;

public class Extra06Rectangulo {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        Rectangulo2 rectangulo1= new Rectangulo2(4,6);
        
        System.out.println("Chango. El área de tu rectángulo depilado, es de " + rectangulo1.calcular_area());
        rectangulo1.imprimir_area();
    }
    
}
