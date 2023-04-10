
package guia3;

import java.util.Scanner;


public class Guia3MIENTRAS {

    //ESTO ES UN MIENTRAS//
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int nota;
        System.out.println("Ingrese un valor entre 0 y 10");
        nota = leer.nextInt();
       
        while (nota<0 || nota>10){
            System.out.println("el valor ingresado esta fuera de los parametros");
            nota = leer.nextInt(); 
        }
        
    }
    
}
