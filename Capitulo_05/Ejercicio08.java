package Capitulo_05;
/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
import  java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Intrduzca un número: ");
        int n = sc.nextInt();
        for(i = 0; i<11;i++){
            System.out.printf(i+" * "+n+" = "+(i*n)+"\n");
        }
        sc.close();
        
    }
}
