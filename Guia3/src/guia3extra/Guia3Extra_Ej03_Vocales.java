
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej03_Vocales {
    
    //(3)-vocales//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Usted a ingresado una vocal");
        }else{
            System.out.println("Usted a ingresado una consonante");
        }
    }
}
    
