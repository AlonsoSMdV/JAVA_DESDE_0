package Capitulo_05;
/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 *números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nIni;
        int nFin;
        do{
            System.out.print("Introduzca un número: ");
            nIni = sc.nextInt();
            System.out.print("Ahora otro número: ");
            nFin = sc.nextInt();

            if(nIni == nFin){
                System.out.print("No pueden ser iguales. ");
            }
        }while(nIni == nFin);
        if(nFin<nIni){
            int aux = nFin;
            nFin = nIni;
            nIni = aux;
        }
        for(int i = nIni; i <=nFin;i+=7){
        System.out.print(i+" ");
        }
        sc.close();
    }
}
