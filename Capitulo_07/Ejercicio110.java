package Capitulo_07;
/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario
 */
public class Ejercicio110 {
    public static void main(String[] args) {
        int[] num = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int Pares = 0;
        int Impares = 0;
        for(int i = 0;i <20;i++){
            num[i] = (int)(Math.random()*101);
            if(num[i]%2 == 0){
                par[Pares++] = num[i];
            }else{
                impar[Impares++] = num[i];
            }
        }

        for(int i = 0;i < 20;i++){
            System.out.printf("Número[%2d]: %d",i,num[i]);
            if(num[i] % 2 == 0){
                System.out.print("  par");
            }
            System.out.println();
        }

        for(int i = 0; i < Pares;i++){
            num[i] = par[i];
        }

        for(int i = Pares; i < 20;i++){
            num[i] = impar[i-Pares];
        }

        System.out.println("Array resultado");
        for(int i = 0;i < 20;i++){
            System.out.printf("Número[%2d]: %d",i,num[i]);
            if(num[i] % 2 == 0){
                System.out.print(" par");
            }
            System.out.println();
        }
    }
}
