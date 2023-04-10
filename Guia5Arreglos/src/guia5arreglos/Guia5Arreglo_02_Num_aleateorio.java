
package guia5arreglos;

import java.util.Scanner;

public class Guia5Arreglo_02_Num_aleateorio {

    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Chango. ingresá un valor entre 0 y 9. Si llega a estar dentro de los 10 numeros aleatorios te lo diremos.");
        int num= leer.nextInt();
        int [] diez= new int[10];
        int aux=0;
        for (int i = 0; i < 10; i++) {
            diez[i]= (int)(Math.random() * 10);
            if(num==diez[i]){
               System.out.println("Su valor se encuentra en las posición " + i);
               aux++;
            }
        }
        if(aux==1){
            System.out.println("Repitiendose " + aux + " vez");
        }else if(aux<=2){
            System.out.println("Repitiendose " + aux + " veces");
        }
    }
}
    
