package Capitulo_07.Arrays_Bidimensonales;
/*Realiza el juego de las tres en raya.
 */

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TRES EN RAYA");
        String[][] tablero = new String[3][3];
        int filas;
        int columnas;
        String Jugador = "", CPU = "";
        boolean JugadorGana = false;
        boolean CPUGana = false;
        int movimientos = 0;
        System.out.print("Elija el símbolo con el que va a jugar(X/O): ");
        String simbol = sc.nextLine();
        switch(simbol){
            case "X":
                Jugador = "X";
                CPU = "O";
                break;
            case "O":
                Jugador = "O";
                CPU = "X";
                break;
        }

        int fila;
        int columna;
        do{
            for( filas = 0; filas < 3; filas++){
                for(  columnas = 0; columnas < 3; columnas++){
                    System.out.printf("%-9s│ ",tablero[filas][columnas]);
                }
                System.out.println();
                System.out.println("─────────┼──────────┼──────────┤");
            }
            System.out.println("TURNO DEL JNUGADOR");
            System.out.print("Introduzca la posición X donde quieres colocar tu símbolo(0,1,2): ");
            fila = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca la posición Y donde quieres colocar tu símbolo(0,1,2): ");
            columna = Integer.parseInt(sc.nextLine());
            JugadorGana = ((tablero[0][0] == Jugador) && (tablero[0][1] == Jugador) && (tablero[0][2] == Jugador)
            ||
            (tablero[1][0] == Jugador) && (tablero[1][1] == Jugador) && (tablero[1][2] == Jugador)
            ||
            (tablero[2][0] == Jugador) && (tablero[2][1] == Jugador) && (tablero[2][2] == Jugador)
            ||
            (tablero[0][0] == Jugador) && (tablero[1][0] == Jugador) && (tablero[2][0] == Jugador)
            ||
            (tablero[0][1] == Jugador) && (tablero[1][1] == Jugador) && (tablero[2][1] == Jugador)
            ||
            (tablero[0][2] == Jugador) && (tablero[1][2] == Jugador) && (tablero[2][2] == Jugador)
            ||
            (tablero[0][0] == Jugador) && (tablero[1][1] == Jugador) && (tablero[2][2] == Jugador)
            ||
            (tablero[0][2] == Jugador) && (tablero[1][1] == Jugador) && (tablero[2][0] == Jugador)
            );
            tablero[fila][columna] = Jugador;
            if(!JugadorGana || movimientos<9){
                System.out.println("TURNO DEL CPU");
                do{
                fila = (int)(Math.random()*3);
                columna = (int)(Math.random()*3);
                }while(tablero[fila][columna].equals(" "));
                tablero[fila][columna] = CPU;
                CPUGana = ((tablero[0][0] == CPU) && (tablero[0][1] == CPU) && (tablero[0][2] == CPU)
                ||
                (tablero[1][0] == CPU) && (tablero[1][1] == CPU) && (tablero[1][2] == CPU)
                ||
                (tablero[2][0] == CPU) && (tablero[2][1] == CPU) && (tablero[2][2] == CPU)
                ||
                (tablero[0][0] == CPU) && (tablero[1][0] == CPU) && (tablero[2][0] == CPU)
                ||
                (tablero[0][1] == CPU) && (tablero[1][1] == CPU) && (tablero[2][1] == CPU)
                ||
                (tablero[0][2] == CPU) && (tablero[1][2] == CPU) && (tablero[2][2] == CPU)
                ||
                (tablero[0][0] == CPU) && (tablero[1][1] == CPU) && (tablero[2][2] == CPU)
                ||
                (tablero[0][2] == CPU) && (tablero[1][1] == CPU) && (tablero[2][0] == CPU)
                );
            }
        }while(!JugadorGana || !CPUGana || movimientos < 9);
    }
}
