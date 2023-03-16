package Capitulo_06;
/* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        String colores = "";
        String colores1 = "";
        String colores2 = "";

        int color;
        int color1;
        int  color2;
        do{
            color = (int)(Math.random()*6+1);
            color1 = (int)(Math.random()*6+1);
            color2 = (int)(Math.random()*6+1);
        }while((color == color1) || (color == color2) || (color1 == color2) );
            switch(color){
                case 1: 
                    colores = "rojo";
                    break;
                case 2: 
                    colores = "verde";
                    break;
                case 3: 
                    colores = "azul";
                    break;
                case 4: 
                    colores = "amarillo";
                    break;
                case 5: 
                    colores = "violeta";
                    break;
                case 6: 
                    colores = "naranja";
                    break;
                
            }
            switch(color1){
                case 1: 
                    colores1 = "rojo";
                    break;
                case 2: 
                    colores1 = "verde";
                    break;
                case 3: 
                    colores1 = "azul";
                    break;
                case 4: 
                    colores1 = "amarillo";
                    break;
                case 5: 
                    colores1 = "violeta";
                    break;
                case 6: 
                    colores1 = "naranja";
                    break;
                
            }
            switch(color2){
                case 1: 
                    colores2 = "rojo";
                    break;
                case 2: 
                    colores2 = "verde";
                    break;
                case 3: 
                    colores2 = "azul";
                    break;
                case 4: 
                    colores2 = "amarillo";
                    break;
                case 5: 
                    colores2 = "violeta";
                    break;
                case 6: 
                    colores2 = "naranja";
                    break;
                
            }
            System.out.print(colores+" "+colores1+" "+colores2);

    }
}
