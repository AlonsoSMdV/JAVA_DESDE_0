package Capitulo_07.Arrays_Bidimensonales;
/*Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        int[][] numeros = new int[4][5];
        for( fila = 0;fila< 4; fila++){
            for(columna = 0; columna < 5; columna++){
                numeros[fila][columna] = (int)(Math.random()*900)+100;

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
