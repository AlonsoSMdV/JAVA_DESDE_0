package Capitulo_07;

import java.util.Scanner;
public class Ejercicio105 {
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
