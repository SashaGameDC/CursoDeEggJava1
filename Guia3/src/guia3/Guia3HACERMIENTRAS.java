
package guia3;

import java.util.Scanner;


public class Guia3HACERMIENTRAS {

    //ESTO ES UN HACER-MIENTRAS//
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num3,suma,con;
        suma=0;
        con=0;
        do {
            System.out.println("Ingrese un numero entero positivo y superior a cero");
            num3 = leer.nextInt();
            if (num3>0){
                suma = suma + num3; 
            }else if(num3<0){
                System.out.println("Usted ingreso un numero negativo");
            }
            if (num3==0){
                System.out.println("Se ha capturado el numero cero");
                break;
            }
            con++;
        
        } while (con<20);
        
        System.out.println("la suma de los valores ingresados es " + suma);
    }
}
    
