package Examenes.Examen_Condicionales;

import java.util.Scanner;

public class Examen_Condicionales extends Object {
    static Scanner sc;//como lo declaramos aqui el mismo Scanner va a servirnos para todos

    protected static void inicializar() throws Exception{//Iniciar Scanner
        sc = new Scanner(System.in);
    }

    protected static void finalizar() throws Exception{//Fin Scanner
        if(sc != null){
            sc.close();
        }
    }
    protected static int menuPrincipal() throws Exception{//Menu principal que vamos a implementar 
        int ret = -1;
        System.out.println("Introduzca el tipo de producto: ");
        System.out.println("1. Alimentación");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia");
        System.out.println("4. Moda");
        System.out.print("Opción: ");
        ret = Integer.parseInt(sc.nextLine());
        return ret;
    }

    protected static int menuAlimentacion() throws Exception{//Menu Alimentacion

        System.out.println("Introduzca el tipo de alimento:");
        System.out.println("1. Huevos");
        System.out.println("2. Leche");
        System.out.println("3. Pan");
        System.out.println("4. Fruta");
        System.out.println("5. Verdura");
        System.out.println("6. Otros");
        System.out.print("Opción: ");
        return Integer.parseInt(sc.nextLine());

    }
    //Factura
    protected static void imprimirTicket(int opcion, int iva, int descuento, String nombre, int cantidad, double precio) throws Exception{
        System.out.println("Factura");
        System.out.println("________________________________________");
        System.out.printf("Articulo %31s\n",nombre);        
        System.out.printf("Precio %24.2f $/unidad\n",precio);
        System.out.printf("Cantidad %31d\n",cantidad);
        System.out.printf("Total %33.2f$\n",precio*cantidad);
        double dto = 0;
        if(opcion == 2){
            dto = (-1)*(((double)descuento/100)*precio*cantidad);
            System.out.printf("Descuento (20%%) %23.2f$\n",dto);
        }
        if(opcion == 4 && cantidad >= 3){
            dto = (-1)*cantidad/3*precio;
            System.out.printf("Descuento (3X2) %23.2f$\n",dto);
        }
        if(dto > 0){

            System.out.printf("Total con descuento %20.2f$\n",-dto);
        }
        double total = precio * cantidad - dto;
        double parteIVA = total * ((double)iva/100);
        total = total +parteIVA;
        System.out.printf("IVA al %d%% %"+((iva>4)?28:27)+".2f$\n",iva,parteIVA);
        System.out.printf("Total con IVA %25.2f$\n",total);
        System.out.println("________________________________________");
    }
    public static void main(String[] args) throws Exception{
        int opcion = -1;
        try {
            int iva = 21;
            int descuento = 0;
        inicializar();
        opcion = menuPrincipal();
        switch(opcion){
            case 1:
            {   
                int opcionAlimentacion = menuAlimentacion();
                switch(opcionAlimentacion){
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4:
                    case 5: 
                        iva = 4;
                        break;
                    default: 
                        iva = 10;
                }
                break;
            }
            case 2:
                descuento = 20;
                break;
            case 3:
                iva = 4;
                break;
            case 4:
                break;
        }
        System.out.print("Introduzca el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca la cantidad del producto: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el precio por unidad del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        imprimirTicket(opcion, iva, descuento, nombre, cantidad, precio);
        System.out.print("Gracias por usar la App");
        } catch(Exception e){
            System.out.print("Ha ocurrido un error");
        }
        finalizar();
    }
}
