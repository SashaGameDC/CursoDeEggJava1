/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3ejercicios {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner leer = new Scanner(System.in);
        //(1)- Crear un programa que dado un número determine si es par o impar.
        /*
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("El numero es Par");

        } else {
            System.out.println("El numero es impar");
        }
        */
        
        //(2)+(3)- Crear un programa que pida una frase y si esa frase es igual a 
        //“eureka” el programa pondrá un mensaje de Correcto, sino mostrará un 
        //mensaje de Incorrecto. Nota: investigar la función equals() en Java.
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frace que no supere 8 caracteres");
        String frase = leer.nextLine();
        if (frase.length()<=8){
            System.out.println("su frase contiene " + frase.length() + " caracteres, está dentro de los parametros");
        }else if (frase.length()>8){
            System.out.println("Error");
        }
        */
        
        //(4)-frace que comience con 'A'
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra que comience con la letra 'A'");
        String palabra = leer.next();
        if (palabra.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Error");
        } 
        */
        
        //(5)-Sumatoria de numeros con limite
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite para realizar una sumatoria");
        int limite = leer.nextInt();
        System.out.println("A continuacion ingrese los valores a sumar");
        int suma = 0;
        do{
            int num = leer.nextInt();
            if(num+suma>limite){
                System.out.println("Este numero supera el limite. No se puede sumar");
            }else if(num+suma<=limite){
            suma = suma + num;
            }
            System.out.println("Actualmente la suma de valores es de " + suma);
        }while (suma<limite);
        */
        //(6)- Menu rompe bolas
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros y luego la ecuacion a realizar");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        int aux = 5;
        
        do{   
            System.out.println("Ingre el valor equivalente a la operacion requerida\n" + "1)-Suma\n" + "2)-resta\n" + "3)-Multiplicar\n" + "4)-dividir\n" + "5)-Salir");
            int opcion = leer.nextInt();
            switch (opcion){
                case 1: System.out.println("El resultado de la suma es " + (num1 + num2));
                    break;
                case 2: System.out.println("El resultado de la resta es " + (num1 - num2));
                    break;
                case 3: System.out.println("El resultado de la multiplicación es " + (num1 * num2));
                    break;
                case 4: System.out.println("El resultado de la divición es " + (num1 / num2));
                    break;
                default:
                    while(opcion<1 || opcion>5){
                        System.out.println("Error. Ingrese el valor correspondiente");
                        opcion = leer.nextInt();
                    }
            }
            
            System.out.println(" ");
            
            if (opcion == 5){
                System.out.println("Esta seguro de querer salir? (s/n)");
                String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")){
                    aux = 6;
                    } 
            }
        
        } while (aux==5);
        */
        
        //(7)-Realizar un programa que simule el funcionamiento de un dispositivo RS232
        /*
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
        */
        
        //(cuadrado de *)
               
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){

                if(j == 1 || j == 4 || i == 1 || i == 4){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
        System.out.println(""); 
        
        } 

       
    }

}