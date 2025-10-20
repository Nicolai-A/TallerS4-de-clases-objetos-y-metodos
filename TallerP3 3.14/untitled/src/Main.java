import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        /** Creacion del objeto */
        Fecha PruebaFecha = new Fecha();
        /** Creacion de las variables globales */
        int dia;
        int mes;
        int anio;
        /** Creacion de la validacion de dia mes años */
        do {
            /** lectura de las variables */
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Día"));
            /** Creacion de la validacion */
            if (dia >= 1 && dia <= 31) {
                PruebaFecha.setDia(dia);
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentar");
            }
        } while (!(dia >= 1 && dia <= 31));

        do {
            /** lectura de las variables */
            mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes"));
            if (mes >= 1 && mes <= 12) {
                /** Creacion de la validacion */
                PruebaFecha.setMes(mes);
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentar");
            }
        } while (!(mes >= 1 && mes <= 12));
        do {
            /** lectura de las variables */
            anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año"));
            if (anio >= 1000 && anio <= 9999) {
                /** Creacion de la validacion */
                PruebaFecha.setAnios(anio);
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentar");
            }
        } while (!(anio >= 1000 && anio <= 9999));

        PruebaFecha.mostrarFecha();

    }
}