
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej05_Realidad_de_mierda {

    //(5)-Realidad de mierda//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de socio y el valor del analisis a realizar");
        String tipo= leer.next();
        tipo=tipo.toUpperCase();
        int valor= leer.nextInt();
        switch(tipo){
            case "A":{System.out.println("Usted tiene que pagar " + (valor*0.5));
            }
            break;
            case "B":{System.out.println("Usted tiene que pagar " + (valor*0.75));
            }
            break;
            case "C":{System.out.println("No le descontamos nada por POBRE. Pague " + valor);
            }
            break;
        }
    }
}
    
