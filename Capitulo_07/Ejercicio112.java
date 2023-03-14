package Capitulo_07;


import java.util.Scanner;
public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] n = new int[10];
        System.out.println("Introduce 10 números");
        for(int i = 0; i < 10;i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Num["+i+"]: "+num[i] + "\n");
        }

        System.out.println();

        System.out.println("Introduce la posicion inicial del numero que desea cambiar: ");
        int inicial = sc.nextInt();
        System.out.println("Introduce la posicion final del numero que desea cambiar: ");
        int Pfinal = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            n[i] = num[i];
        }
        n[Pfinal] = num[inicial];
        for (int i = Pfinal; i < 10; i++) {
            n[i] = num[i-1];
            n[0] = num[9];
            n[Pfinal] = num[inicial];
        }

        for (int i = 0; i < inicial; i++) {
            n[i+1] = num[i];
        }


        System.out.println("Array resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Num["+i+"]: "+n[i] + "\n");
        }

        sc.close();
    }
}
