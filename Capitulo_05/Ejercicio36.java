package Capitulo_05;
/*
 * Escribe un programa que diga si un número introducido por teclado es o no
 *capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 *el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 *long en lugar de int ya que el primero admite números más largos.
 */

 import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
        long num = n;
        long volt = 0;
        while(n > 0){
            volt = (volt * 10) + (n % 10);
            n /= 10;
        }
        if (num == volt){
            System.out.print(num+" es capicua");
        }else{
            System.out.print(num+" no es capicua");
        } 
        sc.close();
    }
}
