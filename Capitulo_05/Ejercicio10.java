package Capitulo_05;
/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 *introducidos por teclado. A priori, el programa no sabe cuántos números se
 *introducirán. El usuario indicará que ha terminado de introducir los datos
 *cuando meta un número negativo
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una serie de números(cuando quiera parar escriba un nº negativo): ");
        double n;
        double i = 0;
        double cont = 0;
        do{
            n = sc.nextDouble();
            i+=n;
            cont++;
        }while(n>=0);
        cont = cont-1;
        i = i-n;
        System.out.println(cont);
        System.out.println(i);
        System.out.print("La media de estos números es: "+((i)/cont));
        sc.close();
    }
}
