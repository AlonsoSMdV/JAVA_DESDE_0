package Capitulo_06;

public class Ejercicio15 {
    public static void main(String[] args){
        int notas = 4*(int)((Math.random()*7)+1);
        String nota = "";
        String nota1 = "";
        for(int contN=1;contN <=notas;contN++){
            switch((int)((Math.random()*7)+1)){
                case 1:
                nota = "do";
                break;
                case 2:
                nota = "re";
                break;
                case 3:
                nota = "mi";
                break;
                case 4:
                nota = "fa";
                break;
                case 5:
                nota = "sol";
                break;
                case 6:
                nota = "la";
                break;
                case 7:
                nota = "si";
                break;
                default:
            }
            if(contN == 1){
                nota1 = nota;
            }
            if(contN == notas){
                nota = nota1;
            }
            System.out.print(nota+" ");
            if(contN == notas){
                System.out.print("||");
            }else if(contN % 4 == 0){
                System.out.print("| ");
            }
        }
    }
}