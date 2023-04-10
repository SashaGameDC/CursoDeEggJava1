
package Guia5Arreglos_Extra;

import java.util.Scanner;

public class Extra06_Sopa_de_Letras {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        String  p1="", p2="", p3="", p4="", p5="";
        String pi1="",pi2="",pi3="",pi4="",pi5="";
        
        //Se crean los vectores y llenan con numeros aleatorios//
        int[] va= new int[5];
        int[] vf= new int[5];
        int[] vc= new int[5];
        asignarValor(va,1);
        asignarValor(vf,1);
        asignarValor(vc,2);
        int aux=0,aux2=0;
        
        do{
            System.out.println("En que modo te gustaria jugar?\n"
            + "1)-Modo automático:Te daremos palabras de 5 caracteres a encontrar\n"
            + "2)-Modo manual: Ingresa las palabras a encontrar");
            int modo= leer.nextInt();
            switch(modo){
                case 1:
                    //Se le asigna un numero aleatorio a las variablas para seleccionar una palabra predefinida
                    int pa1=va[0];
                    int pa2=va[1];
                    int pa3=va[2];
                    int pa4=va[3];
                    int pa5=va[4];

                    //Se obtiene el valor de las palabras aleatorias
                    p1=ingDePalabraA(pa1,p1);
                    p2=ingDePalabraA(pa2,p2);
                    p3=ingDePalabraA(pa3,p3);
                    p4=ingDePalabraA(pa4,p4);
                    p5=ingDePalabraA(pa5,p5);

                    System.out.println("Tendras que encontrar las palabras: " + p1 + ", " + p2 + ", " + p3 + ", " + p4 + ", " + p5);
                    aux++;
                    aux2=1;
                    break;
                case 2:
                    System.out.println("Ingrese 5 palabras que tengan entre 3 y 5 letras");

                    //Se obtiene el valor de las palabras por teclado
                    pi1=ingDePalabraM(pi1);
                    pi2=ingDePalabraM(pi2);
                    pi3=ingDePalabraM(pi3);
                    pi4=ingDePalabraM(pi4);
                    pi5=ingDePalabraM(pi5);
                    aux++;  
                    aux2=2;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }while(aux==0);

        //Se le asigna una fila aleatoria a la palabra en la matriz//
        int f1=va[0];
        int f2=vf[1];
        int f3=vf[2];
        int f4=vf[3];
        int f5=vf[4];
        
        //Se le asigna una columna aleatoria a la palabra en la matriz//
        int c1=vc[0];
        int c2=vc[1];
        int c3=vc[2];
        int c4=vc[3];
        int c5=vc[4];

        //Creacion y llenado de la matriz//
        String[][] sopa= new String[20][20];
        llenadoDeSopa(sopa);
        
        //Ingreso de las palabras en la sopa de letras//
        switch(aux2){
            case 1:   
                ingresoDePalabra(sopa,f1,c1,p1);
                ingresoDePalabra(sopa,f2,c2,p2);
                ingresoDePalabra(sopa,f3,c3,p3);
                ingresoDePalabra(sopa,f4,c4,p4);
                ingresoDePalabra(sopa,f5,c5,p5);
                break;
            case 2:
                ingresoDePalabra(sopa,f1,c1,pi1);
                ingresoDePalabra(sopa,f2,c2,pi2);
                ingresoDePalabra(sopa,f3,c3,pi3);
                ingresoDePalabra(sopa,f4,c4,pi4);
                ingresoDePalabra(sopa,f5,c5,pi5);
                break;
        }
                        
        imprimir(sopa);
    }
    
    /**
     * Se inicia un vector en 0
     * @param vector 
     */
    public static void iniciarVector(int[] vector){
        for (int i = 0; i < 5; i++) {
            vector[i]=0;
        }
    }
    
    /**
     * MODO AUTOMATICO ingreso de palabras con la cantidad de carácteres adecuados
     * @param numPalabra
     * @param palabra
     * @return palabra
     */
    public static String ingDePalabraA(int numPalabra, String palabra){
            switch(numPalabra){
                case  1: 
                    palabra="algas";
                    break;
                case  2: 
                    palabra="burro";
                    break;
                case  3: 
                    palabra="carta";
                    break;
                case  4: 
                    palabra="dados";
                    break;
                case  5: 
                    palabra="elfos";
                    break;
                case  6: 
                    palabra="forma";
                    break;
                case  7: 
                    palabra="gatos";
                    break;
                case  8: 
                    palabra="indio";
                    break;
                case  9: 
                    palabra="jugar";
                    break;
                case 10: 
                    palabra="liana";
                    break;
                case 11: 
                    palabra="musgo";
                    break;
                case 12: 
                    palabra="nadie";
                    break;
                case 13: 
                    palabra="oreja";
                    break;
                case 14: 
                    palabra="parra";
                    break;
                case 15: 
                    palabra="rosas";
                    break;
                case 16: 
                    palabra="santo";
                    break;
                case 17: 
                    palabra="tiara";
                    break;
                case 18: 
                    palabra="urnas";
                    break;
                case 19: 
                    palabra="vista";
                    break;
            }
        return palabra;
    }
    
    /**
     * MODO MANUAL ingreso de palabras con la cantidad de carácteres adecuados
     * @param palabra 
     */
    public static String ingDePalabraM(String palabra){
        
        Scanner leer= new Scanner(System.in);
        
        palabra=leer.next();
        
        do{
            if(palabra.length()<3 || palabra.length()>5){
                System.out.println("Ingrese una palabra con la cantidad de letras adecuadas");
                palabra= leer.next();
            }else{
                break;
            }
        }while(palabra.length()<3 || palabra.length()>5);
        return palabra;
    }
    
    /**
     * Llenado de vectos para variables aleatorias de 0-19
     * @param vector 
     * @param modo
     */
    public static void asignarValor(int[] vector,int modo){
        int n1=0, n2=0, n3=0, n4=0, n5=0;    
        if(modo==1){
                n1=(int)(Math.random() * 20);
            do{
                n2=(int)(Math.random() * 20);
            }while(n2==n1);
            do{
                n3=(int)(Math.random() * 20);
            }while(n3==n2 || n3==n1);
            do{
                n4=(int)(Math.random() * 20);
            }while(n4==n3 || n4==n2 || n4==n1);
            do{
                n5=(int)(Math.random() * 20);
            }while(n5==n4 || n5==n3 || n5==n2 || n5==n1);
        }else{
                n1=(int)(Math.random() * 16);
            do{
                n2=(int)(Math.random() * 16);
            }while(n2==n1);
            do{
                n3=(int)(Math.random() * 16);
            }while(n3==n2 || n3==n1);
            do{
                n4=(int)(Math.random() * 16);
            }while(n4==n3 || n4==n2 || n4==n1);
            do{
                n5=(int)(Math.random() * 16);
            }while(n5==n4 || n5==n3 || n5==n2 || n5==n1);
        }

        
        for (int i = 0; i < 5; i++) {
            
            if(i==0){
                vector[i]=n1;
            }else if(i==1){
                vector[i]=n2;
            }else if(i==2){
                vector[i]=n3;
            }else if(i==3){
                vector[i]=n4;
            }else if(i==4){
                vector[i]=n5;
            }
        }
    }
    
    /**
     * llenado de la matriz con caracteres aleatorios
     * @param sopa 
     */
    public static void llenadoDeSopa(String[][] sopa){
        
        int aux=0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                aux=(int)(Math.random() * 20+1);
                switch(aux){
                    case 1: 
                        sopa[i][j]="a";
                        break;
                    case 2: 
                        sopa[i][j]="e";
                        break;
                    case 3: 
                        sopa[i][j]="i";
                        break;
                    case 4: 
                        sopa[i][j]="o";
                        break;
                    case 5: 
                        sopa[i][j]="u";
                        break;
                    case 6: 
                        sopa[i][j]="f";
                        break;
                    case 7: 
                        sopa[i][j]="d";
                        break;
                    case 8: 
                        sopa[i][j]="r";
                        break;
                    case 9: 
                        sopa[i][j]="s";
                        break;
                    case 10: 
                        sopa[i][j]="t";
                        break;    
                    case 11: 
                        sopa[i][j]="c";
                        break;
                    case 12: 
                        sopa[i][j]="v";
                        break;
                    case 13: 
                        sopa[i][j]="b";
                        break;
                    case 14: 
                        sopa[i][j]="n";
                        break;
                    case 15: 
                        sopa[i][j]="m";
                        break;
                    case 16: 
                        sopa[i][j]="j";
                        break;
                    case 17: 
                        sopa[i][j]="l";
                        break;
                    case 18: 
                        sopa[i][j]="p";
                        break;
                    case 19: 
                        sopa[i][j]="g";
                        break;
                    case 20: 
                        sopa[i][j]="f";
                        break;
                }
            }
        }
    }
    
    /**
     * Se ingresa la palabra en la fila y columna predefinida por el programa
     * @param matriz
     * @param fila
     * @param columna
     * @param palabra 
     */
    public static void ingresoDePalabra(String[][] matriz, int fila, int columna, String palabra){
        int l= palabra.length();
        int aux=0;
        for (int i = columna; i<(columna+l) ; i++) {
            matriz[fila][i]= palabra.substring(aux,aux+1);
            aux++;
        }
    }
    
    /**
     * Se imprime la matriz en pantalla
     * @param sopa 
     */
    public static void imprimir(String[][] sopa){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("=:3");   
    }
}