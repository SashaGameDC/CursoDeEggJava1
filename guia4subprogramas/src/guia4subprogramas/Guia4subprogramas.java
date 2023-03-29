/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4subprogramas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4subprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       //(1)-Menú matemático
        System.out.println("Ingrese dos valores y la operacion matemática a realizar\n");
        int aux=0;
        System.out.println("Primer valor");
        int num1= leer.nextInt();
        System.out.println("Segundo valor");
        int num2= leer.nextInt();
        do{
            System.out.println("1)-Suma\n" + "2)-Resta\n" + "3)-Divicion\n" + "4)-Multiplicación\n" + "5)-Salir");
            int opcion= leer.nextInt();
            
            switch(opcion){
                case 1:{
                    System.out.println("El resultado es " + sumar(num1,num2));    
                break;
                }
                
                case 2:{
                    System.out.println("El resultado es " + restar(num1,num2));    
                break;
                }
                
                case 3:{
                    System.out.println("El resultado es " + divicion(num1,num2));
                break;
                }
                
                case 4:{
                    System.out.println("El resultado es " + multiplicarar(num1,num2));
                break;
                }
                
                case 5:{
                    System.out.println("Gracias por usar el programa");
                    aux++;
                break;
                }
                
                default:{

                    do{
                    System.out.println("Usted ingreso un valor incorrecto");
                    opcion=leer.nextInt();
                    }while(opcion<0 && opcion<6);
                }
                break;
            }//cierre Switch
                
        }while(aux==0);
        
    }
    
    public static int sumar(int num1,int num2){
        int suma= num1 + num2;
        return suma;
    } 
    public static int restar(int num1,int num2){
        int resta= num1 - num2;
        return resta;
    }
     public static double divicion(int num1,int num2){
        double div= num1 / num2;
        return div;
    }
      public static int multiplicarar(int num1,int num2){
        int multi= num1 * num2;
        return multi;
    }
}

