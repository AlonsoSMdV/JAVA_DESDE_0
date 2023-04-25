package Examenes._Examen1101._Examen1101;

import Examenes._Examen1101._Examen1101.textos.Utils;
import java.util.Scanner;
public class Examen11012023{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto = "        Lorem Ipsum is          simply           dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem          Ipsum.      ";
        System.out.println("***********************************");
        System.out.println("Texto");
        System.out.println("***********************************");
        System.out.println(texto);
        System.out.println("***********************************");
        System.out.println("Número de palabras: "+Utils.cuentaPalabras(texto));
        System.out.println("***********************************");
        System.out.println("Buscar una palabra en el texto");
        System.out.println("***********************************");
        System.out.print("Introduce la posición de la palabra: ");
        String palabra = Utils.obtenerPalabra(texto, sc.nextInt());
        System.out.println("La palabra es: " +  palabra);
        System.out.println("***********************************");
        System.out.println("Conteo de palabras");
        System.out.println("***********************************");
        String resumen = Utils.resumenTexto(texto);
        System.out.println(resumen);
        System.out.println("***********************************");
        System.out.println("Texto con espacios optimizados");
        System.out.println("***********************************");
        System.out.println(Utils.reduceEspacios(texto));
        System.out.println("***********************************");
        System.out.println("Texto invertido");
        System.out.println("***********************************");
        System.out.println(Utils.invertirPalabras(texto));
        System.out.println("***********************************");
        System.out.println("Texto con palabras desordendas");
        System.out.println("***********************************");
        System.out.println(Utils.desordenaPalabras(texto));
        sc.close();
    }
}