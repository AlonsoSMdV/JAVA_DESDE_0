package Capitulo_05;

/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 *número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contraseña = 2397;
        int intentos = 3;
        int PedidoContraseña;
        do{
            System.out.print("Introduzca la combinacion de la caja fuerte: ");
            PedidoContraseña = sc.nextInt();
            if(PedidoContraseña == contraseña){
                System.out.print("La caja fuerte se ha abierto satisfactoriamente");
                intentos = -1;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
                System.out.println("Te quedan "+intentos);
                intentos--;
            }
        }while(intentos>=0);
        sc.close();
    }
}
