package poo2.seniorDeLosAnillos;

public class Magos extends senio{
    private int tunica;
    private int sombrero;
    private int anchuraSombrero;
    private int numPuntasSombrero;
    private String colorTunica;
    private String materialTunica;

    public Magos(String nombre, int cantidad, int coordX, int coordY, int tunica, int sombrero, int anchuraSombrero,
                 int numPuntasSombrero, String colorTunica, String materialTunica) {
        super(nombre, cantidad, coordX, coordY);
        this.tunica = tunica;
        this.sombrero = sombrero;
        this.anchuraSombrero = anchuraSombrero;
        this.numPuntasSombrero = numPuntasSombrero;
        this.colorTunica = colorTunica;
        this.materialTunica = materialTunica;
    }

    public int getTunica() {
        return tunica;
    }

    public int getSombrero() {
        return sombrero;
    }

    public int getAnchuraSombrero() {
        return anchuraSombrero;
    }

    public int getNumPuntasSombrero() {
        return numPuntasSombrero;
    }

    public String getColorTunica() {
        return colorTunica;
    }

    public String getMaterialTunica() {
        return materialTunica;
    }

    public void setMovimientoMago(int coordX, int coordY){
        setCoordX(getCoordX() * 2);
        setCoordY(getCoordY() * 2);
    }

    public void sanar(){
        System.out.println("Curandooo");
    }
}
