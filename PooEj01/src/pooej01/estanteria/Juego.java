
package pooej01.estanteria;

import java.util.Scanner;

public class Juego {
    
    Scanner leer= new Scanner(System.in);
    
    private int jugador1;
    private int jugador2;

    //COSTRUCTOR//
    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    //SETTERS//
    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }
    
    //GETTERS//
    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }
    
    /**
     * @jugador Ingresa el valor del número secreto.
     */
    public void jugador1(){
        System.out.println("Jugador1 ingrese el numero mágico entre 1 y 10");
        jugador1= leer.nextInt();
    }
    
    /**
     * @jugador Intenta adivinar el numero de jugador 1.
     */
    public void jugador2(){
        int cont=0;
        System.out.println("Jugador 2 tirate un número entre 1 y 10\n" 
                + "a ver si lo sacas en tres intentos ¡wachin!");
        do{
            
            jugador2= leer.nextInt();
            if(jugador1==jugador2){
                if(cont==0){
                    System.out.println("¡Grande capo! la sacaste de una culiao");
                }else{
                    System.out.println("Por fin!! ya era hora");
                }
                break;
            }else if(jugador2>jugador1){
                System.out.println("Te pasaste de rosca");
            }else if(jugador2<jugador1){
                System.out.println("Te quedaste cortina");
            }
            cont++;
            
        }while(cont!=3);
        if(cont==3){
            System.out.println("Perdiste. Manco de mierda!!!");
        }
    }
}
