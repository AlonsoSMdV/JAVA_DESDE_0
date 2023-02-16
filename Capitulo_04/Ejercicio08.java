package Capitulo_04;
/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
    suficiente, bien, notable o sobresaliente).
 */
import java.util.Scanner;
public class Ejercicio08 {
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
      if(media < 5){
         System.out.print("Has suspendido");
      }else if(media < 6){
         System.out.print("Es una nota suficiente");
      }else if(media < 9){
         System.out.print("Es una nota notable");
      }else if(media < 11){
         System.out.print("Sobresaliente");
      }
      sc.close();
   }
}
