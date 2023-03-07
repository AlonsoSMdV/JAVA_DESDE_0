package Capitulo_05;

/*
 *Escribe un programa que pida un número entero positivo por teclado y que
 *muestre a continuación los números desde el 1 al número introducido junto
 *con su factorial.
 */
import java.util.Scanner;
public class Ejercicio39 {
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
        int factorial = 1;
        if(n==0){
            System.out.print("El factorial de "+n+" es 1");
        }else{
            for(int i = 1; i <= n ;i++){
                factorial *= i;
                System.out.println(i+"! = "+factorial);
            }
        }
        sc.close();
    }
}
