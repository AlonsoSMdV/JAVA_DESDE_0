package Capitulo_05;
/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int alturaInt = sc.nextInt();
        System.out.print("Introduzca el carácter: ");
        String caracter = sc.next();
        int altura = 1;
        int i = 0;
        int espacios = alturaInt - 1;
        int espaciosInternos = 0;
        while (altura < alturaInt) {
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            System.out.print(caracter);
            for (i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }
            if (altura>1) {
                System.out.print(caracter);
            }
            System.out.println();
            altura++;
            espacios--;
            espaciosInternos += 2;
        } 
        for (i = 1; i < altura*2; i++) {
            System.out.print(caracter);
        }
        sc.close();
    }
}
