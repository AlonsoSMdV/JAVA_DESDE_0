package Capitulo_06;
/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.*/
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intentos = 5;
        boolean acertado = true;
        do{

                acertado = false;
                int azar = (int)(Math.random()*101);

                System.out.println("El número en el que piensas es: "+azar);
                System.out.println("Si o No");
                String correcion = sc.next();
                if(intentos < 1){
                    acertado = false;
                }
                if(correcion.equals("Si") || correcion.equals("si")){
                    System.out.println("Ha acertado el número en "+(5-intentos)+" intentos");
                    acertado = true;
                }else if(correcion.equals("No") || correcion.equals("no")){
                    intentos-=1;
                    System.out.println("El número en el que piensas es mayor o menor: ");
                    String num = sc.next();
                }

        }while(acertado != true && intentos > 0);
        sc.close();
    }
}
