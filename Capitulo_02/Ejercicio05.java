package Capitulo_02;
/*
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class Ejercicio05 {
    public static void main(String args[]){
        double euro = 0.0060;
        double peseta = 1;
        System.out.printf("%.0f peseta es "+euro+" EUR.\n",peseta);
        double pesetas = 5;
        double euros = pesetas * euro;
        System.out.printf("%.0f pesetas es "+euros+" EUR.",pesetas);
    }
}
