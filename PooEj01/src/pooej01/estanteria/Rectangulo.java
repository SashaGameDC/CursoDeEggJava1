
package pooej01.estanteria;

import java.util.Scanner;

public class Rectangulo {
    
    Scanner leer= new Scanner(System.in);
    
    private int base;
    private int altura;
    private int superficie;
    private int perimetro;

    public Rectangulo() {
    }
    
    public Rectangulo(int base, int altura, int superficie, int perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }
    
    public void llenado(){
        System.out.println("Ingrese la base del rectángulo.");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo.");
        this.altura = leer.nextInt();
        this.superficie();
        this.perimetro();
    }
    
    //LLENADO DE SUPERFICIE//
    public int superficie(){
        
        superficie = base * altura;
        return superficie;
    }
    
    //LLENADO DE PERÍMETRO//
    public int perimetro(){
        
        perimetro = (base + altura) * 2;
        return perimetro;
    }
    
    public void DibujoUnRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(j==0 || j==base-1 || i==0 || i==altura-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");    
        }
    }
    
    
    
    //SETTER DE ATRI//
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
    //GETTERS DE ATRI//
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getPerimetro() {
        return perimetro;
    }
}
    
