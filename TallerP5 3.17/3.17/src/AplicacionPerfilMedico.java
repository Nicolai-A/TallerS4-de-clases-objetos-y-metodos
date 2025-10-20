import java.util.Scanner;

public class AplicacionPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Sexo (M/F): ");
        String sexo = entrada.nextLine();

        System.out.print("Día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Año de nacimiento: ");
        int anio = entrada.nextInt();

        System.out.print("Altura en cm: ");
        double altura = entrada.nextDouble();

        System.out.print("Peso en kg: ");
        double peso = entrada.nextDouble();

        // Crear objeto
        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Mostrar resultados
        System.out.println("\n--- Perfil Médico ---");
        System.out.println("Nombre completo: " + perfil.getNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" +
                perfil.getMesNacimiento() + "/" + perfil.getAnioNacimiento());
        System.out.println("Altura: " + perfil.getAlturaCm() + " cm");
        System.out.println("Peso: " + perfil.getPesoKg() + " kg");

        System.out.println("\n--- Resultados de Salud ---");
        System.out.println("Edad: " + perfil.calcularEdad() + " años");
        System.out.printf("BMI: %.2f (%s)\n", perfil.calcularBMI(), perfil.clasificacionBMI());
        System.out.println("Frecuencia cardíaca máxima: " + perfil.frecuenciaMaxima() + " pulsos por minuto");
        System.out.println("Rango de frecuencia esperada: " + perfil.frecuenciaEsperada());

        System.out.println("\n--- Tabla de valores del BMI ---");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        entrada.close();
    }
}