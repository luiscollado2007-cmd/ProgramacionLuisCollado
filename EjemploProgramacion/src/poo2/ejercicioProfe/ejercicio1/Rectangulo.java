package poo2.ejercicioProfe.ejercicio1;

public class Rectangulo extends Figura {
    protected int coordX;
    protected int coordY;

    public Rectangulo(String color, String tipoRellenado, boolean estaRellenado, String fechaCreacion, int coordX, int coordY) {
        super(color, tipoRellenado, estaRellenado, fechaCreacion);
        this.coordX = coordX;
        this.coordY = coordY;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public int diametro() {
        return 0;
    }

    @Override
    public int perimetroRectangulo() {
        return 2 * (coordX * coordY);
    }
}
