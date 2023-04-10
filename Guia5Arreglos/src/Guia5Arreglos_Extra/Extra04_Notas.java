
package Guia5Arreglos_Extra;

import java.util.Scanner;

public class Extra04_Notas {
    
    //(4)-Promedio de notas
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);

        double[][] Matrix= new double[10][5];
        llenadoM(Matrix,10,4);
    }
    
    public static void llenadoM(double[][] matrix,int fila,int columna){
        double sumas=0;
        int aux=0,aux1=0,aux2=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                aux=(int)(Math.random()*10+1.);

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
               matrix[i][4]=sumas;
            }
            
            System.out.print("El alumno " + (i+1) + " obtuvo como nota final un " + sumas);
            if(sumas<7){
                System.out.println(" .Se encuentra desaprovado");
                aux1++;
            }else{
                System.out.println(" .Se encuentra aprovado");
                aux2++;
            }
            sumas=0;
        }
        System.out.println("Aprovaron el curso " + aux2 + " alumnos.\n"
        + "Desaprovaron el curso " + aux1 + " alumnos." );
    }
}
    
