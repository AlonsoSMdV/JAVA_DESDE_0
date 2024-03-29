package Capitulo_06;
/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
*/
public class Ejercicio05 {
    public static void main(String[] args) {
        int suma = 0;
        int maximo = 100;
        int minimo = 199;
        for(int i = 0;i<50;i++){
            int n = (int)(Math.random()*99)+101;
            System.out.print(n+ " ");
            suma += n;
            if(n>maximo){
                maximo = n;
            }
            if(n<minimo){
                minimo = n;
            }
        }
        System.out.println();
        System.out.println("La media es: "+suma/50);
        System.out.println("El máximo es: "+maximo);
        System.out.println("El mínimo es: "+minimo);
    }
}
