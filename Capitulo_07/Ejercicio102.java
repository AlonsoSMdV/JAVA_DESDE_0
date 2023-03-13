package Capitulo_07;

public class Ejercicio102 {
    public static void main(String[] args) {
        char[] simbolo = new char[10];
        simbolo[1] = 'a';
        simbolo[2] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for(int i = 0; i < 10; i++){
            System.out.printf("Simbolo[%2d]: '"+simbolo[i]+"'\n",i);
        }
    }
}
