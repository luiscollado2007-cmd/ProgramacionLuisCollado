package poo2.vehiculos.hijos;

import poo2.vehiculos.padre.Vehiculo;

public class VehiculoTerrestre extends Vehiculo {
    protected int numRuedas;

    public VehiculoTerrestre(String matricula, String modelo, int numRuedas) {
        super(matricula, "5555OPI");
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo terrestre, con matrícula " + matricula + " ,con modelo " + modelo + " y " + numRuedas + " ruedas");
    }
}
