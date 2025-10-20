public class Empleado {
    /**
     * Creacion de los atributos
     */
    private String nombre;
    private String apellido;
    private double salarioM = 0;

    /**
     * Creacion de constructor
     */

    public Empleado(String nombre, String apellido, double salarioM) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioM = salarioM;
    }

    /**
     * Creacion de getter and setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioM() {
        return salarioM;
    }

    public double setSalarioM(double salarioM) {
        this.salarioM = salarioM;
        return salarioM;
    }

    /**
     * Creacion de metodos
     */
    public double Sa_A(double salario) {
        double SalarioAumentado;
        double SA;
        SalarioAumentado = salario * 0.10;
        SA = (salario * 12) + SalarioAumentado;
        return SA;
    }

    public void detalle() {
        /** Desplegue  valores*/
        System.out.println("=============================");
        System.out.println("   INFORMACION DEL EMPLEADO  ");
        System.out.println("NOMBRE: " + this.getNombre());
        System.out.println("APELLIDO: " + this.getApellido());
        System.out.println("SALARIO ANUAL: " + this.Sa_A(getSalarioM()));
        System.out.println("=============================");
    }
}
