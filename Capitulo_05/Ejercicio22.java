package Capitulo_05;
/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 *hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 *Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 *por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 *a las 15:00h.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        boolean esPrimo = true;
        for(int i = 2; i<101;i++){
            esPrimo = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

}
