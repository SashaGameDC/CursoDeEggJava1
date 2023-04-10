
package guia3extra;

import java.util.Scanner;


public class Guia3Extra_Ej01_Hrs_en_minutos {
    
    // (1)-transformar minutos en dias y horas
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int sobras;
        double horas,dias;
        dias=0;
        System.out.println("Ingrese una cantidad de minutos y le diremos cuanto es en dias y horas ");
        int min = leer.nextInt();
        horas= (min /60);
        sobras = min%60;
        if(horas>24){
        dias= (horas/24);
        }
        System.out.println("el valor introducido es igual a: " + Math.round(dias) + " dias, " + Math.round(horas) + " horas y " + sobras + " minutos");

    }
    
}
