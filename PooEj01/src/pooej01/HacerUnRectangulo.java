
package pooej01;

import java.util.Scanner;
import pooej01.estanteria.Rectangulo;

public class HacerUnRectangulo {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        Rectangulo r1= new Rectangulo();
        
        r1.llenado();

        
        System.out.println("La superficie del rectangulo es: " + r1.getSuperficie() + "\n"
            + "El perímetro del rectangulo es: " + r1.getPerimetro() + "\n"
            + "Le regalamos un rectangulo con estrellitas");
        r1.DibujoUnRectangulo();
    }
}
        
    
