package Capitulo_05;
/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        int i;
        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("Ahora el exponente: ");
        exponente = sc.nextInt();
        for(i = 1; i<= exponente; i++){
            System.out.println(base+"^"+i+" = "+Math.pow(base, i));
        }
        sc.close();
    }
}
