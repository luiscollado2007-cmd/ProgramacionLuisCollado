package poo.practicaantesexamen.miniredsocial;

public class Comentario {
    private String fecha;
    private String texto;
    private Usuario autor;
    private boolean tieneImagenes;

    public Comentario(String fecha, String texto, Usuario autor, boolean tieneImagenes) {
        this.fecha = fecha;
        this.texto = texto;
        this.autor = autor;
        this.tieneImagenes = tieneImagenes;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getAutor() {
        return autor;
    }

    public boolean isTieneImagenes() {
        return tieneImagenes;
    }

    public void mostrar(){
        System.out.println("*** MOSTRANDO INFORMACIÓN DEL COMENTARIO ***");
        System.out.println("\t Fecha: " + fecha);
        System.out.println("\t Texto: " + texto);
        System.out.println("\t Autor: " + autor.getNick());
        System.out.println("\t Tiene imágenes: " + tieneImagenes);

    }
}
