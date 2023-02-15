package Capitulo_03;
/*
 * Realiza un conversor de Mb a Kb.
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos Mb deseas convertir a Kb: ");
        double MB = sc.nextDouble();
        System.out.print(MB+"megabytes serían "+(MB*1000)+" kilobytes");
        sc.close();
    }
}
