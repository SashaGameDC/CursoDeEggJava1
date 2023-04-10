
package guia5arreglos;

import java.util.Scanner;

public class Guia5Arreglo_05_Transpuesta_antisimétrica {

  
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Te mostramos una matriz y su transpuesta");
        System.out.println(" ");
        int[][] m1= {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] mt= new int[3][3];
        int[][] mn= new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                //m1[i][j]=(int)(Math.random() * 20 + 1 -10);
                mt[j][i]=m1[i][j];
                mn[i][j]=-m1[i][j];
            }
        }
        
        int aux1 =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(mn[i][j]==mt[i][j]){
                   aux1++;   
                }else{
                 System.out.println("La matriz no es antisimétrica");
                }
            }
        }
        
        if(aux1==9){
            System.out.println("La matriz es antisimétrica");
        }else{
            System.out.println("La matriz no es antisimétrica");
        }
        
        System.out.println("Matriz Primaria");
        escribir(m1,3,3);
        System.out.println("Matriz Transpuesta");
        escribir(mt,3,3);
        System.out.println("Matriz Negativa");
        escribir(mn,3,3);
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
    
