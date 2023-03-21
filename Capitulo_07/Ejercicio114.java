package Capitulo_07;
/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
 */
import java.util.Scanner;
public class Ejercicio114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabra = new String[8];
        String[] resultado = new String[8];
        String[] Color =  {"rojo", "amarillo", "verde", "naranja", "azul", "rosa", "negro", "blanco", "morado"};
        int colores = 0;
        for(int i = 0;i <8;i++){
            palabra[i] = sc.next();
            for(String c : Color){
                if(palabra[i].equals(c)){
                    resultado[colores++] = c;
                }
            }
        }
        for(int i = 0;i < 8;i++){
            boolean esColor = false;
            for(String c : Color){
                if(palabra[i].equals(c)){
                    esColor = true;
                }
            }
            if(!esColor){
                resultado[colores++] = palabra[i];
            }
        }
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 8;i++){
            System.out.printf("   %d    │",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 8;i++){
            System.out.printf("%-8s│",palabra[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

        System.out.println("Array resultado");
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 8;i++){
            System.out.printf("   %d    │",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 8;i++){
            System.out.printf("%-8s│",resultado[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        sc.close();
    }
}
