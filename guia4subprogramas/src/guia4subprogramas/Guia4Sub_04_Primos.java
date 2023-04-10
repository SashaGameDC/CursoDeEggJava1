
package guia4subprogramas;

import java.util.Scanner;

public class Guia4Sub_04_Primos {
    //Son primos?//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingrese un numero para saber si es primo");
        int numero = leer.nextInt();
        esprimo(numero);
    }
    public static void esprimo(int num){
        int cont=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                cont = cont + 1;
            }   
        }
        if (cont <=2){
            System.out.println("el numero es primo");
        }
        else {
            System.out.println("el numero no es primo");
        }
        
    }      
    
}
    
