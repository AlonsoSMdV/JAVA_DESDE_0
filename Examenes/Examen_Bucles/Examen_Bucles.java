package Examenes.Examen_Bucles;

import java.util.Scanner;
public class Examen_Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la anchura de la carta: ");
        String mensaje = sc.nextLine();
        int anchuraCarta = mensaje.length()/2+3;
        if(anchuraCarta%2 == 0){
            anchuraCarta++;
            for(int i = 1; i <= anchuraCarta/2+1;i++){
                for(int j = 1; j <= anchuraCarta;j++){
                    if(i == 1|| j == 1|| i == anchuraCarta|| j == anchuraCarta||i == j||i-1 == anchuraCarta-j){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }else{
            for(int i = 1; i <= anchuraCarta/2+1;i++){
                for(int j = 1; j <= anchuraCarta;j++){
                    if(i == 1|| j == 1|| i == anchuraCarta|| j == anchuraCarta||i == j||i-1 == anchuraCarta-j){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        /*for(int j = 1; j <= anchuraCarta; j++){
            System.out.print("* ");

        }
        System.out.println();
        int RellenoPorIzquierda = (int)((double)(anchuraCarta/2-3)-mensaje.length()/2+3);
        String RellenoIzquierdaString = (RellenoPorIzquierda == 0)?"":String.valueOf(RellenoPorIzquierda);
        int RellenoPorDerecha = (int)Math.round((double)(anchuraCarta/2-3)-mensaje.length()/2+3);;
        String RellenoDerechaString = (RellenoPorDerecha == 0)?"":String.valueOf(RellenoPorDerecha);
        String formato = "*%"+RellenoIzquierdaString+"s%s%"+RellenoDerechaString+"s*";
        System.out.printf(formato, "",mensaje,"");
        System.out.println();
        for(int j = 1; j <= anchuraCarta; j++){
            System.out.print("* ");

         }*/
         /*for(int j = 1; j <= anchuraCarta; j++){
            System.out.print("* ");

         }
         System.out.println();
        for(int j =1; j<= anchuraCarta;j++){
                if(j == 1 || j == anchuraCarta){
                    System.out.print("* ");
                }else{
                    System.out.print(mensaje);
                    break;
                }            
        }
        System.out.println();
        for(int j = 1; j <= anchuraCarta; j++){
            System.out.print("* ");

         }*/
         for(int i = 1; i <= 3;i++){
            for(int j =1; j<= anchuraCarta;j++){
                if(j == 1 || j == anchuraCarta||i==1||i==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }  
            }
            System.out.println();
         }

        sc.close();
    }
}
