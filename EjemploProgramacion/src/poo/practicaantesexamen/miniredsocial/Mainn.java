package poo.practicaantesexamen.miniredsocial;


public class Mainn {
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Calle Alcalá", "Sevilla", 28013, "España");
        Usuario us1 = new Usuario("popote","Elmanil@gmail.com",dir1);

        Direccion dir2 = new Direccion("Avenida Diagonal", "Zaragoza", 41001, "Argentina");
        Usuario us2 = new Usuario("seno","treto5@gmail.com",dir2);

        Publicacion pub = new Publicacion("20-1-2024","klk mi helmano", us1);
        Comentario com = new Comentario("20-3-2024","q chaval", us2, false);
        pub.agregarComentario(com);



        Publicacion pub2 = new Publicacion("22-4-2023", "Digamelo menol", us2);
        Comentario com2 = new Comentario("22-12-2024", "Klk manito", us1, true);
        pub2.agregarComentario(com2);
        ProgramaRedSocial redSocial = new ProgramaRedSocial();
        redSocial.agregarPublicacion(pub);
        redSocial.agregarPublicacion(pub2);
        redSocial.mostrarMuro();



    }

}
