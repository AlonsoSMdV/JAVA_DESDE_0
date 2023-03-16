package Capitulo_06;
/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25])*/
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la anchura de la tableta: ");
        int ancho = sc.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int alt = sc.nextInt();

        int anchoPos = (int)(Math.random()*(ancho))+1;
        int altPos = (int)(Math.random()*(alt))+1;

        for(int i = 0;i < alt;i++){
            for(int j = 0;j < ancho;j++){
                if(j == anchoPos && i == altPos){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
