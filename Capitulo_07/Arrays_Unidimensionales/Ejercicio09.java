package Capitulo_07.Arrays_Unidimensionales;
/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.

 */

import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[8];

        System.out.println("Introduzca 8 números:");
        for(int i = 0;i < 8;i++){
            num[i] = sc.nextInt();

        }
        System.out.println();
        
        System.out.println("Array");
        for(int i = 0;i < 8;i++){
            System.out.printf("Número[%2d]: %d",i,num[i]);
            if((num[i] % 2) == 0){
                System.out.print(" par");
            }else{
                System.out.print(" impar");
            }
            System.out.println();
        }
        sc.close();
    }
}
