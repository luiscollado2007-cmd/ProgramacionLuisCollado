package poo2.vehiculos.nietos;

import poo2.vehiculos.hijos.VehiculoTerrestre;

public class VehiculoCoche extends VehiculoTerrestre {
    private boolean tieneAireAcondicionado;

    public VehiculoCoche(String matricula, String modelo, int numRuedas, boolean tieneAireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public void imprimir() {
        System.out.println("Coche cuyo vehículo pertenece a los vehículos terrestres, tiene aire acondicionado? " + (tieneAireAcondicionado ? "SI" : "NO"));
    }
}
