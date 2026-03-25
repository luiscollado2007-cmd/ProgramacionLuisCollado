package poo2.vehiculos.nietos;

import poo2.vehiculos.hijos.VehiculoAereo;

public class VehiculoHelicoptero extends VehiculoAereo {
    private int numHelices;

    public VehiculoHelicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    @Override
    public void imprimir() {
        System.out.println("Helicóptero cuyo vehículo pertenece a los vehículos aéreos, tiene " + numHelices + " hélices");
    }
}
