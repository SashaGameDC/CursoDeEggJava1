
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej13_Escalera_numérica {
    
    //(13)-escalera numérica//
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera a escribir");
        int altura= leer.nextInt();
        for (int i = 1; i < altura+1; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
    
