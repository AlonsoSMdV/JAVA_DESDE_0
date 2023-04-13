package Ejercicio_Maestro;
import java.util.Scanner;
public class Secuencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una opcion(1, 2, 3, 4, 5): ");
        int n = Integer.parseInt(sc.nextLine());
        switch(n){
            case 1:
                Secuencia1();
                break;
            case 2:
                Secuencia2();
                break;
            case 3:
            
                System.out.print("Introduce el numero desde el cual desees que empieze el factorial: ");
                int numFacto = Integer.parseInt(sc.nextLine());
                System.out.print("Introduce cuantos numeros deseas que se hagan: ");
                int nLimite = Integer.parseInt(sc.nextLine());
                for(int i = numFacto; i <= numFacto+nLimite; i++){
                    System.out.print(i+"!= "+Secuencia3(i));
                    System.out.println();
                }
                break;
            case 4:
                Secuencia4();
                break;
            case 5:
                Secuencia5();
                break;
    
        }

        sc.close();
    }

    public static void Secuencia1(){
        int inicio = 1;
        for (int i = 0; i <  5; i++) {
            int siguiente = inicio + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print(inicio+" ");
            for (int j = 1; j < 4; j++) {
                System.out.print(siguiente+" ");
                siguiente++;
            }
            inicio++;
            System.out.println();
        }
    }
    public static void Secuencia2(){

        /*
         * 1 2 3 4 5 6
         * 2 3 4 5 6 1
         * 3 4 5 6 1 2
         * 4 5 6 1 2 3 
         * 5 6 1 2 3 4 
         * 6 1 2 3 4 5
         */ 
        int n = 6;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {//Pinta desde i (Cada iteracion es uno mas )hasta 6
                System.out.print(j+" ");
            }
          
            
            for(int k = 1; k < i ; k++){//Pinta desde 1 hasta i
                System.out.print(k+" ");
            }
            System.out.println();
        } 
    }
    public static long Secuencia3(int n){//Factorial
        
        long factorial =1;
        for (int j = 1; j <= n; j++) {
                factorial *= j;
        }
            System.out.println();
            return factorial;
    }
    
 
        
    
    public static void Secuencia4(){//Pirámide de letras invertida(de la Z hasta la A)
        char letras;
        int espacios = 0;
        for (letras = 90; letras>=65 ; letras--) {
            for (char i = letras; i >= 65; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
            for (int i = 0; i <= espacios; i++) {
                System.out.print("  ");
            }
            espacios++;
        }

    }

    public static void Secuencia5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce hasta que numero deseas que llegue la piramide: ");
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;
        int fin = 0;
        for (int i = 1; i <= n; i++) {
            
            for(int j = 1;j <= i; j++){
                System.out.printf("%2d ",num);
                num++;
                if(num == n+1){
                    fin=1;
                    break;
                }
            }
            System.out.println();
            if(fin==1){
                break;
            }
        }
        
        sc.close();
    }


}
