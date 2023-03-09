package Capitulo_06;

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextInt();
        long n = numero;
        int longitud = 0;
        do{
            numero /= 10;
            longitud++;
        }while(numero > 0);
        int posicion = (int)(Math.random()*longitud)+1;
        System.out.print((n/(long)(Math.pow(10,longitud - posicion)))%10);
        sc.close();
    }
}