
package colecciones;

import java.util.Objects;

public class Estudiante implements Comparable{

    private int numEstudiante;
    private String nombre;
    private double notaMedia;
    private String dni;

    public Estudiante(int numEstudiante, String nombre) {
        this.numEstudiante = numEstudiante;
        this.nombre = nombre;
    }

    public Estudiante(int numEstudiante, String nombre, double notaMedia) {
        this.numEstudiante = numEstudiante;
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public Estudiante(int numEstudiante, String nombre, double notaMedia, String dni) {
        this.numEstudiante = numEstudiante;
        this.nombre = nombre;
        this.notaMedia = notaMedia;
        this.dni = dni;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numEstudiante=" + numEstudiante +
                ", nombre='" + nombre + '\'' +
                ", notaMedia=" + notaMedia +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return numEstudiante == that.numEstudiante;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numEstudiante);
    }

    @Override
    public int compareTo(Object o) {
        Estudiante otro = (Estudiante) o;
        //Le digo que por defecto la comparaci´pn
        //de estudiantes es por nombre
        return nombre.compareTo(otro.getNombre());
    }
}
