package Examenes._Examen1101._Examen1101.textos;
import java.util.Scanner;
public class Utils {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static Scanner sc;
    public static void inicializar()    {//Iniciar Scanner
        sc = new Scanner(System.in);
    }

    public static void finalizar(){//Fin Scanner
        
            sc.close();
        
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /** textoAArray
        * recibe un texto y devuelve un array conteniendo cada una de las palabras del texto.
        * @param texto es un String que contiene la cadena de texto inicial
        * @return un array con la cadena de texto
        */
    public static String[] textoAArray(String texto) {
        int numPalabras = cuentaPalabras(texto);
        String[] array = new String[numPalabras];
        int indiceArray = 0;
        String palabraActual = "";
    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);
        
        if (c!= ' ') {
            // Si el caracter es una letra o número, se agrega a la palabra actual
            palabraActual += c;
        } else {
            // Si el caracter no es una letra ni número, se agrega la palabra actual al array
            if (!palabraActual.equals("")) {
                array[indiceArray] = palabraActual;
                indiceArray++;
                palabraActual = "";
            }
        }
    }
    
    // Si al final del texto hay una palabra pendiente de agregar al array
    if (!palabraActual.equals("")) {
        array[indiceArray] = palabraActual;
    }
        return array;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** arrayATexto
    * recibe un array de String y devuelve un texto compuesto por cada una de las palabras del array separadas cada una * * por un espacio.
    * @param array es un array que contiene la cadena de texto inicial
    * @return String con la cadena de texto
    */
    public static String arrayATexto(String[] array) {
        String texto = "";
 
        return texto;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** cuentaPalabras
    * recibe un texto y devuelve el número de palabras que contiene.
    * @param texto es un String que contiene la cadena de texto inicial
    * @return Nº de palabras en el texto
    */

public static int cuentaPalabras(String texto) {
    int cuenta = 0;//Es la cantidad de palabras contadas en todo el texto
    boolean enPalabra = false;
    for (int i = 0; i < texto.length(); i++) {//recorremos el texto en su longuitud de caracteres
        char c = texto.charAt(i);
        if (c == ' ' ) {
            // Si el carácter es un espacio en blanco, un tabulador, un salto de línea o un retorno de carro,
            // entonces estamos fuera de una palabra.
            enPalabra = false;
        } else if (!enPalabra) {
            // Si el carácter no es un espacio en blanco y no estábamos en una palabra,
            // entonces empezamos una nueva palabra.
            enPalabra = true;
            cuenta++;
        }
    }
    return cuenta;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   /** obtenerPalabra
    * recibe un texto y una posición y devuelve la palabra que está en dicha posición (las posiciones empiezan en 0).
    * @param texto es un String que contiene la cadena de texto inicial
    * @param posicion es un int que recoge la posicion de la cual quieres obtetener la palabra
    * @return palabra obtenida del array(nosotros escribimos la posicion de la palabra)
    */
    public static String obtenerPalabra(String texto, int posicion) {
        inicializar();
        String[] array = textoAArray(texto);
        
        String palabra = array[posicion];
        finalizar();
        return palabra;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** reduceEspacios
    * recibe un texto y devuelve ese mismo texto sin espacios por delante ni por detrás y entre palabra y palabra un solo * espacio.
    * @param texto es un String que contiene la cadena de texto inicial
    * @return Devuelve el texto sin espacios
    */
    public static String reduceEspacios(String texto) {
        String[] array = textoAArray(texto);
        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            resultado += array[i];
            if (i < array.length - 1) {
                resultado += " ";
            }
        }
        return resultado;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** invertirArray
    * recibe un array de palabras y devuelve otro array invertido.
    * @param texto es un String que contiene la cadena de texto inicial
    * @return un array invertido
    */
    public static String[] invertirArray(String[] array) {
        String[] invertido = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            invertido[j] = array[i];
        }
        return invertido;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** invertirPalabras
    * recibe un texto y devuelve ese mismo texto pero con las palabras leídas de derecha a izquierda.
    * @param texto es un String que contiene la cadena de texto inicial
    * @return la cadena de texto invertida
    */
    public static String invertirPalabras(String texto) {
        String invertido = "";
        int longitud = cuentaPalabras(texto);
        String[] palabra = textoAArray(texto);
        for (int i = longitud-1 ; i >= 0; i--) {
            invertido+= palabra[i]+" ";
        }
        return invertido;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** desordenaPalabras
    * recibe un texto y devuelve otro texto con la misma cantidad de palabras pero desordenadas.
    * @param texto es un String que contiene la cadena de texto inicial
    * @return la cadena de texto desordenada
    */
    public static String desordenaPalabras(String texto){
        String desorden="";
        String[] text = textoAArray(texto);
        String[] textAux = new String[text.length];
        for(int i=0; i<text.length; i++){
            textAux[i] = text[i];
        }
        int longitud=cuentaPalabras(texto);
        int pos;
        for(int i=0; i<longitud; i++){
            pos=(int)(Math.random()*longitud);
            while(textAux[pos] == null){//textAux[pos] == null en el bucle while se utiliza para asegurarse de que la palabra en la posición "pos" no se seleccione más de una vez. Si la palabra ya ha sido seleccionada (es decir, si su valor en el arreglo "textAux" es null), se elige otra posición aleatoria.
                pos=(int)(Math.random()*longitud);
            }
            desorden+=textAux[pos]+" ";
            textAux[pos] = null;//cuando se agrega la palabra desordenada al resultado, se establece el valor de la posición correspondiente en "textAux" a null, lo que garantiza que no se volverá a seleccionar en el futuro.
        }
        return desorden;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /** resumenTexto
    * recibe un texto y por cada palabra del mismo indica el número de veces que aparece en el texto.
    * @param texto es un String que contiene la cadena de texto inicial
    * @return las veces que aparece cada palabra en el texto
    */
    public static String resumenTexto(String texto) {
        String[] palabras = textoAArray(texto);
        String resumen = "";
        int conteo = 0;
        for (int i = 0; i < palabras.length ; i++) {
            conteo = 0;
            for (int j = 0; j < palabras.length; j++) {
                if(palabras[i].equals(palabras[j])){
                    conteo++;
                }
            }

            resumen += palabras[i] + " ("+ conteo +")\n";
        }
        return resumen;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
