package Capitulo_04;
/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
   ax2 + bx + c = 0).

 */
import java.util.Scanner;
public class Ejercicio09 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax2 + bx + c = 0");
      System.out.print("Por favor, introduzca el valor de a: ");
      double a = sc.nextDouble();
      System.out.print("Ahora introduzca el valor de b: ");
      double b = sc.nextDouble();
      System.out.print("Ahora introduzca el valor de c: ");
      double c = sc.nextDouble();
      double ecuacion = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
      double ecuacion2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
      if(a==0){
          
         System.out.print("No existe una solución real");
      }else{
      System.out.println("x1 = "+ecuacion);
      System.out.print("x2 = "+ecuacion2);
      }      
      sc.close();
   }
}
