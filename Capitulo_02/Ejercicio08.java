package Capitulo_02;

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
