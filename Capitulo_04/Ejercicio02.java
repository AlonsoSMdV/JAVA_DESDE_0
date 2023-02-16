package Capitulo_04;
/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
    días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
    6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
    horas, los minutos no se deben introducir por teclado.
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca que hora es(Solo horas no minutos): ");
        int horas = sc.nextInt();
        if (horas >=6 && horas <= 12){
            System.out.print("Buenos Días");
        }else if (horas >=13 && horas <= 20){
            System.out.print("Buenas Tardes");
        }else if (horas >=21 || horas <= 5){
            System.out.print("Buenas Noches");
        }
        sc.close();
    }
}
