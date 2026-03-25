package poo.practicaantesexamen;

public class Alumno2 {
    private String nombre;
    private int edad;
    private String curso;
    private double notaMedia;

    public Alumno2(String nombre, int edad, String curso, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void mostrarInfo(){
        System.out.println("*** INFORMACIÓN DE LA PERSONA ***");
        System.out.println("\t Nombre: " + nombre);
        System.out.println("\t Edad: " + edad);
        System.out.println("\t Curso: " + curso);
        System.out.println("\t Nota media: " + notaMedia);
    }

    public boolean estaAprobado(){
        return notaMedia >= 5;
    }
}
