package Capitulo_07.Arrays_Unidimensionales;
/* Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.

 */

 import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 10;i++){
            System.out.printf("   %d    │",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 10;i++){
            num[i] = (int)(Math.random()*101);
            System.out.printf("%-8s│",num[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        int n;
        boolean existe = false;
        do{
            System.out.print("Introduzca un numero que esté dentro del array: ");
            n = sc.nextInt();
            for(int i : num){
                if(i == n){
                    existe = true;
                }
            }
            if(!existe){
                System.out.println("El número no existe, introduce otro");

            }
        }while(!existe);

        while(num[0] != n){
            int aux = num[9];
            for (int i = 9; i > 0; i--) {
                num[i] = num[i-1];
            }
            num[0] = aux;
        }
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 10;i++){
            System.out.printf("   %d    │",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 10;i++){
            System.out.printf("%-8s│",num[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        sc.close();
    }
}
