
package pooej01;

import pooej01.estanteria.Cuenta;

public class Extra04Cajero {

    public static void main(String[] args) {
        Cuenta cuen=new Cuenta();
        cuen.saldo=5000;
        cuen.titular= "Jose";
        cuen.retirar_dinero();
    }
}
