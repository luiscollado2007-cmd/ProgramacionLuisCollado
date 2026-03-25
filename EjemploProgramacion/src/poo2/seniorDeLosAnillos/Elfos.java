package poo2.seniorDeLosAnillos;

public class Elfos extends senio{

    private final String arco = "Carcaj";
    public static final int NUM_MAX_FLECHAS = 20;
    private String colorPluma;
    private double velocidad;
    private boolean esVenenosa;
    private int nivelPrecision;
    private int nivelTension;

    public Elfos(String nombre, int cantidad, int coordX, int coordY) {
        super(nombre, cantidad, coordX, coordY);
    }

    public String getArco() {
        return arco;
    }

    public String getColorPluma() {
        return colorPluma;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean isEsVenenosa() {
        return esVenenosa;
    }

    public int getNivelPrecision() {
        return nivelPrecision;
    }

    public int getNivelTension() {
        return nivelTension;
    }

    public void setMovimientoElfo(){
        setCoordX(getCoordX() + 3);
        setCoordY(getCoordY() + 3);
    }

    public void sanar(){
        System.out.println("Sanaaaandoo....");
    }
}
