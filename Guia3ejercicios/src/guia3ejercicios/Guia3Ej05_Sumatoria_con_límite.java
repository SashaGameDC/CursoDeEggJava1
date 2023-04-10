
package guia3ejercicios;

import java.util.Scanner;


public class Guia3Ej05_Sumatoria_con_límite {

    //(5)-Sumatoria de numeros con limite
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite para realizar una sumatoria");
        int limite = leer.nextInt();
        System.out.println("A continuacion ingrese los valores a sumar");
        int suma = 0;
        do{
            int num = leer.nextInt();
            if(num+suma>limite){
                System.out.println("Este numero supera el limite. No se puede sumar");
            }else if(num+suma<=limite){
            suma = suma + num;
            }
            System.out.println("Actualmente la suma de valores es de " + suma);
        }while (suma<limite);
    }
}
    
