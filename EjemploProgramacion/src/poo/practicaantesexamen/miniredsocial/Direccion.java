package poo.practicaantesexamen.miniredsocial;

public class Direccion {
    private String calle;
    private String provincia;
    private int cp;
    private String pais;

    public Direccion(String calle, String provincia, int cp, String pais) {
        this.calle = calle;
        this.provincia = provincia;
        this.cp = cp;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getCp() {
        return cp;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", provincia='" + provincia + '\'' +
                ", cp=" + cp +
                ", pais='" + pais + '\'' +
                '}';
    }
}
