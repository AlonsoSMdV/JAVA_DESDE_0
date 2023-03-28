package Capitulo_07.Arrays_Unidimensionales;
/*Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes. */

import java.util.Scanner;
public class Ejercicio116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        for(int i = 0; i < 100;i++){
            num[i] = (int)(Math.random()*501);
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.print("¿Qué quieres destacar? (1-Múltiplos de 5, 2-Múltiplos de 7): ");
        int destacar = sc.nextInt();

        
        if(destacar == 1){

            
            for(int i = 0; i < 100;i++){
                if(num[i] % 5 == 0 ){
                    System.out.print("["+num[i]+"] ");
                }else{
                    System.out.print(num[i]+" ");
                }
            }
        }else if(destacar == 2){

            
            for(int i = 0; i < 100;i++){
                if(num[i] % 7 == 0){
                    System.out.print("["+num[i]+"]  ");
                }else{
                    System.out.print(num[i]+" ");
                }
    
            }
        }
        sc.close();
    }
}
