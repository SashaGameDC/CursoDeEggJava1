
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej04_Transformar_a_romano {

    //(4)-transformar a romano//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);

        int num;
        System.out.println("ingrese un numero del 1 al 10");
        num = leer.nextInt();
        do {
            switch (num) {
                case 1: {
                    System.out.println("I");
                }
                break;
                case 2: {
                    System.out.println("II");
                }
                break;
                case 3: {
                    System.out.println("III");
                }
                break;
                case 4: {
                    System.out.println("IV");
                }
                break;
                case 5: {
                    System.out.println("V");
                }
                break;
                case 6: {
                    System.out.println("VI");
                }
                break;
                case 7: {
                    System.out.println("VII");
                }
                break;
                case 8: {
                    System.out.println("VIII");
                }
                break;
                case 9: {
                    System.out.println("IX");
                }
                break;
                case 10: {
                    System.out.println("X");
                }
                break;
                default:
                        System.out.println("Error. Ingrese el valor correspondiente");
                        num = leer.nextInt();
            }

        } while (num < 1 || num > 10);
    }
}
                   
    
