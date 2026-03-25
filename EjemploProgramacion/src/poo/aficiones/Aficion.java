package poo.aficiones;

public class Aficion {
    private String nombre;
    private boolean esRiesgoso;
    private int nivelDificultad;

    public Aficion(String nombre) {
        this.nombre = nombre;
        this.esRiesgoso = false;
        this.nivelDificultad = 0;
    }

    public Aficion(String nombre, boolean esRiesgoso, int nivelDificultad) {
        this.nombre = nombre;
        this.esRiesgoso = esRiesgoso;
        this.nivelDificultad = nivelDificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsRiesgoso() {
        return esRiesgoso;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }
}
