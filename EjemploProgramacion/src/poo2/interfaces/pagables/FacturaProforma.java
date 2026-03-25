package poo2.interfaces.pagables;

public class FacturaProforma extends Factura{

    private String cifCliente;

    public FacturaProforma(double base, double iva, String cifCliente) {
        super(base, iva);
        this.cifCliente = cifCliente;
    }


    @Override
    public void imprimir() {
        System.out.println("FACTURA PROFROMA: ");
        System.out.println("CIF DEL CLIENTE: " + cifCliente);
        super.imprimir();
    }
}
