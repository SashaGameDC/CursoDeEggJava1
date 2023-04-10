
package guia4subprogramas;

import java.util.Scanner;

public class Guia4Sub_00_11_Frase_codificada {
    
    //FRACECO DIFICADA//
    public static void main(String[] args){
    
    Scanner leer= new Scanner(System.in);
    
    saludos();
    String frase= leer.nextLine();
    codificado(frase);
    }
    
    public static void saludos(){
        System.out.println("Bienvenido al programa de codificación mas trucho de la historia\n" + "ingrese una frase a codificar");
    }
    
    public static void codificado(String frase){
        String frase2=frase.toLowerCase();String resultado;
        System.out.println("Su frase está siendo codificada. por favor espere\n" + "...\n" + "...\n" + "...");
        for (int i = 0; i<frase2.length(); i++) {
            switch(frase2.substring(i,i+1)){
                case "a":{
                    resultado="@"; 
                }break;
                case "e":{
                    resultado="#"; 
                }break;
                case "i":{
                    resultado="$"; 
                }break;
                case "o":{
                    resultado="%"; 
                }break;
                case "u":{
                    resultado="*";
                }break;
                default:{
                    resultado=frase2.substring(i,i+1);
                }
           
            }
             System.out.print(resultado); 
        }
        System.out.println(" ");
    }
}
