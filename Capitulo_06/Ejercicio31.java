package Capitulo_06;


import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CRAPS");
        System.out.print("NORMAS:\nSe tiran dos dados si sale 7 u 11(en la suma de ambos dados) ganas la misma cantidad(Ej: apuestas 100 sale 7 pues ganas 200)\nSi sale 2, 3 o 12(en la suma de ambos dados) pierdes todo\ny si sale el resto de posibilidades entras en la segunda etapa la cual deberás sacar el mismo número y si este sale ganas,si sale 7 pierdes y si sale otro has de seguir tirando.");
        System.out.print("\nIntroduzca su apuesta: ");
        int apuesta = sc.nextInt();
        int dado1;
        int dado2;
        int FindeJuego = 0;
        do {
            dado1 = (int)(Math.random()*6)+1;
            dado2 = (int)(Math.random()*6)+1;
            int suma = dado1 + dado2;
            System.out.println("La suma es: " +suma);
            if(suma == 7 || suma == 11  ){
                System.out.print("Has ganado "+(apuesta+apuesta));
                FindeJuego = -1;
            }else if(suma == 2 || suma == 3 || suma == 12 ){
                System.out.print("Has perdido");
                FindeJuego = -1;
            }else if(suma == 4 || suma == 5 || suma == 6 || suma == 8 || suma == 9 || suma == 10){
                System.out.println("Siguiente etapa:");
                do {
                    dado1 = (int)(Math.random()*6)+1;
                    dado2 = (int)(Math.random()*6)+1;
                    int suma2 = dado1+dado2;
                    System.out.println("La suma es: " +suma2);
                    if(suma2 == 7){
                        System.out.print("Has perdido");
                        FindeJuego = -1;
                    }else if(suma == suma2){
                        System.out.print("Felicidades ganaste");
                        FindeJuego = -1;
                    }
                } while (FindeJuego >= 0);
            }
        } while (FindeJuego >= 0);

        sc.close();
    }
}
