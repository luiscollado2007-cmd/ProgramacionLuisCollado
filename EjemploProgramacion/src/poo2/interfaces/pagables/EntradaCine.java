package poo2.interfaces.pagables;

/**
 * la entrada de cine es un elemento pagable
 * el importe de una entrada de cine se calcula con el precio base,
 * y si es 3D, se le añade 2.5€
 * si es diaDelEspectador, se multiplica el precio por 0.80
 *
 * La generación de ticket DEVUELVE toda la información
 */
public class EntradaCine implements Pagable, Imprimible{

    private String pelicula;
    private int sala;
    private double precioBase;
    private boolean es3D;
    private boolean esDiaEspectador;

    public EntradaCine(String pelicula, int sala, double precioBase, boolean es3D, boolean esDiaEspectador) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioBase = precioBase;
        this.es3D = es3D;
        this.esDiaEspectador = esDiaEspectador;
    }

    public String getPelicula() {
        return pelicula;
    }

    public int getSala() {
        return sala;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public boolean isEsDiaEspectador() {
        return esDiaEspectador;
    }

    @Override
    public double calcularImporte() {
        if (es3D){
            return precioBase + 2.5;
        } else if (esDiaEspectador) {
            return precioBase * 0.80;
        }else{
            return precioBase;
        }
    }

    @Override
    public String toString() {
        return "EntradaCine{" +
                "pelicula='" + pelicula + '\'' +
                ", sala=" + sala +
                ", precioBase=" + precioBase +
                ", es3D=" + es3D +
                ", esDiaEspectador=" + esDiaEspectador +
                '}';
    }

    @Override
    public String generarTicket() {
        return "ENTRADA DE CINE -> Película: " + pelicula + " sala: " + sala + " ¿3D?: " + (es3D ? "SI" : "NO") + " ¿es Día del espectador? " +
                (esDiaEspectador ? "SI" : "NO") + " | TOTAL: " + calcularImporte();
    }

    @Override
    public void imprimir() {
        System.out.println(generarTicket());
    }
}
