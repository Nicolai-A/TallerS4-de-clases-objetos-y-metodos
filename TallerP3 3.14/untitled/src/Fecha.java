public class Fecha {
    /** Creacion de los atributos */
    private int dia;
    private int mes;
    private int anios;
    /** Creacion del contructor */
    public Fecha(int dia, int mes, int anios) {
        this.dia = dia;
        this.mes = mes;
        this.anios = anios;
    }

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anios = 2025;
    }

    /** Creacion de los getters and setters */

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    /** Creacion de los metodos */

    public void mostrarFecha(){
        System.out.println(" LA FECHA ES:");
        System.out.print("Día: " + this.getDia());
        System.out.print(" / ");
        System.out.print("Mes: " + this.getMes());
        System.out.print(" / ");
        System.out.print("Años: " + this.getAnios());
    }
}
