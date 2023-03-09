package Capitulo_06;

import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Primavera \n2. Verano \n3. Otoño \n4. Invierno \nSeleccione la estación del año (1-4): ");
        int Estacion = sc.nextInt();

        int minTemp;
        int maxTemp;
        String cielo = "";
        switch(Estacion){
            case 1:
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                minTemp = (int)(Math.random()*16)+15;
                maxTemp = (int)(Math.random()*16)+15;
                if(minTemp > maxTemp){
                    int aux = minTemp;
                    minTemp = maxTemp;
                    maxTemp = aux;
                }
                System.out.println("Temperatura mínima: "+minTemp);
                System.out.println("Temperatura máxima: "+maxTemp);
                cielo = Math.random() <= 0.6?"Soleado" : "Nublado";
                System.out.print(cielo);
                break;
            case 2:
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                minTemp = (int)(Math.random()*26)+20;
                maxTemp = (int)(Math.random()*26)+20;
                if(minTemp > maxTemp){
                    int aux = minTemp;
                    minTemp = maxTemp;
                    maxTemp = aux;
                }
                System.out.println("Temperatura mínima: "+minTemp);
                System.out.println("Temperatura máxima: "+maxTemp);
                cielo = Math.random() <= 0.8?"Soleado" : "Nublado";
                System.out.print(cielo);
                break;
            case 3:
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                minTemp = (int)(Math.random()*21)+10;
                maxTemp = (int)(Math.random()*21)+10;
                if(minTemp > maxTemp){
                    int aux = minTemp;
                    minTemp = maxTemp;
                    maxTemp = aux;
                }
                System.out.println("Temperatura mínima: "+minTemp);
                System.out.println("Temperatura máxima: "+maxTemp);
                cielo = Math.random() <= 0.4?"Soleado" : "Nublado";
                System.out.print(cielo);
                break;
            case 4:
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                minTemp = (int)(Math.random()*26);
                maxTemp = (int)(Math.random()*26);
                if(minTemp > maxTemp){
                    int aux = minTemp;
                    minTemp = maxTemp;
                    maxTemp = aux;
                }
                System.out.println("Temperatura mínima: "+minTemp);
                System.out.println("Temperatura máxima: "+maxTemp);
                cielo = Math.random() <= 0.2?"Soleado" : "Nublado";
                System.out.print(cielo);
                break;
        }
        sc.close();
    }
}
