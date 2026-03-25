package poo.redsocial;

public class ProgramaRedSocial {
    private Publicacion[] publicaciones;
    public static int MAX_PUBLICACIONES = 5;
    private int posProximoComentario = 0;
    private int numComentarios;

    public ProgramaRedSocial() {
        this.publicaciones = new Publicacion[MAX_PUBLICACIONES];
    }

    public void agregarPublicacion(Publicacion nueva){
        if (posProximoComentario == MAX_PUBLICACIONES){
            System.out.println("Lo siento, no puedes añadir más publicaciones");
        }else{
            publicaciones[posProximoComentario] = nueva;
            posProximoComentario++;
            System.out.println(" - Publicación agregada correctamente. Nº total de publicaciones: " + posProximoComentario);
        }
    }

    public void mostrarMuro(){
        if (publicaciones != null && posProximoComentario != 0){
            System.out.println("****** CONTENIDO DEL MURO ********");
            for (int cont = 0; cont < posProximoComentario; cont++) {
                Publicacion unaPublicacion = publicaciones[cont];
                imprimirPublicacion(unaPublicacion);
                unaPublicacion.mostrarPublicacion();
            }

        }else{
            System.out.println("*** NO HAY PUBLICACIONES EN EL MURO ***");
        }
    }
    
    public void mostrarPublicacionConMasComentarios(){
        if (posProximoComentario == 0){
            System.out.println("No hay publicaciones subidas.");
        }
        int maxComentarios = -1;
        for (int cont = 0; cont < posProximoComentario; cont++) {
            Publicacion pub = publicaciones[cont];
            if (pub != null){
                Comentario[] comentarios = pub.getComentarios();
                int cuentacuenta = 0;
                if (comentarios != null){
                    for (int cont2 = 0; cont2 < comentarios.length; cont2++) {
                        if (comentarios[cont] != null){
                            cuentacuenta++;
                        }
                    }
                }

                if (cuentacuenta > maxComentarios){
                    maxComentarios = cuentacuenta;
                }
            }
        }
        //TODO:
    }

    public int cantidadComentarioSegunProvincia(String provincia) {
        return 0;
    }

    private void imprimirPublicacion(Publicacion pub){


        System.out.println("------------------------------");
        //Imprimir informacion del autor de la publicacion
        imprimirInformacionAutor(pub.getAutor(),0);

        //Imprimir contenido de la publicacion
        System.out.println("-" + pub.getContenido() + "(escrito el " + pub.getFecha() + ")");


        Comentario[] comentarios = pub.getComentarios();
        if (comentarios != null){
            //Imprimir comentarios de la publicacion
            System.out.println("\t Comentarios:");
            for (int cont = 0; cont < comentarios.length; cont++) {
                Comentario com = comentarios[cont];
                if (com != null){
                    //imprimir el autor del comentario
                    imprimirInformacionAutor(com.getAutor(),2);
                    System.out.println("\t\t" + com.getTexto() + " (escrito el " + com.getFecha() + ")");
                }

            }
        }

        System.out.println("------------------------------");
    }

    /**
     * Imprime la información de un autor (de publicacion
     * @param autor
     * @param numeroTabuladores
     */

    private static void imprimirInformacionAutor(Usuario autor,int numeroTabuladores) {
        Direccion dirAutor = autor.getDireccion();
        String provinciaAutor = "Sin provincia";
        if (dirAutor != null){
            provinciaAutor = dirAutor.getProvincia();
        }
        for (int cont = 0; cont < numeroTabuladores; cont++) {
            System.out.print("\t");
        }
        //Imprimo el autor de la publicacion
        System.out.println(String.format("[%s (%s) ]", autor.getNick(),provinciaAutor));
    }

    public Publicacion[] getPublicaciones() {
        return publicaciones;
    }
}
