package poo.practicaantesexamen;

public class ProgramaCine {
    public static void main(String[] args) {
        Director director1 = new Director("Laura", "España",1998);

        Director director2 = new Director("Miguel", "Argentina",2003);

        Pelicula pelicula1 = new Pelicula("El Viaje Infinito", 124,director1);

        Pelicula pelicula2 = new Pelicula("Sombras en la Ciudad",98,director1);

        Pelicula pelicula3 = new Pelicula("Horizonte de Fuego", 142, director2);

        Sala sala1 = new Sala("c1", 50);

        Sala sala2 = new Sala("c3", 100);

        Sesion sesion1 = new Sesion(pelicula1,sala1,"22:45", 20);
        System.out.println("Las entradas disponibles de la sesión 1 son: " + sesion1.getEntradasDisponibles());
        System.out.println();
        Sesion sesion2 = new Sesion(pelicula2, sala2, "21:00", 55);
        System.out.println("Las entradas disponibles de la sesión 2 son: " +sesion2.getEntradasDisponibles());
        System.out.println();
        Sesion sesion3 = new Sesion(pelicula3, sala2, "20:50", 75);
        System.out.println("Las entradas disponibles de la sesión 3 son: " + sesion3.getEntradasDisponibles());
        System.out.println();
        Sesion sesion4 = new Sesion(pelicula3, sala1, "23:15", 35);
        System.out.println("Las entradas disponibles son de la sesión 4: " + sesion4.getEntradasDisponibles());
        System.out.println();

        Cartelera primeraCartelera = new Cartelera("Cinesa");
        primeraCartelera.agregarSesion(sesion1);
        primeraCartelera.mostrarCartelera();
        primeraCartelera.mostrarSesionesPorDirector("Laura" );
        primeraCartelera.mostrarSesionesPorTitulo("El Viaje Infinito");
        System.out.println();
        Cartelera segundaCartelera = new Cartelera("Max");
        segundaCartelera.agregarSesion(sesion2);
        segundaCartelera.mostrarCartelera();
        segundaCartelera.mostrarSesionesPorDirector("Pepe");
        segundaCartelera.mostrarSesionesPorTitulo("Wasakaka");
        System.out.println();
        Cartelera terceraCartelera = new Cartelera("Peron");
        terceraCartelera.agregarSesion(sesion3);
        terceraCartelera.mostrarCartelera();
        terceraCartelera.mostrarSesionesPorDirector("Miguel");
        terceraCartelera.mostrarSesionesPorTitulo("El ñopo");
        System.out.println();
        Cartelera cuartaCartelera = new Cartelera("Peru");
        cuartaCartelera.agregarSesion(sesion4);
        cuartaCartelera.mostrarCartelera();
        cuartaCartelera.mostrarSesionesPorDirector("Miguel");
        cuartaCartelera.mostrarSesionesPorTitulo("Horizonte de Fuego");
    }

}
