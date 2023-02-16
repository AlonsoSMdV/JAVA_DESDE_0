package Capitulo_04;
/*
 * Realiza un programa que calcule el precio de un desayuno. El programa
    preguntará primero qué ha tomado el usuario de comer: palmera, donut o
    pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
    programa debe preguntar además si era con aceite o con tortilla; el primero
    vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
    café a 1’50 y 1’20 respectivamente.
 */
import java.util.Scanner;
public class Ejercicio29 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String pitufo = "";
String resultado = "";
double precioComida = 0;
double precioBebida = 0;
// Comida
System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
String comida = sc.nextLine();
if (comida.equalsIgnoreCase("pitufo")) {
System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
pitufo = sc.nextLine();
if (pitufo.equalsIgnoreCase("aceite")) {
resultado = "Pitufo con aceite: 1,20 €";
precioComida = 1.20;
} else if (pitufo.equalsIgnoreCase("tortilla")) {
resultado = "Pitufo con tortilla: 1,60 €";
precioComida = 1.60;
}
} else if (comida.equalsIgnoreCase("palmera")) {
resultado = "Palmera: 1,40 €";
precioComida = 1.40;
} else if (comida.equalsIgnoreCase("donut")) {
resultado = "Donut: 1,00 €";
precioComida = 1.00;
}
// Bebida
System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
String bebida = sc.nextLine();
if (bebida.equalsIgnoreCase("zumo")) {
resultado += "\nZumo: 1,50 €";
precioBebida = 1.50;
} else if (bebida.equalsIgnoreCase("café")) {
resultado += "\nCafé: 1,20 €";
precioBebida = 1.20;
}
System.out.println(resultado);
System.out.printf("Total desayuno: %.2f €\n", precioComida + precioBebida);
sc.close();
}
}
