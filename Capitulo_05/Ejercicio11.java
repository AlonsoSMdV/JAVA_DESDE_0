package Capitulo_05;
/**
* 11. Escribe un programa que muestre en tres columnas, el cuadrado y
* el cubo de los 5 primeros números enteros a partir de uno que se
* introduce por teclado.
*/
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        for(int i = n; i < n + 5;i++){
            System.out.println("Número "+i+" Cuadrado: "+i*i+" Cubo: "+i*i*i);
        }
        sc.close();
    }
}
