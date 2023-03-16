package Capitulo_06;
/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.
*/
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
