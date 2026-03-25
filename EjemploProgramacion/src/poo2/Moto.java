package poo2;

public class Moto extends Vehiculo {

     private boolean compartimentoCasco;

    public Moto(String marca, String modelo, int numRuedas, boolean compartimentoCasco) {
        super(marca, modelo, numRuedas);
        this.compartimentoCasco = compartimentoCasco;
    }

    public boolean isCompartimentoCasco() {
        return compartimentoCasco;
    }

    public void setCompartimentoCasco(boolean compartimentoCasco) {
        this.compartimentoCasco = compartimentoCasco;
    }
}
