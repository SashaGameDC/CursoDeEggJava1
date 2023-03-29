/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // (1)-transformar minutos en dias y horas
        /*
        Scanner leer= new Scanner(System.in);
        int sobras;
        double horas,dias;
        dias=0;
        System.out.println("Ingrese una cantidad de minutos y le diremos cuanto es en dias y horas ");
        int min = leer.nextInt();
        horas= (min /60);
        sobras = min%60;
        if(horas>24){
        dias= (horas/24);
        }
        System.out.println("el valor introducido es igual a: " + Math.round(dias) + " dias, " + Math.round(horas) + " horas y " + sobras + " minutos");
        */
        
        //(2)-A-B-C-D
        /*
        Scanner leer = new Scanner(System.in);
        int A,B,C,D,aux;
        System.out.println("introduzca 4 numeros");
        A=leer.nextInt();
        B=leer.nextInt();
        C=leer.nextInt();
        D=leer.nextInt();
        System.out.println("A-"+A);
        System.out.println("B-"+B);
        System.out.println("C-"+C);
        System.out.println("D-"+D);
        System.out.println(" ");
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
       System.out.println("A-"+A);  
       System.out.println("B-"+B);  
       System.out.println("C-"+C);  
       System.out.println("D-"+D);
       */
        
        //(3)-vocales
        /*
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Usted a ingresado una vocal");
        }else{
            System.out.println("Usted a ingresado una consonante");
        }
        */
        
        //(4)-transformar a romano
        /*
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero del 1 al 10");
        num = leer.nextInt();
            do {
                switch (num) {
                    case 1: {
                        System.out.println("I");
                    }
                    break;
                    case 2: {
                        System.out.println("II");
                    }
                    break;
                    case 3: {
                        System.out.println("III");
                    }
                    break;
                    case 4: {
                        System.out.println("IV");
                    }
                    break;
                    case 5: {
                        System.out.println("V");
                    }
                    break;
                    case 6: {
                        System.out.println("VI");
                    }
                    break;
                    case 7: {
                        System.out.println("VII");
                    }
                    break;
                    case 8: {
                        System.out.println("VIII");
                    }
                    break;
                    case 9: {
                        System.out.println("IX");
                    }
                    break;
                    case 10: {
                        System.out.println("X");
                    }
                    break;
                    default:
                            System.out.println("Error. Ingrese el valor correspondiente");
                            num = leer.nextInt();
                         
                   
                }
            } while (num < 1 || num > 10);
            */
        
        //(5)-Realidad de mierda
        /*
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio y el valor del analisis a realizar");
        String tipo= leer.next();
        tipo=tipo.toUpperCase();
        int valor= leer.nextInt();
        switch(tipo){
            case "A":{System.out.println("Usted tiene que pagar " + (valor*0.5));
            }
            break;
            case "B":{System.out.println("Usted tiene que pagar " + (valor*0.75));
            }
            break;
            case "C":{System.out.println("No le descontamos nada por POBRE. Pague " + valor);
            }
            break;
        }
        */
        
        //(6)-promedio de enanos y normales
        /*
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
        */
        
        //(7)-Max, min y prom de xn/x2
        /*sout
        Scanner leer= new Scanner(System.in);
        
        int suma=0; int cont1=0; int max=0;int min=100; 
 
        System.out.println("Ingrese la cantidad de números a ingresar(que sea mayor a 3)");
        int n=leer.nextInt();
        while(cont1!=n){
            System.out.println("Ingrese un valor entero");
            int valor= leer.nextInt();
            suma=suma+valor;
            cont1++;
            max=Math.max(max,valor);
            min=Math.min(min,valor);
        }
        System.out.println("De los valores ingresados\n" + "El valor máximo es "+ max + ".\n" + "El valor mínimo es " + min + ".\n" + "el promedio es " + (suma/n));
        */
        
        //(8)-Enteros. si es mutiplo de 5 Break, cuantos pares, cuantos impares y negativos no.
        /*
        Scanner leer= new Scanner(System.in);
        
        int multi=0;int par=0;int imp=0;int ing=0;
        do{
           System.err.println("Ingresá un núnero");
           int num= leer.nextInt();
           if(num<0){
           continue;
           }else if(num%2==0){
           par++;
           ing++;
           }else{
           imp++;
           ing++;  
           }
           if(num%5==0){
           break;
           }
        }while(multi==0);
        System.out.println("Usted ingresó " + ing + " números\n" + par + "pares y " + imp + " impares");
        */
        
        //(9)-Divicion con restas sucesivas
        /*
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
        */
        
        //(10)-Adiviná si podes!!
        /*
        Scanner leer = new Scanner(System.in);
        int n1 = (int)(Math.random() * 10), n2 = (int)(Math.random() * 10);  
        int rta;

       do{
        System.out.println("Intente adivinar el resultado de la mult");
        rta = leer.nextInt();
        if(rta == n1*n2){
            System.out.println("Bien ahí master");
        }else{
            System.out.println("Intento incorrecto.");
            if(rta < n1*n2){
                System.out.println("El resultado es mayor");
            } else {
                System.out.println("El resultado es menor");
            }
        }
       }while(rta!=n1*n2);
       */
        
        //(11)-Cuantos digitos tiene este numero?
        /*
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
        */
        
        //(12)-
        //(13)-escalera numérica
        /*
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera a escribir");
        int altura= leer.nextInt();
        for (int i = 1; i < altura+1; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        */
        
        //(14)-
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese ");
    }
    
}
