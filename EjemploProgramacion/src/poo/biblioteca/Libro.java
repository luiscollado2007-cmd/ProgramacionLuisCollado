package poo.biblioteca;

public class Libro {

    private String titulo;
    private String isbn;
    private int numPaginas;
    private String genero;
    private Autor escritor;

    public Libro(String titulo, String isbn, int numPaginas, String genero, Autor escritor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.escritor = escritor;
    }

    public Libro(String titulo, String isbn, int numPaginas, String genero) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.escritor = new Autor();
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString(){
        return "Título: " + titulo + "\n" +
                "ISBN: " + isbn + "\n" + "Nº de páginas: " + numPaginas + "\n" + "Género: " + genero
                + "\n" + "Autor: " + escritor;
    }
}
