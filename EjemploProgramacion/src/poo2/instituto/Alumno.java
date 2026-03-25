package poo2.instituto;

public class Alumno extends Persona{
    private int numExpediente;
    private String curso;


    public Alumno(String nombre, String apellidos, String dni, int numExpediente, String curso) {
        super(nombre, apellidos, dni);
        this.numExpediente = numExpediente;
        this.curso = curso;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("*** INFO DEL ALUMNO ***");
        super.imprimirDatos();
        System.out.println("\tNumExpediente: " + numExpediente);
        System.out.println("\tCurso: " + curso);
    }

    @Override
    public String toString() {
        return super.toString() + " - Alumno{" +
                "numExpediente=" + numExpediente +
                ", curso='" + curso + '\'' +
                '}';
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
