
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej11_Cuantos_Dígitos_tiene {
    
    //(11)-Cuantos digitos tiene este numero?//
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un número y le dire cuantos digitos tiene");
        int num= leer.nextInt();int aux=0;
        if (num>0){
            do{
                num=num/10;
                aux++;
            }while(num>10);
            System.out.println("Su número esta compuesto por " + (aux+1) + " dígitos");
        }else{
            do{
            num=num/10;
            aux++;
            }while(num<(-10));
             System.out.println("Su número esta compuesto por " + (aux+1) + " dígitos");
        }
    }
}
    
