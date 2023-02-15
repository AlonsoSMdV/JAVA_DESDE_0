package Capitulo_03;
/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        double x = sc.nextDouble();
        System.out.print("Introduzca otro numero: ");
        double y = sc.nextDouble();
        double suma = x + y;
        double resta = y - x;
        Double multi = x * y;
        Double divi = y / x;
        System.out.printf("Suma = %.0f / %.0f = %.0f\n",x,y, suma);
        System.out.printf("Resta = %.0f / %.0f = %.0f\n",y,x, resta);
        System.out.printf("Multiplicación = %.0f / %.0f = %.0f\n",x,y, multi);
        System.out.printf("División = %.0f / %.0f = %.3f\n",y,x, divi);
        sc.close();
    }
}
