package poo2.astros;

public abstract class SistemaSolar {
    protected double masa;
    protected double diametroMedio;
    protected double periodoRotacion;
    protected double periodoTraslacion;

    public SistemaSolar(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion) {
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getMasa() {
        return masa;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "masa=" + masa +
                ", diametroMedio=" + diametroMedio +
                ", periodoRotacion=" + periodoRotacion +
                ", periodoTraslacion=" + periodoTraslacion +
                '}';
    }

    public abstract void mostrarInfo();
}
