package colecciones;

import colecciones.Spotify.Cancion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemplosMapasObjetos {
    public static void main(String[] args) {

        Map<Cancion,Integer> reproduccionesPorCancion = generarMapaReproducciones();

        //¿Cómo hacemos para actualizar el nº de reproducciones de la canción "In The End", para sumarle 5 reproducciones.
        Cancion cancionABuscar = new Cancion("In The End", 0);
        int reproducciones = reproduccionesPorCancion.get(cancionABuscar);


        System.out.println("El nº de reproducciones de la canción In The End es: " + reproducciones);

        //Cómo sería un mapa de canciones por año?
        Map<Integer, ArrayList<Cancion>> cancionesPorAnyo = generarMapaCancionesPorAnyo();

        // anyadirCancion a las canciones del 2001(cancionesPorAnyo,new Cancion("Heridas de Guerra",99));
       ArrayList<Cancion> canciones2001 = cancionesPorAnyo.get(2001);
       canciones2001.add(new Cancion("Heridas de Guerra",99));

        Set<Integer> claves = cancionesPorAnyo.keySet();
        for (Integer anyo : claves){
            System.out.println("Canciones del año: " + anyo);
            ArrayList<Cancion> cancionesAnyo = cancionesPorAnyo.get(anyo);
            for (Cancion c : cancionesAnyo){
                System.out.println("\t Nombre de la canción: " + c.getNombre());
            }
        }

    }
    private static Map<Integer,ArrayList<Cancion>> generarMapaCancionesPorAnyo(){
        Map<Integer,ArrayList<Cancion>> mapa = new HashMap<>();

        ArrayList<Cancion> canciones2000 = new ArrayList<>();
        canciones2000.add(new Cancion("El alma al aire",199));
        canciones2000.add(new Cancion("La Playa",120));
        canciones2000.add(new Cancion("Depende",185));
        mapa.put(2000,canciones2000);

        ArrayList<Cancion> canciones2001 = new ArrayList<>();
        canciones2001.add(new Cancion("Como la vida",240));
        canciones2001.add(new Cancion("Sin Miedo a Nada",195));

        mapa.put(2001,canciones2001);

        return mapa;
    }
    private static Map<Cancion,Integer> generarMapaReproducciones(){

        Map<Cancion,Integer> mapa = new HashMap<>();
        mapa.put(new Cancion("Seven Nation Army",231),65);
        mapa.put(new Cancion("In The End",216),15);
        mapa.put(new Cancion("Take Me Out",237),8);
        mapa.put(new Cancion("Like A Stone",294),55);

        return mapa;
    }
}
