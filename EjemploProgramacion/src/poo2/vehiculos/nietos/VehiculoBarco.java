package poo2.vehiculos.nietos;

import poo2.vehiculos.hijos.VehiculoAcuatico;

public class VehiculoBarco extends VehiculoAcuatico {
    private boolean tieneMotor;

    public VehiculoBarco(String matricula, String modelo, String eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    public void imprimir() {
        System.out.println("Barco cuyo vehículo pertenece a los vehículos acuáticos, tiene motor? " + (tieneMotor ? "SI" : "NO"));
    }
}
