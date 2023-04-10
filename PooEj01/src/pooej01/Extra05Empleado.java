
package pooej01;

import java.util.Scanner;
import pooej01.estanteria.Empleado;

public class Extra05Empleado {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el nombre la edad y el salario del empleado");
        
        Empleado emp= new Empleado(leer.next(),leer.nextInt(),leer.nextInt());
        
        emp.calcular_aumento();
    }
}
            
    
