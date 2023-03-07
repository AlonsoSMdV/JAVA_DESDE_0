package Capitulo_05;
/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 *pedir por teclado.
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        System.out.print("Con que caracter quieres crear la pirámide: ");
        String Caracter = sc.nextLine();
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = altura - 1;
        while(planta <= altura){
            for(int i = 1; i <= espacios;i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= longitudDeLinea; i++){
                System.out.print(Caracter);
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
        sc.close();
    }
}
