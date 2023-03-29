package Capitulo_07.Arrays_Bidimensonales;
/*Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

 import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        int[][] numeros = new int[4][5];
        for( fila = 0;fila< 4; fila++){
            for(columna = 0; columna < 5; columna++){
                numeros[fila][columna] = Integer.parseInt(sc.nextLine());

            }
        }
        int sumaFila;
        int sumaColumna;
        System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        for( fila = 0; fila < 4; fila++){
            sumaFila = 0;
            for(  columna= 0; columna < 5; columna++){
                System.out.printf("%-9d│ ",numeros[fila][columna]);
                sumaFila += numeros[fila][columna];
            }
            System.out.printf("%-9d│ ",sumaFila);
            System.out.println();
            System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        }
        int sumaTotal = 0; 
        for( columna = 0; columna < 5; columna++){
            sumaColumna = 0;
            for( fila = 0; fila < 4; fila++){
                sumaColumna += numeros[fila][columna];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%-9d│ ",sumaColumna);
        }
        System.out.printf("%-9d│ ",sumaTotal);
    }
}
