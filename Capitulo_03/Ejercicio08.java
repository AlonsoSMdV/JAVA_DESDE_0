package Capitulo_03;
/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 */
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca las horas trabajadas: ");
        double base = sc.nextDouble();
        System.out.println("El trabajador cobrará "+(base*12)+" euros");
        sc.close();
    }
}
