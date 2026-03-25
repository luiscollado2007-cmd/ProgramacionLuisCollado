package poo2.interfaces.pagables;

public class Caja {
    public static void main(String[] args) {

        Pagable[] carrito = new Pagable[4];
        carrito[0] = new Factura(100,0.21);
        carrito[1] = new Suscripcion(9.99,3);
        carrito[2] = new EntradaCine("Cenicienta",3,22.99,false,true);
        carrito[3] = new FacturaProforma(200,0.21,"G231231231");

        double total = 0;
        for (int cont = 0; cont < carrito.length; cont++) {
            Pagable pagable = carrito[cont];
            total += pagable.calcularImporte();

            if (pagable instanceof Imprimible){
                Imprimible imprimible = (Imprimible) pagable;
                imprimible.imprimir();
            }
        }

        System.out.println("TOTAL CARRITO: " + total);
    }
}
