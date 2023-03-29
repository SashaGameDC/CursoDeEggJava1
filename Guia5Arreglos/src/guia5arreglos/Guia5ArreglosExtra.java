
package guia5arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5ArreglosExtra {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
    //(1)-Realizar un algoritmo que calcule la suma de todos los elementos de un
    //vector de tamaño N, con los valores ingresados por el usuario.
    /*    
    System.out.println("ingrese el tamaño del vector");
    int n = leer.nextInt();
    int vector [] =  new int [n];
    int i, suma=0;
    
      for (i=0; i<= n-1; i++){
        System.out.println("Ingrese los valores a sumar:");
        vector[i]=leer.nextInt();
        
        suma += vector[i];
    }
    System.out.println("El resultado de la suma de los elementos del vector es " + suma);  
    */
    
    //(2)-Escriba un programa que averigüe si dos vectores de N enteros son
    //iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
       /*
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
        */
        
        //(3)-Crear una función rellene un vector con números aleatorios, 
        //pasándole un arreglo por parámetro. Después haremos otra función o 
        //procedimiento que imprima el vector.
        /*
        System.out.println("ingrese la longitud de un vector que completaremos con números aleatórios");
        int n= leer.nextInt();
        int[] vec3= new int [n];
        llenadoDeVector(vec3,n);
        imprimirVector(vec3,n);
        */
        
        //(4)-Promedio de notas
        int[][] Matrix= new int[10][5];
        llenadoM(Matrix,10,4);
        imprimirM(Matrix,10,5);
        
    }
    public static void llenadoM(int[][] matrix,int fila,int columna){
        double sumas=0;
        double aux=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrix[i][j]=(int)(Math.random()*10+1.);

                if(j==0){
                    matrix[i][j]=aux*0.1;
                }else if(j==1){
                    matrix[i][j]=aux*0.15;
                }else if(j==2){
                    matrix[i][j]=aux*0.25;
                }else if(j==3){
                    matrix[i][j]=aux*0.5;
                }
               sumas+= matrix[i][j];
               
            }
            System.out.println(sumas);
        }
    }
    public static void imprimirM(double[][] matrix,int fila,int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(matrix[i][j]<10){
                    System.out.print(" [0" + matrix[i][j] + "] ");
                }else{
                    System.out.print(" [" + matrix[i][j] + "] ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void llenadoDeVector(int[] hector,int linea){
        for (int i = 0; i < linea; i++) {
            hector[i]=(int)(Math.random() * 10);
        }
    }
    public static void imprimirVector(int[] hector,int linea){
        for (int i = 0; i < linea; i++) {
            System.out.print("[" + hector[i] + "] ");
        }
        System.out.println(" ");
        System.out.println("=:3");
    }
}
           

