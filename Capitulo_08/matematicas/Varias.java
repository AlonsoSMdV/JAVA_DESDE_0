package Capitulo_08.matematicas;

public class Varias {
    /**
     * Ejercicio 1
    * Devuelve verdadero si el número que se pasa como parámetro es capicúo y
    falso en caso contrario.
    * Un número capicúo es el que se lee igual de izquierda a derecha que de
    * derecha a izquierda.
    */
    public static boolean esCapicua(long x) {
        return x == voltea(x);
    }
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es capicúo y
    * falso en caso contrario.
    * Un número capicúo es el que se lee igual de izquierda a derecha que de
    * derecha a izquierda.
    */
    public static boolean esCapicua(int x) {
        return esCapicua((long)x);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 2
    * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
    * en caso contrario.
    * Un número primo es un número natural mayor que 1 y divisible únicamente
    * entre el mismo y entre 1.
    */
    public static Boolean esPrimo(long n) {
        if (n < 2) {
            return false;
        } else {
            for (long i = n / 2; i >= 2; i--) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
    * en caso contrario.
    * Un número primo es un número natural mayor que 1 y divisible únicamente
    * entre el mismo y entre 1.
    */
    public static Boolean esPrimo(int n) {
    return esPrimo((long) n);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 3
    * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    */
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {};
        return x;
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 4
    * Dada una base y un exponente, devuelve la potencia.
    */
    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1/potencia(base, -exponente);
        }
        int n = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            n = n * base;
        }
        return n;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 5
    * Cuenta el número de dígitos de un número entero.
    */
    public static int digitos(long x) {
        if (x < 0) {
            x = -x;
        }
        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10; // se le quita un dígito a x
                n++; // incrementa la cuenta de dígitos
            }
            return n;
        }
    }
    
    /**
    * Cuenta el número de dígitos de un número entero.
    */
    public static int digitos(int x) {
        return digitos((long)x);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 6
    * Le da la vuelta a un número.
    */
    public static long voltea(long x) {
        if (x < 0) {
            return -voltea(-x);
        }
        long volteado = 0;
        while(x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
        }
        return volteado;
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
    * Le da la vuelta a un número.
    */
    public static int voltea(int x) {
        return (int)voltea((long)x);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 7
    /* Devuelve el dígito que está en la posición <code>n</code> de un número
    * entero. Se empieza contando por el 0 y de izquierda a derecha.
    */
    public static int digitoN(long x, int n) {
        x = voltea(x);
        while (n-- > 0) {
            x = x / 10;
        }
        return (int)x % 10;
    }
    /**
    /* Devuelve el dígito que está en la posición n de un número entero. Se
    * empieza contando por el 0 y de izquierda a derecha.
    */
    public static int digitoN(int x, int n) {
        return digitoN((long)x, n);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 8
    * Da la posición de la primera ocurrencia de un dígito dentro de un número
    * entero. Si no se encuentra, devuelve -1.
    */
    public static int posicionDeDigito(long x, int d) {
        int i;
        for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
            if (i == digitos(x)) {
                return -1;
            } else {
                return i;
            }
    }
    /**
    * Da la posición de la primera ocurrencia de un dígito dentro de un número
    * entero. Si no se encuentra, devuelve -1.
    */
    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long)x, d);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 9
    * Le quita a un número <code>n</code> dígitos por detrás (por la derecha).
    */
    public static long quitaPorDetras(long x, int n) {
        return x / (long)potencia(10, n);
    }
    /**
    * Le quita a un número <code>n</code> dígitos por detrás (por la derecha).
    */
    public static int quitaPorDetras(int x, int n) {
        return (int)quitaPorDetras((long) x, n);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 10
    * Le quita a un número <code>n</code> dígitos por delante (por la izquierda).
    */
    public static long quitaPorDelante(long x, int n) {
        x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
        x = voltea(quitaPorDetras(voltea(x), n));
        x = quitaPorDetras(x, 1);
        return x;
    }
    
    /**
    * Le quita a un número <code>n</code> dígitos por delante (por la izquierda). 
    */
    public static int quitaPorDelante(int x, int n) {
        return (int)quitaPorDelante((long)x, n);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 11
    * Añade un dígito a un número por detrás (por la derecha).
    */
    public static long pegaPorDetras(long x, int d) {
        return juntaNumeros(x, d);
    }
    /**
    * Añade un dígito a un número por detrás (por la derecha).
    */
    public static int pegaPorDetras(int x, int d) {
        return (int)pegaPorDetras((long)x, d);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     Ejercicio 12
    * Añade un dígito a un número por delante (por la izquierda).
    */
    public static long pegaPorDelante(long x, int d) {
        return juntaNumeros(d, x);
    }
    /**
    * Añade un dígito a un número por delante (por la izquierda).
    */
    public static int pegaPorDelante(int x, int d) {
        return (int)pegaPorDelante((long)x, d);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Ejercicio 13
    * Toma como parámetros las posiciones inicial y final dentro de un número y
    * devuelve el trozo correspondiente.
    * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
    */
    public static long trozoDeNumero(long x, int inicio, int fin) {
        int longitud = digitos(x);
        x = quitaPorDelante(x, inicio);
        x = quitaPorDetras(x, longitud - fin - 1);
        return x;
    }
    /**
    * Toma como parámetros las posiciones inicial y final dentro de un número y
    * devuelve el trozo correspondiente.
    * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
    */
    public static int trozoDeNumero(int x, int inicio, int fin) {
        return (int)trozoDeNumero((long)x, inicio, fin);
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Ejercicio 14
    * Pega dos números para formar uno solo.
    */
    public static long juntaNumeros(long x, long y) {
        return (long)(x * potencia(10, digitos(y))) + y;
    }
    /**
    * Pega dos números para formar uno solo.
    */
    public static int juntaNumeros(int x, int y) {
        return (int)(juntaNumeros((long)x, (long)y));
    }
    
}
