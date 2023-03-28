package Capitulo_07.Arrays_Unidimensionales;
/* Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos
 */
import java.util.Scanner;
public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int minimo = 500;
        int maximo = 0;
        for(int i = 0; i < 100;i++){
            num[i] = (int)(Math.random()*501);
            System.out.print(num[i]+" ");

            if (num[i] < minimo) {
                minimo = num[i];
            }
            if (num[i] > maximo) {
                maximo = num[i];
            }
        }
        System.out.println();
        System.out.print("¿Qué quieres destacar? (1-mínimo, 2-máximo): ");
        int destacar = sc.nextInt();

        
        if(destacar == 1){

            
            for(int i = 0; i < 100;i++){
                if(num[i] == minimo){
                    System.out.print("**"+num[i]+"** ");
                }else{
                    System.out.print(num[i]+" ");
                }
            }
        }else if(destacar == 2){

            
            for(int i = 0; i < 100;i++){
                if(num[i] == maximo){
                    System.out.print("**"+num[i]+"** ");
                }else{
                    System.out.print(num[i]+" ");
                }
    
            }
        }
        sc.close();
    }
}
