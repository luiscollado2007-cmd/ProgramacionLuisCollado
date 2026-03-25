package poo2.ejemplo;

public class Empleado {
    private int id;
    private String nombre;

    public Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void imprimir() {
        System.out.println(id + " - " + nombre);
    }
}