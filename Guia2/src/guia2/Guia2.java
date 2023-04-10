
package guia2;

import java.util.Scanner;


public class Guia2 {

    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);

/*
1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
       // int suma, num1, num2;
       // System.out.println("Ingrese el primer número a sumar");
       // num1 = leer.nextInt();
        //System.out.println("Ingrese el segundo número a sumar");
       // num2 = leer.nextInt();
       // suma = num1 + num2;
       // System.out.println("El resultado de la suma es: " + suma);
        
/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/  
       // System.out.println("Ingrese su nombre");
       // String nom = leer.next();
       // System.out.println("Tu nombre es: " + nombre);
        
/*  
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
*/
       // System.out.println("Escribite algo");
       // String frase = leer.nextLine();
       // String fraseMayus = frase.toUpperCase();
       // String fraseMinus = frase.toLowerCase();
       // System.out.println("La frase en mayuscula: " + fraseMayus);
       // System.out.println("La frase en minuscula: " + fraseMinus);
        
       // System.out.println(frase.toUpperCase());
       // System.out.println(frase.toLowerCase());
        
/* 
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/     // double gradosC, gradosF;
       // System.out.println("Ingrese el valor de grados centigrados para transformar en Fahrenheit");
       // gradosC = leer.nextDouble();
       // gradosF = 32 + (9 * gradosC/5);
       // System.out.println("El equivalente en grados Fahrenheit es de: " + gradosF);
        
/*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número
*/
        int entero;
       
        System.out.println("Ingrese un número");
        entero = leer.nextInt();
        System.out.println("El doble del valor ingresado es " + entero * 2 );
        System.out.println("El triple del valor ingresado es " + entero *3);
        System.out.println("La raiz cuadrada " + Math.sqrt(entero));
        System.out.println(Math.sqrt(entero));
        
        
    }

    
}
