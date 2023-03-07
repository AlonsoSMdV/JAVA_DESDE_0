package Capitulo_05;
/*
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 *dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 *El día de la semana se puede pedir como un número (del 1 al 7) o como una
 *cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 *los datos correctamente y que el segundo día es posterior al primero.
 */
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia1 = 0;
        int dia2 = 0;
        int hora1 = 0;
        int hora2 = 0;
        String dia1string;
        String dia2string;
        String nombredia1 = "";
        String nombredia2 = "";
        boolean datosCorrectos = true;

        do{
            System.out.println("Primer dia y primera hora: ");
            System.out.print("Dia: ");
            dia1string = sc.nextLine();
            System.out.print("Hora: ");
            hora1 = sc.nextInt();

            switch(dia1string){
                case "lunes":
                case "1":
                    dia1 = 1;
                    nombredia1 = "lunes";
                    break;
                
                case "martes":
                case "2":
                    dia1 = 2;
                    nombredia1 = "martes";
                    break;

                case "miercoles":
                case "3":
                    dia1 = 3;
                    nombredia1 = "miercoles";
                    break;

                case "jueves":
                case "4":
                    dia1 = 4;
                    nombredia1 = "jueves";
                    break;

                case "viernes":
                case "5":
                    dia1 = 5;
                    nombredia1 = "viernes";
                    break;

                case "sabado":
                case "6":
                    dia1 = 6;
                    nombredia1 = "sabado";
                    break;

                case "domingo":
                case "7":
                    dia1 = 7;
                    nombredia1 = "domingo";
                    break;
            }

            System.out.println("Segundo dia y segunda hora: ");
            System.out.print("Dia: ");
            dia2string = sc.next();
            System.out.print("Hora: ");
            hora2 = sc.nextInt();

            switch(dia2string){
                case "lunes":
                case "1":
                    dia2 = 1;
                    nombredia2 = "lunes";
                    break;
                
                case "martes":
                case "2":
                    dia2 = 2;
                    nombredia2 = "martes";
                    break;

                case "miercoles":
                case "3":
                    dia2 = 3;
                    nombredia2 = "miercoles";
                    break;

                case "jueves":
                case "4":
                    dia2 = 4;
                    nombredia2 = "jueves";
                    break;

                case "viernes":
                case "5":
                    dia2 = 5;
                    nombredia2 = "viernes";
                    break;

                case "sabado":
                case "6":
                    dia2 = 6;
                    nombredia2 = "sabado";
                    break;

                case "domingo":
                case "7":
                    dia2 = 7;
                    nombredia2 = "domingo";
                    break;
            }

            if(dia2 <= dia1){
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }
            if ((dia1 == 0) || (dia2 == 0)) {
                System.out.println("No se ha introducido correctamente el día de la semana.");
                System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
                datosCorrectos = false;
                }
                if ((hora1 < 0) || (hora1 > 23) || (hora2 < 0) || (hora2 > 23)) {
                System.out.println("No se ha introducido correctamente la hora del día.");
                System.out.println("Las horas válidas están entre 0 y 23.");
                datosCorrectos = false;
                }
        }while(!datosCorrectos);
        System.out.print("Entre las " + hora1 + ":00h del " + nombredia1);
        System.out.print(" y las " + hora2 + ":00h del " + nombredia2);
        System.out.println(" hay " + (((dia2 * 24) + hora2) - ((dia1 * 24) + hora1)) + " horas.");
        sc.close();
    }
}