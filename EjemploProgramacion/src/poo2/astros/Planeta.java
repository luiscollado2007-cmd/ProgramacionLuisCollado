package poo2.astros;

import java.util.Arrays;

public class Planeta extends SistemaSolar{
    public static final int MAX_SATELITES = 5;
    private double distanciaSol;
    private boolean tieneSatelites;
    private Satelite[] satelites;
    private int posProxStelite = 0;


    public Planeta(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaSol, boolean tieneSatelites) {
        super(masa, diametroMedio, periodoRotacion, periodoTraslacion);
        this.distanciaSol = distanciaSol;
        this.tieneSatelites = tieneSatelites;
        this.satelites = new Satelite[MAX_SATELITES];
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public Satelite[] getSatelites() {
        return satelites;
    }

    public void setSatelites(Satelite[] satelites) {
        this.satelites = satelites;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "distanciaSol=" + distanciaSol +
                ", tieneSatelites=" + tieneSatelites +
                ", satelites=" + Arrays.toString(satelites) +
                '}';
    }

    public void anyadirSatelite(Satelite sat){
        if (satelites != null){
            if (posProxStelite != MAX_SATELITES){
                for (int cont = 0; cont < posProxStelite; cont++) {
                    satelites[posProxStelite] = sat;
                    posProxStelite++;
                }
            }
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---PLANENTA---");
        System.out.println("Distancia al sol: " + distanciaSol);
        System.out.println("¿Tiene satélites? " + (tieneSatelites ? "SI" : "NO"));
        for (int cont = 0; cont < posProxStelite ; cont++) {
            Satelite s = satelites[cont];
            s.mostrarInfo();
        }
    }
}

