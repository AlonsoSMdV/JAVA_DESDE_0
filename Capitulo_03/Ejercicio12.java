package Capitulo_03;
/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 *examen de la asignatura Programación para obtener la media deseada. Hay
 *que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 *segundo examen un 60%.
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double n1 = sc.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double nf = sc.nextDouble();
        double n2 = (nf-(n1*0.4))/0.6;
        System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.2f en el segundo examen.",nf,n2);
        sc.close();
    }
}
