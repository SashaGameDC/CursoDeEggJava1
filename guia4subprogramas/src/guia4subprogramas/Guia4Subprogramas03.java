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
public class Guia4Subprogramas03 {
        
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el valor a transformar y la opcion de moneda extranjera");
        double cant= leer.nextDouble();
        System.out.println("Dolares\n" + "Yenes\n" + "Libras\n");
        String opc= leer.next().toLowerCase();
        transf(cant,opc);
            
    }
    public static void transf(double cant, String opc){
        switch(opc){
            case "dolares":{
                    System.out.println("son " + (cant*0.86) + " dolares");
                }break;
            case "yenes":{
                    System.out.println("son " + (cant*1.28611) + " yenes");
                }break;
            case "libras":{
                    System.out.println("son " + (cant*129.852) + " dolares");
                }break;
        }
    }
        
}
