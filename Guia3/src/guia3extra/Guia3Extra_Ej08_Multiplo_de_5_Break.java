
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej08_Multiplo_de_5_Break {
    
    //(8)-Enteros. si es mutiplo de 5 Break, cuantos pares, cuantos impares y negativos no//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int multi=0;int par=0;int imp=0;int ing=0;
        do{
           System.err.println("Ingresá un núnero");
           int num= leer.nextInt();
           if(num<0){
           continue;
           }else if(num%2==0){
           par++;
           ing++;
           }else{
           imp++;
           ing++;  
           }
           if(num%5==0){
           break;
           }
        }while(multi==0);
        System.out.println("Usted ingresó " + ing + " números\n" + par + "pares y " + imp + " impares");
    }
    
}
