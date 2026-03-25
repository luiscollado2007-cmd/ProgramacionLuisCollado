package poo.redsocial;

public class Direccion {
    private String calle;
    private String provincia;
    private int codigoPostal;
    private String pais;

    public Direccion(String calle, String provincia, int codigoPostal, String pais) {
        this.calle = calle;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "direccion{" +
                "calle='" + calle + '\'' +
                ", provincia='" + provincia + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", pais='" + pais + '\'' +
                '}';
    }
}
