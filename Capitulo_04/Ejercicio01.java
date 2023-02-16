package Capitulo_04;
/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Elija un dia de la semana: \n1.Lunes \n2.Martes \n3.Miercoles \n4.Jueves \n5.Viernes\n");
        int dia = sc.nextInt();
        switch(dia){
            case 1:
            System.out.print("Hoy toca programación a primera");
            break;
            case 2:
            System.out.print("Hoy toca sitemas informáticos a primera");
            break;
            case 3:
            System.out.print("Hoy toca entornos de desarrollo a primera");
            break;
            case 4:
            System.out.print("Hoy toca programación a primera");
            break;
            case 5:
            System.out.print("Hoy toca FOL a primera");
            break;
        }
        sc.close();
    }
}
