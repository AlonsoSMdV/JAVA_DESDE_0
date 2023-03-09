package Capitulo_06;

public class Ejercicio19 {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int maxPar = 0;
        int minImpar = 199;
        for(int i = 0; i < 50;i++){
            numero = (int)(Math.random()*301)-100;
            System.out.print(numero+" ");
            suma += numero;
            if(numero % 2 == 0){
                if(numero > maxPar){
                    maxPar = numero;
                }
            }else{
                if(numero < minImpar){
                    minImpar = numero;
                }
            }
        }
        System.out.println();
        System.out.println("El mínimo de los impares es: "+minImpar);
        System.out.println("El máximo de los pares es: "+maxPar);
        System.out.println("La media es "+(suma/50));

    }
}
