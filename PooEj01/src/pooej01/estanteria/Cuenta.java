
package pooej01.estanteria;

import java.util.Scanner;

public class Cuenta {
     public int saldo;
    public String titular;
    Scanner leer = new Scanner(System.in);
    
    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public void retirar_dinero(){
    int dinero;
        System.out.println("Ingrese el monto a retirar");
        dinero=leer.nextInt();
        do {            
            
        if (dinero<saldo) {
            saldo-=dinero;
            System.out.println("Saldo restante "+ saldo);
            break;
        }
        else{
            System.out.println("Saldo Insuficiente....");
            System.out.println("Ingrese un nuevo monto"); 
            dinero=leer.nextInt();
        }
        } while (true);
    }
}

