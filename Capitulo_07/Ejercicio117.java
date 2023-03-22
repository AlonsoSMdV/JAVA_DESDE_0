package Capitulo_07;
/* Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 */

 import java.util.Scanner;
public class Ejercicio117 {
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
