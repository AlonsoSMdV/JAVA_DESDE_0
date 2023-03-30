package Capitulo_07.Arrays_Bidimensonales;
/*Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados */
public class Ejercicio09 {
    public static void main(String[] args) {
        int[][] num = new int[12][12];
        int fila;
        int columna;
        for(fila = 0;fila < 12;fila++){
            for(columna = 0; columna < 12;columna++){
                num[fila][columna] = (int)(Math.random()*101);
            }
        }

        System.out.print("Array num│ ");
        for(int i = 0; i < 12; i++){
            System.out.print("Columna "+i+"│ ");
        }
        System.out.println();
        System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        for( fila = 0; fila < 12; fila++){
            System.out.printf("Fila %-4d│ ",fila);
            for(  columna = 0; columna < 12; columna++){
                System.out.printf("%-9d│ ",num[fila][columna]);
            }
            System.out.println();
            System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        }

        int capa ;
        int aux1 ;
        int aux2;
        for(capa = 0; capa < 6;capa++){
            aux1 = num[capa][11-capa];
            for(int j = 11 - capa; j > capa;j--){
                num[capa][j] = num[capa][j - 1];
            }

            aux2 = num[11-capa][11-capa];
            for(int j = 11 - capa; j > capa + 1;j--){
                num[j][11-capa] = num[j-1][11-capa];
            }

            num[capa+1][11-capa] = aux1;
            aux1 = num[11-capa][capa];
            for(int j = capa; j < 11 - capa - 1;j++){
                num[11 - capa][j] = num[11 - capa][j + 1];
            }

            num[11-capa][11-capa-1] = aux2;
            for(int j = capa; j < 11 - capa - 1;j++){
                num[j][capa] = num[j+1][capa];
            }
            num[11-capa-1][capa] = aux1;
        }

        System.out.print("Array RES│ ");
        for(int i = 0; i < 12; i++){
            System.out.print("Columna "+i+"│ ");
        }
        System.out.println();
        System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        for( fila = 0; fila < 12; fila++){
            System.out.printf("Fila %-4d│ ",fila);
            for(  columna = 0; columna < 12; columna++){
                System.out.printf("%-9d│ ",num[fila][columna]);
            }
            System.out.println();
            System.out.println("─────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
        }
     
    }
}
