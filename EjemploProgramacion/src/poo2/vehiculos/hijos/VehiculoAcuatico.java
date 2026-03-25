package poo2.vehiculos.hijos;

import poo2.vehiculos.padre.Vehiculo;

public class VehiculoAcuatico extends Vehiculo {
    protected String eslora;

    public VehiculoAcuatico(String matricula, String modelo, String eslora) {
        super(matricula, "FTGRY");
        this.eslora = eslora;
    }

    public String getEslora() {
        return eslora;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo acuático, con matrícula " + matricula + " ,con modelo " + modelo + " y con su eslora: " + eslora);
    }
}
