package Capitulo_06;
/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error*/
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String TurnoJugador = sc.next();
        System.out.print("Turno del CPU: ");
        int TurnoDeCPU = (int)(Math.random()*3)+1;
        String TurnoCPU = "";
        switch(TurnoDeCPU){
            case 1:
            TurnoCPU = "papel";
            break; 

            case 2:
            TurnoCPU = "piedra";
            break; 

            case 3:
            TurnoCPU = "tijera";
            break; 
        }
        System.out.println(TurnoCPU);
        if(TurnoCPU.equals("papel") && TurnoJugador.equals("papel") || TurnoCPU.equals("piedra") && TurnoJugador.equals("piedra") || TurnoCPU.equals("tijera") && TurnoJugador.equals("tijera")){
            System.out.print("Empate");
        }else if(TurnoCPU.equals("papel") && TurnoJugador.equals("piedra") || TurnoCPU.equals("piedra") && TurnoJugador.equals("tijera") || TurnoCPU.equals("tijera") && TurnoJugador.equals("papel")){
            System.out.print("Gana la CPU");
        }else if(TurnoJugador.equals("papel") && TurnoCPU.equals("piedra") || TurnoJugador.equals("piedra") && TurnoCPU.equals("tijera") || TurnoJugador.equals("tijera") && TurnoCPU.equals("papel")){
            System.out.print("Gana el jugador");
        }
        sc.close();
    }
}
