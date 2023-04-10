
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej07_Max_Min_y_Promedio {
    
    //(7)-Max, min y prom de xn/x2//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int suma=0; int cont1=0; int max=0;int min=100; 
 
        System.out.println("Ingrese la cantidad de números a ingresar(que sea mayor a 3)");
        int n=leer.nextInt();
        while(cont1!=n){
            System.out.println("Ingrese un valor entero");
            int valor= leer.nextInt();
            suma=suma+valor;
            cont1++;
            max=Math.max(max,valor);
            min=Math.min(min,valor);
        }
        System.out.println("De los valores ingresados\n" + "El valor máximo es "+ max + ".\n" + "El valor mínimo es " + min + ".\n" + "el promedio es " + (suma/n));
    }
    
}
