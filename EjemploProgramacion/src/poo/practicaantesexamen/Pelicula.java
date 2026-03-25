package poo.practicaantesexamen;

public class Pelicula {
    private String titulo;
    private int duracionMin;
    private Director director;

    public Pelicula(String titulo, int duracionMin, Director director) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public Director getDirector() {
        return director;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracionMin=" + duracionMin +
                ", director=" + director +
                '}';
    }
}
