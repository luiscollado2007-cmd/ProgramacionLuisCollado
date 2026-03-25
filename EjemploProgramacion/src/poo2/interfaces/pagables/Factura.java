package poo2.interfaces.pagables;

public class Factura implements Pagable,Imprimible{

    private double base;
    private final double iva;

    public Factura(double base, double iva) {
        this.base = base;
        this.iva = iva;
    }

    public double getBase() {
        return base;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "base=" + base +
                ", iva=" + iva +
                '}';
    }

    @Override
    public double calcularImporte() {
        return base * (1 + iva);
    }

    @Override
    public String generarTicket() {
        return "FACTURA -> Base: " + base + " | IVA: " + (iva * 100) + "% | TOTAL: " + calcularImporte();
    }

    @Override
    public void imprimir() {
        System.out.println(generarTicket());
    }
}
