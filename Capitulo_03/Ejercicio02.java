package Capitulo_03;
/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 *convertir debe ser introducida por teclado.
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double euro = 1;
        double peseta = 166.3860;
        System.out.printf("%.0f EUR es "+peseta+" pesetas.\n",euro);

        System.out.print("Que cantidad desea convertir: ");
        double euros = sc.nextDouble();
        double pesetas = euros * peseta;
        System.out.printf("%.0f EUR es "+pesetas+" pesetas.",euros);
        sc.close();
    }
}
