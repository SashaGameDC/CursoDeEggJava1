
package pooej01.estanteria;

import java.util.Scanner;

public class Cancion {
    
    Scanner leer= new Scanner(System.in);
    
    private String titulo;
    private String autor;
    
    //COSTRUCTOR//
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    
    //SETTER//
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //GETTER//
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void detalles(){
        System.out.println("Ingrese los datos del tema a registrar\n"
        + "Título del tema.");
        titulo= leer.nextLine();
        System.out.println("Ahora el autor.");
        autor= leer.nextLine();
    }
    
    public void imprimir(){
        System.out.println("los datos ingresados son\n"
        + "Título: " + titulo + "\n"
        + "Autor: " + autor);
    }
}
    
