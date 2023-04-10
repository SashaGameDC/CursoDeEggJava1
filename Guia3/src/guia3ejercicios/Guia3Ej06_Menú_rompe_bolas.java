
package guia3ejercicios;

import java.util.Scanner;

public class Guia3Ej06_Menú_rompe_bolas {

    //(6)- Menu rompe bolas
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros y luego la ecuacion a realizar");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        int aux = 5;
        
        do{   
            System.out.println("Ingre el valor equivalente a la operacion requerida\n" + "1)-Suma\n" + "2)-resta\n" + "3)-Multiplicar\n" + "4)-dividir\n" + "5)-Salir");
            int opcion = leer.nextInt();
            switch (opcion){
                case 1: System.out.println("El resultado de la suma es " + (num1 + num2));
                    break;
                case 2: System.out.println("El resultado de la resta es " + (num1 - num2));
                    break;
                case 3: System.out.println("El resultado de la multiplicación es " + (num1 * num2));
                    break;
                case 4: System.out.println("El resultado de la divición es " + (num1 / num2));
                    break;
                default:
                    while(opcion<1 || opcion>5){
                        System.out.println("Error. Ingrese el valor correspondiente");
                        opcion = leer.nextInt();
                }
            }

            System.out.println(" ");

            if (opcion == 5){
                System.out.println("Esta seguro de querer salir? (s/n)");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("s")){
                    aux = 6;
                } 
            }
        
        } while (aux==5);
    }
}
    
