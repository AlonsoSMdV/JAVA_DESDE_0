package Capitulo_05;
/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ContPositivo = 0;
        int ContNegativo = 0;
        int ContNeutro = 0;
        System.out.println("Introduzca un listado de 10 números");
        for(int i = 0; i<10;i++){
            int n = sc.nextInt();
            if(n == 0){
                ContNeutro++;
            }else if(n>0){
                ContPositivo++;
            }else if(n<0){
                ContNegativo++;
            }
        }
        System.out.printf("En esta serie de numeros hay:\n"+ContNeutro+" números 0\n"+ContPositivo+" número/s positivo/s\n"+ContNegativo+" número/s negativo/s");
        sc.close();
    }

}
