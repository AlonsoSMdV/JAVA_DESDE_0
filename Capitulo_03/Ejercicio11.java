package Capitulo_03;
/*
 * Realiza un conversor de Kb a Mb.
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos Kb deseas convertir a Mb: ");
        double KB = sc.nextDouble();
        System.out.print(KB+"kilobytes serían "+(KB/1000)+" megabytes");
        sc.close();
    }
}
