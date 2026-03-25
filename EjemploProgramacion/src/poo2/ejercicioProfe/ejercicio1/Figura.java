package poo2.ejercicioProfe.ejercicio1;

public abstract class Figura {
    protected String color;
    protected String tipoRellenado;
    protected boolean estaRellenado;
    protected String fechaCreacion;

    public Figura(String color, String tipoRellenado, boolean estaRellenado, String fechaCreacion) {
        this.color = color;
        this.tipoRellenado = tipoRellenado;
        this.estaRellenado = estaRellenado;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract double perimetro();

    public abstract int diametro();

    public abstract int perimetroRectangulo();
}
