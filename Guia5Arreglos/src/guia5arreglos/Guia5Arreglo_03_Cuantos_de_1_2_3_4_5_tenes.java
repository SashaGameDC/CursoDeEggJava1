
package guia5arreglos;

import java.util.Scanner;

public class Guia5Arreglo_03_Cuantos_de_1_2_3_4_5_tenes {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un valor. se le colocaran numeros al azar y le diremos cuantos números de un digito se encontraron dentro.\n"
                + "De dos; Tres; Cuatro y cinco");
        int vector= leer.nextInt();
        int aux1=0, aux2=0, aux3=0,aux4=0,aux5=0,aux6=0;
        int [] digitos= new int[vector];
        
        for (int i = 0; i < vector; i++) {
            digitos[i] =(int)(Math.random() * 12000);
            System.out.print("["+ digitos[i] + "]" + " ");
            if(digitos[i]<10){
             aux1++;
            }else if(digitos[i]>9 && digitos[i]<100){
             aux2++;
            }else if(digitos[i]>99 && digitos[i]<1000){
             aux3++;
            }else if(digitos[i]>999 && digitos[i]<10000){
             aux4++;
            }else {
             aux5++;
            }
            
            aux6++;
            if(aux6%10==0){
            System.out.println(" ");
            }
        }
        
        System.out.println(" ");
        System.out.println("Dentro de los valores generados aleatoriamente\n"
                + aux1 + " valores de un dígito\n"
                + aux2 + " valores de dos dígitos\n"
                + aux3 + " valores de tres dígitos\n"
                + aux4 + " valores de cuatro dígitos\n"
                + aux5 + " valores de cinco dígitos");
    }
    
}
