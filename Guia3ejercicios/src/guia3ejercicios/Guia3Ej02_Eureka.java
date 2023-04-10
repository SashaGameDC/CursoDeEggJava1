
package guia3ejercicios;

import java.util.Scanner;


public class Guia3Ej02_Eureka {
//(2)+(3)- Crear un programa que pida una frase y si esa frase es igual a 
//“eureka” el programa pondrá un mensaje de Correcto, sino mostrará un 
//mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        

        System.out.println("Ingrese una frace que no supere 8 caracteres");
        String frase = leer.nextLine();
        if (frase.length()<=8){
            System.out.println("su frase contiene " + frase.length() + " caracteres, está dentro de los parametros");
        }else if (frase.length()>8){
            System.out.println("Error");
        }
    }
}
        
    
