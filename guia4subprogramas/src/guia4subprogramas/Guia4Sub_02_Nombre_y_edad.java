
package guia4subprogramas;

import java.util.Scanner;

public class Guia4Sub_02_Nombre_y_edad {

    public static void main(String[] args){
        
        Scanner leer= new Scanner(System.in);
        int aux=0;
        System.out.println("Buenas. ingrese datos de los encuestados");
        
        do{
            System.out.println("Nombre");
            String nombre= leer.next();
            System.out.println("Edad");
            int edad= leer.nextInt();
            datos(nombre,edad);
            System.out.println("Desea ingresar los datos de otro encuestado? (s/n)");
            String resp= leer.next();
            
            if (conti(resp)==0){
            aux=0;
            }else{
                aux=1;
            }
        }while(aux==0);
    }
    
    public static void datos(String nombre,int edad){
        if(edad<18){
            System.out.println(nombre + " es menor de edad");
        }else if(edad>17){
            System.out.println(nombre + " es mayor de edad");
        }
    }
        
    public static int conti(String resp){
        int aux2=0;   
        if(resp.equalsIgnoreCase("s")){
            aux2=0;
        }else if(resp.equalsIgnoreCase("n")){
            aux2=1;
        }
        return aux2;    
    }
}
    
