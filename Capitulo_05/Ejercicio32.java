package Capitulo_05;

/*
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 *izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 *números largos.

 */
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        long volt = 0;
        int longitud = 0;
        if (numero == 0) {
            longitud = 1;
        }
        while (numero > 0) {
            volt = (volt * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        } 
        System.out.print("Dígitos pares: ");
        int digito;
        int sumaP = 0;
        for (int i = 0; i < longitud; i++) {
            digito = (int)(volt % 10);
            if ((digito % 2) == 0) {
            System.out.print(digito + " ");
            sumaP += digito;
            }
            volt /= 10;
        }
        System.out.println("\nSuma de los dígitos pares: " + sumaP);
        sc.close();
    }
}
