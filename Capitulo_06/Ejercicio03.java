package Capitulo_06;

public class Ejercicio03 {
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4)+1;
        int carta = (int)(Math.random()*10)+1;

        switch(carta){
            case 1:
            System.out.print("As");
            break;

            case 2:
            System.out.print("2");
            break;

            case 3:
            System.out.print("3");
            break;

            case 4:
            System.out.print("4");
            break;

            case 5:
            System.out.print("5");
            break;

            case 6:
            System.out.print("6");
            break;

            case 7:
            System.out.print("7");
            break;

            case 8:
            System.out.print("Sota");
            break;

            case 9:
            System.out.print("Caballo");
            break;

            case 10:
            System.out.print("Rey");
            break;
        }
        
        System.out.print(" de ");

        switch(palo){
            case 1:
            System.out.print("oros");
            break;

            case 2:
            System.out.print("bastos");
            break;

            case 3:
            System.out.print("copas");
            break;

            case 4:
            System.out.print("espadas");
            break;
        }
    }
}
