package Capitulo_06;
/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
         System.out.print("\033[32m");
        
         for(int i = 0;i < 8000;i++){
            System.out.print((char)(Math.random()*(126-32+1)+32));
         }
    }
}
