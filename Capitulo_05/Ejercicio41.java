package Capitulo_05;
/*
 *     Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 *hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 *primero admite números más largos
 */
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long n = num;
        long volt = 0;
        int longitud = 0;
        while(n > 0){
            volt = volt*10 + n%10;
            n /= 10;
            longitud++;
        }
        int digito;
        int ContP = 0;
        int ContI = 0;
        for (int i = 0; i < longitud; i++) {
            digito = (int)(volt % 10);
            if ((digito % 2) == 0) {
                ContP++;
            }else{
                ContI++;
            }
            volt /= 10;
        }
        System.out.print("Este número posee "+ContP+" dígitos pares y "+ContI+" dígitos impares.");
    }
}
