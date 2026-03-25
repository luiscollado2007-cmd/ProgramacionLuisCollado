package poo2.vehiculos.nietos;

import poo2.vehiculos.hijos.VehiculoTerrestre;

public class VehiculoMoto extends VehiculoTerrestre {
    private String color;

    public VehiculoMoto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto cuyo vehículo pertenece a los vehículos terrestres, tiene el color " + color);
    }
}
