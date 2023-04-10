
package pooej01.estanteria;

import java.util.Scanner;

public class Puntos {
    
    Scanner leer= new Scanner(System.in);
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    //CONSTRUCTOR//    
    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    //SETTERS//
    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    //GETTERS//
    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
    
    
    /**
     * SE INGRESAN LOS DATOS CORRESPONDIENTE A LAS POSICIONES DE LOS PUNTOS
     * @x1 ingreso de dato
     * @x2 ingreso de dato
     * @y1 ingreso de dato
     * @y2 ingreso de dato
     */
    public void crearPuntos(){
        System.out.println("Ingrese el valor de X para el punto 1");
        x1= leer.nextInt();
        System.out.println("Ingrese el valor de Y para el punto 1");
        y1= leer.nextInt();
        System.out.println("Ingrese el valor de X para el punto 2");
        x2= leer.nextInt();
        System.out.println("Ingrese el valor de Y para el punto 2");
        y2= leer.nextInt();
    }
    
    /**
     * RETORNA LA DISTANCIA ENTRE DOS PUNTOS
     * @return 
     */
    public double ecuPuntos(){
        
        double aux1=0,aux2=0;
                aux1= Math.pow((x2-x1),2);
                aux2= Math.pow((y2-y1),2);
        double distancia= Math.sqrt(aux1+aux2);
        return distancia;
    }
}
    
