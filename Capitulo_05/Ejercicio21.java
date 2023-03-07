package Capitulo_05;
/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 *numero negativo y nos diga cuantos números se han introducido, la media de
 *los impares y el mayor de los pares. El número negativo sólo se utiliza para
 *indicar el final de la introducción de datos pero no se incluye en el cómputo
 */

 import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int contN = 0;
        int ContNImpares = 0;
        int maximoPar = 0;
        int sumaImpares = 0;
        System.out.println("Introduzca una serie de números, cuando quieras parar escribe uno negativo:");
        do{
            n = sc.nextInt();
            if(n>=0){
                contN++;
                if(n%2 != 0){
                    ContNImpares++;
                    sumaImpares +=n;
                }
                if(n>maximoPar){
                    maximoPar=n;
                }
            }

        }while(n>=0);
        System.out.println("Hay "+contN+" números");
        System.out.println("Media"+sumaImpares/ContNImpares);
        System.out.println("El númer par maximo es "+maximoPar);
        sc.close();
    }
}
