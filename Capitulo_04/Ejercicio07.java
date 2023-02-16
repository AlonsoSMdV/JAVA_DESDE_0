package Capitulo_04;
/*
 * Realiza un programa que calcule la media de tres notas.
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la primera nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Escriba la segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Escriba la tercera nota: ");
        double n3 = sc.nextDouble();

        double media = (n1+n2+n3)/3;
        if(n1 < 0 || n2 < 0 || n3 < 0){
            System.out.print("No puede ser negativa");
        }else{
            System.out.print("Tienes un "+media);
        }
        sc.close();
    }
}
