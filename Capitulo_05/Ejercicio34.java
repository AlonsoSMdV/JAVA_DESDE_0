package Capitulo_05;
/*
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 *dos números diferentes los dígitos pares y los impares. Se van comprobando los
 *dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 *del segundo número, segundo dígito del primer número, segundo dígito del
 *segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 *podemos suponer que el usuario introducirá dos números de la misma longitud
 *y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 *int donde sea necesario para admitir números largos.
 */
import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numero_1 = sc.nextLong(); 
        System.out.print("Ahora introduzca otro número: ");
        long numero_2 = sc.nextLong();
        long volt_1 = 0;
        long volt_2 = 0;
        int longitud = 0;
        while (numero_1 > 0) {
            volt_1 = (volt_1 * 10) + (numero_1 % 10);
            numero_1 /= 10;
            longitud++;
        } 
        while (numero_2 > 0) {
            volt_2 = (volt_2 * 10) + (numero_2 % 10);
            numero_2 /= 10;
            longitud++;
        } 
        long rect_1 = 0;
        long rect_2 = 0;
        long NPar = 0;
        long NImpar = 0;
        while(volt_1 > 0 || volt_2 > 0){
            rect_1 = rect_1 * 10 + volt_1 % 10;
            rect_2 = rect_2 * 10 + volt_2 % 10;

            if((volt_1 % 10)%2== 0){
                NPar = NPar*10 + volt_1 % 10;
            }else{
                NImpar = NImpar*10 + volt_1 % 10;
            }

            if((volt_2 % 10)%2== 0){
                NPar = NPar*10 + volt_2 % 10;
            }else{
                NImpar = NImpar*10 + volt_2 % 10;
            }
            
            volt_1 /= 10;
            volt_2 /= 10;
        }
        System.out.println(NPar);
        System.out.println(NImpar);
        sc.close();
    }
}
