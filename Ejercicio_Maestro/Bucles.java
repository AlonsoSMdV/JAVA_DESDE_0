package Ejercicio_Maestro;

import java.util.Scanner;
public class Bucles {
    static Scanner sc;
    protected static void inicializar(){//Iniciar Scanner
        sc = new Scanner(System.in);
    }

    protected static void finalizar(){//Fin Scanner
        
            sc.close();
        
    }
    public static long solicitarNumero(){
        inicializar();
        long valor = -1;
        System.out.print("Introduzca una cadena de valores: ");
        valor = Long.parseLong(sc.nextLine());
        return valor;
    }

    public static int digitos(long valor){
        int dig = 0;
        do{
            valor/= 10;
            dig++;
        }while(valor!=0);
        return dig;
    }


    public static int maximo(long valor){
        int max = 0;
        int longitud = digitos(valor);
        for (int columna = 1; columna <= longitud; columna++){
            int v = digito(columna, valor);
            if(v > max){
                max = v;
            }
        }
        return max;
    }

    public static int digito(int pos, long  valor){
        int v = 0;
        int longitud = digitos(valor);
        for (int i = longitud-1; i >= longitud-pos; i--) {
            v = (int) (valor/(int)Math.pow(10, i));
            valor = valor%(int)Math.pow(10, i);
        }
        return v;
    }

    public static void SeparaNumeros(long valor){
        int longitud = digitos(valor);
        long aux = 0;
      
        for (int i = 0; i < longitud; i++) {
            System.out.print("----");
        }
        System.out.println();
        System.out.print("|");
        aux=valor;
        for (int i =longitud-1; i >= 0; i--) {
            int v =(int) (aux /  (long)Math.pow(10, i));
            aux = aux % (int)Math.pow(10, i);
            System.out.print(" "+v+" |");

        }
    }

    public static void grafica(long valor){
        int longitud = digitos(valor);
        int maximo = maximo(valor);
        SeparaNumeros(valor);
        System.out.println();
        for (int i = 0; i < longitud; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int fila = 1; fila <= maximo; fila++) {
            System.out.print("|");
            for(int columna = 1; columna <= longitud; columna++){
                int v = digito(columna, valor);
                
                if(v >= fila){
                    System.out.print(" * |");
                }else{
                    System.out.print("   |");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < longitud; i++) {
            System.out.print("----");
        }

    }
    public static void main(String[] args) {
        inicializar();
        long n = solicitarNumero();
    
        System.out.println(digitos(n));
        System.out.println(maximo(n));
        grafica(n);
        finalizar();
    }
}
