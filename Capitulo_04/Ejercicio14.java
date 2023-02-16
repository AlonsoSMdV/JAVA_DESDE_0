package Capitulo_04;
/*
 * Realiza un programa que diga si un número introducido por teclado es par y/o
    divisible entre 5.
 */
import java.util.Scanner;
public class Ejercicio14 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce un número: ");
      int n = sc.nextInt();
      if(n % 2 ==0){
         System.out.println("El número es par");
      } if(n % 5==0){
         System.out.print("El número es divisible entre 5");
      }
      sc.close();
   }
}
