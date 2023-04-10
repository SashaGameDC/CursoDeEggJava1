
package Imprimir;

public class Imprimir {

    //LLenado de Vectores y matrices//
    public static void main(String[] args) {
        
    }
    
    /**
    * Llenado de vector tipo INT
    * @param hector
    * @param linea 
    */
    public static void llenadoDeVectorINT(int[] hector,int linea){
        for (int i = 0; i < linea; i++) {
            hector[i]=(int)(Math.random() * 10);
        }
    }
    
    /**
    * Imprimir en pantalla Vector tipo INT
    * @param hector
    * @param linea 
    */
    public static void imprimirVectorINT(int[] hector,int linea){
        for (int i = 0; i < linea; i++) {
            System.out.print("[" + hector[i] + "] ");
        }
        System.out.println(" ");
        System.out.println("=:3");
    }
     
    /**
    * Llenado de vector tipo DOUBLE
    * @param hector
    * @param linea 
    */
    public static void llenadoDeVectorDOUBLE(double[] hector,double linea){
        for (int i = 0; i < linea; i++) {
            hector[i]=(double)(Math.random() * 10);
        }
    }
    
    /**
    * Imprimir en pantalla Vector tipo DOUBLE
    * @param hector
    * @param linea 
    */
     public static void imprimirVectorDOUBLE(double[] hector,double linea){
        for (int i = 0; i < linea; i++) {
            System.out.print("[" + hector[i] + "] ");
        }
        System.out.println(" ");
        System.out.println("=:3");
    }
     
    /**
    * Llenado de matriz tipo INT
    * @param matriz
    * @param linea 
    * @param columna
    */
    public static void llenadoDeMatrizINT(int[][] matriz,int linea,int columna){
        for (int i = 0; i < linea; i++) {
            for (int j = 0; j < columna; j++) {
                
                matriz[i][j]=(int)(Math.random() * 10);
            }
        }
    }
    
    /**
    * Imprimir en pantalla Matriz tipo INT
    * @param matriz
    * @param linea 
    * @param columna
    */
    public static void imprimirMatrizINT(int[][] matriz, int linea, int columna){
        for (int i = 0; i < linea; i++) {
            for (int j = 0; j < columna; j++) {
                
                System.out.print("[" + matriz[i][j] + "] ");
            }
        System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("=:3");
    }
}
