
package Guia5Arreglos_Extra;

import static Imprimir.Imprimir.imprimirMatrizINT;
import static Imprimir.Imprimir.llenadoDeMatrizINT;
import java.util.Scanner;

public class Extra05_Matriz_Aleatoria {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese los valores de filas y columnas para generar una matriz.\n"
        + "Luego le mostraremos la matriz y la suma de sus filas y el valor final.\n");
        
        System.out.println("Filas");
        int n= leer.nextInt();
        System.out.println("Columnas");
        int m= leer.nextInt();
        System.out.println("");
        
        int[][] ma= new int[n][m];
        
        llenadoDeMatrizINT(ma,n,m);
        imprimirMatrizINT(ma,n,m);
        sumas(ma,n,m);
    }
        
    public static void sumas(int[][] matriz,int fila,int columna){
        int aux1=0, aux3=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                aux1+= matriz[i][j];
            }
            System.out.println("La fila " + (i+1) + " suma un total de " + aux1);

            aux3+= aux1;
            aux1=0;
        }
        System.out.println("");
        System.out.println("El total de los números ingresados es igual a " + aux3);
    }
}
