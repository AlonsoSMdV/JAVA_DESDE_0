package Capitulo_06;

public class Ejercicio21 {
    public static void main(String[] args){
        int jugada=0;
        String caraCruz = "";
        String moneda = "";
        int cont = 5;
        for(int i=0;i<cont;i++){
            jugada =(int)((Math.random()*2)+1);
            switch((int)(Math.random() * 8)) {
                case 0:
                    moneda = "1 céntimo";
                    break;
                case 1:
                    moneda = "2 céntimos";
                    break;
                case 2:
                    moneda = "5 céntimos";
                    break;
                    case 3:
                    moneda = "10 céntimos";
                break;
                case 4:
                    moneda = "20 céntimos";
                    break;
                case 5:
                    moneda = "50 céntimos";
                    break;
                case 6:
                    moneda = "1 euro";
                    break;
                case 7:
                    moneda = "2 euros";
                    default:
                }
            switch(jugada){
                case 1:
                    caraCruz = "cara";
                    break;
                case 2:
                    caraCruz = "cruz";
            }
            System.out.println(moneda+" = "+caraCruz+"");
        }

    }
}