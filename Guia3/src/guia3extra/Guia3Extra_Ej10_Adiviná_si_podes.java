
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej10_Adiviná_si_podes {
    
    //(10)-Adiviná si podes!!
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n1 = (int)(Math.random() * 10), n2 = (int)(Math.random() * 10);  
        int rta;

       do{
        System.out.println("Intente adivinar el resultado de la mult");
        rta = leer.nextInt();
        if(rta == n1*n2){
            System.out.println("Bien ahí master");
        }else{
            System.out.println("Intento incorrecto.");
            if(rta < n1*n2){
                System.out.println("El resultado es mayor");
            } else {
                System.out.println("El resultado es menor");
            }
        }
       }while(rta!=n1*n2);
    }
    
}
