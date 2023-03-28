package Capitulo_07.Arrays_Unidimensionales;
/* Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 */

import java.util.Scanner;
public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[12];
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 12;i++){
            System.out.printf("%-8d│",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 12;i++){
            num[i] = (int)(Math.random()*201);
            System.out.printf("%-8s│",num[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

        System.out.print("Introduzca el número que desea insertar: ");
        int numero = sc.nextInt();
        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int pos = sc.nextInt();

        for(int i = 11; i >pos;i--){
            num[i] = num[i-1];
        }
        num[pos] = numero;
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 12;i++){
            System.out.printf("%-8d│",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 12;i++){
            System.out.printf("%-8s│",num[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        sc.close();
    }
}
