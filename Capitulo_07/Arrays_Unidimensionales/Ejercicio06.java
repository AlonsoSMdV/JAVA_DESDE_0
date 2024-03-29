package Capitulo_07.Arrays_Unidimensionales;
/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];

        System.out.println("Introduce 15 numeros:");
        for(int i = 0;i < 15;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Primer array");
        for(int i = 0; i < 15;i++){
            System.out.printf("num[%2d]: %d\n",i,num[i]);
        }
        System.out.println();
        int aux = num[14];
        for (int i = 14; i > 0; i--) {
            num[i] = num[i-1];
        }
        num[0] = aux;


        System.out.println("Array rotado");
        for(int i = 14; i >= 0;i--){
            System.out.printf("num[%2d]: %d\n",i,num[i]);
        }

        sc.close();
    }
}

