package poo2.ejercicioProfe.ejercicio1;

public class Circulo extends Figura{
    protected int punto;
    protected int radio;

    public Circulo(String color, String tipoRellenado, boolean estaRellenado, String fechaCreacion, int radio) {
        super(color, tipoRellenado, estaRellenado, fechaCreacion);
        this.radio = radio;
    }


    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public int diametro() {
        return 2 * radio;
    }

    @Override
    public int perimetroRectangulo() {
        return 0;
    }
}
