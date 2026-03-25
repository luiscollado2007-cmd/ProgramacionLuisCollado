package poo2.astros;

public class Satelite extends SistemaSolar{
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private String planetaQuePertenece;

    public Satelite(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaPlaneta, double orbitaPlanetaria, String planetaQuePertenece) {
        super(masa, diametroMedio, periodoRotacion, periodoTraslacion);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaQuePertenece = planetaQuePertenece;
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public String getPlanetaQuePertenece() {
        return planetaQuePertenece;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public void setPlanetaQuePertenece(String planetaQuePertenece) {
        this.planetaQuePertenece = planetaQuePertenece;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "distanciaPlaneta=" + distanciaPlaneta +
                ", orbitaPlanetaria=" + orbitaPlanetaria +
                ", planetaQuePertenece='" + planetaQuePertenece + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---SATÉLITE---");
        System.out.println("Distancia al planeta: " + distanciaPlaneta);
        System.out.println("Órbita planetaria: " + orbitaPlanetaria);
        System.out.println("Planeta al que pertenece: " + planetaQuePertenece);
    }
}
