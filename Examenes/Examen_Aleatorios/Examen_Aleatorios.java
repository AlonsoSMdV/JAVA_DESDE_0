package Examenes.Examen_Aleatorios;
import java.util.Scanner;
public class Examen_Aleatorios {
    static Scanner sc;
    protected static void inicializar(){//Iniciar Scanner
        sc = new Scanner(System.in);
    }

    protected static void finalizar(){//Fin Scanner
        
            sc.close();
        
    }

    public static void MenuInicio(){
       
        System.out.println("-A-L-E-A-T-O-R-I-U-M- \n\n-A-L-E-A-T-O-R-I-U-M- es una inteligencia artificial que te permite interactuar con ella a través de un juego.\n-A-L-E-A-T-O-R-I-U-M- pensará un número dentro de un intervalo y tú tendrás que acertar dicho número.\nPara que -A-L-E-A-T-O-R-I-U-M- pueda pensar ese número tendrás que decirle un intervalo mínimo y un intervalo máximo en el que -A-L-E-A-T-O-R-I-U-M- se moverá para pensar el número. \n-A-L-E-A-T-O-R-I-U-M- es muy cabezón y dentro de ese intervalo él establecerá el intervalo que a él le parezca.");

        System.out.println();
        System.out.println();
    }
    public static int PedirMin() {
        System.out.print("Introduzca un valor mínimo: ");
        int min = Integer.parseInt(sc.nextLine());
        return min;
    }
    public static int PedirMax() {
        System.out.print("Ahora introduzca un valor máximo: ");
        int max = Integer.parseInt(sc.nextLine());
        return max;
    }
    public static int IntervaloMinimo(int max, int min) {
        int intervaloMin = (int)(Math.random()*(max-min+1)+min);
        return intervaloMin;
    }
    public static int IntervaloMaximo(int max, int min) {
        int intervaloMax = (int)(Math.random()*(max-min+1)+min);
        return intervaloMax;
    }
    public static void intervalo(int intervaloMax,int intervaloMin) {
        if(intervaloMax < intervaloMin){
            int aux = intervaloMin;
            intervaloMin = intervaloMax;
            intervaloMax = aux;
        }
        System.out.println("Pienso un nº entre el "+intervaloMin+" y "+intervaloMax);
    }

    public static void ComprobarNumeroPedido(int n, int NumeroPensado, int intentosMax, boolean acierta) {
        inicializar();
        while(intentosMax > 0 && acierta == false){
            System.out.print("Escribe cual numero crees que es: ");
            n = Integer.parseInt(sc.nextLine());
            if(n < NumeroPensado){
                intentosMax--;
                System.out.print("Te has quedado corto. te quedan "+intentosMax);
                
                System.out.println();
            }else if(n > NumeroPensado){
                intentosMax--;
                System.out.print("Te has pasado. te quedan "+intentosMax);
       
                System.out.println();
            }else if (n == NumeroPensado){
                acierta = true;
            }
            
        }
        if(acierta == true){
            System.out.println("Enhorabuena!!!! has acertado.");
            System.out.println("Efectivamente el número era: "+NumeroPensado);
        }else if(intentosMax == 0){
            System.out.println("Has llegado al máximo de intentos el nº era: "+NumeroPensado);
        }
    }
    public static void main(String[] args) {
        inicializar();
        MenuInicio();
        int min = PedirMin();
        int max = PedirMax();
        int intentosMax;
        int opcion = 0;
        boolean acierta = false;
        do {
            int intervaloMin = IntervaloMinimo(max, min);
            int intervaloMax = IntervaloMaximo(max, min);;
            intervalo(intervaloMax, intervaloMin);
            int NumeroPensado =  (int)(Math.random()*(intervaloMax-intervaloMin+1)+intervaloMin);
            System.out.println(NumeroPensado);
            intentosMax = (int)(Math.log(intervaloMax-intervaloMin+1) / Math.log(2));
            System.out.println("Tienes "+intentosMax+" intentos");

            acierta = false;
            ComprobarNumeroPedido(intervaloMax, NumeroPensado, intentosMax, acierta);
            System.out.println("Elige una opción\n1. Volver a jugar.\n2. Salir del juego.");
            opcion = Integer.parseInt(sc.nextLine());
        } while (opcion != 2);
        if(opcion == 2){
            System.out.println("Gracias por jugar a -A-L-E-A-T-O-R-I-U-M-");
        }
        finalizar();
    }
}
