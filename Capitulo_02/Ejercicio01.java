package Capitulo_02;
/*
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 *los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 *el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class Ejercicio01 {
    public static void main(String args[]){
        int x = 144;
        int y = 999;
        int suma = x + y;
        int resta = y - x;
        int multi = x * y;
        int divi = y / x;
        System.out.println("Suma = "+ x + " + " + y + " = " + suma);
        System.out.println("Resta = "+ y + " - " + x + " = " + resta);
        System.out.println("Multiplicación = "+ x + " * " + y + " = " + multi);
        System.out.println("División = "+ y + " / " + x + " = " + divi);
    }
}