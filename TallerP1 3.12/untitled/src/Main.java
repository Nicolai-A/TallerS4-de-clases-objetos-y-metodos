import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos*/

        Factura tornillosMadera = new Factura("N001", "Para madera aglomerada", 500, 0.07);
        Factura tuercas = new Factura("N002", "Tuercas", 300, 0.05);
        Factura tuberiasPVC = new Factura("N003", "Tuberias PVC", 200, 1.20);
        Factura abrasivos = new Factura("N004", "Abrasivos", 100, 3.50);

        Scanner sc = new Scanner(System.in);

        int opc = 0;
        int unidades = 0;
        double valor = 0;

        /** Despliegue de la introduccion al programa */

        System.out.println("=========  SHOP  =========");
        System.out.println("BIENVENIDO A LA FERRETERIA");
        System.out.println("==========================");


        do {
            System.out.println("======== MENU ========");
            System.out.println("1. TORNILLOS DE MADERA");
            System.out.println("2. TUERCAS");
            System.out.println("3. TUBERIA PVC");
            System.out.println("4. ABRASIVOS");
            System.out.println("5. SALIR DEL PROGRAMA");
            System.out.print(" >>");
            /** Lectura de la variable opc*/
            opc = sc.nextInt();
            System.out.println("======================");

            switch (opc) {

                case 1:
                    /** Lectura de las variables*/
                    System.out.print("Ingrese la cantidad de tornillos que desea: ");
                    unidades = sc.nextInt();

                    valor = tornillosMadera.obtenerMontoFactura(unidades);
                    /** despliegue del metodo*/
                    if (tornillosMadera.restarCantidad(unidades)){
                        tornillosMadera.detalle(unidades, valor);
                    }

                    break;
                case 2:
                    /** Lectura de las variables*/
                    System.out.print("Ingrese la cantidad de tuercas que desea: ");
                    unidades = sc.nextInt();

                    valor = tuercas.obtenerMontoFactura(unidades);
                    /** despliegue del metodo*/
                    if (tuercas.restarCantidad(unidades)){
                        tuercas.detalle(unidades, valor);
                    }

                    break;
                case 3:
                    /** Lectura de las variables*/
                    System.out.print("Ingrese la cantidad de tuberias PVC que desea: ");
                    unidades = sc.nextInt();

                    valor = tuberiasPVC.obtenerMontoFactura(unidades);
                    /** despliegue del metodo*/
                    if (tuberiasPVC.restarCantidad(unidades)){
                        tuberiasPVC.detalle(unidades, valor);
                    }

                    break;
                case 4:
                    /** Lectura de las variables*/
                    System.out.print("Ingrese la cantidad de Abrasivos que desea: ");
                    unidades = sc.nextInt();

                    valor = abrasivos.obtenerMontoFactura(unidades);
                    /** despliegue del metodo*/
                    if (abrasivos.restarCantidad(unidades)){
                        abrasivos.detalle(unidades, valor);
                    }

                    break;
                default:
                    System.out.println("saliendo del programa...");
            }
        } while (opc != 5);


    }
}