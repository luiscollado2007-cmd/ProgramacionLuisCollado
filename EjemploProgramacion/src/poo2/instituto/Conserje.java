package poo2.instituto;

public class Conserje extends Empleado{
    private String funcion;


    public Conserje(String nombre, String apellidos, String dni, int codEmpleado, double sueldo, String funcion) {
        super(nombre, apellidos, dni, codEmpleado, sueldo);
        this.funcion = funcion;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("*** INFO DEL CONSERJE ***");
        super.imprimirDatos();
        System.out.println("\tFunción: " + funcion);
    }

    @Override
    public String toString() {
        return super.toString() + " - Conserje{" +
                "funcion='" + funcion + '\'' +
                '}';
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}
