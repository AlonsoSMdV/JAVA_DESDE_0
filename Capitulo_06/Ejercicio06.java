package Capitulo_06;
/* scribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = (int)(Math.random()*101);
        int intentos = 4;
        System.out.println("Tiene 5 intentos para adivinar un numero entre 0 y 100");
        do {
            System.out.print("Introduzca un número: ");
            int n = sc.nextInt();

            if(n == numero){
                System.out.println("Lo has advinado! Felicidades!");
                intentos = 0;
            }else if(n != numero){
                System.out.println("Ese no era te quedan "+(intentos--)+" intentos");

            }
            if(n > numero){
                System.out.println("El numero en el que pienso es menor");
            }else if(n < numero){
                System.out.println("El numero en el que pienso es mayor");
            }
            if(intentos < 0){
                System.out.println("El numero era "+numero);
            }
        } while (intentos >= 0);
        sc.close();
    }
}
