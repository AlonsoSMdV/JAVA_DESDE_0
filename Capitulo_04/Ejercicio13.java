package Capitulo_04;
/*
 * Escribe un programa que ordene tres números enteros introducidos por teclado.

 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce un número: ");
        int n2 = sc.nextInt();
        System.out.print("Introduce un número: ");
        int n3 = sc.nextInt();

        if(n3 >n2 && n2 > n1){

            System.out.print(n3+">"+n2+">"+n1);

        }else if(n3 >n2 && n2 < n1 && n3 > n1){

            System.out.print(n3+">"+n1+">"+n2);

        }else if(n3 <n2 && n2 > n1 && n3 < n1){

            System.out.print(n2+">"+n1+">"+n3);

        }else if(n3 <n2 && n2 > n1 && n3 > n1){

            System.out.print(n2+">"+n3+">"+n1);

        }else if(n3 >n2 && n2 < n1 && n3 < n1){

            System.out.print(n1+">"+n3+">"+n2);

        }else if(n3 <n2 && n2 < n1 && n3 < n1){

            System.out.print(n1+">"+n2+">"+n3);
        }
        sc.close();
    }

}
