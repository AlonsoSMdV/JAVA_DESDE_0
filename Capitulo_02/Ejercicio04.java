package Capitulo_02;
/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class Ejercicio04 {
    public static void main(String args[]){
        double euro = 1;
        double peseta = 166.3860;
        System.out.printf("%.0f EUR es "+peseta+" pesetas.\n",euro);
        double euros = 5;
        double pesetas = euros * peseta;
        System.out.printf("%.0f EUR es "+pesetas+" pesetas.",euros);
    }
}
