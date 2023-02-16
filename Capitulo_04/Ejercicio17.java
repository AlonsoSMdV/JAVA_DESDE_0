package Capitulo_04;
/*
 * Escribe un programa que diga cuál es la última cifra de un número entero
    introducido por teclado
 */
import java.util.Scanner;
public class Ejercicio17 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Escribe un número: ");
      int n = sc.nextInt();
      if(n<10){
         System.out.print("El ultimo digito es "+n);
      }else{
      System.out.print("El ultimo digito es "+(n%10));
      }
      sc.close();
   }
}
