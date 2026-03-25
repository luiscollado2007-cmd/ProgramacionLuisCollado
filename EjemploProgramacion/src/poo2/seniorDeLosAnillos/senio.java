package poo2.seniorDeLosAnillos;

public class senio {
    private String nombre;
    private int cantidadVida = 10;
    private int coordX;
    private int coordY;

    public senio(String nombre, int cantidad, int coordX, int coordY) {
        this.nombre = nombre;
        this.cantidadVida = cantidad;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
}
