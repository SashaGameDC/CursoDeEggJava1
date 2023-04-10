
package Guia5Arreglos_Extra;

import static Imprimir.Imprimir.llenadoDeVectorINT;
import static Imprimir.Imprimir.imprimirVectorINT;
import java.util.Scanner;

public class Extra03_Llenado_Aleatorio {
    
    //(3)-Crear una función rellene un vector con números aleatorios, 
    //pasándole un arreglo por parámetro. Después haremos otra función o 
    //procedimiento que imprima el vector.
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingrese la longitud de un vector que completaremos con números aleatórios");
        int n= leer.nextInt();
        int[] vec3= new int [n];
        llenadoDeVectorINT(vec3,n);
        imprimirVectorINT(vec3,n);
    }
    
}
