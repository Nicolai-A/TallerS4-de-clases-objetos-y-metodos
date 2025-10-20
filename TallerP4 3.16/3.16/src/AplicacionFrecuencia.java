import java.util.Scanner;

public class AplicacionFrecuencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su día de nacimiento (1-31): ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento (e.g. 1990): ");
        int anio = entrada.nextInt();

        // Crear objeto
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre completo: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getDiaNacimiento() + "/" +
                persona.getMesNacimiento() + "/" + persona.getAnioNacimiento());
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia cardíaca máxima: " + persona.frecuenciaMaxima() + " pulsos por minuto");
        System.out.println("Rango de frecuencia esperada: " + persona.frecuenciaEsperada());

        entrada.close();
    }
}