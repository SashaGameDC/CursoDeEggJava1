/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4subprogramas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4SubprogramasPrimos {
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
            System.out.println("el numero no es primo");}
        
    }      
    
    
}
