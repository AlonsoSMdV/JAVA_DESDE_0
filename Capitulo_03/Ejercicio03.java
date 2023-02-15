package Capitulo_03;
/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double euro = 0.0060;
        double peseta = 1;
        System.out.printf("%.0f peseta es "+euro+" EUR.\n",peseta);
        System.out.print("Que cantidad desea convertir: ");
        double pesetas = sc.nextDouble();
        double euros = pesetas * euro;
        System.out.printf("%.0f pesetas es "+euros+" EUR.",pesetas);
        sc.close();
    }
}
