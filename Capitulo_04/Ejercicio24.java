package Capitulo_04;
/*
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
    según las siguientes condiciones:
    • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
    de proyecto), los días que ha estado de viaje visitando clientes durante el
    mes y su estado civil (1 - Soltero, 2 - Casado).
    • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
    si se trata de un prog. junior, un prog. senior o un jefe de proyecto
    respectivamente.
    • Por cada día de viaje visitando clientes se pagan 30 euros extra en
    concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
    un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */
import java.util.Scanner;
public class Ejercicio24 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   System.out.println("1 - Programador junior");
   System.out.println("2 - Prog. senior");
   System.out.println("3 - Jefe de proyecto");
   System.out.print("Introduzca el cargo del empleado (1 - 3): ");
   int cargo = sc.nextInt();
   System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
   int diasVisita = sc.nextInt();
   System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
   int estadoCivil = sc.nextInt();
   double sueldoBase = 0;
   switch(cargo) {
   case 1: // Programador junior
   sueldoBase = 950;
   break;
   case 2: // Programador senior
   sueldoBase = 1200;
   break;
   case 3: // jefe de proyecto
   sueldoBase = 1600;
   break;
   default:
   System.out.println("No ha elegido correctamente el sueldo base.");
   }
   double sueldoDietas = diasVisita * 30;
   double sueldoBruto = sueldoBase + sueldoDietas;
   double irpf = 0;
   if (estadoCivil == 1) { // Soltero
   irpf = 25;
   } else if (estadoCivil == 2) { // Casado
   irpf = 20;
   } else {
   System.out.println("No ha elegido correctamente el estado civil.");
   }
   double cuantiaIrpf = (sueldoBruto * irpf) / 100;
   // Muestra la nómina desglosada
   System.out.println("");
   System.out.printf("Sueldo base %7.2f \n", sueldoBase);
   System.out.printf("Dietas (%2d viajes) %7.2f \n", diasVisita, sueldoDietas);
   System.out.printf("Sueldo Bruto %7.2f \n", sueldoBruto);
   System.out.printf("Retención IRPF (%.0f%%) %7.2f \n", irpf, cuantiaIrpf);
   System.out.println("");
   System.out.printf("Sueldo neto %7.2f \n", sueldoBruto - cuantiaIrpf);
   System.out.println("");
   sc.close();
   }
}