package Capitulo_02;
/*
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 *otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 *por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */
public class Ejercicio08 {
    public static void main(String args[]){
        char l1 = 's';
        char l2 = 'a';
        char l3 = 'm';
        char l4 = 'b';
        String cadena = (String)(l1+""+l2+""+l3+""+l4+""+l2);
        System.out.println(cadena);
        /*
         * El problema es que no se podia hacer una cadena de chars por lo que he tenido que 
         * hacer un cast a String y con eso ya si funciona
         */
    }
}
