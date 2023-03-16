package Capitulo_06;
/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/
public class Ejercicio11 {
    public static void main(String[] args) {
        int notas;
        String NotasEscritas = " ";
        int contSus = 0;
        int contSuf = 0;
        int contbien = 0;
        int contNot = 0;
        int contSob = 0;

        for(int i = 0; i < 20; i++){
            notas = (int)(Math.random()*5)+1;
            switch(notas){
                case 1:
                    NotasEscritas = "Suspenso";
                    contSus++;
                    break;

                case 2:
                    NotasEscritas = "Suficiente";
                    contSuf++;
                    break;

                case 3:
                    NotasEscritas = "Bien";
                    contbien++;
                    break;

                case 4:
                    NotasEscritas = "Notable";
                    contNot++;
                    break;

                case 5:
                    NotasEscritas = "Sobresaliente";
                    contSob++;
                    break;
            }

            System.out.println(NotasEscritas);
        }
        System.out.print("Hay "+contSus+" supensos, "+contSuf+" suficientes, "+contbien+" bienes, "+contNot+" notables, "+contSob+" sobresaliente");
    }
}
