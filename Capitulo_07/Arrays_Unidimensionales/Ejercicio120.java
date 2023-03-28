package Capitulo_07.Arrays_Unidimensionales;
/* Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º.
 */

 import java.util.Scanner;
public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos reyes desea introducir: ");
        int NReyes = sc.nextInt();
        String[] ArrayReyes = new String[NReyes];
        System.out.println("Introduzca los nombres de los reyes:");
        for(int i = 0; i < NReyes; i++){
            ArrayReyes[i] = sc.next();
        }
        System.out.println();
        System.out.println();
        int ordinalReyes = 1;
        for (int i = 0; i < NReyes; i++) {
            
            for (int j = 0; j < i; j++) {
                if (ArrayReyes[i].equals(ArrayReyes[j])) {
                ordinalReyes++;
                }
            }
            
                System.out.println(ArrayReyes[i] + " " + ordinalReyes + "º");
            }
        sc.close();
    }
}
