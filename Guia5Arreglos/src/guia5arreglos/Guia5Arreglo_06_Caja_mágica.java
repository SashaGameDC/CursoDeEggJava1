
package guia5arreglos;

import java.util.Scanner;

public class Guia5Arreglo_06_Caja_mágica {
    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);

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
    
    

