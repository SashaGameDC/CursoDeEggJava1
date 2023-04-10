
package guia5arreglos;

import java.util.Scanner;

public class Guia5Arreglo_01_Un_conejo_10_conejas {
    
    //UN CONEJO 10 CONEJAS//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int [] cien= new int[100];
        
        for (int i = 0; i < 100; i++) {
            cien[i] = i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print("["+cien[i]+"]");
        }
    }
}
    
