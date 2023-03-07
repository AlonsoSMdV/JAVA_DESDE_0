package Capitulo_05;
/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 *entre 1 y un número leído por teclado.
 */

import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        int contMult = 0;
        int suma = 0;
        for(int i = 1; i <= n;i++ ){
            if((i%3)==0){
                System.out.print(i+" ");
                contMult++;
                suma += i;
            }
        }
        System.out.println();
        System.out.println("Hay "+contMult+" múltiplos de 3.");
        System.out.print("La suma de los múltiplos de 3 es  "+suma);
        sc.close();
    }
}
