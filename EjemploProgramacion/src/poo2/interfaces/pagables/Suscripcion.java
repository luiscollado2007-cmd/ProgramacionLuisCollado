package poo2.interfaces.pagables;

public class Suscripcion implements Pagable {

    private double precioMensaual;
    private int meses;

    public Suscripcion(double precioMensaual, int meses) {
        this.precioMensaual = precioMensaual;
        this.meses = meses;
    }

    public double getPrecioMensaual() {
        return precioMensaual;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "precioMensaual=" + precioMensaual +
                ", meses=" + meses +
                '}';
    }

    @Override
    public double calcularImporte() {
        return precioMensaual * meses;
    }

    @Override
    public String generarTicket() {
        return "SUSCRIPCIÓN -> Meses: " + meses + ", precio mensual: " + precioMensaual + " | TOTAL: " + calcularImporte();
    }
}
