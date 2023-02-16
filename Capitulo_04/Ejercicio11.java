package Capitulo_04;
/*
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
    los segundos que faltan para llegar a la medianoche.86400
 */
import java.util.Scanner;
public class Ejercicio11 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduzca la hora que es: ");
      int h  = sc.nextInt();
      int sh = h*3600;
      System.out.print("Ahora los minutos: ");
      int m = sc.nextInt();
      int sm = m*60;
      int sT = sh + sm;
      int SDIA = 86400;
      if(h > 23 || m > 59){
         System.out.print("No existe esas horas y minutos");
      }else{
         System.out.print("Quedan "+(SDIA-sT)+" para medianoche");
      }
      sc.close();
   }
}
