package Capitulo_06;

public class Ejercicio09 {
    public static void main(String[] args) {

        int n = 0;
        do {
            n = (int)(Math.random()*101);
            if(n % 2 == 0){
                System.out.print(n+" ");
            }
        } while (n != 24);
    }
}
