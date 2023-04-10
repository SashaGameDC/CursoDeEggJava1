
package Guia5Arreglos_Extra;

import java.util.Scanner;

public class Extra01_Suma_De_Vector {
    //(1)-Realizar un algoritmo que calcule la suma de todos los elementos de un
    //vector de tamaño N, con los valores ingresados por el usuario.
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
         System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector [] =  new int [n];
        int i, suma=0;
    
        for (i=0; i<= n-1; i++){
            System.out.println("Ingrese los valores a sumar:");
            vector[i]=leer.nextInt();

            suma += vector[i];
        }
        System.out.println("El resultado de la suma de los elementos del vector es " + suma);  
    }
}
    
