package Capitulo_07.Arrays_Bidimensonales;
/*Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente). */
public class Ejercicio13 {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                estaturas[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
            }
        }

        System.out.printf("%64s\n", "MED MIN MAX");
        for (int i = 0; i < 4; i++) {
            int maximo = 140;
            int minimo = 210;
            int suma = 0;

            System.out.printf("%9s:", pais[i]);
            for (int estatura : estaturas[i]) {
                System.out.printf("%4d", estatura);
                maximo = estatura > maximo ? estatura : maximo;
                minimo = estatura < minimo ? estatura : minimo;
                suma += estatura;
                }
            System.out.printf(" |%4d%4d%4d\n", suma / 10, minimo, maximo);
        }
    }
}
