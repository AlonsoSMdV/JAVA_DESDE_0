package Capitulo_05;

/*
 * Escribe un programa que lea un número n e imprima una pirámide de números
 *con n filas como en la siguiente figura:
 *   1
 *  121
 * 12321
 *1234321
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        int planta = 1;;
        int espacios = altura - 1;
        while(planta <= altura){
            for(int i = 1; i <= espacios;i++){
                System.out.print(" ");
            }
            for(int i = 1; i < planta; i++){
                System.out.print(i);
            }
            for(int i = planta; i > 0; i--){
                System.out.print(i);
            }
            System.out.println();
            planta++;
            espacios--;
        }
        sc.close();
    }
}
