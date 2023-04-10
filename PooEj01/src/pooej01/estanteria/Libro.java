
package pooej01.estanteria;

import java.util.Scanner;


public class Libro {
    
    public long ISBN;
    public String titulo;
    public String Autor;
    public int NumeroDePaginas;

    public Libro() {
    }
    
    
    public Libro(int ISBN, String Título, String Autor, int NúmeroDePáginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public void ingDatos() {
        Scanner leer= new Scanner(System.in);
        Scanner leer2= new Scanner(System.in);
        
        System.out.println("Buenas!! ingresa los datos necesarios para registrar un libro en la biblioteca digital");
       
        System.out.println("Titulo");
        this.titulo= leer.nextLine();
        System.out.println("Autor");
        this.Autor= leer.nextLine();
        System.out.println("Número de paginas");
        this.NumeroDePaginas= leer.nextInt();
        System.out.println("ISBN");
        this.ISBN= leer.nextLong();
    }

    
    public void mosDatos() {
        System.out.println("los datos ingresados son:\n"
        + "ISBN: " + ISBN + "\n"
        + "Titulo: " + titulo + "\n"
        + "Autor: " + Autor + "\n"
        + "Número de páginas: " + NumeroDePaginas);
        
    }

   
    
    
    
}
