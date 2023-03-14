package Capitulo_07;

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
