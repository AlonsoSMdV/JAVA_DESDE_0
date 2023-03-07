package Capitulo_05;
/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Introduce un número: ");
            n = sc.nextInt();

            if(n<0){
                System.out.print("No es valido");
            }
        }while(n<0);
        int suma = 0;
        for(int i = n; i< n + 101;i++){
            suma += i;
        }
        System.out.print("La suma es: "+suma);
        sc.close();
    }
}
