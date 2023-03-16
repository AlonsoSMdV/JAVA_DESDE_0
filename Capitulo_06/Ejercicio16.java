package Capitulo_06;
/* Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.*/
public class Ejercicio16 {
    public static void main(String[] args) {
        int tirada;
        String figuras = "";
        int cora = 0;
        int dia = 0;
        int herra = 0;
        int campa = 0;
        int lim = 0;

        for(int i = 0;i < 3;i++){
            tirada = (int)(Math.random()*5)+1;
            switch(tirada){
                case 1: 
                    figuras = "corazón";
                    cora++;
                    break;

                case 2: 
                    figuras = "diamante";
                    dia++;
                    break;

                case 3: 
                    figuras = "herradura";
                    herra++;
                    break;

                case 4: 
                    figuras = "campana";
                    campa++;
                    break;

                case 5: 
                    figuras = "limón";
                    lim++;
                    break;
            }

            System.out.print(figuras+" ");
        }
        System.out.println();
        if(cora == 2 || dia == 2 || herra == 2 || campa == 2 || lim == 2){
            System.out.println("Has recuperado la moneda");
        }else if(cora == 3 || dia == 3 || herra == 3 || campa == 3 || lim == 3){
            System.out.println("Has ganado 10 monedas");
        }else if(cora == 1 || dia == 1 || herra == 1 || campa == 1 || lim == 1){
            System.out.println("Lo siento has perdido");
        }
    }
}
