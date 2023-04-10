
package pooej01.estanteria;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer= new Scanner(System.in);
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //SET//
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //GET//
    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(){
         System.out.println("Ingrese el radio de la circunferencia que desea analizar\n"
        + "Medir desde el medio hasta la circunferencia");
         radio = leer.nextDouble();
    }
    
    /**
     * @return Área de la circunferencia
     */
    public double area(){
        
        double Area= Math.PI * radio * radio;
        return Area;
    }
    
    /**
     * @return Perímetro de la circunferencia
     */
    public double perimetro(){
        double Perimetro= 2 * Math.PI * radio;
        return Perimetro;
    }
}
  //this.area = (3.1416 * radio * radio);
  //this.area = Math.PI * radio * radio;   
