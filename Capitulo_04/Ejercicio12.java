package Capitulo_04;
/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
    que se imparten en el curso. Cada pregunta acertada sumará un punto. El
    programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
    tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
    en las diferentes asignaturas del curso.
 */
import java.util.Scanner;
public class Ejercicio12 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Contesta 1/2 por respuesta");
      System.out.print("1: ");
      int r1 = sc.nextInt();
      System.out.print("2: ");
      int r2 = sc.nextInt();
      System.out.print("3: ");
      int r3 = sc.nextInt();
      System.out.print("4: ");
      int r4 = sc.nextInt();
      System.out.print("5: ");
      int r5 = sc.nextInt();
      System.out.print("6: ");
      int r6 = sc.nextInt();
      System.out.print("7: ");
      int r7 = sc.nextInt();
      System.out.print("8: ");
      int r8 = sc.nextInt();
      System.out.print("9: ");
      int r9 = sc.nextInt();
      System.out.print("10: ");
      int r10 = sc.nextInt();
      int RC = 0;
      if(r1 == 1){
         RC++;
      } if(r2 == 1){
         RC++;
      } if(r3 == 1){
         RC++;
      } if(r4 == 1){
         RC++;
      } if(r5 == 1){
         RC++;
      } if(r6 == 1){
         RC++;
      } if(r7 == 1){
         RC++;
      } if(r8 == 1){
         RC++;
      } if(r9 == 1){
         RC++;
      } if(r10 == 1){
         RC++;
      }
      System.out.print("Has acertado "+RC);
      sc.close();
   }
}
