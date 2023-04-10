
package guia3ejercicios;

import java.util.Scanner;


public class Guia3Ej08_Cuadrado_con_asteriscos {

    //Cuadrado con *//
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
         for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){

                if(j == 1 || j == 4 || i == 1 || i == 4){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

            System.out.println(""); 
        
        } 
    }
}
    
