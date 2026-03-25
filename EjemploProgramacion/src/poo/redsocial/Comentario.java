package poo.redsocial;


import java.time.LocalDateTime;

public class Comentario {
    private LocalDateTime fecha;
    private String texto;
    private Usuario autor;
    private boolean tieneImagenes;

    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public Comentario(Usuario autor, String texto, boolean tieneImagenes) {
        this.autor = autor;
        this.texto = texto;
        this.tieneImagenes = tieneImagenes;
        this.fecha = LocalDateTime.now();
    }

    public void mostrar(){
        System.out.println("Fecha: " + fecha);
        System.out.println("Autor: " + autor);
        System.out.println("Texto: " + texto);
        System.out.println("¿Tiene imágenes?: " + tieneImagenes);
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isTieneImagenes() {
        return tieneImagenes;
    }

    public void setTieneImagenes(boolean tieneImagenes) {
        this.tieneImagenes = tieneImagenes;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "autor=" + autor +
                ", texto='" + texto + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tieneImagenes=" + tieneImagenes +
                '}';
    }
}
