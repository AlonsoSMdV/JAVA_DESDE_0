package Capitulo_07.Arrays_Unidimensionales;
/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] num = new int[11];

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;


    System.out.println("Introduce 10 numeros:");
    for(int i = 0;i < 10;i++){
        num[i] = sc.nextInt();

        if(num[i] > max){
            max = num[i];
        }

        if(num[i] < min){
            min = num[i];
        }
    }
    for(int i = 0; i < 10;i++){
        System.out.printf("num[%2d]:%d",i,num[i]);

        if(num[i] == max){
            System.out.print(" máximo");
        }else if(num[i] == min){
            System.out.print(" mínimo");
        }

        System.out.println();
    }

    sc.close();
    }
}
