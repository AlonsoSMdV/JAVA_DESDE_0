package Capitulo_04;
/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
    una altura h. Aplica la fórmula t =√2hgsiendo g = 9.81m/s2
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que calcule el tiempo que tardará en caer un objeto desde una altura");
        System.out.print("Por favor, introduzca el valor de la altura: ");
        double h = sc.nextDouble();
        double g = 9.81;
        double raiz = Math.sqrt((2*h)/g);
        if(h<0){
            System.out.print("La altura no es válida");
        }else{
        System.out.printf("El objeto tardará %.2f segundos en caer",raiz);
        }
        sc.close();
    }
}
