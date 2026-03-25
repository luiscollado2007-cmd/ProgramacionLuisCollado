package colecciones.Spotify;

public class Cancion {
    private String nombre;
    private int numSegundos;
    private String genero;
    private int anioCreacion;
    private boolean tieneLetra;

    public Cancion(String nombre, int numSegundos) {
        this.nombre = nombre;
        this.numSegundos = numSegundos;
    }

    public Cancion(String nombre, int numSegundos, String genero, int anioCreacion, boolean tieneLetra) {
        this.nombre = nombre;
        this.numSegundos = numSegundos;
        this.genero = genero;
        this.anioCreacion = anioCreacion;
        this.tieneLetra = tieneLetra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSegundos() {
        return numSegundos;
    }

    public void setNumSegundos(int numSegundos) {
        this.numSegundos = numSegundos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public boolean isTieneLetra() {
        return tieneLetra;
    }

    public void setTieneLetra(boolean tieneLetra) {
        this.tieneLetra = tieneLetra;
    }
}
