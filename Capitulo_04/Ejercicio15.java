package Capitulo_04;
/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
    por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
    etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
    de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
    hacia la derecha.
 */
import java.util.Scanner;
public class Ejercicio15 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Con que letra o signo deseas que pinte una piramide? ");
      String s = sc.nextLine();
      System.out.print("Hacia donde debe apuntar el vertice(1.Arriba 2.Abajo 3.Derecha 4.Izquierda)");
      int r = sc.nextInt();
      switch(r){
         case 1:
         System.out.printf("    "+s+"\n   "+ s+s+s+"\n  "+ s+s+s+s+s+"\n " +s+s+s+s+s+s+s+"\n" +s+s+s+s+s+s+s+s+s+"\n");
         break;

         case 2:
         System.out.printf(s+s+s+s+s+s+s+s+s+"\n "+s+s+s+s+s+s+s+"\n  "+s+s+s+s+s+"\n   "+s+s+s+"\n    "+s);
         break;

         case 3:
         System.out.printf(s+"\n"+s+" "+s+"\n"+s+" "+s+" "+s+"\n"+s+" "+s+" "+s+" "+s+"\n"+s+" "+s+" "+s+" "+s+" "+s+"\n"+s+" "+s+" "+s+" "+s+"\n"+s+" "+s+" "+s+"\n"+s+" "+s+"\n"+s);
         break;

         case 4:
         System.out.printf("        "+s+"\n      "+s+" "+s+"\n    "+s+" "+s+" "+s+"\n  "+s+" "+s+" "+s+" "+s+"\n"+s+" "+s+" "+s+" "+s+" "+s+"\n  "+s+" "+s+" "+s+" "+s+"\n    "+s+" "+s+" "+s+"\n      "+s+" "+s+"\n        "+s);
         break;
      }
      
      sc.close();
   }
}
