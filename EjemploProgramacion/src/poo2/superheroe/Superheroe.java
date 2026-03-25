package poo2.superheroe;

public class Superheroe {
    private String nombre;
    private int energia;
    private int nivel;

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.energia = 100;
        this.nivel = 1;
    }

    public void usarPoder(){
         energia -= 10;
        System.out.println("Estás usando tu poder de forma genérica");
    }

    public void mostrarEstado(){
        System.out.println("*** ESTADO DEL SUPERHÉROE ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Nivel: " + nivel);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
