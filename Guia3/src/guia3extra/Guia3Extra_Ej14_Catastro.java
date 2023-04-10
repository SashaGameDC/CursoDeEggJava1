
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej14_Catastro {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias encuestadas");
        int flia= leer.nextInt();
        int aux1=0, aux2=100, aux3=0, aux4=0;
        for (int i = 0; i < flia; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene la familia " + (i+1));
            int hijos= leer.nextInt();
            aux3 += hijos;
            if (hijos==0){
                continue;    
            }else{
                for (int j = 0; j < hijos; j++) {
                    System.out.println("Ingrese la edad ");
                    int edad= leer.nextInt();
                    aux4 += edad;
                    if(edad>aux1){
                        aux1=edad;
                    }else if(edad<aux1 && edad<aux2){
                        aux2=edad;
                    }
                }
            }
        }
        System.out.println("La edad máxima registrada en las encuestas es de " + aux1 + " años\n"
        + "La edad mínima regstrada en las encuestas es de " + aux2 + " años\n"
        + "La media es " + (aux4/aux3));
    }   
}
            
    
