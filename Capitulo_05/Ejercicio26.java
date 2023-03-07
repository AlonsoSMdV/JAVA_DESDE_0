package Capitulo_05;
/*
 * Realiza un programa que pida primero un número y a continuación un dígito.
 *El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 */
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        System.out.print("Ahora que digito quieres buscar en el numero: ");
        int digito = sc.nextInt();
        System.out.print(digito+" Está en las posiciones: ");
        int volt = 0;
        int longitud = 0;
        int pos = 0;

        if(n == 0){
            longitud = 1;
        }
        while(n > 0){
            volt = (volt*10)+(n%10);
            n = n/10;
            longitud++;
        }
        while(volt>0){
            if((volt%10)==digito){
                System.out.print(pos+" ");
            }
            volt/=10;
            pos++;
        }
        System.out.println();
        sc.close();
    }
}
