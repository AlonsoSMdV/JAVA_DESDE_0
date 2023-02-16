package Capitulo_04;
/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número del 1 al 7: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
            System.out.print("Es lunes");
            break;

            case 2:
            System.out.print("Es martes");
            break;

            case 3:
            System.out.print("Es miércoles");
            break;

            case 4:
            System.out.print("Es jueves");
            break;

            case 5:
            System.out.print("Es viernes");
            break;

            case 6:
            System.out.print("Es sábado");
            break;
            
            case 7:
            System.out.print("Es domingo");
            break;
        }
        sc.close();
    }
}
