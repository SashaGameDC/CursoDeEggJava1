
package guia3;

import java.util.Scanner;

public class Guia3SEGUN {
    
    //ESTO ES UN SEGUN//
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
       int tipo;
        System.out.println("Ingrese el valor correspondiente al tipo de motor");
        
        tipo = leer.nextInt();
        
        switch (tipo) {
            case 1:
                System.out.println("Bomba de agua");
            break;
            case 2:
                System.out.println("Bomba de gasolina");
            break;
            case 3:
                System.out.println("Bomba de hormigón");
            break;
            case 4:
                System.out.println("Bomba de pasta alimenticia");
            break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
    
