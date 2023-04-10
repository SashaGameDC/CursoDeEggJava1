
package pooej01;

import java.util.Scanner;
import pooej01.estanteria.Circunferencia;

public class POOEj2Radio {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        Circunferencia V1= new Circunferencia();
        
        V1.crearCircunferencia();
        
        System.out.println("El área de la circunferencia es= " + V1.area() + "\n"
                        + "El perímetro de la circunferencia es= " + V1.perimetro());
    }
}
        
        
    
