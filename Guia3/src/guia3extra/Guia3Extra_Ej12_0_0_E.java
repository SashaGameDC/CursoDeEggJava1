
package guia3extra;

import java.util.Scanner;

public class Guia3Extra_Ej12_0_0_E {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un valor menos a 100 para avanzar en el contador digital");
        int n= leer.nextInt();
        int aux1=0, aux2=0, aux3=0;
        boolean salida=false;
        
        for (int i = 0; i < n; i++) {

            if(aux1==3){
                System.out.print("E-");
            }else{
                System.out.print(aux1 + "-");
            }
            if(aux2==3){
                System.out.print("E-");
            }else{
                System.out.print(aux2 + "-");
            }
            if(aux3==3){
                System.out.print("E");
            }else{
                System.out.print(aux3);
            }
            System.out.println(" ");
            if(aux1==9 && aux2==9 && aux3==9){
                break;
            }
            aux3++;
            if(aux3==10){
                aux2++;
                aux3=0;
                if(aux2==10){
                    aux1++;
                    aux2=0;
                    
                }
            }
        }
    }
}
                            
    
