package Capitulo_02;
/*
 *Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 *mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 *de Java (con un solo println) ¿es posible?
 */
public class Ejercicio07 {
    public static void main(String args[]){
        char l1 = 'H';
        char l2 = 'o';
        char l3 = 'l';
        char l4 = 'a';
        String world = " mundo";
        String saludo = ", buenos días";
        System.out.println(l1+""+l2+""+l3+""+l4+world+saludo);
        /*
         * Es posible usando un "+""+" entre char y char
         */
    }
}
