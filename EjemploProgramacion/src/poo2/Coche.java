package poo2;

public class Coche extends Vehiculo {

    private int numPuertas;


    public Coche(String marca, String modelo, int numRuedas, int numPuertas) {
        super(marca, modelo, numRuedas);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
