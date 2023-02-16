package Capitulo_04;
/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
    las horas extras. Escribe un programa que calcule el salario semanal de un
    trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
    trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
    la hora.
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca las horas trabajadas: ");
        double horas = sc.nextDouble();
        if(horas <=40){
            System.out.println("El trabajador cobrará "+(horas*12)+" euros");
        }else if(horas > 40){
            double total = ((40*12)+((horas-40)*16));
            System.out.println("El trabajador cobrará "+total+" euros");
        }
        sc.close();
    }
}
