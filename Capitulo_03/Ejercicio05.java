package Capitulo_03;
/*
 * Escribe un programa que calcule el área de un rectángulo.
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = sc.nextDouble();
        System.out.print("El área del rectángulo es igual a: "+(base*altura));
        sc.close();
    }
}
