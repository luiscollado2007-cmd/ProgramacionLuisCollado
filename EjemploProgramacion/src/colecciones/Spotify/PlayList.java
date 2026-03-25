package colecciones.Spotify;

import java.util.ArrayList;

public class PlayList {
    private String nombre;
    private ArrayList<Cancion> listaCanciones;

    public PlayList(String nombre) {
        this.nombre = nombre;
        listaCanciones = new ArrayList<>(4);
    }

    public void mostrarPlaylist(){
        for (Cancion c : listaCanciones){
            System.out.println("El nombre de la canción es: " + c.getNombre());
        }
    }

    public double obtenerDuracionTotalMinutos(){
        double total = 0;
        for (Cancion c : listaCanciones){
            total += c.getNumSegundos();
        }
        return total / 60;
    }

    public Cancion obtenerNombrePorCancion(String nombre){
        for (Cancion c : listaCanciones){
            if (c.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                System.out.println("Canción encontrada: " + c.getNombre());
                return c;
            }
        }

        System.out.println("No se encuentra esa canción en la playlist");
        return null;
    }

    public boolean agregarCancion(Cancion nueva){
        if (listaCanciones != null){
            listaCanciones.add(nueva);

        }else{
            return false;
        }

        return true;
    }
}
