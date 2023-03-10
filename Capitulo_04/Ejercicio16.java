package Capitulo_04;
/*
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
    está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
    con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
    puntos. Las preguntas contestadas con falso no suman puntos. A continuación
    se listan las preguntas del test.
    1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
    aparente.
    2. Ha aumentado sus gastos de vestuario
    3. Ha perdido el interés que mostraba anteriormente por ti
    4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
    arregla el pelo y se asea con más frecuencia (si es mujer)
    5. No te deja que mires la agenda de su teléfono móvil
    6. A veces tiene llamadas que dice no querer contestar cuando estás tú
    delante
    7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
    8. Muchos días viene tarde después de trabajar porque dice tener mucho
    más trabajo
    9. Has notado que últimamente se perfuma más
    10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
    A continuación se muestran los mensajes que deberá dar el programa según
    la puntuación obtenida.
    • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
    fiel.
    • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
    vida o en su mente, aunque seguramente será algo sin importancia. No
    bajes la guardia.
    • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
    viviendo un romance con otra persona. Te aconsejamos que indagues un
    poco más y averigües que es lo que está pasando por su cabeza.
 */
import java.util.Scanner;
public class Ejercicio16 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Verdadero(1) o falso(2)");
      System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
      int r1 = sc.nextInt();
      System.out.print("2. Ha aumentado sus gastos de vestuario ");
      int r2 = sc.nextInt();
      System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti ");
      int r3 = sc.nextInt();
      System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) ");
      int r4 = sc.nextInt();
      System.out.print("5. No te deja que mires la agenda de su teléfono móvil ");
      int r5 = sc.nextInt();
      System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
      int r6 = sc.nextInt();
      System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
      int r7 = sc.nextInt();
      System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
      int r8 = sc.nextInt();
      System.out.print("9. Has notado que últimamente se perfuma más ");
      int r9 = sc.nextInt();
      System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
      int r10 = sc.nextInt();
      int RC = 0;
      if(r1 == 1){
         RC+=3;
      } if(r2 == 1){
         RC+=3;
      } if(r3 == 1){
         RC+=3;
      } if(r4 == 1){
         RC+=3;
      } if(r5 == 1){
         RC+=3;
      } if(r6 == 1){
         RC+=3;
      } if(r7 == 1){
         RC+=3;
      } if(r8 == 1){
         RC+=3;
      } if(r9 == 1){
         RC+=3;
      } if(r10 == 1){
         RC+=3;
      }
      if(RC<=10){
         System.out.print(" ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      }else if(RC< 22){
         System.out.print(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
      }else if(RC <=30){
         System.out.print(" Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      }
      sc.close();
   }
}
