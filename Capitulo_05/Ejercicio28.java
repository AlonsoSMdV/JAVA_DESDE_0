package Capitulo_05;

/*
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 */
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Por favor; introduzca un número entero: ");
            n = sc.nextInt();

            if(n<0){
                System.out.print("Número no correcto");
            }
        }while(n<0);

        int factorial = n;
        if(n==0){
            System.out.print("El factorial de "+n+" es 1");
        }else{
            for(int i = 1; i < n ;i++){
                factorial *= i;
            }
            System.out.println(n+"! = "+factorial);
        }
        sc.close();
    }
}
