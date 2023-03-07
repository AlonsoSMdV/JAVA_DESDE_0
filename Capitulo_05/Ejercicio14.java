package Capitulo_05;
/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga la base de la que quiere calcular la potencia: ");
        int base = sc.nextInt();
        System.out.println("Diga el exponente con el que quiere calcular la potencia: ");
        int exponente = sc.nextInt();
        int aux = 1;
        if(exponente == 0){
            base = 1;
        }else{
            for(int i = 1; i <= exponente;i++){
                aux*= base;
            }
        }

        System.out.println("la potencia es "+aux);
        sc.close();
    }
}
