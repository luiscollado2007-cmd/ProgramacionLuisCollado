package poo.redsocial;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = crearUsuario1();
        Usuario usuario2 = crearUsuario2();

        Publicacion pub1 = new Publicacion(usuario1, "Harto ya del Márquez bla bla bla");
        Publicacion pub2 = new Publicacion(usuario2, "Esperando ya al finde");

       Comentario com1SobrePub1 = new Comentario(usuario2, "Ya ves tronco.... pesaos");
       Comentario com1SobrePub2 = new Comentario(usuario1, "¿Que vas a hacer este finde?");

       pub1.agregarComentario(com1SobrePub1);
       pub2.agregarComentario(com1SobrePub2);

       ProgramaRedSocial redSocial = new ProgramaRedSocial();
       redSocial.agregarPublicacion(pub1);
       redSocial.agregarPublicacion(pub2);

       redSocial.mostrarMuro();
    }

    public static Usuario crearUsuario1(){
        Direccion dir = new Direccion("C/Beatriz Galindo 6", "Madrid",28916,"España");
        Usuario usuario1 =new Usuario("niñochulo21", "ninochulo@gmail.com",dir);

        return usuario1;
    }

    public static Usuario crearUsuario2(){
        Usuario usuario2 = new Usuario("laloli", "laloli@gmail.com");
        return  usuario2;
    }
}
