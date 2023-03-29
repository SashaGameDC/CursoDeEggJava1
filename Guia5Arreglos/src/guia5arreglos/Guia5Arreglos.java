/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        /*
        String[] equipo= new String[8];
        String[][] matriz= new String[3][3];
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese el nombre de algun miembro del grupo");
            equipo[i] = leer.next();
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.println(equipo[i]);
            
        }
        */
        
        //(01)-Diez conejas, un conejo
        /*
        int [] cien= new int[100];
        
        for (int i = 0; i < 100; i++) {
            cien[i] = i+1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print("["+cien[i]+"]");
        }
        */
        
        //(02)-Número aleatorio dentro de vector. 
        /*
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
        }else if(aux=<2){
            System.out.println("Repitiendose " + aux + " veces");
        }
        */
        
        //(3)-Cuantos de 1,2 3,4 y 5 tenes?
        /*
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
         */
        
    //(4)-generar matriz de 4x4 y mostrar transpuesta.
    /*
        System.out.println("Te mostramos una matriz y su transpuesta");
        System.out.println(" ");
        int[][] m1= new int[4][4];
        int[][] m2= new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                m1[i][j]=(int)(Math.random() * 10);
                m2[j][i]=m1[i][j];
            }
        }
        escribir(m1,4,4);
        escribir(m2,4,4);
    */

    //(5)-Matriz transpuesta antisimetrica
        /*
    System.out.println("Te mostramos una matriz y su transpuesta");
        System.out.println(" ");
        int[][] m1= {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] mt= new int[3][3];
        int[][] mn= new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                //m1[i][j]=(int)(Math.random() * 20 + 1 -10);
                mt[j][i]=m1[i][j];
                mn[i][j]=-m1[i][j];
            }
        }
        int aux1 =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(mn[i][j]==mt[i][j]){
                   aux1++;   
                }else{
                 System.out.println("La matriz no es antisimétrica");
                }
            }
        }
        if(aux1==9){
            System.out.println("La matriz es antisimétrica");
        }else{
            System.out.println("La matriz no es antisimétrica");
        }
        System.out.println("Matriz Primaria");
        escribir(m1,3,3);
        System.out.println("Matriz Transpuesta");
        escribir(mt,3,3);
        System.out.println("Matriz Negativa");
        escribir(mn,3,3);
    }    
    */
    //(6)-Caja mágica
    
    
        int[][] mm= new int[3][3];
        int[] sumas= new int[8];
        System.out.println("Introduzca 9 valores entre 1 y 9 y le diremos si la matriz es mágica o no\n"
                + "Será magica si la suma de sus filas, sus columnas y sus diagonales son idénticas. \n");
        int aux1=0,aux2=0,aux3=0,aux4=2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mm[i][j]=leer.nextInt();
                if(mm[i][j]<1 || mm[i][j]>9){
                   while(mm[i][j]<1 || mm[i][j]>9){
                    System.out.println("Entre 1 y 9 te dijimos!!");
                    mm[i][j]=leer.nextInt();
                   }
                }
                if(mm[i][j]>0 && mm[i][j]<10){
                aux1+= mm[i][j];
                }
            }
            sumas[i]=aux1;
            aux1=0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux1=aux1+mm[j][i];
                if(i==j){
                    aux2=aux2+mm[i][j];
                }
                if(j==aux4){
                    aux3=aux3+mm[i][j];
                    aux4--;
                }
            }
            sumas[i+3]=aux1;
            sumas[6]=aux2;
            sumas[7]=aux3;
            aux1=0;
        }
        boolean ok=false;
        int aux5=0;
        do{
            for (int i = 0; i < 7; i++) {
                if(sumas[i]!=sumas[7]){
                    System.out.println("Su matriz no es mágica");
                    ok=true;
                    aux5++;
                    break;
                }
            }
            if(aux5==0){System.out.println("Su matriz es mágica");
                ok=true;
            }
        }while(ok==false);   
        escribir(mm,3,3);
    }
        
    public static void escribir(int[][] matriz, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    
    }
    
}

