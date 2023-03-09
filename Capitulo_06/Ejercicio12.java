package Capitulo_06;

public class Ejercicio12 {
    public static void main(String[] args) {
         System.out.print("\033[32m");
        
         for(int i = 0;i < 8000;i++){
            System.out.print((char)(Math.random()*(126-32+1)+32));
         }
    }
}
