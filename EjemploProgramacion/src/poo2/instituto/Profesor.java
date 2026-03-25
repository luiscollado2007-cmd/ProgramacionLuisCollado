package poo2.instituto;

public class Profesor extends Empleado{
    private String especialidad;


    public Profesor(String nombre, String apellidos, String dni, int codEmpleado, double sueldo, String especialidad) {
        super(nombre, apellidos, dni, codEmpleado, sueldo);
        this.especialidad = especialidad;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("*** INFO DEL PROFESOR ***");
        super.imprimirDatos();
        System.out.println("\tEspecialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return super.toString() + " - Profesor{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
