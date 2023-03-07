package Capitulo_05;
/*
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cuantos números quiere que salgan de la sucesión de fibonacci: ");
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        for(int i = 1; i <= n; i++){
            int aux = x;
            x = y;
            y = aux + y;
            System.out.print(y+" ");
        }
        sc.close();
    }
}
