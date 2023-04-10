
package guia3ejercicios;

import java.util.Scanner;


public class Guia3Ej07_Dispositivo_RS232 {

    //(7)-Realizar un programa que simule el funcionamiento de un dispositivo RS232
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        int aux = 0;
        int correcto = 0;
        int incorrecto = 0;
        boolean programa = true;
        System.out.println("Ingrese la secuencia a confirmar\n" + "Recuerde que al introducir &&&&& se finalizará el ingreso");
        do{
            String cadena = leer.nextLine();
            aux++;
            if(aux==5){
                System.out.println("Recuerde que al introducir &&&&& se finalizará el ingreso");
            }
            if(cadena.length()==5){
                if(cadena.substring(0,1).equals("X")){
                    
                    if(cadena.substring(4,5).equals("O")){
                      correcto++;
                    }else{
                        incorrecto++;
                        }
                }else if(cadena.equals("&&&&&")){
                    programa = false;
                    }else {
                    incorrecto++;
                    }
            }else{
                incorrecto++;
                }
        
        } while (programa == true);
        
        System.out.println("Ud. Ingreso " + correcto + " secuencias correctas y " + incorrecto + " secuencias incorrectas");
    }
    
}
