package poo.practicaantesexamen.miniredsocial;


import poo.redsocial.Comentario;

public class ProgramaRedSocial {
    private Publicacion[] publicaciones = new Publicacion[MAX_PUBLICACIONES];
    public static final int MAX_PUBLICACIONES = 4;
    private int posProxPublicacion = 0;

    public void agregarPublicacion(Publicacion nueva){
        if (posProxPublicacion != MAX_PUBLICACIONES){
            if (publicaciones != null){
                publicaciones[posProxPublicacion] = nueva;
                posProxPublicacion++;
            }
        }else{
            System.out.println("No se pueden añadir más publicaciones");
        }
    }

    public void mostrarMuro(){
        System.out.println("*** MOSTRANDO MURO ***");

        if(publicaciones != null && posProxPublicacion != 0){
            for (int cont = 0; cont < posProxPublicacion; cont++) {
                Publicacion pub = publicaciones[cont];
                pub.mostrarPublicacion();
            }
        }


    }
}
