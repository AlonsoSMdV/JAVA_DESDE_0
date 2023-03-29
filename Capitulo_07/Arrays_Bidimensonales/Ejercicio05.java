package Capitulo_07.Arrays_Bidimensonales;
/*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */
public class Ejercicio05 {
    public static void main(String[] args) {
        int[][] ArrayPrimero = new int[6][10];
        int filas;
        int columnas;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int posXMax = 0, posYMax = 0, posXMin = 0, posYMin = 0;
        for(filas = 0; filas < 6;filas++){
            for(columnas = 0; columnas < 10;columnas++){
                ArrayPrimero[filas][columnas] = (int)(Math.random()*1001);
                if(ArrayPrimero[filas][columnas] > maximo){
                    maximo = ArrayPrimero[filas][columnas];
                    posXMax = filas;
                    posYMax = columnas;
                }
                if(ArrayPrimero[filas][columnas] < minimo){
                    minimo = ArrayPrimero[filas][columnas];
                    posXMin = filas;
                    posYMin = columnas;
                }
            }
        }

        System.out.print("Array num│ ");
        for(int i = 0; i < 10; i++){
            System.out.print("Columna "+i+"│ ");
        }
        System.out.println();
        System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        for( filas = 0; filas < 6; filas++){
            System.out.print("Fila "+filas+"   │ ");
            for(  columnas= 0; columnas < 10; columnas++){
                System.out.printf("%-9d│ ",ArrayPrimero[filas][columnas]);
            }
            System.out.println();
            System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        }
        System.out.println(maximo+" = "+posXMax+", "+posYMax);
        System.out.println(minimo+" = "+posXMin+", "+posYMin);
    }
}
