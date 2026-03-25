package poo2.vehiculos.nietos;

import poo2.vehiculos.hijos.VehiculoAcuatico;

public class VehiculoSubmarino extends VehiculoAcuatico {
    private double profundidadMax;

    public VehiculoSubmarino(String matricula, String modelo, String eslora, double profundidadMax) {
        super(matricula, modelo, eslora);
        this.profundidadMax = profundidadMax;
    }

    public double getProfundidadMax() {
        return profundidadMax;
    }

    public void setProfundidadMax(double profundidadMax) {
        this.profundidadMax = profundidadMax;
    }

    @Override
    public void imprimir() {
        System.out.println("Submarino cuyo vehículo pertenece a los vehículos acuáticos, tiene " + profundidadMax + " de profundidad máxima");
    }
}
