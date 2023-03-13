package Capitulo_07;

import java.util.Scanner;
public class Ejercicio106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];

        System.out.println("Introduce 15 numeros:");
        for(int i = 0;i < 15;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Primer array");
        for(int i = 0; i < 15;i++){
            System.out.printf("num[%2d]: %d\n",i,num[i]);
        }
        System.out.println();
        int aux = num[14];
        for (int i = 14; i > 0; i--) {
            num[i] = num[i-1];
            }
            num[0] = aux;


        System.out.println("Array rotado");
        for(int i = 14; i >= 0;i--){
            System.out.printf("num[%2d]: %d\n",i,num[i]);
        }

        sc.close();
    }
}

