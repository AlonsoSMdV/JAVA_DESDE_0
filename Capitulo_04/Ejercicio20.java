package Capitulo_04;
/*
 * Realiza un programa que diga si un número entero positivo introducido por
    teclado es capicúa. Se permiten números de hasta 5 cifras.

 */
import java.util.Scanner;
public class Ejercicio20 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Escribe un número: ");
      int n = sc.nextInt();
      if(n<0){
         System.out.print("No es válido");
      }else if(n<10){
         System.out.print(n+" es capicúo");
      }else if( n<100 && n%10 == n/10){
         System.out.print(n+" es capicúo");
      }else if( n<1000 && n%10 == n/100){
         System.out.print(n+" es capicúo");
      }else if( n<10000 && n%10 == n/1000){
         System.out.print(n+" es capicúo");
      }else if( n<100000 && n%10 == n/10000){
         System.out.print(n+" es capicúo");
      }else{
         System.out.print(n+" no es capicúo");
      }
      sc.close();
   }
}
