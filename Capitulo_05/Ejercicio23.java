package Capitulo_05;

/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 *de números mientras su suma no supere el valor 10000. Cuando esto último
 *ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 */
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vaya introduciendo números, el programa permitirá seguir introduciendo números mientras la suma de estos no sea 10000:");
        double n;
        double contN = 0;
        Double suma = (double) 0;
        do{
            n = sc.nextDouble();
            contN++;
            suma+=n;
        }while(suma<10000);
        double media = suma/contN;
        System.out.printf("La suma de estos números es: %.0f\n",suma);
        System.out.printf("Ha introducido %.0f números\n",contN);
        System.out.printf("La media es: %.2f",media);
        sc.close();
    }
}
