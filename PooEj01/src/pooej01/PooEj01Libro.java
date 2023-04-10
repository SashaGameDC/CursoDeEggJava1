
package pooej01;

import java.util.Scanner;
import pooej01.estanteria.Libro;


public class PooEj01Libro {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Libro l001= new Libro();
         
        l001.ingDatos();
        l001.mosDatos();
    }


    
}
