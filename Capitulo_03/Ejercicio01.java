package Capitulo_03;

/*
 *Realiza un programa que pida dos números y que luego muestre el resultado
 *de su multiplicación. 
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int x = sc.nextInt();
        System.out.println("Escriba otro número: ");
        int y = sc.nextInt();
        System.out.println("El resultado de multiplicar "+x+" * "+y+" es igual a "+(x*y));
        sc.close();
    }
}
