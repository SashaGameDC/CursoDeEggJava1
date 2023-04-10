
package guia3ejercicios;

import java.util.Scanner;


public class Guia3Ej03y04_Comienza_con_A {
    
    //(4)-frace que comience con 'A'
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra que comience con la letra 'A'");
        String palabra = leer.next();
        if (palabra.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Error");
        } 
    }
}
    
