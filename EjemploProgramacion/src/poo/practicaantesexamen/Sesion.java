package poo.practicaantesexamen;

public class Sesion {
    private Pelicula pelicula;
    private Sala sala;
    private String fechaHora;
    private int entradasVendidas;
    public static int MAX_ENTRADAS = 100;

    public Sesion(Pelicula pelicula, Sala sala, String fechaHora, int entradasVendidas) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.fechaHora = fechaHora;
        this.entradasVendidas = entradasVendidas;
    }

    public int getEntradasDisponibles(){
        return MAX_ENTRADAS - entradasVendidas;
    }

    public void mostrarSesion(){
        System.out.println("*** INFORMACIÓN DE LA PELÍCULA ***");
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Director: " + pelicula.getDirector().getNombre());
        System.out.println("Sala: " + sala.getCodigo());
        System.out.println("Hora: " + fechaHora);
        System.out.println("Entradas disponibles: " + getEntradasDisponibles());
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }
}
