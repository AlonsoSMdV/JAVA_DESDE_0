package Capitulo_03;
/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3πr2h
 */
import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double PI = 3.1415927;
        System.out.print("Introduzca la altura del cono: ");
        double altura = sc.nextDouble();
        System.out.print("Introduzca el radio del cono: ");
        double radio = sc.nextDouble();
        double volumen = ((1.0/3.0)*PI*(radio*radio)*altura);
        System.out.print("El volumen del cono es igual a: "+volumen);
        sc.close();
    }
}
