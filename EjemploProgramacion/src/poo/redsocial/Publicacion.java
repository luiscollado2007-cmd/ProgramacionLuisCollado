package poo.redsocial;


import java.time.LocalDateTime;

public class Publicacion {
    private LocalDateTime fecha;
    private String contenido;
    private Usuario autor;
    private Comentario[] comentarios;
    public static int MAX_COMENTARIOS = 5;
    private int posicionproxComentario = 0;

    public Publicacion(Usuario autor,String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        comentarios = new Comentario[MAX_COMENTARIOS];
        this.fecha = LocalDateTime.now();
    }

    public void agregarComentario(Comentario nuevo){
        if (posicionproxComentario != MAX_COMENTARIOS){
            comentarios[posicionproxComentario] = nuevo;
            posicionproxComentario++;
        }else{
            System.out.println("No se pueden añadir más comentarios");
        }
    }
    public void mostrarPublicacion(){
        System.out.println("Contenido: " + contenido);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
        if (comentarios != null && posicionproxComentario != 0){
            for (int cont = 0; cont < posicionproxComentario; cont++) {
                Comentario unComentario = comentarios[cont];
                System.out.println(unComentario);
            }
        }

    }

    public LocalDateTime getFecha() {
        return fecha;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getAutor() {
        return autor;
    }

    public Comentario[] getComentarios() {
        return comentarios;
    }
}
