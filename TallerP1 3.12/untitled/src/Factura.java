public class Factura {
    /** Creacion de los atributos*/
    private String n_pieza;
    private String d_pieza;
    private int cantidad;
    private double precio;

    /** Creacion de los constructores*/
    public Factura(String n_pieza, String d_pieza, int cantidad, double precio) {
        this.n_pieza = n_pieza;
        this.d_pieza = d_pieza;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    /** Creacion de getter and setter*/
    public String getN_pieza() {
        return n_pieza;
    }

    public void setN_pieza(String n_pieza) {
        this.n_pieza = n_pieza;
    }

    public String getD_pieza() {
        return d_pieza;
    }

    public void setD_pieza(String d_pieza) {
        this.d_pieza = d_pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /** Creacion de los metodos*/
    public double obtenerMontoFactura(int unidades){
        double totalPagar;
        totalPagar= unidades * precio;
        if(totalPagar < 0){
            totalPagar = 0;
        }
        return totalPagar;
    }

    public boolean restarCantidad(int unidades){
        boolean estado = false;
        if(cantidad >= unidades){
            cantidad -= unidades;
            estado = true;
        }else{
            System.out.println("No hay mas unidades disponibles.");
        }
        return estado;
    }

    public void detalle(int unidades, double valor){
            System.out.println("========== FACTURA ===========");
            System.out.println("#Producto: "  + this.getN_pieza());
            System.out.println("Descripcion: "+ this.getD_pieza());
            System.out.println("Cantidad: "   + unidades);
            System.out.format("Total a pagar: %,.2f\n\n " , valor);
            System.out.println("==============================");
    }
}
