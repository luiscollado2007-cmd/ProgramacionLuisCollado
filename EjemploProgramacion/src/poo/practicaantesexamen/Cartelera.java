package poo.practicaantesexamen;

public class Cartelera {
    private Sesion[] sesiones;
    private String nombreCine;
    private int posProxSesion = 0;
    public static final int MAX_SESIONES = 10;

    public Cartelera(String nombreCine) {
        this.nombreCine = nombreCine;
        this.sesiones = new Sesion[MAX_SESIONES];
    }

    public void agregarSesion(Sesion nueva){
        if (posProxSesion != MAX_SESIONES){
            sesiones[posProxSesion] = nueva;
            posProxSesion++;
        }
    }

    public void mostrarCartelera(){
        System.out.println("*** MOSTRANDO CARTELERAS ***");

        if (sesiones != null && posProxSesion != 0){
            for (int cont = 0; cont < posProxSesion; cont++) {
                Sesion se = sesiones[cont];
                se.mostrarSesion();
            }
        }else {
            System.out.println("Lo siento pero no hay carteleras disponibles");
        }
    }

    public void mostrarSesionesPorDirector(String nombreDirector){
        if (sesiones != null && posProxSesion != 0){
            for (int cont = 0; cont < posProxSesion; cont++) {
                Sesion se = sesiones[cont];
                String nuevoDirector = se.getPelicula().getDirector().getNombre();
                if (nuevoDirector.equalsIgnoreCase(nombreDirector)){
                    System.out.println("Coincidencia : " + nuevoDirector);
                }else{
                    System.out.println("Lo siento, ese no es el director de la sesión");
                }

            }
        }
    }

    public void mostrarSesionesPorTitulo(String titulo){
        if (sesiones != null && posProxSesion != 0){
            for (int cont = 0; cont < posProxSesion; cont++) {
                Sesion se = sesiones[cont];
                String nuevoDirectom = se.getPelicula().getTitulo();
                if (titulo.equalsIgnoreCase(nuevoDirectom)){
                    System.out.println("Coincidencia: " + nuevoDirectom);
                }else{
                    System.out.println("Lo siento, ese no es el título de la sesión");
                }
            }
        }
    }
}
