
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej09_Restas_sucesivas {
    
    //(9)-Divicion con restas sucesivas//
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el valor entero a dividir y luego el divisor, tambien entero\n" + "Recuerde que para este programa, el divisor tiene que ser menor");
        int cociente=0;
        
        System.out.println("divisor");
        int num1= leer.nextInt();
        System.out.println("dividendo");
        int div= leer.nextInt();
        if(div>num1){
            while(div>num1){
                System.out.println("Ingrese un valor menor al dividendo");
                div= leer.nextInt();
            }
        }else{
            System.out.println("procesando\n" + " \n" + "...");
            do{
                num1= num1-div;
                cociente++;
            }while(num1>=div);
        }
        
        System.out.println("habiendo divididp los valores ingresados. El resto es " + num1 + " y el cociente es " + cociente);
    }
    
}
