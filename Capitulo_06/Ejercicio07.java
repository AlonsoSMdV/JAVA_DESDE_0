package Capitulo_06;
/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
*/
public class Ejercicio07 {
    public static void main(String[] args) {

        for(int i = 0;i < 14;i++){
            int apuesta = (int)(Math.random()*3)+1;
            switch(apuesta){
                case 1:
                System.out.print(" 1 | ");
                break;
    
                case 2:
                System.out.print(" X | ");
                break;
    
                case 3:
                System.out.print(" 2 | ");
                break;
            }

            int apuesta2 = (int)(Math.random()*3)+1;
            switch(apuesta2){
                case 1:
                System.out.print(" 1 | ");
                break;
    
                case 2:
                System.out.print(" X | ");
                break;
    
                case 3:
                System.out.print(" 2 | ");
                break;
            }

            int apuesta3 = (int)(Math.random()*3)+1;
            switch(apuesta3){
                case 1:
                System.out.print(" 1 | ");
                break;
    
                case 2:
                System.out.print(" X | ");
                break;
    
                case 3:
                System.out.print(" 2 | ");
                break;
            }
            System.out.println();
        }
        int pleno = (int)(Math.random()*3)+1;
        switch(pleno){
            case 1:
            System.out.print(" 1 | ");
            break;

            case 2:
            System.out.print(" X | ");
            break;

            case 3:
            System.out.print(" 2 | ");
            break;
        }
    }
}
