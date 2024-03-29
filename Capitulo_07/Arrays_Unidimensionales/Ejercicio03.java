package Capitulo_07.Arrays_Unidimensionales;
/* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Introduce 10 numeros:");
        for(int i = 0;i < 10;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Primer array");
        for(int i = 0; i < 10;i++){
            System.out.printf("num[%2d]:%d\n",i,num[i]);
        }

        System.out.println("Array invertido");
        for(int i = 9; i >= 0;i--){
            System.out.printf("num[%2d]:%d\n",i,num[i]);
        }

        sc.close();
    }
}
