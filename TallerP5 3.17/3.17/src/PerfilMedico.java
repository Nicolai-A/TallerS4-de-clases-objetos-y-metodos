import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaCm;
    private double pesoKg;

    // Constructor
    public PerfilMedico(String nombre, String apellido, String sexo,
                        int dia, int mes, int anio, double alturaCm, double pesoKg) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
        this.alturaCm = alturaCm;
        this.pesoKg = pesoKg;
    }

    // Métodos establecer (setters)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public void setDiaNacimiento(int dia) { this.diaNacimiento = dia; }
    public void setMesNacimiento(int mes) { this.mesNacimiento = mes; }
    public void setAnioNacimiento(int anio) { this.anioNacimiento = anio; }
    public void setAlturaCm(double alturaCm) { this.alturaCm = alturaCm; }
    public void setPesoKg(double pesoKg) { this.pesoKg = pesoKg; }

    // Métodos obtener (getters)
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getSexo() { return sexo; }
    public int getDiaNacimiento() { return diaNacimiento; }
    public int getMesNacimiento() { return mesNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }
    public double getAlturaCm() { return alturaCm; }
    public double getPesoKg() { return pesoKg; }

    // Calcular edad
    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate hoy = LocalDate.now();
        return Period.between(nacimiento, hoy).getYears();
    }

    // Calcular frecuencia cardíaca máxima
    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Calcular rango de frecuencia esperada
    public String frecuenciaEsperada() {
        int maxima = frecuenciaMaxima();
        int minimo = (int)(maxima * 0.50);
        int maximo = (int)(maxima * 0.85);
        return minimo + " - " + maximo + " pulsos por minuto";
    }

    // Calcular índice de masa corporal (BMI)
    public double calcularBMI() {
        double alturaMetros = alturaCm / 100.0;
        return pesoKg / (alturaMetros * alturaMetros);
    }

    // Clasificación del BMI
    public String clasificacionBMI() {
        double bmi = calcularBMI();
        if (bmi < 18.5) return "Bajo peso";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Sobrepeso";
        else return "Obeso";
    }
}