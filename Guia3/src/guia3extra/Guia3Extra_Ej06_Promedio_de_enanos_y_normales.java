
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej06_Promedio_de_enanos_y_normales {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int aux1=0;
        double aux2=0;
        double aux3=0;
        int cont1=0;
        int cont2=0;
        System.out.println("Ingrese los valores de estatura registrados");
        do{
            double Altura= leer.nextDouble();
            if(Altura<1.60){
                aux2=aux2+Altura;
                cont1++;
            }
            aux3=aux3+Altura;
            cont2++;
            System.out.println("Desea ingresar otro valor? (s/n)");
            String Resp= leer.next();
            if(Resp.equalsIgnoreCase("n")){
            aux1++;
            } 
        }while(aux1 == 0);
        
        System.out.println("El promedio de las estaturas menores a 1.60 es " + (aux2/cont1));
        System.out.println("El promedio general de las estaturas es " + (aux3/cont2));
    }
    
}
