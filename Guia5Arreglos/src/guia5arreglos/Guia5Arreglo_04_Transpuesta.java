
package guia5arreglos;

import java.util.Scanner;

public class Guia5Arreglo_04_Transpuesta {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
         System.out.println("Te mostramos una matriz y su transpuesta");
        System.out.println(" ");
        int[][] m1= new int[4][4];
        int[][] m2= new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                m1[i][j]=(int)(Math.random() * 10);
                m2[j][i]=m1[i][j];
            }
        }
        escribir(m1,4,4);
        escribir(m2,4,4);
    }
    
    public static void escribir(int[][] matriz, int fila, int columna){
        
        for (int i = 0; i < fila; i++) {
            
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
    
