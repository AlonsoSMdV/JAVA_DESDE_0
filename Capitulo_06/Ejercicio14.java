package Capitulo_06;

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
