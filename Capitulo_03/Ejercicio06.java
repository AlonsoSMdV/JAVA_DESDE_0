package Capitulo_03;
/*
 * Escribe un programa que calcule el área de un triángulo.
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura del triángulo: ");
        double altura = sc.nextDouble();
        System.out.print("El área del triángulo es igual a: "+((base*altura)/2));
        sc.close();
    }
}

