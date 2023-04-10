
package guia3extra;

import java.util.Scanner;


public class Guia3Extra_Ej02_A_B_C_D {

    //(2)-A-B-C-D
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int A,B,C,D,aux;
        System.out.println("introduzca 4 numeros");
        A=leer.nextInt();
        B=leer.nextInt();
        C=leer.nextInt();
        D=leer.nextInt();
        System.out.println("A-"+A);
        System.out.println("B-"+B);
        System.out.println("C-"+C);
        System.out.println("D-"+D);
        System.out.println(" ");
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("A-"+A);  
        System.out.println("B-"+B);  
        System.out.println("C-"+C);  
        System.out.println("D-"+D);
    }
}
    
