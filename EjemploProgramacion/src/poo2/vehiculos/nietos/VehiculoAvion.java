package poo2.vehiculos.nietos;

import poo2.vehiculos.hijos.VehiculoAereo;

public class VehiculoAvion extends VehiculoAereo {
    private double tiempoMax;

    public VehiculoAvion(String matricula, String modelo, int numAsientos, double tiempoMax) {
        super(matricula, modelo, numAsientos);
        this.tiempoMax = tiempoMax;
    }

    public double getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(double tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    @Override
    public void imprimir() {
        System.out.println("Avión, cuyo vehículo pertenece a los vehículos aéreos y su tiempo máx es: " + tiempoMax);
    }
}
