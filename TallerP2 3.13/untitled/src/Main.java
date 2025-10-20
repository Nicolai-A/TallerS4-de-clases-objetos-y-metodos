import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos*/
        Empleado empleado1 = new Empleado("", "", 0);
        Empleado empleado2 = new Empleado("", "", 0);

        /** Creacion de variable global*/

        double salario;
        Scanner sc = new Scanner(System.in);

        /** Creacion de inicio*/

        System.out.println("===================================");
        System.out.println("        ENTRANDO AL PROGRAMA       ");
        System.out.println("          PruebaEmpleado           ");
        System.out.println("===================================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===================================");
        System.out.println("             BIENVENIDO            ");
        System.out.println("===================================");
        System.out.println();


        /** Lectura de variable*/

        System.out.print("Ingrese el nombre: ");
        empleado1.setNombre(sc.nextLine());
        System.out.print("Ingrese el apellido: ");
        empleado1.setApellido(sc.nextLine());

        /** Validacion del salario sea positivo*/

        do {
            System.out.print("Ingrese el Salario Mensual: ");

            salario = empleado1.setSalarioM(Double.parseDouble(sc.next()));
            if (salario > 0) {
                /** Despliegue de valor salario anual*/
                System.out.println("El salario Anual es: " + empleado1.Sa_A(salario));

            } else {
                System.out.println("No puede ser negativo el salario mensual");

            }
            sc.nextLine();
        } while (salario <= 0);

        System.out.println();

        /** Lectura de variable*/

        System.out.print("Ingrese el nombre del empeleado 2: ");
        empleado2.setNombre(sc.nextLine());
        System.out.print("Ingrese el apellido del empeleado 2: ");
        empleado2.setApellido(sc.nextLine());

        /** Validacion del salario sea positivo*/

        do {
            System.out.print("Ingrese el Salario Mensual: ");

            salario = empleado2.setSalarioM(Double.parseDouble(sc.next()));
            if (salario > 0) {

                /** Despliegue de valor salario anual*/

                System.out.println("El salario Anual es: " + empleado2.Sa_A(salario));

            } else {
                System.out.println("No puede ser negativo el salario mensual");

            }
            sc.nextLine();

        } while (salario <= 0);

        /** Llamada de metodo detalle*/

        System.out.println();
        System.out.println("EMPLEADO 1");
        empleado1.detalle();
        System.out.println("EMPLEADO 2");
        empleado2.detalle();
    }
}
