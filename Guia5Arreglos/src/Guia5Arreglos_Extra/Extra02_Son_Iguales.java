
package Guia5Arreglos_Extra;

import java.util.Scanner;

public class Extra02_Son_Iguales {
    
    //(2)-Escriba un programa que averigüe si dos vectores de N enteros son
    //iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos)
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
                int[] vec1= new int[3];
        int[] vec2= new int[3];
        boolean corte=true;
        System.out.println("Ingrese dos cadenas de valores. comprovaremos si son iguales o no ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadena 1");
            vec1[i]=leer.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("cadena2");
            vec2[i]=leer.nextInt();
        }
        int aux1=0;
        do{
            for (int i = 0; i < 3; i++) {
                if(vec1[i]==vec2[i]){
                   aux1++;
                }else{
                    System.out.println("Las cadenas no son iguales");
                    corte=false;
                    break;
                }
            }
            corte=false;        
        }while(corte==true);
        if(aux1==3){
            System.out.println("Las cadenas son iguales");
        }
    }
}
        
    
