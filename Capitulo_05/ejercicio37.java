package Capitulo_05;
/*
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 */

 import java.util.Scanner;
public class ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        long n = sc.nextLong();
        long num = n;
        long volt = 0;
        int longitud = 0;
        if(n<10){
            longitud = 1;
        }else{
            while(n > 0){
                volt = volt * 10 + n % 10;
                n /= 10;
                longitud++;
            }
        }
        int digito = 0;
        System.out.print("El número "+num+" en decimal es el ");
        for(int i = 0; i < longitud-1; i++ ){
            digito = (int)(volt % 10);
            for(int j = 0; j < digito; j++){
                System.out.print("| ");
            }
            System.out.print(" - ");
            volt/=10;
            
        }
            digito = (int)(volt % 10);
            for(int j = 0; j < digito; j++){
                System.out.print("| ");
            }
        System.out.print(" en el sistema de palotes");
    }
}
