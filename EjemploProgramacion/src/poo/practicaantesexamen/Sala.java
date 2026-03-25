package poo.practicaantesexamen;

public class Sala {
    private String codigo;
    private int capacidad;

    public Sala(String codigo, int capacidad) {
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
