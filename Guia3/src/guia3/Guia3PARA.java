
package guia3;

import java.util.Scanner;


public class Guia3PARA {

    //PARA//
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num4;
        System.out.println("Ingrese un 4 valores entre los números 1 y 20");
         
        for(int i = 0; i < 4; i++){
           num4 = leer.nextInt();
            System.out.print(num4);
            for(int j = 0; j < num4; j++){
                System.out.print("*");
            }
           System.out.println(" ");
        }
    }
}
    
