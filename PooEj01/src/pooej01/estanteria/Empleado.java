
package pooej01.estanteria;

public class Empleado {
    public String nombre;
    public int edad;
    public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        if(edad<30){
            System.out.println( nombre + " tine menos de 30 años. Su aumento será solamente del 5% por verde\n"
           + "su nuevo salario será de " + (salario*1.05));
        }else{
            System.out.println( nombre + " tine más de 30 años. Su aumento será de 10% por maduro\n"
           + "Su nuevo salario será de " + (salario*1.1));
        }
    }
}
    
