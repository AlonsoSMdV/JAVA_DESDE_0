package Capitulo_06;

public class Ejercicio01 {
    public static void main(String[] args) {
        int d1 = (int)(Math.random()*6)+1;
        System.out.println("Dado 1: "+d1);
        int d2 = (int)(Math.random()*6)+1;
        System.out.println("Dado 2: "+d2);
        int d3 = (int)(Math.random()*6)+1;
        System.out.println("Dado 3: "+d3);

        System.out.print("Total = "+(d1+d2+d3));
    }
}
