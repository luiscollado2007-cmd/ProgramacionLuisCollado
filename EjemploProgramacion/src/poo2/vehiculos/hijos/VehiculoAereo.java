package poo2.vehiculos.hijos;

import poo2.vehiculos.padre.Vehiculo;

public class VehiculoAereo extends Vehiculo {
    protected int numAsientos;

    public VehiculoAereo(String matricula, String modelo, int numAsientos) {
        super(matricula, "RTYG307956");
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo aéreo, con matrícula " + matricula + " ,con modelo " + modelo + " y " + numAsientos + " asientos");
    }
}
