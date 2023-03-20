package Capitulo_07;
/* Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?

 */
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
