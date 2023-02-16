package Capitulo_04;
/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
    nacimiento.
 */
import java.util.Scanner;
public class Ejercicio10 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Escribe el número de tu mes de nacimiento: ");
      int mes = sc.nextInt();
      System.out.print("Escribe el día que naciste: ");
      int dia = sc.nextInt();

      switch(mes){
         case 1:
         if(dia<=22){
            System.out.print("Capricornio");
         }else if(dia<=31){
            System.out.print("Acuario");
         }
         break;

         case 2:
         if(dia<=20){
            System.out.print("Acuario");
         }else if(dia<=31){
            System.out.print("Piscis");
         }
         break;

         case 3:
         if(dia<=20){
            System.out.print("Piscis");
         }else if(dia<=31){
            System.out.print("Aries");
         }
         break;

         case 4:
         if(dia<=19){
            System.out.print("Aries");
         }else if(dia<=31){
            System.out.print("Tauro");
         }
         break;

         case 5:
         if(dia<=20){
            System.out.print("Tauro");
         }else if(dia<=31){
            System.out.print("Géminis");
         }
         break;

         case 6:
         if(dia<=20){
            System.out.print("Géminis");
         }else if(dia<=31){
            System.out.print("Cáncer");
         }
         break;

         case 7:
         if(dia<=20){
            System.out.print("Cáncer");
         }else if(dia<=31){
            System.out.print("Leo");
         }
         break;

         case 8:
         if(dia<=22){
            System.out.print("Leo");
         }else if(dia<=31){
            System.out.print("Virgo");
         }
         break;

         case 9:
         if(dia<=23){
            System.out.print("Virgo");
         }else if(dia<=31){
            System.out.print("Libra");
         }
         break;

         case 10:
         if(dia<=23){
            System.out.print("Libra");
         }else if(dia<=31){
            System.out.print("Escorpio");
         }
         break;

         case 11:
         if(dia<=22){
            System.out.print("Escorpio");
         }else if(dia<=31){
            System.out.print("Sagitario");
         }
         break;

         case 12:
         if(dia<=22){
            System.out.print("Sagitario");
         }else if(dia<=31){
            System.out.print("Capricornio");
         }
         break;

      }
      sc.close();
   }
}
