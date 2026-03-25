package colecciones;

import colecciones.Spotify.Cancion;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

    /*
    HACER:
    CancionReal, que hereda de Cancion, y le incluye un Autor.
    Autor tiene nombre, nacionalidad.

    Crear un conjunto de objetos de CancionReal, que no permita tener duplicados de CancionReal, considerando que
    2 canciones reales son iguales si su nombre y su autor son iguales. 2 autores son iguales si sus nombres son iguales.
     */
    public static void main(String[] args) {
        Set<String> conjuntoNombres = new HashSet<>();
        conjuntoNombres.add("Manuel");
        conjuntoNombres.add("Natalia");
        conjuntoNombres.add("Javier");
        conjuntoNombres.add("Lolo");
        conjuntoNombres.add("Javier");
        conjuntoNombres.add("Lali");

        System.out.println("Tamaño del conjunto de nombres: " + conjuntoNombres.size());

        for (String nombre : conjuntoNombres){
            System.out.println("Nombre: " + nombre);
        }

        Set<Cancion> top5Canciones = new HashSet<>();
        top5Canciones.add(new Cancion("Stairway to Heaven",320));
        top5Canciones.add(new Cancion("Stairway to Heaven",320));
        top5Canciones.add(new Cancion("Highway to Hell",220));
        top5Canciones.add(new Cancion("Knocking on Heaven's Doors",80));
        top5Canciones.add(new Cancion("Bohemian Rapsody",290));

        System.out.println("Tamaño del conjunto de canciones: " + top5Canciones.size());
    }
}
