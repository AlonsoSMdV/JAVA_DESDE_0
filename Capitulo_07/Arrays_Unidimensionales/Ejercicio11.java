package Capitulo_07.Arrays_Unidimensionales;
/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] primo = new int[10];
        int[] NoPrimo = new int[10];
        int primos = 0;
        int NoPrimos = 0;
        boolean esPrimo = false;

        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            esPrimo = true;
            for (int j = 2; j < num[i] - 1; j++) {
            if (num[i] % j == 0) {
            
            esPrimo = false;
            }
            }
            if (esPrimo) {
                primo[primos++] = num[i];
            } else {
                NoPrimo[NoPrimos++] = num[i];
            }
        }
        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Num["+i+"]: "+num[i] + "\n");
        }
        System.out.println();
        for (int i = 0; i < primos; i++) {
            num[i] = primo[i];
        }
        for (int i = primos; i < primos + NoPrimos; i++) {
            num[i] = NoPrimo[i - primos];
        }
        System.out.println("Array con los pares al principio:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Num["+i+"]: "+num[i] + "\n");
        }
        sc.close();
    }
}
