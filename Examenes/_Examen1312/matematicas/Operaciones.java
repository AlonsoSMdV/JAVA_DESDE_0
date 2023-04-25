package Examenes._Examen1312.matematicas;


public class Operaciones {
      /** suma
    * Devuelve la suma de dos números.
    * <p>
    * @param a Sumando primero
    * @param b Sumando segundo
    * @return  La suma de a y b
    */
    public static int suma(int a, int b){
        return a + b;
    }
   /** inc
    * Incrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a incrementar
    * @return  El valor recibido incrementado en uno
    */
    public static int inc(int a){
        return suma(a, 1);
    }
   /** resta
    * Devuelve la resta de dos números
    * <p>
    * @param a Minuendo
    * @param b Sustraendo
    * @return La resta de los dos números
    */
    public static int resta(int a, int b){
        return suma(a, -b);
    }
   /** dec
    * Decrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a decrementar
    * @return  El valor recibido decrementado en uno
    */
    public static int dec(int a){
        return resta(a,1);
    }
   /** esMayor
    * Comprueba si un número es mayor que otro
    * <p>
    * @param a Valor a comparar si es mayor
    * @param b Valor a comparar si es menor
    * @return  true si a es mayor que b y
    *          false si es igual o menor
    */
    public static boolean esMayor(int a, int b){
        return resta(a, b) > 0;
    }

   /** esMenor
    * Comprueba si un número es menor que otro
    * <p>
    * @param a Valor a comparar si es menor
    * @param b Valor a comparar si es mayor
    * @return  true si a es menor que b y
    *          false si es igual o mayor
    */
    public static boolean esMenor(int a, int b){
        return 0 > resta(a, b);
    }
   /** esIgual
    * Comprueba si un número es igual que otro
    * <p>
    * @param a Primer valor a comparar
    * @param b Segundo valor a comparar
    * @return  true si son iguales y false si son distintos
    */
    public static boolean esIgual(int a, int b){
        return !esMayor(a, b) && !esMenor(a, b);
    }
   /** multiplica
    * Devuelve la multiplicación de dos números usando sumas
    * <p>
    * @param a Multiplicando
    * @param b Multiplicador
    * @return  El resultado de sumar b veces a
    */
    public static int multiplica(int a, int b){
        if(esIgual(b, 0) || esIgual(a, 0)){
            return 0;
        }
        int auxA = a;
        int auxB = b;
        if(esMenor(a, 0)){
            auxA = -a;
        }
        if(esMenor(b, 0)){
            auxB = -b;
        }
        int res = 0;
        for(int i = 0;esMenor(i, auxB); i=inc(i)){
            res = suma(res,auxA);
        }
        return (esMenor(a, 0)&& esMayor(b, 0) || esMenor(b, 0)&& esMayor(a, 0) )?-res:res;
    }
   /** divide
    * Devuelve el cociente de la división entera de dos números usando restas
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el cociente de la división entera de a entre b
    *          realizando restas
    */
    public static int divide(int a, int b) throws ArithmeticException{
        if(esIgual(b, 0)){
            throw new ArithmeticException();
        }
        if(esIgual(a, 0)){
            return 0;
        }
        int auxA = a;
        int auxB = b;
        if(esMenor(a, 0)){
            auxA = -a;
        }
        if(esMenor(b, 0)){
            auxB = -b;
        }
        int cociente = 0;
        while(esMenor(auxB, auxA) || esIgual(auxB, auxA)){
            auxA = resta(auxA, auxB);
            cociente = inc(cociente);
        }
        return (esMenor(a, 0)&& esMayor(b, 0) || esMenor(b, 0)&& esMayor(a, 0) )?-cociente:cociente;

    }
   /** resto
    * Devuelve el resto de la división entera
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el resto de la división entera de a entre b
    */
    public static int resto(int a , int b) throws ArithmeticException{
        if(esIgual(b, 0)){
            throw new ArithmeticException();
        }
        if(esIgual(a, 0)){
            return 0;
        }
        int cociente = divide(a, b);
        int producto = multiplica(b, cociente);
        int resto = resta(a, producto);
        return resto;
    }
   /** potencia
    * Devuelve la potencia de un número elevado a otro
    * <p>
    * @param base      base
    * @param exponente exponente
    * @return          Devuelve la potencia de un número elevado a otro usando multiplicaciones
    */
    public static int potencia(int base, int exponente){
        if(esIgual(exponente, 0)){
            return 1;
        }
        int res = 1;
        for(int i = 0; esMenor(i, exponente);i = inc(i)){
            res = multiplica(res,base);
        }
        return res;
    }

   /** cuadrado
    * Devuelve la potencia de un número elevado a 2
    * <p>
    * @param a número a calcular su cuadrado
    * @return  Devuelve la potencia de un número elevado a 2
    */
    public static int cuadrado(int a) {
        return potencia(a, 2);
        
    }
   /** cubo
    * Devuelve la potencia de un número elevado a 3
    * <p>
    * @param a número a calcular su cubo
    * @return  Devuelve la potencia de un número elevado a 3
    */
    public static int cubo(int a) {
        return potencia(a, 3);
        
    }
   /** esMultiplo
    * Indica si un número es múltiplo de otro dado
    * <p>
    * @param a valor a comprobar si es múltiplo
    * @param b valor con el que comprobar si a es múltiplo de él
    * @return  true si a es múltiplo y false en caso contrario
    */
    public static boolean esMultiplo(int a, int b) {
        return esIgual(resto(a,b),0);
    }
   /** esDivisor
    * Indica si un número es divisor de otro dado
    * <p>
    * @param a valor a comprobar si es divisor
    * @param b valor con el que comprobar si a es divisor de él
    * @return  true si a es divisor y false en caso contrario
    */
    public static boolean esDivisor(int a, int b) {
        return esMultiplo(b, a);
    }
   /** esPrimo
    * Indica si un número es primo
    * <p>
    * @param a número a comprobar si es primo
    * @return  true si a es primo y false en caso contrario
    */
    public static boolean esPrimo(int a) {
        if(esMenor(a, 2)){
            return false;
        }
        int i = 2;
        int mitad = divide(a, 2);
        while(esMenor(i, mitad) || esIgual(i, mitad)){
            if(esDivisor(i, a)){
                return false;
            }
            i = inc(i);
            
        }
        return true;
    }
   /** esCuadradoPerfecto
    * Indica si un número es cuadrado perfecto
    * <p>
    * Un número es cuadrado perfecto si es el resultado del cuadrado de otro número
    * @param a número a comprobar si cuadrado perfecto
    * @return  true si a es cuadrado perfecto y false en caso contrario
    */
    public static boolean esCuadradoPerfecto(int a) {
        for (int i = 1; esMenor(i, a); i= inc(i)) {
            if(esIgual(cuadrado(i), a)){
                return true;
            }
        }
        return false;
    }
}
