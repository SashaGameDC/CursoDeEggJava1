
package pooej01.estanteria;

public class Rectangulo2 {
    
    public int lado1;//ALTURA
    public int lado2;//BASE

    public Rectangulo2() {
    }

    public Rectangulo2(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int calcular_area(){
        
        return (lado1*lado2);
    }
    
    public void imprimir_area(){
        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado2; j++) {
                if(i==0 || i==lado1-1 || j==0 || j==lado2-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
