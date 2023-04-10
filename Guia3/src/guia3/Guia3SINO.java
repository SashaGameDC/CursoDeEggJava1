
package guia3;

import java.util.Scanner;


public class Guia3SINO {

    //ESTO ES UN SI, SINO//
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2;
        System.out.println("Ingrese por favor dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        if (num1>25 && num2>25) {
            System.out.println("Los dos numeros son mayores a 25");
        }else if (num1>25 || num2>25) {
            System.out.println("Uno de os números es mayor a 25");
        }

    }
    
}
