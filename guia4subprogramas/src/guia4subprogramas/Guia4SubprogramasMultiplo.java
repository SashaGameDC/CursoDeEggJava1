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
public class Guia4SubprogramasMultiplo {
    
    public static void main(String[] args){
    
    Scanner leer= new Scanner(System.in);
    System.out.println("Chango, meté dos números y te digo si el primero es multiplo del segundo");
    int num1= leer.nextInt(); 
    int num2= leer.nextInt();
    Multi(num1, num2);
    
    }
    public static void Multi(int num1, int num2){
        if(num1%num2==0){
            System.out.println("Si es multiplo");
        }else{
            System.out.println("No es multiplo");
        } 
    }
}
