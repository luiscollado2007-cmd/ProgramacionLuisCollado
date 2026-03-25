package colecciones.Spotify;

public class Spotify {
    public static void main(String[] args) {
        PlayList playList = new PlayList("Waaaa");
        Cancion c1 = new Cancion("Brujeria",300);
        Cancion c2 = new Cancion("Mejor que a ti me va",360);
        playList.agregarCancion(c1);
        playList.agregarCancion(c2);
        playList.mostrarPlaylist();
        System.out.println("El total de minutos es: " + playList.obtenerDuracionTotalMinutos());
        playList.obtenerNombrePorCancion("waa");
    }
}
