/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author SashaGameDC
 */
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //ESTO ES UN SI, SINO//
        /*
        int num1, num2;
        System.out.println("Ingrese por favor dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        if (num1>25 && num2>25) {
            System.out.println("Los dos numeros son mayores a 25");
        }else if (num1>25 || num2>25) {
            System.out.println("Uno de os números es mayor a 25");
        }
        */
        
        //ESTO ES UN SEGUN//
        /*
        int tipo;
        System.out.println("Ingrese el valor correspondiente al tipo de motor");
        
        tipo = leer.nextInt();
        
        switch (tipo) {
            case 1:
                System.out.println("Bomba de agua");
            break;
            case 2:
                System.out.println("Bomba de gasolina");
            break;
            case 3:
                System.out.println("Bomba de hormigón");
            break;
            case 4:
                System.out.println("Bomba de pasta alimenticia");
            break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        */
        
        //ESTO ES UN MIENTRAS//
        /*
        int nota;
        System.out.println("Ingrese un valor entre 0 y 10");
        nota = leer.nextInt();
       
        while (nota<0 || nota>10){
            System.out.println("el valor ingresado esta fuera de los parametros");
            nota = leer.nextInt();   
        }
        */
        
        //ESTO ES UN HACER-MIENTRAS//
        /*
        int num3,suma,con;
        suma=0;
        con=0;
        do {
            System.out.println("Ingrese un numero entero positivo y superior a cero");
            num3 = leer.nextInt();
            if (num3>0){
                suma = suma + num3; 
            }else if(num3<0){
                System.out.println("Usted ingreso un numero negativo");
            }
            if (num3==0){
                System.out.println("Se ha capturado el numero cero");
                break;
            }
            con++;
        
        } while (con<20);
        
        System.out.println("la suma de los valores ingresados es " + suma);
        */
        
        //ESTO ES UN PARA//
        
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
