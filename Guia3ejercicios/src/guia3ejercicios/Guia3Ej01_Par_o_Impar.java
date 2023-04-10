
package guia3ejercicios;

import java.util.Scanner;


public class Guia3Ej01_Par_o_Impar {
    
    //(1)- Crear un programa que dado un número determine si es par o impar.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("El numero es Par");

        } else {
            System.out.println("El numero es impar");
        }

    }

}