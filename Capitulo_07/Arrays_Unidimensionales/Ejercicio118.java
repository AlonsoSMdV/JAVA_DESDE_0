package Capitulo_07.Arrays_Unidimensionales;


/*Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.
 */
public class Ejercicio118 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int CuentaMenores = 0;
        int CuentaMayores = 0;
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 10;i++){
            System.out.printf("   %d    │",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 10;i++){
            num[i] = (int)(Math.random()*201);
            System.out.printf("%-8s│",num[i]);
            if( num[i] <= 100){
                menores[CuentaMenores++] = num[i];
            }else if( num[i] > 100){
                mayores[CuentaMayores++] = num[i];
            }
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

        int[] ArrayFinal = new int[10];
        int j = 0;
        int menos = 0;
        int mas = 0;
        do{
            if(menos < CuentaMenores){
                ArrayFinal[j++] = menores[menos++];
            }

            if(mas < CuentaMayores){
                ArrayFinal[j++] = mayores[mas++];
            }
        }while(j < 10);
        System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        System.out.printf("│");
        for(int i = 0;i < 10;i++){
            System.out.printf("   %d    │",i);

        }
        System.out.println();
        System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

                System.out.printf("│");
        for(int i = 0;i < 10;i++){
            System.out.printf("%-8s│",ArrayFinal[i]);
        }
        System.out.println();
        System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    }
}
