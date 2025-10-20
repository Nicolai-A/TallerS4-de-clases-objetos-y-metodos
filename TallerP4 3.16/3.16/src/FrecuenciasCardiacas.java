import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {

        private String nombre;
        private String apellido;
        private int diaNacimiento;
        private int mesNacimiento;
        private int anioNacimiento;

        // Constructor
        public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.diaNacimiento = dia;
            this.mesNacimiento = mes;
            this.anioNacimiento = anio;
        }

        // Métodos establecer (setters)
        public void setNombre(String nombre) { this.nombre = nombre; }
        public void setApellido(String apellido) { this.apellido = apellido; }
        public void setDiaNacimiento(int dia) { this.diaNacimiento = dia; }
        public void setMesNacimiento(int mes) { this.mesNacimiento = mes; }
        public void setAnioNacimiento(int anio) { this.anioNacimiento = anio; }

        // Métodos obtener (getters)
        public String getNombre() { return nombre; }
        public String getApellido() { return apellido; }
        public int getDiaNacimiento() { return diaNacimiento; }
        public int getMesNacimiento() { return mesNacimiento; }
        public int getAnioNacimiento() { return anioNacimiento; }

        // Calcular edad
        public int calcularEdad() {
            LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
            LocalDate hoy = LocalDate.now();
            return Period.between(fechaNacimiento, hoy).getYears();
        }

        // Calcular frecuencia cardíaca máxima
        public int frecuenciaMaxima() {
            return 220 - calcularEdad();
        }

        // Calcular rango de frecuencia esperada (50% - 85%)
        public String frecuenciaEsperada() {
            int maxima = frecuenciaMaxima();
            int minimo = (int)(maxima * 0.50);
            int maximo = (int)(maxima * 0.85);
            return minimo + " - " + maximo + " pulsos por minuto";
        }

}
