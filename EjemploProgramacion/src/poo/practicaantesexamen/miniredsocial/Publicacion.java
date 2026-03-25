package poo.practicaantesexamen.miniredsocial;

public class Publicacion {
    private String fecha;
    private String contenido;
    private Usuario autor;
    private Comentario[] comentarios;
    public static final int MAX_COMENTARIOS = 3;
    private int posProxComentario = 0;

    public Publicacion(String fecha, String contenido, Usuario autor) {
        this.fecha = fecha;
        this.contenido = contenido;
        this.autor = autor;
        this.comentarios = new Comentario[MAX_COMENTARIOS];
    }

    public void agregarComentario(Comentario nuevo){
        if (posProxComentario != MAX_COMENTARIOS){
            comentarios[posProxComentario] = nuevo;
            posProxComentario ++;
        }else{
            System.out.println("No se pueden añadir más comentarios");
        }
    }

    public void mostrarPublicacion(){
        System.out.println("*** MOSTRANDO EL CONTENIDO DE LA PUBLICACIÓN ***");
        System.out.println("\t Contenido: " + contenido);
        System.out.println("\t Autor: " + autor.getNick());
        System.out.println("\t Fecha: " + fecha);

        if (comentarios != null && posProxComentario != 0){
            for (int cont = 0; cont < posProxComentario; cont++) {
                Comentario c = comentarios[cont];
                c.mostrar();
            }
        }
    }

    public String getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public Usuario getAutor() {
        return autor;
    }

    public Comentario[] getComentarios() {
        return comentarios;
    }
}
