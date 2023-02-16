package Capitulo_04;
/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
    puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

 */
import java.util.Scanner;
public class Ejercicio19 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Escribe un número: ");
      int n = sc.nextInt();
      if(n<10){
         System.out.print(n+" tiene 1 digito");
      }else if(n<100){
         System.out.print(n+" tiene 2 digitos");
      }else if(n<1000){
         System.out.print(n+" tiene 3 digitos");
      }else if(n<10000){
         System.out.print(n+" tiene 4 digitos");
      }else if(n<100000){
         System.out.print(n+" tiene 5 digitos");
      }
      sc.close();
   }
}
