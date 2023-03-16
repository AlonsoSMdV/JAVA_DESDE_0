package Capitulo_06;
/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25])*/
public class Ejercicio25 {
    public static void main(String[] args) {
        int numeros;
        for(int i = 0; i < 100; i++){
            numeros = (int)(Math.random()*201)+10;
            boolean esPrimo = true;
            for(int j = 2 ;j<numeros;j++){
                if(numeros % j == 0){
                    esPrimo = false;
                }
            }
            if(numeros % 5 == 0){
                System.out.print("["+numeros+"] ");
            }else if(esPrimo){
                System.out.print("#"+numeros+"# ");
            }else{
                System.out.print(numeros+" ");
            }
        }
    }
}
