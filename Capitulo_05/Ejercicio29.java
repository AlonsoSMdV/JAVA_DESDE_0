package Capitulo_05;
/*
 * Escribe un programa que muestre por pantalla todos los números enteros
 *positivos menores a uno leído por teclado que no sean divisibles entre otro
 *también leído de igual forma.
 */
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.print("Introduce otro el cual hará que se muestren los divisbles del otro por pantalla: ");
        int n2 = sc.nextInt();
        for(int i = 1;i <n;i++){
            if((i%n2)==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
